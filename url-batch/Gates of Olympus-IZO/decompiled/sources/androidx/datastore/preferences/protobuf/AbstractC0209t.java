package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0209t implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0211v f3930d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0211v f3931e;

    public AbstractC0209t(AbstractC0211v abstractC0211v) {
        this.f3930d = abstractC0211v;
        if (abstractC0211v.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f3931e = abstractC0211v.k();
    }

    public final AbstractC0211v a() {
        AbstractC0211v b2 = b();
        b2.getClass();
        if (AbstractC0211v.h(b2, true)) {
            return b2;
        }
        throw new i0();
    }

    public final AbstractC0211v b() {
        if (!this.f3931e.i()) {
            return this.f3931e;
        }
        AbstractC0211v abstractC0211v = this.f3931e;
        abstractC0211v.getClass();
        W w3 = W.f3828c;
        w3.getClass();
        w3.a(abstractC0211v.getClass()).h(abstractC0211v);
        abstractC0211v.j();
        return this.f3931e;
    }

    public final void c() {
        if (this.f3931e.i()) {
            return;
        }
        AbstractC0211v k3 = this.f3930d.k();
        AbstractC0211v abstractC0211v = this.f3931e;
        W w3 = W.f3828c;
        w3.getClass();
        w3.a(k3.getClass()).b(k3, abstractC0211v);
        this.f3931e = k3;
    }

    public final Object clone() {
        AbstractC0209t abstractC0209t = (AbstractC0209t) this.f3930d.e(5);
        abstractC0209t.f3931e = b();
        return abstractC0209t;
    }
}
