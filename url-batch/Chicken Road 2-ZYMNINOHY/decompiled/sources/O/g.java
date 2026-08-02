package O;

import E.AbstractC0005f;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.flutter.embedding.android.KeyboardMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
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
    public static final byte[] f1967A;

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f1968B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1969C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f1970D;

    /* renamed from: E, reason: collision with root package name */
    public static final d f1971E;

    /* renamed from: F, reason: collision with root package name */
    public static final d[][] f1972F;

    /* renamed from: G, reason: collision with root package name */
    public static final d[] f1973G;

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap[] f1974H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashMap[] f1975I;

    /* renamed from: J, reason: collision with root package name */
    public static final Set f1976J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap f1977K;
    public static final Charset L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f1978M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f1979N;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f1980l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f1981m;
    public static final int[] n;
    public static final byte[] o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f1982p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f1983q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f1984r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f1985s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f1986t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f1987u;
    public static final byte[] v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f1988w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f1989x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f1990y;
    public static final byte[] z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f1991a;

    /* renamed from: b, reason: collision with root package name */
    public int f1992b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap[] f1993c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f1994d;

    /* renamed from: e, reason: collision with root package name */
    public ByteOrder f1995e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1996f;

    /* renamed from: g, reason: collision with root package name */
    public int f1997g;

    /* renamed from: h, reason: collision with root package name */
    public int f1998h;

    /* renamed from: i, reason: collision with root package name */
    public int f1999i;

    /* renamed from: j, reason: collision with root package name */
    public int f2000j;

    /* renamed from: k, reason: collision with root package name */
    public c f2001k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f1981m = new int[]{8, 8, 8};
        n = new int[]{8};
        o = new byte[]{-1, -40, -1};
        f1982p = new byte[]{102, 116, 121, 112};
        f1983q = new byte[]{109, 105, 102, 49};
        f1984r = new byte[]{104, 101, 105, 99};
        f1985s = new byte[]{97, 118, 105, 102};
        f1986t = new byte[]{97, 118, 105, 115};
        f1987u = new byte[]{79, 76, 89, 77, 80, 0};
        v = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f1988w = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f1989x = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        f1990y = new byte[]{82, 73, 70, 70};
        z = new byte[]{87, 69, 66, 80};
        f1967A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f1968B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f1969C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f1970D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f1971E = new d("StripOffsets", 273, 3);
        f1972F = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f1973G = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f1974H = new HashMap[10];
        f1975I = new HashMap[10];
        f1976J = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f1977K = new HashMap();
        Charset forName = Charset.forName(CharEncoding.US_ASCII);
        L = forName;
        f1978M = "Exif\u0000\u0000".getBytes(forName);
        f1979N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i4 = 0;
        while (true) {
            d[][] dVarArr6 = f1972F;
            if (i4 >= dVarArr6.length) {
                HashMap hashMap = f1977K;
                d[] dVarArr7 = f1973G;
                hashMap.put(Integer.valueOf(dVarArr7[0].f1961a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f1961a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f1961a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f1961a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f1961a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f1961a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f1974H[i4] = new HashMap();
            f1975I[i4] = new HashMap();
            for (d dVar : dVarArr6[i4]) {
                f1974H[i4].put(Integer.valueOf(dVar.f1961a), dVar);
                f1975I[i4].put(dVar.f1962b, dVar);
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:7:0x0037, B:13:0x0054, B:20:0x0067, B:21:0x007a, B:30:0x006f, B:31:0x0073, B:32:0x0077, B:33:0x0084, B:35:0x008d, B:37:0x0093, B:39:0x0099, B:41:0x009f, B:51:0x00ad), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(ByteArrayInputStream byteArrayInputStream) {
        d[][] dVarArr = f1972F;
        this.f1993c = new HashMap[dVarArr.length];
        this.f1994d = new HashSet(dVarArr.length);
        this.f1995e = ByteOrder.BIG_ENDIAN;
        boolean z4 = f1980l;
        this.f1991a = null;
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            try {
                try {
                    this.f1993c[i4] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z4) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                if (z4) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z4) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e5) {
                e = e5;
                if (z4) {
                }
                a();
                if (!z4) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream, 5000);
        int f4 = f(bufferedInputStream);
        this.f1992b = f4;
        if (f4 != 4 && f4 != 9 && f4 != 13 && f4 != 14) {
            f fVar = new f(bufferedInputStream);
            int i5 = this.f1992b;
            if (i5 != 12 && i5 != 15) {
                if (i5 == 7) {
                    g(fVar);
                } else if (i5 == 10) {
                    k(fVar);
                } else {
                    j(fVar);
                }
                fVar.b(this.f1997g);
                u(fVar);
                a();
                if (!z4) {
                    return;
                }
                p();
            }
            d(fVar, i5);
            fVar.b(this.f1997g);
            u(fVar);
            a();
            if (!z4) {
            }
            p();
        }
        b bVar = new b(bufferedInputStream);
        int i6 = this.f1992b;
        if (i6 == 4) {
            e(bVar, 0, 0);
        } else if (i6 == 13) {
            h(bVar);
        } else if (i6 == 9) {
            i(bVar);
        } else if (i6 == 14) {
            l(bVar);
        }
        a();
        if (!z4) {
        }
        p();
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        boolean z4 = f1980l;
        if (readShort == 18761) {
            if (z4) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z4) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b4 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f1993c;
        if (b4 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b4.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(L);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f1995e));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f1995e));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f1995e));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f1995e));
        }
    }

    public final String b(String str) {
        c c4 = c(str);
        if (c4 != null) {
            int i4 = c4.f1957a;
            if (str.equals("GPSTimeStamp")) {
                if (i4 != 5 && i4 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i4);
                    return null;
                }
                e[] eVarArr = (e[]) c4.g(this.f1995e);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (eVar.f1965a / eVar.f1966b));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (eVar2.f1965a / eVar2.f1966b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.f1965a / eVar3.f1966b)));
            }
            if (!f1976J.contains(str)) {
                return c4.f(this.f1995e);
            }
            try {
                return Double.toString(c4.d(this.f1995e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        c cVar;
        int i4;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (f1980l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i4 = this.f1992b) != 4 && ((i4 == 9 || i4 == 15 || i4 == 12 || i4 == 13) && (cVar2 = this.f2001k) != null)) {
            return cVar2;
        }
        for (int i5 = 0; i5 < f1972F.length; i5++) {
            c cVar3 = (c) this.f1993c[i5].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f2001k) == null) {
            return null;
        }
        return cVar;
    }

    public final void d(f fVar, int i4) {
        String str;
        String str2;
        String str3;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i4 == 15 && i5 < 31) {
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
                HashMap[] hashMapArr = this.f1993c;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f1995e));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str3), this.f1995e));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f1995e));
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
                    int i6 = parseInt2 + 6;
                    int i7 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f1978M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i7];
                    fVar.readFully(bArr2);
                    this.f1997g = i6;
                    r(0, bArr2);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j4 = parseInt4;
                    fVar.b(j4);
                    byte[] bArr3 = new byte[parseInt5];
                    fVar.readFully(bArr3);
                    this.f2001k = new c(j4, bArr3, 1, parseInt5);
                }
                if (f1980l) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e4) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e4);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        r23.f1954c = r22.f1995e;
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
    public final void e(b bVar, int i4, int i5) {
        boolean z4 = f1980l;
        if (z4) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.f1954c = ByteOrder.BIG_ENDIAN;
        byte readByte = bVar.readByte();
        byte b4 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i6 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b4) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = bVar.readByte();
            if (z4) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i7 = readUnsignedShort - 2;
                int i8 = i6 + 4;
                if (z4) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i7 < 0) {
                    throw new IOException("Invalid length");
                }
                if (readByte3 != -31) {
                    HashMap[] hashMapArr = this.f1993c;
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
                                                hashMapArr[i5].put(i5 != 4 ? "ImageLength" : "ThumbnailImageLength", c.a(bVar.readUnsignedShort(), this.f1995e));
                                                hashMapArr[i5].put(i5 != 4 ? "ImageWidth" : "ThumbnailImageWidth", c.a(bVar.readUnsignedShort(), this.f1995e));
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
                        if (i7 >= 0) {
                            throw new IOException("Invalid length");
                        }
                        bVar.a(i7);
                        i6 = i8 + i7;
                        b4 = -1;
                    } else {
                        byte[] bArr = new byte[i7];
                        bVar.readFully(bArr);
                        if (b("UserComment") == null) {
                            HashMap hashMap = hashMapArr[1];
                            Charset charset = L;
                            byte[] bytes = new String(bArr, charset).concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(charset);
                            hashMap.put("UserComment", new c(bytes, 2, bytes.length));
                        }
                    }
                } else {
                    byte[] bArr2 = new byte[i7];
                    bVar.readFully(bArr2);
                    int i9 = i8 + i7;
                    byte[] bArr3 = f1978M;
                    if (AbstractC0347t0.t(bArr2, bArr3)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i7);
                        this.f1997g = i4 + i8 + bArr3.length;
                        r(i5, copyOfRange);
                        u(new b(copyOfRange));
                    } else {
                        byte[] bArr4 = f1979N;
                        if (AbstractC0347t0.t(bArr2, bArr4)) {
                            int length = i8 + bArr4.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i7);
                            this.f2001k = new c(length, copyOfRange2, 1, copyOfRange2.length);
                        }
                    }
                    i8 = i9;
                }
                i7 = 0;
                if (i7 >= 0) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0062, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00ec, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        b bVar;
        int i4;
        b bVar2;
        int i5;
        b bVar3;
        b bVar4;
        int i6;
        b bVar5;
        b bVar6;
        int i7;
        int i8;
        long readInt;
        byte[] bArr;
        long j4;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i9 = 0;
        while (true) {
            byte[] bArr3 = o;
            if (i9 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i9] != bArr3[i9]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i10 = 0; i10 < bytes.length; i10++) {
                    if (bArr2[i10] != bytes[i10]) {
                        int i11 = 1;
                        try {
                            bVar2 = new b(bArr2);
                            try {
                                try {
                                    readInt = bVar2.readInt();
                                    bArr = new byte[4];
                                    bVar2.readFully(bArr);
                                } catch (Exception e4) {
                                    e = e4;
                                    i4 = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            i4 = 0;
                            bVar2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = null;
                        }
                        if (Arrays.equals(bArr, f1982p)) {
                            if (readInt == 1) {
                                readInt = bVar2.readLong();
                                j4 = 16;
                            } else {
                                j4 = 8;
                            }
                            i4 = 0;
                            long j5 = 5000;
                            if (readInt > j5) {
                                readInt = j5;
                            }
                            long j6 = readInt - j4;
                            if (j6 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z4 = false;
                                    boolean z5 = false;
                                    boolean z6 = false;
                                    for (long j7 = 0; j7 < j6 / 4; j7++) {
                                        try {
                                            bVar2.readFully(bArr4);
                                            if (j7 != 1) {
                                                if (Arrays.equals(bArr4, f1983q)) {
                                                    z4 = true;
                                                } else if (Arrays.equals(bArr4, f1984r)) {
                                                    z5 = true;
                                                } else if (Arrays.equals(bArr4, f1985s) || Arrays.equals(bArr4, f1986t)) {
                                                    z6 = true;
                                                }
                                                if (z4) {
                                                    if (z5) {
                                                        bVar2.close();
                                                        i5 = 12;
                                                        break;
                                                    }
                                                    if (z6) {
                                                        bVar2.close();
                                                        i5 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    if (f1980l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            bVar2.close();
                            i5 = i4;
                            if (i5 == 0) {
                                return i5;
                            }
                            try {
                                bVar4 = new b(bArr2);
                                try {
                                    ByteOrder q4 = q(bVar4);
                                    this.f1995e = q4;
                                    bVar4.f1954c = q4;
                                    short readShort = bVar4.readShort();
                                    i6 = (readShort == 20306 || readShort == 21330) ? 1 : i4;
                                    bVar4.close();
                                } catch (Exception unused2) {
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    i6 = i4;
                                    if (i6 == 0) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    bVar3 = bVar4;
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused3) {
                                bVar4 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                bVar3 = null;
                            }
                            if (i6 == 0) {
                                return 7;
                            }
                            try {
                                b bVar7 = new b(bArr2);
                                try {
                                    ByteOrder q5 = q(bVar7);
                                    this.f1995e = q5;
                                    bVar7.f1954c = q5;
                                    i7 = bVar7.readShort() == 85 ? 1 : i4;
                                    bVar7.close();
                                } catch (Exception unused4) {
                                    bVar6 = bVar7;
                                    if (bVar6 != null) {
                                        bVar6.close();
                                    }
                                    i7 = i4;
                                    if (i7 == 0) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bVar5 = bVar7;
                                    if (bVar5 != null) {
                                        bVar5.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused5) {
                                bVar6 = null;
                            } catch (Throwable th6) {
                                th = th6;
                                bVar5 = null;
                            }
                            if (i7 == 0) {
                                return 10;
                            }
                            int i12 = i4;
                            while (true) {
                                byte[] bArr5 = f1988w;
                                if (i12 >= bArr5.length) {
                                    i8 = 1;
                                    break;
                                }
                                if (bArr2[i12] != bArr5[i12]) {
                                    i8 = i4;
                                    break;
                                }
                                i12++;
                            }
                            if (i8 != 0) {
                                return 13;
                            }
                            int i13 = i4;
                            while (true) {
                                byte[] bArr6 = f1990y;
                                if (i13 >= bArr6.length) {
                                    int i14 = i4;
                                    while (true) {
                                        byte[] bArr7 = z;
                                        if (i14 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i14 + 4] != bArr7[i14]) {
                                            break;
                                        }
                                        i14++;
                                    }
                                } else {
                                    if (bArr2[i13] != bArr6[i13]) {
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            i11 = i4;
                            if (i11 != 0) {
                                return 14;
                            }
                            return i4;
                        }
                        bVar2.close();
                        i4 = 0;
                        i5 = 0;
                        if (i5 == 0) {
                        }
                    }
                }
                return 9;
            }
            i9++;
        }
    }

    public final void g(f fVar) {
        int i4;
        int i5;
        j(fVar);
        HashMap[] hashMapArr = this.f1993c;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f1960d);
            fVar2.f1954c = this.f1995e;
            byte[] bArr = f1987u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f1995e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i6 = iArr[2];
                int i7 = iArr[0];
                if (i6 <= i7 || (i4 = iArr[3]) <= (i5 = iArr[1])) {
                    return;
                }
                int i8 = (i6 - i7) + 1;
                int i9 = (i4 - i5) + 1;
                if (i8 < i9) {
                    int i10 = i8 + i9;
                    i9 = i10 - i9;
                    i8 = i10 - i9;
                }
                c c4 = c.c(i8, this.f1995e);
                c c5 = c.c(i9, this.f1995e);
                hashMapArr[0].put("ImageWidth", c4);
                hashMapArr[0].put("ImageLength", c5);
            }
        }
    }

    public final void h(b bVar) {
        if (f1980l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f1954c = ByteOrder.BIG_ENDIAN;
        int i4 = bVar.f1953b;
        bVar.a(f1988w.length);
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            if (z4 && z5) {
                return;
            }
            try {
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int i5 = bVar.f1953b;
                int i6 = i5 + readInt + 4;
                int i7 = i5 - i4;
                if (i7 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z4) {
                    this.f1997g = i7;
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
                    r(0, bArr);
                    x();
                    u(new b(bArr));
                    z4 = true;
                } else if (readInt2 == 1767135348 && !z5) {
                    byte[] bArr2 = f1989x;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = bVar.f1953b - i4;
                            int i9 = readInt - length;
                            byte[] bArr4 = new byte[i9];
                            bVar.readFully(bArr4);
                            this.f2001k = new c(i8, bArr4, 1, i9);
                            z5 = true;
                        }
                    }
                }
                bVar.a(i6 - bVar.f1953b);
            } catch (EOFException e4) {
                throw new IOException("Encountered corrupt PNG file.", e4);
            }
        }
    }

    public final void i(b bVar) {
        boolean z4 = f1980l;
        if (z4) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i4 = ByteBuffer.wrap(bArr).getInt();
        int i5 = ByteBuffer.wrap(bArr2).getInt();
        int i6 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i5];
        bVar.a(i4 - bVar.f1953b);
        bVar.readFully(bArr4);
        e(new b(bArr4), i4, 5);
        bVar.a(i6 - bVar.f1953b);
        bVar.f1954c = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i7 = 0; i7 < readInt; i7++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f1971E.f1961a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c4 = c.c(readShort, this.f1995e);
                c c5 = c.c(readShort2, this.f1995e);
                HashMap[] hashMapArr = this.f1993c;
                hashMapArr[0].put("ImageLength", c4);
                hashMapArr[0].put("ImageWidth", c5);
                if (z4) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f1992b == 8) {
            HashMap[] hashMapArr = this.f1993c;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f1960d);
                fVar2.f1954c = this.f1995e;
                fVar2.a(6);
                s(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f1980l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f1993c;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f1960d), (int) cVar.f1959c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) {
        if (f1980l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f1954c = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f1990y.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = z;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i4 = length + 8;
                if (Arrays.equals(f1967A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = f1978M;
                    if (AbstractC0347t0.t(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f1997g = i4;
                    r(0, bArr3);
                    u(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i4 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(readInt2);
            } catch (EOFException e4) {
                throw new IOException("Encountered corrupt WebP file.", e4);
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int e4 = cVar.e(this.f1995e);
        int e5 = cVar2.e(this.f1995e);
        if (this.f1992b == 7) {
            e4 += this.f1998h;
        }
        if (e4 > 0 && e5 > 0 && this.f1991a == null) {
            bVar.a(e4);
            bVar.readFully(new byte[e5]);
        }
        if (f1980l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e4 + ", length: " + e5);
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f1995e) <= 512 && cVar2.e(this.f1995e) <= 512;
    }

    public final void o(f fVar) {
        ByteOrder q4 = q(fVar);
        this.f1995e = q4;
        fVar.f1954c = q4;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i4 = this.f1992b;
        if (i4 != 7 && i4 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt < 8) {
            throw new IOException(AbstractC0005f.j(readInt, "Invalid first Ifd offset: "));
        }
        int i5 = readInt - 8;
        if (i5 > 0) {
            fVar.a(i5);
        }
    }

    public final void p() {
        int i4 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f1993c;
            if (i4 >= hashMapArr.length) {
                return;
            }
            StringBuilder r4 = AbstractC0005f.r(i4, "The size of tag group[", "]: ");
            r4.append(hashMapArr[i4].size());
            Log.d("ExifInterface", r4.toString());
            for (Map.Entry entry : hashMapArr[i4].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f1995e) + "'");
            }
            i4++;
        }
    }

    public final void r(int i4, byte[] bArr) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(f fVar, int i4) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        boolean z4;
        short s4;
        HashMap[] hashMapArr2;
        long j4;
        long j5;
        boolean z5;
        int i5;
        long j6;
        int i6;
        d dVar;
        HashSet hashSet2;
        int readUnsignedShort;
        long j7;
        int i7 = i4;
        int i8 = fVar.f1953b;
        int i9 = fVar.f1956e;
        Integer valueOf = Integer.valueOf(i8);
        HashSet hashSet3 = this.f1994d;
        hashSet3.add(valueOf);
        short readShort = fVar.readShort();
        boolean z6 = f1980l;
        if (z6) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s5 = 0;
        while (true) {
            hashMapArr = this.f1993c;
            if (s5 >= readShort) {
                break;
            }
            int readUnsignedShort2 = fVar.readUnsignedShort();
            int readUnsignedShort3 = fVar.readUnsignedShort();
            int readInt = fVar.readInt();
            long j8 = fVar.f1953b + 4;
            short s6 = readShort;
            d dVar2 = (d) f1974H[i7].get(Integer.valueOf(readUnsignedShort2));
            if (z6) {
                z4 = z6;
                s4 = s5;
                hashMapArr2 = hashMapArr;
                hashSet = hashSet3;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i7), Integer.valueOf(readUnsignedShort2), dVar2 != null ? dVar2.f1962b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                hashSet = hashSet3;
                z4 = z6;
                s4 = s5;
                hashMapArr2 = hashMapArr;
            }
            if (dVar2 != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f1969C.length) {
                        int i10 = dVar2.f1963c;
                        if (i10 == 7 || readUnsignedShort3 == 7 || i10 == readUnsignedShort3 || (i5 = dVar2.f1964d) == readUnsignedShort3 || (((i10 == 4 || i5 == 4) && readUnsignedShort3 == 3) || (((i10 == 9 || i5 == 9) && readUnsignedShort3 == 8) || ((i10 == 12 || i5 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i10;
                            }
                            j4 = j8;
                            j5 = readInt * r7[readUnsignedShort3];
                            if (j5 < 0 || j5 > 2147483647L) {
                                if (z4) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z5 = false;
                                if (z5) {
                                    fVar.b(j4);
                                    hashSet2 = hashSet;
                                } else {
                                    long j9 = j4;
                                    if (j5 > 4) {
                                        int readInt2 = fVar.readInt();
                                        if (z4) {
                                            i6 = readUnsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            i6 = readUnsignedShort2;
                                        }
                                        if (this.f1992b == 7) {
                                            if ("MakerNote".equals(dVar2.f1962b)) {
                                                this.f1998h = readInt2;
                                            } else if (i7 == 6 && "ThumbnailImage".equals(dVar2.f1962b)) {
                                                this.f1999i = readInt2;
                                                this.f2000j = readInt;
                                                c c4 = c.c(6, this.f1995e);
                                                j6 = j9;
                                                c a3 = c.a(this.f1999i, this.f1995e);
                                                dVar = dVar2;
                                                c a4 = c.a(this.f2000j, this.f1995e);
                                                hashMapArr2[4].put("Compression", c4);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a3);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a4);
                                                fVar.b(readInt2);
                                            }
                                        }
                                        dVar = dVar2;
                                        j6 = j9;
                                        fVar.b(readInt2);
                                    } else {
                                        j6 = j9;
                                        i6 = readUnsignedShort2;
                                        dVar = dVar2;
                                    }
                                    Integer num = (Integer) f1977K.get(Integer.valueOf(i6));
                                    if (z4) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j5);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j7 = fVar.readInt() & KeyboardMap.kValueMask;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = fVar.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = fVar.readInt();
                                            } else {
                                                j7 = -1;
                                            }
                                            if (z4) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j7), dVar.f1962b));
                                            }
                                            if (j7 > 0 || (i9 != -1 && j7 >= i9)) {
                                                hashSet2 = hashSet;
                                                if (z4) {
                                                    String str = "Skip jump into the IFD since its offset is invalid: " + j7;
                                                    if (i9 != -1) {
                                                        str = str + " (total length: " + i9 + ")";
                                                    }
                                                    Log.d("ExifInterface", str);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j7))) {
                                                    fVar.b(j7);
                                                    s(fVar, num.intValue());
                                                } else if (z4) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j7 + ")");
                                                }
                                            }
                                            fVar.b(j6);
                                        } else {
                                            readUnsignedShort = fVar.readUnsignedShort();
                                        }
                                        j7 = readUnsignedShort;
                                        if (z4) {
                                        }
                                        if (j7 > 0) {
                                        }
                                        hashSet2 = hashSet;
                                        if (z4) {
                                        }
                                        fVar.b(j6);
                                    } else {
                                        hashSet2 = hashSet;
                                        long j10 = j6;
                                        int i11 = fVar.f1953b + this.f1997g;
                                        byte[] bArr = new byte[(int) j5];
                                        fVar.readFully(bArr);
                                        c cVar = new c(i11, bArr, readUnsignedShort3, readInt);
                                        HashMap hashMap = hashMapArr2[i4];
                                        String str2 = dVar.f1962b;
                                        hashMap.put(str2, cVar);
                                        if ("DNGVersion".equals(str2)) {
                                            this.f1992b = 3;
                                        }
                                        if ((("Make".equals(str2) || "Model".equals(str2)) && cVar.f(this.f1995e).contains("PENTAX")) || ("Compression".equals(str2) && cVar.e(this.f1995e) == 65535)) {
                                            this.f1992b = 8;
                                        }
                                        if (fVar.f1953b != j10) {
                                            fVar.b(j10);
                                        }
                                    }
                                }
                                s5 = (short) (s4 + 1);
                                i7 = i4;
                                hashSet3 = hashSet2;
                                readShort = s6;
                                z6 = z4;
                            } else {
                                z5 = true;
                                if (z5) {
                                }
                                s5 = (short) (s4 + 1);
                                i7 = i4;
                                hashSet3 = hashSet2;
                                readShort = s6;
                                z6 = z4;
                            }
                        } else if (z4) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f1968B[readUnsignedShort3] + ") is unexpected for tag: " + dVar2.f1962b);
                        }
                    }
                }
                j4 = j8;
                if (z4) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j5 = 0;
                z5 = false;
                if (z5) {
                }
                s5 = (short) (s4 + 1);
                i7 = i4;
                hashSet3 = hashSet2;
                readShort = s6;
                z6 = z4;
            } else if (z4) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            j4 = j8;
            j5 = 0;
            z5 = false;
            if (z5) {
            }
            s5 = (short) (s4 + 1);
            i7 = i4;
            hashSet3 = hashSet2;
            readShort = s6;
            z6 = z4;
        }
        HashSet hashSet4 = hashSet3;
        boolean z7 = z6;
        int readInt3 = fVar.readInt();
        if (z7) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j11 = readInt3;
        if (j11 <= 0) {
            if (z7) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z7) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        fVar.b(j11);
        if (hashMapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(fVar, 5);
        }
    }

    public final void t(int i4, String str, String str2) {
        HashMap[] hashMapArr = this.f1993c;
        if (hashMapArr[i4].isEmpty() || hashMapArr[i4].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i4];
        hashMap.put(str2, (c) hashMap.get(str));
        hashMapArr[i4].remove(str);
    }

    public final void u(b bVar) {
        c cVar;
        int e4;
        HashMap hashMap = this.f1993c[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 == null) {
            m(bVar, hashMap);
            return;
        }
        int e5 = cVar2.e(this.f1995e);
        if (e5 != 1) {
            if (e5 == 6) {
                m(bVar, hashMap);
                return;
            } else if (e5 != 7) {
                return;
            }
        }
        c cVar3 = (c) hashMap.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f1995e);
            int[] iArr2 = f1981m;
            if (Arrays.equals(iArr2, iArr) || (this.f1992b == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e4 = cVar.e(this.f1995e)) == 1 && Arrays.equals(iArr, n)) || (e4 == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) hashMap.get("StripOffsets");
                c cVar5 = (c) hashMap.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] d4 = AbstractC0347t0.d(cVar4.g(this.f1995e));
                long[] d5 = AbstractC0347t0.d(cVar5.g(this.f1995e));
                if (d4 == null || d4.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (d5 == null || d5.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (d4.length != d5.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j4 = 0;
                for (long j5 : d5) {
                    j4 += j5;
                }
                byte[] bArr = new byte[(int) j4];
                this.f1996f = true;
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < d4.length; i6++) {
                    int i7 = (int) d4[i6];
                    int i8 = (int) d5[i6];
                    if (i6 < d4.length - 1 && i7 + i8 != d4[i6 + 1]) {
                        this.f1996f = false;
                    }
                    int i9 = i7 - i4;
                    if (i9 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.a(i9);
                        int i10 = i4 + i9;
                        byte[] bArr2 = new byte[i8];
                        try {
                            bVar.readFully(bArr2);
                            i4 = i10 + i8;
                            System.arraycopy(bArr2, 0, bArr, i5, i8);
                            i5 += i8;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                        return;
                    }
                }
                if (this.f1996f) {
                    long j6 = d4[0];
                    return;
                }
                return;
            }
        }
        if (f1980l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i4, int i5) {
        HashMap[] hashMapArr = this.f1993c;
        boolean isEmpty = hashMapArr[i4].isEmpty();
        boolean z4 = f1980l;
        if (isEmpty || hashMapArr[i5].isEmpty()) {
            if (z4) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) hashMapArr[i4].get("ImageLength");
        c cVar2 = (c) hashMapArr[i4].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i5].get("ImageLength");
        c cVar4 = (c) hashMapArr[i5].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z4) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z4) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e4 = cVar.e(this.f1995e);
        int e5 = cVar2.e(this.f1995e);
        int e6 = cVar3.e(this.f1995e);
        int e7 = cVar4.e(this.f1995e);
        if (e4 >= e6 || e5 >= e7) {
            return;
        }
        HashMap hashMap = hashMapArr[i4];
        hashMapArr[i4] = hashMapArr[i5];
        hashMapArr[i5] = hashMap;
    }

    public final void w(f fVar, int i4) {
        c c4;
        c c5;
        HashMap[] hashMapArr = this.f1993c;
        c cVar = (c) hashMapArr[i4].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i4].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i4].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i4].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i4].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f1957a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f1995e);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                c4 = c.b(eVarArr[0], this.f1995e);
                c5 = c.b(eVarArr[1], this.f1995e);
            } else {
                int[] iArr = (int[]) cVar.g(this.f1995e);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c4 = c.c(iArr[0], this.f1995e);
                c5 = c.c(iArr[1], this.f1995e);
            }
            hashMapArr[i4].put("ImageWidth", c4);
            hashMapArr[i4].put("ImageLength", c5);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e4 = cVar2.e(this.f1995e);
            int e5 = cVar4.e(this.f1995e);
            int e6 = cVar5.e(this.f1995e);
            int e7 = cVar3.e(this.f1995e);
            if (e5 <= e4 || e6 <= e7) {
                return;
            }
            c c6 = c.c(e5 - e4, this.f1995e);
            c c7 = c.c(e6 - e7, this.f1995e);
            hashMapArr[i4].put("ImageLength", c6);
            hashMapArr[i4].put("ImageWidth", c7);
            return;
        }
        c cVar6 = (c) hashMapArr[i4].get("ImageLength");
        c cVar7 = (c) hashMapArr[i4].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i4].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i4].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int e8 = cVar8.e(this.f1995e);
            int e9 = cVar8.e(this.f1995e);
            fVar.b(e8);
            byte[] bArr = new byte[e9];
            fVar.readFully(bArr);
            e(new b(bArr), e8, i4);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f1993c;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
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
