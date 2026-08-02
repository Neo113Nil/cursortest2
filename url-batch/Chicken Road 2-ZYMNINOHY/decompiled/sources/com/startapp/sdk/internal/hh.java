package com.startapp.sdk.internal;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class hh {

    /* renamed from: a, reason: collision with root package name */
    public static int f7063a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f7064b = new HashMap();

    public static synchronized Object a(int i4, Class cls) {
        Object cast;
        synchronized (hh.class) {
            try {
                cast = cls.cast(f7064b.remove(Integer.valueOf(i4)));
            } catch (RuntimeException e4) {
                d9.a(e4);
                return null;
            }
        }
        return cast;
    }
}
