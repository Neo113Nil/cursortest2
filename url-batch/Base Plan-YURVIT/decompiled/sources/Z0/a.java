package Z0;

import B0.E;

/* loaded from: classes.dex */
public final class a extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public a1.n f1071h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1072i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E f1073j;

    /* renamed from: k, reason: collision with root package name */
    public int f1074k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(E e2, G0.d dVar) {
        super(dVar);
        this.f1073j = e2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f1072i = obj;
        this.f1074k |= Integer.MIN_VALUE;
        return this.f1073j.m(null, this);
    }
}
