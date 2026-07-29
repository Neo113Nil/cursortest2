package com.tapjoy.internal;

import java.util.HashMap;
import java.util.TreeMap;

@fu
/* loaded from: classes2.dex */
public final class PluginSupport {
    private PluginSupport() {
    }

    @fu
    public static void trackUsage(String str, String str2, String str3) {
        TreeMap treeMap;
        bn b2;
        try {
            HashMap hashMap = null;
            if (al.a(str2)) {
                treeMap = null;
            } else {
                treeMap = new TreeMap();
                b2 = bn.b(str2);
                try {
                    b2.a(treeMap);
                    b2.close();
                } finally {
                }
            }
            if (!al.a(str3)) {
                hashMap = new HashMap();
                b2 = bn.b(str3);
                try {
                    b2.h();
                    while (b2.j()) {
                        hashMap.put(b2.l(), Long.valueOf(b2.q()));
                    }
                    b2.i();
                    b2.close();
                } finally {
                }
            }
            gg.a(str, treeMap, hashMap);
        } catch (Exception unused) {
        }
    }
}
