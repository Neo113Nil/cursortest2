package q6;

import i.C0511M;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836a extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public r6.t f7352d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7353e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0511M f7354i;

    /* renamed from: l, reason: collision with root package name */
    public int f7355l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0836a(C0511M c0511m, V5.b bVar) {
        super(bVar);
        this.f7354i = c0511m;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f7353e = obj;
        this.f7355l |= Integer.MIN_VALUE;
        return this.f7354i.e(null, this);
    }
}
