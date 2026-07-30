package com.anythink.basead.b.b;

import com.anythink.basead.b.c;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.d.t;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b implements c.a {

    /* renamed from: a, reason: collision with root package name */
    c.a f5912a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5913b = false;

    /* renamed from: c, reason: collision with root package name */
    boolean f5914c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f5915d = false;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f5916e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5917f;

    public b() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f5916e = atomicBoolean;
        this.f5917f = false;
        atomicBoolean.set(false);
        this.f5917f = false;
        g();
    }

    private void g() {
        this.f5913b = false;
        this.f5914c = false;
        this.f5915d = false;
    }

    public final void a(c.a aVar) {
        this.f5912a = aVar;
    }

    @Override // com.anythink.basead.b.c.a
    public final void b() {
        if (this.f5917f || this.f5914c) {
            return;
        }
        this.f5914c = true;
        t.b().b(new Runnable() { // from class: com.anythink.basead.b.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                c.a aVar = b.this.f5912a;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }

    @Override // com.anythink.basead.b.c.a
    public final void c() {
        this.f5916e.set(false);
        if (this.f5917f || this.f5915d) {
            return;
        }
        this.f5915d = true;
        t.b().b(new Runnable() { // from class: com.anythink.basead.b.b.b.2
            @Override // java.lang.Runnable
            public final void run() {
                c.a aVar = b.this.f5912a;
                if (aVar != null) {
                    aVar.c();
                }
            }
        });
    }

    public final void d() {
        this.f5916e.set(true);
        g();
    }

    public final boolean e() {
        return this.f5916e.get();
    }

    public final void f() {
        this.f5912a = null;
        this.f5916e.set(false);
        this.f5917f = true;
    }

    @Override // com.anythink.basead.b.c.a
    public final void a() {
        if (this.f5917f || this.f5913b) {
            return;
        }
        this.f5913b = true;
        c.a aVar = this.f5912a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.anythink.basead.b.c.a
    public final void a(boolean z8) {
        c.a aVar;
        if (this.f5917f || (aVar = this.f5912a) == null) {
            return;
        }
        aVar.a(z8);
    }

    @Override // com.anythink.basead.b.c.a
    public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        c.a aVar = this.f5912a;
        if (aVar != null) {
            return aVar.a(str, iOfferClickHandler);
        }
        return false;
    }
}
