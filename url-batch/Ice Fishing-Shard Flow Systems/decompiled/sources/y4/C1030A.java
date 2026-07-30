package y4;

import P.C0154t;

/* renamed from: y4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030A extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8530d;

    /* renamed from: e, reason: collision with root package name */
    public int f8531e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0154t f8532i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1030A(C0154t c0154t, V5.b bVar) {
        super(bVar);
        this.f8532i = c0154t;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f8530d = obj;
        this.f8531e |= Integer.MIN_VALUE;
        return this.f8532i.a(null, this);
    }
}
