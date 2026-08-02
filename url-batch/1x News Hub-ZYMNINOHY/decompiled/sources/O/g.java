package O;

import E1.AbstractC0033i;
import a.AbstractC0129a;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f1097A;

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f1098B;

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f1099C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f1100D;

    /* renamed from: E, reason: collision with root package name */
    public static final String[] f1101E;

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f1102F;

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f1103G;

    /* renamed from: H, reason: collision with root package name */
    public static final d f1104H;

    /* renamed from: I, reason: collision with root package name */
    public static final d[][] f1105I;

    /* renamed from: J, reason: collision with root package name */
    public static final d[] f1106J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap[] f1107K;
    public static final HashMap[] L;

    /* renamed from: M, reason: collision with root package name */
    public static final Set f1108M;

    /* renamed from: N, reason: collision with root package name */
    public static final HashMap f1109N;

    /* renamed from: O, reason: collision with root package name */
    public static final Charset f1110O;

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f1111P;

    /* renamed from: Q, reason: collision with root package name */
    public static final byte[] f1112Q;
    public static final boolean o = Log.isLoggable("ExifInterface", 3);

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f1113p;

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f1114q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f1115r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f1116s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f1117t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f1118u;
    public static final byte[] v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f1119w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f1120x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f1121y;
    public static final byte[] z;

    /* renamed from: a, reason: collision with root package name */
    public final String f1122a;

    /* renamed from: b, reason: collision with root package name */
    public final FileDescriptor f1123b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f1124c;

    /* renamed from: d, reason: collision with root package name */
    public int f1125d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1126e;
    public final HashMap[] f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f1127g;

    /* renamed from: h, reason: collision with root package name */
    public ByteOrder f1128h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1129i;

    /* renamed from: j, reason: collision with root package name */
    public int f1130j;

    /* renamed from: k, reason: collision with root package name */
    public int f1131k;

    /* renamed from: l, reason: collision with root package name */
    public int f1132l;

    /* renamed from: m, reason: collision with root package name */
    public int f1133m;

    /* renamed from: n, reason: collision with root package name */
    public c f1134n;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f1113p = new int[]{8, 8, 8};
        f1114q = new int[]{8};
        f1115r = new byte[]{-1, -40, -1};
        f1116s = new byte[]{102, 116, 121, 112};
        f1117t = new byte[]{109, 105, 102, 49};
        f1118u = new byte[]{104, 101, 105, 99};
        v = new byte[]{97, 118, 105, 102};
        f1119w = new byte[]{97, 118, 105, 115};
        f1120x = new byte[]{79, 76, 89, 77, 80, 0};
        f1121y = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        z = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f1097A = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        f1098B = new byte[]{82, 73, 70, 70};
        f1099C = new byte[]{87, 69, 66, 80};
        f1100D = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f1101E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f1102F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f1103G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f1104H = new d("StripOffsets", 273, 3);
        f1105I = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f1106J = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f1107K = new HashMap[10];
        L = new HashMap[10];
        f1108M = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f1109N = new HashMap();
        Charset forName = Charset.forName(CharEncoding.US_ASCII);
        f1110O = forName;
        f1111P = "Exif\u0000\u0000".getBytes(forName);
        f1112Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i3 = 0;
        while (true) {
            d[][] dVarArr6 = f1105I;
            if (i3 >= dVarArr6.length) {
                HashMap hashMap = f1109N;
                d[] dVarArr7 = f1106J;
                hashMap.put(Integer.valueOf(dVarArr7[0].f1091a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f1091a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f1091a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f1091a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f1091a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f1091a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f1107K[i3] = new HashMap();
            L[i3] = new HashMap();
            for (d dVar : dVarArr6[i3]) {
                f1107K[i3].put(Integer.valueOf(dVar.f1091a), dVar);
                L[i3].put(dVar.f1092b, dVar);
            }
            i3++;
        }
    }

    public g(String str) {
        FileInputStream fileInputStream;
        boolean z2;
        d[][] dVarArr = f1105I;
        this.f = new HashMap[dVarArr.length];
        this.f1127g = new HashSet(dVarArr.length);
        this.f1128h = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream2 = null;
        this.f1124c = null;
        this.f1122a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z2 = true;
            } catch (Exception unused) {
                if (o) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z2 = false;
            }
            if (z2) {
                this.f1123b = fileInputStream.getFD();
            } else {
                this.f1123b = null;
            }
            p(fileInputStream);
            try {
                fileInputStream.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public static ByteOrder s(b bVar) {
        short readShort = bVar.readShort();
        boolean z2 = o;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b3 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f;
        if (b3 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b3.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(f1110O);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f1128h));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f1128h));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f1128h));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f1128h));
        }
    }

    public final String b(String str) {
        c c3 = c(str);
        if (c3 != null) {
            if (str.equals("GPSTimeStamp")) {
                int i3 = c3.f1087a;
                if (i3 != 5 && i3 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i3);
                    return null;
                }
                e[] eVarArr = (e[]) c3.g(this.f1128h);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (eVar.f1095a / eVar.f1096b));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (eVar2.f1095a / eVar2.f1096b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.f1095a / eVar3.f1096b)));
            }
            if (!f1108M.contains(str)) {
                return c3.f(this.f1128h);
            }
            try {
                return Double.toString(c3.d(this.f1128h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        c cVar;
        int i3;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (o) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i3 = this.f1125d) != 4 && ((i3 == 9 || i3 == 15 || i3 == 12 || i3 == 13) && (cVar2 = this.f1134n) != null)) {
            return cVar2;
        }
        for (int i4 = 0; i4 < f1105I.length; i4++) {
            c cVar3 = (c) this.f[i4].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f1134n) == null) {
            return null;
        }
        return cVar;
    }

    public final void d(f fVar, int i3) {
        String str;
        String str2;
        String str3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i3 == 15 && i4 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(fVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f1128h));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str3), this.f1128h));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f1128h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(parseInt2);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i5 = parseInt2 + 6;
                    int i6 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f1111P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    fVar.readFully(bArr2);
                    this.f1130j = i5;
                    t(0, bArr2);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j3 = parseInt4;
                    fVar.b(j3);
                    byte[] bArr3 = new byte[parseInt5];
                    fVar.readFully(bArr3);
                    this.f1134n = new c(j3, bArr3, 1, parseInt5);
                }
                if (o) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e3) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e3);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        r23.f1084c = r22.f1128h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016f, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0158 A[LOOP:0: B:9:0x0034->B:32:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(b bVar, int i3, int i4) {
        boolean z2 = o;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.f1084c = ByteOrder.BIG_ENDIAN;
        byte readByte = bVar.readByte();
        byte b3 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i5 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b3) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = bVar.readByte();
            if (z2) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i6 = readUnsignedShort - 2;
                int i7 = i5 + 4;
                if (z2) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i6 < 0) {
                    throw new IOException("Invalid length");
                }
                if (readByte3 != -31) {
                    HashMap[] hashMapArr = this.f;
                    if (readByte3 != -2) {
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
                                                bVar.a(1);
                                                hashMapArr[i4].put(i4 != 4 ? "ImageLength" : "ThumbnailImageLength", c.a(bVar.readUnsignedShort(), this.f1128h));
                                                hashMapArr[i4].put(i4 != 4 ? "ImageWidth" : "ThumbnailImageWidth", c.a(bVar.readUnsignedShort(), this.f1128h));
                                                i6 = readUnsignedShort - 7;
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
                        if (i6 >= 0) {
                            throw new IOException("Invalid length");
                        }
                        bVar.a(i6);
                        i5 = i7 + i6;
                        b3 = -1;
                    } else {
                        byte[] bArr = new byte[i6];
                        bVar.readFully(bArr);
                        if (b("UserComment") == null) {
                            HashMap hashMap = hashMapArr[1];
                            Charset charset = f1110O;
                            byte[] bytes = new String(bArr, charset).concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(charset);
                            hashMap.put("UserComment", new c(bytes, 2, bytes.length));
                        }
                    }
                } else {
                    byte[] bArr2 = new byte[i6];
                    bVar.readFully(bArr2);
                    int i8 = i7 + i6;
                    byte[] bArr3 = f1111P;
                    if (AbstractC0129a.E(bArr2, bArr3)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i6);
                        this.f1130j = i3 + i7 + bArr3.length;
                        t(i4, copyOfRange);
                        w(new b(copyOfRange));
                    } else {
                        byte[] bArr4 = f1112Q;
                        if (AbstractC0129a.E(bArr2, bArr4)) {
                            int length = i7 + bArr4.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i6);
                            this.f1134n = new c(length, copyOfRange2, 1, copyOfRange2.length);
                        }
                    }
                    i7 = i8;
                }
                i6 = 0;
                if (i6 >= 0) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0062, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00eb, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0186, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        int i3;
        b bVar;
        int i4;
        b bVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        long readInt;
        byte[] bArr;
        long j3;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i9 = 0;
        while (true) {
            byte[] bArr3 = f1115r;
            if (i9 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i9] != bArr3[i9]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i10 = 0; i10 < bytes.length; i10++) {
                    if (bArr2[i10] != bytes[i10]) {
                        b bVar3 = null;
                        try {
                            bVar = new b(bArr2);
                            try {
                                try {
                                    readInt = bVar.readInt();
                                    bArr = new byte[4];
                                    bVar.readFully(bArr);
                                } catch (Exception e3) {
                                    e = e3;
                                    i3 = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bVar3 = bVar;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i3 = 0;
                            bVar = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, f1116s)) {
                            if (readInt == 1) {
                                readInt = bVar.readLong();
                                j3 = 16;
                            } else {
                                j3 = 8;
                            }
                            i3 = 0;
                            long j4 = 5000;
                            if (readInt > j4) {
                                readInt = j4;
                            }
                            long j5 = readInt - j3;
                            if (j5 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    for (long j6 = 0; j6 < j5 / 4; j6++) {
                                        try {
                                            bVar.readFully(bArr4);
                                            if (j6 != 1) {
                                                if (Arrays.equals(bArr4, f1117t)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, f1118u)) {
                                                    z3 = true;
                                                } else if (Arrays.equals(bArr4, v) || Arrays.equals(bArr4, f1119w)) {
                                                    z4 = true;
                                                }
                                                if (z2) {
                                                    if (z3) {
                                                        bVar.close();
                                                        i4 = 12;
                                                        break;
                                                    }
                                                    if (z4) {
                                                        bVar.close();
                                                        i4 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    if (o) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            bVar.close();
                            i4 = i3;
                            if (i4 == 0) {
                                return i4;
                            }
                            try {
                                bVar2 = new b(bArr2);
                            } catch (Exception unused2) {
                                bVar2 = null;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            try {
                                ByteOrder s3 = s(bVar2);
                                this.f1128h = s3;
                                bVar2.f1084c = s3;
                                short readShort = bVar2.readShort();
                                i5 = (readShort == 20306 || readShort == 21330) ? 1 : i3;
                                bVar2.close();
                            } catch (Exception unused3) {
                                if (bVar2 != null) {
                                    bVar2.close();
                                }
                                i5 = i3;
                                if (i5 == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                bVar3 = bVar2;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                            if (i5 == 0) {
                                return 7;
                            }
                            try {
                                b bVar4 = new b(bArr2);
                                try {
                                    ByteOrder s4 = s(bVar4);
                                    this.f1128h = s4;
                                    bVar4.f1084c = s4;
                                    i6 = bVar4.readShort() == 85 ? 1 : i3;
                                    bVar4.close();
                                } catch (Exception unused4) {
                                    bVar3 = bVar4;
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    i6 = i3;
                                    if (i6 == 0) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bVar3 = bVar4;
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused5) {
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            if (i6 == 0) {
                                return 10;
                            }
                            int i11 = i3;
                            while (true) {
                                byte[] bArr5 = z;
                                if (i11 >= bArr5.length) {
                                    i7 = 1;
                                    break;
                                }
                                if (bArr2[i11] != bArr5[i11]) {
                                    i7 = i3;
                                    break;
                                }
                                i11++;
                            }
                            if (i7 != 0) {
                                return 13;
                            }
                            int i12 = i3;
                            while (true) {
                                byte[] bArr6 = f1098B;
                                if (i12 >= bArr6.length) {
                                    int i13 = i3;
                                    while (true) {
                                        byte[] bArr7 = f1099C;
                                        if (i13 >= bArr7.length) {
                                            i8 = 1;
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i13 + 4] != bArr7[i13]) {
                                            break;
                                        }
                                        i13++;
                                    }
                                } else {
                                    if (bArr2[i12] != bArr6[i12]) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            if (i8 != 0) {
                                return 14;
                            }
                            return i3;
                        }
                        bVar.close();
                        i3 = 0;
                        i4 = 0;
                        if (i4 == 0) {
                        }
                    }
                }
                return 9;
            }
            i9++;
        }
    }

    public final void g(f fVar) {
        int i3;
        int i4;
        j(fVar);
        HashMap[] hashMapArr = this.f;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f1090d);
            fVar2.f1084c = this.f1128h;
            byte[] bArr = f1120x;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f1121y;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            u(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f1128h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i5 = iArr[2];
                int i6 = iArr[0];
                if (i5 <= i6 || (i3 = iArr[3]) <= (i4 = iArr[1])) {
                    return;
                }
                int i7 = (i5 - i6) + 1;
                int i8 = (i3 - i4) + 1;
                if (i7 < i8) {
                    int i9 = i7 + i8;
                    i8 = i9 - i8;
                    i7 = i9 - i8;
                }
                c c3 = c.c(i7, this.f1128h);
                c c4 = c.c(i8, this.f1128h);
                hashMapArr[0].put("ImageWidth", c3);
                hashMapArr[0].put("ImageLength", c4);
            }
        }
    }

    public final void h(b bVar) {
        if (o) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f1084c = ByteOrder.BIG_ENDIAN;
        int i3 = bVar.f1083b;
        bVar.a(z.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int i4 = bVar.f1083b;
                int i5 = i4 + readInt + 4;
                int i6 = i4 - i3;
                if (i6 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z2) {
                    this.f1130j = i6;
                    byte[] bArr = new byte[readInt];
                    bVar.readFully(bArr);
                    int readInt3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    t(0, bArr);
                    z();
                    w(new b(bArr));
                    z2 = true;
                } else if (readInt2 == 1767135348 && !z3) {
                    byte[] bArr2 = f1097A;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i7 = bVar.f1083b - i3;
                            int i8 = readInt - length;
                            byte[] bArr4 = new byte[i8];
                            bVar.readFully(bArr4);
                            this.f1134n = new c(i7, bArr4, 1, i8);
                            z3 = true;
                        }
                    }
                }
                bVar.a(i5 - bVar.f1083b);
            } catch (EOFException e3) {
                throw new IOException("Encountered corrupt PNG file.", e3);
            }
        }
    }

    public final void i(b bVar) {
        boolean z2 = o;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i3 = ByteBuffer.wrap(bArr).getInt();
        int i4 = ByteBuffer.wrap(bArr2).getInt();
        int i5 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i4];
        bVar.a(i3 - bVar.f1083b);
        bVar.readFully(bArr4);
        e(new b(bArr4), i3, 5);
        bVar.a(i5 - bVar.f1083b);
        bVar.f1084c = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i6 = 0; i6 < readInt; i6++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f1104H.f1091a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c3 = c.c(readShort, this.f1128h);
                c c4 = c.c(readShort2, this.f1128h);
                HashMap[] hashMapArr = this.f;
                hashMapArr[0].put("ImageLength", c3);
                hashMapArr[0].put("ImageWidth", c4);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        q(fVar);
        u(fVar, 0);
        y(fVar, 0);
        y(fVar, 5);
        y(fVar, 4);
        z();
        if (this.f1125d == 8) {
            HashMap[] hashMapArr = this.f;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f1090d);
                fVar2.f1084c = this.f1128h;
                fVar2.a(6);
                u(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (o) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f1090d), (int) cVar.f1089c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final boolean l(f fVar) {
        byte[] bArr = f1111P;
        byte[] bArr2 = new byte[bArr.length];
        fVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArr3 = new byte[1024];
        int i3 = 0;
        while (true) {
            if (i3 == bArr3.length) {
                bArr3 = Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = fVar.f1082a.read(bArr3, i3, bArr3.length - i3);
            if (read == -1) {
                byte[] copyOf = Arrays.copyOf(bArr3, i3);
                this.f1130j = bArr.length;
                t(0, copyOf);
                return true;
            }
            i3 += read;
            fVar.f1083b += read;
        }
    }

    public final void m(b bVar) {
        if (o) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f1084c = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f1098B.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f1099C;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f1100D, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = f1111P;
                    if (AbstractC0129a.E(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f1130j = i3;
                    t(0, bArr3);
                    w(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i3 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(readInt2);
            } catch (EOFException e3) {
                throw new IOException("Encountered corrupt WebP file.", e3);
            }
        }
    }

    public final void n(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int e3 = cVar.e(this.f1128h);
        int e4 = cVar2.e(this.f1128h);
        if (this.f1125d == 7) {
            e3 += this.f1131k;
        }
        if (e3 > 0 && e4 > 0 && this.f1122a == null && this.f1124c == null && this.f1123b == null) {
            bVar.a(e3);
            bVar.readFully(new byte[e4]);
        }
        if (o) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e3 + ", length: " + e4);
        }
    }

    public final boolean o(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f1128h) <= 512 && cVar2.e(this.f1128h) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(InputStream inputStream) {
        boolean z2 = o;
        for (int i3 = 0; i3 < f1105I.length; i3++) {
            try {
                try {
                    this.f[i3] = new HashMap();
                } finally {
                    a();
                    if (z2) {
                        r();
                    }
                }
            } catch (IOException | UnsupportedOperationException e3) {
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e3);
                }
                a();
                if (z2) {
                    r();
                    return;
                }
                return;
            }
        }
        boolean z3 = this.f1126e;
        if (!z3) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f1125d = f(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i4 = this.f1125d;
        if (i4 != 4 && i4 != 9 && i4 != 13 && i4 != 14) {
            f fVar = new f(inputStream);
            if (!z3) {
                int i5 = this.f1125d;
                if (i5 != 12 && i5 != 15) {
                    if (i5 == 7) {
                        g(fVar);
                    } else if (i5 == 10) {
                        k(fVar);
                    } else {
                        j(fVar);
                    }
                }
                d(fVar, i5);
            } else if (!l(fVar)) {
                if (z2) {
                    return;
                } else {
                    return;
                }
            }
            fVar.b(this.f1130j);
            w(fVar);
            a();
            if (z2) {
                return;
            }
            r();
            return;
        }
        b bVar = new b(inputStream);
        int i6 = this.f1125d;
        if (i6 == 4) {
            e(bVar, 0, 0);
        } else if (i6 == 13) {
            h(bVar);
        } else if (i6 == 9) {
            i(bVar);
        } else if (i6 == 14) {
            m(bVar);
        }
        a();
        if (z2) {
        }
    }

    public final void q(f fVar) {
        ByteOrder s3 = s(fVar);
        this.f1128h = s3;
        fVar.f1084c = s3;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i3 = this.f1125d;
        if (i3 != 7 && i3 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt < 8) {
            throw new IOException(AbstractC0033i.h(readInt, "Invalid first Ifd offset: "));
        }
        int i4 = readInt - 8;
        if (i4 > 0) {
            fVar.a(i4);
        }
    }

    public final void r() {
        int i3 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f;
            if (i3 >= hashMapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i3 + "]: " + hashMapArr[i3].size());
            for (Map.Entry entry : hashMapArr[i3].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f1128h) + "'");
            }
            i3++;
        }
    }

    public final void t(int i3, byte[] bArr) {
        f fVar = new f(bArr);
        q(fVar);
        u(fVar, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(f fVar, int i3) {
        HashMap[] hashMapArr;
        short s3;
        boolean z2;
        short s4;
        HashMap[] hashMapArr2;
        HashSet hashSet;
        long j3;
        boolean z3;
        int i4;
        HashSet hashSet2;
        int i5;
        int i6;
        int readUnsignedShort;
        long j4;
        int i7 = i3;
        Integer valueOf = Integer.valueOf(fVar.f1083b);
        HashSet hashSet3 = this.f1127g;
        hashSet3.add(valueOf);
        short readShort = fVar.readShort();
        boolean z4 = o;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s5 = 0;
        while (true) {
            hashMapArr = this.f;
            if (s5 >= readShort) {
                break;
            }
            int readUnsignedShort2 = fVar.readUnsignedShort();
            int readUnsignedShort3 = fVar.readUnsignedShort();
            int readInt = fVar.readInt();
            long j5 = fVar.f1083b + 4;
            d dVar = (d) f1107K[i7].get(Integer.valueOf(readUnsignedShort2));
            if (z4) {
                s3 = readShort;
                z2 = z4;
                s4 = s5;
                hashMapArr2 = hashMapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i7), Integer.valueOf(readUnsignedShort2), dVar != null ? dVar.f1092b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s3 = readShort;
                z2 = z4;
                s4 = s5;
                hashMapArr2 = hashMapArr;
            }
            if (dVar != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f1102F.length) {
                        int i8 = dVar.f1093c;
                        if (i8 == 7 || readUnsignedShort3 == 7 || i8 == readUnsignedShort3 || (i4 = dVar.f1094d) == readUnsignedShort3 || (((i8 == 4 || i4 == 4) && readUnsignedShort3 == 3) || (((i8 == 9 || i4 == 9) && readUnsignedShort3 == 8) || ((i8 == 12 || i4 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i8;
                            }
                            hashSet = hashSet3;
                            j3 = readInt * r5[readUnsignedShort3];
                            if (j3 < 0 || j3 > 2147483647L) {
                                if (z2) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z3 = false;
                                if (z3) {
                                    fVar.b(j5);
                                } else {
                                    if (j3 > 4) {
                                        int readInt2 = fVar.readInt();
                                        if (z2) {
                                            hashSet2 = hashSet;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            hashSet2 = hashSet;
                                        }
                                        if (this.f1125d == 7) {
                                            if ("MakerNote".equals(dVar.f1092b)) {
                                                this.f1131k = readInt2;
                                            } else if (i7 == 6 && "ThumbnailImage".equals(dVar.f1092b)) {
                                                this.f1132l = readInt2;
                                                this.f1133m = readInt;
                                                c c3 = c.c(6, this.f1128h);
                                                i5 = readUnsignedShort2;
                                                c a3 = c.a(this.f1132l, this.f1128h);
                                                i6 = readInt;
                                                c a4 = c.a(this.f1133m, this.f1128h);
                                                hashMapArr2[4].put("Compression", c3);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a3);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a4);
                                                fVar.b(readInt2);
                                            }
                                        }
                                        i5 = readUnsignedShort2;
                                        i6 = readInt;
                                        fVar.b(readInt2);
                                    } else {
                                        hashSet2 = hashSet;
                                        i5 = readUnsignedShort2;
                                        i6 = readInt;
                                    }
                                    Integer num = (Integer) f1109N.get(Integer.valueOf(i5));
                                    if (z2) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j3);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j4 = fVar.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = fVar.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = fVar.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z2) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), dVar.f1092b));
                                            }
                                            int i9 = fVar.f1086e;
                                            if (j4 > 0 || (i9 != -1 && j4 >= i9)) {
                                                hashSet = hashSet2;
                                                if (z2) {
                                                    String str = "Skip jump into the IFD since its offset is invalid: " + j4;
                                                    if (i9 != -1) {
                                                        str = str + " (total length: " + i9 + ")";
                                                    }
                                                    Log.d("ExifInterface", str);
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                if (!hashSet.contains(Integer.valueOf((int) j4))) {
                                                    fVar.b(j4);
                                                    u(fVar, num.intValue());
                                                } else if (z2) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            }
                                            fVar.b(j5);
                                        } else {
                                            readUnsignedShort = fVar.readUnsignedShort();
                                        }
                                        j4 = readUnsignedShort;
                                        if (z2) {
                                        }
                                        int i92 = fVar.f1086e;
                                        if (j4 > 0) {
                                        }
                                        hashSet = hashSet2;
                                        if (z2) {
                                        }
                                        fVar.b(j5);
                                    } else {
                                        hashSet = hashSet2;
                                        int i10 = fVar.f1083b + this.f1130j;
                                        byte[] bArr = new byte[(int) j3];
                                        fVar.readFully(bArr);
                                        c cVar = new c(i10, bArr, readUnsignedShort3, i6);
                                        hashMapArr2[i3].put(dVar.f1092b, cVar);
                                        String str2 = dVar.f1092b;
                                        if ("DNGVersion".equals(str2)) {
                                            this.f1125d = 3;
                                        }
                                        if ((("Make".equals(str2) || "Model".equals(str2)) && cVar.f(this.f1128h).contains("PENTAX")) || ("Compression".equals(str2) && cVar.e(this.f1128h) == 65535)) {
                                            this.f1125d = 8;
                                        }
                                        if (fVar.f1083b != j5) {
                                            fVar.b(j5);
                                        }
                                    }
                                }
                                s5 = (short) (s4 + 1);
                                i7 = i3;
                                hashSet3 = hashSet;
                                readShort = s3;
                                z4 = z2;
                            } else {
                                z3 = true;
                                if (z3) {
                                }
                                s5 = (short) (s4 + 1);
                                i7 = i3;
                                hashSet3 = hashSet;
                                readShort = s3;
                                z4 = z2;
                            }
                        } else if (z2) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f1101E[readUnsignedShort3] + ") is unexpected for tag: " + dVar.f1092b);
                        }
                    }
                }
                hashSet = hashSet3;
                if (z2) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j3 = 0;
                z3 = false;
                if (z3) {
                }
                s5 = (short) (s4 + 1);
                i7 = i3;
                hashSet3 = hashSet;
                readShort = s3;
                z4 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            hashSet = hashSet3;
            j3 = 0;
            z3 = false;
            if (z3) {
            }
            s5 = (short) (s4 + 1);
            i7 = i3;
            hashSet3 = hashSet;
            readShort = s3;
            z4 = z2;
        }
        HashSet hashSet4 = hashSet3;
        boolean z5 = z4;
        int readInt3 = fVar.readInt();
        if (z5) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j6 = readInt3;
        if (j6 <= 0) {
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
        fVar.b(j6);
        if (hashMapArr[4].isEmpty()) {
            u(fVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            u(fVar, 5);
        }
    }

    public final void v(int i3, String str, String str2) {
        HashMap[] hashMapArr = this.f;
        if (hashMapArr[i3].isEmpty() || hashMapArr[i3].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i3];
        hashMap.put(str2, (c) hashMap.get(str));
        hashMapArr[i3].remove(str);
    }

    public final void w(b bVar) {
        c cVar;
        int e3;
        HashMap hashMap = this.f[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 == null) {
            n(bVar, hashMap);
            return;
        }
        int e4 = cVar2.e(this.f1128h);
        if (e4 != 1) {
            if (e4 == 6) {
                n(bVar, hashMap);
                return;
            } else if (e4 != 7) {
                return;
            }
        }
        c cVar3 = (c) hashMap.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f1128h);
            int[] iArr2 = f1113p;
            if (Arrays.equals(iArr2, iArr) || (this.f1125d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e3 = cVar.e(this.f1128h)) == 1 && Arrays.equals(iArr, f1114q)) || (e3 == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) hashMap.get("StripOffsets");
                c cVar5 = (c) hashMap.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] i3 = AbstractC0129a.i(cVar4.g(this.f1128h));
                long[] i4 = AbstractC0129a.i(cVar5.g(this.f1128h));
                if (i3 == null || i3.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (i4 == null || i4.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (i3.length != i4.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j3 = 0;
                for (long j4 : i4) {
                    j3 += j4;
                }
                byte[] bArr = new byte[(int) j3];
                this.f1129i = true;
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < i3.length; i7++) {
                    int i8 = (int) i3[i7];
                    int i9 = (int) i4[i7];
                    if (i7 < i3.length - 1 && i8 + i9 != i3[i7 + 1]) {
                        this.f1129i = false;
                    }
                    int i10 = i8 - i5;
                    if (i10 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.a(i10);
                        int i11 = i5 + i10;
                        byte[] bArr2 = new byte[i9];
                        try {
                            bVar.readFully(bArr2);
                            i5 = i11 + i9;
                            System.arraycopy(bArr2, 0, bArr, i6, i9);
                            i6 += i9;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i9 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i10 + " bytes.");
                        return;
                    }
                }
                if (this.f1129i) {
                    long j5 = i3[0];
                    return;
                }
                return;
            }
        }
        if (o) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void x(int i3, int i4) {
        HashMap[] hashMapArr = this.f;
        boolean isEmpty = hashMapArr[i3].isEmpty();
        boolean z2 = o;
        if (isEmpty || hashMapArr[i4].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) hashMapArr[i3].get("ImageLength");
        c cVar2 = (c) hashMapArr[i3].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i4].get("ImageLength");
        c cVar4 = (c) hashMapArr[i4].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e3 = cVar.e(this.f1128h);
        int e4 = cVar2.e(this.f1128h);
        int e5 = cVar3.e(this.f1128h);
        int e6 = cVar4.e(this.f1128h);
        if (e3 >= e5 || e4 >= e6) {
            return;
        }
        HashMap hashMap = hashMapArr[i3];
        hashMapArr[i3] = hashMapArr[i4];
        hashMapArr[i4] = hashMap;
    }

    public final void y(f fVar, int i3) {
        c c3;
        c c4;
        HashMap[] hashMapArr = this.f;
        c cVar = (c) hashMapArr[i3].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i3].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i3].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i3].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i3].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f1087a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f1128h);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                c3 = c.b(eVarArr[0], this.f1128h);
                c4 = c.b(eVarArr[1], this.f1128h);
            } else {
                int[] iArr = (int[]) cVar.g(this.f1128h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c3 = c.c(iArr[0], this.f1128h);
                c4 = c.c(iArr[1], this.f1128h);
            }
            hashMapArr[i3].put("ImageWidth", c3);
            hashMapArr[i3].put("ImageLength", c4);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e3 = cVar2.e(this.f1128h);
            int e4 = cVar4.e(this.f1128h);
            int e5 = cVar5.e(this.f1128h);
            int e6 = cVar3.e(this.f1128h);
            if (e4 <= e3 || e5 <= e6) {
                return;
            }
            c c5 = c.c(e4 - e3, this.f1128h);
            c c6 = c.c(e5 - e6, this.f1128h);
            hashMapArr[i3].put("ImageLength", c5);
            hashMapArr[i3].put("ImageWidth", c6);
            return;
        }
        c cVar6 = (c) hashMapArr[i3].get("ImageLength");
        c cVar7 = (c) hashMapArr[i3].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i3].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i3].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int e7 = cVar8.e(this.f1128h);
            int e8 = cVar8.e(this.f1128h);
            fVar.b(e7);
            byte[] bArr = new byte[e8];
            fVar.readFully(bArr);
            e(new b(bArr), e7, i3);
        }
    }

    public final void z() {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] hashMapArr = this.f;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && o(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!o(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        v(0, "ThumbnailOrientation", "Orientation");
        v(0, "ThumbnailImageLength", "ImageLength");
        v(0, "ThumbnailImageWidth", "ImageWidth");
        v(5, "ThumbnailOrientation", "Orientation");
        v(5, "ThumbnailImageLength", "ImageLength");
        v(5, "ThumbnailImageWidth", "ImageWidth");
        v(4, "Orientation", "ThumbnailOrientation");
        v(4, "ImageLength", "ThumbnailImageLength");
        v(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public g(ByteArrayInputStream byteArrayInputStream) {
        d[][] dVarArr = f1105I;
        this.f = new HashMap[dVarArr.length];
        this.f1127g = new HashSet(dVarArr.length);
        this.f1128h = ByteOrder.BIG_ENDIAN;
        this.f1122a = null;
        this.f1126e = false;
        this.f1124c = null;
        this.f1123b = null;
        p(byteArrayInputStream);
    }
}
