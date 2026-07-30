package com.google.maps.android.data.kml;

/* loaded from: classes4.dex */
public class KmlBoolean {
    public static boolean parseBoolean(String str) {
        return "1".equals(str) || "true".equals(str);
    }
}
