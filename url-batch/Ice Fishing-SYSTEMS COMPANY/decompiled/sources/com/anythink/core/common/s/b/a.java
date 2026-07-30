package com.anythink.core.common.s.b;

import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final c f16549a;

    /* renamed from: b, reason: collision with root package name */
    private final f f16550b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16551c;

    public a(c cVar, f fVar) {
        this.f16549a = cVar;
        this.f16550b = fVar;
    }

    public final void a() {
        if (this.f16551c) {
            return;
        }
        c cVar = this.f16549a;
        if (cVar == null || !cVar.c()) {
            this.f16551c = true;
            f fVar = this.f16550b;
            if (fVar == null || this.f16549a == null) {
                return;
            }
            Map<String, Object> a9 = fVar.a();
            if (a9 == null || a9.isEmpty()) {
                this.f16549a.d();
                return;
            }
            this.f16550b.c();
            for (String str : a9.keySet()) {
                com.anythink.core.common.s.b.a();
                if (!com.anythink.core.common.s.b.a(str) && !this.f16549a.a(str)) {
                    this.f16549a.a(str, a9.get(str));
                }
            }
            this.f16549a.d();
            this.f16550b.b();
        }
    }
}
