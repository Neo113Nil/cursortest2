package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class phc {
    private static final Map<Integer, zmn<?, ?>> zmn = new ConcurrentHashMap();

    public static zmn<?, ?> zmn(Context context, int i) {
        zmn<?, ?> zmnVar;
        Map<Integer, zmn<?, ?>> map = zmn;
        zmn<?, ?> zmnVar2 = map.get(Integer.valueOf(i));
        if (zmnVar2 != null) {
            return zmnVar2;
        }
        synchronized (phc.class) {
            try {
                zmn<?, ?> zmnVar3 = map.get(Integer.valueOf(i));
                if (zmnVar3 == null) {
                    zmnVar = fs(context, i);
                    map.put(Integer.valueOf(i), zmnVar);
                } else {
                    zmnVar = zmnVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zmnVar;
    }

    private static zmn<?, ?> fs(Context context, int i) {
        if (i == 7) {
            return new kgc(context);
        }
        if (i == 8) {
            return new nps(context);
        }
        throw new IllegalArgumentException("Unsupported ad type: ".concat(String.valueOf(i)));
    }
}
