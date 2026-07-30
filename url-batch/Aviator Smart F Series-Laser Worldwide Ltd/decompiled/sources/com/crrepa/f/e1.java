package com.crrepa.f;

import android.text.TextUtils;
import com.crrepa.ble.conn.bean.CRPSosInfo;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes3.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12522a = 3;

    /* renamed from: b, reason: collision with root package name */
    private static final int f12523b = 35;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12524c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f12525d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f12526e = 1;

    private e1() {
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{8, 0});
    }

    public static byte[] a(CRPSosInfo cRPSosInfo) {
        if (cRPSosInfo == null || cRPSosInfo.getMsgList() == null || cRPSosInfo.getMsgList().isEmpty()) {
            return null;
        }
        byte[] bArr = new byte[109];
        bArr[0] = 1;
        List<String> msgList = cRPSosInfo.getMsgList();
        for (int i8 = 0; i8 < msgList.size() && 3 > i8; i8++) {
            String str = msgList.get(i8);
            if (!TextUtils.isEmpty(str)) {
                byte[] a8 = com.crrepa.g1.c.a(str, 35, StandardCharsets.UTF_8);
                int i9 = i8 * 36;
                bArr[i9 + 1] = (byte) a8.length;
                System.arraycopy(a8, 0, bArr, i9 + 2, a8.length);
            }
        }
        return g.a(-75, bArr);
    }

    public static byte[] a(boolean z7) {
        return g.a(-69, new byte[]{8, 1, z7 ? (byte) 1 : (byte) 0});
    }
}
