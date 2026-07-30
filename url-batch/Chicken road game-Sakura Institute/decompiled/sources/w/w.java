package w;

import a0.e1;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9448g;

    /* renamed from: h, reason: collision with root package name */
    public int f9449h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l1.d0 f9450i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n0 f9451j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(l1.d0 d0Var, n0 n0Var, h6.d dVar, int i7) {
        super(2, dVar);
        this.f9448g = i7;
        this.f9450i = d0Var;
        this.f9451j = n0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f9448g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new w(this.f9450i, this.f9451j, dVar, 0);
            case 1:
                return new w(this.f9450i, this.f9451j, dVar, 1);
            default:
                return new w(this.f9450i, this.f9451j, dVar, 2);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f9448g) {
        }
        return ((w) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f9448g;
        n0 n0Var = this.f9451j;
        l1.d0 d0Var = this.f9450i;
        i6.a aVar = i6.a.f4956f;
        d6.z zVar = d6.z.f2639a;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i8 = this.f9449h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    this.f9449h = 1;
                    Object d8 = c7.a0.d(new u3.l(d0Var, n0Var, null), this);
                    if (d8 != aVar) {
                        d8 = zVar;
                    }
                    if (d8 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return zVar;
            case 1:
                int i9 = this.f9449h;
                if (i9 == 0) {
                    d6.a.e(obj);
                    this.f9449h = 1;
                    Object r8 = t6.a.r(d0Var, new o.i0(n0Var, null), this);
                    if (r8 != aVar) {
                        r8 = zVar;
                    }
                    if (r8 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return zVar;
            default:
                int i10 = this.f9449h;
                if (i10 == 0) {
                    d6.a.e(obj);
                    this.f9449h = 1;
                    a0.c0 c0Var = new a0.c0(n0Var, 1);
                    k0 k0Var = new k0(n0Var, 0);
                    k0 k0Var2 = new k0(n0Var, 1);
                    a2.a aVar2 = new a2.a(20, n0Var);
                    float f9 = o.y.f6798a;
                    e1 e1Var = new e1(2, c0Var);
                    c1.a aVar3 = new c1.a(20, k0Var);
                    Object r9 = t6.a.r(d0Var, new o.w(o.v.f6763g, new r6.u(), null, e1Var, aVar2, k0Var2, aVar3, null), this);
                    if (r9 != aVar) {
                        r9 = zVar;
                    }
                    if (r9 != aVar) {
                        r9 = zVar;
                    }
                    if (r9 != aVar) {
                        r9 = zVar;
                    }
                    if (r9 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return zVar;
        }
    }
}
