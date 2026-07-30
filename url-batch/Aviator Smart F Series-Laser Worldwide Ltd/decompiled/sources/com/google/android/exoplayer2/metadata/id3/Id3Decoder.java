package com.google.android.exoplayer2.metadata.id3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

@Deprecated
/* loaded from: classes3.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: com.google.android.exoplayer2.metadata.id3.a
        @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i8, int i9, int i10, int i11, int i12) {
            boolean lambda$static$0;
            lambda$static$0 = Id3Decoder.lambda$static$0(i8, i9, i10, i11, i12);
            return lambda$static$0;
        }
    };
    private static final String TAG = "Id3Decoder";

    @Nullable
    private final FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i8, int i9, int i10, int i11, int i12);
    }

    private static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i8, boolean z7, int i9) {
            this.majorVersion = i8;
            this.isUnsynchronized = z7;
            this.framesSize = i9;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i8, int i9) {
        return i9 <= i8 ? Util.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(bArr, i8, i9);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i8, int i9) {
        int indexOfZeroByte;
        String str;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        int i10 = i8 - 1;
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        if (i9 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, Charsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = MimeTypes.IMAGE_JPEG;
            }
            indexOfZeroByte = 2;
        } else {
            indexOfZeroByte = indexOfZeroByte(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, indexOfZeroByte, Charsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i11 = bArr[indexOfZeroByte + 1] & 255;
        int i12 = indexOfZeroByte + 2;
        int indexOfTerminator = indexOfTerminator(bArr, i12, readUnsignedByte);
        return new ApicFrame(str, new String(bArr, i12, indexOfTerminator - i12, charset), i11, copyOfRangeIfValid(bArr, indexOfTerminator + delimiterLength(readUnsignedByte), i10));
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i8, String str) {
        byte[] bArr = new byte[i8];
        parsableByteArray.readBytes(bArr, 0, i8);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i8, int i9, boolean z7, int i10, @Nullable FramePredicate framePredicate) {
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, indexOfZeroByte - position, Charsets.ISO_8859_1);
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long j8 = readUnsignedInt == com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 ? -1L : readUnsignedInt;
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        long j9 = readUnsignedInt2 == com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 ? -1L : readUnsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i11 = position + i8;
        while (parsableByteArray.getPosition() < i11) {
            Id3Frame decodeFrame = decodeFrame(i9, parsableByteArray, z7, i10, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new ChapterFrame(str, readInt, readInt2, j8, j9, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i8, int i9, boolean z7, int i10, @Nullable FramePredicate framePredicate) {
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, indexOfZeroByte - position, Charsets.ISO_8859_1);
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        boolean z8 = (readUnsignedByte & 2) != 0;
        boolean z9 = (readUnsignedByte & 1) != 0;
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[readUnsignedByte2];
        for (int i11 = 0; i11 < readUnsignedByte2; i11++) {
            int position2 = parsableByteArray.getPosition();
            int indexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i11] = new String(parsableByteArray.getData(), position2, indexOfZeroByte2 - position2, Charsets.ISO_8859_1);
            parsableByteArray.setPosition(indexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i12 = position + i8;
        while (parsableByteArray.getPosition() < i12) {
            Id3Frame decodeFrame = decodeFrame(i9, parsableByteArray, z7, i10, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new ChapterTocFrame(str, z8, z9, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i8) {
        if (i8 < 4) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i9 = i8 - 4;
        byte[] bArr2 = new byte[i9];
        parsableByteArray.readBytes(bArr2, 0, i9);
        int indexOfTerminator = indexOfTerminator(bArr2, 0, readUnsignedByte);
        String str2 = new String(bArr2, 0, indexOfTerminator, charset);
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, delimiterLength, indexOfTerminator(bArr2, delimiterLength, readUnsignedByte), charset));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0190, code lost:
    
        if (r13 == 67) goto L132;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Id3Frame decodeFrame(int i8, ParsableByteArray parsableByteArray, boolean z7, int i9, @Nullable FramePredicate framePredicate) {
        int readUnsignedIntToInt;
        String str;
        int i10;
        int i11;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Id3Frame decodeCommentFrame;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
        int readUnsignedByte4 = i8 >= 3 ? parsableByteArray.readUnsignedByte() : 0;
        if (i8 == 4) {
            readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (!z7) {
                readUnsignedIntToInt = (((readUnsignedIntToInt >> 24) & 255) << 21) | (readUnsignedIntToInt & 255) | (((readUnsignedIntToInt >> 8) & 255) << 7) | (((readUnsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            readUnsignedIntToInt = i8 == 3 ? parsableByteArray.readUnsignedIntToInt() : parsableByteArray.readUnsignedInt24();
        }
        int i12 = readUnsignedIntToInt;
        int readUnsignedShort = i8 >= 3 ? parsableByteArray.readUnsignedShort() : 0;
        if (readUnsignedByte == 0 && readUnsignedByte2 == 0 && readUnsignedByte3 == 0 && readUnsignedByte4 == 0 && i12 == 0 && readUnsignedShort == 0) {
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        int position = parsableByteArray.getPosition() + i12;
        if (position > parsableByteArray.limit()) {
            Log.w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        if (framePredicate != null) {
            str = TAG;
            i10 = position;
            i11 = readUnsignedShort;
            if (!framePredicate.evaluate(i8, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4)) {
                parsableByteArray.setPosition(i10);
                return null;
            }
        } else {
            str = TAG;
            i10 = position;
            i11 = readUnsignedShort;
        }
        if (i8 == 3) {
            int i13 = i11;
            z9 = (i13 & 128) != 0;
            z10 = (i13 & 64) != 0;
            z8 = (i13 & 32) != 0;
            z12 = z9;
            z11 = false;
        } else {
            int i14 = i11;
            if (i8 == 4) {
                boolean z13 = (i14 & 64) != 0;
                boolean z14 = (i14 & 8) != 0;
                boolean z15 = (i14 & 4) != 0;
                z11 = (i14 & 2) != 0;
                boolean z16 = (i14 & 1) != 0;
                z8 = z13;
                z9 = z16;
                z12 = z14;
                z10 = z15;
            } else {
                z8 = false;
                z9 = false;
                z10 = false;
                z11 = false;
                z12 = false;
            }
        }
        if (z12 || z10) {
            Log.w(str, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.setPosition(i10);
            return null;
        }
        if (z8) {
            i12--;
            parsableByteArray.skipBytes(1);
        }
        if (z9) {
            i12 -= 4;
            parsableByteArray.skipBytes(4);
        }
        if (z11) {
            i12 = removeUnsynchronization(parsableByteArray, i12);
        }
        try {
            if (readUnsignedByte == 84 && readUnsignedByte2 == 88 && readUnsignedByte3 == 88 && (i8 == 2 || readUnsignedByte4 == 88)) {
                decodeCommentFrame = decodeTxxxFrame(parsableByteArray, i12);
            } else if (readUnsignedByte == 84) {
                decodeCommentFrame = decodeTextInformationFrame(parsableByteArray, i12, getFrameId(i8, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4));
            } else if (readUnsignedByte == 87 && readUnsignedByte2 == 88 && readUnsignedByte3 == 88 && (i8 == 2 || readUnsignedByte4 == 88)) {
                decodeCommentFrame = decodeWxxxFrame(parsableByteArray, i12);
            } else if (readUnsignedByte == 87) {
                decodeCommentFrame = decodeUrlLinkFrame(parsableByteArray, i12, getFrameId(i8, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4));
            } else if (readUnsignedByte == 80 && readUnsignedByte2 == 82 && readUnsignedByte3 == 73 && readUnsignedByte4 == 86) {
                decodeCommentFrame = decodePrivFrame(parsableByteArray, i12);
            } else if (readUnsignedByte == 71 && readUnsignedByte2 == 69 && readUnsignedByte3 == 79 && (readUnsignedByte4 == 66 || i8 == 2)) {
                decodeCommentFrame = decodeGeobFrame(parsableByteArray, i12);
            } else if (i8 == 2) {
                if (readUnsignedByte == 80 && readUnsignedByte2 == 73 && readUnsignedByte3 == 67) {
                    decodeCommentFrame = decodeApicFrame(parsableByteArray, i12, i8);
                }
                decodeCommentFrame = (readUnsignedByte != 67 && readUnsignedByte2 == 79 && readUnsignedByte3 == 77 && (readUnsignedByte4 == 77 || i8 == 2)) ? decodeCommentFrame(parsableByteArray, i12) : (readUnsignedByte != 67 && readUnsignedByte2 == 72 && readUnsignedByte3 == 65 && readUnsignedByte4 == 80) ? decodeChapterFrame(parsableByteArray, i12, i8, z7, i9, framePredicate) : (readUnsignedByte != 67 && readUnsignedByte2 == 84 && readUnsignedByte3 == 79 && readUnsignedByte4 == 67) ? decodeChapterTOCFrame(parsableByteArray, i12, i8, z7, i9, framePredicate) : (readUnsignedByte != 77 && readUnsignedByte2 == 76 && readUnsignedByte3 == 76 && readUnsignedByte4 == 84) ? decodeMlltFrame(parsableByteArray, i12) : decodeBinaryFrame(parsableByteArray, i12, getFrameId(i8, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4));
            } else {
                if (readUnsignedByte == 65) {
                    if (readUnsignedByte2 == 80) {
                        if (readUnsignedByte3 == 73) {
                        }
                    }
                }
                if (readUnsignedByte != 67) {
                }
            }
            if (decodeCommentFrame == null) {
                Log.w(str, "Failed to decode frame: id=" + getFrameId(i8, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4) + ", frameSize=" + i12);
            }
            parsableByteArray.setPosition(i10);
            return decodeCommentFrame;
        } catch (Throwable th) {
            parsableByteArray.setPosition(i10);
            throw th;
        }
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i8) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        int i9 = i8 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, indexOfZeroByte, Charsets.ISO_8859_1);
        int i10 = indexOfZeroByte + 1;
        int indexOfTerminator = indexOfTerminator(bArr, i10, readUnsignedByte);
        String decodeStringIfValid = decodeStringIfValid(bArr, i10, indexOfTerminator, charset);
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        int indexOfTerminator2 = indexOfTerminator(bArr, delimiterLength, readUnsignedByte);
        return new GeobFrame(str, decodeStringIfValid, decodeStringIfValid(bArr, delimiterLength, indexOfTerminator2, charset), copyOfRangeIfValid(bArr, indexOfTerminator2 + delimiterLength(readUnsignedByte), i9));
    }

    @Nullable
    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        boolean z7 = false;
        if (readUnsignedInt24 != 4801587) {
            Log.w(TAG, "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(readUnsignedInt24)));
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
        if (readUnsignedByte == 2) {
            if ((readUnsignedByte2 & 64) != 0) {
                Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (readUnsignedByte == 3) {
            if ((readUnsignedByte2 & 64) != 0) {
                int readInt = parsableByteArray.readInt();
                parsableByteArray.skipBytes(readInt);
                readSynchSafeInt -= readInt + 4;
            }
        } else {
            if (readUnsignedByte != 4) {
                Log.w(TAG, "Skipped ID3 tag with unsupported majorVersion=" + readUnsignedByte);
                return null;
            }
            if ((readUnsignedByte2 & 64) != 0) {
                int readSynchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(readSynchSafeInt2 - 4);
                readSynchSafeInt -= readSynchSafeInt2;
            }
            if ((readUnsignedByte2 & 16) != 0) {
                readSynchSafeInt -= 10;
            }
        }
        if (readUnsignedByte < 4 && (readUnsignedByte2 & 128) != 0) {
            z7 = true;
        }
        return new Id3Header(readUnsignedByte, z7, readSynchSafeInt);
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i8) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        int readUnsignedInt242 = parsableByteArray.readUnsignedInt24();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i9 = ((i8 - 10) * 8) / (readUnsignedByte + readUnsignedByte2);
        int[] iArr = new int[i9];
        int[] iArr2 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int readBits = parsableBitArray.readBits(readUnsignedByte);
            int readBits2 = parsableBitArray.readBits(readUnsignedByte2);
            iArr[i10] = readBits;
            iArr2[i10] = readBits2;
        }
        return new MlltFrame(readUnsignedShort, readUnsignedInt24, readUnsignedInt242, iArr, iArr2);
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i8) {
        byte[] bArr = new byte[i8];
        parsableByteArray.readBytes(bArr, 0, i8);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, indexOfZeroByte, Charsets.ISO_8859_1), copyOfRangeIfValid(bArr, indexOfZeroByte + 1, i8));
    }

    private static String decodeStringIfValid(byte[] bArr, int i8, int i9, Charset charset) {
        return (i9 <= i8 || i9 > bArr.length) ? "" : new String(bArr, i8, i9 - i8, charset);
    }

    @Nullable
    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i8, String str) {
        if (i8 < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = i8 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        return new TextInformationFrame(str, (String) null, decodeTextInformationFrameValues(bArr, readUnsignedByte, 0));
    }

    private static ImmutableList<String> decodeTextInformationFrameValues(byte[] bArr, int i8, int i9) {
        if (i9 >= bArr.length) {
            return ImmutableList.of("");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int indexOfTerminator = indexOfTerminator(bArr, i9, i8);
        while (i9 < indexOfTerminator) {
            builder.add((ImmutableList.Builder) new String(bArr, i9, indexOfTerminator - i9, getCharset(i8)));
            i9 = delimiterLength(i8) + indexOfTerminator;
            indexOfTerminator = indexOfTerminator(bArr, i9, i8);
        }
        ImmutableList<String> build = builder.build();
        return build.isEmpty() ? ImmutableList.of("") : build;
    }

    @Nullable
    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i8) {
        if (i8 < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = i8 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int indexOfTerminator = indexOfTerminator(bArr, 0, readUnsignedByte);
        return new TextInformationFrame("TXXX", new String(bArr, 0, indexOfTerminator, getCharset(readUnsignedByte)), decodeTextInformationFrameValues(bArr, readUnsignedByte, indexOfTerminator + delimiterLength(readUnsignedByte)));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i8, String str) {
        byte[] bArr = new byte[i8];
        parsableByteArray.readBytes(bArr, 0, i8);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), Charsets.ISO_8859_1));
    }

    @Nullable
    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i8) {
        if (i8 < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = i8 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int indexOfTerminator = indexOfTerminator(bArr, 0, readUnsignedByte);
        String str = new String(bArr, 0, indexOfTerminator, getCharset(readUnsignedByte));
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, delimiterLength, indexOfZeroByte(bArr, delimiterLength), Charsets.ISO_8859_1));
    }

    private static int delimiterLength(int i8) {
        return (i8 == 0 || i8 == 3) ? 1 : 2;
    }

    private static Charset getCharset(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? Charsets.ISO_8859_1 : Charsets.UTF_8 : Charsets.UTF_16BE : Charsets.UTF_16;
    }

    private static String getFrameId(int i8, int i9, int i10, int i11, int i12) {
        return i8 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private static int indexOfTerminator(byte[] bArr, int i8, int i9) {
        int indexOfZeroByte = indexOfZeroByte(bArr, i8);
        if (i9 == 0 || i9 == 3) {
            return indexOfZeroByte;
        }
        while (indexOfZeroByte < bArr.length - 1) {
            if ((indexOfZeroByte - i8) % 2 == 0 && bArr[indexOfZeroByte + 1] == 0) {
                return indexOfZeroByte;
            }
            indexOfZeroByte = indexOfZeroByte(bArr, indexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i8) {
        while (i8 < bArr.length) {
            if (bArr[i8] == 0) {
                return i8;
            }
            i8++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(int i8, int i9, int i10, int i11, int i12) {
        return false;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i8) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i9 = position;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= position + i8) {
                return i8;
            }
            if ((data[i9] & 255) == 255 && data[i10] == 0) {
                System.arraycopy(data, i9 + 2, data, i10, (i8 - (i9 - position)) - 2);
                i8--;
            }
            i9 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i8, int i9, boolean z7) {
        int readUnsignedInt24;
        long readUnsignedInt242;
        int i10;
        int i11;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z8 = true;
                if (parsableByteArray.bytesLeft() < i9) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i8 >= 3) {
                    readUnsignedInt24 = parsableByteArray.readInt();
                    readUnsignedInt242 = parsableByteArray.readUnsignedInt();
                    i10 = parsableByteArray.readUnsignedShort();
                } else {
                    readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
                    readUnsignedInt242 = parsableByteArray.readUnsignedInt24();
                    i10 = 0;
                }
                if (readUnsignedInt24 == 0 && readUnsignedInt242 == 0 && i10 == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i8 == 4 && !z7) {
                    if ((8421504 & readUnsignedInt242) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    readUnsignedInt242 = (((readUnsignedInt242 >> 24) & 255) << 21) | (readUnsignedInt242 & 255) | (((readUnsignedInt242 >> 8) & 255) << 7) | (((readUnsignedInt242 >> 16) & 255) << 14);
                }
                if (i8 == 4) {
                    i11 = (i10 & 64) != 0 ? 1 : 0;
                } else {
                    if (i8 == 3) {
                        i11 = (i10 & 32) != 0 ? 1 : 0;
                    } else {
                        i11 = 0;
                    }
                    z8 = false;
                    if (z8) {
                        i11 += 4;
                    }
                    if (readUnsignedInt242 < i11) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    if (parsableByteArray.bytesLeft() < readUnsignedInt242) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    parsableByteArray.skipBytes((int) readUnsignedInt242);
                }
            } catch (Throwable th) {
                parsableByteArray.setPosition(position);
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    @Nullable
    protected Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Id3Decoder(@Nullable FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    @Nullable
    public Metadata decode(byte[] bArr, int i8) {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i8);
        Id3Header decodeHeader = decodeHeader(parsableByteArray);
        if (decodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i9 = decodeHeader.majorVersion == 2 ? 6 : 10;
        int i10 = decodeHeader.framesSize;
        if (decodeHeader.isUnsynchronized) {
            i10 = removeUnsynchronization(parsableByteArray, decodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + i10);
        boolean z7 = false;
        if (!validateFrames(parsableByteArray, decodeHeader.majorVersion, i9, false)) {
            if (decodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i9, true)) {
                Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + decodeHeader.majorVersion);
                return null;
            }
            z7 = true;
        }
        while (parsableByteArray.bytesLeft() >= i9) {
            Id3Frame decodeFrame = decodeFrame(decodeHeader.majorVersion, parsableByteArray, z7, i9, this.framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new Metadata(arrayList);
    }
}
