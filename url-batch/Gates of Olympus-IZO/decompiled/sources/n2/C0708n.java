package n2;

import E.C0025g;

/* renamed from: n2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708n extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6363d;

    /* renamed from: e, reason: collision with root package name */
    public int f6364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G.d f6365f;

    /* renamed from: g, reason: collision with root package name */
    public C0025g f6366g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0708n(G.d dVar, P1.d dVar2) {
        super(dVar2);
        this.f6365f = dVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6363d = obj;
        this.f6364e |= Integer.MIN_VALUE;
        return this.f6365f.collect(null, this);
    }
}
