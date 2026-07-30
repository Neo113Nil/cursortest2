package com.baidu.platform.comjni.map.basemap;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class BaseMapCallback {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<Long, a> f10569a = new ConcurrentHashMap<>(2);

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<Long, com.baidu.mapsdkplatform.a.a.a.a> f10570b = new ConcurrentHashMap<>(2);

    public static void release(long j8) {
        f10569a.remove(Long.valueOf(j8));
        f10570b.remove(Long.valueOf(j8));
    }

    public static int reqLayerData(Bundle bundle, long j8, int i8) {
        ConcurrentHashMap<Long, a> concurrentHashMap = f10569a;
        if (concurrentHashMap.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<Long, a>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (value != null && value.a(j8)) {
                return value.a(bundle, j8, i8);
            }
        }
        Iterator<Map.Entry<Long, com.baidu.mapsdkplatform.a.a.a.a>> it2 = f10570b.entrySet().iterator();
        while (it2.hasNext()) {
            com.baidu.mapsdkplatform.a.a.a.a value2 = it2.next().getValue();
            if (value2 != null && value2.a(j8)) {
                return value2.a(bundle, j8, i8);
            }
        }
        return 0;
    }

    public static boolean setMapCallback(long j8, a aVar) {
        if (aVar == null || j8 == 0) {
            return false;
        }
        f10569a.put(Long.valueOf(j8), aVar);
        return true;
    }

    public static boolean setMapSDKCallback(long j8, com.baidu.mapsdkplatform.a.a.a.a aVar) {
        if (aVar == null || j8 == 0) {
            return false;
        }
        f10570b.put(Long.valueOf(j8), aVar);
        return true;
    }
}
