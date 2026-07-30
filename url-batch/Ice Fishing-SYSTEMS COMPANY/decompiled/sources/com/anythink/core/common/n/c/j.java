package com.anythink.core.common.n.c;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: a, reason: collision with root package name */
    private x f16026a;

    public j(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16026a = xVar;
    }

    public final x a() {
        return this.f16026a;
    }

    @Override // com.anythink.core.common.n.c.x
    public final x f() {
        return this.f16026a.f();
    }

    @Override // com.anythink.core.common.n.c.x
    public final boolean f_() {
        return this.f16026a.f_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final void g() {
        this.f16026a.g();
    }

    @Override // com.anythink.core.common.n.c.x
    public final long g_() {
        return this.f16026a.g_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final x h_() {
        return this.f16026a.h_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final long i_() {
        return this.f16026a.i_();
    }

    public final j a(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16026a = xVar;
        return this;
    }

    @Override // com.anythink.core.common.n.c.x
    public final x a(long j9, TimeUnit timeUnit) {
        return this.f16026a.a(j9, timeUnit);
    }

    @Override // com.anythink.core.common.n.c.x
    public final x a(long j9) {
        return this.f16026a.a(j9);
    }
}
