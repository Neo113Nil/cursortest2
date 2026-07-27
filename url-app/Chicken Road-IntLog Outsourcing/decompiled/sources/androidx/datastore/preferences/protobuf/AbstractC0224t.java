package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0224t implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0226v f4506a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0226v f4507b;

    public AbstractC0224t(AbstractC0226v abstractC0226v) {
        this.f4506a = abstractC0226v;
        if (abstractC0226v.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f4507b = abstractC0226v.k();
    }

    public final AbstractC0226v a() {
        AbstractC0226v b6 = b();
        b6.getClass();
        if (AbstractC0226v.h(b6, true)) {
            return b6;
        }
        throw new b0();
    }

    public final AbstractC0226v b() {
        if (!this.f4507b.i()) {
            return this.f4507b;
        }
        AbstractC0226v abstractC0226v = this.f4507b;
        abstractC0226v.getClass();
        S s2 = S.f4392c;
        s2.getClass();
        s2.a(abstractC0226v.getClass()).d(abstractC0226v);
        abstractC0226v.j();
        return this.f4507b;
    }

    public final void c() {
        if (this.f4507b.i()) {
            return;
        }
        AbstractC0226v k3 = this.f4506a.k();
        AbstractC0226v abstractC0226v = this.f4507b;
        S s2 = S.f4392c;
        s2.getClass();
        s2.a(k3.getClass()).a(k3, abstractC0226v);
        this.f4507b = k3;
    }

    public final Object clone() {
        AbstractC0224t abstractC0224t = (AbstractC0224t) this.f4506a.e(5);
        abstractC0224t.f4507b = b();
        return abstractC0224t;
    }
}
