package com.crrepa.ble.lzo;

/* loaded from: classes3.dex */
public class MiniLzoHelper {
    static {
        System.loadLibrary("minilzo");
    }

    public native int compress(String str, String str2);
}
