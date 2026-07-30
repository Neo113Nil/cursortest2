package com.afollestad.materialdialogs.util;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes.dex */
public class c {
    private static final SimpleArrayMap<String, Typeface> cache = new SimpleArrayMap<>();

    public static Typeface get(Context context, String str) {
        SimpleArrayMap<String, Typeface> simpleArrayMap = cache;
        synchronized (simpleArrayMap) {
            try {
                if (simpleArrayMap.containsKey(str)) {
                    return simpleArrayMap.get(str);
                }
                try {
                    Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", str));
                    simpleArrayMap.put(str, createFromAsset);
                    return createFromAsset;
                } catch (RuntimeException unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
