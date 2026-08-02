package X;

import P0.l;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1134a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1135b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1136c;

    public h(Object obj, int i2, a aVar) {
        Q0.h.e(obj, "value");
        A0.b.i("verificationMode", i2);
        this.f1134a = obj;
        this.f1135b = i2;
        this.f1136c = aVar;
    }

    @Override // X.g
    public final Object a() {
        return this.f1134a;
    }

    @Override // X.g
    public final g d(String str, l lVar) {
        Object obj = this.f1134a;
        return ((Boolean) lVar.i(obj)).booleanValue() ? this : new f(obj, str, this.f1136c, this.f1135b);
    }
}
