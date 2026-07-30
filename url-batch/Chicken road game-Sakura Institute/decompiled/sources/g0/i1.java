package g0;

import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i1 implements u0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3751f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3752g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3753h;

    public i1(Choreographer choreographer, s1.t0 t0Var) {
        this.f3751f = 1;
        this.f3752g = choreographer;
        this.f3753h = t0Var;
    }

    @Override // h6.i
    public final Object D(Object obj, q6.e eVar) {
        switch (this.f3751f) {
        }
        return eVar.d(obj, this);
    }

    @Override // h6.i
    public final h6.i F(h6.h hVar) {
        switch (this.f3751f) {
        }
        return t6.a.G(this, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    @Override // g0.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(q6.c cVar, h6.d dVar) {
        h1 h1Var;
        i6.a aVar;
        int i7;
        boolean z8;
        Object q8;
        i1 i1Var;
        Object t2;
        switch (this.f3751f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (dVar instanceof h1) {
                    h1Var = (h1) dVar;
                    int i8 = h1Var.f3742j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        h1Var.f3742j = i8 - Integer.MIN_VALUE;
                        Object obj = h1Var.f3740h;
                        aVar = i6.a.f4956f;
                        i7 = h1Var.f3742j;
                        if (i7 != 0) {
                            d6.a.e(obj);
                            androidx.room.m mVar = (androidx.room.m) this.f3753h;
                            h1Var.f3738f = this;
                            h1Var.f3739g = cVar;
                            h1Var.f3742j = 1;
                            synchronized (mVar.f1094b) {
                                z8 = mVar.f1093a;
                            }
                            if (z8) {
                                q8 = d6.z.f2639a;
                            } else {
                                c7.h hVar = new c7.h(1, a8.m.A(h1Var));
                                hVar.r();
                                synchronized (mVar.f1094b) {
                                    ((ArrayList) mVar.f1095c).add(hVar);
                                }
                                hVar.t(new a0.y(mVar, 8, hVar));
                                q8 = hVar.q();
                                if (q8 != aVar) {
                                    q8 = d6.z.f2639a;
                                }
                            }
                            if (q8 != aVar) {
                                i1Var = this;
                            }
                            return aVar;
                        }
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d6.a.e(obj);
                            return obj;
                        }
                        cVar = h1Var.f3739g;
                        i1Var = h1Var.f3738f;
                        d6.a.e(obj);
                        u0 u0Var = (u0) i1Var.f3752g;
                        h1Var.f3738f = null;
                        h1Var.f3739g = null;
                        h1Var.f3742j = 2;
                        t2 = u0Var.t(cVar, h1Var);
                        if (t2 != aVar) {
                            return t2;
                        }
                        return aVar;
                    }
                }
                h1Var = new h1(this, dVar);
                Object obj2 = h1Var.f3740h;
                aVar = i6.a.f4956f;
                i7 = h1Var.f3742j;
                if (i7 != 0) {
                }
                u0 u0Var2 = (u0) i1Var.f3752g;
                h1Var.f3738f = null;
                h1Var.f3739g = null;
                h1Var.f3742j = 2;
                t2 = u0Var2.t(cVar, h1Var);
                if (t2 != aVar) {
                }
                return aVar;
            default:
                s1.t0 t0Var = (s1.t0) this.f3753h;
                c7.h hVar2 = new c7.h(1, a8.m.A(dVar));
                hVar2.r();
                b0 b0Var = new b0(hVar2, this, cVar);
                if (r6.k.a(t0Var.f8422h, (Choreographer) this.f3752g)) {
                    synchronized (t0Var.f8424j) {
                        t0Var.f8426l.add(b0Var);
                        if (!t0Var.f8429o) {
                            t0Var.f8429o = true;
                            t0Var.f8422h.postFrameCallback(t0Var.f8430p);
                        }
                    }
                    hVar2.t(new q.t0(t0Var, 6, b0Var));
                } else {
                    ((Choreographer) this.f3752g).postFrameCallback(b0Var);
                    hVar2.t(new q.t0(this, 7, b0Var));
                }
                return hVar2.q();
        }
    }

    @Override // h6.i
    public final h6.g u(h6.h hVar) {
        switch (this.f3751f) {
        }
        return t6.a.B(this, hVar);
    }

    @Override // h6.i
    public final h6.i z(h6.i iVar) {
        switch (this.f3751f) {
        }
        return t6.a.I(this, iVar);
    }

    public i1(u0 u0Var) {
        this.f3751f = 0;
        this.f3752g = u0Var;
        this.f3753h = new androidx.room.m();
    }
}
