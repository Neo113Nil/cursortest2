package h4;

import androidx.annotation.NonNull;
import com.crrepa.ble.conn.bean.CRPGpsPathInfo;
import com.crrepa.ble.conn.bean.CRPHisiliconEpoInfo;
import com.crrepa.f.w0;
import com.crrepa.f.z1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f16725a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final long f16726b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16727c = 65535;

    /* renamed from: d, reason: collision with root package name */
    private static final int f16728d = 10000;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16729e = 90;

    /* renamed from: f, reason: collision with root package name */
    private static final int f16730f = 180;

    /* renamed from: g, reason: collision with root package name */
    private static Map<Integer, List<CRPGpsPathInfo.Location>> f16731g = new HashMap();

    private k0() {
    }

    private static double a(long j8) {
        int i8 = (int) (j8 / 1000000);
        long j9 = j8 % 1000000;
        return new BigDecimal(i8 + ((((int) (j9 / 10000)) + ((j9 % 10000) / 10000.0d)) / 60.0d)).setScale(6, 4).doubleValue();
    }

    public static CRPHisiliconEpoInfo b(byte[] bArr) {
        if (bArr == null || bArr.length < 9) {
            return null;
        }
        return new CRPHisiliconEpoInfo((int) com.crrepa.g1.c.f(Arrays.copyOfRange(bArr, 1, 5)), (int) com.crrepa.g1.c.f(Arrays.copyOfRange(bArr, 5, 9)));
    }

    public static List<Integer> c(byte[] bArr) {
        if (bArr.length < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        for (int i8 = 1; i8 < bArr.length; i8 += 4) {
            System.arraycopy(bArr, i8, bArr2, 0, 4);
            arrayList.add(Integer.valueOf((int) com.crrepa.g1.c.f(bArr2)));
        }
        return arrayList;
    }

    public static CRPGpsPathInfo.Location d(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        long f8 = com.crrepa.g1.c.f(bArr2);
        System.arraycopy(bArr, 4, bArr2, 0, 4);
        long f9 = com.crrepa.g1.c.f(bArr2);
        if (f8 == f9) {
            if (f8 == 1) {
                return new CRPGpsPathInfo.Location(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
            }
            if (f8 == 0) {
                return new CRPGpsPathInfo.Location(200.0d, 200.0d);
            }
        }
        return a(f8, f9);
    }

    @NonNull
    private static CRPGpsPathInfo.Location a(long j8, long j9) {
        double a8 = a(j8);
        double a9 = a(j9);
        return (90.0d < Math.abs(a8) || 180.0d < Math.abs(a9)) ? new CRPGpsPathInfo.Location(200.0d, 200.0d) : new CRPGpsPathInfo.Location(a8, a9);
    }

    private static List<CRPGpsPathInfo.Location> b(long j8, long j9) {
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        if (j8 == 1) {
            if (j9 < 10000) {
                while (j10 < j9) {
                    arrayList.add(new CRPGpsPathInfo.Location(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON));
                    j10++;
                }
            }
        } else if (j8 != 0) {
            arrayList.add(a(j8, j9));
        } else if (j9 < 10000) {
            while (j10 < j9) {
                arrayList.add(new CRPGpsPathInfo.Location(200.0d, 200.0d));
                j10++;
            }
        }
        return arrayList;
    }

    public static CRPGpsPathInfo a(byte[] bArr) {
        if (bArr.length < 6) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int f8 = (int) com.crrepa.g1.c.f(bArr2);
        byte[] bArr3 = new byte[2];
        System.arraycopy(bArr, 4, bArr3, 0, 2);
        int b8 = com.crrepa.g1.c.b(bArr3[1], bArr3[0]);
        if (b8 == 65535) {
            return new CRPGpsPathInfo(z1.a(f8 * 1000), f16731g.get(Integer.valueOf(f8)));
        }
        byte[] bArr4 = new byte[4];
        ArrayList arrayList = new ArrayList();
        for (int i8 = 6; i8 <= bArr.length - 8; i8 += 8) {
            System.arraycopy(bArr, i8, bArr4, 0, 4);
            long j8 = com.crrepa.g1.c.j(bArr4);
            System.arraycopy(bArr, i8 + 4, bArr4, 0, 4);
            arrayList.addAll(b(j8, com.crrepa.g1.c.j(bArr4)));
        }
        List<CRPGpsPathInfo.Location> list = f16731g.get(Integer.valueOf(f8));
        if (list == null) {
            list = new ArrayList<>();
        }
        list.addAll(arrayList);
        f16731g.put(Integer.valueOf(f8), list);
        a(f8, b8 + 1);
        return null;
    }

    private static void a(int i8, int i9) {
        com.crrepa.m.f.e().a(w0.a(i8, i9));
    }
}
