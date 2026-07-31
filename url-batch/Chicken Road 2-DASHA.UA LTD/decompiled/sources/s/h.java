package s;

import D.AbstractC0009j;
import d0.l;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1249a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1250b;

    /* renamed from: c, reason: collision with root package name */
    public final C0093a f1251c;

    public h(Object obj, int i2, C0093a c0093a) {
        e0.h.e(obj, "value");
        AbstractC0009j.g("verificationMode", i2);
        this.f1249a = obj;
        this.f1250b = i2;
        this.f1251c = c0093a;
    }

    @Override // s.g
    public final Object a() {
        return this.f1249a;
    }

    @Override // s.g
    public final g d(String str, l lVar) {
        Object obj = this.f1249a;
        return ((Boolean) lVar.h(obj)).booleanValue() ? this : new f(obj, str, this.f1251c, this.f1250b);
    }
}
