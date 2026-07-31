package com.startapp.sdk.internal;

import java.util.HashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class rg {

    /* renamed from: a, reason: collision with root package name */
    public static int f406a;
    public static final HashMap b = new HashMap();

    public static synchronized Object a(int i, Class cls) {
        Object cast;
        synchronized (rg.class) {
            try {
                cast = cls.cast(b.remove(Integer.valueOf(i)));
            } catch (RuntimeException e) {
                n8.a(e);
                return null;
            }
        }
        return cast;
    }
}
