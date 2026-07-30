package f7;

import com.android.installreferrer.api.InstallReferrerClient;
import g4.e1;
import g4.v0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends j6.i implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3529g;

    /* renamed from: h, reason: collision with root package name */
    public int f3530h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ g f3531i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f3532j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j6.i f3533k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h6.d dVar, v0 v0Var) {
        super(3, dVar);
        this.f3529g = 1;
        this.f3533k = v0Var;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        g gVar = (g) obj;
        switch (this.f3529g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p pVar = new p((androidx.lifecycle.g0) this.f3533k, (h6.d) obj3, 0);
                pVar.f3531i = gVar;
                pVar.f3532j = obj2;
                return pVar.invokeSuspend(d6.z.f2639a);
            case 1:
                p pVar2 = new p((h6.d) obj3, (v0) this.f3533k);
                pVar2.f3531i = gVar;
                pVar2.f3532j = (Object[]) obj2;
                return pVar2.invokeSuspend(d6.z.f2639a);
            default:
                p pVar3 = new p((e1) this.f3533k, (h6.d) obj3, 2);
                pVar3.f3531i = gVar;
                pVar3.f3532j = (Object[]) obj2;
                return pVar3.invokeSuspend(d6.z.f2639a);
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        g gVar;
        g gVar2;
        g gVar3;
        switch (this.f3529g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f3530h;
                i6.a aVar = i6.a.f4956f;
                if (i7 == 0) {
                    d6.a.e(obj);
                    gVar = this.f3531i;
                    Object obj2 = this.f3532j;
                    androidx.lifecycle.g0 g0Var = (androidx.lifecycle.g0) this.f3533k;
                    this.f3531i = gVar;
                    this.f3530h = 1;
                    obj = g0Var.d(obj2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        return d6.z.f2639a;
                    }
                    gVar = this.f3531i;
                    d6.a.e(obj);
                }
                this.f3531i = null;
                this.f3530h = 2;
                if (gVar.k(obj, this) == aVar) {
                    return aVar;
                }
                return d6.z.f2639a;
            case 1:
                int i8 = this.f3530h;
                i6.a aVar2 = i6.a.f4956f;
                if (i8 == 0) {
                    d6.a.e(obj);
                    gVar2 = this.f3531i;
                    Object[] objArr = (Object[]) this.f3532j;
                    v0 v0Var = (v0) this.f3533k;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    this.f3531i = gVar2;
                    this.f3530h = 1;
                    obj = v0Var.j(obj3, obj4, obj5, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        return d6.z.f2639a;
                    }
                    gVar2 = this.f3531i;
                    d6.a.e(obj);
                }
                this.f3531i = null;
                this.f3530h = 2;
                if (gVar2.k(obj, this) == aVar2) {
                    return aVar2;
                }
                return d6.z.f2639a;
            default:
                int i9 = this.f3530h;
                i6.a aVar3 = i6.a.f4956f;
                if (i9 == 0) {
                    d6.a.e(obj);
                    gVar3 = this.f3531i;
                    Object[] objArr2 = (Object[]) this.f3532j;
                    e1 e1Var = (e1) this.f3533k;
                    Object obj6 = objArr2[0];
                    Object obj7 = objArr2[1];
                    this.f3531i = gVar3;
                    this.f3530h = 1;
                    obj = e1Var.c(obj6, obj7, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        return d6.z.f2639a;
                    }
                    gVar3 = this.f3531i;
                    d6.a.e(obj);
                }
                this.f3531i = null;
                this.f3530h = 2;
                if (gVar3.k(obj, this) == aVar3) {
                    return aVar3;
                }
                return d6.z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(j6.i iVar, h6.d dVar, int i7) {
        super(3, dVar);
        this.f3529g = i7;
        this.f3533k = iVar;
    }
}
