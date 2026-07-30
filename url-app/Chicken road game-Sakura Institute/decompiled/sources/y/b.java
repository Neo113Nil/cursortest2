package y;

import androidx.lifecycle.g0;
import c7.a0;
import c7.x0;
import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import f7.e0;
import g0.v0;
import s1.x1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9704g;

    /* renamed from: h, reason: collision with root package name */
    public int f9705h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9706i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f9707j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, h6.d dVar, int i7) {
        super(2, dVar);
        this.f9704g = i7;
        this.f9706i = obj;
        this.f9707j = obj2;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f9704g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new b((d) this.f9706i, (p) this.f9707j, dVar, 0);
            case 1:
                return new b((x0) this.f9706i, (j) this.f9707j, dVar, 1);
            default:
                return new b((q) this.f9706i, (g0) this.f9707j, dVar, 2);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f9704g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                ((b) create(xVar, dVar)).invokeSuspend(z.f2639a);
                break;
            default:
                ((b) create(xVar, dVar)).invokeSuspend(z.f2639a);
                break;
        }
        return i6.a.f4956f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (c7.a0.e(500, r9) != r8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r10 == r8) goto L40;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:20:0x0077). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.f9704g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f9705h;
                i6.a aVar = i6.a.f4956f;
                if (i7 == 0) {
                    d6.a.e(obj);
                    a aVar2 = a.f9700h;
                    this.f9705h = 1;
                    if (g0.d.E(getContext()).t(new v0(aVar2, 0), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        throw new b4.c();
                    }
                    d6.a.e(obj);
                }
                f7.w i8 = ((d) this.f9706i).i();
                if (i8 == null) {
                    return z.f2639a;
                }
                d0.y yVar = new d0.y(6, (p) this.f9707j);
                this.f9705h = 2;
                e0.m((e0) i8, yVar, this);
                return aVar;
            case 1:
                j jVar = (j) this.f9707j;
                int i9 = this.f9705h;
                i6.a aVar3 = i6.a.f4956f;
                try {
                    if (i9 == 0) {
                        d6.a.e(obj);
                        x0 x0Var = (x0) this.f9706i;
                        if (x0Var != null) {
                            this.f9705h = 1;
                            x0Var.c(null);
                            Object N = x0Var.N(this);
                            if (N != aVar3) {
                                N = z.f2639a;
                                break;
                            }
                        }
                    } else if (i9 == 1) {
                        d6.a.e(obj);
                    } else if (i9 == 2) {
                        d6.a.e(obj);
                        jVar.f9718b.f(0.0f);
                        this.f9705h = 3;
                        break;
                    } else {
                        if (i9 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                    }
                    jVar.f9718b.f(1.0f);
                    this.f9705h = 2;
                    if (a0.e(500L, this) == aVar3) {
                        return aVar3;
                    }
                    jVar.f9718b.f(0.0f);
                    this.f9705h = 3;
                } catch (Throwable th) {
                    jVar.f9718b.f(0.0f);
                    throw th;
                }
                break;
            default:
                int i10 = this.f9705h;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    throw new b4.c();
                }
                d6.a.e(obj);
                q qVar = (q) this.f9706i;
                g0 g0Var = (g0) this.f9707j;
                this.f9705h = 1;
                x1.a(qVar, g0Var, this);
                return i6.a.f4956f;
        }
    }
}
