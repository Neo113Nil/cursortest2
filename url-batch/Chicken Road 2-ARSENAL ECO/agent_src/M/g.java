package M;

import W4.o;
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
    public static final byte[] f1542A;

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f1543B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1544C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f1545D;

    /* renamed from: E, reason: collision with root package name */
    public static final d f1546E;

    /* renamed from: F, reason: collision with root package name */
    public static final d[][] f1547F;

    /* renamed from: G, reason: collision with root package name */
    public static final d[] f1548G;

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap[] f1549H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashMap[] f1550I;

    /* renamed from: J, reason: collision with root package name */
    public static final Set f1551J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap f1552K;

    /* renamed from: L, reason: collision with root package name */
    public static final Charset f1553L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f1554M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f1555N;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f1556l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f1557m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1558n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f1559o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f1560p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f1561q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f1562r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f1563s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f1564t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f1565u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f1566v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f1567w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f1568x;
    public static final byte[] y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f1569z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f1570a;

    /* renamed from: b, reason: collision with root package name */
    public int f1571b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap[] f1572c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f1573d;

    /* renamed from: e, reason: collision with root package name */
    public ByteOrder f1574e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1575f;

    /* renamed from: g, reason: collision with root package name */
    public int f1576g;

    /* renamed from: h, reason: collision with root package name */
    public int f1577h;

    /* renamed from: i, reason: collision with root package name */
    public int f1578i;

    /* renamed from: j, reason: collision with root package name */
    public int f1579j;

    /* renamed from: k, reason: collision with root package name */
    public c f1580k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f1557m = new int[]{8, 8, 8};
        f1558n = new int[]{8};
        f1559o = new byte[]{-1, -40, -1};
        f1560p = new byte[]{102, 116, 121, 112};
        f1561q = new byte[]{109, 105, 102, 49};
        f1562r = new byte[]{104, 101, 105, 99};
        f1563s = new byte[]{97, 118, 105, 102};
        f1564t = new byte[]{97, 118, 105, 115};
        f1565u = new byte[]{79, 76, 89, 77, 80, 0};
        f1566v = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f1567w = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f1568x = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        y = new byte[]{82, 73, 70, 70};
        f1569z = new byte[]{87, 69, 66, 80};
        f1542A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f1543B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f1544C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f1545D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        f1546E = new d("StripOffsets", 273, 3);
        f1547F = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f1548G = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f1549H = new HashMap[10];
        f1550I = new HashMap[10];
        f1551J = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f1552K = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f1553L = forName;
        f1554M = "Exif\u0000\u0000".getBytes(forName);
        f1555N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            d[][] dVarArr6 = f1547F;
            if (i7 >= dVarArr6.length) {
                HashMap hashMap = f1552K;
                d[] dVarArr7 = f1548G;
                hashMap.put(Integer.valueOf(dVarArr7[0].f1536a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f1536a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f1536a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f1536a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f1536a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f1536a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f1549H[i7] = new HashMap();
            f1550I[i7] = new HashMap();
            for (d dVar : dVarArr6[i7]) {
                f1549H[i7].put(Integer.valueOf(dVar.f1536a), dVar);
                f1550I[i7].put(dVar.f1537b, dVar);
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:7:0x0037, B:13:0x0054, B:20:0x0067, B:21:0x007a, B:30:0x006f, B:31:0x0073, B:32:0x0077, B:33:0x0084, B:35:0x008d, B:37:0x0093, B:39:0x0099, B:41:0x009f, B:51:0x00ad), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(ByteArrayInputStream byteArrayInputStream) {
        d[][] dVarArr = f1547F;
        this.f1572c = new HashMap[dVarArr.length];
        this.f1573d = new HashSet(dVarArr.length);
        this.f1574e = ByteOrder.BIG_ENDIAN;
        boolean z5 = f1556l;
        this.f1570a = null;
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            try {
                try {
                    this.f1572c[i7] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z5) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                if (z5) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z5) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e7) {
                e = e7;
                if (z5) {
                }
                a();
                if (!z5) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream, 5000);
        int f7 = f(bufferedInputStream);
        this.f1571b = f7;
        if (f7 != 4 && f7 != 9 && f7 != 13 && f7 != 14) {
            f fVar = new f(bufferedInputStream);
            int i8 = this.f1571b;
            if (i8 != 12 && i8 != 15) {
                if (i8 == 7) {
                    g(fVar);
                } else if (i8 == 10) {
                    k(fVar);
                } else {
                    j(fVar);
                }
                fVar.d(this.f1576g);
                u(fVar);
                a();
                if (!z5) {
                    return;
                }
                p();
            }
            d(fVar, i8);
            fVar.d(this.f1576g);
            u(fVar);
            a();
            if (!z5) {
            }
            p();
        }
        b bVar = new b(bufferedInputStream);
        int i9 = this.f1571b;
        if (i9 == 4) {
            e(bVar, 0, 0);
        } else if (i9 == 13) {
            h(bVar);
        } else if (i9 == 9) {
            i(bVar);
        } else if (i9 == 14) {
            l(bVar);
        }
        a();
        if (!z5) {
        }
        p();
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        boolean z5 = f1556l;
        if (readShort == 18761) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b7 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f1572c;
        if (b7 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b7.concat("\u0000").getBytes(f1553L);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f1574e));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f1574e));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f1574e));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f1574e));
        }
    }

    public final String b(String str) {
        c c7 = c(str);
        if (c7 != null) {
            int i7 = c7.f1532a;
            if (str.equals("GPSTimeStamp")) {
                if (i7 != 5 && i7 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i7);
                    return null;
                }
                e[] eVarArr = (e[]) c7.g(this.f1574e);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (eVar.f1540a / eVar.f1541b));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (eVar2.f1540a / eVar2.f1541b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.f1540a / eVar3.f1541b)));
            }
            if (!f1551J.contains(str)) {
                return c7.f(this.f1574e);
            }
            try {
                return Double.toString(c7.d(this.f1574e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        c cVar;
        int i7;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (f1556l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i7 = this.f1571b) != 4 && ((i7 == 9 || i7 == 15 || i7 == 12 || i7 == 13) && (cVar2 = this.f1580k) != null)) {
            return cVar2;
        }
        for (int i8 = 0; i8 < f1547F.length; i8++) {
            c cVar3 = (c) this.f1572c[i8].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f1580k) == null) {
            return null;
        }
        return cVar;
    }

    public final void d(f fVar, int i7) {
        String str;
        String str2;
        String str3;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i7 == 15 && i8 < 31) {
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
                HashMap[] hashMapArr = this.f1572c;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f1574e));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str3), this.f1574e));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f1574e));
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
                    int i9 = parseInt2 + 6;
                    int i10 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f1554M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i10];
                    fVar.readFully(bArr2);
                    this.f1576g = i9;
                    r(0, bArr2);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j4 = parseInt4;
                    fVar.d(j4);
                    byte[] bArr3 = new byte[parseInt5];
                    fVar.readFully(bArr3);
                    this.f1580k = new c(j4, bArr3, 1, parseInt5);
                }
                if (f1556l) {
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
    
        r23.f1529h = r22.f1574e;
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
    public final void e(b bVar, int i7, int i8) {
        boolean z5 = f1556l;
        if (z5) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.f1529h = ByteOrder.BIG_ENDIAN;
        byte readByte = bVar.readByte();
        byte b7 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i9 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b7) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = bVar.readByte();
            if (z5) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i10 = readUnsignedShort - 2;
                int i11 = i9 + 4;
                if (z5) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                if (readByte3 != -31) {
                    HashMap[] hashMapArr = this.f1572c;
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
                                                hashMapArr[i8].put(i8 != 4 ? "ImageLength" : "ThumbnailImageLength", c.a(bVar.readUnsignedShort(), this.f1574e));
                                                hashMapArr[i8].put(i8 != 4 ? "ImageWidth" : "ThumbnailImageWidth", c.a(bVar.readUnsignedShort(), this.f1574e));
                                                i10 = readUnsignedShort - 7;
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
                        if (i10 >= 0) {
                            throw new IOException("Invalid length");
                        }
                        bVar.a(i10);
                        i9 = i11 + i10;
                        b7 = -1;
                    } else {
                        byte[] bArr = new byte[i10];
                        bVar.readFully(bArr);
                        if (b("UserComment") == null) {
                            HashMap hashMap = hashMapArr[1];
                            Charset charset = f1553L;
                            byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                            hashMap.put("UserComment", new c(bytes, 2, bytes.length));
                        }
                    }
                } else {
                    byte[] bArr2 = new byte[i10];
                    bVar.readFully(bArr2);
                    int i12 = i11 + i10;
                    byte[] bArr3 = f1554M;
                    if (i6.g.z(bArr2, bArr3)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i10);
                        this.f1576g = i7 + i11 + bArr3.length;
                        r(i8, copyOfRange);
                        u(new b(copyOfRange));
                    } else {
                        byte[] bArr4 = f1555N;
                        if (i6.g.z(bArr2, bArr4)) {
                            int length = i11 + bArr4.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i10);
                            this.f1580k = new c(length, copyOfRange2, 1, copyOfRange2.length);
                        }
                    }
                    i11 = i12;
                }
                i10 = 0;
                if (i10 >= 0) {
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
        int i7;
        b bVar2;
        int i8;
        b bVar3;
        b bVar4;
        int i9;
        b bVar5;
        b bVar6;
        int i10;
        int i11;
        long readInt;
        byte[] bArr;
        long j4;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i12 = 0;
        while (true) {
            byte[] bArr3 = f1559o;
            if (i12 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i12] != bArr3[i12]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i13 = 0; i13 < bytes.length; i13++) {
                    if (bArr2[i13] != bytes[i13]) {
                        int i14 = 1;
                        try {
                            bVar2 = new b(bArr2);
                            try {
                                try {
                                    readInt = bVar2.readInt();
                                    bArr = new byte[4];
                                    bVar2.readFully(bArr);
                                } catch (Exception e4) {
                                    e = e4;
                                    i7 = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            i7 = 0;
                            bVar2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = null;
                        }
                        if (Arrays.equals(bArr, f1560p)) {
                            if (readInt == 1) {
                                readInt = bVar2.readLong();
                                j4 = 16;
                            } else {
                                j4 = 8;
                            }
                            i7 = 0;
                            long j7 = 5000;
                            if (readInt > j7) {
                                readInt = j7;
                            }
                            long j8 = readInt - j4;
                            if (j8 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z5 = false;
                                    boolean z6 = false;
                                    boolean z7 = false;
                                    for (long j9 = 0; j9 < j8 / 4; j9++) {
                                        try {
                                            bVar2.readFully(bArr4);
                                            if (j9 != 1) {
                                                if (Arrays.equals(bArr4, f1561q)) {
                                                    z5 = true;
                                                } else if (Arrays.equals(bArr4, f1562r)) {
                                                    z6 = true;
                                                } else if (Arrays.equals(bArr4, f1563s) || Arrays.equals(bArr4, f1564t)) {
                                                    z7 = true;
                                                }
                                                if (z5) {
                                                    if (z6) {
                                                        bVar2.close();
                                                        i8 = 12;
                                                        break;
                                                    }
                                                    if (z7) {
                                                        bVar2.close();
                                                        i8 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    if (f1556l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            bVar2.close();
                            i8 = i7;
                            if (i8 == 0) {
                                return i8;
                            }
                            try {
                                bVar4 = new b(bArr2);
                                try {
                                    ByteOrder q6 = q(bVar4);
                                    this.f1574e = q6;
                                    bVar4.f1529h = q6;
                                    short readShort = bVar4.readShort();
                                    i9 = (readShort == 20306 || readShort == 21330) ? 1 : i7;
                                    bVar4.close();
                                } catch (Exception unused2) {
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    i9 = i7;
                                    if (i9 == 0) {
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
                            if (i9 == 0) {
                                return 7;
                            }
                            try {
                                b bVar7 = new b(bArr2);
                                try {
                                    ByteOrder q7 = q(bVar7);
                                    this.f1574e = q7;
                                    bVar7.f1529h = q7;
                                    i10 = bVar7.readShort() == 85 ? 1 : i7;
                                    bVar7.close();
                                } catch (Exception unused4) {
                                    bVar6 = bVar7;
                                    if (bVar6 != null) {
                                        bVar6.close();
                                    }
                                    i10 = i7;
                                    if (i10 == 0) {
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
                            if (i10 == 0) {
                                return 10;
                            }
                            int i15 = i7;
                            while (true) {
                                byte[] bArr5 = f1567w;
                                if (i15 >= bArr5.length) {
                                    i11 = 1;
                                    break;
                                }
                                if (bArr2[i15] != bArr5[i15]) {
                                    i11 = i7;
                                    break;
                                }
                                i15++;
                            }
                            if (i11 != 0) {
                                return 13;
                            }
                            int i16 = i7;
                            while (true) {
                                byte[] bArr6 = y;
                                if (i16 >= bArr6.length) {
                                    int i17 = i7;
                                    while (true) {
                                        byte[] bArr7 = f1569z;
                                        if (i17 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i17 + 4] != bArr7[i17]) {
                                            break;
                                        }
                                        i17++;
                                    }
                                } else {
                                    if (bArr2[i16] != bArr6[i16]) {
                                        break;
                                    }
                                    i16++;
                                }
                            }
                            i14 = i7;
                            if (i14 != 0) {
                                return 14;
                            }
                            return i7;
                        }
                        bVar2.close();
                        i7 = 0;
                        i8 = 0;
                        if (i8 == 0) {
                        }
                    }
                }
                return 9;
            }
            i12++;
        }
    }

    public final void g(f fVar) {
        int i7;
        int i8;
        j(fVar);
        HashMap[] hashMapArr = this.f1572c;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f1535d);
            fVar2.f1529h = this.f1574e;
            byte[] bArr = f1565u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.d(0L);
            byte[] bArr3 = f1566v;
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
                int[] iArr = (int[]) cVar4.g(this.f1574e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i9 = iArr[2];
                int i10 = iArr[0];
                if (i9 <= i10 || (i7 = iArr[3]) <= (i8 = iArr[1])) {
                    return;
                }
                int i11 = (i9 - i10) + 1;
                int i12 = (i7 - i8) + 1;
                if (i11 < i12) {
                    int i13 = i11 + i12;
                    i12 = i13 - i12;
                    i11 = i13 - i12;
                }
                c c7 = c.c(i11, this.f1574e);
                c c8 = c.c(i12, this.f1574e);
                hashMapArr[0].put("ImageWidth", c7);
                hashMapArr[0].put("ImageLength", c8);
            }
        }
    }

    public final void h(b bVar) {
        if (f1556l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f1529h = ByteOrder.BIG_ENDIAN;
        int i7 = bVar.f1528g;
        bVar.a(f1567w.length);
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            if (z5 && z6) {
                return;
            }
            try {
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int i8 = bVar.f1528g;
                int i9 = i8 + readInt + 4;
                int i10 = i8 - i7;
                if (i10 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z5) {
                    this.f1576g = i10;
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
                    z5 = true;
                } else if (readInt2 == 1767135348 && !z6) {
                    byte[] bArr2 = f1568x;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i11 = bVar.f1528g - i7;
                            int i12 = readInt - length;
                            byte[] bArr4 = new byte[i12];
                            bVar.readFully(bArr4);
                            this.f1580k = new c(i11, bArr4, 1, i12);
                            z6 = true;
                        }
                    }
                }
                bVar.a(i9 - bVar.f1528g);
            } catch (EOFException e4) {
                throw new IOException("Encountered corrupt PNG file.", e4);
            }
        }
    }

    public final void i(b bVar) {
        boolean z5 = f1556l;
        if (z5) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i8 = ByteBuffer.wrap(bArr2).getInt();
        int i9 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i8];
        bVar.a(i7 - bVar.f1528g);
        bVar.readFully(bArr4);
        e(new b(bArr4), i7, 5);
        bVar.a(i9 - bVar.f1528g);
        bVar.f1529h = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f1546E.f1536a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c7 = c.c(readShort, this.f1574e);
                c c8 = c.c(readShort2, this.f1574e);
                HashMap[] hashMapArr = this.f1572c;
                hashMapArr[0].put("ImageLength", c7);
                hashMapArr[0].put("ImageWidth", c8);
                if (z5) {
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
        if (this.f1571b == 8) {
            HashMap[] hashMapArr = this.f1572c;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f1535d);
                fVar2.f1529h = this.f1574e;
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
        if (f1556l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f1572c;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f1535d), (int) cVar.f1534c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) {
        if (f1556l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f1529h = ByteOrder.LITTLE_ENDIAN;
        bVar.a(y.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f1569z;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i7 = length + 8;
                if (Arrays.equals(f1542A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = f1554M;
                    if (i6.g.z(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f1576g = i7;
                    r(0, bArr3);
                    u(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i7 + readInt2;
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
        int e4 = cVar.e(this.f1574e);
        int e7 = cVar2.e(this.f1574e);
        if (this.f1571b == 7) {
            e4 += this.f1577h;
        }
        if (e4 > 0 && e7 > 0 && this.f1570a == null) {
            bVar.a(e4);
            bVar.readFully(new byte[e7]);
        }
        if (f1556l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e4 + ", length: " + e7);
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f1574e) <= 512 && cVar2.e(this.f1574e) <= 512;
    }

    public final void o(f fVar) {
        ByteOrder q6 = q(fVar);
        this.f1574e = q6;
        fVar.f1529h = q6;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i7 = this.f1571b;
        if (i7 != 7 && i7 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt < 8) {
            throw new IOException(o.c("Invalid first Ifd offset: ", readInt));
        }
        int i8 = readInt - 8;
        if (i8 > 0) {
            fVar.a(i8);
        }
    }

    public final void p() {
        int i7 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f1572c;
            if (i7 >= hashMapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i7 + "]: " + hashMapArr[i7].size());
            for (Map.Entry entry : hashMapArr[i7].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f1574e) + "'");
            }
            i7++;
        }
    }

    public final void r(int i7, byte[] bArr) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(f fVar, int i7) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        boolean z5;
        short s6;
        HashMap[] hashMapArr2;
        long j4;
        long j7;
        boolean z6;
        int i8;
        long j8;
        int i9;
        d dVar;
        HashSet hashSet2;
        int readUnsignedShort;
        long j9;
        int i10 = i7;
        int i11 = fVar.f1528g;
        int i12 = fVar.f1531j;
        Integer valueOf = Integer.valueOf(i11);
        HashSet hashSet3 = this.f1573d;
        hashSet3.add(valueOf);
        short readShort = fVar.readShort();
        boolean z7 = f1556l;
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s7 = 0;
        while (true) {
            hashMapArr = this.f1572c;
            if (s7 >= readShort) {
                break;
            }
            int readUnsignedShort2 = fVar.readUnsignedShort();
            int readUnsignedShort3 = fVar.readUnsignedShort();
            int readInt = fVar.readInt();
            long j10 = fVar.f1528g + 4;
            short s8 = readShort;
            d dVar2 = (d) f1549H[i10].get(Integer.valueOf(readUnsignedShort2));
            if (z7) {
                z5 = z7;
                s6 = s7;
                hashMapArr2 = hashMapArr;
                hashSet = hashSet3;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(readUnsignedShort2), dVar2 != null ? dVar2.f1537b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                hashSet = hashSet3;
                z5 = z7;
                s6 = s7;
                hashMapArr2 = hashMapArr;
            }
            if (dVar2 != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f1544C.length) {
                        int i13 = dVar2.f1538c;
                        if (i13 == 7 || readUnsignedShort3 == 7 || i13 == readUnsignedShort3 || (i8 = dVar2.f1539d) == readUnsignedShort3 || (((i13 == 4 || i8 == 4) && readUnsignedShort3 == 3) || (((i13 == 9 || i8 == 9) && readUnsignedShort3 == 8) || ((i13 == 12 || i8 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i13;
                            }
                            j4 = j10;
                            j7 = readInt * r7[readUnsignedShort3];
                            if (j7 < 0 || j7 > 2147483647L) {
                                if (z5) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z6 = false;
                                if (z6) {
                                    fVar.d(j4);
                                    hashSet2 = hashSet;
                                } else {
                                    long j11 = j4;
                                    if (j7 > 4) {
                                        int readInt2 = fVar.readInt();
                                        if (z5) {
                                            i9 = readUnsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            i9 = readUnsignedShort2;
                                        }
                                        if (this.f1571b == 7) {
                                            if ("MakerNote".equals(dVar2.f1537b)) {
                                                this.f1577h = readInt2;
                                            } else if (i10 == 6 && "ThumbnailImage".equals(dVar2.f1537b)) {
                                                this.f1578i = readInt2;
                                                this.f1579j = readInt;
                                                c c7 = c.c(6, this.f1574e);
                                                j8 = j11;
                                                c a7 = c.a(this.f1578i, this.f1574e);
                                                dVar = dVar2;
                                                c a8 = c.a(this.f1579j, this.f1574e);
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
                                        i9 = readUnsignedShort2;
                                        dVar = dVar2;
                                    }
                                    Integer num = (Integer) f1552K.get(Integer.valueOf(i9));
                                    if (z5) {
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
                                            if (z5) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j9), dVar.f1537b));
                                            }
                                            if (j9 > 0 || (i12 != -1 && j9 >= i12)) {
                                                hashSet2 = hashSet;
                                                if (z5) {
                                                    String str = "Skip jump into the IFD since its offset is invalid: " + j9;
                                                    if (i12 != -1) {
                                                        str = str + " (total length: " + i12 + ")";
                                                    }
                                                    Log.d("ExifInterface", str);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j9))) {
                                                    fVar.d(j9);
                                                    s(fVar, num.intValue());
                                                } else if (z5) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j9 + ")");
                                                }
                                            }
                                            fVar.d(j8);
                                        } else {
                                            readUnsignedShort = fVar.readUnsignedShort();
                                        }
                                        j9 = readUnsignedShort;
                                        if (z5) {
                                        }
                                        if (j9 > 0) {
                                        }
                                        hashSet2 = hashSet;
                                        if (z5) {
                                        }
                                        fVar.d(j8);
                                    } else {
                                        hashSet2 = hashSet;
                                        long j12 = j8;
                                        int i14 = fVar.f1528g + this.f1576g;
                                        byte[] bArr = new byte[(int) j7];
                                        fVar.readFully(bArr);
                                        c cVar = new c(i14, bArr, readUnsignedShort3, readInt);
                                        HashMap hashMap = hashMapArr2[i7];
                                        String str2 = dVar.f1537b;
                                        hashMap.put(str2, cVar);
                                        if ("DNGVersion".equals(str2)) {
                                            this.f1571b = 3;
                                        }
                                        if ((("Make".equals(str2) || "Model".equals(str2)) && cVar.f(this.f1574e).contains("PENTAX")) || ("Compression".equals(str2) && cVar.e(this.f1574e) == 65535)) {
                                            this.f1571b = 8;
                                        }
                                        if (fVar.f1528g != j12) {
                                            fVar.d(j12);
                                        }
                                    }
                                }
                                s7 = (short) (s6 + 1);
                                i10 = i7;
                                hashSet3 = hashSet2;
                                readShort = s8;
                                z7 = z5;
                            } else {
                                z6 = true;
                                if (z6) {
                                }
                                s7 = (short) (s6 + 1);
                                i10 = i7;
                                hashSet3 = hashSet2;
                                readShort = s8;
                                z7 = z5;
                            }
                        } else if (z5) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f1543B[readUnsignedShort3] + ") is unexpected for tag: " + dVar2.f1537b);
                        }
                    }
                }
                j4 = j10;
                if (z5) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j7 = 0;
                z6 = false;
                if (z6) {
                }
                s7 = (short) (s6 + 1);
                i10 = i7;
                hashSet3 = hashSet2;
                readShort = s8;
                z7 = z5;
            } else if (z5) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            j4 = j10;
            j7 = 0;
            z6 = false;
            if (z6) {
            }
            s7 = (short) (s6 + 1);
            i10 = i7;
            hashSet3 = hashSet2;
            readShort = s8;
            z7 = z5;
        }
        HashSet hashSet4 = hashSet3;
        boolean z8 = z7;
        int readInt3 = fVar.readInt();
        if (z8) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j13 = readInt3;
        if (j13 <= 0) {
            if (z8) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z8) {
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

    public final void t(String str, int i7, String str2) {
        HashMap[] hashMapArr = this.f1572c;
        if (hashMapArr[i7].isEmpty() || hashMapArr[i7].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i7];
        hashMap.put(str2, (c) hashMap.get(str));
        hashMapArr[i7].remove(str);
    }

    public final void u(b bVar) {
        c cVar;
        int e4;
        HashMap hashMap = this.f1572c[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 == null) {
            m(bVar, hashMap);
            return;
        }
        int e7 = cVar2.e(this.f1574e);
        if (e7 != 1) {
            if (e7 == 6) {
                m(bVar, hashMap);
                return;
            } else if (e7 != 7) {
                return;
            }
        }
        c cVar3 = (c) hashMap.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f1574e);
            int[] iArr2 = f1557m;
            if (Arrays.equals(iArr2, iArr) || (this.f1571b == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e4 = cVar.e(this.f1574e)) == 1 && Arrays.equals(iArr, f1558n)) || (e4 == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) hashMap.get("StripOffsets");
                c cVar5 = (c) hashMap.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] k4 = i6.g.k(cVar4.g(this.f1574e));
                long[] k7 = i6.g.k(cVar5.g(this.f1574e));
                if (k4 == null || k4.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (k7 == null || k7.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (k4.length != k7.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j4 = 0;
                for (long j7 : k7) {
                    j4 += j7;
                }
                byte[] bArr = new byte[(int) j4];
                this.f1575f = true;
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < k4.length; i9++) {
                    int i10 = (int) k4[i9];
                    int i11 = (int) k7[i9];
                    if (i9 < k4.length - 1 && i10 + i11 != k4[i9 + 1]) {
                        this.f1575f = false;
                    }
                    int i12 = i10 - i7;
                    if (i12 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.a(i12);
                        int i13 = i7 + i12;
                        byte[] bArr2 = new byte[i11];
                        try {
                            bVar.readFully(bArr2);
                            i7 = i13 + i11;
                            System.arraycopy(bArr2, 0, bArr, i8, i11);
                            i8 += i11;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i11 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i12 + " bytes.");
                        return;
                    }
                }
                if (this.f1575f) {
                    long j8 = k4[0];
                    return;
                }
                return;
            }
        }
        if (f1556l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i7, int i8) {
        HashMap[] hashMapArr = this.f1572c;
        boolean isEmpty = hashMapArr[i7].isEmpty();
        boolean z5 = f1556l;
        if (isEmpty || hashMapArr[i8].isEmpty()) {
            if (z5) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) hashMapArr[i7].get("ImageLength");
        c cVar2 = (c) hashMapArr[i7].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i8].get("ImageLength");
        c cVar4 = (c) hashMapArr[i8].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z5) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z5) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e4 = cVar.e(this.f1574e);
        int e7 = cVar2.e(this.f1574e);
        int e8 = cVar3.e(this.f1574e);
        int e9 = cVar4.e(this.f1574e);
        if (e4 >= e8 || e7 >= e9) {
            return;
        }
        HashMap hashMap = hashMapArr[i7];
        hashMapArr[i7] = hashMapArr[i8];
        hashMapArr[i8] = hashMap;
    }

    public final void w(f fVar, int i7) {
        c c7;
        c c8;
        HashMap[] hashMapArr = this.f1572c;
        c cVar = (c) hashMapArr[i7].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i7].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i7].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i7].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i7].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f1532a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f1574e);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                c7 = c.b(eVarArr[0], this.f1574e);
                c8 = c.b(eVarArr[1], this.f1574e);
            } else {
                int[] iArr = (int[]) cVar.g(this.f1574e);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c7 = c.c(iArr[0], this.f1574e);
                c8 = c.c(iArr[1], this.f1574e);
            }
            hashMapArr[i7].put("ImageWidth", c7);
            hashMapArr[i7].put("ImageLength", c8);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e4 = cVar2.e(this.f1574e);
            int e7 = cVar4.e(this.f1574e);
            int e8 = cVar5.e(this.f1574e);
            int e9 = cVar3.e(this.f1574e);
            if (e7 <= e4 || e8 <= e9) {
                return;
            }
            c c9 = c.c(e7 - e4, this.f1574e);
            c c10 = c.c(e8 - e9, this.f1574e);
            hashMapArr[i7].put("ImageLength", c9);
            hashMapArr[i7].put("ImageWidth", c10);
            return;
        }
        c cVar6 = (c) hashMapArr[i7].get("ImageLength");
        c cVar7 = (c) hashMapArr[i7].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i7].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i7].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int e10 = cVar8.e(this.f1574e);
            int e11 = cVar8.e(this.f1574e);
            fVar.d(e10);
            byte[] bArr = new byte[e11];
            fVar.readFully(bArr);
            e(new b(bArr), e10, i7);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f1572c;
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
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
