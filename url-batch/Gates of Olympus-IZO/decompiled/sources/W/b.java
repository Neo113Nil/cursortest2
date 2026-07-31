package W;

import m2.C0628c;

/* loaded from: classes.dex */
public final class b extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public c f3368d;

    /* renamed from: e, reason: collision with root package name */
    public C0628c f3369e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f3371g;

    /* renamed from: h, reason: collision with root package name */
    public int f3372h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, R1.c cVar2) {
        super(cVar2);
        this.f3371g = cVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f3370f = obj;
        this.f3372h |= Integer.MIN_VALUE;
        return this.f3371g.c(this);
    }
}
