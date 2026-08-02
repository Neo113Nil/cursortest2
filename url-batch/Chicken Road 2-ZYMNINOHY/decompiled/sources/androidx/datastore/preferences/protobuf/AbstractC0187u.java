package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0187u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0189w f4710a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0189w f4711b;

    public AbstractC0187u(AbstractC0189w abstractC0189w) {
        this.f4710a = abstractC0189w;
        if (abstractC0189w.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f4711b = abstractC0189w.i();
    }

    public final AbstractC0189w a() {
        AbstractC0189w b4 = b();
        b4.getClass();
        if (AbstractC0189w.f(b4, true)) {
            return b4;
        }
        throw new c0();
    }

    public final AbstractC0189w b() {
        if (!this.f4711b.g()) {
            return this.f4711b;
        }
        AbstractC0189w abstractC0189w = this.f4711b;
        abstractC0189w.getClass();
        T t4 = T.f4591c;
        t4.getClass();
        t4.a(abstractC0189w.getClass()).c(abstractC0189w);
        abstractC0189w.h();
        return this.f4711b;
    }

    public final void c() {
        if (this.f4711b.g()) {
            return;
        }
        AbstractC0189w i4 = this.f4710a.i();
        AbstractC0189w abstractC0189w = this.f4711b;
        T t4 = T.f4591c;
        t4.getClass();
        t4.a(i4.getClass()).a(i4, abstractC0189w);
        this.f4711b = i4;
    }

    public final Object clone() {
        AbstractC0187u abstractC0187u = (AbstractC0187u) this.f4710a.c(5);
        abstractC0187u.f4711b = b();
        return abstractC0187u;
    }
}
