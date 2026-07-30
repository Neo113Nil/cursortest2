package h4;

import com.crrepa.ble.conn.bean.CRPHistoryStressInfo;
import com.crrepa.ble.conn.bean.CRPTimingStressInfo;
import com.crrepa.ble.conn.type.CRPStressDate;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.z1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class h0 {
    private h0() {
    }

    private static List<Integer> a(List<Integer> list) {
        int a8 = com.crrepa.g1.e.a() / 30;
        BleLog.d("filterTodayStressList index: " + a8);
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < list.size()) {
            arrayList.add(i8 <= a8 ? list.get(i8) : 0);
            i8++;
        }
        return arrayList;
    }

    public static CRPTimingStressInfo b(byte[] bArr) {
        CRPStressDate cRPStressDate;
        if (bArr == null || bArr.length < 50 || (cRPStressDate = CRPStressDate.getInstance(bArr[2])) == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (int i8 = 3; i8 < bArr.length; i8++) {
            arrayList.add(Integer.valueOf(com.crrepa.g1.c.a(bArr[i8])));
        }
        if (cRPStressDate == CRPStressDate.TODAY) {
            arrayList = a((List<Integer>) arrayList);
        }
        return new CRPTimingStressInfo(cRPStressDate, arrayList);
    }

    public static List<CRPHistoryStressInfo> a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length % 5 != 3) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        for (int i8 = 3; i8 < bArr.length; i8 += 5) {
            System.arraycopy(bArr, i8 + 1, bArr2, 0, 4);
            arrayList.add(new CRPHistoryStressInfo(new Date(z1.a(com.crrepa.g1.c.f(bArr2) * 1000)), bArr[i8]));
        }
        return arrayList;
    }
}
