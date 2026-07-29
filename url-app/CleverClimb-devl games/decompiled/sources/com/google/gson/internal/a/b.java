package com.google.gson.internal.a;

import java.lang.reflect.AccessibleObject;

/* compiled from: ReflectionAccessor.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f6527a;

    public abstract void a(AccessibleObject accessibleObject);

    static {
        f6527a = com.google.gson.d.a.a() < 9 ? new a() : new c();
    }

    public static b a() {
        return f6527a;
    }
}
