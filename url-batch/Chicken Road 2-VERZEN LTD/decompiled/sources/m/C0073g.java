package m;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
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

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073g {
    public static final byte[] A;

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f949B;

    /* renamed from: C, reason: collision with root package name */
    public static final String[] f950C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f951D;

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f952E;

    /* renamed from: F, reason: collision with root package name */
    public static final C0070d f953F;

    /* renamed from: G, reason: collision with root package name */
    public static final C0070d[][] f954G;

    /* renamed from: H, reason: collision with root package name */
    public static final C0070d[] f955H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashMap[] f956I;
    public static final HashMap[] J;

    /* renamed from: K, reason: collision with root package name */
    public static final Set f957K;
    public static final HashMap L;

    /* renamed from: M, reason: collision with root package name */
    public static final Charset f958M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f959N;

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f960O;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f961m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f962n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f963o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f964p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f965q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f966r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f967s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f968t;
    public static final byte[] u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f969v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f970w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f971x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f972y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f973z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f974a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f975b;

    /* renamed from: c, reason: collision with root package name */
    public int f976c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f977d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f978e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f979f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f980g;

    /* renamed from: h, reason: collision with root package name */
    public int f981h;

    /* renamed from: i, reason: collision with root package name */
    public int f982i;

    /* renamed from: j, reason: collision with root package name */
    public int f983j;

    /* renamed from: k, reason: collision with root package name */
    public int f984k;

    /* renamed from: l, reason: collision with root package name */
    public C0069c f985l;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f962n = new int[]{8, 8, 8};
        f963o = new int[]{8};
        f964p = new byte[]{-1, -40, -1};
        f965q = new byte[]{102, 116, 121, 112};
        f966r = new byte[]{109, 105, 102, 49};
        f967s = new byte[]{104, 101, 105, 99};
        f968t = new byte[]{97, 118, 105, 102};
        u = new byte[]{97, 118, 105, 115};
        f969v = new byte[]{79, 76, 89, 77, 80, 0};
        f970w = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f971x = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f972y = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        f973z = new byte[]{82, 73, 70, 70};
        A = new byte[]{87, 69, 66, 80};
        f949B = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f950C = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f951D = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f952E = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C0070d[] c0070dArr = {new C0070d("NewSubfileType", 254, 4), new C0070d("SubfileType", 255, 4), new C0070d(256, 3, 4, "ImageWidth"), new C0070d(257, 3, 4, "ImageLength"), new C0070d("BitsPerSample", 258, 3), new C0070d("Compression", 259, 3), new C0070d("PhotometricInterpretation", 262, 3), new C0070d("ImageDescription", 270, 2), new C0070d("Make", 271, 2), new C0070d("Model", 272, 2), new C0070d(273, 3, 4, "StripOffsets"), new C0070d("Orientation", 274, 3), new C0070d("SamplesPerPixel", 277, 3), new C0070d(278, 3, 4, "RowsPerStrip"), new C0070d(279, 3, 4, "StripByteCounts"), new C0070d("XResolution", 282, 5), new C0070d("YResolution", 283, 5), new C0070d("PlanarConfiguration", 284, 3), new C0070d("ResolutionUnit", 296, 3), new C0070d("TransferFunction", 301, 3), new C0070d("Software", 305, 2), new C0070d("DateTime", 306, 2), new C0070d("Artist", 315, 2), new C0070d("WhitePoint", 318, 5), new C0070d("PrimaryChromaticities", 319, 5), new C0070d("SubIFDPointer", 330, 4), new C0070d("JPEGInterchangeFormat", 513, 4), new C0070d("JPEGInterchangeFormatLength", 514, 4), new C0070d("YCbCrCoefficients", 529, 5), new C0070d("YCbCrSubSampling", 530, 3), new C0070d("YCbCrPositioning", 531, 3), new C0070d("ReferenceBlackWhite", 532, 5), new C0070d("Copyright", 33432, 2), new C0070d("ExifIFDPointer", 34665, 4), new C0070d("GPSInfoIFDPointer", 34853, 4), new C0070d("SensorTopBorder", 4, 4), new C0070d("SensorLeftBorder", 5, 4), new C0070d("SensorBottomBorder", 6, 4), new C0070d("SensorRightBorder", 7, 4), new C0070d("ISO", 23, 3), new C0070d("JpgFromRaw", 46, 7), new C0070d("Xmp", 700, 1)};
        C0070d[] c0070dArr2 = {new C0070d("ExposureTime", 33434, 5), new C0070d("FNumber", 33437, 5), new C0070d("ExposureProgram", 34850, 3), new C0070d("SpectralSensitivity", 34852, 2), new C0070d("PhotographicSensitivity", 34855, 3), new C0070d("OECF", 34856, 7), new C0070d("SensitivityType", 34864, 3), new C0070d("StandardOutputSensitivity", 34865, 4), new C0070d("RecommendedExposureIndex", 34866, 4), new C0070d("ISOSpeed", 34867, 4), new C0070d("ISOSpeedLatitudeyyy", 34868, 4), new C0070d("ISOSpeedLatitudezzz", 34869, 4), new C0070d("ExifVersion", 36864, 2), new C0070d("DateTimeOriginal", 36867, 2), new C0070d("DateTimeDigitized", 36868, 2), new C0070d("OffsetTime", 36880, 2), new C0070d("OffsetTimeOriginal", 36881, 2), new C0070d("OffsetTimeDigitized", 36882, 2), new C0070d("ComponentsConfiguration", 37121, 7), new C0070d("CompressedBitsPerPixel", 37122, 5), new C0070d("ShutterSpeedValue", 37377, 10), new C0070d("ApertureValue", 37378, 5), new C0070d("BrightnessValue", 37379, 10), new C0070d("ExposureBiasValue", 37380, 10), new C0070d("MaxApertureValue", 37381, 5), new C0070d("SubjectDistance", 37382, 5), new C0070d("MeteringMode", 37383, 3), new C0070d("LightSource", 37384, 3), new C0070d("Flash", 37385, 3), new C0070d("FocalLength", 37386, 5), new C0070d("SubjectArea", 37396, 3), new C0070d("MakerNote", 37500, 7), new C0070d("UserComment", 37510, 7), new C0070d("SubSecTime", 37520, 2), new C0070d("SubSecTimeOriginal", 37521, 2), new C0070d("SubSecTimeDigitized", 37522, 2), new C0070d("FlashpixVersion", 40960, 7), new C0070d("ColorSpace", 40961, 3), new C0070d(40962, 3, 4, "PixelXDimension"), new C0070d(40963, 3, 4, "PixelYDimension"), new C0070d("RelatedSoundFile", 40964, 2), new C0070d("InteroperabilityIFDPointer", 40965, 4), new C0070d("FlashEnergy", 41483, 5), new C0070d("SpatialFrequencyResponse", 41484, 7), new C0070d("FocalPlaneXResolution", 41486, 5), new C0070d("FocalPlaneYResolution", 41487, 5), new C0070d("FocalPlaneResolutionUnit", 41488, 3), new C0070d("SubjectLocation", 41492, 3), new C0070d("ExposureIndex", 41493, 5), new C0070d("SensingMethod", 41495, 3), new C0070d("FileSource", 41728, 7), new C0070d("SceneType", 41729, 7), new C0070d("CFAPattern", 41730, 7), new C0070d("CustomRendered", 41985, 3), new C0070d("ExposureMode", 41986, 3), new C0070d("WhiteBalance", 41987, 3), new C0070d("DigitalZoomRatio", 41988, 5), new C0070d("FocalLengthIn35mmFilm", 41989, 3), new C0070d("SceneCaptureType", 41990, 3), new C0070d("GainControl", 41991, 3), new C0070d("Contrast", 41992, 3), new C0070d("Saturation", 41993, 3), new C0070d("Sharpness", 41994, 3), new C0070d("DeviceSettingDescription", 41995, 7), new C0070d("SubjectDistanceRange", 41996, 3), new C0070d("ImageUniqueID", 42016, 2), new C0070d("CameraOwnerName", 42032, 2), new C0070d("BodySerialNumber", 42033, 2), new C0070d("LensSpecification", 42034, 5), new C0070d("LensMake", 42035, 2), new C0070d("LensModel", 42036, 2), new C0070d("Gamma", 42240, 5), new C0070d("DNGVersion", 50706, 1), new C0070d(50720, 3, 4, "DefaultCropSize")};
        C0070d[] c0070dArr3 = {new C0070d("GPSVersionID", 0, 1), new C0070d("GPSLatitudeRef", 1, 2), new C0070d(2, 5, 10, "GPSLatitude"), new C0070d("GPSLongitudeRef", 3, 2), new C0070d(4, 5, 10, "GPSLongitude"), new C0070d("GPSAltitudeRef", 5, 1), new C0070d("GPSAltitude", 6, 5), new C0070d("GPSTimeStamp", 7, 5), new C0070d("GPSSatellites", 8, 2), new C0070d("GPSStatus", 9, 2), new C0070d("GPSMeasureMode", 10, 2), new C0070d("GPSDOP", 11, 5), new C0070d("GPSSpeedRef", 12, 2), new C0070d("GPSSpeed", 13, 5), new C0070d("GPSTrackRef", 14, 2), new C0070d("GPSTrack", 15, 5), new C0070d("GPSImgDirectionRef", 16, 2), new C0070d("GPSImgDirection", 17, 5), new C0070d("GPSMapDatum", 18, 2), new C0070d("GPSDestLatitudeRef", 19, 2), new C0070d("GPSDestLatitude", 20, 5), new C0070d("GPSDestLongitudeRef", 21, 2), new C0070d("GPSDestLongitude", 22, 5), new C0070d("GPSDestBearingRef", 23, 2), new C0070d("GPSDestBearing", 24, 5), new C0070d("GPSDestDistanceRef", 25, 2), new C0070d("GPSDestDistance", 26, 5), new C0070d("GPSProcessingMethod", 27, 7), new C0070d("GPSAreaInformation", 28, 7), new C0070d("GPSDateStamp", 29, 2), new C0070d("GPSDifferential", 30, 3), new C0070d("GPSHPositioningError", 31, 5)};
        C0070d[] c0070dArr4 = {new C0070d("InteroperabilityIndex", 1, 2)};
        C0070d[] c0070dArr5 = {new C0070d("NewSubfileType", 254, 4), new C0070d("SubfileType", 255, 4), new C0070d(256, 3, 4, "ThumbnailImageWidth"), new C0070d(257, 3, 4, "ThumbnailImageLength"), new C0070d("BitsPerSample", 258, 3), new C0070d("Compression", 259, 3), new C0070d("PhotometricInterpretation", 262, 3), new C0070d("ImageDescription", 270, 2), new C0070d("Make", 271, 2), new C0070d("Model", 272, 2), new C0070d(273, 3, 4, "StripOffsets"), new C0070d("ThumbnailOrientation", 274, 3), new C0070d("SamplesPerPixel", 277, 3), new C0070d(278, 3, 4, "RowsPerStrip"), new C0070d(279, 3, 4, "StripByteCounts"), new C0070d("XResolution", 282, 5), new C0070d("YResolution", 283, 5), new C0070d("PlanarConfiguration", 284, 3), new C0070d("ResolutionUnit", 296, 3), new C0070d("TransferFunction", 301, 3), new C0070d("Software", 305, 2), new C0070d("DateTime", 306, 2), new C0070d("Artist", 315, 2), new C0070d("WhitePoint", 318, 5), new C0070d("PrimaryChromaticities", 319, 5), new C0070d("SubIFDPointer", 330, 4), new C0070d("JPEGInterchangeFormat", 513, 4), new C0070d("JPEGInterchangeFormatLength", 514, 4), new C0070d("YCbCrCoefficients", 529, 5), new C0070d("YCbCrSubSampling", 530, 3), new C0070d("YCbCrPositioning", 531, 3), new C0070d("ReferenceBlackWhite", 532, 5), new C0070d("Copyright", 33432, 2), new C0070d("ExifIFDPointer", 34665, 4), new C0070d("GPSInfoIFDPointer", 34853, 4), new C0070d("DNGVersion", 50706, 1), new C0070d(50720, 3, 4, "DefaultCropSize")};
        f953F = new C0070d("StripOffsets", 273, 3);
        f954G = new C0070d[][]{c0070dArr, c0070dArr2, c0070dArr3, c0070dArr4, c0070dArr5, c0070dArr, new C0070d[]{new C0070d("ThumbnailImage", 256, 7), new C0070d("CameraSettingsIFDPointer", 8224, 4), new C0070d("ImageProcessingIFDPointer", 8256, 4)}, new C0070d[]{new C0070d("PreviewImageStart", 257, 4), new C0070d("PreviewImageLength", 258, 4)}, new C0070d[]{new C0070d("AspectFrame", 4371, 3)}, new C0070d[]{new C0070d("ColorSpace", 55, 3)}};
        f955H = new C0070d[]{new C0070d("SubIFDPointer", 330, 4), new C0070d("ExifIFDPointer", 34665, 4), new C0070d("GPSInfoIFDPointer", 34853, 4), new C0070d("InteroperabilityIFDPointer", 40965, 4), new C0070d("CameraSettingsIFDPointer", 8224, 1), new C0070d("ImageProcessingIFDPointer", 8256, 1)};
        f956I = new HashMap[10];
        J = new HashMap[10];
        f957K = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        L = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f958M = forName;
        f959N = "Exif\u0000\u0000".getBytes(forName);
        f960O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            C0070d[][] c0070dArr6 = f954G;
            if (i2 >= c0070dArr6.length) {
                HashMap hashMap = L;
                C0070d[] c0070dArr7 = f955H;
                hashMap.put(Integer.valueOf(c0070dArr7[0].f943a), 5);
                hashMap.put(Integer.valueOf(c0070dArr7[1].f943a), 1);
                hashMap.put(Integer.valueOf(c0070dArr7[2].f943a), 2);
                hashMap.put(Integer.valueOf(c0070dArr7[3].f943a), 3);
                hashMap.put(Integer.valueOf(c0070dArr7[4].f943a), 7);
                hashMap.put(Integer.valueOf(c0070dArr7[5].f943a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f956I[i2] = new HashMap();
            J[i2] = new HashMap();
            for (C0070d c0070d : c0070dArr6[i2]) {
                f956I[i2].put(Integer.valueOf(c0070d.f943a), c0070d);
                J[i2].put(c0070d.f944b, c0070d);
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[Catch: all -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:3:0x0021, B:5:0x0024, B:7:0x0039, B:13:0x0056, B:20:0x0069, B:21:0x007c, B:30:0x0071, B:31:0x0075, B:32:0x0079, B:33:0x0086, B:35:0x008f, B:37:0x0095, B:39:0x009b, B:41:0x00a1, B:51:0x00af), top: B:2:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0073g(ByteArrayInputStream byteArrayInputStream) {
        C0070d[][] c0070dArr = f954G;
        this.f977d = new HashMap[c0070dArr.length];
        this.f978e = new HashSet(c0070dArr.length);
        this.f979f = ByteOrder.BIG_ENDIAN;
        boolean z2 = f961m;
        this.f975b = null;
        this.f974a = null;
        for (int i2 = 0; i2 < c0070dArr.length; i2++) {
            try {
                try {
                    this.f977d[i2] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z2) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z2) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e3) {
                e = e3;
                if (z2) {
                }
                a();
                if (!z2) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream, 5000);
        int f2 = f(bufferedInputStream);
        this.f976c = f2;
        if (f2 != 4 && f2 != 9 && f2 != 13 && f2 != 14) {
            C0072f c0072f = new C0072f(bufferedInputStream);
            int i3 = this.f976c;
            if (i3 != 12 && i3 != 15) {
                if (i3 == 7) {
                    g(c0072f);
                } else if (i3 == 10) {
                    k(c0072f);
                } else {
                    j(c0072f);
                }
                c0072f.b(this.f981h);
                u(c0072f);
                a();
                if (!z2) {
                    return;
                }
                p();
            }
            d(c0072f, i3);
            c0072f.b(this.f981h);
            u(c0072f);
            a();
            if (!z2) {
            }
            p();
        }
        C0068b c0068b = new C0068b(bufferedInputStream);
        int i4 = this.f976c;
        if (i4 == 4) {
            e(c0068b, 0, 0);
        } else if (i4 == 13) {
            h(c0068b);
        } else if (i4 == 9) {
            i(c0068b);
        } else if (i4 == 14) {
            l(c0068b);
        }
        a();
        if (!z2) {
        }
        p();
    }

    public static ByteOrder q(C0068b c0068b) {
        short readShort = c0068b.readShort();
        boolean z2 = f961m;
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
        String b2 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f977d;
        if (b2 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b2.concat("\u0000").getBytes(f958M);
            hashMap.put("DateTime", new C0069c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C0069c.a(0L, this.f979f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C0069c.a(0L, this.f979f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C0069c.a(0L, this.f979f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C0069c.a(0L, this.f979f));
        }
    }

    public final String b(String str) {
        C0069c c2 = c(str);
        if (c2 == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f957K.contains(str)) {
                return c2.f(this.f979f);
            }
            try {
                return Double.toString(c2.d(this.f979f));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i2 = c2.f939a;
        if (i2 != 5 && i2 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i2);
            return null;
        }
        C0071e[] c0071eArr = (C0071e[]) c2.g(this.f979f);
        if (c0071eArr == null || c0071eArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c0071eArr));
            return null;
        }
        C0071e c0071e = c0071eArr[0];
        Integer valueOf = Integer.valueOf((int) (c0071e.f947a / c0071e.f948b));
        C0071e c0071e2 = c0071eArr[1];
        Integer valueOf2 = Integer.valueOf((int) (c0071e2.f947a / c0071e2.f948b));
        C0071e c0071e3 = c0071eArr[2];
        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (c0071e3.f947a / c0071e3.f948b)));
    }

    public final C0069c c(String str) {
        C0069c c0069c;
        int i2;
        C0069c c0069c2;
        if ("ISOSpeedRatings".equals(str)) {
            if (f961m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i2 = this.f976c) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (c0069c2 = this.f985l) != null)) {
            return c0069c2;
        }
        for (int i3 = 0; i3 < f954G.length; i3++) {
            C0069c c0069c3 = (C0069c) this.f977d[i3].get(str);
            if (c0069c3 != null) {
                return c0069c3;
            }
        }
        if (!"Xmp".equals(str) || (c0069c = this.f985l) == null) {
            return null;
        }
        return c0069c;
    }

    public final void d(C0072f c0072f, int i2) {
        String str;
        String str2;
        String str3;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i2 == 15 && i3 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new C0067a(c0072f));
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
                HashMap[] hashMapArr = this.f977d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", C0069c.c(Integer.parseInt(str), this.f979f));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", C0069c.c(Integer.parseInt(str3), this.f979f));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", C0069c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f979f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c0072f.b(parseInt2);
                    byte[] bArr = new byte[6];
                    c0072f.readFully(bArr);
                    int i4 = parseInt2 + 6;
                    int i5 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f959N)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    c0072f.readFully(bArr2);
                    this.f981h = i4;
                    r(bArr2, 0);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j2 = parseInt4;
                    c0072f.b(j2);
                    byte[] bArr3 = new byte[parseInt5];
                    c0072f.readFully(bArr3);
                    this.f985l = new C0069c(j2, bArr3, 1, parseInt5);
                }
                if (f961m) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e2) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e2);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016c, code lost:
    
        r23.f936d = r22.f979f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0158 A[LOOP:0: B:9:0x0034->B:32:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C0068b c0068b, int i2, int i3) {
        boolean z2 = f961m;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + c0068b);
        }
        c0068b.f936d = ByteOrder.BIG_ENDIAN;
        byte readByte = c0068b.readByte();
        byte b2 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (c0068b.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i4 = 2;
        int i5 = 2;
        while (true) {
            byte readByte2 = c0068b.readByte();
            if (readByte2 != b2) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = c0068b.readByte();
            if (z2) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = c0068b.readUnsignedShort();
                int i6 = readUnsignedShort - 2;
                int i7 = i5 + 4;
                if (z2) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i6 < 0) {
                    throw new IOException("Invalid length");
                }
                if (readByte3 != -31) {
                    HashMap[] hashMapArr = this.f977d;
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
                                                c0068b.a(1);
                                                hashMapArr[i3].put(i3 != 4 ? "ImageLength" : "ThumbnailImageLength", C0069c.a(c0068b.readUnsignedShort(), this.f979f));
                                                hashMapArr[i3].put(i3 != 4 ? "ImageWidth" : "ThumbnailImageWidth", C0069c.a(c0068b.readUnsignedShort(), this.f979f));
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
                        c0068b.a(i6);
                        i5 = i7 + i6;
                        i4 = 2;
                        b2 = -1;
                    } else {
                        byte[] bArr = new byte[i6];
                        c0068b.readFully(bArr);
                        if (b("UserComment") == null) {
                            HashMap hashMap = hashMapArr[1];
                            Charset charset = f958M;
                            byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                            hashMap.put("UserComment", new C0069c(bytes, i4, bytes.length));
                        }
                    }
                } else {
                    byte[] bArr2 = new byte[i6];
                    c0068b.readFully(bArr2);
                    int i8 = i7 + i6;
                    byte[] bArr3 = f959N;
                    if (a.a.A(bArr2, bArr3)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i6);
                        this.f981h = i2 + i7 + bArr3.length;
                        r(copyOfRange, i3);
                        u(new C0068b(copyOfRange));
                    } else {
                        byte[] bArr4 = f960O;
                        if (a.a.A(bArr2, bArr4)) {
                            int length = i7 + bArr4.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i6);
                            this.f985l = new C0069c(length, copyOfRange2, 1, copyOfRange2.length);
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

    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d8, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        InputStream inputStream;
        C0068b c0068b;
        int i2;
        C0068b c0068b2;
        C0068b c0068b3;
        boolean z2;
        C0068b c0068b4;
        C0068b c0068b5;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f964p;
            if (i3 >= bArr2.length) {
                return 4;
            }
            if (bArr[i3] != bArr2[i3]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i4 = 0; i4 < bytes.length; i4++) {
                    byte b2 = bArr[i4];
                    ?? r8 = bytes[i4];
                    try {
                        if (b2 != r8) {
                            try {
                                c0068b = new C0068b(bArr);
                                try {
                                    long readInt = c0068b.readInt();
                                    byte[] bArr3 = new byte[4];
                                    c0068b.readFully(bArr3);
                                    if (Arrays.equals(bArr3, f965q)) {
                                        if (readInt == 1) {
                                            readInt = c0068b.readLong();
                                            j2 = 16;
                                            if (readInt < 16) {
                                            }
                                        } else {
                                            j2 = 8;
                                        }
                                        long j3 = 5000;
                                        if (readInt > j3) {
                                            readInt = j3;
                                        }
                                        long j4 = readInt - j2;
                                        if (j4 >= 8) {
                                            byte[] bArr4 = new byte[4];
                                            boolean z6 = false;
                                            boolean z7 = false;
                                            boolean z8 = false;
                                            for (long j5 = 0; j5 < j4 / 4; j5++) {
                                                try {
                                                    c0068b.readFully(bArr4);
                                                    if (j5 != 1) {
                                                        if (Arrays.equals(bArr4, f966r)) {
                                                            z6 = true;
                                                        } else if (Arrays.equals(bArr4, f967s)) {
                                                            z7 = true;
                                                        } else if (Arrays.equals(bArr4, f968t) || Arrays.equals(bArr4, u)) {
                                                            z8 = true;
                                                        }
                                                        if (z6) {
                                                            if (z7) {
                                                                c0068b.close();
                                                                i2 = 12;
                                                                break;
                                                            }
                                                            if (z8) {
                                                                c0068b.close();
                                                                i2 = 15;
                                                                break;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                } catch (EOFException unused) {
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    if (f961m) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                c0068b = null;
                            } catch (Throwable th) {
                                th = th;
                                inputStream = null;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                            c0068b.close();
                            i2 = 0;
                            if (i2 != 0) {
                                return i2;
                            }
                            try {
                                c0068b3 = new C0068b(bArr);
                                try {
                                    ByteOrder q2 = q(c0068b3);
                                    this.f979f = q2;
                                    c0068b3.f936d = q2;
                                    short readShort = c0068b3.readShort();
                                    z2 = readShort == 20306 || readShort == 21330;
                                    c0068b3.close();
                                } catch (Exception unused2) {
                                    if (c0068b3 != null) {
                                        c0068b3.close();
                                    }
                                    z2 = false;
                                    if (!z2) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    c0068b2 = c0068b3;
                                    if (c0068b2 != null) {
                                        c0068b2.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused3) {
                                c0068b3 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                c0068b2 = null;
                            }
                            if (!z2) {
                                return 7;
                            }
                            try {
                                C0068b c0068b6 = new C0068b(bArr);
                                try {
                                    ByteOrder q3 = q(c0068b6);
                                    this.f979f = q3;
                                    c0068b6.f936d = q3;
                                    z3 = c0068b6.readShort() == 85;
                                    c0068b6.close();
                                } catch (Exception unused4) {
                                    c0068b5 = c0068b6;
                                    if (c0068b5 != null) {
                                        c0068b5.close();
                                    }
                                    z3 = false;
                                    if (!z3) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    c0068b4 = c0068b6;
                                    if (c0068b4 != null) {
                                        c0068b4.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused5) {
                                c0068b5 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                c0068b4 = null;
                            }
                            if (!z3) {
                                return 10;
                            }
                            int i5 = 0;
                            while (true) {
                                byte[] bArr5 = f971x;
                                if (i5 >= bArr5.length) {
                                    z4 = true;
                                    break;
                                }
                                if (bArr[i5] != bArr5[i5]) {
                                    z4 = false;
                                    break;
                                }
                                i5++;
                            }
                            if (z4) {
                                return 13;
                            }
                            int i6 = 0;
                            while (true) {
                                byte[] bArr6 = f973z;
                                if (i6 >= bArr6.length) {
                                    int i7 = 0;
                                    while (true) {
                                        byte[] bArr7 = A;
                                        if (i7 >= bArr7.length) {
                                            z5 = true;
                                            break;
                                        }
                                        if (bArr[bArr6.length + i7 + 4] != bArr7[i7]) {
                                            break;
                                        }
                                        i7++;
                                    }
                                } else {
                                    if (bArr[i6] != bArr6[i6]) {
                                        break;
                                    }
                                    i6++;
                                }
                            }
                            return z5 ? 14 : 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = r8;
                    }
                }
                return 9;
            }
            i3++;
        }
    }

    public final void g(C0072f c0072f) {
        int i2;
        int i3;
        j(c0072f);
        HashMap[] hashMapArr = this.f977d;
        C0069c c0069c = (C0069c) hashMapArr[1].get("MakerNote");
        if (c0069c != null) {
            C0072f c0072f2 = new C0072f(c0069c.f942d);
            c0072f2.f936d = this.f979f;
            byte[] bArr = f969v;
            byte[] bArr2 = new byte[bArr.length];
            c0072f2.readFully(bArr2);
            c0072f2.b(0L);
            byte[] bArr3 = f970w;
            byte[] bArr4 = new byte[bArr3.length];
            c0072f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0072f2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0072f2.b(12L);
            }
            s(c0072f2, 6);
            C0069c c0069c2 = (C0069c) hashMapArr[7].get("PreviewImageStart");
            C0069c c0069c3 = (C0069c) hashMapArr[7].get("PreviewImageLength");
            if (c0069c2 != null && c0069c3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c0069c2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c0069c3);
            }
            C0069c c0069c4 = (C0069c) hashMapArr[8].get("AspectFrame");
            if (c0069c4 != null) {
                int[] iArr = (int[]) c0069c4.g(this.f979f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 <= i5 || (i2 = iArr[3]) <= (i3 = iArr[1])) {
                    return;
                }
                int i6 = (i4 - i5) + 1;
                int i7 = (i2 - i3) + 1;
                if (i6 < i7) {
                    int i8 = i6 + i7;
                    i7 = i8 - i7;
                    i6 = i8 - i7;
                }
                C0069c c2 = C0069c.c(i6, this.f979f);
                C0069c c3 = C0069c.c(i7, this.f979f);
                hashMapArr[0].put("ImageWidth", c2);
                hashMapArr[0].put("ImageLength", c3);
            }
        }
    }

    public final void h(C0068b c0068b) {
        if (f961m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0068b);
        }
        c0068b.f936d = ByteOrder.BIG_ENDIAN;
        int i2 = c0068b.f935c;
        c0068b.a(f971x.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int readInt = c0068b.readInt();
                int readInt2 = c0068b.readInt();
                int i3 = c0068b.f935c;
                int i4 = i3 + readInt + 4;
                int i5 = i3 - i2;
                if (i5 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z2) {
                    this.f981h = i5;
                    byte[] bArr = new byte[readInt];
                    c0068b.readFully(bArr);
                    int readInt3 = c0068b.readInt();
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
                    u(new C0068b(bArr));
                    z2 = true;
                } else if (readInt2 == 1767135348 && !z3) {
                    byte[] bArr2 = f972y;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        c0068b.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i6 = c0068b.f935c - i2;
                            int i7 = readInt - length;
                            byte[] bArr4 = new byte[i7];
                            c0068b.readFully(bArr4);
                            this.f985l = new C0069c(i6, bArr4, 1, i7);
                            z3 = true;
                        }
                    }
                }
                c0068b.a(i4 - c0068b.f935c);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    public final void i(C0068b c0068b) {
        boolean z2 = f961m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0068b);
        }
        c0068b.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0068b.readFully(bArr);
        c0068b.readFully(bArr2);
        c0068b.readFully(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        c0068b.a(i2 - c0068b.f935c);
        c0068b.readFully(bArr4);
        e(new C0068b(bArr4), i2, 5);
        c0068b.a(i4 - c0068b.f935c);
        c0068b.f936d = ByteOrder.BIG_ENDIAN;
        int readInt = c0068b.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = c0068b.readUnsignedShort();
            int readUnsignedShort2 = c0068b.readUnsignedShort();
            if (readUnsignedShort == f953F.f943a) {
                short readShort = c0068b.readShort();
                short readShort2 = c0068b.readShort();
                C0069c c2 = C0069c.c(readShort, this.f979f);
                C0069c c3 = C0069c.c(readShort2, this.f979f);
                HashMap[] hashMapArr = this.f977d;
                hashMapArr[0].put("ImageLength", c2);
                hashMapArr[0].put("ImageWidth", c3);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c0068b.a(readUnsignedShort2);
        }
    }

    public final void j(C0072f c0072f) {
        o(c0072f);
        s(c0072f, 0);
        w(c0072f, 0);
        w(c0072f, 5);
        w(c0072f, 4);
        x();
        if (this.f976c == 8) {
            HashMap[] hashMapArr = this.f977d;
            C0069c c0069c = (C0069c) hashMapArr[1].get("MakerNote");
            if (c0069c != null) {
                C0072f c0072f2 = new C0072f(c0069c.f942d);
                c0072f2.f936d = this.f979f;
                c0072f2.a(6);
                s(c0072f2, 9);
                C0069c c0069c2 = (C0069c) hashMapArr[9].get("ColorSpace");
                if (c0069c2 != null) {
                    hashMapArr[1].put("ColorSpace", c0069c2);
                }
            }
        }
    }

    public final void k(C0072f c0072f) {
        if (f961m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c0072f);
        }
        j(c0072f);
        HashMap[] hashMapArr = this.f977d;
        C0069c c0069c = (C0069c) hashMapArr[0].get("JpgFromRaw");
        if (c0069c != null) {
            e(new C0068b(c0069c.f942d), (int) c0069c.f941c, 5);
        }
        C0069c c0069c2 = (C0069c) hashMapArr[0].get("ISO");
        C0069c c0069c3 = (C0069c) hashMapArr[1].get("PhotographicSensitivity");
        if (c0069c2 == null || c0069c3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", c0069c2);
    }

    public final void l(C0068b c0068b) {
        if (f961m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0068b);
        }
        c0068b.f936d = ByteOrder.LITTLE_ENDIAN;
        c0068b.a(f973z.length);
        int readInt = c0068b.readInt() + 8;
        byte[] bArr = A;
        c0068b.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c0068b.readFully(bArr2);
                int readInt2 = c0068b.readInt();
                int i2 = length + 8;
                if (Arrays.equals(f949B, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    c0068b.readFully(bArr3);
                    byte[] bArr4 = f959N;
                    if (a.a.A(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f981h = i2;
                    r(bArr3, 0);
                    u(new C0068b(bArr3));
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
                c0068b.a(readInt2);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    public final void m(C0068b c0068b, HashMap hashMap) {
        C0069c c0069c = (C0069c) hashMap.get("JPEGInterchangeFormat");
        C0069c c0069c2 = (C0069c) hashMap.get("JPEGInterchangeFormatLength");
        if (c0069c == null || c0069c2 == null) {
            return;
        }
        int e2 = c0069c.e(this.f979f);
        int e3 = c0069c2.e(this.f979f);
        if (this.f976c == 7) {
            e2 += this.f982i;
        }
        if (e2 > 0 && e3 > 0 && this.f975b == null && this.f974a == null) {
            c0068b.a(e2);
            c0068b.readFully(new byte[e3]);
        }
        if (f961m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e2 + ", length: " + e3);
        }
    }

    public final boolean n(HashMap hashMap) {
        C0069c c0069c = (C0069c) hashMap.get("ImageLength");
        C0069c c0069c2 = (C0069c) hashMap.get("ImageWidth");
        if (c0069c == null || c0069c2 == null) {
            return false;
        }
        return c0069c.e(this.f979f) <= 512 && c0069c2.e(this.f979f) <= 512;
    }

    public final void o(C0072f c0072f) {
        ByteOrder q2 = q(c0072f);
        this.f979f = q2;
        c0072f.f936d = q2;
        int readUnsignedShort = c0072f.readUnsignedShort();
        int i2 = this.f976c;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c0072f.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i3 = readInt - 8;
        if (i3 > 0) {
            c0072f.a(i3);
        }
    }

    public final void p() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f977d;
            if (i2 >= hashMapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i2 + "]: " + hashMapArr[i2].size());
            for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                C0069c c0069c = (C0069c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c0069c.toString() + ", tagValue: '" + c0069c.f(this.f979f) + "'");
            }
            i2++;
        }
    }

    public final void r(byte[] bArr, int i2) {
        C0072f c0072f = new C0072f(bArr);
        o(c0072f);
        s(c0072f, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(C0072f c0072f, int i2) {
        HashMap[] hashMapArr;
        short s2;
        HashSet hashSet;
        short s3;
        HashMap[] hashMapArr2;
        long j2;
        boolean z2;
        int i3;
        long j3;
        int i4;
        int i5;
        HashSet hashSet2;
        int readUnsignedShort;
        long j4;
        Integer valueOf = Integer.valueOf(c0072f.f935c);
        HashSet hashSet3 = this.f978e;
        hashSet3.add(valueOf);
        short readShort = c0072f.readShort();
        boolean z3 = f961m;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            hashMapArr = this.f977d;
            if (s4 >= readShort) {
                break;
            }
            int readUnsignedShort2 = c0072f.readUnsignedShort();
            int readUnsignedShort3 = c0072f.readUnsignedShort();
            int readInt = c0072f.readInt();
            long j5 = c0072f.f935c + 4;
            C0070d c0070d = (C0070d) f956I[i2].get(Integer.valueOf(readUnsignedShort2));
            if (z3) {
                s2 = readShort;
                s3 = s4;
                hashSet = hashSet3;
                hashMapArr2 = hashMapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i2), Integer.valueOf(readUnsignedShort2), c0070d != null ? c0070d.f944b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s2 = readShort;
                hashSet = hashSet3;
                s3 = s4;
                hashMapArr2 = hashMapArr;
            }
            if (c0070d != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f951D.length) {
                        int i6 = c0070d.f945c;
                        if (i6 == 7 || readUnsignedShort3 == 7 || i6 == readUnsignedShort3 || (i3 = c0070d.f946d) == readUnsignedShort3 || (((i6 == 4 || i3 == 4) && readUnsignedShort3 == 3) || (((i6 == 9 || i3 == 9) && readUnsignedShort3 == 8) || ((i6 == 12 || i3 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i6;
                            }
                            j2 = r4[readUnsignedShort3] * readInt;
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z2 = false;
                                if (z2) {
                                    if (j2 > 4) {
                                        int readInt2 = c0072f.readInt();
                                        if (z3) {
                                            j3 = j5;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            j3 = j5;
                                        }
                                        if (this.f976c == 7) {
                                            if ("MakerNote".equals(c0070d.f944b)) {
                                                this.f982i = readInt2;
                                            } else if (i2 == 6 && "ThumbnailImage".equals(c0070d.f944b)) {
                                                this.f983j = readInt2;
                                                this.f984k = readInt;
                                                C0069c c2 = C0069c.c(6, this.f979f);
                                                i5 = readInt;
                                                C0069c a2 = C0069c.a(this.f983j, this.f979f);
                                                i4 = readUnsignedShort3;
                                                C0069c a3 = C0069c.a(this.f984k, this.f979f);
                                                hashMapArr2[4].put("Compression", c2);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a2);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a3);
                                                c0072f.b(readInt2);
                                            }
                                        }
                                        i4 = readUnsignedShort3;
                                        i5 = readInt;
                                        c0072f.b(readInt2);
                                    } else {
                                        j3 = j5;
                                        i4 = readUnsignedShort3;
                                        i5 = readInt;
                                    }
                                    Integer num = (Integer) L.get(Integer.valueOf(readUnsignedShort2));
                                    if (z3) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                    }
                                    if (num != null) {
                                        int i7 = i4;
                                        if (i7 != 3) {
                                            if (i7 == 4) {
                                                j4 = c0072f.readInt() & 4294967295L;
                                            } else if (i7 == 8) {
                                                readUnsignedShort = c0072f.readShort();
                                            } else if (i7 == 9 || i7 == 13) {
                                                readUnsignedShort = c0072f.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z3) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), c0070d.f944b));
                                            }
                                            int i8 = c0072f.f938f;
                                            if (j4 > 0 || (i8 != -1 && j4 >= i8)) {
                                                hashSet2 = hashSet;
                                                if (z3) {
                                                    String str = "Skip jump into the IFD since its offset is invalid: " + j4;
                                                    if (i8 != -1) {
                                                        str = str + " (total length: " + i8 + ")";
                                                    }
                                                    Log.d("ExifInterface", str);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j4))) {
                                                    c0072f.b(j4);
                                                    s(c0072f, num.intValue());
                                                } else if (z3) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            }
                                            c0072f.b(j3);
                                        } else {
                                            readUnsignedShort = c0072f.readUnsignedShort();
                                        }
                                        j4 = readUnsignedShort;
                                        if (z3) {
                                        }
                                        int i82 = c0072f.f938f;
                                        if (j4 > 0) {
                                        }
                                        hashSet2 = hashSet;
                                        if (z3) {
                                        }
                                        c0072f.b(j3);
                                    } else {
                                        hashSet2 = hashSet;
                                        long j6 = j3;
                                        int i9 = c0072f.f935c + this.f981h;
                                        byte[] bArr = new byte[(int) j2];
                                        c0072f.readFully(bArr);
                                        C0069c c0069c = new C0069c(i9, bArr, i4, i5);
                                        hashMapArr2[i2].put(c0070d.f944b, c0069c);
                                        String str2 = c0070d.f944b;
                                        if ("DNGVersion".equals(str2)) {
                                            this.f976c = 3;
                                        }
                                        if ((("Make".equals(str2) || "Model".equals(str2)) && c0069c.f(this.f979f).contains("PENTAX")) || ("Compression".equals(str2) && c0069c.e(this.f979f) == 65535)) {
                                            this.f976c = 8;
                                        }
                                        if (c0072f.f935c != j6) {
                                            c0072f.b(j6);
                                        }
                                    }
                                } else {
                                    c0072f.b(j5);
                                    hashSet2 = hashSet;
                                }
                                s4 = (short) (s3 + 1);
                                hashSet3 = hashSet2;
                                readShort = s2;
                            } else {
                                z2 = true;
                                if (z2) {
                                }
                                s4 = (short) (s3 + 1);
                                hashSet3 = hashSet2;
                                readShort = s2;
                            }
                        } else if (z3) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f950C[readUnsignedShort3] + ") is unexpected for tag: " + c0070d.f944b);
                        }
                    }
                }
                if (z3) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            j2 = 0;
            z2 = false;
            if (z2) {
            }
            s4 = (short) (s3 + 1);
            hashSet3 = hashSet2;
            readShort = s2;
        }
        HashSet hashSet4 = hashSet3;
        int readInt3 = c0072f.readInt();
        if (z3) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j7 = readInt3;
        if (j7 <= 0) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        c0072f.b(j7);
        if (hashMapArr[4].isEmpty()) {
            s(c0072f, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(c0072f, 5);
        }
    }

    public final void t(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.f977d;
        if (hashMapArr[i2].isEmpty() || hashMapArr[i2].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i2];
        hashMap.put(str2, (C0069c) hashMap.get(str));
        hashMapArr[i2].remove(str);
    }

    public final void u(C0068b c0068b) {
        C0069c c0069c;
        int e2;
        HashMap hashMap = this.f977d[4];
        C0069c c0069c2 = (C0069c) hashMap.get("Compression");
        if (c0069c2 == null) {
            m(c0068b, hashMap);
            return;
        }
        int e3 = c0069c2.e(this.f979f);
        if (e3 != 1) {
            if (e3 == 6) {
                m(c0068b, hashMap);
                return;
            } else if (e3 != 7) {
                return;
            }
        }
        C0069c c0069c3 = (C0069c) hashMap.get("BitsPerSample");
        if (c0069c3 != null) {
            int[] iArr = (int[]) c0069c3.g(this.f979f);
            int[] iArr2 = f962n;
            if (Arrays.equals(iArr2, iArr) || (this.f976c == 3 && (c0069c = (C0069c) hashMap.get("PhotometricInterpretation")) != null && (((e2 = c0069c.e(this.f979f)) == 1 && Arrays.equals(iArr, f963o)) || (e2 == 6 && Arrays.equals(iArr, iArr2))))) {
                C0069c c0069c4 = (C0069c) hashMap.get("StripOffsets");
                C0069c c0069c5 = (C0069c) hashMap.get("StripByteCounts");
                if (c0069c4 == null || c0069c5 == null) {
                    return;
                }
                long[] g2 = a.a.g(c0069c4.g(this.f979f));
                long[] g3 = a.a.g(c0069c5.g(this.f979f));
                if (g2 == null || g2.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (g3 == null || g3.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (g2.length != g3.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j2 = 0;
                for (long j3 : g3) {
                    j2 += j3;
                }
                byte[] bArr = new byte[(int) j2];
                this.f980g = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < g2.length; i4++) {
                    int i5 = (int) g2[i4];
                    int i6 = (int) g3[i4];
                    if (i4 < g2.length - 1 && i5 + i6 != g2[i4 + 1]) {
                        this.f980g = false;
                    }
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        c0068b.a(i7);
                        int i8 = i2 + i7;
                        byte[] bArr2 = new byte[i6];
                        try {
                            c0068b.readFully(bArr2);
                            i2 = i8 + i6;
                            System.arraycopy(bArr2, 0, bArr, i3, i6);
                            i3 += i6;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                        return;
                    }
                }
                if (this.f980g) {
                    long j4 = g2[0];
                    return;
                }
                return;
            }
        }
        if (f961m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i2, int i3) {
        HashMap[] hashMapArr = this.f977d;
        boolean isEmpty = hashMapArr[i2].isEmpty();
        boolean z2 = f961m;
        if (isEmpty || hashMapArr[i3].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C0069c c0069c = (C0069c) hashMapArr[i2].get("ImageLength");
        C0069c c0069c2 = (C0069c) hashMapArr[i2].get("ImageWidth");
        C0069c c0069c3 = (C0069c) hashMapArr[i3].get("ImageLength");
        C0069c c0069c4 = (C0069c) hashMapArr[i3].get("ImageWidth");
        if (c0069c == null || c0069c2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c0069c3 == null || c0069c4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e2 = c0069c.e(this.f979f);
        int e3 = c0069c2.e(this.f979f);
        int e4 = c0069c3.e(this.f979f);
        int e5 = c0069c4.e(this.f979f);
        if (e2 >= e4 || e3 >= e5) {
            return;
        }
        HashMap hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    public final void w(C0072f c0072f, int i2) {
        C0069c c2;
        C0069c c3;
        HashMap[] hashMapArr = this.f977d;
        C0069c c0069c = (C0069c) hashMapArr[i2].get("DefaultCropSize");
        C0069c c0069c2 = (C0069c) hashMapArr[i2].get("SensorTopBorder");
        C0069c c0069c3 = (C0069c) hashMapArr[i2].get("SensorLeftBorder");
        C0069c c0069c4 = (C0069c) hashMapArr[i2].get("SensorBottomBorder");
        C0069c c0069c5 = (C0069c) hashMapArr[i2].get("SensorRightBorder");
        if (c0069c != null) {
            if (c0069c.f939a == 5) {
                C0071e[] c0071eArr = (C0071e[]) c0069c.g(this.f979f);
                if (c0071eArr == null || c0071eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c0071eArr));
                    return;
                }
                c2 = C0069c.b(c0071eArr[0], this.f979f);
                c3 = C0069c.b(c0071eArr[1], this.f979f);
            } else {
                int[] iArr = (int[]) c0069c.g(this.f979f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c2 = C0069c.c(iArr[0], this.f979f);
                c3 = C0069c.c(iArr[1], this.f979f);
            }
            hashMapArr[i2].put("ImageWidth", c2);
            hashMapArr[i2].put("ImageLength", c3);
            return;
        }
        if (c0069c2 != null && c0069c3 != null && c0069c4 != null && c0069c5 != null) {
            int e2 = c0069c2.e(this.f979f);
            int e3 = c0069c4.e(this.f979f);
            int e4 = c0069c5.e(this.f979f);
            int e5 = c0069c3.e(this.f979f);
            if (e3 <= e2 || e4 <= e5) {
                return;
            }
            C0069c c4 = C0069c.c(e3 - e2, this.f979f);
            C0069c c5 = C0069c.c(e4 - e5, this.f979f);
            hashMapArr[i2].put("ImageLength", c4);
            hashMapArr[i2].put("ImageWidth", c5);
            return;
        }
        C0069c c0069c6 = (C0069c) hashMapArr[i2].get("ImageLength");
        C0069c c0069c7 = (C0069c) hashMapArr[i2].get("ImageWidth");
        if (c0069c6 == null || c0069c7 == null) {
            C0069c c0069c8 = (C0069c) hashMapArr[i2].get("JPEGInterchangeFormat");
            C0069c c0069c9 = (C0069c) hashMapArr[i2].get("JPEGInterchangeFormatLength");
            if (c0069c8 == null || c0069c9 == null) {
                return;
            }
            int e6 = c0069c8.e(this.f979f);
            int e7 = c0069c8.e(this.f979f);
            c0072f.b(e6);
            byte[] bArr = new byte[e7];
            c0072f.readFully(bArr);
            e(new C0068b(bArr), e6, i2);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f977d;
        C0069c c0069c = (C0069c) hashMapArr[1].get("PixelXDimension");
        C0069c c0069c2 = (C0069c) hashMapArr[1].get("PixelYDimension");
        if (c0069c != null && c0069c2 != null) {
            hashMapArr[0].put("ImageWidth", c0069c);
            hashMapArr[0].put("ImageLength", c0069c2);
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
