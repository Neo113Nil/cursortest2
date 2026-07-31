package e1;

import java.io.Serializable;

/* renamed from: e1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339B extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f4589d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4590e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f4591f;

    /* renamed from: g, reason: collision with root package name */
    public Z1.t f4592g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4593h;

    /* renamed from: i, reason: collision with root package name */
    public int f4594i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4595j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0351N f4596k;

    /* renamed from: l, reason: collision with root package name */
    public int f4597l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0339B(C0351N c0351n, R1.c cVar) {
        super(cVar);
        this.f4596k = c0351n;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4595j = obj;
        this.f4597l |= Integer.MIN_VALUE;
        return C0351N.c(this.f4596k, false, this);
    }
}
