package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0265t implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0267v f5131d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0267v f5132e;

    public AbstractC0265t(AbstractC0267v abstractC0267v) {
        this.f5131d = abstractC0267v;
        if (abstractC0267v.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5132e = abstractC0267v.k();
    }

    public final AbstractC0267v a() {
        AbstractC0267v b3 = b();
        b3.getClass();
        if (AbstractC0267v.h(b3, true)) {
            return b3;
        }
        throw new i0();
    }

    public final AbstractC0267v b() {
        if (!this.f5132e.i()) {
            return this.f5132e;
        }
        AbstractC0267v abstractC0267v = this.f5132e;
        abstractC0267v.getClass();
        W w2 = W.f5029c;
        w2.getClass();
        w2.a(abstractC0267v.getClass()).h(abstractC0267v);
        abstractC0267v.j();
        return this.f5132e;
    }

    public final void c() {
        if (this.f5132e.i()) {
            return;
        }
        AbstractC0267v k3 = this.f5131d.k();
        AbstractC0267v abstractC0267v = this.f5132e;
        W w2 = W.f5029c;
        w2.getClass();
        w2.a(k3.getClass()).c(k3, abstractC0267v);
        this.f5132e = k3;
    }

    public final Object clone() {
        AbstractC0265t abstractC0265t = (AbstractC0265t) this.f5131d.e(5);
        abstractC0265t.f5132e = b();
        return abstractC0265t;
    }
}
