package g3;

import c7.m1;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4174g;

    /* renamed from: h, reason: collision with root package name */
    public int f4175h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4176i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f4177j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a0 a0Var, h6.d dVar, int i7) {
        super(2, dVar);
        this.f4174g = i7;
        this.f4177j = a0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f4174g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o oVar = new o(this.f4177j, dVar, 0);
                oVar.f4176i = obj;
                return oVar;
            default:
                o oVar2 = new o(this.f4177j, dVar, 1);
                oVar2.f4176i = obj;
                return oVar2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4174g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((o) create((e7.r) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                return ((o) create((c0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4174g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f4175h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    e7.r rVar = (e7.r) this.f4176i;
                    a0 a0Var = this.f4177j;
                    h6.d dVar = null;
                    m1 p6 = c7.a0.p(rVar, null, c7.y.f1757g, new n(a0Var, dVar, 0), 1);
                    f7.k kVar = new f7.k(new e0.e(new androidx.room.e(p6, dVar, 2), a0Var.f4093j), new c.d(p6, null, 1));
                    d0.y yVar = new d0.y(2, rVar);
                    this.f4175h = 1;
                    Object b9 = kVar.b(yVar, this);
                    i6.a aVar = i6.a.f4956f;
                    if (b9 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            default:
                int i8 = this.f4175h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    c0 c0Var = (c0) this.f4176i;
                    this.f4175h = 1;
                    Object a3 = a0.a(this.f4177j, c0Var, this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (a3 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
        }
    }
}
