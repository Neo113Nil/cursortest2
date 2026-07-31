package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class az2 {

    /* renamed from: c, reason: collision with root package name */
    private static final az2 f3090c = new az2();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<py2> f3091a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<py2> f3092b = new ArrayList<>();

    private az2() {
    }

    public static az2 a() {
        return f3090c;
    }

    public final Collection<py2> b() {
        return Collections.unmodifiableCollection(this.f3092b);
    }

    public final Collection<py2> c() {
        return Collections.unmodifiableCollection(this.f3091a);
    }

    public final void d(py2 py2Var) {
        this.f3091a.add(py2Var);
    }

    public final void e(py2 py2Var) {
        boolean g7 = g();
        this.f3091a.remove(py2Var);
        this.f3092b.remove(py2Var);
        if (!g7 || g()) {
            return;
        }
        hz2.b().f();
    }

    public final void f(py2 py2Var) {
        boolean g7 = g();
        this.f3092b.add(py2Var);
        if (g7) {
            return;
        }
        hz2.b().e();
    }

    public final boolean g() {
        return this.f3092b.size() > 0;
    }
}
