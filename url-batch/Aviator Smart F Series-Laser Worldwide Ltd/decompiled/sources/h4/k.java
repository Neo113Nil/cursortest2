package h4;

import com.crrepa.ble.conn.bean.CRPBloodOxygenInfo;
import com.crrepa.ble.conn.bean.CRPHistoryBloodOxygenInfo;
import com.crrepa.ble.conn.type.CRPBloodOxygenTimeType;
import com.crrepa.f.z1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    private static final int f16716d = 80;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16717e = 100;

    /* renamed from: f, reason: collision with root package name */
    private static final int f16718f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final int f16719g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f16720h = 7;

    /* renamed from: i, reason: collision with root package name */
    private static final int f16721i = 1;

    /* renamed from: a, reason: collision with root package name */
    private List<Integer> f16722a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f16723b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f16724c = new ArrayList();

    public CRPBloodOxygenInfo a(List<Integer> list) {
        return new CRPBloodOxygenInfo(com.crrepa.g1.e.a(0), CRPBloodOxygenTimeType.TODAY, a(list, 1), 1);
    }

    public CRPBloodOxygenInfo b(List<Integer> list) {
        long a8 = com.crrepa.g1.e.a(-1);
        int a9 = com.crrepa.g1.e.a();
        if (list.size() <= a9) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        for (int i8 = 0; i8 < a9; i8++) {
            arrayList.set(i8, 0);
        }
        return new CRPBloodOxygenInfo(a8, CRPBloodOxygenTimeType.YESTERDAY, arrayList, 1);
    }

    public List<CRPHistoryBloodOxygenInfo> c(byte[] bArr) {
        if (bArr.length < 7) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 2; i8 < bArr.length; i8 += 5) {
            byte b8 = bArr[i8];
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, i8 + 1, bArr2, 0, 4);
            arrayList.add(new CRPHistoryBloodOxygenInfo(new Date(z1.a(com.crrepa.g1.c.f(bArr2) * 1000)), b8));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CRPBloodOxygenInfo d(byte[] bArr) {
        List<Integer> list;
        List<Integer> list2;
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte b8 = bArr[0];
        CRPBloodOxygenTimeType cRPBloodOxygenTimeType = CRPBloodOxygenTimeType.TODAY;
        if (cRPBloodOxygenTimeType.getValue() == b8) {
            list = this.f16722a;
        } else {
            if (CRPBloodOxygenTimeType.YESTERDAY.getValue() == b8) {
                list = this.f16723b;
            }
            List<Integer> a8 = a(bArr);
            if (b8 <= 3) {
                if (b8 <= 7) {
                    list2 = this.f16723b;
                }
                if (3 == b8) {
                    long a9 = com.crrepa.g1.e.a(0);
                    List<Integer> a10 = a(this.f16722a, 5);
                    this.f16722a = a10;
                    return new CRPBloodOxygenInfo(a9, cRPBloodOxygenTimeType, a10, 5);
                }
                if (7 == b8) {
                    return new CRPBloodOxygenInfo(com.crrepa.g1.e.a(-1), CRPBloodOxygenTimeType.YESTERDAY, this.f16723b, 5);
                }
                com.crrepa.m.f.e().a(com.crrepa.f.j0.b((byte) (b8 + 1)));
                return null;
            }
            list2 = this.f16722a;
            list2.addAll(a8);
            if (3 == b8) {
            }
        }
        list.clear();
        List<Integer> a82 = a(bArr);
        if (b8 <= 3) {
        }
        list2.addAll(a82);
        if (3 == b8) {
        }
    }

    private List<Integer> a(List<Integer> list, int i8) {
        int a8 = com.crrepa.g1.e.a() / i8;
        if (list.size() <= a8) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        while (a8 < list.size()) {
            arrayList.set(a8, 0);
            a8++;
        }
        return arrayList;
    }

    public List<Integer> b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte b8 = bArr[0];
        if (b8 == 0) {
            this.f16724c.clear();
        }
        this.f16724c.addAll(a(bArr));
        if (19 == b8) {
            return this.f16724c;
        }
        com.crrepa.m.f.e().a(com.crrepa.f.j0.c((byte) (b8 + 1)));
        return null;
    }

    private List<Integer> a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (com.crrepa.g1.c.h(bArr)) {
            return arrayList;
        }
        for (byte b8 : bArr) {
            int a8 = com.crrepa.g1.c.a(b8);
            if (a8 < 80 || a8 > 100) {
                a8 = 0;
            }
            arrayList.add(Integer.valueOf(a8));
        }
        arrayList.remove(0);
        return arrayList;
    }
}
