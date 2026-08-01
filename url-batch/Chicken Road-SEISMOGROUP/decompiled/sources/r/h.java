package r;

import E.AbstractC0008i;
import d0.l;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1247b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1248c;

    public h(Object obj, int i2, a aVar) {
        e0.h.e(obj, "value");
        AbstractC0008i.f("verificationMode", i2);
        this.f1246a = obj;
        this.f1247b = i2;
        this.f1248c = aVar;
    }

    @Override // r.g
    public final Object a() {
        return this.f1246a;
    }

    @Override // r.g
    public final g d(String str, l lVar) {
        Object obj = this.f1246a;
        return ((Boolean) lVar.h(obj)).booleanValue() ? this : new f(obj, str, this.f1248c, this.f1247b);
    }
}
