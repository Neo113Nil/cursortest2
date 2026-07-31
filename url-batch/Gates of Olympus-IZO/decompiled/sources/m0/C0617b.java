package m0;

import D1.C0014b;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617b extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0014b f5898e;

    /* renamed from: f, reason: collision with root package name */
    public int f5899f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0617b(C0014b c0014b, R1.c cVar) {
        super(cVar);
        this.f5898e = c0014b;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f5897d = obj;
        this.f5899f |= Integer.MIN_VALUE;
        return this.f5898e.e(0L, this);
    }
}
