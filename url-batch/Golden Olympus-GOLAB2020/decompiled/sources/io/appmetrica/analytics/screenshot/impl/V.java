package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class V implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C3161g f40726a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f40727b;

    /* renamed from: c, reason: collision with root package name */
    public final C3171q f40728c;

    public V() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(@NotNull T t4) {
        N n4 = new N();
        C3159e c3159e = t4.f40720a;
        n4.f40713a = c3159e != null ? this.f40726a.fromModel(c3159e) : null;
        X x4 = t4.f40721b;
        n4.f40714b = x4 != null ? this.f40727b.fromModel(x4) : null;
        C3169o c3169o = t4.f40722c;
        n4.f40715c = c3169o != null ? this.f40728c.fromModel(c3169o) : null;
        return n4;
    }

    public V(@NotNull C3161g c3161g, @NotNull Z z4, @NotNull C3171q c3171q) {
        this.f40726a = c3161g;
        this.f40727b = z4;
        this.f40728c = c3171q;
    }

    public /* synthetic */ V(C3161g c3161g, Z z4, C3171q c3171q, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new C3161g() : c3161g, (i4 & 2) != 0 ? new Z() : z4, (i4 & 4) != 0 ? new C3171q() : c3171q);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T toModel(@NotNull N n4) {
        C3159e c3159e;
        X x4;
        K k4 = n4.f40713a;
        if (k4 != null) {
            this.f40726a.getClass();
            c3159e = new C3159e(k4.f40704a);
        } else {
            c3159e = null;
        }
        M m4 = n4.f40714b;
        if (m4 != null) {
            this.f40727b.getClass();
            x4 = new X(m4.f40710a, m4.f40711b);
        } else {
            x4 = null;
        }
        L l4 = n4.f40715c;
        return new T(c3159e, x4, l4 != null ? this.f40728c.toModel(l4) : null);
    }
}
