package h4;

import com.crrepa.ble.conn.bean.CRPHistoryHrvInfo;
import com.crrepa.f.z1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class c {
    private c() {
    }

    public static List<CRPHistoryHrvInfo> a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length % 5 != 3) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        for (int i8 = 3; i8 < bArr.length; i8 += 5) {
            int a8 = com.crrepa.g1.c.a(bArr[i8]);
            System.arraycopy(bArr, i8 + 1, bArr2, 0, 4);
            arrayList.add(new CRPHistoryHrvInfo(new Date(z1.a(com.crrepa.g1.c.f(bArr2) * 1000)), a8));
        }
        return arrayList;
    }
}
