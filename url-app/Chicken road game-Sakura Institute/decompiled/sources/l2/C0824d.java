package l2;

import A.AbstractC0017m;
import b2.C0519c;
import g2.w;
import o2.m;
import y.t;

/* renamed from: l2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final w f7972a;

    /* renamed from: b, reason: collision with root package name */
    public final t f7973b;

    public C0824d(w wVar, t tVar) {
        this.f7972a = wVar;
        this.f7973b = tVar;
    }

    @Override // l2.e
    public final void a() {
        w wVar = this.f7972a;
        if (wVar.f6764a.get()) {
            return;
        }
        wVar.f6768e.c(this.f7973b);
    }

    @Override // l2.e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        t tVar = this.f7973b;
        sb.append(((C0519c) tVar.f11495i).f5634b);
        sb.append(": ");
        sb.append(AbstractC0017m.v(5));
        sb.append(": ");
        sb.append(((m) tVar.f11494e).f8941d.t(true));
        return sb.toString();
    }
}
