package com.google.android.exoplayer2.extractor.mkv;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.crrepa.band.my.device.customkey.util.c;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.extractor.e;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@Deprecated
/* loaded from: classes3.dex */
public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISCARD_PADDING = 30114;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    private static final String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    private static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;

    @Nullable
    private LongArray cueClusterPositions;

    @Nullable
    private LongArray cueTimesUs;
    private long cuesContentPosition;

    @Nullable
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final ParsableByteArray subtitleSample;
    private final ParsableByteArray supplementalData;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.mkv.a
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = MatroskaExtractor.lambda$static$0();
            return lambda$static$0;
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return e.a(this, uri, map);
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, a4.a.C0, 48, 48, a4.a.C0, 48, 48, a4.a.f72p0, 48, 48, 48, 32, 45, 45, a4.a.G0, 32, 48, 48, a4.a.C0, 48, 48, a4.a.C0, 48, 48, a4.a.f72p0, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {a4.a.L0, a4.a.f35f1, a4.a.X0, a4.a.f47i1, a4.a.f59l1, a4.a.f27d1, a4.a.f76q1, a4.a.f19b1, a4.a.C0, 32, 48, a4.a.C0, 48, 48, a4.a.C0, 48, 48, a4.a.C0, 48, 48, a4.a.f72p0, 48, a4.a.C0, 48, 48, a4.a.C0, 48, 48, a4.a.C0, 48, 48, a4.a.f72p0};
    private static final byte[] VTT_PREFIX = {a4.a.R0, a4.a.M0, 66, 86, a4.a.Q0, a4.a.Q0, 10, 10, 48, 48, a4.a.C0, 48, 48, a4.a.C0, 48, 48, a4.a.f78r0, 48, 48, 48, 32, 45, 45, a4.a.G0, 32, 48, 48, a4.a.C0, 48, 48, a4.a.C0, 48, 48, a4.a.f78r0, 48, 48, 48, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void binaryElement(int i8, int i9, ExtractorInput extractorInput) {
            MatroskaExtractor.this.binaryElement(i8, i9, extractorInput);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i8) {
            MatroskaExtractor.this.endMasterElement(i8);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void floatElement(int i8, double d8) {
            MatroskaExtractor.this.floatElement(i8, d8);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public int getElementType(int i8) {
            return MatroskaExtractor.this.getElementType(i8);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void integerElement(int i8, long j8) {
            MatroskaExtractor.this.integerElement(i8, j8);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i8) {
            return MatroskaExtractor.this.isLevel1Element(i8);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i8, long j8, long j9) {
            MatroskaExtractor.this.startMasterElement(i8, j8, j9);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void stringElement(int i8, String str) {
            MatroskaExtractor.this.stringElement(i8, str);
        }
    }

    protected static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        private int blockAddIdType;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public boolean hasContentEncryption;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public int width = -1;
        public int height = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public boolean hasColorInfo = false;
        public int colorSpace = -1;
        public int colorTransfer = -1;
        public int colorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean flagDefault = true;
        private String language = "eng";

        protected Track() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] getCodecPrivate(String str) {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        @Nullable
        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) (this.maxMasteringLuminance + 0.5f));
            order.putShort((short) (this.minMasteringLuminance + 0.5f));
            order.putShort((short) this.maxContentLuminance);
            order.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) {
            try {
                parsableByteArray.skipBytes(16);
                long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (readLittleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, null);
                }
                if (readLittleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (readLittleEndianUnsignedInt != 826496599) {
                    Log.w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
                }
                byte[] data = parsableByteArray.getData();
                for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) {
            try {
                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort == 1) {
                    return true;
                }
                if (readLittleEndianUnsignedShort != 65534) {
                    return false;
                }
                parsableByteArray.setPosition(24);
                if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits()) {
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) {
            int i8;
            int i9;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i10 = 1;
                int i11 = 0;
                while (true) {
                    i8 = bArr[i10];
                    if ((i8 & 255) != 255) {
                        break;
                    }
                    i11 += 255;
                    i10++;
                }
                int i12 = i10 + 1;
                int i13 = i11 + (i8 & 255);
                int i14 = 0;
                while (true) {
                    i9 = bArr[i12];
                    if ((i9 & 255) != 255) {
                        break;
                    }
                    i14 += 255;
                    i12++;
                }
                int i15 = i12 + 1;
                int i16 = i14 + (i9 & 255);
                if (bArr[i15] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, i15, bArr2, 0, i13);
                int i17 = i15 + i13;
                if (bArr[i17] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i18 = i17 + i16;
                if (bArr[i18] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i18];
                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z7) {
            return MatroskaExtractor.CODEC_ID_OPUS.equals(this.codecId) ? z7 : this.maxBlockAdditionId > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:14:0x043d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0456  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0465  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0583  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0477  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0458  */
        @EnsuresNonNull({"this.output"})
        @RequiresNonNull({"codecId"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void initializeOutput(ExtractorOutput extractorOutput, int i8) {
            char c8;
            List<byte[]> singletonList;
            String str;
            int i9;
            int i10;
            List<byte[]> list;
            String str2;
            String str3;
            Format.Builder builder;
            int i11;
            int i12;
            int i13;
            DolbyVisionConfig parse;
            String str4 = this.codecId;
            str4.hashCode();
            switch (str4.hashCode()) {
                case -2095576542:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MPEG4_AP)) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -2095575984:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MPEG4_SP)) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1985379776:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_ACM)) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1784763192:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_TRUEHD)) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1730367663:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VORBIS)) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1482641358:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MP2)) {
                        c8 = 5;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1482641357:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MP3)) {
                        c8 = 6;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1373388978:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_FOURCC)) {
                        c8 = 7;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -933872740:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DVBSUB)) {
                        c8 = '\b';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -538363189:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MPEG4_ASP)) {
                        c8 = '\t';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -538363109:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_H264)) {
                        c8 = '\n';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -425012669:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VOBSUB)) {
                        c8 = 11;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -356037306:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DTS_LOSSLESS)) {
                        c8 = '\f';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 62923557:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_AAC)) {
                        c8 = '\r';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 62923603:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_AC3)) {
                        c8 = 14;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 62927045:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DTS)) {
                        c8 = 15;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 82318131:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_AV1)) {
                        c8 = 16;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 82338133:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VP8)) {
                        c8 = 17;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 82338134:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VP9)) {
                        c8 = 18;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 99146302:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PGS)) {
                        c8 = 19;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 444813526:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_THEORA)) {
                        c8 = 20;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 542569478:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DTS_EXPRESS)) {
                        c8 = 21;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 635596514:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PCM_FLOAT)) {
                        c8 = 22;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 725948237:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PCM_INT_BIG)) {
                        c8 = 23;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 725957860:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PCM_INT_LIT)) {
                        c8 = 24;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 738597099:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_ASS)) {
                        c8 = 25;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 855502857:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_H265)) {
                        c8 = 26;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1045209816:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VTT)) {
                        c8 = 27;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1422270023:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_SUBRIP)) {
                        c8 = 28;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1809237540:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MPEG2)) {
                        c8 = 29;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1950749482:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_E_AC3)) {
                        c8 = 30;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1950789798:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_FLAC)) {
                        c8 = 31;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1951062397:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_OPUS)) {
                        c8 = ' ';
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            String str5 = MimeTypes.AUDIO_RAW;
            switch (c8) {
                case 0:
                case 1:
                case '\t':
                    byte[] bArr = this.codecPrivate;
                    singletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = MimeTypes.VIDEO_MP4V;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null && (parse = DolbyVisionConfig.parse(new ParsableByteArray(this.dolbyVisionConfigBytes))) != null) {
                        str = parse.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i14 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i9);
                        i11 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.displayUnit == 0) {
                            int i15 = this.displayWidth;
                            i12 = -1;
                            if (i15 == -1) {
                                i15 = this.width;
                            }
                            this.displayWidth = i15;
                            int i16 = this.displayHeight;
                            if (i16 == -1) {
                                i16 = this.height;
                            }
                            this.displayHeight = i16;
                        } else {
                            i12 = -1;
                        }
                        float f8 = (this.displayWidth == i12 || (i13 = this.displayHeight) == i12) ? -1.0f : (this.height * r2) / (this.width * i13);
                        ColorInfo colorInfo = this.hasColorInfo ? new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo()) : null;
                        if (this.name != null && MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                            i12 = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                        }
                        if (this.projectionType == 0 && Float.compare(this.projectionPoseYaw, 0.0f) == 0 && Float.compare(this.projectionPosePitch, 0.0f) == 0) {
                            if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                i12 = 0;
                            } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                i12 = 90;
                            } else if (Float.compare(this.projectionPosePitch, -180.0f) == 0 || Float.compare(this.projectionPosePitch, 180.0f) == 0) {
                                i12 = c.MAX_GOAL_TIME;
                            } else if (Float.compare(this.projectionPosePitch, -90.0f) == 0) {
                                i12 = 270;
                            }
                        }
                        builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f8).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                        i11 = 2;
                    } else {
                        if (!MimeTypes.APPLICATION_SUBRIP.equals(str3) && !MimeTypes.TEXT_SSA.equals(str3) && !MimeTypes.TEXT_VTT.equals(str3) && !MimeTypes.APPLICATION_VOBSUB.equals(str3) && !MimeTypes.APPLICATION_PGS.equals(str3) && !MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                            throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        i11 = 3;
                    }
                    if (this.name != null && !MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                        builder.setLabel(this.name);
                    }
                    Format build = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track = extractorOutput.track(this.number, i11);
                    this.output = track;
                    track.format(build);
                    return;
                case 2:
                    if (parseMsAcmCodecPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)))) {
                        int pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                        if (pcmEncoding != 0) {
                            i9 = pcmEncoding;
                            singletonList = null;
                            str = null;
                            i10 = -1;
                            if (this.dolbyVisionConfigBytes != null) {
                                str = parse.codecs;
                                str5 = MimeTypes.VIDEO_DOLBY_VISION;
                                break;
                            }
                            str3 = str5;
                            int i142 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                            builder = new Format.Builder();
                            if (MimeTypes.isAudio(str3)) {
                            }
                            if (this.name != null) {
                                builder.setLabel(this.name);
                                break;
                            }
                            Format build2 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                            TrackOutput track2 = extractorOutput.track(this.number, i11);
                            this.output = track2;
                            track2.format(build2);
                            return;
                        }
                        Log.w(MatroskaExtractor.TAG, "Unsupported PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    } else {
                        Log.w(MatroskaExtractor.TAG, "Non-PCM MS/ACM is unsupported. Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    }
                    singletonList = null;
                    str = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1422 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build22 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track22 = extractorOutput.track(this.number, i11);
                    this.output = track22;
                    track22.format(build22);
                    return;
                case 3:
                    this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                    str5 = MimeTypes.AUDIO_TRUEHD;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i14222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track222 = extractorOutput.track(this.number, i11);
                    this.output = track222;
                    track222.format(build222);
                    return;
                case 4:
                    singletonList = parseVorbisCodecPrivate(getCodecPrivate(this.codecId));
                    str5 = MimeTypes.AUDIO_VORBIS;
                    str = null;
                    i10 = 8192;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i142222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build2222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track2222 = extractorOutput.track(this.number, i11);
                    this.output = track2222;
                    track2222.format(build2222);
                    return;
                case 5:
                    str5 = MimeTypes.AUDIO_MPEG_L2;
                    singletonList = null;
                    str = null;
                    i10 = 4096;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1422222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build22222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track22222 = extractorOutput.track(this.number, i11);
                    this.output = track22222;
                    track22222.format(build22222);
                    return;
                case 6:
                    str5 = MimeTypes.AUDIO_MPEG;
                    singletonList = null;
                    str = null;
                    i10 = 4096;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i14222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track222222 = extractorOutput.track(this.number, i11);
                    this.output = track222222;
                    track222222.format(build222222);
                    return;
                case 7:
                    Pair<String, List<byte[]>> parseFourCcPrivate = parseFourCcPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    str5 = (String) parseFourCcPrivate.first;
                    singletonList = (List) parseFourCcPrivate.second;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i142222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build2222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track2222222 = extractorOutput.track(this.number, i11);
                    this.output = track2222222;
                    track2222222.format(build2222222);
                    return;
                case '\b':
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(getCodecPrivate(this.codecId), 0, bArr2, 0, 4);
                    singletonList = ImmutableList.of(bArr2);
                    str = null;
                    str5 = MimeTypes.APPLICATION_DVBSUBS;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1422222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build22222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track22222222 = extractorOutput.track(this.number, i11);
                    this.output = track22222222;
                    track22222222.format(build22222222);
                    return;
                case '\n':
                    AvcConfig parse2 = AvcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = parse2.initializationData;
                    this.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                    str2 = parse2.codecs;
                    str5 = MimeTypes.VIDEO_H264;
                    i10 = -1;
                    i9 = -1;
                    List<byte[]> list2 = list;
                    str = str2;
                    singletonList = list2;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i14222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track222222222 = extractorOutput.track(this.number, i11);
                    this.output = track222222222;
                    track222222222.format(build222222222);
                    return;
                case 11:
                    singletonList = ImmutableList.of(getCodecPrivate(this.codecId));
                    str = null;
                    str5 = MimeTypes.APPLICATION_VOBSUB;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i142222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build2222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track2222222222 = extractorOutput.track(this.number, i11);
                    this.output = track2222222222;
                    track2222222222.format(build2222222222);
                    return;
                case '\f':
                    str5 = MimeTypes.AUDIO_DTS_HD;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1422222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build22222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track22222222222 = extractorOutput.track(this.number, i11);
                    this.output = track22222222222;
                    track22222222222.format(build22222222222);
                    return;
                case '\r':
                    singletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(this.codecPrivate);
                    this.sampleRate = parseAudioSpecificConfig.sampleRateHz;
                    this.channelCount = parseAudioSpecificConfig.channelCount;
                    str = parseAudioSpecificConfig.codecs;
                    str5 = MimeTypes.AUDIO_AAC;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i14222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track222222222222;
                    track222222222222.format(build222222222222);
                    return;
                case 14:
                    str5 = MimeTypes.AUDIO_AC3;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i142222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build2222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track2222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track2222222222222;
                    track2222222222222.format(build2222222222222);
                    return;
                case 15:
                case 21:
                    str5 = MimeTypes.AUDIO_DTS;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1422222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build22222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track22222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track22222222222222;
                    track22222222222222.format(build22222222222222);
                    return;
                case 16:
                    str5 = MimeTypes.VIDEO_AV1;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i14222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track222222222222222;
                    track222222222222222.format(build222222222222222);
                    return;
                case 17:
                    str5 = MimeTypes.VIDEO_VP8;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i142222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build2222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track2222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track2222222222222222;
                    track2222222222222222.format(build2222222222222222);
                    return;
                case 18:
                    str5 = MimeTypes.VIDEO_VP9;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1422222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build22222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track22222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track22222222222222222;
                    track22222222222222222.format(build22222222222222222);
                    return;
                case 19:
                    singletonList = null;
                    str = null;
                    str5 = MimeTypes.APPLICATION_PGS;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i14222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track222222222222222222;
                    track222222222222222222.format(build222222222222222222);
                    return;
                case 20:
                    str5 = MimeTypes.VIDEO_UNKNOWN;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i142222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build2222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track2222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track2222222222222222222;
                    track2222222222222222222.format(build2222222222222222222);
                    return;
                case 22:
                    if (this.audioBitDepth == 32) {
                        singletonList = null;
                        str = null;
                        i10 = -1;
                        i9 = 4;
                        if (this.dolbyVisionConfigBytes != null) {
                        }
                        str3 = str5;
                        int i1422222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                        }
                        if (this.name != null) {
                        }
                        Format build22222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput track22222222222222222222 = extractorOutput.track(this.number, i11);
                        this.output = track22222222222222222222;
                        track22222222222222222222.format(build22222222222222222222);
                        return;
                    }
                    Log.w(MatroskaExtractor.TAG, "Unsupported floating point PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    singletonList = null;
                    str = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i14222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track222222222222222222222;
                    track222222222222222222222.format(build222222222222222222222);
                    return;
                case 23:
                    int i17 = this.audioBitDepth;
                    if (i17 == 8) {
                        singletonList = null;
                        str = null;
                        i10 = -1;
                        i9 = 3;
                    } else if (i17 == 16) {
                        singletonList = null;
                        str = null;
                        i10 = -1;
                        i9 = 268435456;
                    } else {
                        Log.w(MatroskaExtractor.TAG, "Unsupported big endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                        singletonList = null;
                        str = null;
                        str5 = MimeTypes.AUDIO_UNKNOWN;
                        i10 = -1;
                        i9 = -1;
                    }
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i142222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build2222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track2222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track2222222222222222222222;
                    track2222222222222222222222.format(build2222222222222222222222);
                    return;
                case 24:
                    int pcmEncoding2 = Util.getPcmEncoding(this.audioBitDepth);
                    if (pcmEncoding2 != 0) {
                        i9 = pcmEncoding2;
                        singletonList = null;
                        str = null;
                        i10 = -1;
                        if (this.dolbyVisionConfigBytes != null) {
                        }
                        str3 = str5;
                        int i1422222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                        }
                        if (this.name != null) {
                        }
                        Format build22222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput track22222222222222222222222 = extractorOutput.track(this.number, i11);
                        this.output = track22222222222222222222222;
                        track22222222222222222222222.format(build22222222222222222222222);
                        return;
                    }
                    Log.w(MatroskaExtractor.TAG, "Unsupported little endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    singletonList = null;
                    str = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i14222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build222222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14222222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track222222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track222222222222222222222222;
                    track222222222222222222222222.format(build222222222222222222222222);
                    return;
                case 25:
                    singletonList = ImmutableList.of(MatroskaExtractor.SSA_DIALOGUE_FORMAT, getCodecPrivate(this.codecId));
                    str = null;
                    str5 = MimeTypes.TEXT_SSA;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i142222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build2222222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142222222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track2222222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track2222222222222222222222222;
                    track2222222222222222222222222.format(build2222222222222222222222222);
                    return;
                case 26:
                    HevcConfig parse3 = HevcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = parse3.initializationData;
                    this.nalUnitLengthFieldLength = parse3.nalUnitLengthFieldLength;
                    str2 = parse3.codecs;
                    str5 = MimeTypes.VIDEO_H265;
                    i10 = -1;
                    i9 = -1;
                    List<byte[]> list22 = list;
                    str = str2;
                    singletonList = list22;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1422222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build22222222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422222222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track22222222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track22222222222222222222222222;
                    track22222222222222222222222222.format(build22222222222222222222222222);
                    return;
                case 27:
                    str5 = MimeTypes.TEXT_VTT;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i14222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build222222222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14222222222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track222222222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track222222222222222222222222222;
                    track222222222222222222222222222.format(build222222222222222222222222222);
                    return;
                case 28:
                    str5 = MimeTypes.APPLICATION_SUBRIP;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i142222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build2222222222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142222222222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track2222222222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track2222222222222222222222222222;
                    track2222222222222222222222222222.format(build2222222222222222222222222222);
                    return;
                case 29:
                    str5 = MimeTypes.VIDEO_MPEG2;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1422222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build22222222222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422222222222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track22222222222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track22222222222222222222222222222;
                    track22222222222222222222222222222.format(build22222222222222222222222222222);
                    return;
                case 30:
                    str5 = MimeTypes.AUDIO_E_AC3;
                    singletonList = null;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i14222222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build222222222222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i14222222222222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track222222222222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track222222222222222222222222222222;
                    track222222222222222222222222222222.format(build222222222222222222222222222222);
                    return;
                case 31:
                    singletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    str5 = MimeTypes.AUDIO_FLAC;
                    str = null;
                    i10 = -1;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i142222222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build2222222222222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i142222222222222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track2222222222222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track2222222222222222222222222222222;
                    track2222222222222222222222222222222.format(build2222222222222222222222222222222);
                    return;
                case ' ':
                    singletonList = new ArrayList<>(3);
                    singletonList.add(getCodecPrivate(this.codecId));
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    singletonList.add(allocate.order(byteOrder).putLong(this.codecDelayNs).array());
                    singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.seekPreRollNs).array());
                    str5 = MimeTypes.AUDIO_OPUS;
                    str = null;
                    i10 = MatroskaExtractor.OPUS_MAX_INPUT_SIZE;
                    i9 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1422222222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format build22222222222222222222222222222222 = builder.setId(i8).setSampleMimeType(str3).setMaxInputSize(i10).setLanguage(this.language).setSelectionFlags(i1422222222222222222222222222222222).setInitializationData(singletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput track22222222222222222222222222222222 = extractorOutput.track(this.number, i11);
                    this.output = track22222222222222222222222222222222;
                    track22222222222222222222222222222222.format(build22222222222222222222222222222222);
                    return;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        @RequiresNonNull({"output"})
        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", Integer.valueOf(c.MAX_GOAL_TIME));
        hashMap.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(hashMap);
    }

    public MatroskaExtractor() {
        this(0);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void assertInCues(int i8) {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            throw ParserException.createForMalformedContainer("Element " + i8 + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void assertInTrackEntry(int i8) {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i8 + " must be in a TrackEntry", null);
    }

    @EnsuresNonNull({"extractorOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    private SeekMap buildSeekMap(@Nullable LongArray longArray, @Nullable LongArray longArray2) {
        int i8;
        if (this.segmentContentPosition == -1 || this.durationUs == C.TIME_UNSET || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArr = new int[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jArr3[i10] = longArray.get(i10);
            jArr[i10] = this.segmentContentPosition + longArray2.get(i10);
        }
        while (true) {
            i8 = size - 1;
            if (i9 >= i8) {
                break;
            }
            int i11 = i9 + 1;
            iArr[i9] = (int) (jArr[i11] - jArr[i9]);
            jArr2[i9] = jArr3[i11] - jArr3[i9];
            i9 = i11;
        }
        iArr[i8] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArr[i8]);
        long j8 = this.durationUs - jArr3[i8];
        jArr2[i8] = j8;
        if (j8 <= 0) {
            Log.w(TAG, "Discarding last cue point with unexpected duration: " + j8);
            iArr = Arrays.copyOf(iArr, i8);
            jArr = Arrays.copyOf(jArr, i8);
            jArr2 = Arrays.copyOf(jArr2, i8);
            jArr3 = Arrays.copyOf(jArr3, i8);
        }
        return new ChunkIndex(iArr, jArr, jArr2, jArr3);
    }

    @RequiresNonNull({"#1.output"})
    private void commitSampleToOutput(Track track, long j8, int i8, int i9, int i10) {
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track.output, j8, i8, i9, i10, track.cryptoData);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId) || CODEC_ID_VTT.equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    Log.w(TAG, "Skipping subtitle sample in laced block.");
                } else {
                    long j9 = this.blockDurationUs;
                    if (j9 == C.TIME_UNSET) {
                        Log.w(TAG, "Skipping subtitle sample with no duration.");
                    } else {
                        setSubtitleEndTime(track.codecId, j9, this.subtitleSample.getData());
                        int position = this.subtitleSample.getPosition();
                        while (true) {
                            if (position >= this.subtitleSample.limit()) {
                                break;
                            }
                            if (this.subtitleSample.getData()[position] == 0) {
                                this.subtitleSample.setLimit(position);
                                break;
                            }
                            position++;
                        }
                        TrackOutput trackOutput = track.output;
                        ParsableByteArray parsableByteArray = this.subtitleSample;
                        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                        i9 += this.subtitleSample.limit();
                    }
                }
            }
            if ((268435456 & i8) != 0) {
                if (this.blockSampleCount > 1) {
                    this.supplementalData.reset(0);
                } else {
                    int limit = this.supplementalData.limit();
                    track.output.sampleData(this.supplementalData, limit, 2);
                    i9 += limit;
                }
            }
            track.output.sampleMetadata(j8, i8, i9, i10, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private static int[] ensureArrayCapacity(@Nullable int[] iArr, int i8) {
        return iArr == null ? new int[i8] : iArr.length >= i8 ? iArr : new int[Math.max(iArr.length * 2, i8)];
    }

    private int finishWriteSampleData() {
        int i8 = this.sampleBytesWritten;
        resetWriteSampleData();
        return i8;
    }

    private static byte[] formatSubtitleTimecode(long j8, String str, long j9) {
        Assertions.checkArgument(j8 != C.TIME_UNSET);
        int i8 = (int) (j8 / 3600000000L);
        long j10 = j8 - (i8 * 3600000000L);
        int i9 = (int) (j10 / 60000000);
        long j11 = j10 - (i9 * 60000000);
        int i10 = (int) (j11 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf((int) ((j11 - (i10 * 1000000)) / j9))));
    }

    private static boolean isCodecSupported(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j8) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j8;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j9 = this.seekPositionAfterBuildingCues;
            if (j9 != -1) {
                positionHolder.position = j9;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private void readScratch(ExtractorInput extractorInput, int i8) {
        if (this.scratch.limit() >= i8) {
            return;
        }
        if (this.scratch.capacity() < i8) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i8));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i8 - this.scratch.limit());
        this.scratch.setLimit(i8);
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private long scaleTimecodeToUs(long j8) {
        long j9 = this.timecodeScale;
        if (j9 != C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j8, j9, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void setSubtitleEndTime(String str, long j8, byte[] bArr) {
        byte[] formatSubtitleTimecode;
        int i8;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                formatSubtitleTimecode = formatSubtitleTimecode(j8, SSA_TIMECODE_FORMAT, 10000L);
                i8 = 21;
                break;
            case "S_TEXT/WEBVTT":
                formatSubtitleTimecode = formatSubtitleTimecode(j8, VTT_TIMECODE_FORMAT, 1000L);
                i8 = 25;
                break;
            case "S_TEXT/UTF8":
                formatSubtitleTimecode = formatSubtitleTimecode(j8, SUBRIP_TIMECODE_FORMAT, 1000L);
                i8 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(formatSubtitleTimecode, 0, bArr, i8, formatSubtitleTimecode.length);
    }

    @RequiresNonNull({"#2.output"})
    private int writeSampleData(ExtractorInput extractorInput, Track track, int i8, boolean z7) {
        int i9;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i8);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i8);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i8);
            return finishWriteSampleData();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b8 = this.sampleSignalByte;
                if ((b8 & 1) == 1) {
                    boolean z8 = (b8 & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z8 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z8) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i10 = this.samplePartitionCount * 4;
                        this.scratch.reset(i10);
                        extractorInput.readFully(this.scratch.getData(), 0, i10);
                        this.sampleBytesRead += i10;
                        short s7 = (short) ((this.samplePartitionCount / 2) + 1);
                        int i11 = (s7 * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i11) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i11);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s7);
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i9 = this.samplePartitionCount;
                            if (i12 >= i9) {
                                break;
                            }
                            int readUnsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i12 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (readUnsignedIntToInt - i13));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(readUnsignedIntToInt - i13);
                            }
                            i12++;
                            i13 = readUnsignedIntToInt;
                        }
                        int i14 = (i8 - this.sampleBytesRead) - i13;
                        if (i9 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i14);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i14);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i11);
                        trackOutput.sampleData(this.encryptionSubsampleData, i11, 1);
                        this.sampleBytesWritten += i11;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            if (track.samplesHaveSupplementalData(z7)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int limit = (this.sampleStrippedBytes.limit() + i8) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((limit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((limit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((limit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (limit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int limit2 = i8 + this.sampleStrippedBytes.limit();
        if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i15 = this.sampleBytesRead;
                if (i15 >= limit2) {
                    break;
                }
                int writeToOutput = writeToOutput(extractorInput, trackOutput, limit2 - i15);
                this.sampleBytesRead += writeToOutput;
                this.sampleBytesWritten += writeToOutput;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i16 = track.nalUnitLengthFieldLength;
            int i17 = 4 - i16;
            while (this.sampleBytesRead < limit2) {
                int i18 = this.sampleCurrentNalBytesRemaining;
                if (i18 == 0) {
                    writeToTarget(extractorInput, data, i17, i16);
                    this.sampleBytesRead += i16;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int writeToOutput2 = writeToOutput(extractorInput, trackOutput, i18);
                    this.sampleBytesRead += writeToOutput2;
                    this.sampleBytesWritten += writeToOutput2;
                    this.sampleCurrentNalBytesRemaining -= writeToOutput2;
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i8) {
        int length = bArr.length + i8;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i8));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i8);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i8) {
        int bytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (bytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i8, false);
        }
        int min = Math.min(i8, bytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, min);
        return min;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i8, int i9) {
        int min = Math.min(i9, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i8 + min, i9 - min);
        if (min > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i8, min);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0231, code lost:
    
        throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
     */
    @CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void binaryElement(int i8, int i9, ExtractorInput extractorInput) {
        Track track;
        Track track2;
        Track track3;
        long j8;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        if (i8 != 161 && i8 != ID_SIMPLE_BLOCK) {
            if (i8 == ID_BLOCK_ADDITIONAL) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput, i9);
                return;
            }
            if (i8 == ID_BLOCK_ADD_ID_EXTRA_DATA) {
                handleBlockAddIDExtraData(getCurrentTrack(i8), extractorInput, i9);
                return;
            }
            if (i8 == ID_CONTENT_COMPRESSION_SETTINGS) {
                assertInTrackEntry(i8);
                byte[] bArr = new byte[i9];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput.readFully(bArr, 0, i9);
                return;
            }
            if (i8 == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr2 = new byte[i9];
                extractorInput.readFully(bArr2, 0, i9);
                getCurrentTrack(i8).cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            }
            if (i8 == ID_SEEK_ID) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput.readFully(this.seekEntryIdBytes.getData(), 4 - i9, i9);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i8 == ID_CODEC_PRIVATE) {
                assertInTrackEntry(i8);
                byte[] bArr3 = new byte[i9];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput.readFully(bArr3, 0, i9);
                return;
            }
            if (i8 != ID_PROJECTION_PRIVATE) {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i8, null);
            }
            assertInTrackEntry(i8);
            byte[] bArr4 = new byte[i9];
            this.currentTrack.projectionData = bArr4;
            extractorInput.readFully(bArr4, 0, i9);
            return;
        }
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = C.TIME_UNSET;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        Track track4 = this.tracks.get(this.blockTrackNumber);
        if (track4 == null) {
            extractorInput.skipFully(i9 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track4.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i15 = (this.scratch.getData()[2] & 6) >> 1;
            byte b8 = 255;
            if (i15 == 0) {
                this.blockSampleCount = 1;
                int[] ensureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = ensureArrayCapacity;
                ensureArrayCapacity[0] = (i9 - this.blockTrackNumberLength) - 3;
            } else {
                int i16 = 4;
                readScratch(extractorInput, 4);
                int i17 = (this.scratch.getData()[3] & 255) + 1;
                this.blockSampleCount = i17;
                int[] ensureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i17);
                this.blockSampleSizes = ensureArrayCapacity2;
                if (i15 == 2) {
                    int i18 = (i9 - this.blockTrackNumberLength) - 4;
                    int i19 = this.blockSampleCount;
                    Arrays.fill(ensureArrayCapacity2, 0, i19, i18 / i19);
                } else if (i15 == 1) {
                    int i20 = 0;
                    int i21 = 0;
                    while (true) {
                        i10 = this.blockSampleCount;
                        if (i20 >= i10 - 1) {
                            break;
                        }
                        this.blockSampleSizes[i20] = 0;
                        while (true) {
                            i11 = i16 + 1;
                            readScratch(extractorInput, i11);
                            int i22 = this.scratch.getData()[i16] & 255;
                            int[] iArr = this.blockSampleSizes;
                            i12 = iArr[i20] + i22;
                            iArr[i20] = i12;
                            if (i22 != 255) {
                                break;
                            } else {
                                i16 = i11;
                            }
                        }
                        i21 += i12;
                        i20++;
                        i16 = i11;
                    }
                    this.blockSampleSizes[i10 - 1] = ((i9 - this.blockTrackNumberLength) - i16) - i21;
                } else {
                    if (i15 != 3) {
                        throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i15, null);
                    }
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        int i25 = this.blockSampleCount;
                        if (i23 >= i25 - 1) {
                            track2 = track4;
                            this.blockSampleSizes[i25 - 1] = ((i9 - this.blockTrackNumberLength) - i16) - i24;
                            break;
                        }
                        this.blockSampleSizes[i23] = i13;
                        int i26 = i16 + 1;
                        readScratch(extractorInput, i26);
                        if (this.scratch.getData()[i16] == 0) {
                            throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                        }
                        int i27 = 0;
                        while (true) {
                            if (i27 >= 8) {
                                track3 = track4;
                                j8 = 0;
                                break;
                            }
                            int i28 = i14 << (7 - i27);
                            if ((this.scratch.getData()[i16] & i28) != 0) {
                                i26 += i27;
                                readScratch(extractorInput, i26);
                                track3 = track4;
                                j8 = (~i28) & this.scratch.getData()[i16] & b8;
                                int i29 = i16 + 1;
                                while (i29 < i26) {
                                    j8 = (j8 << 8) | (this.scratch.getData()[i29] & b8);
                                    i29++;
                                    b8 = 255;
                                }
                                if (i23 > 0) {
                                    j8 -= (1 << ((i27 * 7) + 6)) - 1;
                                }
                            } else {
                                i27++;
                                i14 = 1;
                                b8 = 255;
                            }
                        }
                        i16 = i26;
                        if (j8 < -2147483648L || j8 > 2147483647L) {
                            break;
                        }
                        int i30 = (int) j8;
                        int[] iArr2 = this.blockSampleSizes;
                        if (i23 != 0) {
                            i30 += iArr2[i23 - 1];
                        }
                        iArr2[i23] = i30;
                        i24 += i30;
                        i23++;
                        track4 = track3;
                        i13 = 0;
                        i14 = 1;
                        b8 = 255;
                    }
                }
            }
            track2 = track4;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[0] << 8) | (this.scratch.getData()[1] & 255));
            track = track2;
            this.blockFlags = (track.type == 2 || (i8 == ID_SIMPLE_BLOCK && (this.scratch.getData()[2] & UnsignedBytes.MAX_POWER_OF_TWO) == 128)) ? 1 : 0;
            this.blockState = 2;
            this.blockSampleIndex = 0;
        } else {
            track = track4;
        }
        if (i8 == ID_SIMPLE_BLOCK) {
            while (true) {
                int i31 = this.blockSampleIndex;
                if (i31 >= this.blockSampleCount) {
                    this.blockState = 0;
                    return;
                } else {
                    commitSampleToOutput(track, ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000) + this.blockTimeUs, this.blockFlags, writeSampleData(extractorInput, track, this.blockSampleSizes[i31], false), 0);
                    this.blockSampleIndex++;
                }
            }
        } else {
            while (true) {
                int i32 = this.blockSampleIndex;
                if (i32 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                iArr3[i32] = writeSampleData(extractorInput, track, iArr3[i32], true);
                this.blockSampleIndex++;
            }
        }
    }

    @CallSuper
    protected void endMasterElement(int i8) {
        assertInitialized();
        if (i8 == 160) {
            if (this.blockState != 2) {
                return;
            }
            Track track = this.tracks.get(this.blockTrackNumber);
            track.assertOutputInitialized();
            if (this.blockGroupDiscardPaddingNs > 0 && CODEC_ID_OPUS.equals(track.codecId)) {
                this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
            }
            int i9 = 0;
            for (int i10 = 0; i10 < this.blockSampleCount; i10++) {
                i9 += this.blockSampleSizes[i10];
            }
            int i11 = 0;
            while (i11 < this.blockSampleCount) {
                long j8 = this.blockTimeUs + ((track.defaultSampleDurationNs * i11) / 1000);
                int i12 = this.blockFlags;
                if (i11 == 0 && !this.blockHasReferenceBlock) {
                    i12 |= 1;
                }
                int i13 = this.blockSampleSizes[i11];
                int i14 = i9 - i13;
                commitSampleToOutput(track, j8, i12, i13, i14);
                i11++;
                i9 = i14;
            }
            this.blockState = 0;
            return;
        }
        if (i8 == ID_TRACK_ENTRY) {
            Track track2 = (Track) Assertions.checkStateNotNull(this.currentTrack);
            String str = track2.codecId;
            if (str == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(str)) {
                track2.initializeOutput(this.extractorOutput, track2.number);
                this.tracks.put(track2.number, track2);
            }
            this.currentTrack = null;
            return;
        }
        if (i8 == ID_SEEK) {
            int i15 = this.seekEntryId;
            if (i15 != -1) {
                long j9 = this.seekEntryPosition;
                if (j9 != -1) {
                    if (i15 == ID_CUES) {
                        this.cuesContentPosition = j9;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i8 == ID_CONTENT_ENCODING) {
            assertInTrackEntry(i8);
            Track track3 = this.currentTrack;
            if (track3.hasContentEncryption) {
                if (track3.cryptoData == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                track3.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.currentTrack.cryptoData.encryptionKey));
                return;
            }
            return;
        }
        if (i8 == ID_CONTENT_ENCODINGS) {
            assertInTrackEntry(i8);
            Track track4 = this.currentTrack;
            if (track4.hasContentEncryption && track4.sampleStrippedBytes != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i8 == 357149030) {
            if (this.timecodeScale == C.TIME_UNSET) {
                this.timecodeScale = 1000000L;
            }
            long j10 = this.durationTimecode;
            if (j10 != C.TIME_UNSET) {
                this.durationUs = scaleTimecodeToUs(j10);
                return;
            }
            return;
        }
        if (i8 == ID_TRACKS) {
            if (this.tracks.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.extractorOutput.endTracks();
        } else {
            if (i8 != ID_CUES) {
                return;
            }
            if (!this.sentSeekMap) {
                this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                this.sentSeekMap = true;
            }
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
        }
    }

    @CallSuper
    protected void floatElement(int i8, double d8) {
        if (i8 == ID_SAMPLING_FREQUENCY) {
            getCurrentTrack(i8).sampleRate = (int) d8;
        }
        if (i8 == ID_DURATION) {
            this.durationTimecode = (long) d8;
            return;
        }
        switch (i8) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                getCurrentTrack(i8).primaryRChromaticityX = (float) d8;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                getCurrentTrack(i8).primaryRChromaticityY = (float) d8;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                getCurrentTrack(i8).primaryGChromaticityX = (float) d8;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                getCurrentTrack(i8).primaryGChromaticityY = (float) d8;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                getCurrentTrack(i8).primaryBChromaticityX = (float) d8;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                getCurrentTrack(i8).primaryBChromaticityY = (float) d8;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                getCurrentTrack(i8).whitePointChromaticityX = (float) d8;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                getCurrentTrack(i8).whitePointChromaticityY = (float) d8;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                getCurrentTrack(i8).maxMasteringLuminance = (float) d8;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                getCurrentTrack(i8).minMasteringLuminance = (float) d8;
                break;
            default:
                switch (i8) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i8).projectionPoseYaw = (float) d8;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i8).projectionPosePitch = (float) d8;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i8).projectionPoseRoll = (float) d8;
                        break;
                }
        }
    }

    protected Track getCurrentTrack(int i8) {
        assertInTrackEntry(i8);
        return this.currentTrack;
    }

    @CallSuper
    protected int getElementType(int i8) {
        switch (i8) {
            case 131:
            case 136:
            case ID_BLOCK_DURATION /* 155 */:
            case ID_CHANNELS /* 159 */:
            case 176:
            case ID_CUE_TIME /* 179 */:
            case ID_PIXEL_HEIGHT /* 186 */:
            case ID_TRACK_NUMBER /* 215 */:
            case ID_TIME_CODE /* 231 */:
            case ID_BLOCK_ADD_ID /* 238 */:
            case 241:
            case ID_REFERENCE_BLOCK /* 251 */:
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
            case ID_EBML_READ_VERSION /* 17143 */:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case ID_SEEK_POSITION /* 21420 */:
            case ID_STEREO_MODE /* 21432 */:
            case ID_DISPLAY_WIDTH /* 21680 */:
            case ID_DISPLAY_UNIT /* 21682 */:
            case ID_DISPLAY_HEIGHT /* 21690 */:
            case ID_FLAG_FORCED /* 21930 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_DISCARD_PADDING /* 30114 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case 160:
            case ID_BLOCK_MORE /* 166 */:
            case ID_TRACK_ENTRY /* 174 */:
            case ID_CUE_TRACK_POSITIONS /* 183 */:
            case ID_CUE_POINT /* 187 */:
            case 224:
            case ID_AUDIO /* 225 */:
            case ID_BLOCK_ADDITION_MAPPING /* 16868 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case ID_SEEK /* 19899 */:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case ID_COLOUR /* 21936 */:
            case ID_MASTERING_METADATA /* 21968 */:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case ID_BLOCK_ADDITIONS /* 30113 */:
            case ID_PROJECTION /* 30320 */:
            case ID_SEEK_HEAD /* 290298740 */:
            case 357149030:
            case ID_TRACKS /* 374648427 */:
            case ID_SEGMENT /* 408125543 */:
            case ID_EBML /* 440786851 */:
            case ID_CUES /* 475249515 */:
            case ID_CLUSTER /* 524531317 */:
                return 1;
            case 161:
            case ID_SIMPLE_BLOCK /* 163 */:
            case ID_BLOCK_ADDITIONAL /* 165 */:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /* 16877 */:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case ID_SEEK_ID /* 21419 */:
            case ID_CODEC_PRIVATE /* 25506 */:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case ID_SAMPLING_FREQUENCY /* 181 */:
            case ID_DURATION /* 17545 */:
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
            case ID_LUMNINANCE_MAX /* 21977 */:
            case ID_LUMNINANCE_MIN /* 21978 */:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    protected void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i8) {
        if (track.blockAddIdType != 1685485123 && track.blockAddIdType != 1685480259) {
            extractorInput.skipFully(i8);
            return;
        }
        byte[] bArr = new byte[i8];
        track.dolbyVisionConfigBytes = bArr;
        extractorInput.readFully(bArr, 0, i8);
    }

    protected void handleBlockAdditionalData(Track track, int i8, ExtractorInput extractorInput, int i9) {
        if (i8 != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i9);
        } else {
            this.supplementalData.reset(i9);
            extractorInput.readFully(this.supplementalData.getData(), 0, i9);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @CallSuper
    protected void integerElement(int i8, long j8) {
        if (i8 == ID_CONTENT_ENCODING_ORDER) {
            if (j8 == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j8 + " not supported", null);
        }
        if (i8 == ID_CONTENT_ENCODING_SCOPE) {
            if (j8 == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j8 + " not supported", null);
        }
        switch (i8) {
            case 131:
                getCurrentTrack(i8).type = (int) j8;
                return;
            case 136:
                getCurrentTrack(i8).flagDefault = j8 == 1;
                return;
            case ID_BLOCK_DURATION /* 155 */:
                this.blockDurationUs = scaleTimecodeToUs(j8);
                return;
            case ID_CHANNELS /* 159 */:
                getCurrentTrack(i8).channelCount = (int) j8;
                return;
            case 176:
                getCurrentTrack(i8).width = (int) j8;
                return;
            case ID_CUE_TIME /* 179 */:
                assertInCues(i8);
                this.cueTimesUs.add(scaleTimecodeToUs(j8));
                return;
            case ID_PIXEL_HEIGHT /* 186 */:
                getCurrentTrack(i8).height = (int) j8;
                return;
            case ID_TRACK_NUMBER /* 215 */:
                getCurrentTrack(i8).number = (int) j8;
                return;
            case ID_TIME_CODE /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j8);
                return;
            case ID_BLOCK_ADD_ID /* 238 */:
                this.blockAdditionalId = (int) j8;
                return;
            case 241:
                if (this.seenClusterPositionForCurrentCuePoint) {
                    return;
                }
                assertInCues(i8);
                this.cueClusterPositions.add(j8);
                this.seenClusterPositionForCurrentCuePoint = true;
                return;
            case ID_REFERENCE_BLOCK /* 251 */:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i8).blockAddIdType = (int) j8;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j8 == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j8 + " not supported", null);
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j8 < 1 || j8 > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j8 + " not supported", null);
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j8 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j8 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j8 == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j8 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j8 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j8 + " not supported", null);
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j8 + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i9 = (int) j8;
                assertInTrackEntry(i8);
                if (i9 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i9 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i9 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i9 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                getCurrentTrack(i8).displayWidth = (int) j8;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                getCurrentTrack(i8).displayUnit = (int) j8;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                getCurrentTrack(i8).displayHeight = (int) j8;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                getCurrentTrack(i8).flagForced = j8 == 1;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                getCurrentTrack(i8).maxBlockAdditionId = (int) j8;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i8).codecDelayNs = j8;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i8).seekPreRollNs = j8;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                getCurrentTrack(i8).audioBitDepth = (int) j8;
                return;
            case ID_DISCARD_PADDING /* 30114 */:
                this.blockGroupDiscardPaddingNs = j8;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                assertInTrackEntry(i8);
                int i10 = (int) j8;
                if (i10 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i10 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i10 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                getCurrentTrack(i8).defaultSampleDurationNs = (int) j8;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j8;
                return;
            default:
                switch (i8) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        assertInTrackEntry(i8);
                        int i11 = (int) j8;
                        if (i11 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i11 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        assertInTrackEntry(i8);
                        int isoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j8);
                        if (isoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.colorTransfer = isoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        assertInTrackEntry(i8);
                        this.currentTrack.hasColorInfo = true;
                        int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j8);
                        if (isoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.colorSpace = isoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case ID_MAX_CLL /* 21948 */:
                        getCurrentTrack(i8).maxContentLuminance = (int) j8;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        getCurrentTrack(i8).maxFrameAverageLuminance = (int) j8;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    protected boolean isLevel1Element(int i8) {
        return i8 == 357149030 || i8 == ID_CLUSTER || i8 == ID_CUES || i8 == ID_TRACKS;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        this.haveOutputSample = false;
        boolean z7 = true;
        while (z7 && !this.haveOutputSample) {
            z7 = this.reader.read(extractorInput);
            if (z7 && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z7) {
            return 0;
        }
        for (int i8 = 0; i8 < this.tracks.size(); i8++) {
            Track valueAt = this.tracks.valueAt(i8);
            valueAt.assertOutputInitialized();
            valueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    @CallSuper
    public void seek(long j8, long j9) {
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i8 = 0; i8 < this.tracks.size(); i8++) {
            this.tracks.valueAt(i8).reset();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        return new Sniffer().sniff(extractorInput);
    }

    @CallSuper
    protected void startMasterElement(int i8, long j8, long j9) {
        assertInitialized();
        if (i8 == 160) {
            this.blockHasReferenceBlock = false;
            this.blockGroupDiscardPaddingNs = 0L;
            return;
        }
        if (i8 == ID_TRACK_ENTRY) {
            this.currentTrack = new Track();
            return;
        }
        if (i8 == ID_CUE_POINT) {
            this.seenClusterPositionForCurrentCuePoint = false;
            return;
        }
        if (i8 == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i8 == ID_CONTENT_ENCRYPTION) {
            getCurrentTrack(i8).hasContentEncryption = true;
            return;
        }
        if (i8 == ID_MASTERING_METADATA) {
            getCurrentTrack(i8).hasColorInfo = true;
            return;
        }
        if (i8 == ID_SEGMENT) {
            long j10 = this.segmentContentPosition;
            if (j10 != -1 && j10 != j8) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.segmentContentPosition = j8;
            this.segmentContentSize = j9;
            return;
        }
        if (i8 == ID_CUES) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i8 == ID_CLUSTER && !this.sentSeekMap) {
            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                this.seekForCues = true;
            } else {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
            }
        }
    }

    @CallSuper
    protected void stringElement(int i8, String str) {
        if (i8 == 134) {
            getCurrentTrack(i8).codecId = str;
            return;
        }
        if (i8 != 17026) {
            if (i8 == ID_NAME) {
                getCurrentTrack(i8).name = str;
                return;
            } else {
                if (i8 != ID_LANGUAGE) {
                    return;
                }
                getCurrentTrack(i8).language = str;
                return;
            }
        }
        if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
            return;
        }
        throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    public MatroskaExtractor(int i8) {
        this(new DefaultEbmlReader(), i8);
    }

    MatroskaExtractor(EbmlReader ebmlReader, int i8) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C.TIME_UNSET;
        this.durationTimecode = C.TIME_UNSET;
        this.durationUs = C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.seekForCuesEnabled = (i8 & 1) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }
}
