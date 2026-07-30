package q6;

import y4.C1046o;

/* loaded from: classes.dex */
public final class m extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7393d;

    /* renamed from: e, reason: collision with root package name */
    public int f7394e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P0.l f7395i;

    /* renamed from: l, reason: collision with root package name */
    public C1046o f7396l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(P0.l lVar, V5.b bVar) {
        super(bVar);
        this.f7395i = lVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f7393d = obj;
        this.f7394e |= Integer.MIN_VALUE;
        return this.f7395i.e(null, this);
    }
}
