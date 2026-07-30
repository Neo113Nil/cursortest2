package com.crrepa.q1;

import com.crrepa.n1.e;
import java.lang.reflect.AccessibleObject;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f13710a;

    static {
        f13710a = e.b() < 9 ? new a() : new c();
    }

    public static b a() {
        return f13710a;
    }

    public abstract void a(AccessibleObject accessibleObject);
}
