package y0;

import E.AbstractC0005f;
import E1.C0036l;
import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import android.util.Base64;
import com.startapp.motiondetector.SignalProcessor;
import d2.C0389g;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1569a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f16095a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16096b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f16097c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f16098d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f16099e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f16100f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f16101g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f16102h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f16103i = {2002, 2000, 1920, 1601, 1600, 1001, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f16104j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f16105k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f16106l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, PlatformPlugin.DEFAULT_SYSTEM_UI, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f16107m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] n = {5, 8, 10, 12};
    public static final int[] o = {6, 9, 12, 15};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f16108p = {2, 4, 6, 8};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f16109q = {9, 11, 13, 16};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f16110r = {5, 8, 10, 12};

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f16111s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f16112t = {44100, 48000, 32000};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f16113u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f16114w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f16115x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f16116y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static void A(W.t tVar) {
        int i4 = tVar.i(6);
        if (i4 < 2 || i4 > 42) {
            throw T.G.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i4)));
        }
        tVar.t(i4 * 8);
    }

    public static boolean B(int i4, W.u uVar, boolean z) {
        if (uVar.a() < 7) {
            if (z) {
                return false;
            }
            throw T.G.a(null, "too short header: " + uVar.a());
        }
        if (uVar.z() != i4) {
            if (z) {
                return false;
            }
            throw T.G.a(null, "expected header type " + Integer.toHexString(i4));
        }
        if (uVar.z() == 118 && uVar.z() == 111 && uVar.z() == 114 && uVar.z() == 98 && uVar.z() == 105 && uVar.z() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw T.G.a(null, "expected characters 'vorbis'");
    }

    public static byte[] a(int i4, int i5) {
        int i6 = -1;
        for (int i7 = 0; i7 < 13; i7++) {
            if (i4 == f16095a[i7]) {
                i6 = i7;
            }
        }
        int i8 = -1;
        for (int i9 = 0; i9 < 16; i9++) {
            if (i5 == f16096b[i9]) {
                i8 = i9;
            }
        }
        if (i4 == -1 || i8 == -1) {
            throw new IllegalArgumentException(AbstractC0005f.i(i4, i5, "Invalid sample rate or number of channels: ", ", "));
        }
        return b(2, i6, i8);
    }

    public static byte[] b(int i4, int i5, int i6) {
        return new byte[]{(byte) (((i4 << 3) & 248) | ((i5 >> 1) & 7)), (byte) (((i5 << 7) & 128) | ((i6 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        long j4 = ((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * SignalProcessor.ONE_SECOND_NANOS) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j4).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean d(W.u uVar, r rVar, int i4, T.r rVar2) {
        long B4 = uVar.B();
        long j4 = B4 >>> 16;
        if (j4 != i4) {
            return false;
        }
        boolean z = (j4 & 1) == 1;
        int i5 = (int) ((B4 >> 12) & 15);
        int i6 = (int) ((B4 >> 8) & 15);
        int i7 = (int) ((B4 >> 4) & 15);
        int i8 = (int) ((B4 >> 1) & 7);
        boolean z4 = (B4 & 1) == 1;
        if (i7 <= 7) {
            if (i7 != rVar.f16189g - 1) {
                return false;
            }
        } else if (i7 > 10 || rVar.f16189g != 2) {
            return false;
        }
        if (!(i8 == 0 || i8 == rVar.f16191i) || z4) {
            return false;
        }
        try {
            long H4 = uVar.H();
            if (!z) {
                H4 *= rVar.f16184b;
            }
            long j5 = rVar.f16192j;
            if (j5 != 0 && H4 > j5) {
                return false;
            }
            rVar2.f2881a = H4;
            int x4 = x(i5, uVar);
            long j6 = rVar.f16192j;
            boolean z5 = j6 == 0 || H4 + ((long) x4) >= j6;
            if (x4 == -1) {
                return false;
            }
            if ((!z5 && x4 < rVar.f16183a) || x4 > rVar.f16184b) {
                return false;
            }
            int i9 = rVar.f16187e;
            if (i6 != 0) {
                if (i6 <= 11) {
                    if (i6 != rVar.f16188f) {
                        return false;
                    }
                } else if (i6 != 12) {
                    if (i6 > 14) {
                        return false;
                    }
                    int G4 = uVar.G();
                    if (i6 == 14) {
                        G4 *= 10;
                    }
                    if (G4 != i9) {
                        return false;
                    }
                } else if (uVar.z() * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT != i9) {
                    return false;
                }
            }
            int z6 = uVar.z();
            int i10 = uVar.f3352b;
            byte[] bArr = uVar.f3351a;
            int i11 = i10 - 1;
            int i12 = 0;
            for (int i13 = uVar.f3352b; i13 < i11; i13++) {
                i12 = J.f3274l[i12 ^ (bArr[i13] & 255)];
            }
            String str = J.f3263a;
            if (z6 != i12) {
                return false;
            }
            if (uVar.a() != 0) {
                int j7 = uVar.j();
                if ((j7 & 128) != 0) {
                    return false;
                }
                int i14 = (j7 & 126) >> 1;
                if ((i14 >= 2 && i14 <= 7) || (i14 >= 13 && i14 <= 31)) {
                    AbstractC0108a.j("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i14);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void e(String str, boolean z) {
        if (!z) {
            throw T.G.a(null, str);
        }
    }

    public static void f(long j4, W.u uVar, F[] fArr) {
        int i4;
        while (true) {
            if (uVar.a() <= 1) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (uVar.a() == 0) {
                    i4 = -1;
                    break;
                }
                int z = uVar.z();
                i5 += z;
                if (z != 255) {
                    i4 = i5;
                    break;
                }
            }
            int i6 = 0;
            while (true) {
                if (uVar.a() == 0) {
                    i6 = -1;
                    break;
                }
                int z4 = uVar.z();
                i6 += z4;
                if (z4 != 255) {
                    break;
                }
            }
            int i7 = uVar.f3352b + i6;
            if (i6 == -1 || i6 > uVar.a()) {
                AbstractC0108a.s("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i7 = uVar.f3353c;
            } else if (i4 == 4 && i6 >= 8) {
                int z5 = uVar.z();
                int G4 = uVar.G();
                int m4 = G4 == 49 ? uVar.m() : 0;
                int z6 = uVar.z();
                if (G4 == 47) {
                    uVar.N(1);
                }
                boolean z7 = z5 == 181 && (G4 == 49 || G4 == 47) && z6 == 3;
                if (G4 == 49) {
                    z7 &= m4 == 1195456820;
                }
                if (z7) {
                    g(j4, uVar, fArr);
                }
            }
            uVar.M(i7);
        }
    }

    public static void g(long j4, W.u uVar, F[] fArr) {
        int z = uVar.z();
        if ((z & 64) != 0) {
            uVar.N(1);
            int i4 = (z & 31) * 3;
            int i5 = uVar.f3352b;
            for (F f4 : fArr) {
                uVar.M(i5);
                f4.a(i4, uVar);
                AbstractC0124a.t(j4 != -9223372036854775807L);
                f4.e(j4, 1, i4, 0, null);
            }
        }
    }

    public static int h(int i4, int i5) {
        int i6 = i5 / 2;
        if (i4 < 0 || i4 >= 3 || i5 < 0 || i6 >= 19) {
            return -1;
        }
        int i7 = f16098d[i4];
        if (i7 == 44100) {
            return ((i5 % 2) + f16102h[i6]) * 2;
        }
        int i8 = f16101g[i6];
        return i7 == 32000 ? i8 * 6 : i8 * 4;
    }

    public static void i(int i4, W.u uVar) {
        uVar.J(7);
        byte[] bArr = uVar.f3351a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[5] = (byte) ((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[6] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int j(byte[] bArr) {
        int i4;
        byte b4;
        int i5;
        int i6;
        byte b5;
        boolean z = false;
        byte b6 = bArr[0];
        if (b6 != -2) {
            if (b6 == -1) {
                i6 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b5 = bArr[9];
            } else if (b6 != 31) {
                i4 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b4 = bArr[7];
            } else {
                i6 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b5 = bArr[8];
            }
            i5 = (((b5 & 60) >> 2) | i6) + 1;
            z = true;
            return !z ? (i5 * 16) / 14 : i5;
        }
        i4 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b4 = bArr[6];
        i5 = (((b4 & 240) >> 4) | i4) + 1;
        if (!z) {
        }
    }

    public static int k(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i4 & (-2097152)) != -2097152 || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0 || (i7 = (i4 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i4 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = f16112t[i8];
        if (i5 == 2) {
            i9 /= 2;
        } else if (i5 == 0) {
            i9 /= 4;
        }
        int i10 = (i4 >>> 9) & 1;
        if (i6 == 3) {
            return ((((i5 == 3 ? f16113u[i7 - 1] : v[i7 - 1]) * 12) / i9) + i10) * 4;
        }
        int i11 = i5 == 3 ? i6 == 2 ? f16114w[i7 - 1] : f16115x[i7 - 1] : f16116y[i7 - 1];
        if (i5 == 3) {
            return ((i11 * 144) / i9) + i10;
        }
        return (((i6 == 1 ? 72 : 144) * i11) / i9) + i10;
    }

    public static int l(int i4) {
        if (i4 == 2147385345 || i4 == -25230976 || i4 == 536864768 || i4 == -14745368) {
            return 1;
        }
        if (i4 == 1683496997 || i4 == 622876772) {
            return 2;
        }
        if (i4 == 1078008818 || i4 == -233094848) {
            return 3;
        }
        return (i4 == 1908687592 || i4 == -398277519) ? 4 : 0;
    }

    public static int m(int i4) {
        if (i4 == 20) {
            return 63750;
        }
        if (i4 == 30) {
            return 2250000;
        }
        switch (i4) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i4) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static W.t n(byte[] bArr) {
        byte b4 = bArr[0];
        if (b4 == Byte.MAX_VALUE || b4 == 100 || b4 == 64 || b4 == 113) {
            return new W.t(bArr.length, bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b5 = copyOf[0];
        if (b5 == -2 || b5 == -1 || b5 == 37 || b5 == -14 || b5 == -24) {
            for (int i4 = 0; i4 < copyOf.length - 1; i4 += 2) {
                byte b6 = copyOf[i4];
                int i5 = i4 + 1;
                copyOf[i4] = copyOf[i5];
                copyOf[i5] = b6;
            }
        }
        W.t tVar = new W.t(copyOf.length, copyOf);
        if (copyOf[0] == 31) {
            W.t tVar2 = new W.t(copyOf.length, copyOf);
            while (tVar2.b() >= 16) {
                tVar2.t(2);
                int i6 = tVar2.i(14) & 16383;
                int min = Math.min(8 - tVar.f3344c, 14);
                int i7 = tVar.f3344c;
                int i8 = (8 - i7) - min;
                byte[] bArr2 = tVar.f3345d;
                int i9 = tVar.f3343b;
                byte b7 = (byte) (((65280 >> i7) | ((1 << i8) - 1)) & bArr2[i9]);
                bArr2[i9] = b7;
                int i10 = 14 - min;
                bArr2[i9] = (byte) (b7 | ((i6 >>> i10) << i8));
                int i11 = i9 + 1;
                while (i10 > 8) {
                    tVar.f3345d[i11] = (byte) (i6 >>> (i10 - 8));
                    i10 -= 8;
                    i11++;
                }
                int i12 = 8 - i10;
                byte[] bArr3 = tVar.f3345d;
                byte b8 = (byte) (bArr3[i11] & ((1 << i12) - 1));
                bArr3[i11] = b8;
                bArr3[i11] = (byte) (((i6 & ((1 << i10) - 1)) << i12) | b8);
                tVar.t(14);
                tVar.a();
            }
        }
        tVar.o(copyOf.length, copyOf);
        return tVar;
    }

    public static long o(byte b4, byte b5) {
        int i4;
        int i5 = b4 & 255;
        int i6 = b4 & 3;
        if (i6 != 0) {
            i4 = 2;
            if (i6 != 1 && i6 != 2) {
                i4 = b5 & 63;
            }
        } else {
            i4 = 1;
        }
        int i7 = i5 >> 3;
        return i4 * (i7 >= 16 ? 2500 << r6 : i7 >= 12 ? AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND << (i7 & 1) : (i7 & 3) == 3 ? 60000 : AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND << r6);
    }

    public static int p(W.t tVar) {
        int i4 = tVar.i(4);
        if (i4 == 15) {
            if (tVar.b() >= 24) {
                return tVar.i(24);
            }
            throw T.G.a(null, "AAC header insufficient data");
        }
        if (i4 < 13) {
            return f16095a[i4];
        }
        throw T.G.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static C1570b q(W.t tVar) {
        int h2;
        int i4;
        int i5;
        int i6;
        String str;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int g4 = tVar.g();
        tVar.t(40);
        boolean z = tVar.i(5) > 10;
        tVar.q(g4);
        int[] iArr = f16100f;
        int[] iArr2 = f16098d;
        if (z) {
            tVar.t(16);
            int i16 = tVar.i(2);
            if (i16 == 0) {
                r8 = 0;
            } else if (i16 == 1) {
                r8 = 1;
            } else if (i16 == 2) {
                r8 = 2;
            }
            tVar.t(3);
            h2 = (tVar.i(11) + 1) * 2;
            int i17 = tVar.i(2);
            if (i17 == 3) {
                i10 = f16099e[tVar.i(2)];
                i9 = 3;
                i11 = 6;
            } else {
                i9 = tVar.i(2);
                int i18 = f16097c[i9];
                i10 = iArr2[i17];
                i11 = i18;
            }
            i6 = i11 * 256;
            int i19 = (h2 * i10) / (i11 * 32);
            int i20 = tVar.i(3);
            boolean h4 = tVar.h();
            i5 = iArr[i20] + (h4 ? 1 : 0);
            tVar.t(10);
            if (tVar.h()) {
                tVar.t(8);
            }
            if (i20 == 0) {
                tVar.t(5);
                if (tVar.h()) {
                    tVar.t(8);
                }
            }
            if (r8 == 1 && tVar.h()) {
                tVar.t(16);
            }
            if (tVar.h()) {
                if (i20 > 2) {
                    tVar.t(2);
                }
                if ((i20 & 1) == 0 || i20 <= 2) {
                    i13 = 6;
                } else {
                    i13 = 6;
                    tVar.t(6);
                }
                if ((i20 & 4) != 0) {
                    tVar.t(i13);
                }
                if (h4 && tVar.h()) {
                    tVar.t(5);
                }
                if (r8 == 0) {
                    if (tVar.h()) {
                        i14 = 6;
                        tVar.t(6);
                    } else {
                        i14 = 6;
                    }
                    if (i20 == 0 && tVar.h()) {
                        tVar.t(i14);
                    }
                    if (tVar.h()) {
                        tVar.t(i14);
                    }
                    int i21 = tVar.i(2);
                    if (i21 == 1) {
                        tVar.t(5);
                        i15 = 2;
                    } else {
                        if (i21 == 2) {
                            tVar.t(12);
                        } else if (i21 == 3) {
                            int i22 = tVar.i(5);
                            if (tVar.h()) {
                                tVar.t(5);
                                if (tVar.h()) {
                                    tVar.t(4);
                                }
                                if (tVar.h()) {
                                    tVar.t(4);
                                }
                                if (tVar.h()) {
                                    tVar.t(4);
                                }
                                if (tVar.h()) {
                                    tVar.t(4);
                                }
                                if (tVar.h()) {
                                    tVar.t(4);
                                }
                                if (tVar.h()) {
                                    tVar.t(4);
                                }
                                if (tVar.h()) {
                                    tVar.t(4);
                                }
                                if (tVar.h()) {
                                    if (tVar.h()) {
                                        tVar.t(4);
                                    }
                                    if (tVar.h()) {
                                        tVar.t(4);
                                    }
                                }
                            }
                            if (tVar.h()) {
                                tVar.t(5);
                                if (tVar.h()) {
                                    tVar.t(7);
                                    if (tVar.h()) {
                                        tVar.t(8);
                                        i15 = 2;
                                        tVar.t((i22 + i15) * 8);
                                        tVar.c();
                                    }
                                }
                            }
                            i15 = 2;
                            tVar.t((i22 + i15) * 8);
                            tVar.c();
                        }
                        i15 = 2;
                    }
                    if (i20 < i15) {
                        if (tVar.h()) {
                            tVar.t(14);
                        }
                        if (i20 == 0 && tVar.h()) {
                            tVar.t(14);
                        }
                    }
                    if (tVar.h()) {
                        if (i9 == 0) {
                            tVar.t(5);
                        } else {
                            for (int i23 = 0; i23 < i11; i23++) {
                                if (tVar.h()) {
                                    tVar.t(5);
                                }
                            }
                        }
                    }
                }
            }
            if (tVar.h()) {
                tVar.t(5);
                if (i20 == 2) {
                    tVar.t(4);
                }
                if (i20 >= 6) {
                    tVar.t(2);
                }
                if (tVar.h()) {
                    tVar.t(8);
                }
                if (i20 == 0 && tVar.h()) {
                    tVar.t(8);
                }
                if (i17 < 3) {
                    tVar.s();
                }
            }
            if (r8 == 0 && i9 != 3) {
                tVar.s();
            }
            if (r8 == 2 && (i9 == 3 || tVar.h())) {
                i12 = 6;
                tVar.t(6);
            } else {
                i12 = 6;
            }
            str = (tVar.h() && tVar.i(i12) == 1 && tVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i8 = i10;
            i7 = i19;
        } else {
            tVar.t(32);
            int i24 = tVar.i(2);
            String str2 = i24 == 3 ? null : "audio/ac3";
            int i25 = tVar.i(6);
            int i26 = f16101g[i25 / 2] * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
            h2 = h(i24, i25);
            tVar.t(8);
            int i27 = tVar.i(3);
            if ((i27 & 1) == 0 || i27 == 1) {
                i4 = 2;
            } else {
                i4 = 2;
                tVar.t(2);
            }
            if ((i27 & 4) != 0) {
                tVar.t(i4);
            }
            if (i27 == i4) {
                tVar.t(i4);
            }
            r8 = i24 < 3 ? iArr2[i24] : -1;
            i5 = iArr[i27] + (tVar.h() ? 1 : 0);
            i6 = 1536;
            str = str2;
            i7 = i26;
            i8 = r8;
        }
        return new C1570b(i5, str, i8, h2, i6, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static A0.c r(W.t tVar) {
        int i4;
        int i5;
        int i6 = tVar.i(16);
        int i7 = tVar.i(16);
        if (i7 == 65535) {
            i7 = tVar.i(24);
            i4 = 7;
        } else {
            i4 = 4;
        }
        int i8 = i7 + i4;
        if (i6 == 44097) {
            i8 += 2;
        }
        if (tVar.i(2) == 3) {
            do {
                tVar.i(2);
            } while (tVar.h());
        }
        int i9 = tVar.i(10);
        if (tVar.h() && tVar.i(3) > 0) {
            tVar.t(2);
        }
        int i10 = tVar.h() ? 48000 : 44100;
        int i11 = tVar.i(4);
        int[] iArr = f16103i;
        if (i10 == 44100 && i11 == 13) {
            i5 = iArr[i11];
        } else if (i10 != 48000 || i11 >= 14) {
            i5 = 0;
        } else {
            int i12 = iArr[i11];
            int i13 = i9 % 5;
            if (i13 != 1) {
                if (i13 == 2) {
                    if (i11 != 8) {
                    }
                    i5 = i12 + 1;
                } else if (i13 != 3) {
                    if (i13 == 4) {
                        if (i11 != 3) {
                            if (i11 != 8) {
                            }
                        }
                        i5 = i12 + 1;
                    }
                    i5 = i12;
                }
            }
            if (i11 != 3) {
            }
            i5 = i12 + 1;
        }
        return new A0.c(i10, i8, i5);
    }

    public static C0036l s(W.t tVar, boolean z) {
        int i4 = tVar.i(5);
        if (i4 == 31) {
            i4 = tVar.i(6) + 32;
        }
        int p2 = p(tVar);
        int i5 = tVar.i(4);
        String j4 = AbstractC0005f.j(i4, "mp4a.40.");
        if (i4 == 5 || i4 == 29) {
            p2 = p(tVar);
            int i6 = tVar.i(5);
            if (i6 == 31) {
                i6 = tVar.i(6) + 32;
            }
            i4 = i6;
            if (i4 == 22) {
                i5 = tVar.i(4);
            }
        }
        if (z) {
            if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 6 && i4 != 7 && i4 != 17) {
                switch (i4) {
                    case C0583e9.f11743C /* 19 */:
                    case C0583e9.f11744D /* 20 */:
                    case 21:
                    case Build.API_LEVELS.API_22 /* 22 */:
                    case Build.API_LEVELS.API_23 /* 23 */:
                        break;
                    default:
                        throw T.G.c("Unsupported audio object type: " + i4);
                }
            }
            if (tVar.h()) {
                AbstractC0108a.s("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (tVar.h()) {
                tVar.t(14);
            }
            boolean h2 = tVar.h();
            if (i5 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i4 == 6 || i4 == 20) {
                tVar.t(3);
            }
            if (h2) {
                if (i4 == 22) {
                    tVar.t(16);
                }
                if (i4 == 17 || i4 == 19 || i4 == 20 || i4 == 23) {
                    tVar.t(3);
                }
                tVar.t(1);
            }
            switch (i4) {
                case 17:
                case C0583e9.f11743C /* 19 */:
                case C0583e9.f11744D /* 20 */:
                case 21:
                case Build.API_LEVELS.API_22 /* 22 */:
                case Build.API_LEVELS.API_23 /* 23 */:
                    int i7 = tVar.i(2);
                    if (i7 == 2 || i7 == 3) {
                        throw T.G.c("Unsupported epConfig: " + i7);
                    }
            }
        }
        int i8 = f16096b[i5];
        if (i8 == -1) {
            throw T.G.a(null, null);
        }
        C0036l c0036l = new C0036l();
        c0036l.f630a = p2;
        c0036l.f631b = i8;
        c0036l.f632c = j4;
        return c0036l;
    }

    public static void t(W.t tVar, C1571c c1571c) {
        int i4 = tVar.i(5);
        tVar.t(2);
        if (tVar.h()) {
            tVar.t(5);
        }
        if (i4 >= 7 && i4 <= 10) {
            tVar.s();
        }
        if (tVar.h()) {
            int i5 = tVar.i(3);
            if (c1571c.f16124b == -1 && i4 >= 0 && i4 <= 15 && (i5 == 0 || i5 == 1)) {
                c1571c.f16124b = i4;
            }
            if (tVar.h()) {
                A(tVar);
            }
        }
    }

    public static void u(W.t tVar, C1571c c1571c) {
        tVar.t(2);
        boolean h2 = tVar.h();
        int i4 = tVar.i(8);
        for (int i5 = 0; i5 < i4; i5++) {
            tVar.t(2);
            if (tVar.h()) {
                tVar.t(5);
            }
            if (h2) {
                tVar.t(24);
            } else {
                if (tVar.h()) {
                    if (!tVar.h()) {
                        tVar.t(4);
                    }
                    c1571c.f16125c = tVar.i(6) + 1;
                }
                tVar.t(4);
            }
        }
        if (tVar.h()) {
            tVar.t(3);
            if (tVar.h()) {
                A(tVar);
            }
        }
    }

    public static int v(W.t tVar, int[] iArr) {
        int i4 = 0;
        for (int i5 = 0; i5 < 3 && tVar.h(); i5++) {
            i4++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            i6 += 1 << iArr[i7];
        }
        return tVar.i(iArr[i4]) + i6;
    }

    public static T.E w(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = (String) list.get(i4);
            String str2 = J.f3263a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                AbstractC0108a.s("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(K0.a.d(new W.u(Base64.decode(split[1], 0))));
                } catch (RuntimeException e4) {
                    AbstractC0108a.t("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new P0.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new T.E(arrayList);
    }

    public static int x(int i4, W.u uVar) {
        switch (i4) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i4 - 2);
            case 6:
                return uVar.z() + 1;
            case 7:
                return uVar.G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i4 - 8);
            default:
                return -1;
        }
    }

    public static C0389g y(W.u uVar) {
        uVar.N(1);
        int C4 = uVar.C();
        long j4 = uVar.f3352b + C4;
        int i4 = C4 / 18;
        long[] jArr = new long[i4];
        long[] jArr2 = new long[i4];
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            long t4 = uVar.t();
            if (t4 == -1) {
                jArr = Arrays.copyOf(jArr, i5);
                jArr2 = Arrays.copyOf(jArr2, i5);
                break;
            }
            jArr[i5] = t4;
            jArr2[i5] = uVar.t();
            uVar.N(2);
            i5++;
        }
        uVar.N((int) (j4 - uVar.f3352b));
        return new C0389g(jArr, 20, jArr2);
    }

    public static e0.t z(W.u uVar, boolean z, boolean z4) {
        if (z) {
            B(3, uVar, false);
        }
        uVar.x((int) uVar.q(), StandardCharsets.UTF_8);
        long q4 = uVar.q();
        String[] strArr = new String[(int) q4];
        for (int i4 = 0; i4 < q4; i4++) {
            strArr[i4] = uVar.x((int) uVar.q(), StandardCharsets.UTF_8);
        }
        if (z4 && (uVar.z() & 1) == 0) {
            throw T.G.a(null, "framing bit expected to be set");
        }
        return new e0.t(strArr);
    }
}
