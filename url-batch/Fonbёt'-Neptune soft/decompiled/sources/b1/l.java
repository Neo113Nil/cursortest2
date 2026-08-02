package b1;

import B0.C0038p;
import P.O;

/* loaded from: classes.dex */
public final class l extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1936h;

    /* renamed from: i, reason: collision with root package name */
    public int f1937i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O f1938j;

    /* renamed from: k, reason: collision with root package name */
    public C0038p f1939k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(O o2, H0.d dVar) {
        super(dVar);
        this.f1938j = o2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f1936h = obj;
        this.f1937i |= Integer.MIN_VALUE;
        return this.f1938j.k(null, this);
    }
}
