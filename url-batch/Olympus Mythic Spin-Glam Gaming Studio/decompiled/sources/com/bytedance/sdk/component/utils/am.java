package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class am {
    private static Map<String, Method> fs = new HashMap();
    public static final Class<?>[] zmn;
    private static final HashMap<Class<?>, Class<?>> zn;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        zn = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
        zmn = new Class[0];
    }

    public static int zmn(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int zmn(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
