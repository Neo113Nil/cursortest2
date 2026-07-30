package h4;

import androidx.annotation.Nullable;
import com.crrepa.ble.conn.bean.CRPHeartRateInfo;
import com.crrepa.ble.conn.bean.CRPHistoryHeartRateInfo;
import com.crrepa.ble.conn.type.CRPHistoryDay;
import com.crrepa.ble.conn.type.CRPHistoryDynamicRateType;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.g1;
import com.crrepa.f.z1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class o0 {

    /* renamed from: e, reason: collision with root package name */
    private static final int f16747e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f16748f = 16;

    /* renamed from: g, reason: collision with root package name */
    private static final int f16749g = 32;

    /* renamed from: h, reason: collision with root package name */
    private static final int f16750h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f16751i = 17;

    /* renamed from: j, reason: collision with root package name */
    private static final int f16752j = 33;

    /* renamed from: k, reason: collision with root package name */
    private static final int f16753k = 2;

    /* renamed from: l, reason: collision with root package name */
    private static final int f16754l = 18;

    /* renamed from: m, reason: collision with root package name */
    private static final int f16755m = 34;

    /* renamed from: n, reason: collision with root package name */
    public static final int f16756n = 40;

    /* renamed from: o, reason: collision with root package name */
    public static final int f16757o = 200;

    /* renamed from: p, reason: collision with root package name */
    private static final int f16758p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f16759q = 5;

    /* renamed from: r, reason: collision with root package name */
    private static final int f16760r = 10;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, List<Integer>> f16761a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Long> f16762b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f16763c = new byte[1440];

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, List<Integer>> f16764d = new HashMap();

    private int a(CRPHistoryDay cRPHistoryDay, int i8) {
        return (cRPHistoryDay.getValue() * 10) + i8;
    }

    @Nullable
    private CRPHeartRateInfo b(CRPHistoryDay cRPHistoryDay) {
        long a8 = com.crrepa.g1.e.a(cRPHistoryDay == CRPHistoryDay.YESTERDAY ? -1 : 0);
        boolean z7 = cRPHistoryDay == CRPHistoryDay.TODAY;
        List<Integer> a9 = a(z7, this.f16764d);
        if (a9 == null) {
            return null;
        }
        if (z7) {
            a9 = a(a9, 5);
        }
        return new CRPHeartRateInfo(a8, a9, 5, true, cRPHistoryDay);
    }

    public CRPHistoryDynamicRateType c(byte[] bArr) {
        int a8 = com.crrepa.g1.c.a(bArr[0]);
        return 32 <= a8 ? CRPHistoryDynamicRateType.THIRD_HEART_RATE : 16 <= a8 ? CRPHistoryDynamicRateType.SECOND_HEART_RATE : CRPHistoryDynamicRateType.FIRST_HEART_RATE;
    }

    public synchronized List<Integer> d(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte b8 = bArr[0];
        int length = (bArr.length - 1) * b8;
        BleLog.d("startIndex: " + length);
        System.arraycopy(bArr, 1, this.f16763c, length, bArr.length - 1);
        if (19 == b8) {
            return b(this.f16763c);
        }
        a((byte) (b8 + 1));
        return null;
    }

    public CRPHeartRateInfo e(byte[] bArr) {
        byte[] bArr2;
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        int a8 = com.crrepa.g1.c.a(bArr[0]);
        CRPHistoryDynamicRateType c8 = c(bArr);
        byte value = c8.getValue();
        List<Integer> list = this.f16761a.get(Integer.valueOf(value));
        if (list == null) {
            list = new ArrayList<>();
        }
        if (a8 != 0) {
            if (a8 != 1) {
                if (a8 != 2) {
                    switch (a8) {
                        case 16:
                            break;
                        case 17:
                            break;
                        case 18:
                            break;
                        default:
                            switch (a8) {
                                case 32:
                                    break;
                                case 33:
                                    break;
                                case 34:
                                    break;
                                default:
                                    bArr2 = null;
                                    break;
                            }
                            list.addAll(b(bArr2));
                            this.f16761a.put(Integer.valueOf(value), list);
                            a(c8);
                            break;
                    }
                    return null;
                }
                Long l8 = this.f16762b.get(Integer.valueOf(value));
                if (l8 == null) {
                    return null;
                }
                return a(list, l8.longValue());
            }
            int length = bArr.length - 1;
            bArr2 = new byte[length];
            System.arraycopy(bArr, 1, bArr2, 0, length);
            list.addAll(b(bArr2));
            this.f16761a.put(Integer.valueOf(value), list);
            a(c8);
            return null;
        }
        if (bArr.length < 5) {
            return null;
        }
        list.clear();
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, 1, bArr3, 0, 4);
        this.f16762b.put(Integer.valueOf(value), Long.valueOf(com.crrepa.g1.c.f(bArr3) * 1000));
        int length2 = bArr.length - 5;
        byte[] bArr4 = new byte[length2];
        System.arraycopy(bArr, 5, bArr4, 0, length2);
        bArr2 = bArr4;
        list.addAll(b(bArr2));
        this.f16761a.put(Integer.valueOf(value), list);
        a(c8);
        return null;
    }

    public List<CRPHistoryHeartRateInfo> f(byte[] bArr) {
        if (bArr.length < 7) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 2; i8 < bArr.length; i8 += 5) {
            int a8 = com.crrepa.g1.c.a(bArr[i8]);
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, i8 + 1, bArr2, 0, 4);
            arrayList.add(new CRPHistoryHeartRateInfo(new Date(z1.a(com.crrepa.g1.c.f(bArr2) * 1000)), a8));
        }
        return arrayList;
    }

    public int g(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return 0;
        }
        return bArr[0];
    }

    public int h(byte[] bArr) {
        byte b8 = 0;
        if (bArr != null && bArr.length > 0) {
            b8 = bArr[0];
        }
        return com.crrepa.g1.c.a(b8);
    }

    public synchronized CRPHeartRateInfo i(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte b8 = bArr[0];
        BleLog.d("index: " + ((int) b8));
        this.f16764d.put(Integer.valueOf(b8), a(bArr));
        BleLog.d("parseTimingHreatRate: " + (3 == b8));
        if (3 == b8) {
            return b(CRPHistoryDay.TODAY);
        }
        if (7 == b8) {
            return b(CRPHistoryDay.YESTERDAY);
        }
        b((byte) (b8 + 1));
        return null;
    }

    private CRPHeartRateInfo a(CRPHistoryDay cRPHistoryDay) {
        if (cRPHistoryDay == null) {
            return null;
        }
        long a8 = com.crrepa.g1.e.a(-cRPHistoryDay.getValue());
        int a9 = a(cRPHistoryDay, 0);
        int a10 = a(cRPHistoryDay, 3);
        BleLog.d("startIndex: " + a9 + ", endIndex; " + a10);
        List<Integer> arrayList = new ArrayList<>();
        while (a9 <= a10) {
            List<Integer> remove = this.f16764d.remove(Integer.valueOf(a9));
            if (remove == null) {
                return null;
            }
            arrayList.addAll(remove);
            a9++;
        }
        if (cRPHistoryDay == CRPHistoryDay.TODAY) {
            arrayList = a(arrayList, 5);
        }
        return new CRPHeartRateInfo(a8, arrayList, 5, true, cRPHistoryDay);
    }

    public CRPHeartRateInfo b(List<Integer> list) {
        long a8 = com.crrepa.g1.e.a(-1);
        List<Integer> b8 = b(list, 1);
        if (b8 == null) {
            return null;
        }
        return new CRPHeartRateInfo(a8, b8, 1, true, CRPHistoryDay.YESTERDAY);
    }

    private List<Integer> b(List<Integer> list, int i8) {
        int a8 = (com.crrepa.g1.e.a() / i8) + 1;
        if (list.size() <= a8) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        for (int i9 = 0; i9 < a8; i9++) {
            arrayList.set(i9, 0);
        }
        return arrayList;
    }

    public CRPHeartRateInfo a(CRPHistoryDay cRPHistoryDay, byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte b8 = bArr[0];
        BleLog.d("index: " + ((int) b8));
        this.f16764d.put(Integer.valueOf(a(cRPHistoryDay, b8)), a(bArr));
        BleLog.d("parseTimingHreatRate: " + (3 == b8));
        if (3 == b8) {
            return a(cRPHistoryDay);
        }
        a(cRPHistoryDay.getValue(), (byte) (b8 + 1));
        return null;
    }

    private List<Integer> b(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null && bArr.length >= 1) {
            for (byte b8 : bArr) {
                int a8 = com.crrepa.g1.c.a(b8);
                if (a8 < 40 || a8 > 200) {
                    a8 = 0;
                }
                arrayList.add(Integer.valueOf(a8));
            }
        }
        return arrayList;
    }

    public CRPHeartRateInfo a(List<Integer> list) {
        return new CRPHeartRateInfo(com.crrepa.g1.e.a(0), a(list, 1), 1, true, CRPHistoryDay.TODAY);
    }

    private CRPHeartRateInfo a(List<Integer> list, long j8) {
        if (list == null || list.size() < 1) {
            return null;
        }
        if (list.get(0).intValue() <= 0) {
            list.remove(0);
        }
        return new CRPHeartRateInfo(z1.a(j8), list, 1, false, null);
    }

    private void b(byte b8) {
        com.crrepa.m.f.e().a(g1.d(b8));
    }

    private List<Integer> a(List<Integer> list, int i8) {
        int a8 = (com.crrepa.g1.e.a() / i8) + 1;
        if (list.size() <= a8) {
            return list;
        }
        while (a8 < list.size()) {
            list.set(a8, 0);
            a8++;
        }
        return list;
    }

    private List<Integer> a(boolean z7, Map<Integer, List<Integer>> map) {
        int i8;
        int i9;
        if (z7) {
            i8 = 0;
            i9 = 3;
        } else {
            i8 = 4;
            i9 = 7;
        }
        ArrayList arrayList = new ArrayList();
        while (i8 <= i9) {
            List<Integer> remove = map.remove(Integer.valueOf(i8));
            if (remove == null) {
                return null;
            }
            arrayList.addAll(remove);
            i8++;
        }
        return arrayList;
    }

    private List<Integer> a(byte[] bArr) {
        List<Integer> b8 = b(bArr);
        b8.remove(0);
        return b8;
    }

    private void a(byte b8) {
        com.crrepa.m.f.e().a(g1.c(b8));
    }

    private void a(byte b8, byte b9) {
        com.crrepa.m.f.e().a(g1.a(b8, b9));
    }

    private void a(CRPHistoryDynamicRateType cRPHistoryDynamicRateType) {
        com.crrepa.m.f.e().a(g1.b(cRPHistoryDynamicRateType.getValue()));
    }
}
