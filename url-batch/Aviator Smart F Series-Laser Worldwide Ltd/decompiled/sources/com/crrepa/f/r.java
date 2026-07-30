package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPPillReminderInfo;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12729a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12730b = 255;

    private r() {
    }

    private static String a(String str) {
        int i8 = 31;
        int i9 = 0;
        int i10 = 0;
        while (i9 < str.length()) {
            int i11 = i9 + 1;
            i8 -= str.substring(i9, i11).getBytes(StandardCharsets.UTF_8).length;
            if (i8 <= 0) {
                return str.substring(0, i10);
            }
            i10++;
            i9 = i11;
        }
        return str;
    }

    public static byte[] a() {
        return g.a(-86, null);
    }

    public static byte[] a(int i8) {
        return g.a(-102, new byte[]{-1, (byte) i8});
    }

    public static byte[] a(CRPPillReminderInfo cRPPillReminderInfo) {
        byte[] bArr = new byte[58];
        bArr[0] = (byte) cRPPillReminderInfo.getId();
        bArr[1] = (byte) cRPPillReminderInfo.getDateOffset();
        byte[] bytes = a(cRPPillReminderInfo.getName()).getBytes(StandardCharsets.UTF_8);
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        bArr[33] = (byte) cRPPillReminderInfo.getRepeat();
        List<CRPPillReminderInfo.ReminderTimeBean> reminderTimeList = cRPPillReminderInfo.getReminderTimeList();
        if (8 < reminderTimeList.size()) {
            reminderTimeList.subList(0, 8);
        }
        for (int i8 = 0; i8 < reminderTimeList.size(); i8++) {
            CRPPillReminderInfo.ReminderTimeBean reminderTimeBean = reminderTimeList.get(i8);
            int time = reminderTimeBean.getTime();
            int i9 = i8 * 3;
            bArr[i9 + 34] = (byte) (time / 60);
            bArr[i9 + 35] = (byte) (time % 60);
            bArr[i9 + 36] = (byte) reminderTimeBean.getCount();
        }
        return g.a(-102, bArr);
    }
}
