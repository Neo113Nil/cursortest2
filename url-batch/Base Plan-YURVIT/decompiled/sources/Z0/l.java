package Z0;

import B0.C0015p;
import N.P;

/* loaded from: classes.dex */
public final class l extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1108h;

    /* renamed from: i, reason: collision with root package name */
    public int f1109i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f1110j;

    /* renamed from: k, reason: collision with root package name */
    public C0015p f1111k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(P p2, G0.d dVar) {
        super(dVar);
        this.f1110j = p2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f1108h = obj;
        this.f1109i |= Integer.MIN_VALUE;
        return this.f1110j.m(null, this);
    }
}
