package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class mn2 {

    /* renamed from: c, reason: collision with root package name */
    private static mn2 f29188c = new mn2();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<ln2> f29189a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<ln2> f29190b = new ArrayList<>();

    private mn2() {
    }

    public static mn2 a() {
        return f29188c;
    }

    public final Collection<ln2> b() {
        return Collections.unmodifiableCollection(this.f29189a);
    }

    public final Collection<ln2> c() {
        return Collections.unmodifiableCollection(this.f29190b);
    }

    public final void a(ln2 ln2Var) {
        this.f29189a.add(ln2Var);
    }

    public final void b(ln2 ln2Var) {
        boolean z4 = this.f29190b.size() > 0;
        this.f29190b.add(ln2Var);
        if (z4) {
            return;
        }
        so2.a().b();
    }

    public final void c(ln2 ln2Var) {
        boolean z4 = this.f29190b.size() > 0;
        this.f29189a.remove(ln2Var);
        this.f29190b.remove(ln2Var);
        if (!z4 || this.f29190b.size() > 0) {
            return;
        }
        so2.a().c();
    }
}
