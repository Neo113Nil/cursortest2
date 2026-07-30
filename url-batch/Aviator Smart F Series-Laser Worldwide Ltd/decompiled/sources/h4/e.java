package h4;

import androidx.annotation.NonNull;
import com.crrepa.ble.conn.bean.CRPAlarmInfo;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class e {
    private e() {
    }

    private static Date a(int i8) {
        if (i8 == 0) {
            return null;
        }
        String binaryString = Integer.toBinaryString(i8);
        int length = 16 - binaryString.length();
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < length; i9++) {
            sb.append(0);
        }
        sb.append(binaryString);
        String sb2 = sb.toString();
        String substring = sb2.substring(0, 4);
        String substring2 = sb2.substring(4, 8);
        String substring3 = sb2.substring(8, 16);
        int b8 = com.crrepa.g1.c.b(substring) + com.crrepa.f.t.f12751a;
        int b9 = com.crrepa.g1.c.b(substring2) - 1;
        int b10 = com.crrepa.g1.c.b(substring3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, b8);
        calendar.set(2, b9);
        calendar.set(5, b10);
        return calendar.getTime();
    }

    public static List<CRPAlarmInfo> b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length <= 3) {
            return null;
        }
        return a(bArr, 3, true);
    }

    public static List<CRPAlarmInfo> a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        return a(bArr, 0, false);
    }

    @NonNull
    private static List<CRPAlarmInfo> a(byte[] bArr, int i8, boolean z7) {
        char c8;
        Date date;
        int i9;
        ArrayList arrayList = new ArrayList();
        while (i8 < bArr.length) {
            boolean z8 = bArr[i8 + 1] == 1;
            char c9 = bArr[i8 + 2];
            int i10 = bArr[i8 + 3];
            int i11 = bArr[i8 + 4];
            char c10 = bArr[i8 + 7];
            if (c9 == 1) {
                date = null;
                c8 = Ascii.MAX;
            } else if (c9 == 0) {
                date = a(com.crrepa.g1.c.b(bArr[i8 + 5], bArr[i8 + 6]));
                c8 = 0;
            } else {
                c8 = c10;
                date = null;
            }
            if (z7) {
                i9 = bArr[i8];
            } else {
                i9 = bArr[i8];
                if (i9 == 0) {
                    i9 = i8 / 8;
                }
            }
            CRPAlarmInfo cRPAlarmInfo = new CRPAlarmInfo(i9, i10, i11, c8, z8);
            cRPAlarmInfo.setDate(date);
            arrayList.add(cRPAlarmInfo);
            i8 += 8;
        }
        return arrayList;
    }
}
