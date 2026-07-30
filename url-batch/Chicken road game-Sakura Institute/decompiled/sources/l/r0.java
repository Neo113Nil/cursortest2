package l;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 extends j6.i implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5625g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f5626h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x0 f5627i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5628j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p1 f5629k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x0 x0Var, Object obj, p1 p1Var, h6.d dVar) {
        super(1, dVar);
        this.f5627i = x0Var;
        this.f5628j = obj;
        this.f5629k = p1Var;
    }

    @Override // j6.a
    public final h6.d create(h6.d dVar) {
        switch (this.f5625g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new r0(this.f5629k, this.f5627i, this.f5628j, dVar);
            default:
                return new r0(this.f5627i, this.f5628j, this.f5629k, dVar);
        }
    }

    @Override // q6.c
    public final Object f(Object obj) {
        h6.d dVar = (h6.d) obj;
        switch (this.f5625g) {
        }
        return ((r0) create(dVar)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5625g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f5626h;
                p1 p1Var = this.f5629k;
                if (i7 == 0) {
                    d6.a.e(obj);
                    androidx.room.d dVar = new androidx.room.d(this.f5627i, this.f5628j, p1Var, (h6.d) null);
                    this.f5626h = 1;
                    Object d8 = c7.a0.d(dVar, this);
                    i6.a aVar = i6.a.f4956f;
                    if (d8 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                p1Var.i();
                return d6.z.f2639a;
            default:
                int i8 = this.f5626h;
                p1 p1Var2 = this.f5629k;
                if (i8 == 0) {
                    d6.a.e(obj);
                    x0 x0Var = this.f5627i;
                    x0Var.l();
                    g0.g1 g1Var = x0Var.f5706b;
                    x0Var.f5716l = Long.MIN_VALUE;
                    x0Var.o(0.0f);
                    Object value = x0Var.f5707c.getValue();
                    Object obj2 = this.f5628j;
                    float f9 = obj2.equals(value) ? -4.0f : obj2.equals(g1Var.getValue()) ? -5.0f : -3.0f;
                    p1Var2.q(obj2);
                    p1Var2.o(0L);
                    g1Var.setValue(obj2);
                    x0Var.o(0.0f);
                    x0Var.c(obj2);
                    p1Var2.j(f9);
                    if (f9 == -3.0f) {
                        this.f5626h = 1;
                        Object j8 = x0.j(x0Var, this);
                        i6.a aVar2 = i6.a.f4956f;
                        if (j8 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                p1Var2.i();
                return d6.z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p1 p1Var, x0 x0Var, Object obj, h6.d dVar) {
        super(1, dVar);
        this.f5629k = p1Var;
        this.f5627i = x0Var;
        this.f5628j = obj;
    }
}
