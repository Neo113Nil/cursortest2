package h4;

import com.crrepa.ble.conn.bean.CRPHrvInfo;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes3.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16774a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f16775b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f16776c = 3;

    private q0() {
    }

    public static CRPHrvInfo a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length < 6) {
            return null;
        }
        CRPHrvInfo cRPHrvInfo = new CRPHrvInfo();
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        cRPHrvInfo.setDate(new Date(com.crrepa.g1.c.f(bArr2) * 1000));
        cRPHrvInfo.setAtiveLevel(bArr[5]);
        if (6 < bArr.length) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 6; i8 < bArr.length; i8++) {
                arrayList.add(Integer.valueOf(bArr[i8]));
            }
            cRPHrvInfo.setRriList(arrayList);
        }
        return cRPHrvInfo;
    }
}
