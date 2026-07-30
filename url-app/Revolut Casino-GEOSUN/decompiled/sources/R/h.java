package R;

import E0.l;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f883b;

    /* renamed from: c, reason: collision with root package name */
    public final a f884c;

    public h(Object obj, int i2, a aVar) {
        F0.i.e(obj, "value");
        F0.h.i("verificationMode", i2);
        this.f882a = obj;
        this.f883b = i2;
        this.f884c = aVar;
    }

    @Override // R.g
    public final Object a() {
        return this.f882a;
    }

    @Override // R.g
    public final g d(String str, l lVar) {
        Object obj = this.f882a;
        return ((Boolean) lVar.i(obj)).booleanValue() ? this : new f(obj, str, this.f884c, this.f883b);
    }
}
