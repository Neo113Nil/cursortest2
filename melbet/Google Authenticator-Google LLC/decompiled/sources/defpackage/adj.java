package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adj {
    private static final Set A;
    private static final HashMap B;
    private static final byte[] C;
    private static final gug[] O;
    private static final gug[] P;
    private static final gug[] Q;
    private static final gug[] R;
    private static final gug[] S;
    private static final gug T;
    private static final gug[] U;
    private static final gug[] V;
    private static final gug[] W;
    private static final gug[] X;
    private static final gug[] Y;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final byte[] d;
    public static final String[] e;
    public static final int[] f;
    public static final byte[] g;
    public static final Charset h;
    static final byte[] i;
    static final gug[][] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static final byte[] v;
    private static final SimpleDateFormat w;
    private static final SimpleDateFormat x;
    private static final HashMap[] y;
    private static final HashMap[] z;
    private final FileDescriptor D;
    private final AssetManager.AssetInputStream E;
    private int F;
    private final HashMap[] G;
    private final Set H;
    private boolean I;
    private int J;
    private int K;
    private int L;
    private int M;
    private adh N;
    public ByteOrder j;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        l = new byte[]{102, 116, 121, 112};
        m = new byte[]{109, 105, 102, 49};
        n = new byte[]{104, 101, 105, 99};
        o = new byte[]{97, 118, 105, 102};
        p = new byte[]{97, 118, 105, 115};
        q = new byte[]{79, 76, 89, 77, 80, 0};
        r = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        s = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        d = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        t = new byte[]{82, 73, 70, 70};
        u = new byte[]{87, 69, 66, 80};
        v = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        e = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        g = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        gug[] gugVarArr = {new gug("NewSubfileType", 254, 4), new gug("SubfileType", 255, 4), new gug("ImageWidth", 256, 3, 4), new gug("ImageLength", 257, 3, 4), new gug("BitsPerSample", 258, 3), new gug("Compression", 259, 3), new gug("PhotometricInterpretation", 262, 3), new gug("ImageDescription", 270, 2), new gug("Make", 271, 2), new gug("Model", 272, 2), new gug("StripOffsets", 273, 3, 4), new gug("Orientation", 274, 3), new gug("SamplesPerPixel", 277, 3), new gug("RowsPerStrip", 278, 3, 4), new gug("StripByteCounts", 279, 3, 4), new gug("XResolution", 282, 5), new gug("YResolution", 283, 5), new gug("PlanarConfiguration", 284, 3), new gug("ResolutionUnit", 296, 3), new gug("TransferFunction", 301, 3), new gug("Software", 305, 2), new gug("DateTime", 306, 2), new gug("Artist", 315, 2), new gug("WhitePoint", 318, 5), new gug("PrimaryChromaticities", 319, 5), new gug("SubIFDPointer", 330, 4), new gug("JPEGInterchangeFormat", 513, 4), new gug("JPEGInterchangeFormatLength", 514, 4), new gug("YCbCrCoefficients", 529, 5), new gug("YCbCrSubSampling", 530, 3), new gug("YCbCrPositioning", 531, 3), new gug("ReferenceBlackWhite", 532, 5), new gug("Copyright", 33432, 2), new gug("ExifIFDPointer", 34665, 4), new gug("GPSInfoIFDPointer", 34853, 4), new gug("SensorTopBorder", 4, 4), new gug("SensorLeftBorder", 5, 4), new gug("SensorBottomBorder", 6, 4), new gug("SensorRightBorder", 7, 4), new gug("ISO", 23, 3), new gug("JpgFromRaw", 46, 7), new gug("Xmp", 700, 1)};
        O = gugVarArr;
        gug[] gugVarArr2 = {new gug("ExposureTime", 33434, 5), new gug("FNumber", 33437, 5), new gug("ExposureProgram", 34850, 3), new gug("SpectralSensitivity", 34852, 2), new gug("PhotographicSensitivity", 34855, 3), new gug("OECF", 34856, 7), new gug("SensitivityType", 34864, 3), new gug("StandardOutputSensitivity", 34865, 4), new gug("RecommendedExposureIndex", 34866, 4), new gug("ISOSpeed", 34867, 4), new gug("ISOSpeedLatitudeyyy", 34868, 4), new gug("ISOSpeedLatitudezzz", 34869, 4), new gug("ExifVersion", 36864, 2), new gug("DateTimeOriginal", 36867, 2), new gug("DateTimeDigitized", 36868, 2), new gug("OffsetTime", 36880, 2), new gug("OffsetTimeOriginal", 36881, 2), new gug("OffsetTimeDigitized", 36882, 2), new gug("ComponentsConfiguration", 37121, 7), new gug("CompressedBitsPerPixel", 37122, 5), new gug("ShutterSpeedValue", 37377, 10), new gug("ApertureValue", 37378, 5), new gug("BrightnessValue", 37379, 10), new gug("ExposureBiasValue", 37380, 10), new gug("MaxApertureValue", 37381, 5), new gug("SubjectDistance", 37382, 5), new gug("MeteringMode", 37383, 3), new gug("LightSource", 37384, 3), new gug("Flash", 37385, 3), new gug("FocalLength", 37386, 5), new gug("SubjectArea", 37396, 3), new gug("MakerNote", 37500, 7), new gug("UserComment", 37510, 7), new gug("SubSecTime", 37520, 2), new gug("SubSecTimeOriginal", 37521, 2), new gug("SubSecTimeDigitized", 37522, 2), new gug("FlashpixVersion", 40960, 7), new gug("ColorSpace", 40961, 3), new gug("PixelXDimension", 40962, 3, 4), new gug("PixelYDimension", 40963, 3, 4), new gug("RelatedSoundFile", 40964, 2), new gug("InteroperabilityIFDPointer", 40965, 4), new gug("FlashEnergy", 41483, 5), new gug("SpatialFrequencyResponse", 41484, 7), new gug("FocalPlaneXResolution", 41486, 5), new gug("FocalPlaneYResolution", 41487, 5), new gug("FocalPlaneResolutionUnit", 41488, 3), new gug("SubjectLocation", 41492, 3), new gug("ExposureIndex", 41493, 5), new gug("SensingMethod", 41495, 3), new gug("FileSource", 41728, 7), new gug("SceneType", 41729, 7), new gug("CFAPattern", 41730, 7), new gug("CustomRendered", 41985, 3), new gug("ExposureMode", 41986, 3), new gug("WhiteBalance", 41987, 3), new gug("DigitalZoomRatio", 41988, 5), new gug("FocalLengthIn35mmFilm", 41989, 3), new gug("SceneCaptureType", 41990, 3), new gug("GainControl", 41991, 3), new gug("Contrast", 41992, 3), new gug("Saturation", 41993, 3), new gug("Sharpness", 41994, 3), new gug("DeviceSettingDescription", 41995, 7), new gug("SubjectDistanceRange", 41996, 3), new gug("ImageUniqueID", 42016, 2), new gug("CameraOwnerName", 42032, 2), new gug("BodySerialNumber", 42033, 2), new gug("LensSpecification", 42034, 5), new gug("LensMake", 42035, 2), new gug("LensModel", 42036, 2), new gug("Gamma", 42240, 5), new gug("DNGVersion", 50706, 1), new gug("DefaultCropSize", 50720, 3, 4)};
        P = gugVarArr2;
        gug[] gugVarArr3 = {new gug("GPSVersionID", 0, 1), new gug("GPSLatitudeRef", 1, 2), new gug("GPSLatitude", 2, 5, 10), new gug("GPSLongitudeRef", 3, 2), new gug("GPSLongitude", 4, 5, 10), new gug("GPSAltitudeRef", 5, 1), new gug("GPSAltitude", 6, 5), new gug("GPSTimeStamp", 7, 5), new gug("GPSSatellites", 8, 2), new gug("GPSStatus", 9, 2), new gug("GPSMeasureMode", 10, 2), new gug("GPSDOP", 11, 5), new gug("GPSSpeedRef", 12, 2), new gug("GPSSpeed", 13, 5), new gug("GPSTrackRef", 14, 2), new gug("GPSTrack", 15, 5), new gug("GPSImgDirectionRef", 16, 2), new gug("GPSImgDirection", 17, 5), new gug("GPSMapDatum", 18, 2), new gug("GPSDestLatitudeRef", 19, 2), new gug("GPSDestLatitude", 20, 5), new gug("GPSDestLongitudeRef", 21, 2), new gug("GPSDestLongitude", 22, 5), new gug("GPSDestBearingRef", 23, 2), new gug("GPSDestBearing", 24, 5), new gug("GPSDestDistanceRef", 25, 2), new gug("GPSDestDistance", 26, 5), new gug("GPSProcessingMethod", 27, 7), new gug("GPSAreaInformation", 28, 7), new gug("GPSDateStamp", 29, 2), new gug("GPSDifferential", 30, 3), new gug("GPSHPositioningError", 31, 5)};
        Q = gugVarArr3;
        gug[] gugVarArr4 = {new gug("InteroperabilityIndex", 1, 2)};
        R = gugVarArr4;
        gug[] gugVarArr5 = {new gug("NewSubfileType", 254, 4), new gug("SubfileType", 255, 4), new gug("ThumbnailImageWidth", 256, 3, 4), new gug("ThumbnailImageLength", 257, 3, 4), new gug("BitsPerSample", 258, 3), new gug("Compression", 259, 3), new gug("PhotometricInterpretation", 262, 3), new gug("ImageDescription", 270, 2), new gug("Make", 271, 2), new gug("Model", 272, 2), new gug("StripOffsets", 273, 3, 4), new gug("ThumbnailOrientation", 274, 3), new gug("SamplesPerPixel", 277, 3), new gug("RowsPerStrip", 278, 3, 4), new gug("StripByteCounts", 279, 3, 4), new gug("XResolution", 282, 5), new gug("YResolution", 283, 5), new gug("PlanarConfiguration", 284, 3), new gug("ResolutionUnit", 296, 3), new gug("TransferFunction", 301, 3), new gug("Software", 305, 2), new gug("DateTime", 306, 2), new gug("Artist", 315, 2), new gug("WhitePoint", 318, 5), new gug("PrimaryChromaticities", 319, 5), new gug("SubIFDPointer", 330, 4), new gug("JPEGInterchangeFormat", 513, 4), new gug("JPEGInterchangeFormatLength", 514, 4), new gug("YCbCrCoefficients", 529, 5), new gug("YCbCrSubSampling", 530, 3), new gug("YCbCrPositioning", 531, 3), new gug("ReferenceBlackWhite", 532, 5), new gug("Copyright", 33432, 2), new gug("ExifIFDPointer", 34665, 4), new gug("GPSInfoIFDPointer", 34853, 4), new gug("DNGVersion", 50706, 1), new gug("DefaultCropSize", 50720, 3, 4)};
        S = gugVarArr5;
        T = new gug("StripOffsets", 273, 3);
        gug[] gugVarArr6 = {new gug("ThumbnailImage", 256, 7), new gug("CameraSettingsIFDPointer", 8224, 4), new gug("ImageProcessingIFDPointer", 8256, 4)};
        U = gugVarArr6;
        gug[] gugVarArr7 = {new gug("PreviewImageStart", 257, 4), new gug("PreviewImageLength", 258, 4)};
        V = gugVarArr7;
        gug[] gugVarArr8 = {new gug("AspectFrame", 4371, 3)};
        W = gugVarArr8;
        gug[] gugVarArr9 = {new gug("ColorSpace", 55, 3)};
        X = gugVarArr9;
        k = new gug[][]{gugVarArr, gugVarArr2, gugVarArr3, gugVarArr4, gugVarArr5, gugVarArr, gugVarArr6, gugVarArr7, gugVarArr8, gugVarArr9};
        Y = new gug[]{new gug("SubIFDPointer", 330, 4), new gug("ExifIFDPointer", 34665, 4), new gug("GPSInfoIFDPointer", 34853, 4), new gug("InteroperabilityIFDPointer", 40965, 4), new gug("CameraSettingsIFDPointer", 8224, 1), new gug("ImageProcessingIFDPointer", 8256, 1)};
        y = new HashMap[10];
        z = new HashMap[10];
        A = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        B = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        h = forName;
        i = "Exif\u0000\u0000".getBytes(forName);
        C = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        w = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        x = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            gug[][] gugVarArr10 = k;
            int length = gugVarArr10.length;
            if (i2 >= 10) {
                gug[] gugVarArr11 = Y;
                Integer valueOf = Integer.valueOf(gugVarArr11[0].b);
                HashMap hashMap = B;
                hashMap.put(valueOf, 5);
                hashMap.put(Integer.valueOf(gugVarArr11[1].b), 1);
                hashMap.put(Integer.valueOf(gugVarArr11[2].b), 2);
                hashMap.put(Integer.valueOf(gugVarArr11[3].b), 3);
                hashMap.put(Integer.valueOf(gugVarArr11[4].b), 7);
                hashMap.put(Integer.valueOf(gugVarArr11[5].b), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            y[i2] = new HashMap();
            z[i2] = new HashMap();
            for (gug gugVar : gugVarArr10[i2]) {
                y[i2].put(Integer.valueOf(gugVar.b), gugVar);
                z[i2].put(gugVar.d, gugVar);
            }
            i2++;
        }
    }

    public adj(InputStream inputStream) {
        int length = k.length;
        this.G = new HashMap[10];
        this.H = new HashSet(10);
        this.j = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.E = (AssetManager.AssetInputStream) inputStream;
            this.D = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.E = null;
                    this.D = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.E = null;
            this.D = null;
        }
        i(inputStream);
    }

    private final void c() {
        String b2 = b("DateTimeOriginal");
        if (b2 != null && b("DateTime") == null) {
            this.G[0].put("DateTime", adh.b(b2));
        }
        if (b("ImageWidth") == null) {
            this.G[0].put("ImageWidth", adh.c(0L, this.j));
        }
        if (b("ImageLength") == null) {
            this.G[0].put("ImageLength", adh.c(0L, this.j));
        }
        if (b("Orientation") == null) {
            this.G[0].put("Orientation", adh.c(0L, this.j));
        }
        if (b("LightSource") == null) {
            this.G[1].put("LightSource", adh.c(0L, this.j));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        r19.c = r18.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d(adg adgVar, int i2, int i3) {
        int i4;
        adgVar.c = ByteOrder.BIG_ENDIAN;
        byte readByte = adgVar.readByte();
        byte b2 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: ".concat(String.valueOf(Integer.toHexString(readByte & 255))));
        }
        if (adgVar.readByte() != -40) {
            throw new IOException("Invalid marker: ".concat(String.valueOf(Integer.toHexString(255))));
        }
        int i5 = 2;
        while (true) {
            byte readByte2 = adgVar.readByte();
            if (readByte2 != b2) {
                throw new IOException("Invalid marker:".concat(String.valueOf(Integer.toHexString(readByte2 & 255))));
            }
            while (true) {
                byte readByte3 = adgVar.readByte();
                int i6 = i5 + 1;
                if (readByte3 == b2) {
                    i5 = i6;
                } else if (readByte3 != -39 && readByte3 != -38) {
                    int readUnsignedShort = adgVar.readUnsignedShort();
                    int i7 = readUnsignedShort - 2;
                    int i8 = i5 + 4;
                    if (i7 < 0) {
                        throw new IOException("Invalid length");
                    }
                    int i9 = 0;
                    if (readByte3 == -31) {
                        byte[] bArr = new byte[i7];
                        adgVar.readFully(bArr);
                        int i10 = i8 + i7;
                        byte[] bArr2 = i;
                        if (yi.f(bArr, bArr2)) {
                            int length = bArr2.length;
                            byte[] copyOfRange = Arrays.copyOfRange(bArr, length, i7);
                            this.J = i2 + i8 + length;
                            k(copyOfRange, i3);
                            m(new adg(copyOfRange));
                            i8 = i10;
                        } else {
                            byte[] bArr3 = C;
                            if (yi.f(bArr, bArr3)) {
                                int length2 = bArr3.length;
                                int i11 = i8 + length2;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2, i7);
                                i4 = i10;
                                this.N = new adh(1, copyOfRange2.length, i11, copyOfRange2);
                            } else {
                                i4 = i10;
                            }
                            i8 = i4;
                        }
                    } else if (readByte3 != -2) {
                        switch (readByte3) {
                            default:
                                switch (readByte3) {
                                    default:
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                }
                                            case -55:
                                            case -54:
                                            case -53:
                                                adgVar.b(1);
                                                HashMap[] hashMapArr = this.G;
                                                hashMapArr[i3].put(i3 != 4 ? "ImageLength" : "ThumbnailImageLength", adh.c(adgVar.readUnsignedShort(), this.j));
                                                hashMapArr[i3].put(i3 != 4 ? "ImageWidth" : "ThumbnailImageWidth", adh.c(adgVar.readUnsignedShort(), this.j));
                                                i7 = readUnsignedShort - 7;
                                                break;
                                        }
                                    case -59:
                                    case -58:
                                    case -57:
                                        break;
                                }
                            case -64:
                            case -63:
                            case -62:
                            case -61:
                                break;
                        }
                        i9 = i7;
                    } else {
                        byte[] bArr4 = new byte[i7];
                        adgVar.readFully(bArr4);
                        if (b("UserComment") == null) {
                            this.G[1].put("UserComment", adh.b(new String(bArr4, h)));
                        }
                    }
                    if (i9 < 0) {
                        throw new IOException("Invalid length");
                    }
                    adgVar.b(i9);
                    i5 = i8 + i9;
                    b2 = -1;
                }
            }
        }
    }

    private final void e(adg adgVar) {
        byte[] bArr;
        int length;
        adgVar.c = ByteOrder.BIG_ENDIAN;
        int i2 = adgVar.b;
        int length2 = s.length;
        adgVar.b(8);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2) {
                if (z3) {
                    return;
                } else {
                    z3 = false;
                }
            }
            try {
                int readInt = adgVar.readInt();
                int readInt2 = adgVar.readInt();
                int i3 = adgVar.b;
                int i4 = i3 + readInt;
                int i5 = i3 - i2;
                if (i5 == 16) {
                    if (readInt2 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    i5 = 16;
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774) {
                    if (z2) {
                        continue;
                    } else {
                        this.J = i5;
                        byte[] bArr2 = new byte[readInt];
                        adgVar.readFully(bArr2);
                        int readInt3 = adgVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(101);
                        crc32.update(25944);
                        crc32.update(6641737);
                        crc32.update(1700284774);
                        crc32.update(bArr2);
                        if (((int) crc32.getValue()) != readInt3) {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                        }
                        k(bArr2, 0);
                        o();
                        m(new adg(bArr2));
                        z2 = true;
                    }
                } else if (readInt2 == 1767135348 && !z3 && readInt >= (length = (bArr = d).length)) {
                    byte[] bArr3 = new byte[length];
                    adgVar.readFully(bArr3);
                    if (Arrays.equals(bArr3, bArr)) {
                        int i6 = adgVar.b - i2;
                        int i7 = readInt - length;
                        byte[] bArr4 = new byte[i7];
                        adgVar.readFully(bArr4);
                        this.N = new adh(1, i7, i6, bArr4);
                        z3 = true;
                    }
                }
                adgVar.b((i4 + 4) - adgVar.b);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    private final void f(adg adgVar) {
        adgVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = t.length;
        adgVar.b(4);
        int readInt = adgVar.readInt() + 8;
        int length2 = u.length;
        adgVar.b(4);
        int i2 = 12;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                adgVar.readFully(bArr);
                int readInt2 = adgVar.readInt();
                int i3 = i2 + 8;
                if (Arrays.equals(v, bArr)) {
                    byte[] bArr2 = new byte[readInt2];
                    adgVar.readFully(bArr2);
                    byte[] bArr3 = i;
                    if (yi.f(bArr2, bArr3)) {
                        bArr2 = Arrays.copyOfRange(bArr2, bArr3.length, readInt2);
                    }
                    this.J = i3;
                    k(bArr2, 0);
                    m(new adg(bArr2));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                i2 = i3 + readInt2;
                if (i2 == readInt) {
                    return;
                }
                if (i2 > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                adgVar.b(readInt2);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void g(adg adgVar, HashMap hashMap) {
        adh adhVar = (adh) hashMap.get("JPEGInterchangeFormat");
        adh adhVar2 = (adh) hashMap.get("JPEGInterchangeFormatLength");
        if (adhVar == null || adhVar2 == null) {
            return;
        }
        int a2 = adhVar.a(this.j);
        int a3 = adhVar2.a(this.j);
        if (this.F == 7) {
            a2 += this.K;
        }
        if (a2 <= 0 || a3 <= 0 || this.E != null || this.D != null) {
            return;
        }
        adgVar.b(a2);
        adgVar.readFully(new byte[a3]);
    }

    private final void h(adg adgVar, HashMap hashMap) {
        int length;
        int length2;
        byte[] bArr;
        adh adhVar = (adh) hashMap.get("StripOffsets");
        adh adhVar2 = (adh) hashMap.get("StripByteCounts");
        if (adhVar == null || adhVar2 == null) {
            return;
        }
        long[] g2 = yi.g(adhVar.f(this.j));
        long[] g3 = yi.g(adhVar2.f(this.j));
        if (g2 == null || (length = g2.length) == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (g3 == null || (length2 = g3.length) == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (length != length2) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j = 0;
        for (long j2 : g3) {
            j += j2;
        }
        byte[] bArr2 = new byte[(int) j];
        this.I = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int length3 = g2.length;
            if (i2 >= length3) {
                if (this.I) {
                    long j3 = g2[0];
                    return;
                }
                return;
            }
            int i5 = (int) g2[i2];
            int i6 = (int) g3[i2];
            if (i2 < length3 - 1) {
                bArr = bArr2;
                if (i5 + i6 != g2[i2 + 1]) {
                    this.I = false;
                }
            } else {
                bArr = bArr2;
            }
            int i7 = i5 - i3;
            if (i7 < 0) {
                return;
            }
            try {
                adgVar.b(i7);
                int i8 = i3 + i7;
                byte[] bArr3 = new byte[i6];
                adgVar.readFully(bArr3);
                i2++;
                i3 = i8 + i6;
                System.arraycopy(bArr3, 0, bArr, i4, i6);
                i4 += i6;
                bArr2 = bArr;
            } catch (EOFException unused) {
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:29|(2:(2:34|(6:36|(1:38)(2:59|(1:61))|39|(1:42)|43|(3:45|(2:50|(3:54|(1:56)|57))|58)))(2:66|(4:68|(1:70)|71|(1:74))(1:75))|62)|76|(2:81|82)|83|84|85|(1:87)(2:122|(1:124)(1:125))|(1:89)|(1:91)|(3:93|(2:95|(2:97|(1:99))(1:101))(1:102)|100)|(2:105|(2:107|(1:109)(2:110|111))(2:112|113))|114|(1:117)|118|119|62) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039f A[Catch: all -> 0x043e, IOException | UnsupportedOperationException -> 0x0443, IOException | UnsupportedOperationException -> 0x0443, TryCatch #1 {IOException | UnsupportedOperationException -> 0x0443, blocks: (B:3:0x0007, B:5:0x000e, B:7:0x001a, B:8:0x002f, B:10:0x0044, B:14:0x004c, B:15:0x0058, B:17:0x005b, B:21:0x0061, B:161:0x0086, B:161:0x0086, B:168:0x00af, B:168:0x00af, B:172:0x00cc, B:172:0x00cc, B:174:0x00d1, B:174:0x00d1, B:179:0x00d9, B:179:0x00d9, B:181:0x00de, B:181:0x00de, B:183:0x00e7, B:183:0x00e7, B:188:0x00ec, B:188:0x00ec, B:190:0x00f1, B:190:0x00f1, B:192:0x00fb, B:192:0x00fb, B:176:0x0100, B:176:0x0100, B:206:0x00c0, B:206:0x00c0, B:207:0x00c3, B:207:0x00c3, B:202:0x00c7, B:202:0x00c7, B:219:0x0094, B:219:0x0094, B:220:0x0097, B:220:0x0097, B:215:0x009b, B:215:0x009b, B:23:0x0116, B:23:0x0116, B:29:0x0127, B:29:0x0127, B:34:0x013b, B:34:0x013b, B:36:0x014c, B:36:0x014c, B:38:0x0177, B:38:0x0177, B:39:0x0188, B:39:0x0188, B:42:0x01a3, B:42:0x01a3, B:43:0x01b1, B:43:0x01b1, B:45:0x01bd, B:45:0x01bd, B:47:0x01c7, B:47:0x01c7, B:50:0x01cb, B:50:0x01cb, B:52:0x01d2, B:52:0x01d2, B:54:0x01d8, B:54:0x01d8, B:56:0x01e0, B:56:0x01e0, B:57:0x01e4, B:57:0x01e4, B:58:0x01fc, B:58:0x01fc, B:59:0x017d, B:59:0x017d, B:61:0x0183, B:61:0x0183, B:62:0x037c, B:62:0x037c, B:68:0x0215, B:68:0x0215, B:70:0x0226, B:70:0x0226, B:71:0x0233, B:71:0x0233, B:74:0x0249, B:74:0x0249, B:75:0x0250, B:75:0x0250, B:78:0x025a, B:78:0x025a, B:81:0x025f, B:81:0x025f, B:82:0x0266, B:82:0x0266, B:83:0x0267, B:83:0x0267, B:119:0x0379, B:128:0x0392, B:129:0x0395, B:129:0x0395, B:135:0x0396, B:135:0x0396, B:137:0x039f, B:137:0x039f, B:139:0x03a7, B:139:0x03a7, B:141:0x03ae, B:141:0x03ae, B:143:0x03ff, B:143:0x03ff, B:147:0x040d, B:147:0x040d, B:145:0x0430, B:145:0x0430, B:150:0x043a, B:150:0x043a, B:19:0x0105, B:19:0x0105, B:12:0x010d, B:12:0x010d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00d1 A[Catch: all -> 0x043e, IOException | UnsupportedOperationException -> 0x0443, IOException | UnsupportedOperationException -> 0x0443, TryCatch #1 {IOException | UnsupportedOperationException -> 0x0443, blocks: (B:3:0x0007, B:5:0x000e, B:7:0x001a, B:8:0x002f, B:10:0x0044, B:14:0x004c, B:15:0x0058, B:17:0x005b, B:21:0x0061, B:161:0x0086, B:161:0x0086, B:168:0x00af, B:168:0x00af, B:172:0x00cc, B:172:0x00cc, B:174:0x00d1, B:174:0x00d1, B:179:0x00d9, B:179:0x00d9, B:181:0x00de, B:181:0x00de, B:183:0x00e7, B:183:0x00e7, B:188:0x00ec, B:188:0x00ec, B:190:0x00f1, B:190:0x00f1, B:192:0x00fb, B:192:0x00fb, B:176:0x0100, B:176:0x0100, B:206:0x00c0, B:206:0x00c0, B:207:0x00c3, B:207:0x00c3, B:202:0x00c7, B:202:0x00c7, B:219:0x0094, B:219:0x0094, B:220:0x0097, B:220:0x0097, B:215:0x009b, B:215:0x009b, B:23:0x0116, B:23:0x0116, B:29:0x0127, B:29:0x0127, B:34:0x013b, B:34:0x013b, B:36:0x014c, B:36:0x014c, B:38:0x0177, B:38:0x0177, B:39:0x0188, B:39:0x0188, B:42:0x01a3, B:42:0x01a3, B:43:0x01b1, B:43:0x01b1, B:45:0x01bd, B:45:0x01bd, B:47:0x01c7, B:47:0x01c7, B:50:0x01cb, B:50:0x01cb, B:52:0x01d2, B:52:0x01d2, B:54:0x01d8, B:54:0x01d8, B:56:0x01e0, B:56:0x01e0, B:57:0x01e4, B:57:0x01e4, B:58:0x01fc, B:58:0x01fc, B:59:0x017d, B:59:0x017d, B:61:0x0183, B:61:0x0183, B:62:0x037c, B:62:0x037c, B:68:0x0215, B:68:0x0215, B:70:0x0226, B:70:0x0226, B:71:0x0233, B:71:0x0233, B:74:0x0249, B:74:0x0249, B:75:0x0250, B:75:0x0250, B:78:0x025a, B:78:0x025a, B:81:0x025f, B:81:0x025f, B:82:0x0266, B:82:0x0266, B:83:0x0267, B:83:0x0267, B:119:0x0379, B:128:0x0392, B:129:0x0395, B:129:0x0395, B:135:0x0396, B:135:0x0396, B:137:0x039f, B:137:0x039f, B:139:0x03a7, B:139:0x03a7, B:141:0x03ae, B:141:0x03ae, B:143:0x03ff, B:143:0x03ff, B:147:0x040d, B:147:0x040d, B:145:0x0430, B:145:0x0430, B:150:0x043a, B:150:0x043a, B:19:0x0105, B:19:0x0105, B:12:0x010d, B:12:0x010d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0103 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void i(InputStream inputStream) {
        int i2;
        int i3;
        int i4;
        int i5;
        MediaMetadataRetriever mediaMetadataRetriever;
        String str;
        String str2;
        int i6;
        int i7;
        adg adgVar;
        adg adgVar2;
        int i8;
        short readShort;
        int i9 = 0;
        while (true) {
            try {
                try {
                    int length = k.length;
                    if (i9 >= 10) {
                        break;
                    }
                    this.G[i9] = new HashMap();
                    i9++;
                } catch (IOException | UnsupportedOperationException unused) {
                }
            } finally {
                c();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr2 = c;
            int length2 = bArr2.length;
            String str3 = null;
            adg adgVar3 = null;
            adg adgVar4 = null;
            if (i10 >= 3) {
                i2 = 3;
                i3 = 4;
                break;
            }
            i2 = 3;
            if (bArr[i10] != bArr2[i10]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                int i11 = 0;
                while (true) {
                    if (i11 >= bytes.length) {
                        i3 = 9;
                        break;
                    }
                    if (bArr[i11] != bytes[i11]) {
                        i3 = t(bArr);
                        if (i3 == 0) {
                            try {
                                adgVar = new adg(bArr);
                            } catch (Exception unused2) {
                                adgVar = null;
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                ByteOrder u2 = u(adgVar);
                                this.j = u2;
                                adgVar.c = u2;
                                short readShort2 = adgVar.readShort();
                                Object[] objArr = readShort2 == 20306 || readShort2 == 21330;
                                adgVar.close();
                                if (objArr != false) {
                                    i3 = 7;
                                }
                            } catch (Exception unused3) {
                                if (adgVar != null) {
                                    adgVar.close();
                                }
                                adgVar2 = new adg(bArr);
                                try {
                                    ByteOrder u3 = u(adgVar2);
                                    this.j = u3;
                                    adgVar2.c = u3;
                                    readShort = adgVar2.readShort();
                                    adgVar2.close();
                                    if (readShort == 85) {
                                    }
                                } catch (Exception unused4) {
                                    if (adgVar2 != null) {
                                        adgVar2.close();
                                    }
                                    i8 = 0;
                                    while (true) {
                                        byte[] bArr3 = s;
                                        int length3 = bArr3.length;
                                        if (i8 >= 8) {
                                        }
                                        i8++;
                                    }
                                    this.F = i3;
                                    if (i3 != 4) {
                                    }
                                    adg adgVar5 = new adg(bufferedInputStream);
                                    i4 = this.F;
                                    if (i4 != 4) {
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    adgVar3 = adgVar2;
                                    if (adgVar3 != null) {
                                        adgVar3.close();
                                    }
                                    throw th;
                                }
                                i8 = 0;
                                while (true) {
                                    byte[] bArr32 = s;
                                    int length32 = bArr32.length;
                                    if (i8 >= 8) {
                                    }
                                    i8++;
                                }
                                this.F = i3;
                                if (i3 != 4 || i3 == 9 || i3 == 13 || i3 == 14) {
                                    adg adgVar52 = new adg(bufferedInputStream);
                                    i4 = this.F;
                                    if (i4 != 4) {
                                        d(adgVar52, 0, 0);
                                    } else if (i4 == 13) {
                                        e(adgVar52);
                                    } else if (i4 == 9) {
                                        adgVar52.b(84);
                                        byte[] bArr4 = new byte[4];
                                        byte[] bArr5 = new byte[4];
                                        byte[] bArr6 = new byte[4];
                                        adgVar52.readFully(bArr4);
                                        adgVar52.readFully(bArr5);
                                        adgVar52.readFully(bArr6);
                                        int i12 = ByteBuffer.wrap(bArr4).getInt();
                                        int i13 = ByteBuffer.wrap(bArr5).getInt();
                                        int i14 = ByteBuffer.wrap(bArr6).getInt();
                                        byte[] bArr7 = new byte[i13];
                                        adgVar52.b(i12 - adgVar52.b);
                                        adgVar52.readFully(bArr7);
                                        d(new adg(bArr7), i12, 5);
                                        adgVar52.b(i14 - adgVar52.b);
                                        adgVar52.c = ByteOrder.BIG_ENDIAN;
                                        int readInt = adgVar52.readInt();
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 >= readInt) {
                                                break;
                                            }
                                            int readUnsignedShort = adgVar52.readUnsignedShort();
                                            int readUnsignedShort2 = adgVar52.readUnsignedShort();
                                            if (readUnsignedShort == T.b) {
                                                short readShort3 = adgVar52.readShort();
                                                short readShort4 = adgVar52.readShort();
                                                adh e2 = adh.e(readShort3, this.j);
                                                adh e3 = adh.e(readShort4, this.j);
                                                HashMap[] hashMapArr = this.G;
                                                hashMapArr[0].put("ImageLength", e2);
                                                hashMapArr[0].put("ImageWidth", e3);
                                                break;
                                            }
                                            adgVar52.b(readUnsignedShort2);
                                            i15++;
                                        }
                                    } else if (i4 == 14) {
                                        f(adgVar52);
                                    }
                                } else {
                                    adg adgVar6 = new adg(bufferedInputStream, (byte[]) null);
                                    int i16 = this.F;
                                    try {
                                        try {
                                            if (i16 != 12 && i16 != 15) {
                                                if (i16 == 7) {
                                                    q(adgVar6);
                                                    HashMap[] hashMapArr2 = this.G;
                                                    adh adhVar = (adh) hashMapArr2[1].get("MakerNote");
                                                    if (adhVar != null) {
                                                        adg adgVar7 = new adg(adhVar.d, (byte[]) null);
                                                        adgVar7.c = this.j;
                                                        byte[] bArr8 = q;
                                                        int length4 = bArr8.length;
                                                        byte[] bArr9 = new byte[6];
                                                        adgVar7.readFully(bArr9);
                                                        adgVar7.c(0L);
                                                        byte[] bArr10 = r;
                                                        int length5 = bArr10.length;
                                                        byte[] bArr11 = new byte[10];
                                                        adgVar7.readFully(bArr11);
                                                        if (Arrays.equals(bArr9, bArr8)) {
                                                            adgVar7.c(8L);
                                                        } else if (Arrays.equals(bArr11, bArr10)) {
                                                            adgVar7.c(12L);
                                                        }
                                                        r(adgVar7, 6);
                                                        adh adhVar2 = (adh) hashMapArr2[7].get("PreviewImageStart");
                                                        adh adhVar3 = (adh) hashMapArr2[7].get("PreviewImageLength");
                                                        if (adhVar2 != null && adhVar3 != null) {
                                                            hashMapArr2[5].put("JPEGInterchangeFormat", adhVar2);
                                                            hashMapArr2[5].put("JPEGInterchangeFormatLength", adhVar3);
                                                        }
                                                        adh adhVar4 = (adh) hashMapArr2[8].get("AspectFrame");
                                                        if (adhVar4 != null) {
                                                            int[] iArr = (int[]) adhVar4.f(this.j);
                                                            if (iArr != null && iArr.length == 4) {
                                                                int i17 = iArr[2];
                                                                int i18 = iArr[0];
                                                                if (i17 > i18 && (i6 = iArr[i2]) > (i7 = iArr[1])) {
                                                                    int i19 = (i17 - i18) + 1;
                                                                    int i20 = (i6 - i7) + 1;
                                                                    if (i19 < i20) {
                                                                        int i21 = i19 + i20;
                                                                        i20 = i21 - i20;
                                                                        i19 = i21 - i20;
                                                                    }
                                                                    adh e4 = adh.e(i19, this.j);
                                                                    adh e5 = adh.e(i20, this.j);
                                                                    hashMapArr2[0].put("ImageWidth", e4);
                                                                    hashMapArr2[0].put("ImageLength", e5);
                                                                }
                                                            }
                                                            Log.w("ExifInterface", "Invalid aspect frame values. frame=".concat(String.valueOf(Arrays.toString(iArr))));
                                                        }
                                                    }
                                                } else if (i16 == 10) {
                                                    q(adgVar6);
                                                    HashMap[] hashMapArr3 = this.G;
                                                    adh adhVar5 = (adh) hashMapArr3[0].get("JpgFromRaw");
                                                    if (adhVar5 != null) {
                                                        d(new adg(adhVar5.d), (int) adhVar5.c, 5);
                                                    }
                                                    adh adhVar6 = (adh) hashMapArr3[0].get("ISO");
                                                    adh adhVar7 = (adh) hashMapArr3[1].get("PhotographicSensitivity");
                                                    if (adhVar6 != null && adhVar7 == null) {
                                                        hashMapArr3[1].put("PhotographicSensitivity", adhVar6);
                                                    }
                                                } else {
                                                    q(adgVar6);
                                                }
                                                adgVar6.c(this.J);
                                                m(adgVar6);
                                            }
                                            mediaMetadataRetriever.setDataSource(new adf(adgVar6));
                                            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                                            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                                            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                                            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                                            if ("yes".equals(extractMetadata3)) {
                                                str3 = mediaMetadataRetriever.extractMetadata(29);
                                                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(30);
                                                str2 = mediaMetadataRetriever.extractMetadata(31);
                                                str = extractMetadata5;
                                            } else if ("yes".equals(extractMetadata4)) {
                                                str3 = mediaMetadataRetriever.extractMetadata(18);
                                                str = mediaMetadataRetriever.extractMetadata(19);
                                                str2 = mediaMetadataRetriever.extractMetadata(24);
                                            } else {
                                                str = null;
                                                str2 = null;
                                            }
                                            if (str3 != null) {
                                                this.G[0].put("ImageWidth", adh.e(Integer.parseInt(str3), this.j));
                                            }
                                            if (str != null) {
                                                this.G[0].put("ImageLength", adh.e(Integer.parseInt(str), this.j));
                                            }
                                            if (str2 != null) {
                                                int parseInt = Integer.parseInt(str2);
                                                if (parseInt == 90) {
                                                    i5 = 6;
                                                } else if (parseInt == 180) {
                                                    i5 = i2;
                                                } else if (parseInt != 270) {
                                                    i5 = 1;
                                                }
                                                this.G[0].put("Orientation", adh.e(i5, this.j));
                                            }
                                            if (extractMetadata != null && extractMetadata2 != null) {
                                                int parseInt2 = Integer.parseInt(extractMetadata);
                                                int parseInt3 = Integer.parseInt(extractMetadata2);
                                                if (parseInt3 <= 6) {
                                                    throw new IOException("Invalid exif length");
                                                }
                                                adgVar6.c(parseInt2);
                                                byte[] bArr12 = new byte[6];
                                                adgVar6.readFully(bArr12);
                                                int i22 = parseInt2 + 6;
                                                int i23 = parseInt3 - 6;
                                                if (!Arrays.equals(bArr12, i)) {
                                                    throw new IOException("Invalid identifier");
                                                }
                                                byte[] bArr13 = new byte[i23];
                                                adgVar6.readFully(bArr13);
                                                this.J = i22;
                                                k(bArr13, 0);
                                            }
                                            String extractMetadata6 = mediaMetadataRetriever.extractMetadata(41);
                                            String extractMetadata7 = mediaMetadataRetriever.extractMetadata(42);
                                            if (extractMetadata6 != null && extractMetadata7 != null) {
                                                int parseInt4 = Integer.parseInt(extractMetadata6);
                                                int parseInt5 = Integer.parseInt(extractMetadata7);
                                                long j = parseInt4;
                                                adgVar6.c(j);
                                                byte[] bArr14 = new byte[parseInt5];
                                                adgVar6.readFully(bArr14);
                                                this.N = new adh(1, parseInt5, j, bArr14);
                                            }
                                            adgVar6.c(this.J);
                                            m(adgVar6);
                                        } catch (RuntimeException e6) {
                                            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e6);
                                        }
                                    } finally {
                                        try {
                                            mediaMetadataRetriever.release();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    i5 = 8;
                                    if (i16 == 15 && Build.VERSION.SDK_INT < 31) {
                                        throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
                                    }
                                    mediaMetadataRetriever = new MediaMetadataRetriever();
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                adgVar4 = adgVar;
                                if (adgVar4 != null) {
                                    adgVar4.close();
                                }
                                throw th;
                            }
                            try {
                                adgVar2 = new adg(bArr);
                                ByteOrder u32 = u(adgVar2);
                                this.j = u32;
                                adgVar2.c = u32;
                                readShort = adgVar2.readShort();
                                adgVar2.close();
                                if (readShort == 85) {
                                    i3 = 10;
                                }
                            } catch (Exception unused6) {
                                adgVar2 = null;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            i8 = 0;
                            while (true) {
                                byte[] bArr322 = s;
                                int length322 = bArr322.length;
                                if (i8 >= 8) {
                                    i3 = 13;
                                    break;
                                }
                                if (bArr[i8] != bArr322[i8]) {
                                    int i24 = 0;
                                    while (true) {
                                        byte[] bArr15 = t;
                                        int length6 = bArr15.length;
                                        if (i24 >= 4) {
                                            int i25 = 0;
                                            while (true) {
                                                byte[] bArr16 = u;
                                                int length7 = bArr16.length;
                                                if (i25 >= 4) {
                                                    i3 = 14;
                                                    break;
                                                }
                                                int length8 = bArr15.length;
                                                if (bArr[i25 + 8] != bArr16[i25]) {
                                                    break;
                                                } else {
                                                    i25++;
                                                }
                                            }
                                        } else if (bArr[i24] != bArr15[i24]) {
                                            break;
                                        } else {
                                            i24++;
                                        }
                                    }
                                    i3 = 0;
                                } else {
                                    i8++;
                                }
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    private final void j(adg adgVar) {
        ByteOrder u2 = u(adgVar);
        this.j = u2;
        adgVar.c = u2;
        int readUnsignedShort = adgVar.readUnsignedShort();
        int i2 = this.F;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(readUnsignedShort))));
        }
        int readInt = adgVar.readInt();
        if (readInt < 8) {
            throw new IOException(a.Y(readInt, "Invalid first Ifd offset: "));
        }
        int i3 = readInt - 8;
        if (i3 > 0) {
            adgVar.b(i3);
        }
    }

    private final void k(byte[] bArr, int i2) {
        adg adgVar = new adg(bArr, (byte[]) null);
        j(adgVar);
        r(adgVar, i2);
    }

    private final void l(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i2].isEmpty() || hashMapArr[i2].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i2];
        hashMap.put(str2, (adh) hashMap.get(str));
        hashMapArr[i2].remove(str);
    }

    private final void m(adg adgVar) {
        adh adhVar;
        HashMap hashMap = this.G[4];
        adh adhVar2 = (adh) hashMap.get("Compression");
        if (adhVar2 == null) {
            g(adgVar, hashMap);
            return;
        }
        int a2 = adhVar2.a(this.j);
        if (a2 != 1) {
            if (a2 == 6) {
                g(adgVar, hashMap);
                return;
            } else if (a2 != 7) {
                return;
            }
        }
        adh adhVar3 = (adh) hashMap.get("BitsPerSample");
        if (adhVar3 != null) {
            int[] iArr = (int[]) adhVar3.f(this.j);
            int[] iArr2 = a;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.F != 3 || (adhVar = (adh) hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int a3 = adhVar.a(this.j);
                if (a3 == 1) {
                    if (!Arrays.equals(iArr, b)) {
                        return;
                    }
                } else if (a3 != 6 || !Arrays.equals(iArr, iArr2)) {
                    return;
                }
            }
            h(adgVar, hashMap);
        }
    }

    private final void n(int i2, int i3) {
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i2].isEmpty() || hashMapArr[i3].isEmpty()) {
            return;
        }
        adh adhVar = (adh) hashMapArr[i2].get("ImageLength");
        adh adhVar2 = (adh) hashMapArr[i2].get("ImageWidth");
        adh adhVar3 = (adh) hashMapArr[i3].get("ImageLength");
        adh adhVar4 = (adh) hashMapArr[i3].get("ImageWidth");
        if (adhVar == null || adhVar2 == null || adhVar3 == null || adhVar4 == null) {
            return;
        }
        int a2 = adhVar.a(this.j);
        int a3 = adhVar2.a(this.j);
        int a4 = adhVar3.a(this.j);
        int a5 = adhVar4.a(this.j);
        if (a2 >= a4 || a3 >= a5) {
            return;
        }
        HashMap hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    private final void o() {
        n(0, 5);
        n(0, 4);
        n(5, 4);
        HashMap[] hashMapArr = this.G;
        adh adhVar = (adh) hashMapArr[1].get("PixelXDimension");
        adh adhVar2 = (adh) hashMapArr[1].get("PixelYDimension");
        if (adhVar != null && adhVar2 != null) {
            hashMapArr[0].put("ImageWidth", adhVar);
            hashMapArr[0].put("ImageLength", adhVar2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        p(hashMapArr[4]);
        l(0, "ThumbnailOrientation", "Orientation");
        l(0, "ThumbnailImageLength", "ImageLength");
        l(0, "ThumbnailImageWidth", "ImageWidth");
        l(5, "ThumbnailOrientation", "Orientation");
        l(5, "ThumbnailImageLength", "ImageLength");
        l(5, "ThumbnailImageWidth", "ImageWidth");
        l(4, "Orientation", "ThumbnailOrientation");
        l(4, "ImageLength", "ThumbnailImageLength");
        l(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean p(HashMap hashMap) {
        adh adhVar = (adh) hashMap.get("ImageLength");
        adh adhVar2 = (adh) hashMap.get("ImageWidth");
        if (adhVar == null || adhVar2 == null) {
            return false;
        }
        return adhVar.a(this.j) <= 512 && adhVar2.a(this.j) <= 512;
    }

    private final void q(adg adgVar) {
        j(adgVar);
        r(adgVar, 0);
        s(adgVar, 0);
        s(adgVar, 5);
        s(adgVar, 4);
        o();
        if (this.F == 8) {
            HashMap[] hashMapArr = this.G;
            adh adhVar = (adh) hashMapArr[1].get("MakerNote");
            if (adhVar != null) {
                adg adgVar2 = new adg(adhVar.d, (byte[]) null);
                adgVar2.c = this.j;
                adgVar2.b(6);
                r(adgVar2, 9);
                adh adhVar2 = (adh) hashMapArr[9].get("ColorSpace");
                if (adhVar2 != null) {
                    hashMapArr[1].put("ColorSpace", adhVar2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x006a, code lost:
    
        if (r11 != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0070, code lost:
    
        if (r7 != 9) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0074, code lost:
    
        if (r11 != 8) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void r(adg adgVar, int i2) {
        int i3;
        short s2;
        long j;
        boolean z2;
        short s3;
        short s4;
        int i4;
        gug gugVar;
        int i5;
        int readUnsignedShort;
        long j2;
        int i6;
        int i7 = i2;
        Integer valueOf = Integer.valueOf(adgVar.b);
        Set set = this.H;
        set.add(valueOf);
        short readShort = adgVar.readShort();
        if (readShort > 0) {
            short s5 = 0;
            while (s5 < readShort) {
                int readUnsignedShort2 = adgVar.readUnsignedShort();
                int readUnsignedShort3 = adgVar.readUnsignedShort();
                int readInt = adgVar.readInt();
                long j3 = adgVar.b;
                HashMap hashMap = y[i7];
                Integer valueOf2 = Integer.valueOf(readUnsignedShort2);
                gug gugVar2 = (gug) hashMap.get(valueOf2);
                int i8 = 7;
                if (gugVar2 != null) {
                    if (readUnsignedShort3 > 0) {
                        int length = f.length;
                        if (readUnsignedShort3 < 14) {
                            int i9 = gugVar2.c;
                            if (i9 == 7 || readUnsignedShort3 == 7 || i9 == readUnsignedShort3) {
                                i3 = 4;
                            } else {
                                int i10 = gugVar2.a;
                                if (i10 == readUnsignedShort3) {
                                    i3 = 4;
                                } else if (i9 == 4) {
                                    i3 = 4;
                                } else if (i10 == 4) {
                                    i10 = 4;
                                    i3 = 4;
                                } else {
                                    i3 = 4;
                                    if (i9 != 9) {
                                    }
                                }
                                i8 = 7;
                            }
                            if (readUnsignedShort3 == i8) {
                                readUnsignedShort3 = i9;
                            }
                            s2 = s5;
                            j = readInt * r5[readUnsignedShort3];
                            if (j >= 0 && j <= 2147483647L) {
                                z2 = true;
                                long j4 = j3 + 4;
                                if (z2) {
                                    adgVar.c(j4);
                                    s3 = readShort;
                                    s4 = s2;
                                } else {
                                    if (j > 4) {
                                        int readInt2 = adgVar.readInt();
                                        s3 = readShort;
                                        s4 = s2;
                                        if (this.F == 7) {
                                            Object obj = gugVar2.d;
                                            if ("MakerNote".equals(obj)) {
                                                this.K = readInt2;
                                            } else if (i7 == 6) {
                                                if ("ThumbnailImage".equals(obj)) {
                                                    this.L = readInt2;
                                                    this.M = readInt;
                                                    adh e2 = adh.e(6, this.j);
                                                    i4 = readInt;
                                                    gugVar = gugVar2;
                                                    adh c2 = adh.c(this.L, this.j);
                                                    adh c3 = adh.c(this.M, this.j);
                                                    HashMap[] hashMapArr = this.G;
                                                    hashMapArr[i3].put("Compression", e2);
                                                    hashMapArr[i3].put("JPEGInterchangeFormat", c2);
                                                    hashMapArr[i3].put("JPEGInterchangeFormatLength", c3);
                                                } else {
                                                    i4 = readInt;
                                                    gugVar = gugVar2;
                                                }
                                                i5 = 6;
                                                adgVar.c(readInt2);
                                            }
                                        }
                                        i4 = readInt;
                                        gugVar = gugVar2;
                                        i5 = i2;
                                        adgVar.c(readInt2);
                                    } else {
                                        s3 = readShort;
                                        s4 = s2;
                                        i4 = readInt;
                                        gugVar = gugVar2;
                                        i5 = i2;
                                    }
                                    Integer num = (Integer) B.get(valueOf2);
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == i3) {
                                                j2 = adgVar.a();
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = adgVar.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = adgVar.readInt();
                                            } else {
                                                j2 = -1;
                                            }
                                            if (j2 > 0 && (((i6 = adgVar.d) == -1 || j2 < i6) && !set.contains(Integer.valueOf((int) j2)))) {
                                                adgVar.c(j2);
                                                r(adgVar, num.intValue());
                                            }
                                            adgVar.c(j4);
                                        } else {
                                            readUnsignedShort = adgVar.readUnsignedShort();
                                        }
                                        j2 = readUnsignedShort;
                                        if (j2 > 0) {
                                            adgVar.c(j2);
                                            r(adgVar, num.intValue());
                                        }
                                        adgVar.c(j4);
                                    } else {
                                        int i11 = adgVar.b + this.J;
                                        byte[] bArr = new byte[(int) j];
                                        adgVar.readFully(bArr);
                                        adh adhVar = new adh(readUnsignedShort3, i4, i11, bArr);
                                        HashMap hashMap2 = this.G[i5];
                                        Object obj2 = gugVar.d;
                                        hashMap2.put(obj2, adhVar);
                                        if ("DNGVersion".equals(obj2)) {
                                            this.F = 3;
                                        }
                                        if ((("Make".equals(obj2) || "Model".equals(obj2)) && adhVar.g(this.j).contains("PENTAX")) || ("Compression".equals(obj2) && adhVar.a(this.j) == 65535)) {
                                            this.F = 8;
                                        }
                                        if (adgVar.b != j4) {
                                            adgVar.c(j4);
                                        }
                                    }
                                }
                                s5 = (short) (s4 + 1);
                                i7 = i2;
                                readShort = s3;
                            }
                            z2 = false;
                            long j42 = j3 + 4;
                            if (z2) {
                            }
                            s5 = (short) (s4 + 1);
                            i7 = i2;
                            readShort = s3;
                        }
                    } else {
                        i3 = 4;
                    }
                    s2 = s5;
                    j = 0;
                    z2 = false;
                    long j422 = j3 + 4;
                    if (z2) {
                    }
                    s5 = (short) (s4 + 1);
                    i7 = i2;
                    readShort = s3;
                }
                i3 = 4;
                j = 0;
                z2 = false;
                s2 = s5;
                long j4222 = j3 + 4;
                if (z2) {
                }
                s5 = (short) (s4 + 1);
                i7 = i2;
                readShort = s3;
            }
            int readInt3 = adgVar.readInt();
            long j5 = readInt3;
            if (j5 <= 0 || set.contains(Integer.valueOf(readInt3))) {
                return;
            }
            adgVar.c(j5);
            HashMap[] hashMapArr2 = this.G;
            if (hashMapArr2[4].isEmpty()) {
                r(adgVar, 4);
            } else if (hashMapArr2[5].isEmpty()) {
                r(adgVar, 5);
            }
        }
    }

    private final void s(adg adgVar, int i2) {
        adh e2;
        adh e3;
        HashMap[] hashMapArr = this.G;
        adh adhVar = (adh) hashMapArr[i2].get("DefaultCropSize");
        adh adhVar2 = (adh) hashMapArr[i2].get("SensorTopBorder");
        adh adhVar3 = (adh) hashMapArr[i2].get("SensorLeftBorder");
        adh adhVar4 = (adh) hashMapArr[i2].get("SensorBottomBorder");
        adh adhVar5 = (adh) hashMapArr[i2].get("SensorRightBorder");
        if (adhVar != null) {
            int i3 = adhVar.a;
            ByteOrder byteOrder = this.j;
            if (i3 == 5) {
                adi[] adiVarArr = (adi[]) adhVar.f(byteOrder);
                if (adiVarArr == null || adiVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(adiVarArr))));
                    return;
                } else {
                    e2 = adh.d(adiVarArr[0], this.j);
                    e3 = adh.d(adiVarArr[1], this.j);
                }
            } else {
                int[] iArr = (int[]) adhVar.f(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                } else {
                    e2 = adh.e(iArr[0], this.j);
                    e3 = adh.e(iArr[1], this.j);
                }
            }
            hashMapArr[i2].put("ImageWidth", e2);
            hashMapArr[i2].put("ImageLength", e3);
            return;
        }
        if (adhVar2 != null && adhVar3 != null && adhVar4 != null && adhVar5 != null) {
            int a2 = adhVar2.a(this.j);
            int a3 = adhVar4.a(this.j);
            int a4 = adhVar5.a(this.j);
            int a5 = adhVar3.a(this.j);
            if (a3 <= a2 || a4 <= a5) {
                return;
            }
            adh e4 = adh.e(a3 - a2, this.j);
            adh e5 = adh.e(a4 - a5, this.j);
            hashMapArr[i2].put("ImageLength", e4);
            hashMapArr[i2].put("ImageWidth", e5);
            return;
        }
        adh adhVar6 = (adh) hashMapArr[i2].get("ImageLength");
        adh adhVar7 = (adh) hashMapArr[i2].get("ImageWidth");
        if (adhVar6 == null || adhVar7 == null) {
            adh adhVar8 = (adh) hashMapArr[i2].get("JPEGInterchangeFormat");
            adh adhVar9 = (adh) hashMapArr[i2].get("JPEGInterchangeFormatLength");
            if (adhVar8 == null || adhVar9 == null) {
                return;
            }
            int a6 = adhVar8.a(this.j);
            int a7 = adhVar9.a(this.j);
            adgVar.c(a6);
            byte[] bArr = new byte[a7];
            adgVar.readFully(bArr);
            d(new adg(bArr), a6, i2);
        }
    }

    private static final int t(byte[] bArr) {
        adg adgVar;
        long readInt;
        byte[] bArr2;
        long j;
        adg adgVar2 = null;
        try {
            adgVar = new adg(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = adgVar.readInt();
            bArr2 = new byte[4];
            adgVar.readFully(bArr2);
        } catch (Exception unused2) {
            adgVar2 = adgVar;
            if (adgVar2 != null) {
                adgVar2.close();
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
            adgVar2 = adgVar;
            if (adgVar2 != null) {
                adgVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, l)) {
            adgVar.close();
            return 0;
        }
        if (readInt == 1) {
            readInt = adgVar.readLong();
            j = 16;
            if (readInt < 16) {
                adgVar.close();
                return 0;
            }
        } else {
            j = 8;
        }
        if (readInt > 5000) {
            readInt = 5000;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            adgVar.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (long j3 = 0; j3 < (j2 >> 2); j3++) {
            try {
                adgVar.readFully(bArr3);
                if (j3 != 1) {
                    if (Arrays.equals(bArr3, m)) {
                        z2 = true;
                    } else if (Arrays.equals(bArr3, n)) {
                        z3 = true;
                    } else if (Arrays.equals(bArr3, o) || Arrays.equals(bArr3, p)) {
                        z4 = true;
                    }
                    if (!z2) {
                        continue;
                    } else {
                        if (z3) {
                            adgVar.close();
                            return 12;
                        }
                        if (z4) {
                            adgVar.close();
                            return 15;
                        }
                    }
                }
            } catch (EOFException unused3) {
                adgVar.close();
                return 0;
            }
        }
        adgVar.close();
        return 0;
    }

    private static final ByteOrder u(adg adgVar) {
        short readShort = adgVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(readShort))));
    }

    public final adh a(String str) {
        adh adhVar;
        int i2;
        adh adhVar2;
        if (true == "ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i3 = 0;
        if ("Xmp".equals(str) && (i2 = this.F) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (adhVar2 = this.N) != null)) {
            return adhVar2;
        }
        while (true) {
            int length = k.length;
            if (i3 >= 10) {
                if (!"Xmp".equals(str) || (adhVar = this.N) == null) {
                    return null;
                }
                return adhVar;
            }
            adh adhVar3 = (adh) this.G[i3].get(str);
            if (adhVar3 != null) {
                return adhVar3;
            }
            i3++;
        }
    }

    public final String b(String str) {
        double d2;
        adh a2 = a(str);
        if (a2 == null) {
            return null;
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = a2.a;
            if (i2 != 5 && i2 != 10) {
                Log.w("ExifInterface", a.Y(i2, "GPS Timestamp format is not rational. format="));
                return null;
            }
            adi[] adiVarArr = (adi[]) a2.f(this.j);
            if (adiVarArr == null || adiVarArr.length != 3) {
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(adiVarArr))));
                return null;
            }
            adi adiVar = adiVarArr[0];
            Integer valueOf = Integer.valueOf((int) (adiVar.a / adiVar.b));
            adi adiVar2 = adiVarArr[1];
            Integer valueOf2 = Integer.valueOf((int) (adiVar2.a / adiVar2.b));
            adi adiVar3 = adiVarArr[2];
            return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (adiVar3.a / adiVar3.b)));
        }
        boolean contains = A.contains(str);
        ByteOrder byteOrder = this.j;
        if (!contains) {
            return a2.g(byteOrder);
        }
        try {
            Object f2 = a2.f(byteOrder);
            if (f2 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (f2 instanceof String) {
                d2 = Double.parseDouble((String) f2);
            } else if (f2 instanceof long[]) {
                long[] jArr = (long[]) f2;
                if (jArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = jArr[0];
            } else if (f2 instanceof int[]) {
                int[] iArr = (int[]) f2;
                if (iArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = iArr[0];
            } else if (f2 instanceof double[]) {
                double[] dArr = (double[]) f2;
                if (dArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = dArr[0];
            } else {
                if (!(f2 instanceof adi[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                adi[] adiVarArr2 = (adi[]) f2;
                if (adiVarArr2.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                adi adiVar4 = adiVarArr2[0];
                d2 = adiVar4.a / adiVar4.b;
            }
            return Double.toString(d2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
