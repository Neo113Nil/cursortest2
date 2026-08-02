package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0157u implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0159w f1759e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0159w f1760f;

    public AbstractC0157u(AbstractC0159w abstractC0159w) {
        this.f1759e = abstractC0159w;
        if (abstractC0159w.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f1760f = abstractC0159w.k();
    }

    public final AbstractC0159w a() {
        AbstractC0159w b2 = b();
        b2.getClass();
        if (AbstractC0159w.h(b2, true)) {
            return b2;
        }
        throw new c0();
    }

    public final AbstractC0159w b() {
        if (!this.f1760f.i()) {
            return this.f1760f;
        }
        AbstractC0159w abstractC0159w = this.f1760f;
        abstractC0159w.getClass();
        T t2 = T.f1643c;
        t2.getClass();
        t2.a(abstractC0159w.getClass()).h(abstractC0159w);
        abstractC0159w.j();
        return this.f1760f;
    }

    public final void c() {
        if (this.f1760f.i()) {
            return;
        }
        AbstractC0159w k2 = this.f1759e.k();
        AbstractC0159w abstractC0159w = this.f1760f;
        T t2 = T.f1643c;
        t2.getClass();
        t2.a(k2.getClass()).c(k2, abstractC0159w);
        this.f1760f = k2;
    }

    public final Object clone() {
        AbstractC0157u abstractC0157u = (AbstractC0157u) this.f1759e.e(5);
        abstractC0157u.f1760f = b();
        return abstractC0157u;
    }
}
