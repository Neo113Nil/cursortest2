package d2;

import l2.p;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0298a implements InterfaceC0303f {

    /* renamed from: a, reason: collision with root package name */
    public final g f4947a;

    public AbstractC0298a(g gVar) {
        this.f4947a = gVar;
    }

    @Override // d2.InterfaceC0303f
    public final g getKey() {
        return this.f4947a;
    }

    @Override // d2.h
    public InterfaceC0303f h(g gVar) {
        return android.support.v4.media.session.a.x(this, gVar);
    }

    @Override // d2.h
    public final h i(h hVar) {
        return android.support.v4.media.session.a.E(this, hVar);
    }

    @Override // d2.h
    public h k(g gVar) {
        return android.support.v4.media.session.a.D(this, gVar);
    }

    @Override // d2.h
    public final Object l(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }
}
