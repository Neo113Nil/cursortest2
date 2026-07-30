package cn.hutool.core.io;

import cn.hutool.core.util.g0;
import cn.hutool.core.util.g1;
import com.crrepa.ble.nrf.dfu.DfuBaseService;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.MimeTypes;
import com.moyoung.dafit.module.common.utils.u;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public abstract class FileMagicNumber {
    private static final /* synthetic */ FileMagicNumber[] $VALUES;
    public static final FileMagicNumber AAC;
    public static final FileMagicNumber AC3;
    public static final FileMagicNumber AIFF;
    public static final FileMagicNumber AMR;
    public static final FileMagicNumber APNG;
    public static final FileMagicNumber AR;
    public static final FileMagicNumber AVI;
    public static final FileMagicNumber BMP;
    public static final FileMagicNumber BR;
    public static final FileMagicNumber BZ2;
    public static final FileMagicNumber CAB;
    public static final FileMagicNumber CHM;
    public static final FileMagicNumber CLASS;
    public static final FileMagicNumber CRX;
    public static final FileMagicNumber DBX;
    public static final FileMagicNumber DCM;
    public static final FileMagicNumber DEB;
    public static final FileMagicNumber DEX;
    public static final FileMagicNumber DEY;
    public static final FileMagicNumber DOC;
    public static final FileMagicNumber DOCX;
    public static final FileMagicNumber DWG;
    public static final FileMagicNumber ELF;
    public static final FileMagicNumber EML;
    public static final FileMagicNumber EPUB;
    public static final FileMagicNumber EXE;
    public static final FileMagicNumber FLAC;
    public static final FileMagicNumber FLV;
    public static final FileMagicNumber GIF;
    public static final FileMagicNumber GZ;
    public static final FileMagicNumber ICO;
    public static final FileMagicNumber JPEG;
    public static final FileMagicNumber JXR;
    public static final FileMagicNumber LZ;
    public static final FileMagicNumber LZ4;
    public static final FileMagicNumber LZOP;
    public static final FileMagicNumber M3GP;
    public static final FileMagicNumber M4A;
    public static final FileMagicNumber M4V;
    public static final FileMagicNumber MDB;
    public static final FileMagicNumber MIDI;
    public static final FileMagicNumber MKV;
    public static final FileMagicNumber MOV;
    public static final FileMagicNumber MP3;
    public static final FileMagicNumber MP4;
    public static final FileMagicNumber MPEG;
    public static final FileMagicNumber NES;
    public static final FileMagicNumber OGG;
    public static final FileMagicNumber OTF;
    public static final FileMagicNumber PDF;
    public static final FileMagicNumber PNG;
    public static final FileMagicNumber PPT;
    public static final FileMagicNumber PPTX;
    public static final FileMagicNumber PS;
    public static final FileMagicNumber PSD;
    public static final FileMagicNumber PST;
    public static final FileMagicNumber RAM;
    public static final FileMagicNumber RAR;
    public static final FileMagicNumber RMVB;
    public static final FileMagicNumber RPM;
    public static final FileMagicNumber RTF;
    public static final FileMagicNumber SQLITE;
    public static final FileMagicNumber SWF;
    public static final FileMagicNumber SevenZ;
    public static final FileMagicNumber TAR;
    public static final FileMagicNumber TIFF;
    public static final FileMagicNumber TORRENT;
    public static final FileMagicNumber TTF;
    public static final FileMagicNumber UNKNOWN;
    public static final FileMagicNumber WASM;
    public static final FileMagicNumber WAV;
    public static final FileMagicNumber WEBM;
    public static final FileMagicNumber WEBP;
    public static final FileMagicNumber WMV;
    public static final FileMagicNumber WOFF;
    public static final FileMagicNumber WOFF2;
    public static final FileMagicNumber WPD;
    public static final FileMagicNumber XCF;
    public static final FileMagicNumber XLS;
    public static final FileMagicNumber XLSX;
    public static final FileMagicNumber XZ;
    public static final FileMagicNumber ZIP;
    public static final FileMagicNumber ZSTD;
    private final String extension;
    private final String mimeType;

    static {
        String str = null;
        FileMagicNumber fileMagicNumber = new FileMagicNumber("UNKNOWN", 0, str, str) { // from class: cn.hutool.core.io.FileMagicNumber.1
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return false;
            }
        };
        UNKNOWN = fileMagicNumber;
        FileMagicNumber fileMagicNumber2 = new FileMagicNumber("JPEG", 1, MimeTypes.IMAGE_JPEG, "jpg") { // from class: cn.hutool.core.io.FileMagicNumber.2
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 2 && Objects.equals(Byte.valueOf(bArr[0]), (byte) -1) && Objects.equals(Byte.valueOf(bArr[1]), (byte) -40) && Objects.equals(Byte.valueOf(bArr[2]), (byte) -1);
            }
        };
        JPEG = fileMagicNumber2;
        FileMagicNumber fileMagicNumber3 = new FileMagicNumber("JXR", 2, "image/vnd.ms-photo", "jxr") { // from class: cn.hutool.core.io.FileMagicNumber.3
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 2 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f32e2));
            }
        };
        JXR = fileMagicNumber3;
        FileMagicNumber fileMagicNumber4 = new FileMagicNumber("APNG", 3, "image/apng", "apng") { // from class: cn.hutool.core.io.FileMagicNumber.4
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                int i8 = 8;
                if (bArr.length > 8 && Objects.equals(Byte.valueOf(bArr[0]), (byte) -119) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 80) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 78) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 71) && Objects.equals(Byte.valueOf(bArr[4]), (byte) 13) && Objects.equals(Byte.valueOf(bArr[5]), (byte) 10) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 26) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 10)) {
                    while (i8 < bArr.length) {
                        try {
                            int i9 = i8 + 4;
                            int intValue = new BigInteger(1, Arrays.copyOfRange(bArr, i8, i9)).intValue();
                            int i10 = i8 + 8;
                            String str2 = new String(Arrays.copyOfRange(bArr, i9, i10));
                            if (str2.equals("IDAT") || str2.equals("IEND")) {
                                break;
                            }
                            if (str2.equals("acTL")) {
                                return true;
                            }
                            i8 = i10 + intValue + 4;
                        } catch (Exception unused) {
                        }
                    }
                }
                return false;
            }
        };
        APNG = fileMagicNumber4;
        FileMagicNumber fileMagicNumber5 = new FileMagicNumber("PNG", 4, MimeTypes.IMAGE_PNG, "png") { // from class: cn.hutool.core.io.FileMagicNumber.5
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) -119) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 80) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 78) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 71);
            }
        };
        PNG = fileMagicNumber5;
        FileMagicNumber fileMagicNumber6 = new FileMagicNumber("GIF", 5, "image/gif", "gif") { // from class: cn.hutool.core.io.FileMagicNumber.6
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 2 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 71) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 70);
            }
        };
        GIF = fileMagicNumber6;
        FileMagicNumber fileMagicNumber7 = new FileMagicNumber("BMP", 6, "image/bmp", "bmp") { // from class: cn.hutool.core.io.FileMagicNumber.7
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 1 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 66) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 77);
            }
        };
        BMP = fileMagicNumber7;
        FileMagicNumber fileMagicNumber8 = new FileMagicNumber("TIFF", 7, "image/tiff", "tiff") { // from class: cn.hutool.core.io.FileMagicNumber.8
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 4) {
                    return false;
                }
                return (Objects.equals(Byte.valueOf(bArr[0]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f66n0)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 0)) || (Objects.equals(Byte.valueOf(bArr[0]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.f66n0)));
            }
        };
        TIFF = fileMagicNumber8;
        FileMagicNumber fileMagicNumber9 = new FileMagicNumber("DWG", 8, "image/vnd.dwg", "dwg") { // from class: cn.hutool.core.io.FileMagicNumber.9
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 10 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.I0)) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 67) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 49) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 48);
            }
        };
        DWG = fileMagicNumber9;
        FileMagicNumber fileMagicNumber10 = new FileMagicNumber("WEBP", 9, MimeTypes.IMAGE_WEBP, "webp") { // from class: cn.hutool.core.io.FileMagicNumber.10
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 11 && Objects.equals(Byte.valueOf(bArr[8]), Byte.valueOf(a4.a.R0)) && Objects.equals(Byte.valueOf(bArr[9]), Byte.valueOf(a4.a.M0)) && Objects.equals(Byte.valueOf(bArr[10]), (byte) 66) && Objects.equals(Byte.valueOf(bArr[11]), (byte) 80);
            }
        };
        WEBP = fileMagicNumber10;
        FileMagicNumber fileMagicNumber11 = new FileMagicNumber("PSD", 10, "image/vnd.adobe.photoshop", "psd") { // from class: cn.hutool.core.io.FileMagicNumber.11
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 56) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 66) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 80) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.P0));
            }
        };
        PSD = fileMagicNumber11;
        FileMagicNumber fileMagicNumber12 = new FileMagicNumber("ICO", 11, "image/x-icon", "ico") { // from class: cn.hutool.core.io.FileMagicNumber.12
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 1) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 0);
            }
        };
        ICO = fileMagicNumber12;
        FileMagicNumber fileMagicNumber13 = new FileMagicNumber("XCF", 12, "image/x-xcf", "xcf") { // from class: cn.hutool.core.io.FileMagicNumber.13
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 9 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.f27d1)) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f51j1)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[4]), (byte) 32) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f82s1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.Z0)) && Objects.equals(Byte.valueOf(bArr[7]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[8]), (byte) 32) && Objects.equals(Byte.valueOf(bArr[9]), (byte) 118);
            }
        };
        XCF = fileMagicNumber13;
        FileMagicNumber fileMagicNumber14 = new FileMagicNumber("WAV", 13, "audio/x-wav", "wav") { // from class: cn.hutool.core.io.FileMagicNumber.14
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 11 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.O0)) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 70) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 70) && Objects.equals(Byte.valueOf(bArr[8]), Byte.valueOf(a4.a.R0)) && Objects.equals(Byte.valueOf(bArr[9]), Byte.valueOf(a4.a.I0)) && Objects.equals(Byte.valueOf(bArr[10]), (byte) 86) && Objects.equals(Byte.valueOf(bArr[11]), Byte.valueOf(a4.a.M0));
            }
        };
        WAV = fileMagicNumber14;
        FileMagicNumber fileMagicNumber15 = new FileMagicNumber("MIDI", 14, MimeTypes.AUDIO_MIDI, "midi") { // from class: cn.hutool.core.io.FileMagicNumber.15
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.Q0)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f31e1)) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.f15a1));
            }
        };
        MIDI = fileMagicNumber15;
        FileMagicNumber fileMagicNumber16 = new FileMagicNumber("MP3", 15, MimeTypes.AUDIO_MPEG, "mp3") { // from class: cn.hutool.core.io.FileMagicNumber.16
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 2) {
                    return false;
                }
                return (Objects.equals(Byte.valueOf(bArr[0]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.L0)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 51)) || (Objects.equals(Byte.valueOf(bArr[0]), (byte) -1) && Objects.equals(Byte.valueOf(bArr[1]), (byte) -5)) || (Objects.equals(Byte.valueOf(bArr[0]), (byte) -1) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f48i2))) || (Objects.equals(Byte.valueOf(bArr[0]), (byte) -1) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f44h2)));
            }
        };
        MP3 = fileMagicNumber16;
        FileMagicNumber fileMagicNumber17 = new FileMagicNumber("OGG", 16, MimeTypes.AUDIO_OGG, "ogg") { // from class: cn.hutool.core.io.FileMagicNumber.17
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 79) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f27d1)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f27d1)) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.P0));
            }
        };
        OGG = fileMagicNumber17;
        FileMagicNumber fileMagicNumber18 = new FileMagicNumber("FLAC", 17, "audio/x-flac", "flac") { // from class: cn.hutool.core.io.FileMagicNumber.18
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 76) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 67);
            }
        };
        FLAC = fileMagicNumber18;
        FileMagicNumber fileMagicNumber19 = new FileMagicNumber("M4A", 18, MimeTypes.AUDIO_MP4, "m4a") { // from class: cn.hutool.core.io.FileMagicNumber.19
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                int length = bArr.length;
                Byte valueOf = Byte.valueOf(a4.a.I0);
                if (length > 10 && Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 121) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[8]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[9]), (byte) 52) && Objects.equals(Byte.valueOf(bArr[10]), valueOf)) {
                    return true;
                }
                return Objects.equals(Byte.valueOf(bArr[0]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 52) && Objects.equals(Byte.valueOf(bArr[2]), valueOf) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 32);
            }
        };
        M4A = fileMagicNumber19;
        FileMagicNumber fileMagicNumber20 = new FileMagicNumber("AAC", 19, "audio/aac", "aac") { // from class: cn.hutool.core.io.FileMagicNumber.20
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 1) {
                    return false;
                }
                return (Objects.equals(Byte.valueOf(bArr[0]), (byte) -1) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f40g2))) || (Objects.equals(Byte.valueOf(bArr[0]), (byte) -1) && Objects.equals(Byte.valueOf(bArr[1]), (byte) -7));
            }
        };
        AAC = fileMagicNumber20;
        FileMagicNumber fileMagicNumber21 = new FileMagicNumber(RtpPayloadFormat.RTP_MEDIA_AMR, 20, MimeTypes.AUDIO_AMR, "amr") { // from class: cn.hutool.core.io.FileMagicNumber.21
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 11) {
                    return false;
                }
                return (Objects.equals(Byte.valueOf(bArr[0]), (byte) 35) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 33) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.I0)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.O0)) && Objects.equals(Byte.valueOf(bArr[5]), (byte) 10)) || (Objects.equals(Byte.valueOf(bArr[0]), (byte) 35) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 33) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.I0)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.O0)) && Objects.equals(Byte.valueOf(bArr[5]), (byte) 95) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 67) && Objects.equals(Byte.valueOf(bArr[8]), (byte) 49) && Objects.equals(Byte.valueOf(bArr[9]), Byte.valueOf(a4.a.f78r0)) && Objects.equals(Byte.valueOf(bArr[10]), (byte) 48) && Objects.equals(Byte.valueOf(bArr[11]), (byte) 10));
            }
        };
        AMR = fileMagicNumber21;
        FileMagicNumber fileMagicNumber22 = new FileMagicNumber(RtpPayloadFormat.RTP_MEDIA_AC3, 21, MimeTypes.AUDIO_AC3, "ac3") { // from class: cn.hutool.core.io.FileMagicNumber.22
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 2 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 11) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f79r1));
            }
        };
        AC3 = fileMagicNumber22;
        FileMagicNumber fileMagicNumber23 = new FileMagicNumber("AIFF", 22, "audio/x-aiff", "aiff") { // from class: cn.hutool.core.io.FileMagicNumber.23
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 11 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 70) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 79) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.O0)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[8]), Byte.valueOf(a4.a.I0)) && Objects.equals(Byte.valueOf(bArr[9]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[10]), (byte) 70) && Objects.equals(Byte.valueOf(bArr[11]), (byte) 70);
            }
        };
        AIFF = fileMagicNumber23;
        FileMagicNumber fileMagicNumber24 = new FileMagicNumber("WOFF", 23, "font/woff", "woff") { // from class: cn.hutool.core.io.FileMagicNumber.24
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 8) {
                    return false;
                }
                boolean z7 = Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.f79r1)) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 79) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 70) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 70);
                boolean z8 = Objects.equals(Byte.valueOf(bArr[4]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[5]), (byte) 1) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 0);
                boolean z9 = Objects.equals(Byte.valueOf(bArr[4]), (byte) 79) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.Q0)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.Q0)) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 79);
                boolean z10 = Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f67n1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.f76q1)) && Objects.equals(Byte.valueOf(bArr[7]), Byte.valueOf(a4.a.f19b1));
                if (z7) {
                    return z8 || z9 || z10;
                }
                return false;
            }
        };
        WOFF = fileMagicNumber24;
        FileMagicNumber fileMagicNumber25 = new FileMagicNumber("WOFF2", 24, "font/woff2", "woff2") { // from class: cn.hutool.core.io.FileMagicNumber.25
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 8) {
                    return false;
                }
                boolean z7 = Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.f79r1)) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 79) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 70) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 50);
                boolean z8 = Objects.equals(Byte.valueOf(bArr[4]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[5]), (byte) 1) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 0);
                boolean z9 = Objects.equals(Byte.valueOf(bArr[4]), (byte) 79) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.Q0)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.Q0)) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 79);
                boolean z10 = Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f67n1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.f76q1)) && Objects.equals(Byte.valueOf(bArr[7]), Byte.valueOf(a4.a.f19b1));
                if (z7) {
                    return z8 || z9 || z10;
                }
                return false;
            }
        };
        WOFF2 = fileMagicNumber25;
        FileMagicNumber fileMagicNumber26 = new FileMagicNumber("TTF", 25, "font/ttf", "ttf") { // from class: cn.hutool.core.io.FileMagicNumber.26
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 1) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[4]), (byte) 0);
            }
        };
        TTF = fileMagicNumber26;
        FileMagicNumber fileMagicNumber27 = new FileMagicNumber("OTF", 26, "font/otf", "otf") { // from class: cn.hutool.core.io.FileMagicNumber.27
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 79) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.Q0)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.Q0)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 79) && Objects.equals(Byte.valueOf(bArr[4]), (byte) 0);
            }
        };
        OTF = fileMagicNumber27;
        FileMagicNumber fileMagicNumber28 = new FileMagicNumber("EPUB", 27, "application/epub+zip", "epub") { // from class: cn.hutool.core.io.FileMagicNumber.28
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 58 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 80) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 75) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 3) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 4) && Objects.equals(Byte.valueOf(bArr[30]), Byte.valueOf(a4.a.f51j1)) && Objects.equals(Byte.valueOf(bArr[31]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[32]), Byte.valueOf(a4.a.f51j1)) && Objects.equals(Byte.valueOf(bArr[33]), Byte.valueOf(a4.a.f19b1)) && Objects.equals(Byte.valueOf(bArr[34]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[35]), (byte) 121) && Objects.equals(Byte.valueOf(bArr[36]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[37]), Byte.valueOf(a4.a.f19b1)) && Objects.equals(Byte.valueOf(bArr[38]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[39]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[40]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[41]), Byte.valueOf(a4.a.f47i1)) && Objects.equals(Byte.valueOf(bArr[42]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[43]), Byte.valueOf(a4.a.Z0)) && Objects.equals(Byte.valueOf(bArr[44]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[45]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[46]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[47]), Byte.valueOf(a4.a.f59l1)) && Objects.equals(Byte.valueOf(bArr[48]), Byte.valueOf(a4.a.f55k1)) && Objects.equals(Byte.valueOf(bArr[49]), (byte) 47) && Objects.equals(Byte.valueOf(bArr[50]), Byte.valueOf(a4.a.f19b1)) && Objects.equals(Byte.valueOf(bArr[51]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[52]), Byte.valueOf(a4.a.f76q1)) && Objects.equals(Byte.valueOf(bArr[53]), Byte.valueOf(a4.a.Y0)) && Objects.equals(Byte.valueOf(bArr[54]), (byte) 43) && Objects.equals(Byte.valueOf(bArr[55]), (byte) 122) && Objects.equals(Byte.valueOf(bArr[56]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[57]), (byte) 112);
            }
        };
        EPUB = fileMagicNumber28;
        FileMagicNumber fileMagicNumber29 = new FileMagicNumber("ZIP", 28, DfuBaseService.MIME_TYPE_ZIP, g1.URL_PROTOCOL_ZIP) { // from class: cn.hutool.core.io.FileMagicNumber.29
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 4) {
                    return false;
                }
                return (Objects.equals(Byte.valueOf(bArr[0]), (byte) 80) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 75)) && (Objects.equals(Byte.valueOf(bArr[2]), (byte) 3) || Objects.equals(Byte.valueOf(bArr[2]), (byte) 5) || Objects.equals(Byte.valueOf(bArr[2]), (byte) 7)) && (Objects.equals(Byte.valueOf(bArr[3]), (byte) 4) || Objects.equals(Byte.valueOf(bArr[3]), (byte) 6) || Objects.equals(Byte.valueOf(bArr[3]), (byte) 8));
            }
        };
        ZIP = fileMagicNumber29;
        FileMagicNumber fileMagicNumber30 = new FileMagicNumber("TAR", 29, "application/x-tar", "tar") { // from class: cn.hutool.core.io.FileMagicNumber.30
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 261 && Objects.equals(Byte.valueOf(bArr[257]), Byte.valueOf(a4.a.f76q1)) && Objects.equals(Byte.valueOf(bArr[258]), Byte.valueOf(a4.a.f70o1)) && Objects.equals(Byte.valueOf(bArr[259]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[260]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[261]), Byte.valueOf(a4.a.f67n1));
            }
        };
        TAR = fileMagicNumber30;
        FileMagicNumber fileMagicNumber31 = new FileMagicNumber("RAR", 30, "application/x-rar-compressed", "rar") { // from class: cn.hutool.core.io.FileMagicNumber.31
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length > 6 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.O0)) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f67n1)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 33) && Objects.equals(Byte.valueOf(bArr[4]), (byte) 26) && Objects.equals(Byte.valueOf(bArr[5]), (byte) 7)) {
                    return Objects.equals(Byte.valueOf(bArr[6]), (byte) 0) || Objects.equals(Byte.valueOf(bArr[6]), (byte) 1);
                }
                return false;
            }
        };
        RAR = fileMagicNumber31;
        FileMagicNumber fileMagicNumber32 = new FileMagicNumber("GZ", 31, "application/gzip", "gz") { // from class: cn.hutool.core.io.FileMagicNumber.32
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 2 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 31) && Objects.equals(Byte.valueOf(bArr[1]), (byte) -117) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 8);
            }
        };
        GZ = fileMagicNumber32;
        FileMagicNumber fileMagicNumber33 = new FileMagicNumber("BZ2", 32, "application/x-bzip2", "bz2") { // from class: cn.hutool.core.io.FileMagicNumber.33
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 2 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 66) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.T0)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f31e1));
            }
        };
        BZ2 = fileMagicNumber33;
        FileMagicNumber fileMagicNumber34 = new FileMagicNumber("SevenZ", 33, "application/x-7z-compressed", "7z") { // from class: cn.hutool.core.io.FileMagicNumber.34
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 6 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 55) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 122) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f32e2)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) -81) && Objects.equals(Byte.valueOf(bArr[4]), (byte) 39) && Objects.equals(Byte.valueOf(bArr[5]), (byte) 28) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 0);
            }
        };
        SevenZ = fileMagicNumber34;
        FileMagicNumber fileMagicNumber35 = new FileMagicNumber("PDF", 34, "application/pdf", "pdf") { // from class: cn.hutool.core.io.FileMagicNumber.35
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) -17) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f28d2)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) -65)) {
                    bArr = Arrays.copyOfRange(bArr, 3, bArr.length);
                }
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 37) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 80) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.L0)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 70);
            }
        };
        PDF = fileMagicNumber35;
        FileMagicNumber fileMagicNumber36 = new FileMagicNumber("EXE", 35, "application/x-msdownload", "exe") { // from class: cn.hutool.core.io.FileMagicNumber.36
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 1 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.T0));
            }
        };
        EXE = fileMagicNumber36;
        FileMagicNumber fileMagicNumber37 = new FileMagicNumber("SWF", 36, "application/x-shockwave-flash", "swf") { // from class: cn.hutool.core.io.FileMagicNumber.37
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length > 2) {
                    return (Objects.equals(Byte.valueOf(bArr[0]), 67) || Objects.equals(Byte.valueOf(bArr[0]), (byte) 70)) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.R0)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.P0));
                }
                return false;
            }
        };
        SWF = fileMagicNumber37;
        FileMagicNumber fileMagicNumber38 = new FileMagicNumber("RTF", 37, "application/rtf", "rtf") { // from class: cn.hutool.core.io.FileMagicNumber.38
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.f88u1)) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.U0)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f67n1)) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f23c1));
            }
        };
        RTF = fileMagicNumber38;
        FileMagicNumber fileMagicNumber39 = new FileMagicNumber("NES", 38, "application/x-nintendo-nes-rom", "nes") { // from class: cn.hutool.core.io.FileMagicNumber.39
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 78) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.M0)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.P0)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 26);
            }
        };
        NES = fileMagicNumber39;
        FileMagicNumber fileMagicNumber40 = new FileMagicNumber("CRX", 39, "application/x-google-chrome-extension", "crx") { // from class: cn.hutool.core.io.FileMagicNumber.40
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 67) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f67n1)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 50) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 52);
            }
        };
        CRX = fileMagicNumber40;
        FileMagicNumber fileMagicNumber41 = new FileMagicNumber("CAB", 40, "application/vnd.ms-cab-compressed", "cab") { // from class: cn.hutool.core.io.FileMagicNumber.41
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 4) {
                    return false;
                }
                return (Objects.equals(Byte.valueOf(bArr[0]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.P0)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 67) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 70)) || (Objects.equals(Byte.valueOf(bArr[0]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.P0)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.Z0)) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.f58l0)));
            }
        };
        CAB = fileMagicNumber41;
        FileMagicNumber fileMagicNumber42 = new FileMagicNumber("PS", 41, "application/postscript", "ps") { // from class: cn.hutool.core.io.FileMagicNumber.42
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 1 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 37) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 33);
            }
        };
        PS = fileMagicNumber42;
        FileMagicNumber fileMagicNumber43 = new FileMagicNumber("XZ", 42, "application/x-xz", "xz") { // from class: cn.hutool.core.io.FileMagicNumber.43
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 5 && Objects.equals(Byte.valueOf(bArr[0]), (byte) -3) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 55) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 122) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 88) && Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.T0)) && Objects.equals(Byte.valueOf(bArr[5]), (byte) 0);
            }
        };
        XZ = fileMagicNumber43;
        FileMagicNumber fileMagicNumber44 = new FileMagicNumber("SQLITE", 43, "application/x-sqlite3", "sqlite") { // from class: cn.hutool.core.io.FileMagicNumber.44
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 15 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.P0)) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.N0)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 76) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f19b1)) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 32) && Objects.equals(Byte.valueOf(bArr[7]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[8]), Byte.valueOf(a4.a.f59l1)) && Objects.equals(Byte.valueOf(bArr[9]), Byte.valueOf(a4.a.f67n1)) && Objects.equals(Byte.valueOf(bArr[10]), Byte.valueOf(a4.a.f51j1)) && Objects.equals(Byte.valueOf(bArr[11]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[12]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[13]), (byte) 32) && Objects.equals(Byte.valueOf(bArr[14]), (byte) 51) && Objects.equals(Byte.valueOf(bArr[15]), (byte) 0);
            }
        };
        SQLITE = fileMagicNumber44;
        FileMagicNumber fileMagicNumber45 = new FileMagicNumber("DEB", 44, "application/x-deb", "deb") { // from class: cn.hutool.core.io.FileMagicNumber.45
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 20 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 33) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 60) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.f67n1)) && Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.Z0)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f31e1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.G0)) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 10) && Objects.equals(Byte.valueOf(bArr[8]), Byte.valueOf(a4.a.f15a1)) && Objects.equals(Byte.valueOf(bArr[9]), Byte.valueOf(a4.a.f19b1)) && Objects.equals(Byte.valueOf(bArr[10]), Byte.valueOf(a4.a.Y0)) && Objects.equals(Byte.valueOf(bArr[11]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[12]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[13]), Byte.valueOf(a4.a.f55k1)) && Objects.equals(Byte.valueOf(bArr[14]), (byte) 45) && Objects.equals(Byte.valueOf(bArr[15]), Byte.valueOf(a4.a.Y0)) && Objects.equals(Byte.valueOf(bArr[16]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[17]), Byte.valueOf(a4.a.f55k1)) && Objects.equals(Byte.valueOf(bArr[18]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[19]), Byte.valueOf(a4.a.f67n1)) && Objects.equals(Byte.valueOf(bArr[20]), (byte) 121);
            }
        };
        DEB = fileMagicNumber45;
        FileMagicNumber fileMagicNumber46 = new FileMagicNumber("AR", 45, "application/x-unix-archive", u.LANGUAGE_AR) { // from class: cn.hutool.core.io.FileMagicNumber.46
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 6 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 33) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 60) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.f67n1)) && Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.Z0)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f31e1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.G0));
            }
        };
        AR = fileMagicNumber46;
        FileMagicNumber fileMagicNumber47 = new FileMagicNumber("LZOP", 46, "application/x-lzop", "lzo") { // from class: cn.hutool.core.io.FileMagicNumber.47
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 7 && Objects.equals(Byte.valueOf(bArr[0]), (byte) -119) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 76) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.T0)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 79) && Objects.equals(Byte.valueOf(bArr[4]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[5]), (byte) 13) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 10) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 26);
            }
        };
        LZOP = fileMagicNumber47;
        FileMagicNumber fileMagicNumber48 = new FileMagicNumber("LZ", 47, "application/x-lzip", "lz") { // from class: cn.hutool.core.io.FileMagicNumber.48
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 76) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.T0)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 80);
            }
        };
        LZ = fileMagicNumber48;
        FileMagicNumber fileMagicNumber49 = new FileMagicNumber("ELF", 48, "application/x-executable", "elf") { // from class: cn.hutool.core.io.FileMagicNumber.49
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 52 && Objects.equals(Byte.valueOf(bArr[0]), Byte.MAX_VALUE) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.M0)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 76) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 70);
            }
        };
        ELF = fileMagicNumber49;
        FileMagicNumber fileMagicNumber50 = new FileMagicNumber("LZ4", 49, "application/x-lz4", "lz4") { // from class: cn.hutool.core.io.FileMagicNumber.50
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 4) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 34) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 24);
            }
        };
        LZ4 = fileMagicNumber50;
        FileMagicNumber fileMagicNumber51 = new FileMagicNumber("BR", 50, "application/x-brotli", "br") { // from class: cn.hutool.core.io.FileMagicNumber.51
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) -50) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.U1)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) -49) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.f100y1));
            }
        };
        BR = fileMagicNumber51;
        FileMagicNumber fileMagicNumber52 = new FileMagicNumber("DCM", 51, "application/x-dicom", "dcm") { // from class: cn.hutool.core.io.FileMagicNumber.52
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 128 && Objects.equals(Byte.valueOf(bArr[128]), Byte.valueOf(a4.a.L0)) && Objects.equals(Byte.valueOf(bArr[129]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[130]), (byte) 67) && Objects.equals(Byte.valueOf(bArr[131]), (byte) 77);
            }
        };
        DCM = fileMagicNumber52;
        FileMagicNumber fileMagicNumber53 = new FileMagicNumber("RPM", 52, "application/x-rpm", "rpm") { // from class: cn.hutool.core.io.FileMagicNumber.53
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Objects.equals(Byte.valueOf(bArr[0]), (byte) -19) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.S1)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(h4.p.f16767c)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) -37);
            }
        };
        RPM = fileMagicNumber53;
        FileMagicNumber fileMagicNumber54 = new FileMagicNumber("ZSTD", 53, "application/x-zstd", "zst") { // from class: cn.hutool.core.io.FileMagicNumber.54
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 5) {
                    return false;
                }
                if (g0.contains(new byte[]{34, 35, 36, 37, a4.a.f50j0, 39, a4.a.f58l0}, bArr[0]) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.X1)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 47) && Objects.equals(Byte.valueOf(bArr[3]), (byte) -3)) {
                    return true;
                }
                return (bArr[0] & 240) == 80 && bArr[1] == 42 && bArr[2] == 77 && bArr[3] == 24;
            }
        };
        ZSTD = fileMagicNumber54;
        FileMagicNumber fileMagicNumber55 = new FileMagicNumber("MP4", 54, MimeTypes.VIDEO_MP4, "mp4") { // from class: cn.hutool.core.io.FileMagicNumber.55
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 13) {
                    return false;
                }
                return (Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 121) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[8]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[9]), Byte.valueOf(a4.a.P0)) && Objects.equals(Byte.valueOf(bArr[10]), (byte) 78) && Objects.equals(Byte.valueOf(bArr[11]), (byte) 86)) || (Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 121) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[8]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[9]), Byte.valueOf(a4.a.f70o1)) && Objects.equals(Byte.valueOf(bArr[10]), Byte.valueOf(a4.a.f59l1)) && Objects.equals(Byte.valueOf(bArr[11]), Byte.valueOf(a4.a.f51j1)));
            }
        };
        MP4 = fileMagicNumber55;
        FileMagicNumber fileMagicNumber56 = new FileMagicNumber("AVI", 55, MimeTypes.VIDEO_AVI, "avi") { // from class: cn.hutool.core.io.FileMagicNumber.56
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 11 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.O0)) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 70) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 70) && Objects.equals(Byte.valueOf(bArr[8]), Byte.valueOf(a4.a.I0)) && Objects.equals(Byte.valueOf(bArr[9]), (byte) 86) && Objects.equals(Byte.valueOf(bArr[10]), (byte) 73) && Objects.equals(Byte.valueOf(bArr[11]), (byte) 32);
            }
        };
        AVI = fileMagicNumber56;
        FileMagicNumber fileMagicNumber57 = new FileMagicNumber("WMV", 56, "video/x-ms-wmv", "wmv") { // from class: cn.hutool.core.io.FileMagicNumber.57
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 9 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 48) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f50j0)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.U1)) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.f76q1)) && Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.I1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[6]), (byte) -49) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 17) && Objects.equals(Byte.valueOf(bArr[8]), Byte.valueOf(a4.a.Q1)) && Objects.equals(Byte.valueOf(bArr[9]), (byte) -39);
            }
        };
        WMV = fileMagicNumber57;
        FileMagicNumber fileMagicNumber58 = new FileMagicNumber("M4V", 57, "video/x-m4v", "m4v") { // from class: cn.hutool.core.io.FileMagicNumber.58
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 12) {
                    return false;
                }
                return (Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 121) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[8]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[9]), (byte) 52) && Objects.equals(Byte.valueOf(bArr[10]), (byte) 86) && Objects.equals(Byte.valueOf(bArr[11]), (byte) 32)) || (Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 121) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[8]), Byte.valueOf(a4.a.f51j1)) && Objects.equals(Byte.valueOf(bArr[9]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[10]), (byte) 52) && Objects.equals(Byte.valueOf(bArr[11]), (byte) 50));
            }
        };
        M4V = fileMagicNumber58;
        FileMagicNumber fileMagicNumber59 = new FileMagicNumber("FLV", 58, MimeTypes.VIDEO_FLV, "flv") { // from class: cn.hutool.core.io.FileMagicNumber.59
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 70) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 76) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 86) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 1);
            }
        };
        FLV = fileMagicNumber59;
        FileMagicNumber fileMagicNumber60 = new FileMagicNumber("MKV", 59, MimeTypes.VIDEO_MATROSKA, "mkv") { // from class: cn.hutool.core.io.FileMagicNumber.60
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 11 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 26) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.M0)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) -33) && Objects.equals(Byte.valueOf(bArr[3]), (byte) -93) && FileMagicNumber.indexOf(bArr, new byte[]{66, a4.a.f103z1, a4.a.E1, a4.a.f51j1, a4.a.X0, a4.a.f73p1, a4.a.f67n1, a4.a.f59l1, a4.a.f70o1, a4.a.f43h1, a4.a.X0}) > 0;
            }
        };
        MKV = fileMagicNumber60;
        FileMagicNumber fileMagicNumber61 = new FileMagicNumber("WEBM", 60, MimeTypes.VIDEO_WEBM, "webm") { // from class: cn.hutool.core.io.FileMagicNumber.61
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 8 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 26) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.M0)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) -33) && Objects.equals(Byte.valueOf(bArr[3]), (byte) -93) && FileMagicNumber.indexOf(bArr, new byte[]{66, a4.a.f103z1, a4.a.E1, a4.a.f79r1, a4.a.f19b1, a4.a.Y0, a4.a.f51j1}) > 0;
            }
        };
        WEBM = fileMagicNumber61;
        FileMagicNumber fileMagicNumber62 = new FileMagicNumber("MOV", 61, "video/quicktime", "mov") { // from class: cn.hutool.core.io.FileMagicNumber.62
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 12) {
                    return false;
                }
                return (Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 121) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[8]), Byte.valueOf(a4.a.f63m1)) && Objects.equals(Byte.valueOf(bArr[9]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[10]), (byte) 32) && Objects.equals(Byte.valueOf(bArr[11]), (byte) 32)) || (Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f51j1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f59l1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.f59l1)) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 118)) || (Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f67n1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.f19b1)) && Objects.equals(Byte.valueOf(bArr[7]), Byte.valueOf(a4.a.f19b1))) || (Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f51j1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f15a1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[7]), Byte.valueOf(a4.a.f73p1))) || (Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f79r1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.f15a1)) && Objects.equals(Byte.valueOf(bArr[7]), Byte.valueOf(a4.a.f19b1))) || (Objects.equals(Byte.valueOf(bArr[4]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f55k1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.f59l1)) && Objects.equals(Byte.valueOf(bArr[7]), Byte.valueOf(a4.a.f73p1))) || (Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f70o1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f43h1)) && Objects.equals(Byte.valueOf(bArr[6]), Byte.valueOf(a4.a.f35f1)) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 112));
            }
        };
        MOV = fileMagicNumber62;
        FileMagicNumber fileMagicNumber63 = new FileMagicNumber("MPEG", 62, MimeTypes.VIDEO_MPEG, "mpg") { // from class: cn.hutool.core.io.FileMagicNumber.63
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                byte b8;
                return bArr.length > 3 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[1]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 1) && (b8 = bArr[3]) >= -80 && b8 <= -65;
            }
        };
        MPEG = fileMagicNumber63;
        FileMagicNumber fileMagicNumber64 = new FileMagicNumber("RMVB", 63, "video/vnd.rn-realvideo", "rmvb") { // from class: cn.hutool.core.io.FileMagicNumber.64
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.f78r0)) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.O0)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 77) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 70);
            }
        };
        RMVB = fileMagicNumber64;
        FileMagicNumber fileMagicNumber65 = new FileMagicNumber("M3GP", 64, MimeTypes.VIDEO_H263, "3gp") { // from class: cn.hutool.core.io.FileMagicNumber.65
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 10 && Objects.equals(Byte.valueOf(bArr[4]), Byte.valueOf(a4.a.f23c1)) && Objects.equals(Byte.valueOf(bArr[5]), Byte.valueOf(a4.a.f73p1)) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 121) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 112) && Objects.equals(Byte.valueOf(bArr[8]), (byte) 51) && Objects.equals(Byte.valueOf(bArr[9]), Byte.valueOf(a4.a.f27d1)) && Objects.equals(Byte.valueOf(bArr[10]), (byte) 112);
            }
        };
        M3GP = fileMagicNumber65;
        FileMagicNumber fileMagicNumber66 = new FileMagicNumber("DOC", 65, "application/msword", "doc") { // from class: cn.hutool.core.io.FileMagicNumber.66
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                byte[] bArr2 = {-48, -49, 17, -32, a4.a.N1, -79, 26, -31};
                if (bArr.length <= 515 || !Arrays.equals(Arrays.copyOfRange(bArr, 0, 8), bArr2)) {
                    return false;
                }
                return Arrays.equals(Arrays.copyOfRange(bArr, 512, 516), new byte[]{-20, a4.a.P1, -63, 0}) || (bArr.length > 2142 && FileMagicNumber.indexOf(Arrays.copyOfRange(bArr, 2075, 2142), new byte[]{0, 10, 0, 0, 0, 77, a4.a.P0, a4.a.R0, a4.a.f59l1, a4.a.f67n1, a4.a.f15a1, a4.a.L0, a4.a.f59l1, a4.a.Z0, 0, 16, 0, 0, 0, a4.a.R0, a4.a.f59l1, a4.a.f67n1, a4.a.f15a1, a4.a.f78r0, a4.a.L0, a4.a.f59l1, a4.a.Z0, a4.a.f76q1, a4.a.f51j1, a4.a.f19b1, a4.a.f55k1, a4.a.f73p1, a4.a.f78r0, 56, 0, a4.a.f52j2, 57, a4.a.U1, a4.a.f63m1}) > 0);
            }
        };
        DOC = fileMagicNumber66;
        FileMagicNumber fileMagicNumber67 = new FileMagicNumber("XLS", 66, "application/vnd.ms-excel", "xls") { // from class: cn.hutool.core.io.FileMagicNumber.67
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                byte b8;
                byte[] bArr2 = {-48, -49, 17, -32, a4.a.N1, -79, 26, -31};
                if (bArr.length <= 520 || !Arrays.equals(Arrays.copyOfRange(bArr, 0, 8), bArr2)) {
                    return false;
                }
                return (Arrays.equals(Arrays.copyOfRange(bArr, 512, 516), new byte[]{-3, -1, -1, -1}) && ((b8 = bArr[518]) == 0 || b8 == 2)) || Arrays.equals(Arrays.copyOfRange(bArr, 512, 520), new byte[]{9, 8, 16, 0, 0, 6, 5, 0}) || (bArr.length > 2095 && Arrays.equals(Arrays.copyOfRange(bArr, 1568, 2095), new byte[]{-30, 0, 0, 0, a4.a.U0, 0, 112, 0, 4, 0, 0, 67, a4.a.X0, a4.a.f47i1, a4.a.Z0}));
            }
        };
        XLS = fileMagicNumber67;
        FileMagicNumber fileMagicNumber68 = new FileMagicNumber("PPT", 67, "application/vnd.ms-powerpoint", "ppt") { // from class: cn.hutool.core.io.FileMagicNumber.68
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                byte[] bArr2 = {-48, -49, 17, -32, a4.a.N1, -79, 26, -31};
                if (bArr.length <= 524 || !Arrays.equals(Arrays.copyOfRange(bArr, 0, 8), bArr2)) {
                    return false;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 512, 516);
                return Arrays.equals(copyOfRange, new byte[]{-96, 70, 29, -16}) || Arrays.equals(copyOfRange, new byte[]{0, a4.a.f55k1, 30, -16}) || Arrays.equals(copyOfRange, new byte[]{15, 0, -24, 3}) || (Arrays.equals(copyOfRange, new byte[]{-3, -1, -1, -1}) && bArr[522] == 0 && bArr[523] == 0) || (bArr.length > 2096 && Arrays.equals(Arrays.copyOfRange(bArr, 2072, 2096), new byte[]{0, a4.a.f20b2, 41, -24, 17, 0, 0, 0, 77, a4.a.P0, 32, 80, a4.a.f59l1, a4.a.f79r1, a4.a.f19b1, a4.a.f67n1, 80, a4.a.f59l1, a4.a.f35f1, a4.a.f55k1, a4.a.f73p1, 32, 57, 55}));
            }
        };
        PPT = fileMagicNumber68;
        FileMagicNumber fileMagicNumber69 = new FileMagicNumber("DOCX", 68, "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "docx") { // from class: cn.hutool.core.io.FileMagicNumber.69
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return Objects.equals(FileMagicNumber.matchDocument(bArr), FileMagicNumber.DOCX);
            }
        };
        DOCX = fileMagicNumber69;
        FileMagicNumber fileMagicNumber70 = new FileMagicNumber("PPTX", 69, "application/vnd.openxmlformats-officedocument.presentationml.presentation", "pptx") { // from class: cn.hutool.core.io.FileMagicNumber.70
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return Objects.equals(FileMagicNumber.matchDocument(bArr), FileMagicNumber.PPTX);
            }
        };
        PPTX = fileMagicNumber70;
        FileMagicNumber fileMagicNumber71 = new FileMagicNumber("XLSX", 70, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "xlsx") { // from class: cn.hutool.core.io.FileMagicNumber.71
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return Objects.equals(FileMagicNumber.matchDocument(bArr), FileMagicNumber.XLSX);
            }
        };
        XLSX = fileMagicNumber71;
        FileMagicNumber fileMagicNumber72 = new FileMagicNumber("WASM", 71, "application/wasm", "wasm") { // from class: cn.hutool.core.io.FileMagicNumber.72
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 7 && Objects.equals(Byte.valueOf(bArr[0]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.X0)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f70o1)) && Objects.equals(Byte.valueOf(bArr[3]), Byte.valueOf(a4.a.f51j1)) && Objects.equals(Byte.valueOf(bArr[4]), (byte) 1) && Objects.equals(Byte.valueOf(bArr[5]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[6]), (byte) 0) && Objects.equals(Byte.valueOf(bArr[7]), (byte) 0);
            }
        };
        WASM = fileMagicNumber72;
        FileMagicNumber fileMagicNumber73 = new FileMagicNumber("DEX", 72, "application/vnd.android.dex", "dex") { // from class: cn.hutool.core.io.FileMagicNumber.73
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 36 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.f15a1)) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f19b1)) && Objects.equals(Byte.valueOf(bArr[2]), Byte.valueOf(a4.a.f82s1)) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 10) && Objects.equals(Byte.valueOf(bArr[36]), (byte) 112);
            }
        };
        DEX = fileMagicNumber73;
        FileMagicNumber fileMagicNumber74 = new FileMagicNumber("DEY", 73, "application/vnd.android.dey", "dey") { // from class: cn.hutool.core.io.FileMagicNumber.74
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 100 && Objects.equals(Byte.valueOf(bArr[0]), Byte.valueOf(a4.a.f15a1)) && Objects.equals(Byte.valueOf(bArr[1]), Byte.valueOf(a4.a.f19b1)) && Objects.equals(Byte.valueOf(bArr[2]), (byte) 121) && Objects.equals(Byte.valueOf(bArr[3]), (byte) 10) && FileMagicNumber.DEX.match(Arrays.copyOfRange(bArr, 40, 100));
            }
        };
        DEY = fileMagicNumber74;
        FileMagicNumber fileMagicNumber75 = new FileMagicNumber("EML", 74, "message/rfc822", "eml") { // from class: cn.hutool.core.io.FileMagicNumber.75
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                if (bArr.length < 8) {
                    return false;
                }
                return Arrays.equals(Arrays.copyOfRange(bArr, 0, 7), new byte[]{70, a4.a.f67n1, a4.a.f59l1, a4.a.f51j1, 32, 32, 32}) || Arrays.equals(Arrays.copyOfRange(bArr, 0, 8), new byte[]{70, a4.a.f67n1, a4.a.f59l1, a4.a.f51j1, 32, 63, 63, 63}) || Arrays.equals(Arrays.copyOfRange(bArr, 0, 6), new byte[]{70, a4.a.f67n1, a4.a.f59l1, a4.a.f51j1, a4.a.C0, 32}) || (bArr.length > 13 && Arrays.equals(Arrays.copyOfRange(bArr, 0, 13), new byte[]{a4.a.O0, a4.a.f19b1, a4.a.f73p1, a4.a.f76q1, a4.a.f67n1, a4.a.f55k1, 45, 80, a4.a.X0, a4.a.f73p1, a4.a.f31e1, a4.a.C0, 32}));
            }
        };
        EML = fileMagicNumber75;
        FileMagicNumber fileMagicNumber76 = new FileMagicNumber("MDB", 75, "application/vnd.ms-access", "mdb") { // from class: cn.hutool.core.io.FileMagicNumber.76
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 18 && Arrays.equals(Arrays.copyOfRange(bArr, 0, 18), new byte[]{0, 1, 0, 0, a4.a.P0, a4.a.f73p1, a4.a.X0, a4.a.f55k1, a4.a.f15a1, a4.a.X0, a4.a.f67n1, a4.a.f15a1, 32, 74, a4.a.f19b1, a4.a.f73p1, 32, a4.a.L0, 66});
            }
        };
        MDB = fileMagicNumber76;
        FileMagicNumber fileMagicNumber77 = new FileMagicNumber("CHM", 76, "application/vnd.ms-htmlhelp", "chm") { // from class: cn.hutool.core.io.FileMagicNumber.77
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Arrays.equals(Arrays.copyOfRange(bArr, 0, 4), new byte[]{73, a4.a.Q0, a4.a.P0, 70});
            }
        };
        CHM = fileMagicNumber77;
        FileMagicNumber fileMagicNumber78 = new FileMagicNumber("CLASS", 77, "application/java-vm", "class") { // from class: cn.hutool.core.io.FileMagicNumber.78
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Arrays.equals(Arrays.copyOfRange(bArr, 0, 4), new byte[]{-54, -2, a4.a.f24c2, -66});
            }
        };
        CLASS = fileMagicNumber78;
        FileMagicNumber fileMagicNumber79 = new FileMagicNumber("TORRENT", 78, "application/x-bittorrent", "torrent") { // from class: cn.hutool.core.io.FileMagicNumber.79
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 11 && Arrays.equals(Arrays.copyOfRange(bArr, 0, 11), new byte[]{a4.a.f15a1, 56, a4.a.C0, a4.a.X0, a4.a.f55k1, a4.a.f55k1, a4.a.f59l1, a4.a.f76q1, a4.a.f55k1, a4.a.Z0, a4.a.f19b1});
            }
        };
        TORRENT = fileMagicNumber79;
        FileMagicNumber fileMagicNumber80 = new FileMagicNumber("WPD", 79, "application/vnd.wordperfect", "wpd") { // from class: cn.hutool.core.io.FileMagicNumber.80
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Arrays.equals(Arrays.copyOfRange(bArr, 0, 4), new byte[]{-1, a4.a.R0, 80, 67});
            }
        };
        WPD = fileMagicNumber80;
        FileMagicNumber fileMagicNumber81 = new FileMagicNumber("DBX", 80, "", "dbx") { // from class: cn.hutool.core.io.FileMagicNumber.81
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Arrays.equals(Arrays.copyOfRange(bArr, 0, 4), new byte[]{-49, -83, 18, -2});
            }
        };
        DBX = fileMagicNumber81;
        FileMagicNumber fileMagicNumber82 = new FileMagicNumber("PST", 81, "application/vnd.ms-outlook-pst", "pst") { // from class: cn.hutool.core.io.FileMagicNumber.82
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 4 && Arrays.equals(Arrays.copyOfRange(bArr, 0, 4), new byte[]{33, 66, a4.a.L0, 78});
            }
        };
        PST = fileMagicNumber82;
        FileMagicNumber fileMagicNumber83 = new FileMagicNumber("RAM", 82, "audio/x-pn-realaudio", "ram") { // from class: cn.hutool.core.io.FileMagicNumber.83
            @Override // cn.hutool.core.io.FileMagicNumber
            public boolean match(byte[] bArr) {
                return bArr.length > 5 && Arrays.equals(Arrays.copyOfRange(bArr, 0, 5), new byte[]{a4.a.f78r0, a4.a.f67n1, a4.a.X0, -3, 0});
            }
        };
        RAM = fileMagicNumber83;
        $VALUES = new FileMagicNumber[]{fileMagicNumber, fileMagicNumber2, fileMagicNumber3, fileMagicNumber4, fileMagicNumber5, fileMagicNumber6, fileMagicNumber7, fileMagicNumber8, fileMagicNumber9, fileMagicNumber10, fileMagicNumber11, fileMagicNumber12, fileMagicNumber13, fileMagicNumber14, fileMagicNumber15, fileMagicNumber16, fileMagicNumber17, fileMagicNumber18, fileMagicNumber19, fileMagicNumber20, fileMagicNumber21, fileMagicNumber22, fileMagicNumber23, fileMagicNumber24, fileMagicNumber25, fileMagicNumber26, fileMagicNumber27, fileMagicNumber28, fileMagicNumber29, fileMagicNumber30, fileMagicNumber31, fileMagicNumber32, fileMagicNumber33, fileMagicNumber34, fileMagicNumber35, fileMagicNumber36, fileMagicNumber37, fileMagicNumber38, fileMagicNumber39, fileMagicNumber40, fileMagicNumber41, fileMagicNumber42, fileMagicNumber43, fileMagicNumber44, fileMagicNumber45, fileMagicNumber46, fileMagicNumber47, fileMagicNumber48, fileMagicNumber49, fileMagicNumber50, fileMagicNumber51, fileMagicNumber52, fileMagicNumber53, fileMagicNumber54, fileMagicNumber55, fileMagicNumber56, fileMagicNumber57, fileMagicNumber58, fileMagicNumber59, fileMagicNumber60, fileMagicNumber61, fileMagicNumber62, fileMagicNumber63, fileMagicNumber64, fileMagicNumber65, fileMagicNumber66, fileMagicNumber67, fileMagicNumber68, fileMagicNumber69, fileMagicNumber70, fileMagicNumber71, fileMagicNumber72, fileMagicNumber73, fileMagicNumber74, fileMagicNumber75, fileMagicNumber76, fileMagicNumber77, fileMagicNumber78, fileMagicNumber79, fileMagicNumber80, fileMagicNumber81, fileMagicNumber82, fileMagicNumber83};
    }

    private static boolean compareBytes(byte[] bArr, byte[] bArr2, int i8) {
        int length = bArr2.length + i8;
        if (length > bArr.length) {
            return false;
        }
        return Arrays.equals(Arrays.copyOfRange(bArr, i8, length), bArr2);
    }

    public static FileMagicNumber getMagicNumber(final byte[] bArr) {
        Stream stream;
        Stream filter;
        Optional findFirst;
        Object orElse;
        stream = Arrays.stream(values());
        filter = stream.filter(new Predicate() { // from class: cn.hutool.core.io.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getMagicNumber$0;
                lambda$getMagicNumber$0 = FileMagicNumber.lambda$getMagicNumber$0(bArr, (FileMagicNumber) obj);
                return lambda$getMagicNumber$0;
            }
        });
        findFirst = filter.findFirst();
        FileMagicNumber fileMagicNumber = UNKNOWN;
        orElse = findFirst.orElse(fileMagicNumber);
        FileMagicNumber fileMagicNumber2 = (FileMagicNumber) orElse;
        FileMagicNumber fileMagicNumber3 = ZIP;
        if (!fileMagicNumber2.equals(fileMagicNumber3)) {
            return fileMagicNumber2;
        }
        FileMagicNumber matchDocument = matchDocument(bArr);
        return matchDocument == fileMagicNumber ? fileMagicNumber3 : matchDocument;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length >= bArr2.length) {
            if (bArr2.length == 0) {
                return 0;
            }
            int i8 = 0;
            while (i8 < (bArr.length - bArr2.length) + 1) {
                for (int i9 = 0; i9 < bArr2.length; i9++) {
                    if (bArr[i8 + i9] != bArr2[i9]) {
                        break;
                    }
                }
                return i8;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getMagicNumber$0(byte[] bArr, FileMagicNumber fileMagicNumber) {
        return fileMagicNumber.match(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileMagicNumber matchDocument(byte[] bArr) {
        FileMagicNumber matchOpenXmlMime = matchOpenXmlMime(bArr, 30);
        FileMagicNumber fileMagicNumber = UNKNOWN;
        if (!matchOpenXmlMime.equals(fileMagicNumber)) {
            return matchOpenXmlMime;
        }
        byte[] bArr2 = {91, 67, a4.a.f59l1, a4.a.f55k1, a4.a.f73p1, a4.a.f19b1, a4.a.f55k1, a4.a.f73p1, 95, a4.a.Q0, 121, 112, a4.a.f19b1, a4.a.f70o1, a4.a.V0, a4.a.f78r0, a4.a.f82s1, a4.a.f51j1, a4.a.f47i1};
        byte[] bArr3 = {95, a4.a.f67n1, a4.a.f19b1, a4.a.f47i1, a4.a.f70o1, 47, a4.a.f78r0, a4.a.f67n1, a4.a.f19b1, a4.a.f47i1, a4.a.f70o1};
        byte[] bArr4 = {a4.a.f15a1, a4.a.f59l1, a4.a.Z0, 80, a4.a.f67n1, a4.a.f59l1, 112, a4.a.f70o1};
        boolean compareBytes = compareBytes(bArr, bArr2, 30);
        boolean compareBytes2 = compareBytes(bArr, bArr3, 30);
        boolean compareBytes3 = compareBytes(bArr, bArr4, 30);
        if (!compareBytes && !compareBytes2 && !compareBytes3) {
            return fileMagicNumber;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            i8 = searchSignature(bArr, i8 + 4, 6000);
            if (i8 != -1) {
                FileMagicNumber matchOpenXmlMime2 = matchOpenXmlMime(bArr, i8 + 30);
                if (!matchOpenXmlMime2.equals(UNKNOWN)) {
                    return matchOpenXmlMime2;
                }
            }
        }
        return UNKNOWN;
    }

    private static FileMagicNumber matchOpenXmlMime(byte[] bArr, int i8) {
        return compareBytes(bArr, new byte[]{a4.a.f79r1, a4.a.f59l1, a4.a.f67n1, a4.a.f15a1, 47}, i8) ? DOCX : compareBytes(bArr, new byte[]{112, 112, a4.a.f73p1, 47}, i8) ? PPTX : compareBytes(bArr, new byte[]{a4.a.f82s1, a4.a.f47i1, 47}, i8) ? XLSX : UNKNOWN;
    }

    private static int searchSignature(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = {80, 75, 3, 4};
        int length = bArr.length;
        int i10 = i9 + i8;
        if (i10 <= length) {
            length = i10;
        }
        int indexOf = indexOf(Arrays.copyOfRange(bArr, i8, length), bArr2);
        if (indexOf == -1) {
            return -1;
        }
        return i8 + indexOf;
    }

    public static FileMagicNumber valueOf(String str) {
        return (FileMagicNumber) Enum.valueOf(FileMagicNumber.class, str);
    }

    public static FileMagicNumber[] values() {
        return (FileMagicNumber[]) $VALUES.clone();
    }

    public String getExtension() {
        return this.extension;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public abstract boolean match(byte[] bArr);

    private FileMagicNumber(String str, int i8, String str2, String str3) {
        this.mimeType = str2;
        this.extension = str3;
    }
}
