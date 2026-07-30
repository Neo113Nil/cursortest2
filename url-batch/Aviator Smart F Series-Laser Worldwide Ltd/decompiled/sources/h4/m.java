package h4;

import com.crrepa.ble.conn.bean.CRPBloodPressureInfo;
import com.crrepa.ble.conn.bean.CRPHistoryBloodPressureInfo;
import com.crrepa.ble.conn.listener.CRPBloodPressureChangeListener;
import com.crrepa.f.z1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    private static final int f16741b = 1;

    /* renamed from: a, reason: collision with root package name */
    private List<CRPBloodPressureInfo.BpBean> f16742a = new ArrayList();

    public CRPBloodPressureInfo a(List<CRPBloodPressureInfo.BpBean> list) {
        long a8 = com.crrepa.g1.e.a(0);
        int a9 = com.crrepa.g1.e.a();
        if (list.size() <= a9) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        while (a9 < list.size()) {
            arrayList.set(a9, null);
            a9++;
        }
        return new CRPBloodPressureInfo(a8, CRPBloodPressureInfo.TimeType.TODAY, arrayList, 1);
    }

    public CRPBloodPressureInfo b(List<CRPBloodPressureInfo.BpBean> list) {
        long a8 = com.crrepa.g1.e.a(-1);
        int a9 = com.crrepa.g1.e.a();
        if (list.size() <= a9) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        for (int i8 = 0; i8 < a9; i8++) {
            arrayList.set(i8, null);
        }
        return new CRPBloodPressureInfo(a8, CRPBloodPressureInfo.TimeType.YESTERDAY, arrayList, 1);
    }

    public List<CRPHistoryBloodPressureInfo> c(byte[] bArr) {
        if (bArr.length < 8) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 2; i8 < bArr.length; i8 += 6) {
            int a8 = com.crrepa.g1.c.a(bArr[i8]);
            int a9 = com.crrepa.g1.c.a(bArr[i8 + 1]);
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, i8 + 2, bArr2, 0, 4);
            arrayList.add(new CRPHistoryBloodPressureInfo(new Date(z1.a(com.crrepa.g1.c.f(bArr2) * 1000)), a8, a9));
        }
        return arrayList;
    }

    private List<CRPBloodPressureInfo.BpBean> a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (com.crrepa.g1.c.h(bArr)) {
            return arrayList;
        }
        for (int i8 = 1; i8 < bArr.length; i8 += 2) {
            arrayList.add(new CRPBloodPressureInfo.BpBean(com.crrepa.g1.c.a(bArr[i8]), com.crrepa.g1.c.a(bArr[i8 + 1])));
        }
        return arrayList;
    }

    public List<CRPBloodPressureInfo.BpBean> b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte b8 = bArr[0];
        if (b8 == 0) {
            this.f16742a.clear();
        }
        this.f16742a.addAll(a(bArr));
        if (19 == b8) {
            return this.f16742a;
        }
        com.crrepa.m.f.e().a(com.crrepa.f.n0.a((byte) (b8 + 1)));
        return null;
    }

    public void a(byte[] bArr, CRPBloodPressureChangeListener cRPBloodPressureChangeListener) {
        if (cRPBloodPressureChangeListener == null || com.crrepa.g1.c.h(bArr) || bArr.length != 3) {
            return;
        }
        cRPBloodPressureChangeListener.onBloodPressureChange(com.crrepa.g1.c.a(bArr[1]), com.crrepa.g1.c.a(bArr[2]));
    }
}
