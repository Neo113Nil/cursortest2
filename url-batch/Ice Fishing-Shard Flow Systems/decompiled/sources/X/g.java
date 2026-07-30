package X;

import C4.p;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
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

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f2808A;

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f2809B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2810C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f2811D;

    /* renamed from: E, reason: collision with root package name */
    public static final d f2812E;

    /* renamed from: F, reason: collision with root package name */
    public static final d[][] f2813F;

    /* renamed from: G, reason: collision with root package name */
    public static final d[] f2814G;

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap[] f2815H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashMap[] f2816I;

    /* renamed from: J, reason: collision with root package name */
    public static final Set f2817J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap f2818K;

    /* renamed from: L, reason: collision with root package name */
    public static final Charset f2819L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f2820M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f2821N;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f2822l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f2823m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f2824n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f2825o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f2826p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f2827q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f2828r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f2829s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f2830t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f2831u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f2832v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f2833w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f2834x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f2835y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f2836z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f2837a;

    /* renamed from: b, reason: collision with root package name */
    public int f2838b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap[] f2839c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f2840d;

    /* renamed from: e, reason: collision with root package name */
    public ByteOrder f2841e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2842f;

    /* renamed from: g, reason: collision with root package name */
    public int f2843g;

    /* renamed from: h, reason: collision with root package name */
    public int f2844h;

    /* renamed from: i, reason: collision with root package name */
    public int f2845i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public c f2846k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f2823m = new int[]{8, 8, 8};
        f2824n = new int[]{8};
        f2825o = new byte[]{-1, -40, -1};
        f2826p = new byte[]{102, 116, 121, 112};
        f2827q = new byte[]{109, 105, 102, 49};
        f2828r = new byte[]{104, 101, 105, 99};
        f2829s = new byte[]{97, 118, 105, 102};
        f2830t = new byte[]{97, 118, 105, 115};
        f2831u = new byte[]{79, 76, 89, 77, 80, 0};
        f2832v = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f2833w = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f2834x = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        f2835y = new byte[]{82, 73, 70, 70};
        f2836z = new byte[]{87, 69, 66, 80};
        f2808A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f2809B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f2810C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f2811D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        f2812E = new d("StripOffsets", 273, 3);
        f2813F = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f2814G = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f2815H = new HashMap[10];
        f2816I = new HashMap[10];
        f2817J = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f2818K = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f2819L = forName;
        f2820M = "Exif\u0000\u0000".getBytes(forName);
        f2821N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            d[][] dVarArr6 = f2813F;
            if (i2 >= dVarArr6.length) {
                HashMap hashMap = f2818K;
                d[] dVarArr7 = f2814G;
                hashMap.put(Integer.valueOf(dVarArr7[0].f2802a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f2802a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f2802a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f2802a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f2802a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f2802a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f2815H[i2] = new HashMap();
            f2816I[i2] = new HashMap();
            for (d dVar : dVarArr6[i2]) {
                f2815H[i2].put(Integer.valueOf(dVar.f2802a), dVar);
                f2816I[i2].put(dVar.f2803b, dVar);
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:7:0x0037, B:13:0x0054, B:20:0x0067, B:21:0x007a, B:30:0x006f, B:31:0x0073, B:32:0x0077, B:33:0x0084, B:35:0x008d, B:37:0x0093, B:39:0x0099, B:41:0x009f, B:51:0x00ad), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(ByteArrayInputStream byteArrayInputStream) {
        d[][] dVarArr = f2813F;
        this.f2839c = new HashMap[dVarArr.length];
        this.f2840d = new HashSet(dVarArr.length);
        this.f2841e = ByteOrder.BIG_ENDIAN;
        boolean z7 = f2822l;
        this.f2837a = null;
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            try {
                try {
                    this.f2839c[i2] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z7) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                if (z7) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z7) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e8) {
                e = e8;
                if (z7) {
                }
                a();
                if (!z7) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream, 5000);
        int f7 = f(bufferedInputStream);
        this.f2838b = f7;
        if (f7 != 4 && f7 != 9 && f7 != 13 && f7 != 14) {
            f fVar = new f(bufferedInputStream);
            int i5 = this.f2838b;
            if (i5 != 12 && i5 != 15) {
                if (i5 == 7) {
                    g(fVar);
                } else if (i5 == 10) {
                    k(fVar);
                } else {
                    j(fVar);
                }
                fVar.d(this.f2843g);
                u(fVar);
                a();
                if (!z7) {
                    return;
                }
                p();
            }
            d(fVar, i5);
            fVar.d(this.f2843g);
            u(fVar);
            a();
            if (!z7) {
            }
            p();
        }
        b bVar = new b(bufferedInputStream);
        int i7 = this.f2838b;
        if (i7 == 4) {
            e(bVar, 0, 0);
        } else if (i7 == 13) {
            h(bVar);
        } else if (i7 == 9) {
            i(bVar);
        } else if (i7 == 14) {
            l(bVar);
        }
        a();
        if (!z7) {
        }
        p();
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        boolean z7 = f2822l;
        if (readShort == 18761) {
            if (z7) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z7) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b7 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f2839c;
        if (b7 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b7.concat("\u0000").getBytes(f2819L);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f2841e));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f2841e));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f2841e));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f2841e));
        }
    }

    public final String b(String str) {
        c c7 = c(str);
        if (c7 != null) {
            int i2 = c7.f2798a;
            if (str.equals("GPSTimeStamp")) {
                if (i2 != 5 && i2 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i2);
                    return null;
                }
                e[] eVarArr = (e[]) c7.g(this.f2841e);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (eVar.f2806a / eVar.f2807b));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (eVar2.f2806a / eVar2.f2807b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.f2806a / eVar3.f2807b)));
            }
            if (!f2817J.contains(str)) {
                return c7.f(this.f2841e);
            }
            try {
                return Double.toString(c7.d(this.f2841e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        c cVar;
        int i2;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (f2822l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i2 = this.f2838b) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (cVar2 = this.f2846k) != null)) {
            return cVar2;
        }
        for (int i5 = 0; i5 < f2813F.length; i5++) {
            c cVar3 = (c) this.f2839c[i5].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f2846k) == null) {
            return null;
        }
        return cVar;
    }

    public final void d(f fVar, int i2) {
        String str;
        String str2;
        String str3;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i2 == 15 && i5 < 31) {
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
                HashMap[] hashMapArr = this.f2839c;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f2841e));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str3), this.f2841e));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f2841e));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.d(parseInt2);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i7 = parseInt2 + 6;
                    int i8 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f2820M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    fVar.readFully(bArr2);
                    this.f2843g = i7;
                    r(bArr2, 0);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    fVar.d(j);
                    byte[] bArr3 = new byte[parseInt5];
                    fVar.readFully(bArr3);
                    this.f2846k = new c(j, bArr3, 1, parseInt5);
                }
                if (f2822l) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e7) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e7);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        r23.f2795i = r22.f2841e;
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
    public final void e(b bVar, int i2, int i5) {
        boolean z7 = f2822l;
        if (z7) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.f2795i = ByteOrder.BIG_ENDIAN;
        byte readByte = bVar.readByte();
        byte b7 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i7 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b7) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = bVar.readByte();
            if (z7) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i8 = readUnsignedShort - 2;
                int i9 = i7 + 4;
                if (z7) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i8 < 0) {
                    throw new IOException("Invalid length");
                }
                if (readByte3 != -31) {
                    HashMap[] hashMapArr = this.f2839c;
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
                                                hashMapArr[i5].put(i5 != 4 ? "ImageLength" : "ThumbnailImageLength", c.a(bVar.readUnsignedShort(), this.f2841e));
                                                hashMapArr[i5].put(i5 != 4 ? "ImageWidth" : "ThumbnailImageWidth", c.a(bVar.readUnsignedShort(), this.f2841e));
                                                i8 = readUnsignedShort - 7;
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
                        if (i8 >= 0) {
                            throw new IOException("Invalid length");
                        }
                        bVar.a(i8);
                        i7 = i9 + i8;
                        b7 = -1;
                    } else {
                        byte[] bArr = new byte[i8];
                        bVar.readFully(bArr);
                        if (b("UserComment") == null) {
                            HashMap hashMap = hashMapArr[1];
                            Charset charset = f2819L;
                            byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                            hashMap.put("UserComment", new c(bytes, 2, bytes.length));
                        }
                    }
                } else {
                    byte[] bArr2 = new byte[i8];
                    bVar.readFully(bArr2);
                    int i10 = i9 + i8;
                    byte[] bArr3 = f2820M;
                    if (V6.b.O(bArr2, bArr3)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i8);
                        this.f2843g = i2 + i9 + bArr3.length;
                        r(copyOfRange, i5);
                        u(new b(copyOfRange));
                    } else {
                        byte[] bArr4 = f2821N;
                        if (V6.b.O(bArr2, bArr4)) {
                            int length = i9 + bArr4.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i8);
                            this.f2846k = new c(length, copyOfRange2, 1, copyOfRange2.length);
                        }
                    }
                    i9 = i10;
                }
                i8 = 0;
                if (i8 >= 0) {
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
        int i2;
        b bVar2;
        int i5;
        b bVar3;
        b bVar4;
        int i7;
        b bVar5;
        b bVar6;
        int i8;
        int i9;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f2825o;
            if (i10 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i10] != bArr3[i10]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i11 = 0; i11 < bytes.length; i11++) {
                    if (bArr2[i11] != bytes[i11]) {
                        int i12 = 1;
                        try {
                            bVar2 = new b(bArr2);
                            try {
                                try {
                                    readInt = bVar2.readInt();
                                    bArr = new byte[4];
                                    bVar2.readFully(bArr);
                                } catch (Exception e7) {
                                    e = e7;
                                    i2 = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            i2 = 0;
                            bVar2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = null;
                        }
                        if (Arrays.equals(bArr, f2826p)) {
                            if (readInt == 1) {
                                readInt = bVar2.readLong();
                                j = 16;
                            } else {
                                j = 8;
                            }
                            i2 = 0;
                            long j7 = 5000;
                            if (readInt > j7) {
                                readInt = j7;
                            }
                            long j8 = readInt - j;
                            if (j8 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z7 = false;
                                    boolean z8 = false;
                                    boolean z9 = false;
                                    for (long j9 = 0; j9 < j8 / 4; j9++) {
                                        try {
                                            bVar2.readFully(bArr4);
                                            if (j9 != 1) {
                                                if (Arrays.equals(bArr4, f2827q)) {
                                                    z7 = true;
                                                } else if (Arrays.equals(bArr4, f2828r)) {
                                                    z8 = true;
                                                } else if (Arrays.equals(bArr4, f2829s) || Arrays.equals(bArr4, f2830t)) {
                                                    z9 = true;
                                                }
                                                if (z7) {
                                                    if (z8) {
                                                        bVar2.close();
                                                        i5 = 12;
                                                        break;
                                                    }
                                                    if (z9) {
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
                                } catch (Exception e9) {
                                    e = e9;
                                    if (f2822l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            bVar2.close();
                            i5 = i2;
                            if (i5 == 0) {
                                return i5;
                            }
                            try {
                                bVar4 = new b(bArr2);
                                try {
                                    ByteOrder q4 = q(bVar4);
                                    this.f2841e = q4;
                                    bVar4.f2795i = q4;
                                    short readShort = bVar4.readShort();
                                    i7 = (readShort == 20306 || readShort == 21330) ? 1 : i2;
                                    bVar4.close();
                                } catch (Exception unused2) {
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    i7 = i2;
                                    if (i7 == 0) {
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
                            if (i7 == 0) {
                                return 7;
                            }
                            try {
                                b bVar7 = new b(bArr2);
                                try {
                                    ByteOrder q7 = q(bVar7);
                                    this.f2841e = q7;
                                    bVar7.f2795i = q7;
                                    i8 = bVar7.readShort() == 85 ? 1 : i2;
                                    bVar7.close();
                                } catch (Exception unused4) {
                                    bVar6 = bVar7;
                                    if (bVar6 != null) {
                                        bVar6.close();
                                    }
                                    i8 = i2;
                                    if (i8 == 0) {
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
                            if (i8 == 0) {
                                return 10;
                            }
                            int i13 = i2;
                            while (true) {
                                byte[] bArr5 = f2833w;
                                if (i13 >= bArr5.length) {
                                    i9 = 1;
                                    break;
                                }
                                if (bArr2[i13] != bArr5[i13]) {
                                    i9 = i2;
                                    break;
                                }
                                i13++;
                            }
                            if (i9 != 0) {
                                return 13;
                            }
                            int i14 = i2;
                            while (true) {
                                byte[] bArr6 = f2835y;
                                if (i14 >= bArr6.length) {
                                    int i15 = i2;
                                    while (true) {
                                        byte[] bArr7 = f2836z;
                                        if (i15 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i15 + 4] != bArr7[i15]) {
                                            break;
                                        }
                                        i15++;
                                    }
                                } else {
                                    if (bArr2[i14] != bArr6[i14]) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                            i12 = i2;
                            if (i12 != 0) {
                                return 14;
                            }
                            return i2;
                        }
                        bVar2.close();
                        i2 = 0;
                        i5 = 0;
                        if (i5 == 0) {
                        }
                    }
                }
                return 9;
            }
            i10++;
        }
    }

    public final void g(f fVar) {
        int i2;
        int i5;
        j(fVar);
        HashMap[] hashMapArr = this.f2839c;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f2801d);
            fVar2.f2795i = this.f2841e;
            byte[] bArr = f2831u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.d(0L);
            byte[] bArr3 = f2832v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.d(12L);
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
                int[] iArr = (int[]) cVar4.g(this.f2841e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i7 = iArr[2];
                int i8 = iArr[0];
                if (i7 <= i8 || (i2 = iArr[3]) <= (i5 = iArr[1])) {
                    return;
                }
                int i9 = (i7 - i8) + 1;
                int i10 = (i2 - i5) + 1;
                if (i9 < i10) {
                    int i11 = i9 + i10;
                    i10 = i11 - i10;
                    i9 = i11 - i10;
                }
                c c7 = c.c(i9, this.f2841e);
                c c8 = c.c(i10, this.f2841e);
                hashMapArr[0].put("ImageWidth", c7);
                hashMapArr[0].put("ImageLength", c8);
            }
        }
    }

    public final void h(b bVar) {
        if (f2822l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f2795i = ByteOrder.BIG_ENDIAN;
        int i2 = bVar.f2794e;
        bVar.a(f2833w.length);
        boolean z7 = false;
        boolean z8 = false;
        while (true) {
            if (z7 && z8) {
                return;
            }
            try {
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int i5 = bVar.f2794e;
                int i7 = i5 + readInt + 4;
                int i8 = i5 - i2;
                if (i8 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z7) {
                    this.f2843g = i8;
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
                    r(bArr, 0);
                    x();
                    u(new b(bArr));
                    z7 = true;
                } else if (readInt2 == 1767135348 && !z8) {
                    byte[] bArr2 = f2834x;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i9 = bVar.f2794e - i2;
                            int i10 = readInt - length;
                            byte[] bArr4 = new byte[i10];
                            bVar.readFully(bArr4);
                            this.f2846k = new c(i9, bArr4, 1, i10);
                            z8 = true;
                        }
                    }
                }
                bVar.a(i7 - bVar.f2794e);
            } catch (EOFException e7) {
                throw new IOException("Encountered corrupt PNG file.", e7);
            }
        }
    }

    public final void i(b bVar) {
        boolean z7 = f2822l;
        if (z7) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i5 = ByteBuffer.wrap(bArr2).getInt();
        int i7 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i5];
        bVar.a(i2 - bVar.f2794e);
        bVar.readFully(bArr4);
        e(new b(bArr4), i2, 5);
        bVar.a(i7 - bVar.f2794e);
        bVar.f2795i = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i8 = 0; i8 < readInt; i8++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f2812E.f2802a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c7 = c.c(readShort, this.f2841e);
                c c8 = c.c(readShort2, this.f2841e);
                HashMap[] hashMapArr = this.f2839c;
                hashMapArr[0].put("ImageLength", c7);
                hashMapArr[0].put("ImageWidth", c8);
                if (z7) {
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
        if (this.f2838b == 8) {
            HashMap[] hashMapArr = this.f2839c;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f2801d);
                fVar2.f2795i = this.f2841e;
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
        if (f2822l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f2839c;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f2801d), (int) cVar.f2800c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) {
        if (f2822l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f2795i = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f2835y.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f2836z;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i2 = length + 8;
                if (Arrays.equals(f2808A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = f2820M;
                    if (V6.b.O(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f2843g = i2;
                    r(bArr3, 0);
                    u(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i2 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(readInt2);
            } catch (EOFException e7) {
                throw new IOException("Encountered corrupt WebP file.", e7);
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int e7 = cVar.e(this.f2841e);
        int e8 = cVar2.e(this.f2841e);
        if (this.f2838b == 7) {
            e7 += this.f2844h;
        }
        if (e7 > 0 && e8 > 0 && this.f2837a == null) {
            bVar.a(e7);
            bVar.readFully(new byte[e8]);
        }
        if (f2822l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e7 + ", length: " + e8);
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f2841e) <= 512 && cVar2.e(this.f2841e) <= 512;
    }

    public final void o(f fVar) {
        ByteOrder q4 = q(fVar);
        this.f2841e = q4;
        fVar.f2795i = q4;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i2 = this.f2838b;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt < 8) {
            throw new IOException(p.g(readInt, "Invalid first Ifd offset: "));
        }
        int i5 = readInt - 8;
        if (i5 > 0) {
            fVar.a(i5);
        }
    }

    public final void p() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f2839c;
            if (i2 >= hashMapArr.length) {
                return;
            }
            StringBuilder k7 = p.k(i2, "The size of tag group[", "]: ");
            k7.append(hashMapArr[i2].size());
            Log.d("ExifInterface", k7.toString());
            for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f2841e) + "'");
            }
            i2++;
        }
    }

    public final void r(byte[] bArr, int i2) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(f fVar, int i2) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        boolean z7;
        short s7;
        HashMap[] hashMapArr2;
        long j;
        long j7;
        boolean z8;
        int i5;
        long j8;
        int i7;
        d dVar;
        HashSet hashSet2;
        int readUnsignedShort;
        long j9;
        int i8 = i2;
        int i9 = fVar.f2794e;
        int i10 = fVar.f2797m;
        Integer valueOf = Integer.valueOf(i9);
        HashSet hashSet3 = this.f2840d;
        hashSet3.add(valueOf);
        short readShort = fVar.readShort();
        boolean z9 = f2822l;
        if (z9) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s8 = 0;
        while (true) {
            hashMapArr = this.f2839c;
            if (s8 >= readShort) {
                break;
            }
            int readUnsignedShort2 = fVar.readUnsignedShort();
            int readUnsignedShort3 = fVar.readUnsignedShort();
            int readInt = fVar.readInt();
            long j10 = fVar.f2794e + 4;
            short s9 = readShort;
            d dVar2 = (d) f2815H[i8].get(Integer.valueOf(readUnsignedShort2));
            if (z9) {
                z7 = z9;
                s7 = s8;
                hashMapArr2 = hashMapArr;
                hashSet = hashSet3;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i8), Integer.valueOf(readUnsignedShort2), dVar2 != null ? dVar2.f2803b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                hashSet = hashSet3;
                z7 = z9;
                s7 = s8;
                hashMapArr2 = hashMapArr;
            }
            if (dVar2 != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f2810C.length) {
                        int i11 = dVar2.f2804c;
                        if (i11 == 7 || readUnsignedShort3 == 7 || i11 == readUnsignedShort3 || (i5 = dVar2.f2805d) == readUnsignedShort3 || (((i11 == 4 || i5 == 4) && readUnsignedShort3 == 3) || (((i11 == 9 || i5 == 9) && readUnsignedShort3 == 8) || ((i11 == 12 || i5 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i11;
                            }
                            j = j10;
                            j7 = readInt * r7[readUnsignedShort3];
                            if (j7 < 0 || j7 > 2147483647L) {
                                if (z7) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z8 = false;
                                if (z8) {
                                    fVar.d(j);
                                    hashSet2 = hashSet;
                                } else {
                                    long j11 = j;
                                    if (j7 > 4) {
                                        int readInt2 = fVar.readInt();
                                        if (z7) {
                                            i7 = readUnsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            i7 = readUnsignedShort2;
                                        }
                                        if (this.f2838b == 7) {
                                            if ("MakerNote".equals(dVar2.f2803b)) {
                                                this.f2844h = readInt2;
                                            } else if (i8 == 6 && "ThumbnailImage".equals(dVar2.f2803b)) {
                                                this.f2845i = readInt2;
                                                this.j = readInt;
                                                c c7 = c.c(6, this.f2841e);
                                                j8 = j11;
                                                c a7 = c.a(this.f2845i, this.f2841e);
                                                dVar = dVar2;
                                                c a8 = c.a(this.j, this.f2841e);
                                                hashMapArr2[4].put("Compression", c7);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a7);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a8);
                                                fVar.d(readInt2);
                                            }
                                        }
                                        dVar = dVar2;
                                        j8 = j11;
                                        fVar.d(readInt2);
                                    } else {
                                        j8 = j11;
                                        i7 = readUnsignedShort2;
                                        dVar = dVar2;
                                    }
                                    Integer num = (Integer) f2818K.get(Integer.valueOf(i7));
                                    if (z7) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j7);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j9 = fVar.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = fVar.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = fVar.readInt();
                                            } else {
                                                j9 = -1;
                                            }
                                            if (z7) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j9), dVar.f2803b));
                                            }
                                            if (j9 > 0 || (i10 != -1 && j9 >= i10)) {
                                                hashSet2 = hashSet;
                                                if (z7) {
                                                    String str = "Skip jump into the IFD since its offset is invalid: " + j9;
                                                    if (i10 != -1) {
                                                        str = str + " (total length: " + i10 + ")";
                                                    }
                                                    Log.d("ExifInterface", str);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j9))) {
                                                    fVar.d(j9);
                                                    s(fVar, num.intValue());
                                                } else if (z7) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j9 + ")");
                                                }
                                            }
                                            fVar.d(j8);
                                        } else {
                                            readUnsignedShort = fVar.readUnsignedShort();
                                        }
                                        j9 = readUnsignedShort;
                                        if (z7) {
                                        }
                                        if (j9 > 0) {
                                        }
                                        hashSet2 = hashSet;
                                        if (z7) {
                                        }
                                        fVar.d(j8);
                                    } else {
                                        hashSet2 = hashSet;
                                        long j12 = j8;
                                        int i12 = fVar.f2794e + this.f2843g;
                                        byte[] bArr = new byte[(int) j7];
                                        fVar.readFully(bArr);
                                        c cVar = new c(i12, bArr, readUnsignedShort3, readInt);
                                        HashMap hashMap = hashMapArr2[i2];
                                        String str2 = dVar.f2803b;
                                        hashMap.put(str2, cVar);
                                        if ("DNGVersion".equals(str2)) {
                                            this.f2838b = 3;
                                        }
                                        if ((("Make".equals(str2) || "Model".equals(str2)) && cVar.f(this.f2841e).contains("PENTAX")) || ("Compression".equals(str2) && cVar.e(this.f2841e) == 65535)) {
                                            this.f2838b = 8;
                                        }
                                        if (fVar.f2794e != j12) {
                                            fVar.d(j12);
                                        }
                                    }
                                }
                                s8 = (short) (s7 + 1);
                                i8 = i2;
                                hashSet3 = hashSet2;
                                readShort = s9;
                                z9 = z7;
                            } else {
                                z8 = true;
                                if (z8) {
                                }
                                s8 = (short) (s7 + 1);
                                i8 = i2;
                                hashSet3 = hashSet2;
                                readShort = s9;
                                z9 = z7;
                            }
                        } else if (z7) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f2809B[readUnsignedShort3] + ") is unexpected for tag: " + dVar2.f2803b);
                        }
                    }
                }
                j = j10;
                if (z7) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j7 = 0;
                z8 = false;
                if (z8) {
                }
                s8 = (short) (s7 + 1);
                i8 = i2;
                hashSet3 = hashSet2;
                readShort = s9;
                z9 = z7;
            } else if (z7) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            j = j10;
            j7 = 0;
            z8 = false;
            if (z8) {
            }
            s8 = (short) (s7 + 1);
            i8 = i2;
            hashSet3 = hashSet2;
            readShort = s9;
            z9 = z7;
        }
        HashSet hashSet4 = hashSet3;
        boolean z10 = z9;
        int readInt3 = fVar.readInt();
        if (z10) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j13 = readInt3;
        if (j13 <= 0) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        fVar.d(j13);
        if (hashMapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(fVar, 5);
        }
    }

    public final void t(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.f2839c;
        if (hashMapArr[i2].isEmpty() || hashMapArr[i2].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i2];
        hashMap.put(str2, (c) hashMap.get(str));
        hashMapArr[i2].remove(str);
    }

    public final void u(b bVar) {
        c cVar;
        int e7;
        HashMap hashMap = this.f2839c[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 == null) {
            m(bVar, hashMap);
            return;
        }
        int e8 = cVar2.e(this.f2841e);
        if (e8 != 1) {
            if (e8 == 6) {
                m(bVar, hashMap);
                return;
            } else if (e8 != 7) {
                return;
            }
        }
        c cVar3 = (c) hashMap.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f2841e);
            int[] iArr2 = f2823m;
            if (Arrays.equals(iArr2, iArr) || (this.f2838b == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e7 = cVar.e(this.f2841e)) == 1 && Arrays.equals(iArr, f2824n)) || (e7 == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) hashMap.get("StripOffsets");
                c cVar5 = (c) hashMap.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] k7 = V6.b.k(cVar4.g(this.f2841e));
                long[] k8 = V6.b.k(cVar5.g(this.f2841e));
                if (k7 == null || k7.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (k8 == null || k8.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (k7.length != k8.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j7 : k8) {
                    j += j7;
                }
                byte[] bArr = new byte[(int) j];
                this.f2842f = true;
                int i2 = 0;
                int i5 = 0;
                for (int i7 = 0; i7 < k7.length; i7++) {
                    int i8 = (int) k7[i7];
                    int i9 = (int) k8[i7];
                    if (i7 < k7.length - 1 && i8 + i9 != k7[i7 + 1]) {
                        this.f2842f = false;
                    }
                    int i10 = i8 - i2;
                    if (i10 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.a(i10);
                        int i11 = i2 + i10;
                        byte[] bArr2 = new byte[i9];
                        try {
                            bVar.readFully(bArr2);
                            i2 = i11 + i9;
                            System.arraycopy(bArr2, 0, bArr, i5, i9);
                            i5 += i9;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i9 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i10 + " bytes.");
                        return;
                    }
                }
                if (this.f2842f) {
                    long j8 = k7[0];
                    return;
                }
                return;
            }
        }
        if (f2822l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i2, int i5) {
        HashMap[] hashMapArr = this.f2839c;
        boolean isEmpty = hashMapArr[i2].isEmpty();
        boolean z7 = f2822l;
        if (isEmpty || hashMapArr[i5].isEmpty()) {
            if (z7) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) hashMapArr[i2].get("ImageLength");
        c cVar2 = (c) hashMapArr[i2].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i5].get("ImageLength");
        c cVar4 = (c) hashMapArr[i5].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z7) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z7) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e7 = cVar.e(this.f2841e);
        int e8 = cVar2.e(this.f2841e);
        int e9 = cVar3.e(this.f2841e);
        int e10 = cVar4.e(this.f2841e);
        if (e7 >= e9 || e8 >= e10) {
            return;
        }
        HashMap hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i5];
        hashMapArr[i5] = hashMap;
    }

    public final void w(f fVar, int i2) {
        c c7;
        c c8;
        HashMap[] hashMapArr = this.f2839c;
        c cVar = (c) hashMapArr[i2].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i2].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i2].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i2].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i2].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f2798a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f2841e);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                c7 = c.b(eVarArr[0], this.f2841e);
                c8 = c.b(eVarArr[1], this.f2841e);
            } else {
                int[] iArr = (int[]) cVar.g(this.f2841e);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c7 = c.c(iArr[0], this.f2841e);
                c8 = c.c(iArr[1], this.f2841e);
            }
            hashMapArr[i2].put("ImageWidth", c7);
            hashMapArr[i2].put("ImageLength", c8);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e7 = cVar2.e(this.f2841e);
            int e8 = cVar4.e(this.f2841e);
            int e9 = cVar5.e(this.f2841e);
            int e10 = cVar3.e(this.f2841e);
            if (e8 <= e7 || e9 <= e10) {
                return;
            }
            c c9 = c.c(e8 - e7, this.f2841e);
            c c10 = c.c(e9 - e10, this.f2841e);
            hashMapArr[i2].put("ImageLength", c9);
            hashMapArr[i2].put("ImageWidth", c10);
            return;
        }
        c cVar6 = (c) hashMapArr[i2].get("ImageLength");
        c cVar7 = (c) hashMapArr[i2].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i2].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i2].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int e11 = cVar8.e(this.f2841e);
            int e12 = cVar8.e(this.f2841e);
            fVar.d(e11);
            byte[] bArr = new byte[e12];
            fVar.readFully(bArr);
            e(new b(bArr), e11, i2);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f2839c;
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
