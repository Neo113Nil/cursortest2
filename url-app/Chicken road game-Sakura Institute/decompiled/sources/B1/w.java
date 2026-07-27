package B1;

import w2.C1294c;

/* loaded from: classes.dex */
public final class w extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1027j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1294c f1028k;

    /* renamed from: l, reason: collision with root package name */
    public int f1029l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C1294c c1294c, E2.c cVar) {
        super(cVar);
        this.f1028k = c1294c;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f1027j = obj;
        this.f1029l |= Integer.MIN_VALUE;
        return this.f1028k.k(0L, this);
    }
}
