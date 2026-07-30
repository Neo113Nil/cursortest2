package defpackage;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.google.firebase.encoders.json.BuildConfig;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nj0 {
    public static final String[] A;
    public static final int[] B;
    public static final byte[] C;
    public static final kj0 D;
    public static final kj0[][] E;
    public static final kj0[] F;
    public static final HashMap[] G;
    public static final HashMap[] H;
    public static final HashSet I;
    public static final HashMap J;
    public static final Charset K;
    public static final byte[] L;
    public static final byte[] M;
    public static final boolean k = Log.isLoggable("ExifInterface", 3);
    public static final int[] l;
    public static final int[] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public int b;
    public final HashMap[] c;
    public final HashSet d;
    public ByteOrder e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        l = new int[]{8, 8, 8};
        m = new int[]{8};
        n = new byte[]{-1, -40, -1};
        o = new byte[]{102, 116, 121, 112};
        p = new byte[]{109, 105, 102, 49};
        q = new byte[]{104, 101, 105, 99};
        r = new byte[]{79, 76, 89, 77, 80, 0};
        s = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        t = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        u = new byte[]{101, 88, 73, 102};
        v = new byte[]{73, 72, 68, 82};
        w = new byte[]{73, 69, 78, 68};
        x = new byte[]{82, 73, 70, 70};
        y = new byte[]{87, 69, 66, 80};
        z = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        A = new String[]{BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        B = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        C = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        kj0[] kj0VarArr = {new kj0("NewSubfileType", 254, 4), new kj0("SubfileType", 255, 4), new kj0("ImageWidth", 256, 3, 4), new kj0("ImageLength", 257, 3, 4), new kj0("BitsPerSample", 258, 3), new kj0("Compression", 259, 3), new kj0("PhotometricInterpretation", 262, 3), new kj0("ImageDescription", 270, 2), new kj0("Make", 271, 2), new kj0("Model", 272, 2), new kj0("StripOffsets", 273, 3, 4), new kj0("Orientation", 274, 3), new kj0("SamplesPerPixel", 277, 3), new kj0("RowsPerStrip", 278, 3, 4), new kj0("StripByteCounts", 279, 3, 4), new kj0("XResolution", 282, 5), new kj0("YResolution", 283, 5), new kj0("PlanarConfiguration", 284, 3), new kj0("ResolutionUnit", 296, 3), new kj0("TransferFunction", 301, 3), new kj0("Software", 305, 2), new kj0("DateTime", 306, 2), new kj0("Artist", 315, 2), new kj0("WhitePoint", 318, 5), new kj0("PrimaryChromaticities", 319, 5), new kj0("SubIFDPointer", 330, 4), new kj0("JPEGInterchangeFormat", 513, 4), new kj0("JPEGInterchangeFormatLength", 514, 4), new kj0("YCbCrCoefficients", 529, 5), new kj0("YCbCrSubSampling", 530, 3), new kj0("YCbCrPositioning", 531, 3), new kj0("ReferenceBlackWhite", 532, 5), new kj0("Copyright", 33432, 2), new kj0("ExifIFDPointer", 34665, 4), new kj0("GPSInfoIFDPointer", 34853, 4), new kj0("SensorTopBorder", 4, 4), new kj0("SensorLeftBorder", 5, 4), new kj0("SensorBottomBorder", 6, 4), new kj0("SensorRightBorder", 7, 4), new kj0("ISO", 23, 3), new kj0("JpgFromRaw", 46, 7), new kj0("Xmp", 700, 1)};
        kj0[] kj0VarArr2 = {new kj0("ExposureTime", 33434, 5), new kj0("FNumber", 33437, 5), new kj0("ExposureProgram", 34850, 3), new kj0("SpectralSensitivity", 34852, 2), new kj0("PhotographicSensitivity", 34855, 3), new kj0("OECF", 34856, 7), new kj0("SensitivityType", 34864, 3), new kj0("StandardOutputSensitivity", 34865, 4), new kj0("RecommendedExposureIndex", 34866, 4), new kj0("ISOSpeed", 34867, 4), new kj0("ISOSpeedLatitudeyyy", 34868, 4), new kj0("ISOSpeedLatitudezzz", 34869, 4), new kj0("ExifVersion", 36864, 2), new kj0("DateTimeOriginal", 36867, 2), new kj0("DateTimeDigitized", 36868, 2), new kj0("OffsetTime", 36880, 2), new kj0("OffsetTimeOriginal", 36881, 2), new kj0("OffsetTimeDigitized", 36882, 2), new kj0("ComponentsConfiguration", 37121, 7), new kj0("CompressedBitsPerPixel", 37122, 5), new kj0("ShutterSpeedValue", 37377, 10), new kj0("ApertureValue", 37378, 5), new kj0("BrightnessValue", 37379, 10), new kj0("ExposureBiasValue", 37380, 10), new kj0("MaxApertureValue", 37381, 5), new kj0("SubjectDistance", 37382, 5), new kj0("MeteringMode", 37383, 3), new kj0("LightSource", 37384, 3), new kj0("Flash", 37385, 3), new kj0("FocalLength", 37386, 5), new kj0("SubjectArea", 37396, 3), new kj0("MakerNote", 37500, 7), new kj0("UserComment", 37510, 7), new kj0("SubSecTime", 37520, 2), new kj0("SubSecTimeOriginal", 37521, 2), new kj0("SubSecTimeDigitized", 37522, 2), new kj0("FlashpixVersion", 40960, 7), new kj0("ColorSpace", 40961, 3), new kj0("PixelXDimension", 40962, 3, 4), new kj0("PixelYDimension", 40963, 3, 4), new kj0("RelatedSoundFile", 40964, 2), new kj0("InteroperabilityIFDPointer", 40965, 4), new kj0("FlashEnergy", 41483, 5), new kj0("SpatialFrequencyResponse", 41484, 7), new kj0("FocalPlaneXResolution", 41486, 5), new kj0("FocalPlaneYResolution", 41487, 5), new kj0("FocalPlaneResolutionUnit", 41488, 3), new kj0("SubjectLocation", 41492, 3), new kj0("ExposureIndex", 41493, 5), new kj0("SensingMethod", 41495, 3), new kj0("FileSource", 41728, 7), new kj0("SceneType", 41729, 7), new kj0("CFAPattern", 41730, 7), new kj0("CustomRendered", 41985, 3), new kj0("ExposureMode", 41986, 3), new kj0("WhiteBalance", 41987, 3), new kj0("DigitalZoomRatio", 41988, 5), new kj0("FocalLengthIn35mmFilm", 41989, 3), new kj0("SceneCaptureType", 41990, 3), new kj0("GainControl", 41991, 3), new kj0("Contrast", 41992, 3), new kj0("Saturation", 41993, 3), new kj0("Sharpness", 41994, 3), new kj0("DeviceSettingDescription", 41995, 7), new kj0("SubjectDistanceRange", 41996, 3), new kj0("ImageUniqueID", 42016, 2), new kj0("CameraOwnerName", 42032, 2), new kj0("BodySerialNumber", 42033, 2), new kj0("LensSpecification", 42034, 5), new kj0("LensMake", 42035, 2), new kj0("LensModel", 42036, 2), new kj0("Gamma", 42240, 5), new kj0("DNGVersion", 50706, 1), new kj0("DefaultCropSize", 50720, 3, 4)};
        kj0[] kj0VarArr3 = {new kj0("GPSVersionID", 0, 1), new kj0("GPSLatitudeRef", 1, 2), new kj0("GPSLatitude", 2, 5, 10), new kj0("GPSLongitudeRef", 3, 2), new kj0("GPSLongitude", 4, 5, 10), new kj0("GPSAltitudeRef", 5, 1), new kj0("GPSAltitude", 6, 5), new kj0("GPSTimeStamp", 7, 5), new kj0("GPSSatellites", 8, 2), new kj0("GPSStatus", 9, 2), new kj0("GPSMeasureMode", 10, 2), new kj0("GPSDOP", 11, 5), new kj0("GPSSpeedRef", 12, 2), new kj0("GPSSpeed", 13, 5), new kj0("GPSTrackRef", 14, 2), new kj0("GPSTrack", 15, 5), new kj0("GPSImgDirectionRef", 16, 2), new kj0("GPSImgDirection", 17, 5), new kj0("GPSMapDatum", 18, 2), new kj0("GPSDestLatitudeRef", 19, 2), new kj0("GPSDestLatitude", 20, 5), new kj0("GPSDestLongitudeRef", 21, 2), new kj0("GPSDestLongitude", 22, 5), new kj0("GPSDestBearingRef", 23, 2), new kj0("GPSDestBearing", 24, 5), new kj0("GPSDestDistanceRef", 25, 2), new kj0("GPSDestDistance", 26, 5), new kj0("GPSProcessingMethod", 27, 7), new kj0("GPSAreaInformation", 28, 7), new kj0("GPSDateStamp", 29, 2), new kj0("GPSDifferential", 30, 3), new kj0("GPSHPositioningError", 31, 5)};
        kj0[] kj0VarArr4 = {new kj0("InteroperabilityIndex", 1, 2)};
        kj0[] kj0VarArr5 = {new kj0("NewSubfileType", 254, 4), new kj0("SubfileType", 255, 4), new kj0("ThumbnailImageWidth", 256, 3, 4), new kj0("ThumbnailImageLength", 257, 3, 4), new kj0("BitsPerSample", 258, 3), new kj0("Compression", 259, 3), new kj0("PhotometricInterpretation", 262, 3), new kj0("ImageDescription", 270, 2), new kj0("Make", 271, 2), new kj0("Model", 272, 2), new kj0("StripOffsets", 273, 3, 4), new kj0("ThumbnailOrientation", 274, 3), new kj0("SamplesPerPixel", 277, 3), new kj0("RowsPerStrip", 278, 3, 4), new kj0("StripByteCounts", 279, 3, 4), new kj0("XResolution", 282, 5), new kj0("YResolution", 283, 5), new kj0("PlanarConfiguration", 284, 3), new kj0("ResolutionUnit", 296, 3), new kj0("TransferFunction", 301, 3), new kj0("Software", 305, 2), new kj0("DateTime", 306, 2), new kj0("Artist", 315, 2), new kj0("WhitePoint", 318, 5), new kj0("PrimaryChromaticities", 319, 5), new kj0("SubIFDPointer", 330, 4), new kj0("JPEGInterchangeFormat", 513, 4), new kj0("JPEGInterchangeFormatLength", 514, 4), new kj0("YCbCrCoefficients", 529, 5), new kj0("YCbCrSubSampling", 530, 3), new kj0("YCbCrPositioning", 531, 3), new kj0("ReferenceBlackWhite", 532, 5), new kj0("Copyright", 33432, 2), new kj0("ExifIFDPointer", 34665, 4), new kj0("GPSInfoIFDPointer", 34853, 4), new kj0("DNGVersion", 50706, 1), new kj0("DefaultCropSize", 50720, 3, 4)};
        D = new kj0("StripOffsets", 273, 3);
        E = new kj0[][]{kj0VarArr, kj0VarArr2, kj0VarArr3, kj0VarArr4, kj0VarArr5, kj0VarArr, new kj0[]{new kj0("ThumbnailImage", 256, 7), new kj0("CameraSettingsIFDPointer", 8224, 4), new kj0("ImageProcessingIFDPointer", 8256, 4)}, new kj0[]{new kj0("PreviewImageStart", 257, 4), new kj0("PreviewImageLength", 258, 4)}, new kj0[]{new kj0("AspectFrame", 4371, 3)}, new kj0[]{new kj0("ColorSpace", 55, 3)}};
        F = new kj0[]{new kj0("SubIFDPointer", 330, 4), new kj0("ExifIFDPointer", 34665, 4), new kj0("GPSInfoIFDPointer", 34853, 4), new kj0("InteroperabilityIFDPointer", 40965, 4), new kj0("CameraSettingsIFDPointer", 8224, 1), new kj0("ImageProcessingIFDPointer", 8256, 1)};
        G = new HashMap[10];
        H = new HashMap[10];
        I = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        J = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        K = forName;
        L = "Exif\u0000\u0000".getBytes(forName);
        M = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            kj0[][] kj0VarArr6 = E;
            if (i >= kj0VarArr6.length) {
                HashMap hashMap = J;
                kj0[] kj0VarArr7 = F;
                hashMap.put(Integer.valueOf(kj0VarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(kj0VarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(kj0VarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(kj0VarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(kj0VarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(kj0VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            G[i] = new HashMap();
            H[i] = new HashMap();
            for (kj0 kj0Var : kj0VarArr6[i]) {
                G[i].put(Integer.valueOf(kj0Var.a), kj0Var);
                H[i].put(kj0Var.b, kj0Var);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:7:0x0037, B:13:0x0054, B:15:0x005f, B:16:0x0075, B:25:0x0066, B:28:0x006e, B:29:0x0072, B:30:0x007f, B:32:0x0088, B:34:0x008e, B:36:0x0094, B:38:0x009a, B:48:0x00a8), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nj0(oj0 oj0Var) {
        kj0[][] kj0VarArr = E;
        this.c = new HashMap[kj0VarArr.length];
        this.d = new HashSet(kj0VarArr.length);
        this.e = ByteOrder.BIG_ENDIAN;
        boolean z2 = k;
        this.a = null;
        for (int i = 0; i < kj0VarArr.length; i++) {
            try {
                try {
                    this.c[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z2) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z2) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z2) {
                }
                a();
                if (!z2) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(oj0Var, 5000);
        int f = f(bufferedInputStream);
        this.b = f;
        if (f != 4 && f != 9 && f != 13 && f != 14) {
            mj0 mj0Var = new mj0(bufferedInputStream);
            int i2 = this.b;
            if (i2 == 12) {
                d(mj0Var);
            } else if (i2 == 7) {
                g(mj0Var);
            } else if (i2 == 10) {
                k(mj0Var);
            } else {
                j(mj0Var);
            }
            mj0Var.f(this.g);
            u(mj0Var);
            a();
            if (!z2) {
                return;
            }
            p();
        }
        ij0 ij0Var = new ij0(bufferedInputStream);
        int i3 = this.b;
        if (i3 == 4) {
            e(ij0Var, 0, 0);
        } else if (i3 == 13) {
            h(ij0Var);
        } else if (i3 == 9) {
            i(ij0Var);
        } else if (i3 == 14) {
            l(ij0Var);
        }
        a();
        if (!z2) {
        }
        p();
    }

    public static ByteOrder q(ij0 ij0Var) {
        short readShort = ij0Var.readShort();
        boolean z2 = k;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort != 19789) {
            ey.l(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.c;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat("\u0000").getBytes(K);
            hashMap.put("DateTime", new jj0(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", jj0.a(0L, this.e));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", jj0.a(0L, this.e));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", jj0.a(0L, this.e));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", jj0.a(0L, this.e));
        }
    }

    public final String b(String str) {
        jj0 c = c(str);
        if (c != null) {
            int i = c.a;
            if (!I.contains(str)) {
                return c.f(this.e);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                lj0[] lj0VarArr = (lj0[]) c.g(this.e);
                if (lj0VarArr == null || lj0VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(lj0VarArr));
                    return null;
                }
                lj0 lj0Var = lj0VarArr[0];
                Integer valueOf = Integer.valueOf((int) (lj0Var.a / lj0Var.b));
                lj0 lj0Var2 = lj0VarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (lj0Var2.a / lj0Var2.b));
                lj0 lj0Var3 = lj0VarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (lj0Var3.a / lj0Var3.b)));
            }
            try {
                return Double.toString(c.d(this.e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final jj0 c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (k) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < E.length; i++) {
            jj0 jj0Var = (jj0) this.c[i].get(str);
            if (jj0Var != null) {
                return jj0Var;
            }
        }
        return null;
    }

    public final void d(mj0 mj0Var) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            ch2.h("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                qj0.a(mediaMetadataRetriever, new hj0(mj0Var));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.c;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", jj0.c(Integer.parseInt(str), this.e));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", jj0.c(Integer.parseInt(str2), this.e));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", jj0.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.e));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    mj0Var.f(parseInt2);
                    byte[] bArr = new byte[6];
                    mj0Var.readFully(bArr);
                    int i = parseInt2 + 6;
                    int i2 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, L)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i2];
                    mj0Var.readFully(bArr2);
                    this.g = i;
                    r(0, bArr2);
                }
                if (k) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    public final void e(ij0 ij0Var, int i, int i2) {
        boolean z2 = k;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + ij0Var);
        }
        ij0Var.o = ByteOrder.BIG_ENDIAN;
        byte readByte = ij0Var.readByte();
        byte b = -1;
        if (readByte != -1) {
            ey.l(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        if (ij0Var.readByte() != -40) {
            ey.l(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        int i3 = 2;
        int i4 = 2;
        while (true) {
            byte readByte2 = ij0Var.readByte();
            if (readByte2 != b) {
                ey.l(Integer.toHexString(readByte2 & 255), "Invalid marker:");
                return;
            }
            byte readByte3 = ij0Var.readByte();
            if (z2) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = ij0Var.readUnsignedShort();
                int i5 = readUnsignedShort - 2;
                int i6 = i4 + 4;
                if (z2) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i5 < 0) {
                    dm0.j("Invalid length");
                    return;
                }
                int i7 = 0;
                HashMap[] hashMapArr = this.c;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i5];
                    ij0Var.readFully(bArr);
                    int i8 = i6 + i5;
                    byte[] bArr2 = L;
                    if (bArr2 != null && i5 >= bArr2.length) {
                        int i9 = 0;
                        while (i9 < bArr2.length) {
                            if (bArr[i9] == bArr2[i9]) {
                                i9++;
                                i7 = 0;
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i5);
                        this.g = i + i6 + bArr2.length;
                        r(i2, copyOfRange);
                        u(new ij0(copyOfRange));
                        i6 = i8;
                        i5 = 0;
                    }
                    byte[] bArr3 = M;
                    if (bArr3 != null && i5 >= bArr3.length) {
                        int i10 = i7;
                        while (true) {
                            if (i10 >= bArr3.length) {
                                int length = i6 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i5);
                                if (b("Xmp") == null) {
                                    hashMapArr[i7].put("Xmp", new jj0(length, copyOfRange2, 1, copyOfRange2.length));
                                }
                            } else if (bArr[i10] == bArr3[i10]) {
                                i10++;
                            }
                        }
                    }
                    i6 = i8;
                    i5 = 0;
                } else if (readByte3 != -2) {
                    switch (readByte3) {
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                        default:
                            switch (readByte3) {
                                case -59:
                                case -58:
                                case -57:
                                    break;
                                default:
                                    switch (readByte3) {
                                        case -55:
                                        case -54:
                                        case -53:
                                            break;
                                        default:
                                            switch (readByte3) {
                                            }
                                    }
                            }
                    }
                    ij0Var.b(1);
                    hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", jj0.a(ij0Var.readUnsignedShort(), this.e));
                    hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", jj0.a(ij0Var.readUnsignedShort(), this.e));
                    i5 = readUnsignedShort - 7;
                } else {
                    byte[] bArr4 = new byte[i5];
                    ij0Var.readFully(bArr4);
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = K;
                        byte[] bytes = new String(bArr4, charset).concat("\u0000").getBytes(charset);
                        hashMap.put("UserComment", new jj0(bytes, i3, bytes.length));
                    }
                    i5 = 0;
                }
                if (i5 < 0) {
                    dm0.j("Invalid length");
                    return;
                }
                ij0Var.b(i5);
                i4 = i6 + i5;
                i3 = 2;
                b = -1;
            }
        }
        ij0Var.o = this.e;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:14|15|16|17|18|19|(6:99|(2:101|(1:103))(1:148)|104|(1:106)|107|(1:109)(13:110|(7:114|115|116|(2:118|119)(5:121|122|123|(1:125)(2:133|(1:135))|(3:128|129|130))|120|111|112)|146|145|142|22|23|24|25|26|(1:85)(1:30)|31|(1:33)(8:35|36|37|38|39|(1:41)|42|(1:44)(2:45|(2:46|(2:48|(4:51|52|(2:53|(2:55|(1:58)(1:57))(3:60|61|(2:62|(2:64|(1:67)(1:66))(2:68|69))))|59)(1:50))(2:70|71))))))|21|22|23|24|25|26|(1:28)|85|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00cf, code lost:
    
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0101, code lost:
    
        if (r3 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0103, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0106, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f5, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00fb, code lost:
    
        if (r4 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fd, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0100, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        int i;
        ij0 ij0Var;
        int i2;
        int i3;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr3 = n;
            if (i4 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i4] != bArr3[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    byte b = bArr2[i5];
                    ?? r7 = bytes[i5];
                    if (b != r7) {
                        ij0 ij0Var2 = null;
                        try {
                            try {
                                ij0Var = new ij0(bArr2);
                                try {
                                    readInt = ij0Var.readInt();
                                    bArr = new byte[4];
                                    ij0Var.readFully(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                ij0Var2 = r7;
                                if (ij0Var2 != null) {
                                    ij0Var2.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            ij0Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (ij0Var2 != null) {
                            }
                            throw th;
                        }
                        if (Arrays.equals(bArr, o)) {
                            if (readInt == 1) {
                                readInt = ij0Var.readLong();
                                j = 16;
                                if (readInt < 16) {
                                }
                            } else {
                                j = 8;
                            }
                            if (readInt > 5000) {
                                readInt = 5000;
                            }
                            long j2 = readInt - j;
                            if (j2 >= 8) {
                                byte[] bArr4 = new byte[4];
                                boolean z2 = false;
                                boolean z3 = false;
                                for (long j3 = 0; j3 < j2 / 4; j3++) {
                                    try {
                                        ij0Var.readFully(bArr4);
                                        if (j3 != 1) {
                                            i = 0;
                                            try {
                                                if (Arrays.equals(bArr4, p)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, q)) {
                                                    z3 = true;
                                                }
                                                if (z2 && z3) {
                                                    ij0Var.close();
                                                    return 12;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                if (k) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                            }
                                        }
                                    } catch (EOFException unused) {
                                    }
                                }
                                i = 0;
                                ij0Var.close();
                                ij0 ij0Var3 = new ij0(bArr2);
                                ByteOrder q2 = q(ij0Var3);
                                this.e = q2;
                                ij0Var3.o = q2;
                                short readShort = ij0Var3.readShort();
                                i2 = (readShort != 20306 || readShort == 21330) ? 1 : i;
                                ij0Var3.close();
                                if (i2 != 0) {
                                    return 7;
                                }
                                try {
                                    ij0 ij0Var4 = new ij0(bArr2);
                                    try {
                                        ByteOrder q3 = q(ij0Var4);
                                        this.e = q3;
                                        ij0Var4.o = q3;
                                        i3 = ij0Var4.readShort() != 85 ? i : 1;
                                        ij0Var4.close();
                                    } catch (Exception unused2) {
                                        ij0Var2 = ij0Var4;
                                        if (ij0Var2 != null) {
                                            ij0Var2.close();
                                        }
                                        i3 = i;
                                        if (i3 == 0) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        ij0Var2 = ij0Var4;
                                        if (ij0Var2 != null) {
                                            ij0Var2.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                if (i3 == 0) {
                                    return 10;
                                }
                                int i6 = i;
                                while (true) {
                                    byte[] bArr5 = t;
                                    if (i6 >= bArr5.length) {
                                        return 13;
                                    }
                                    if (bArr2[i6] != bArr5[i6]) {
                                        int i7 = i;
                                        while (true) {
                                            byte[] bArr6 = x;
                                            if (i7 >= bArr6.length) {
                                                int i8 = i;
                                                while (true) {
                                                    byte[] bArr7 = y;
                                                    if (i8 >= bArr7.length) {
                                                        return 14;
                                                    }
                                                    if (bArr2[bArr6.length + i8 + 4] != bArr7[i8]) {
                                                        break;
                                                    }
                                                    i8++;
                                                }
                                            } else {
                                                if (bArr2[i7] != bArr6[i7]) {
                                                    break;
                                                }
                                                i7++;
                                            }
                                        }
                                        return i;
                                    }
                                    i6++;
                                }
                            }
                        }
                        ij0Var.close();
                        i = 0;
                        ij0 ij0Var32 = new ij0(bArr2);
                        ByteOrder q22 = q(ij0Var32);
                        this.e = q22;
                        ij0Var32.o = q22;
                        short readShort2 = ij0Var32.readShort();
                        if (readShort2 != 20306) {
                        }
                        ij0Var32.close();
                        if (i2 != 0) {
                        }
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    public final void g(mj0 mj0Var) {
        int i;
        int i2;
        j(mj0Var);
        HashMap[] hashMapArr = this.c;
        jj0 jj0Var = (jj0) hashMapArr[1].get("MakerNote");
        if (jj0Var != null) {
            mj0 mj0Var2 = new mj0(jj0Var.d);
            mj0Var2.o = this.e;
            byte[] bArr = r;
            byte[] bArr2 = new byte[bArr.length];
            mj0Var2.readFully(bArr2);
            mj0Var2.f(0L);
            byte[] bArr3 = s;
            byte[] bArr4 = new byte[bArr3.length];
            mj0Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                mj0Var2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                mj0Var2.f(12L);
            }
            s(mj0Var2, 6);
            jj0 jj0Var2 = (jj0) hashMapArr[7].get("PreviewImageStart");
            jj0 jj0Var3 = (jj0) hashMapArr[7].get("PreviewImageLength");
            if (jj0Var2 != null && jj0Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", jj0Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", jj0Var3);
            }
            jj0 jj0Var4 = (jj0) hashMapArr[8].get("AspectFrame");
            if (jj0Var4 != null) {
                int[] iArr = (int[]) jj0Var4.g(this.e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                jj0 c = jj0.c(i5, this.e);
                jj0 c2 = jj0.c(i6, this.e);
                hashMapArr[0].put("ImageWidth", c);
                hashMapArr[0].put("ImageLength", c2);
            }
        }
    }

    public final void h(ij0 ij0Var) {
        if (k) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + ij0Var);
        }
        ij0Var.o = ByteOrder.BIG_ENDIAN;
        byte[] bArr = t;
        ij0Var.b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = ij0Var.readInt();
                byte[] bArr2 = new byte[4];
                ij0Var.readFully(bArr2);
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, v)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, w)) {
                    return;
                }
                if (Arrays.equals(bArr2, u)) {
                    byte[] bArr3 = new byte[readInt];
                    ij0Var.readFully(bArr3);
                    int readInt2 = ij0Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.g = i;
                        r(0, bArr3);
                        x();
                        u(new ij0(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i2 = readInt + 4;
                ij0Var.b(i2);
                length = i + i2;
            } catch (EOFException unused) {
                dm0.j("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void i(ij0 ij0Var) {
        boolean z2 = k;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + ij0Var);
        }
        ij0Var.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        ij0Var.readFully(bArr);
        ij0Var.readFully(bArr2);
        ij0Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        ij0Var.b(i - ij0Var.n);
        ij0Var.readFully(bArr4);
        e(new ij0(bArr4), i, 5);
        ij0Var.b(i3 - ij0Var.n);
        ij0Var.o = ByteOrder.BIG_ENDIAN;
        int readInt = ij0Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = ij0Var.readUnsignedShort();
            int readUnsignedShort2 = ij0Var.readUnsignedShort();
            if (readUnsignedShort == D.a) {
                short readShort = ij0Var.readShort();
                short readShort2 = ij0Var.readShort();
                jj0 c = jj0.c(readShort, this.e);
                jj0 c2 = jj0.c(readShort2, this.e);
                HashMap[] hashMapArr = this.c;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            ij0Var.b(readUnsignedShort2);
        }
    }

    public final void j(mj0 mj0Var) {
        o(mj0Var);
        s(mj0Var, 0);
        w(mj0Var, 0);
        w(mj0Var, 5);
        w(mj0Var, 4);
        x();
        if (this.b == 8) {
            HashMap[] hashMapArr = this.c;
            jj0 jj0Var = (jj0) hashMapArr[1].get("MakerNote");
            if (jj0Var != null) {
                mj0 mj0Var2 = new mj0(jj0Var.d);
                mj0Var2.o = this.e;
                mj0Var2.b(6);
                s(mj0Var2, 9);
                jj0 jj0Var2 = (jj0) hashMapArr[9].get("ColorSpace");
                if (jj0Var2 != null) {
                    hashMapArr[1].put("ColorSpace", jj0Var2);
                }
            }
        }
    }

    public final void k(mj0 mj0Var) {
        if (k) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + mj0Var);
        }
        j(mj0Var);
        HashMap[] hashMapArr = this.c;
        jj0 jj0Var = (jj0) hashMapArr[0].get("JpgFromRaw");
        if (jj0Var != null) {
            e(new ij0(jj0Var.d), (int) jj0Var.c, 5);
        }
        jj0 jj0Var2 = (jj0) hashMapArr[0].get("ISO");
        jj0 jj0Var3 = (jj0) hashMapArr[1].get("PhotographicSensitivity");
        if (jj0Var2 == null || jj0Var3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", jj0Var2);
    }

    public final void l(ij0 ij0Var) {
        if (k) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + ij0Var);
        }
        ij0Var.o = ByteOrder.LITTLE_ENDIAN;
        ij0Var.b(x.length);
        int readInt = ij0Var.readInt() + 8;
        byte[] bArr = y;
        ij0Var.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                ij0Var.readFully(bArr2);
                int readInt2 = ij0Var.readInt();
                int i = length + 8;
                if (Arrays.equals(z, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    ij0Var.readFully(bArr3);
                    this.g = i;
                    r(0, bArr3);
                    u(new ij0(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                ij0Var.b(readInt2);
            } catch (EOFException unused) {
                dm0.j("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void m(ij0 ij0Var, HashMap hashMap) {
        jj0 jj0Var = (jj0) hashMap.get("JPEGInterchangeFormat");
        jj0 jj0Var2 = (jj0) hashMap.get("JPEGInterchangeFormatLength");
        if (jj0Var == null || jj0Var2 == null) {
            return;
        }
        int e = jj0Var.e(this.e);
        int e2 = jj0Var2.e(this.e);
        if (this.b == 7) {
            e += this.h;
        }
        if (e > 0 && e2 > 0 && this.a == null) {
            ij0Var.b(e);
            ij0Var.readFully(new byte[e2]);
        }
        if (k) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
        }
    }

    public final boolean n(HashMap hashMap) {
        jj0 jj0Var = (jj0) hashMap.get("ImageLength");
        jj0 jj0Var2 = (jj0) hashMap.get("ImageWidth");
        if (jj0Var == null || jj0Var2 == null) {
            return false;
        }
        return jj0Var.e(this.e) <= 512 && jj0Var2.e(this.e) <= 512;
    }

    public final void o(mj0 mj0Var) {
        ByteOrder q2 = q(mj0Var);
        this.e = q2;
        mj0Var.o = q2;
        int readUnsignedShort = mj0Var.readUnsignedShort();
        int i = this.b;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            ey.l(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = mj0Var.readInt();
        if (readInt < 8) {
            dm0.j(in1.k(readInt, "Invalid first Ifd offset: "));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            mj0Var.b(i2);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.c;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder n2 = in1.n(i, "The size of tag group[", "]: ");
            n2.append(hashMapArr[i].size());
            Log.d("ExifInterface", n2.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                jj0 jj0Var = (jj0) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + jj0Var.toString() + ", tagValue: '" + jj0Var.f(this.e) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) {
        mj0 mj0Var = new mj0(bArr);
        o(mj0Var);
        s(mj0Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(mj0 mj0Var, int i) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        boolean z2;
        short s2;
        HashMap[] hashMapArr2;
        long j;
        long j2;
        boolean z3;
        int i2;
        long j3;
        int i3;
        kj0 kj0Var;
        HashSet hashSet2;
        int readUnsignedShort;
        long j4;
        int i4 = i;
        int i5 = mj0Var.n;
        int i6 = mj0Var.q;
        Integer valueOf = Integer.valueOf(i5);
        HashSet hashSet3 = this.d;
        hashSet3.add(valueOf);
        short readShort = mj0Var.readShort();
        boolean z4 = k;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            hashMapArr = this.c;
            if (s3 >= readShort) {
                break;
            }
            int readUnsignedShort2 = mj0Var.readUnsignedShort();
            int readUnsignedShort3 = mj0Var.readUnsignedShort();
            int readInt = mj0Var.readInt();
            long j5 = mj0Var.n + 4;
            short s4 = readShort;
            kj0 kj0Var2 = (kj0) G[i4].get(Integer.valueOf(readUnsignedShort2));
            if (z4) {
                z2 = z4;
                s2 = s3;
                hashMapArr2 = hashMapArr;
                hashSet = hashSet3;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i4), Integer.valueOf(readUnsignedShort2), kj0Var2 != null ? kj0Var2.b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                hashSet = hashSet3;
                z2 = z4;
                s2 = s3;
                hashMapArr2 = hashMapArr;
            }
            if (kj0Var2 != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < B.length) {
                        int i7 = kj0Var2.c;
                        if (i7 == 7 || readUnsignedShort3 == 7 || i7 == readUnsignedShort3 || (i2 = kj0Var2.d) == readUnsignedShort3 || (((i7 == 4 || i2 == 4) && readUnsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && readUnsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i7;
                            }
                            j = j5;
                            j2 = readInt * r7[readUnsignedShort3];
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z2) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z3 = false;
                                if (z3) {
                                    mj0Var.f(j);
                                    hashSet2 = hashSet;
                                } else {
                                    long j6 = j;
                                    if (j2 > 4) {
                                        int readInt2 = mj0Var.readInt();
                                        if (z2) {
                                            i3 = readUnsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            i3 = readUnsignedShort2;
                                        }
                                        if (this.b == 7) {
                                            if ("MakerNote".equals(kj0Var2.b)) {
                                                this.h = readInt2;
                                            } else if (i4 == 6 && "ThumbnailImage".equals(kj0Var2.b)) {
                                                this.i = readInt2;
                                                this.j = readInt;
                                                jj0 c = jj0.c(6, this.e);
                                                j3 = j6;
                                                jj0 a = jj0.a(this.i, this.e);
                                                kj0Var = kj0Var2;
                                                jj0 a2 = jj0.a(this.j, this.e);
                                                hashMapArr2[4].put("Compression", c);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a2);
                                                mj0Var.f(readInt2);
                                            }
                                        }
                                        kj0Var = kj0Var2;
                                        j3 = j6;
                                        mj0Var.f(readInt2);
                                    } else {
                                        j3 = j6;
                                        i3 = readUnsignedShort2;
                                        kj0Var = kj0Var2;
                                    }
                                    Integer num = (Integer) J.get(Integer.valueOf(i3));
                                    if (z2) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j4 = mj0Var.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = mj0Var.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = mj0Var.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z2) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), kj0Var.b));
                                            }
                                            if (j4 > 0 || (i6 != -1 && j4 >= i6)) {
                                                hashSet2 = hashSet;
                                                if (z2) {
                                                    String i8 = q40.i(j4, "Skip jump into the IFD since its offset is invalid: ");
                                                    if (i6 != -1) {
                                                        i8 = i8 + " (total length: " + i6 + ")";
                                                    }
                                                    Log.d("ExifInterface", i8);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j4))) {
                                                    mj0Var.f(j4);
                                                    s(mj0Var, num.intValue());
                                                } else if (z2) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            }
                                            mj0Var.f(j3);
                                        } else {
                                            readUnsignedShort = mj0Var.readUnsignedShort();
                                        }
                                        j4 = readUnsignedShort;
                                        if (z2) {
                                        }
                                        if (j4 > 0) {
                                        }
                                        hashSet2 = hashSet;
                                        if (z2) {
                                        }
                                        mj0Var.f(j3);
                                    } else {
                                        hashSet2 = hashSet;
                                        long j7 = j3;
                                        int i9 = mj0Var.n + this.g;
                                        byte[] bArr = new byte[(int) j2];
                                        mj0Var.readFully(bArr);
                                        jj0 jj0Var = new jj0(i9, bArr, readUnsignedShort3, readInt);
                                        HashMap hashMap = hashMapArr2[i];
                                        String str = kj0Var.b;
                                        hashMap.put(str, jj0Var);
                                        if ("DNGVersion".equals(str)) {
                                            this.b = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && jj0Var.f(this.e).contains("PENTAX")) || ("Compression".equals(str) && jj0Var.e(this.e) == 65535)) {
                                            this.b = 8;
                                        }
                                        if (mj0Var.n != j7) {
                                            mj0Var.f(j7);
                                        }
                                    }
                                }
                                s3 = (short) (s2 + 1);
                                i4 = i;
                                hashSet3 = hashSet2;
                                readShort = s4;
                                z4 = z2;
                            } else {
                                z3 = true;
                                if (z3) {
                                }
                                s3 = (short) (s2 + 1);
                                i4 = i;
                                hashSet3 = hashSet2;
                                readShort = s4;
                                z4 = z2;
                            }
                        } else if (z2) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + A[readUnsignedShort3] + ") is unexpected for tag: " + kj0Var2.b);
                        }
                    }
                }
                j = j5;
                if (z2) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j2 = 0;
                z3 = false;
                if (z3) {
                }
                s3 = (short) (s2 + 1);
                i4 = i;
                hashSet3 = hashSet2;
                readShort = s4;
                z4 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            j = j5;
            j2 = 0;
            z3 = false;
            if (z3) {
            }
            s3 = (short) (s2 + 1);
            i4 = i;
            hashSet3 = hashSet2;
            readShort = s4;
            z4 = z2;
        }
        HashSet hashSet4 = hashSet3;
        boolean z5 = z4;
        int readInt3 = mj0Var.readInt();
        if (z5) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j8 = readInt3;
        if (j8 <= 0) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        mj0Var.f(j8);
        if (hashMapArr[4].isEmpty()) {
            s(mj0Var, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(mj0Var, 5);
        }
    }

    public final void t(int i, String str, String str2) {
        HashMap[] hashMapArr = this.c;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void u(ij0 ij0Var) {
        jj0 jj0Var;
        int e;
        HashMap hashMap = this.c[4];
        jj0 jj0Var2 = (jj0) hashMap.get("Compression");
        if (jj0Var2 == null) {
            m(ij0Var, hashMap);
            return;
        }
        int e2 = jj0Var2.e(this.e);
        if (e2 != 1) {
            if (e2 == 6) {
                m(ij0Var, hashMap);
                return;
            } else if (e2 != 7) {
                return;
            }
        }
        jj0 jj0Var3 = (jj0) hashMap.get("BitsPerSample");
        if (jj0Var3 != null) {
            int[] iArr = (int[]) jj0Var3.g(this.e);
            int[] iArr2 = l;
            if (Arrays.equals(iArr2, iArr) || (this.b == 3 && (jj0Var = (jj0) hashMap.get("PhotometricInterpretation")) != null && (((e = jj0Var.e(this.e)) == 1 && Arrays.equals(iArr, m)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                jj0 jj0Var4 = (jj0) hashMap.get("StripOffsets");
                jj0 jj0Var5 = (jj0) hashMap.get("StripByteCounts");
                if (jj0Var4 == null || jj0Var5 == null) {
                    return;
                }
                long[] u2 = o70.u(jj0Var4.g(this.e));
                long[] u3 = o70.u(jj0Var5.g(this.e));
                if (u2 == null || u2.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (u3 == null || u3.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (u2.length != u3.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : u3) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < u2.length; i3++) {
                    int i4 = (int) u2[i3];
                    int i5 = (int) u3[i3];
                    if (i3 < u2.length - 1 && i4 + i5 != u2[i3 + 1]) {
                        this.f = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        ij0Var.b(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            ij0Var.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.f) {
                    long j3 = u2[0];
                    return;
                }
                return;
            }
        }
        if (k) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i2) {
        HashMap[] hashMapArr = this.c;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = k;
        if (isEmpty || hashMapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        jj0 jj0Var = (jj0) hashMapArr[i].get("ImageLength");
        jj0 jj0Var2 = (jj0) hashMapArr[i].get("ImageWidth");
        jj0 jj0Var3 = (jj0) hashMapArr[i2].get("ImageLength");
        jj0 jj0Var4 = (jj0) hashMapArr[i2].get("ImageWidth");
        if (jj0Var == null || jj0Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (jj0Var3 == null || jj0Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e = jj0Var.e(this.e);
        int e2 = jj0Var2.e(this.e);
        int e3 = jj0Var3.e(this.e);
        int e4 = jj0Var4.e(this.e);
        if (e >= e3 || e2 >= e4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void w(mj0 mj0Var, int i) {
        jj0 c;
        jj0 c2;
        HashMap[] hashMapArr = this.c;
        jj0 jj0Var = (jj0) hashMapArr[i].get("DefaultCropSize");
        jj0 jj0Var2 = (jj0) hashMapArr[i].get("SensorTopBorder");
        jj0 jj0Var3 = (jj0) hashMapArr[i].get("SensorLeftBorder");
        jj0 jj0Var4 = (jj0) hashMapArr[i].get("SensorBottomBorder");
        jj0 jj0Var5 = (jj0) hashMapArr[i].get("SensorRightBorder");
        if (jj0Var != null) {
            int i2 = jj0Var.a;
            ByteOrder byteOrder = this.e;
            if (i2 == 5) {
                lj0[] lj0VarArr = (lj0[]) jj0Var.g(byteOrder);
                if (lj0VarArr == null || lj0VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(lj0VarArr));
                    return;
                }
                c = jj0.b(lj0VarArr[0], this.e);
                c2 = jj0.b(lj0VarArr[1], this.e);
            } else {
                int[] iArr = (int[]) jj0Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c = jj0.c(iArr[0], this.e);
                c2 = jj0.c(iArr[1], this.e);
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
            return;
        }
        if (jj0Var2 != null && jj0Var3 != null && jj0Var4 != null && jj0Var5 != null) {
            int e = jj0Var2.e(this.e);
            int e2 = jj0Var4.e(this.e);
            int e3 = jj0Var5.e(this.e);
            int e4 = jj0Var3.e(this.e);
            if (e2 <= e || e3 <= e4) {
                return;
            }
            jj0 c3 = jj0.c(e2 - e, this.e);
            jj0 c4 = jj0.c(e3 - e4, this.e);
            hashMapArr[i].put("ImageLength", c3);
            hashMapArr[i].put("ImageWidth", c4);
            return;
        }
        jj0 jj0Var6 = (jj0) hashMapArr[i].get("ImageLength");
        jj0 jj0Var7 = (jj0) hashMapArr[i].get("ImageWidth");
        if (jj0Var6 == null || jj0Var7 == null) {
            jj0 jj0Var8 = (jj0) hashMapArr[i].get("JPEGInterchangeFormat");
            jj0 jj0Var9 = (jj0) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (jj0Var8 == null || jj0Var9 == null) {
                return;
            }
            int e5 = jj0Var8.e(this.e);
            int e6 = jj0Var8.e(this.e);
            mj0Var.f(e5);
            byte[] bArr = new byte[e6];
            mj0Var.readFully(bArr);
            e(new ij0(bArr), e5, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.c;
        jj0 jj0Var = (jj0) hashMapArr[1].get("PixelXDimension");
        jj0 jj0Var2 = (jj0) hashMapArr[1].get("PixelYDimension");
        if (jj0Var != null && jj0Var2 != null) {
            hashMapArr[0].put("ImageWidth", jj0Var);
            hashMapArr[0].put("ImageLength", jj0Var2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
