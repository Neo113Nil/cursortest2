package d0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e1 implements f7.g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1926f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1927g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1928h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1929i;

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, int i7) {
        this.f1926f = i7;
        this.f1927g = obj;
        this.f1928h = obj2;
        this.f1929i = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Type inference failed for: r9v10, types: [j6.i, q6.e] */
    @Override // f7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, h6.d dVar) {
        f7.m mVar;
        Object obj2;
        int i7;
        e1 e1Var;
        switch (this.f1926f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p.h hVar = (p.h) obj;
                ArrayList arrayList = (ArrayList) this.f1927g;
                if (hVar instanceof p.f) {
                    arrayList.add(hVar);
                } else if (hVar instanceof p.g) {
                    arrayList.remove(((p.g) hVar).f6975a);
                } else if (hVar instanceof p.d) {
                    arrayList.add(hVar);
                } else if (hVar instanceof p.e) {
                    arrayList.remove(((p.e) hVar).f6974a);
                } else if (hVar instanceof p.l) {
                    arrayList.add(hVar);
                } else if (hVar instanceof p.m) {
                    arrayList.remove(((p.m) hVar).f6979a);
                } else if (hVar instanceof p.k) {
                    arrayList.remove(((p.k) hVar).f6977a);
                }
                c7.a0.p((c7.x) this.f1928h, null, null, new a0.e0((i1) this.f1929i, (p.h) e6.l.o0(arrayList), null, 7), 3);
                return d6.z.f2639a;
            case 1:
                if (dVar instanceof f7.m) {
                    mVar = (f7.m) dVar;
                    int i8 = mVar.f3515j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        mVar.f3515j = i8 - Integer.MIN_VALUE;
                        obj2 = mVar.f3513h;
                        i7 = mVar.f3515j;
                        d6.z zVar = d6.z.f2639a;
                        i6.a aVar = i6.a.f4956f;
                        if (i7 == 0) {
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    obj = mVar.f3512g;
                                    e1Var = mVar.f3511f;
                                    d6.a.e(obj2);
                                } else if (i7 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                            d6.a.e(obj2);
                            return zVar;
                        }
                        d6.a.e(obj2);
                        if (((r6.r) this.f1927g).f7964f) {
                            f7.g gVar = (f7.g) this.f1928h;
                            mVar.f3515j = 1;
                            if (gVar.k(obj, mVar) != aVar) {
                                return zVar;
                            }
                        } else {
                            ?? r9 = (j6.i) this.f1929i;
                            mVar.f3511f = this;
                            mVar.f3512g = obj;
                            mVar.f3515j = 2;
                            obj2 = r9.d(obj, mVar);
                            if (obj2 != aVar) {
                                e1Var = this;
                            }
                        }
                        return aVar;
                        if (!((Boolean) obj2).booleanValue()) {
                            return zVar;
                        }
                        ((r6.r) e1Var.f1927g).f7964f = true;
                        f7.g gVar2 = (f7.g) e1Var.f1928h;
                        mVar.f3511f = null;
                        mVar.f3512g = null;
                        mVar.f3515j = 3;
                        if (gVar2.k(obj, mVar) != aVar) {
                            return zVar;
                        }
                        return aVar;
                    }
                }
                mVar = new f7.m(this, dVar);
                obj2 = mVar.f3513h;
                i7 = mVar.f3515j;
                d6.z zVar2 = d6.z.f2639a;
                i6.a aVar2 = i6.a.f4956f;
                if (i7 == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            case 2:
                Object a3 = g7.c.a((h6.i) this.f1927g, obj, this.f1928h, (a0.e0) this.f1929i, dVar);
                return a3 == i6.a.f4956f ? a3 : d6.z.f2639a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                l.p1 p1Var = (l.p1) this.f1928h;
                ((g0.l1) this.f1927g).setValue(Boolean.valueOf(booleanValue ? ((Boolean) ((q6.e) ((g0.z0) this.f1929i).getValue()).d(p1Var.f5610a.a(), p1Var.f5613d.getValue())).booleanValue() : false));
                return d6.z.f2639a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e1(r6.r rVar, f7.g gVar, q6.e eVar) {
        this.f1926f = 1;
        this.f1927g = rVar;
        this.f1928h = gVar;
        this.f1929i = (j6.i) eVar;
    }

    public e1(f7.g gVar, h6.i iVar) {
        this.f1926f = 2;
        this.f1927g = iVar;
        this.f1928h = h7.a.k(iVar);
        this.f1929i = new a0.e0(gVar, (h6.d) null, 14);
    }
}
