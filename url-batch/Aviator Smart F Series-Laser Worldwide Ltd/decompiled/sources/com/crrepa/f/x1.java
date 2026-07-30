package com.crrepa.f;

import com.crrepa.ble.conn.type.CRPCategoryHistoryDay;

/* loaded from: classes3.dex */
public class x1 {
    private x1() {
    }

    public static byte[] a(byte b8) {
        return a(a4.a.U0, b8);
    }

    public static byte[] b(byte b8) {
        return a(a4.a.V0, b8);
    }

    public static byte[] c(byte b8) {
        return a(a4.a.S0, b8);
    }

    private static byte[] a(byte b8, byte b9) {
        return g.a(b8, new byte[]{b9});
    }

    public static byte[] b(CRPCategoryHistoryDay cRPCategoryHistoryDay) {
        return b(cRPCategoryHistoryDay == CRPCategoryHistoryDay.YESTERDAY ? (byte) 2 : (byte) 0);
    }

    public static byte[] c(CRPCategoryHistoryDay cRPCategoryHistoryDay) {
        return c(cRPCategoryHistoryDay == CRPCategoryHistoryDay.YESTERDAY ? (byte) 2 : (byte) 0);
    }

    public static byte[] a(CRPCategoryHistoryDay cRPCategoryHistoryDay) {
        return a(cRPCategoryHistoryDay == CRPCategoryHistoryDay.YESTERDAY ? (byte) 2 : (byte) 0);
    }
}
