package com.startapp.sdk.internal;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class hh {

    /* renamed from: a, reason: collision with root package name */
    public static int f3938a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f3939b = new HashMap();

    public static synchronized Object a(int i3, Class cls) {
        Object cast;
        synchronized (hh.class) {
            try {
                cast = cls.cast(f3939b.remove(Integer.valueOf(i3)));
            } catch (RuntimeException e3) {
                d9.a(e3);
                return null;
            }
        }
        return cast;
    }
}
