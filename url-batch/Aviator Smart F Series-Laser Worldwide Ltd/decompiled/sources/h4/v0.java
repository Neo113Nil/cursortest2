package h4;

import com.crrepa.ble.conn.bean.CRPMovementHeartRateInfo;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.z1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16795a = 72;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16796b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16797c = 60000;

    private v0() {
    }

    public static List<CRPMovementHeartRateInfo> a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length != 72) {
            return null;
        }
        int length = bArr.length / 3;
        byte[] bArr2 = new byte[length];
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 3; i8++) {
            System.arraycopy(bArr, length * i8, bArr2, 0, length);
            BleLog.i("heart rate data: " + com.crrepa.g1.c.c(bArr2));
            arrayList.add(b(bArr2));
        }
        return arrayList;
    }

    public static CRPMovementHeartRateInfo b(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        long a8 = z1.a(com.crrepa.g1.c.f(bArr2) * 1000);
        System.arraycopy(bArr, 4, bArr2, 0, 4);
        long a9 = z1.a(com.crrepa.g1.c.f(bArr2) * 1000);
        int b8 = com.crrepa.g1.c.b(bArr[9], bArr[8]);
        int a10 = com.crrepa.g1.c.a(bArr[11]);
        System.arraycopy(bArr, 12, bArr2, 0, 4);
        int f8 = (int) com.crrepa.g1.c.f(bArr2);
        System.arraycopy(bArr, 16, bArr2, 0, 4);
        int f9 = (int) com.crrepa.g1.c.f(bArr2);
        int b9 = com.crrepa.g1.c.b(bArr[21], bArr[20]);
        CRPMovementHeartRateInfo cRPMovementHeartRateInfo = new CRPMovementHeartRateInfo();
        cRPMovementHeartRateInfo.setType(a10);
        cRPMovementHeartRateInfo.setStartTime(a8);
        cRPMovementHeartRateInfo.setEndTime(a9);
        cRPMovementHeartRateInfo.setValidTime(b8);
        cRPMovementHeartRateInfo.setSteps(f8);
        cRPMovementHeartRateInfo.setDistance(f9);
        cRPMovementHeartRateInfo.setCalories(b9);
        return cRPMovementHeartRateInfo;
    }
}
