package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0108u implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0110w f1600e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0110w f1601f;

    public AbstractC0108u(AbstractC0110w abstractC0110w) {
        this.f1600e = abstractC0110w;
        if (abstractC0110w.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f1601f = abstractC0110w.i();
    }

    public final AbstractC0110w a() {
        AbstractC0110w b2 = b();
        b2.getClass();
        if (AbstractC0110w.f(b2, true)) {
            return b2;
        }
        throw new c0();
    }

    public final AbstractC0110w b() {
        if (!this.f1601f.g()) {
            return this.f1601f;
        }
        AbstractC0110w abstractC0110w = this.f1601f;
        abstractC0110w.getClass();
        T t = T.f1483c;
        t.getClass();
        t.a(abstractC0110w.getClass()).d(abstractC0110w);
        abstractC0110w.h();
        return this.f1601f;
    }

    public final void c() {
        if (this.f1601f.g()) {
            return;
        }
        AbstractC0110w i2 = this.f1600e.i();
        AbstractC0110w abstractC0110w = this.f1601f;
        T t = T.f1483c;
        t.getClass();
        t.a(i2.getClass()).a(i2, abstractC0110w);
        this.f1601f = i2;
    }

    public final Object clone() {
        AbstractC0108u abstractC0108u = (AbstractC0108u) this.f1600e.c(5);
        abstractC0108u.f1601f = b();
        return abstractC0108u;
    }
}
