package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0122dc {

    /* renamed from: a, reason: collision with root package name */
    public final Rg f1215a;
    public final InterfaceC0499s9 b;
    public final C0420p4 c;
    public final Xe d;
    public final O4 e;
    public final C0602wc f = new C0602wc();
    public final Lazy g = LazyKt.lazy(new C0096cc(this));

    public C0122dc(M6 m6, Rg rg, InterfaceC0499s9 interfaceC0499s9, C0420p4 c0420p4, Xe xe) {
        this.f1215a = rg;
        this.b = interfaceC0499s9;
        this.c = c0420p4;
        this.d = xe;
        this.e = new O4(m6, rg);
    }

    public final List<G8> a() {
        return this.e.a();
    }

    public final List<G8> b() {
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(this.e.c), (Iterable) CollectionsKt.listOf((G8) this.g.getValue()));
    }
}
