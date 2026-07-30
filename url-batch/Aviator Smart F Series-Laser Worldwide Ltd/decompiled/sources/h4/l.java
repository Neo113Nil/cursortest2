package h4;

import com.crrepa.ble.conn.bean.CRPPillReminderInfo;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class l {
    private static String a(byte[] bArr) {
        int i8;
        int length = bArr.length;
        while (true) {
            length--;
            if (length < 0) {
                i8 = 0;
                break;
            }
            if (bArr[length] != 0) {
                i8 = length + 1;
                break;
            }
        }
        try {
            return new String(bArr, 0, i8, StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return "";
        }
    }

    public static List<CRPPillReminderInfo> b(byte[] bArr) {
        if (bArr.length < 58) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 < bArr.length; i8 += 58) {
            CRPPillReminderInfo cRPPillReminderInfo = new CRPPillReminderInfo();
            cRPPillReminderInfo.setId(bArr[i8]);
            cRPPillReminderInfo.setDateOffset(bArr[i8 + 1]);
            byte[] bArr2 = new byte[31];
            System.arraycopy(bArr, i8 + 2, bArr2, 0, 31);
            cRPPillReminderInfo.setName(a(bArr2));
            cRPPillReminderInfo.setRepeat(bArr[i8 + 33]);
            ArrayList arrayList2 = new ArrayList();
            for (int i9 = 0; i9 < 24; i9 += 3) {
                int i10 = i8 + 34 + i9;
                byte b8 = bArr[i10 + 2];
                if (b8 > 0) {
                    arrayList2.add(new CRPPillReminderInfo.ReminderTimeBean((bArr[i10] * 60) + bArr[i10 + 1], b8));
                }
            }
            cRPPillReminderInfo.setReminderTimeList(arrayList2);
            arrayList.add(cRPPillReminderInfo);
        }
        return arrayList;
    }
}
