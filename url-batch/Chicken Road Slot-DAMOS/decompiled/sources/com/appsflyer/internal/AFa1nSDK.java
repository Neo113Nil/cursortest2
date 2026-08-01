package com.appsflyer.internal;

import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK AFAdRevenueData;
    private final Object getMediationNetwork = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        AFa1nSDK aFa1nSDK;
        synchronized (AFa1nSDK.class) {
            try {
                if (AFAdRevenueData == null) {
                    AFAdRevenueData = new AFa1nSDK();
                }
                aFa1nSDK = AFAdRevenueData;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aFa1nSDK;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.getMediationNetwork) {
            str2 = (String) super.put((AFa1nSDK) num, (Integer) str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        String str;
        synchronized (this.getMediationNetwork) {
            str = (String) super.remove(obj);
        }
        return str;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.getMediationNetwork) {
            remove = super.remove(obj, obj2);
        }
        return remove;
    }
}
