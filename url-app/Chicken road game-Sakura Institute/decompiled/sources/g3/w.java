package g3;

import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public Object f4209f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4210g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f4211h;

    /* renamed from: i, reason: collision with root package name */
    public r6.v f4212i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4213j;

    /* renamed from: k, reason: collision with root package name */
    public int f4214k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4215l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f4216m;

    /* renamed from: n, reason: collision with root package name */
    public int f4217n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, j6.c cVar) {
        super(cVar);
        this.f4216m = a0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4215l = obj;
        this.f4217n |= Integer.MIN_VALUE;
        return a0.c(this.f4216m, false, this);
    }
}
