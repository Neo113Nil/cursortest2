package je;

import ge.c1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public a0 f5246d;

    /* renamed from: e, reason: collision with root package name */
    public f f5247e;

    /* renamed from: i, reason: collision with root package name */
    public c0 f5248i;

    /* renamed from: r, reason: collision with root package name */
    public c1 f5249r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5250s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a0 f5251t;

    /* renamed from: u, reason: collision with root package name */
    public int f5252u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, ld.a aVar) {
        super(aVar);
        this.f5251t = a0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f5250s = obj;
        this.f5252u |= Integer.MIN_VALUE;
        a0.k(this.f5251t, null, this);
        return md.a.f6622d;
    }
}
