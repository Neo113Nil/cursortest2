package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0153u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0155w f2362a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0155w f2363b;

    public AbstractC0153u(AbstractC0155w abstractC0155w) {
        this.f2362a = abstractC0155w;
        if (abstractC0155w.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2363b = abstractC0155w.i();
    }

    public final AbstractC0155w a() {
        AbstractC0155w b3 = b();
        b3.getClass();
        if (AbstractC0155w.f(b3, true)) {
            return b3;
        }
        throw new c0();
    }

    public final AbstractC0155w b() {
        if (!this.f2363b.g()) {
            return this.f2363b;
        }
        AbstractC0155w abstractC0155w = this.f2363b;
        abstractC0155w.getClass();
        T t3 = T.f2253c;
        t3.getClass();
        t3.a(abstractC0155w.getClass()).d(abstractC0155w);
        abstractC0155w.h();
        return this.f2363b;
    }

    public final void c() {
        if (this.f2363b.g()) {
            return;
        }
        AbstractC0155w i3 = this.f2362a.i();
        AbstractC0155w abstractC0155w = this.f2363b;
        T t3 = T.f2253c;
        t3.getClass();
        t3.a(i3.getClass()).a(i3, abstractC0155w);
        this.f2363b = i3;
    }

    public final Object clone() {
        AbstractC0153u abstractC0153u = (AbstractC0153u) this.f2362a.c(5);
        abstractC0153u.f2363b = b();
        return abstractC0153u;
    }
}
