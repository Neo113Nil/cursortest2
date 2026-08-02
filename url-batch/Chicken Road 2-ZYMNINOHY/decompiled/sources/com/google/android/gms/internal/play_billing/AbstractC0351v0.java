package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0351v0 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0353w0 f6023a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0353w0 f6024b;

    public AbstractC0351v0(AbstractC0353w0 abstractC0353w0) {
        this.f6023a = abstractC0353w0;
        if (abstractC0353w0.m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f6024b = (AbstractC0353w0) abstractC0353w0.d(4);
    }

    public final AbstractC0353w0 a() {
        AbstractC0353w0 b4 = b();
        b4.getClass();
        if (AbstractC0353w0.c(b4, true)) {
            return b4;
        }
        throw new V0();
    }

    public final AbstractC0353w0 b() {
        if (!this.f6024b.m()) {
            return this.f6024b;
        }
        AbstractC0353w0 abstractC0353w0 = this.f6024b;
        abstractC0353w0.getClass();
        P0.f5897c.a(abstractC0353w0.getClass()).a(abstractC0353w0);
        abstractC0353w0.j();
        return this.f6024b;
    }

    public final void c() {
        if (this.f6024b.m()) {
            return;
        }
        AbstractC0353w0 abstractC0353w0 = (AbstractC0353w0) this.f6023a.d(4);
        P0.f5897c.a(abstractC0353w0.getClass()).d(abstractC0353w0, this.f6024b);
        this.f6024b = abstractC0353w0;
    }

    public final Object clone() {
        AbstractC0351v0 abstractC0351v0 = (AbstractC0351v0) this.f6023a.d(5);
        abstractC0351v0.f6024b = b();
        return abstractC0351v0;
    }
}
