package com.anythink.core.common.w.b;

import java.util.List;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f17198a;

    /* renamed from: b, reason: collision with root package name */
    private final h f17199b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17200c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f17201d;

    public g(List<c> list, h hVar, int i) {
        this.f17198a = list;
        this.f17199b = hVar;
        this.f17200c = i;
    }

    private void b(h hVar) {
        if (this.f17201d || hVar == null || hVar.f17205d == null) {
            return;
        }
        this.f17201d = true;
        hVar.f17205d.a();
    }

    @Override // com.anythink.core.common.w.b.a
    public final h a() {
        return this.f17199b;
    }

    @Override // com.anythink.core.common.w.b.a
    public final void a(h hVar) {
        try {
            List<c> list = this.f17198a;
            if (list == null || this.f17200c < list.size()) {
                this.f17198a.get(this.f17200c).a(new g(this.f17198a, hVar, this.f17200c + 1));
            } else {
                b(hVar);
            }
        } catch (Throwable unused) {
            b(hVar);
        }
    }
}
