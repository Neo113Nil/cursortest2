package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0203t implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0205v f3569d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0205v f3570e;

    public AbstractC0203t(AbstractC0205v abstractC0205v) {
        this.f3569d = abstractC0205v;
        if (abstractC0205v.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f3570e = abstractC0205v.i();
    }

    public final AbstractC0205v a() {
        AbstractC0205v b7 = b();
        b7.getClass();
        if (AbstractC0205v.f(b7, true)) {
            return b7;
        }
        throw new b0();
    }

    public final AbstractC0205v b() {
        if (!this.f3570e.g()) {
            return this.f3570e;
        }
        AbstractC0205v abstractC0205v = this.f3570e;
        abstractC0205v.getClass();
        S s7 = S.f3454c;
        s7.getClass();
        s7.a(abstractC0205v.getClass()).d(abstractC0205v);
        abstractC0205v.h();
        return this.f3570e;
    }

    public final void c() {
        if (this.f3570e.g()) {
            return;
        }
        AbstractC0205v i2 = this.f3569d.i();
        AbstractC0205v abstractC0205v = this.f3570e;
        S s7 = S.f3454c;
        s7.getClass();
        s7.a(i2.getClass()).a(i2, abstractC0205v);
        this.f3570e = i2;
    }

    public final Object clone() {
        AbstractC0203t abstractC0203t = (AbstractC0203t) this.f3569d.c(5);
        abstractC0203t.f3570e = b();
        return abstractC0203t;
    }
}
