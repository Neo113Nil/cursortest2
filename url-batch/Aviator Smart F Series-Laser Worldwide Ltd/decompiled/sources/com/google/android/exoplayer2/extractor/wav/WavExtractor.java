package com.google.android.exoplayer2.extractor.wav;

import android.net.Uri;
import android.util.Pair;
import com.baidu.ar.face.algo.FAUEnum;
import com.baidu.ar.face.algo.FaceFrame;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.e;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.DfuException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@Deprecated
/* loaded from: classes3.dex */
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.wav.a
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = WavExtractor.lambda$static$0();
            return lambda$static$0;
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return e.a(this, uri, map);
        }
    };
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private ExtractorOutput extractorOutput;
    private OutputWriter outputWriter;
    private TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    private static final class ImaAdPcmOutputWriter implements OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, GattError.GATT_CONGESTED, 157, 173, FaceFrame.FACE_LANDMARKS_COUNT, FAUEnum.PR_TIMEOUT, 230, GattError.GATT_CCC_CFG_ERR, DfuException.ERROR_SEND_COMMAND_FAIL, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final ParsableByteArray decodedData;
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int max = Math.max(1, wavFormat.frameRateHz / 10);
            this.targetSampleSizeFrames = max;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = readLittleEndianUnsignedShort;
            int i8 = wavFormat.numChannels;
            int i9 = (((wavFormat.blockSize - (i8 * 4)) * 8) / (wavFormat.bitsPerSample * i8)) + 1;
            if (readLittleEndianUnsignedShort == i9) {
                int ceilDivide = Util.ceilDivide(max, readLittleEndianUnsignedShort);
                this.inputData = new byte[wavFormat.blockSize * ceilDivide];
                this.decodedData = new ParsableByteArray(ceilDivide * numOutputFramesToBytes(readLittleEndianUnsignedShort, i8));
                int i10 = ((wavFormat.frameRateHz * wavFormat.blockSize) * 8) / readLittleEndianUnsignedShort;
                this.format = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setAverageBitrate(i10).setPeakBitrate(i10).setMaxInputSize(numOutputFramesToBytes(max, i8)).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(2).build();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected frames per block: " + i9 + "; got: " + readLittleEndianUnsignedShort, null);
        }

        private void decode(byte[] bArr, int i8, ParsableByteArray parsableByteArray) {
            for (int i9 = 0; i9 < i8; i9++) {
                for (int i10 = 0; i10 < this.wavFormat.numChannels; i10++) {
                    decodeBlockForChannel(bArr, i9, i10, parsableByteArray.getData());
                }
            }
            int numOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i8);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(numOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i8, int i9, byte[] bArr2) {
            WavFormat wavFormat = this.wavFormat;
            int i10 = wavFormat.blockSize;
            int i11 = wavFormat.numChannels;
            int i12 = (i8 * i10) + (i9 * 4);
            int i13 = (i11 * 4) + i12;
            int i14 = (i10 / i11) - 4;
            int i15 = (short) (((bArr[i12 + 1] & 255) << 8) | (bArr[i12] & 255));
            int min = Math.min(bArr[i12 + 2] & 255, 88);
            int i16 = STEP_TABLE[min];
            int i17 = ((i8 * this.framesPerBlock * i11) + i9) * 2;
            bArr2[i17] = (byte) (i15 & 255);
            bArr2[i17 + 1] = (byte) (i15 >> 8);
            for (int i18 = 0; i18 < i14 * 2; i18++) {
                byte b8 = bArr[((i18 / 8) * i11 * 4) + i13 + ((i18 / 2) % 4)];
                int i19 = i18 % 2 == 0 ? b8 & 15 : (b8 & 255) >> 4;
                int i20 = ((((i19 & 7) * 2) + 1) * i16) >> 3;
                if ((i19 & 8) != 0) {
                    i20 = -i20;
                }
                i15 = Util.constrainValue(i15 + i20, -32768, 32767);
                i17 += i11 * 2;
                bArr2[i17] = (byte) (i15 & 255);
                bArr2[i17 + 1] = (byte) (i15 >> 8);
                int i21 = min + INDEX_TABLE[i19];
                int[] iArr = STEP_TABLE;
                min = Util.constrainValue(i21, 0, iArr.length - 1);
                i16 = iArr[min];
            }
        }

        private int numOutputBytesToFrames(int i8) {
            return i8 / (this.wavFormat.numChannels * 2);
        }

        private static int numOutputFramesToBytes(int i8, int i9) {
            return i8 * 2 * i9;
        }

        private void writeSampleMetadata(int i8) {
            long scaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
            int numOutputFramesToBytes = numOutputFramesToBytes(i8);
            this.trackOutput.sampleMetadata(scaleLargeTimestamp, 1, numOutputFramesToBytes, this.pendingOutputBytes - numOutputFramesToBytes, null);
            this.outputFrameCount += i8;
            this.pendingOutputBytes -= numOutputFramesToBytes;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void init(int i8, long j8) {
            this.extractorOutput.seekMap(new WavSeekMap(this.wavFormat, this.framesPerBlock, i8, j8));
            this.trackOutput.format(this.format);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j8) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j8;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0036 -> B:3:0x001c). Please report as a decompilation issue!!! */
        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean sampleData(ExtractorInput extractorInput, long j8) {
            boolean z7;
            int i8;
            int numOutputBytesToFrames;
            int ceilDivide = Util.ceilDivide(this.targetSampleSizeFrames - numOutputBytesToFrames(this.pendingOutputBytes), this.framesPerBlock) * this.wavFormat.blockSize;
            if (j8 != 0) {
                z7 = false;
                while (!z7) {
                    if (this.pendingInputBytes >= ceilDivide) {
                        break;
                    }
                    int read = extractorInput.read(this.inputData, this.pendingInputBytes, (int) Math.min(ceilDivide - r2, j8));
                    if (read != -1) {
                        this.pendingInputBytes += read;
                    }
                }
                i8 = this.pendingInputBytes / this.wavFormat.blockSize;
                if (i8 > 0) {
                    decode(this.inputData, i8, this.decodedData);
                    this.pendingInputBytes -= i8 * this.wavFormat.blockSize;
                    int limit = this.decodedData.limit();
                    this.trackOutput.sampleData(this.decodedData, limit);
                    int i9 = this.pendingOutputBytes + limit;
                    this.pendingOutputBytes = i9;
                    int numOutputBytesToFrames2 = numOutputBytesToFrames(i9);
                    int i10 = this.targetSampleSizeFrames;
                    if (numOutputBytesToFrames2 >= i10) {
                        writeSampleMetadata(i10);
                    }
                }
                if (z7 && (numOutputBytesToFrames = numOutputBytesToFrames(this.pendingOutputBytes)) > 0) {
                    writeSampleMetadata(numOutputBytesToFrames);
                }
                return z7;
            }
            z7 = true;
            while (!z7) {
            }
            i8 = this.pendingInputBytes / this.wavFormat.blockSize;
            if (i8 > 0) {
            }
            if (z7) {
                writeSampleMetadata(numOutputBytesToFrames);
            }
            return z7;
        }

        private int numOutputFramesToBytes(int i8) {
            return numOutputFramesToBytes(i8, this.wavFormat.numChannels);
        }
    }

    private interface OutputWriter {
        void init(int i8, long j8);

        void reset(long j8);

        boolean sampleData(ExtractorInput extractorInput, long j8);
    }

    private static final class PassthroughOutputWriter implements OutputWriter {
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i8) {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i9 = (wavFormat.numChannels * wavFormat.bitsPerSample) / 8;
            if (wavFormat.blockSize == i9) {
                int i10 = wavFormat.frameRateHz;
                int i11 = i10 * i9 * 8;
                int max = Math.max(i9, (i10 * i9) / 10);
                this.targetSampleSizeBytes = max;
                this.format = new Format.Builder().setSampleMimeType(str).setAverageBitrate(i11).setPeakBitrate(i11).setMaxInputSize(max).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(i8).build();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected block size: " + i9 + "; got: " + wavFormat.blockSize, null);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void init(int i8, long j8) {
            this.extractorOutput.seekMap(new WavSeekMap(this.wavFormat, 1, i8, j8));
            this.trackOutput.format(this.format);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j8) {
            this.startTimeUs = j8;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(ExtractorInput extractorInput, long j8) {
            int i8;
            int i9;
            long j9 = j8;
            while (j9 > 0 && (i8 = this.pendingOutputBytes) < (i9 = this.targetSampleSizeBytes)) {
                int sampleData = this.trackOutput.sampleData((DataReader) extractorInput, (int) Math.min(i9 - i8, j9), true);
                if (sampleData == -1) {
                    j9 = 0;
                } else {
                    this.pendingOutputBytes += sampleData;
                    j9 -= sampleData;
                }
            }
            int i10 = this.wavFormat.blockSize;
            int i11 = this.pendingOutputBytes / i10;
            if (i11 > 0) {
                long scaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, r1.frameRateHz);
                int i12 = i11 * i10;
                int i13 = this.pendingOutputBytes - i12;
                this.trackOutput.sampleMetadata(scaleLargeTimestamp, 1, i12, i13, null);
                this.outputFrameCount += i11;
                this.pendingOutputBytes = i13;
            }
            return j9 <= 0;
        }
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new WavExtractor()};
    }

    private void readFileType(ExtractorInput extractorInput) {
        Assertions.checkState(extractorInput.getPosition() == 0);
        int i8 = this.dataStartPosition;
        if (i8 != -1) {
            extractorInput.skipFully(i8);
            this.state = 4;
        } else {
            if (!WavHeaderReader.checkFileType(extractorInput)) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
            this.state = 1;
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void readFormat(ExtractorInput extractorInput) {
        WavFormat readFormat = WavHeaderReader.readFormat(extractorInput);
        int i8 = readFormat.formatType;
        if (i8 == 17) {
            this.outputWriter = new ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, readFormat);
        } else if (i8 == 6) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, readFormat, MimeTypes.AUDIO_ALAW, -1);
        } else if (i8 == 7) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, readFormat, MimeTypes.AUDIO_MLAW, -1);
        } else {
            int pcmEncodingForType = WavUtil.getPcmEncodingForType(i8, readFormat.bitsPerSample);
            if (pcmEncodingForType == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + readFormat.formatType);
            }
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, readFormat, MimeTypes.AUDIO_RAW, pcmEncodingForType);
        }
        this.state = 3;
    }

    private void readRf64SampleDataSize(ExtractorInput extractorInput) {
        this.rf64SampleDataSize = WavHeaderReader.readRf64SampleDataSize(extractorInput);
        this.state = 2;
    }

    private int readSampleData(ExtractorInput extractorInput) {
        Assertions.checkState(this.dataEndPosition != -1);
        return ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    private void skipToSampleData(ExtractorInput extractorInput) {
        Pair<Long, Long> skipToSampleData = WavHeaderReader.skipToSampleData(extractorInput);
        this.dataStartPosition = ((Long) skipToSampleData.first).intValue();
        long longValue = ((Long) skipToSampleData.second).longValue();
        long j8 = this.rf64SampleDataSize;
        if (j8 != -1 && longValue == com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) {
            longValue = j8;
        }
        this.dataEndPosition = this.dataStartPosition + longValue;
        long length = extractorInput.getLength();
        if (length != -1 && this.dataEndPosition > length) {
            Log.w(TAG, "Data exceeds input length: " + this.dataEndPosition + ", " + length);
            this.dataEndPosition = length;
        }
        ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        assertInitialized();
        int i8 = this.state;
        if (i8 == 0) {
            readFileType(extractorInput);
            return 0;
        }
        if (i8 == 1) {
            readRf64SampleDataSize(extractorInput);
            return 0;
        }
        if (i8 == 2) {
            readFormat(extractorInput);
            return 0;
        }
        if (i8 == 3) {
            skipToSampleData(extractorInput);
            return 0;
        }
        if (i8 == 4) {
            return readSampleData(extractorInput);
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j8, long j9) {
        this.state = j8 == 0 ? 0 : 4;
        OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j9);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return WavHeaderReader.checkFileType(extractorInput);
    }
}
