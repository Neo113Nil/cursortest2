package com.crrepa.band.my.ble.band.cmd;

/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static boolean execute(j4 j4Var) {
        boolean isConnected = com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected();
        if (isConnected) {
            j4Var.call();
        }
        return isConnected;
    }
}
