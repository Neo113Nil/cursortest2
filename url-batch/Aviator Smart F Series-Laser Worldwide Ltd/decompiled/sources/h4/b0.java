package h4;

import com.crrepa.ble.conn.bean.CRPNapSleepInfo;
import com.crrepa.ble.conn.bean.CRPSleepInfo;
import com.crrepa.ble.util.BleLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16679a = 3;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16680b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16681c = 15;

    /* renamed from: d, reason: collision with root package name */
    private static final int f16682d = 1008;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16683e = 64512;

    /* renamed from: f, reason: collision with root package name */
    private static final int f16684f = 20;

    /* renamed from: g, reason: collision with root package name */
    private static final int f16685g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f16686h = 0;

    private b0() {
    }

    private static int a(int i8, int i9, int i10, int i11) {
        if (i8 > i10) {
            i10 += 24;
        }
        return (((i10 - i8) * 60) + i11) - i9;
    }

    public static List<CRPNapSleepInfo> b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length % 6 != 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < bArr.length; i8 += 6) {
            int i9 = bArr[i8] == 1 ? (bArr[i8 + 1] * 60) + bArr[i8 + 2] : -1;
            int i10 = bArr[i8 + 3] == 0 ? (bArr[i8 + 4] * 60) + bArr[i8 + 5] : -1;
            if (i9 != -1 && i10 != -1) {
                if (i10 < i9) {
                    i10 += 1440;
                }
                arrayList.add(new CRPNapSleepInfo(i9, i10, i10 - i9));
            }
        }
        return arrayList;
    }

    public static CRPSleepInfo a(byte[] bArr) {
        int i8;
        int i9;
        CRPSleepInfo cRPSleepInfo = new CRPSleepInfo();
        if (bArr != null && bArr.length % 2 == 0) {
            int length = bArr.length;
            byte[] bArr2 = new byte[2];
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13 += 2) {
                System.arraycopy(bArr, i13, bArr2, 0, 2);
                int b8 = com.crrepa.g1.c.b(bArr2[1], bArr2[0]);
                int i14 = (b8 & 1008) >> 4;
                int i15 = (f16683e & b8) >> 10;
                int a8 = a(i11, i12, i14, i15);
                if (a8 >= 0) {
                    if (i10 >= 0) {
                        i8 = a8;
                        i9 = i15;
                        a(cRPSleepInfo, i10, i11, i12, i14, i15, i8);
                    } else {
                        i8 = a8;
                        i9 = i15;
                    }
                    i10 = b8 & 15;
                    BleLog.i("state: " + i10 + " time: " + i8);
                    i11 = i14;
                    i12 = i9;
                }
            }
            cRPSleepInfo.setTotalTime(cRPSleepInfo.getRestfulTime() + cRPSleepInfo.getLightTime() + cRPSleepInfo.getRemTime());
        }
        return cRPSleepInfo;
    }

    public static CRPSleepInfo a(byte[] bArr, boolean z7) {
        int i8;
        CRPSleepInfo cRPSleepInfo = new CRPSleepInfo();
        if (bArr != null && bArr.length % 3 == 0) {
            int length = bArr.length;
            byte[] bArr2 = new byte[3];
            byte b8 = -1;
            int i9 = 0;
            byte b9 = 0;
            for (int i10 = 0; i10 < length; i10 += 3) {
                System.arraycopy(bArr, i10, bArr2, 0, 3);
                int i11 = bArr2[1] % 24;
                byte b10 = bArr2[2];
                int a8 = a(i9, b9, i11, b10);
                if (a8 >= 0) {
                    if (b8 >= 0) {
                        i8 = a8;
                        a(cRPSleepInfo, b8, i9, b9, i11, b10, a8);
                    } else {
                        i8 = a8;
                    }
                    b8 = bArr2[0];
                    BleLog.i("state: " + ((int) b8) + " time: " + i8);
                    i9 = i11;
                    b9 = b10;
                }
            }
            cRPSleepInfo.setTotalTime(cRPSleepInfo.getRestfulTime() + cRPSleepInfo.getLightTime() + cRPSleepInfo.getRemTime());
        }
        return cRPSleepInfo;
    }

    public static Date a(Date date, int i8) {
        BleLog.d("dayOffset: " + i8);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, i8);
        return calendar.getTime();
    }

    private static void a(CRPSleepInfo cRPSleepInfo, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (i8 == 0) {
            cRPSleepInfo.setSoberTime(cRPSleepInfo.getSoberTime() + i13);
        } else if (i8 == 1) {
            cRPSleepInfo.setLightTime(cRPSleepInfo.getLightTime() + i13);
        } else if (i8 == 2) {
            cRPSleepInfo.setRestfulTime(cRPSleepInfo.getRestfulTime() + i13);
        } else if (i8 == 3) {
            cRPSleepInfo.setRemTime(cRPSleepInfo.getRemTime() + i13);
        }
        CRPSleepInfo.DetailBean detailBean = new CRPSleepInfo.DetailBean();
        detailBean.setTotalTime(i13);
        detailBean.setType(i8);
        detailBean.setStartTime(com.crrepa.g1.f.a(i9, i10));
        detailBean.setEndTime(com.crrepa.g1.f.a(i11, i12));
        if (cRPSleepInfo.getDetails() == null) {
            cRPSleepInfo.setDetails(new ArrayList());
        }
        cRPSleepInfo.getDetails().add(detailBean);
    }

    public static boolean a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return 20 <= calendar.get(11);
    }
}
