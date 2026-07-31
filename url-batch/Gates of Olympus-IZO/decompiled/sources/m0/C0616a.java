package m0;

import D1.C0014b;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616a extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0014b f5895e;

    /* renamed from: f, reason: collision with root package name */
    public int f5896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0616a(C0014b c0014b, R1.c cVar) {
        super(cVar);
        this.f5895e = c0014b;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f5894d = obj;
        this.f5896f |= Integer.MIN_VALUE;
        return this.f5895e.d(0L, 0L, this);
    }
}
