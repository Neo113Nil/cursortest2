package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPUserInfo;

/* loaded from: classes3.dex */
public class f2 {
    private f2() {
    }

    public static byte[] a(CRPUserInfo cRPUserInfo) {
        if (cRPUserInfo == null) {
            return null;
        }
        return g.a(18, new byte[]{(byte) cRPUserInfo.getHeight(), (byte) cRPUserInfo.getWeight(), (byte) cRPUserInfo.getAge(), (byte) cRPUserInfo.getGender()});
    }
}
