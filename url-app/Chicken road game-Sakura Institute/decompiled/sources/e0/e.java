package e0;

import a0.l0;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.e1;
import d6.z;
import f7.a0;
import f7.m0;
import g4.v0;
import g7.v;
import r6.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements f7.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2678h;

    public /* synthetic */ e(Object obj, int i7, Object obj2) {
        this.f2676f = i7;
        this.f2677g = obj;
        this.f2678h = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e8  */
    @Override // f7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(f7.g gVar, h6.d dVar) {
        f7.l lVar;
        int i7;
        i6.a aVar;
        Throwable th;
        v vVar;
        e eVar;
        f7.g gVar2;
        f7.f fVar;
        f7.n nVar;
        int i8;
        l0 l0Var;
        switch (this.f2676f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object b9 = ((f7.f) this.f2677g).b(new l0(gVar, 3, (f) this.f2678h), dVar);
                return b9 == i6.a.f4956f ? b9 : z.f2639a;
            case 1:
                if (dVar instanceof f7.l) {
                    lVar = (f7.l) dVar;
                    int i9 = lVar.f3502g;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        lVar.f3502g = i9 - Integer.MIN_VALUE;
                        Object obj = lVar.f3501f;
                        i7 = lVar.f3502g;
                        z zVar = z.f2639a;
                        aVar = i6.a.f4956f;
                        if (i7 != 0) {
                            d6.a.e(obj);
                            v vVar2 = new v(gVar, lVar.getContext());
                            try {
                                androidx.room.e eVar2 = (androidx.room.e) this.f2678h;
                                lVar.f3504i = this;
                                lVar.f3505j = gVar;
                                lVar.f3506k = vVar2;
                                lVar.f3502g = 1;
                                eVar2.d(vVar2, lVar);
                                if (zVar != aVar) {
                                    eVar = this;
                                    gVar2 = gVar;
                                    vVar = vVar2;
                                }
                                return aVar;
                            } catch (Throwable th2) {
                                th = th2;
                                vVar = vVar2;
                                vVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d6.a.e(obj);
                            return zVar;
                        }
                        vVar = lVar.f3506k;
                        gVar2 = lVar.f3505j;
                        eVar = lVar.f3504i;
                        try {
                            d6.a.e(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            vVar.releaseIntercepted();
                            throw th;
                        }
                        vVar.releaseIntercepted();
                        fVar = (f7.f) eVar.f2677g;
                        lVar.f3504i = null;
                        lVar.f3505j = null;
                        lVar.f3506k = null;
                        lVar.f3502g = 2;
                        if (fVar.b(gVar2, lVar) != aVar) {
                            return zVar;
                        }
                        return aVar;
                    }
                }
                lVar = new f7.l(this, dVar);
                Object obj2 = lVar.f3501f;
                i7 = lVar.f3502g;
                z zVar2 = z.f2639a;
                aVar = i6.a.f4956f;
                if (i7 != 0) {
                }
                vVar.releaseIntercepted();
                fVar = (f7.f) eVar.f2677g;
                lVar.f3504i = null;
                lVar.f3505j = null;
                lVar.f3506k = null;
                lVar.f3502g = 2;
                if (fVar.b(gVar2, lVar) != aVar) {
                }
                return aVar;
            case 2:
                Object b10 = ((g7.k) this.f2677g).b(new e1(new r(), gVar, (m0) this.f2678h), dVar);
                return b10 == i6.a.f4956f ? b10 : z.f2639a;
            case 3:
                if (dVar instanceof f7.n) {
                    nVar = (f7.n) dVar;
                    int i10 = nVar.f3519g;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        nVar.f3519g = i10 - Integer.MIN_VALUE;
                        Object obj3 = nVar.f3518f;
                        i8 = nVar.f3519g;
                        if (i8 != 0) {
                            d6.a.e(obj3);
                            f7.f fVar2 = (f7.f) this.f2677g;
                            l0 l0Var2 = new l0((m0) this.f2678h, 5, gVar);
                            try {
                                nVar.f3521i = l0Var2;
                                nVar.f3519g = 1;
                                Object b11 = fVar2.b(l0Var2, nVar);
                                i6.a aVar2 = i6.a.f4956f;
                                if (b11 == aVar2) {
                                    return aVar2;
                                }
                            } catch (g7.a e9) {
                                e = e9;
                                l0Var = l0Var2;
                                if (e.f4475f != l0Var) {
                                }
                                return z.f2639a;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l0Var = nVar.f3521i;
                            try {
                                d6.a.e(obj3);
                            } catch (g7.a e10) {
                                e = e10;
                                if (e.f4475f != l0Var) {
                                    throw e;
                                }
                                return z.f2639a;
                            }
                        }
                        return z.f2639a;
                    }
                }
                nVar = new f7.n(this, dVar);
                Object obj32 = nVar.f3518f;
                i8 = nVar.f3519g;
                if (i8 != 0) {
                }
                return z.f2639a;
            default:
                g7.p pVar = new g7.p((f7.f[]) this.f2677g, new f7.p(null, (v0) this.f2678h), gVar, null);
                g7.r rVar = new g7.r(dVar, dVar.getContext());
                Object n02 = j1.c.n0(rVar, rVar, pVar);
                z zVar3 = z.f2639a;
                i6.a aVar3 = i6.a.f4956f;
                if (n02 != aVar3) {
                    n02 = zVar3;
                }
                return n02 == aVar3 ? n02 : zVar3;
        }
    }

    public e(androidx.room.e eVar, a0 a0Var) {
        this.f2676f = 1;
        this.f2678h = eVar;
        this.f2677g = a0Var;
    }
}
