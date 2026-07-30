package h4;

import com.crrepa.ble.conn.bean.CRPCalendarEventInfo;
import com.crrepa.ble.conn.bean.CRPSavedCalendarEventInfo;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16771a = 12;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16772b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16773c = 5;

    private q() {
    }

    public static CRPCalendarEventInfo a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 12) {
            return null;
        }
        CRPCalendarEventInfo cRPCalendarEventInfo = new CRPCalendarEventInfo();
        cRPCalendarEventInfo.setId(bArr[2]);
        int i8 = bArr[3];
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 4, bArr2, 0, i8);
        cRPCalendarEventInfo.setTitle(new String(bArr2, StandardCharsets.UTF_8));
        cRPCalendarEventInfo.setStartHour(bArr[i8 + 4]);
        cRPCalendarEventInfo.setStartMinute(bArr[i8 + 5]);
        cRPCalendarEventInfo.setEndHour(bArr[i8 + 6]);
        cRPCalendarEventInfo.setEndMinute(bArr[i8 + 7]);
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, i8 + 8, bArr3, 0, 4);
        cRPCalendarEventInfo.setTime(com.crrepa.g1.c.f(bArr3));
        return cRPCalendarEventInfo;
    }

    public static List<CRPSavedCalendarEventInfo> b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 8) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 3; i8 < bArr.length; i8 += 5) {
            byte b8 = bArr[i8];
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, i8 + 1, bArr2, 0, 4);
            arrayList.add(new CRPSavedCalendarEventInfo(b8, com.crrepa.g1.c.f(bArr2)));
        }
        return arrayList;
    }
}
