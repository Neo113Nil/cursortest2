package x0;

import B0.p;

/* loaded from: classes.dex */
public final class i extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public p f11434j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11435k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f11436l;

    /* renamed from: m, reason: collision with root package name */
    public int f11437m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, E2.c cVar) {
        super(cVar);
        this.f11436l = pVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f11435k = obj;
        this.f11437m |= Integer.MIN_VALUE;
        return this.f11436l.b(0.0f, this);
    }
}
