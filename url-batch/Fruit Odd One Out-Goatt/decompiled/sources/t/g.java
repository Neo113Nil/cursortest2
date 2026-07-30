package t;

import c1.l;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class g extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public final Object f1162f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1163g;

    /* renamed from: h, reason: collision with root package name */
    public final a f1164h;

    public g(Object obj, int i2, a aVar) {
        obj.getClass();
        if (i2 == 0) {
            throw null;
        }
        this.f1162f = obj;
        this.f1163g = i2;
        this.f1164h = aVar;
    }

    @Override // a.a
    public final Object g() {
        return this.f1162f;
    }

    @Override // a.a
    public final a.a x(String str, l lVar) {
        Object obj = this.f1162f;
        return ((Boolean) lVar.h(obj)).booleanValue() ? this : new f(obj, str, this.f1164h, this.f1163g);
    }
}
