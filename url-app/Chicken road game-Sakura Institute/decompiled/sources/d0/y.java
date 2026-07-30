package d0;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y implements f7.g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2528g;

    public /* synthetic */ y(int i7, Object obj) {
        this.f2527f = i7;
        this.f2528g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    @Override // f7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, h6.d dVar) {
        g3.r rVar;
        int i7;
        Object b9;
        switch (this.f2527f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p.h hVar = (p.h) obj;
                q0.q qVar = (q0.q) this.f2528g;
                if (hVar instanceof p.f) {
                    qVar.add(hVar);
                } else if (hVar instanceof p.g) {
                    qVar.remove(((p.g) hVar).f6975a);
                } else if (hVar instanceof p.d) {
                    qVar.add(hVar);
                } else if (hVar instanceof p.e) {
                    qVar.remove(((p.e) hVar).f6974a);
                } else if (hVar instanceof p.l) {
                    qVar.add(hVar);
                } else if (hVar instanceof p.m) {
                    qVar.remove(((p.m) hVar).f6979a);
                } else if (hVar instanceof p.k) {
                    qVar.remove(((p.k) hVar).f6977a);
                }
                return d6.z.f2639a;
            case 1:
                ((r6.v) this.f2528g).f7968f = obj;
                throw new g7.a(this);
            case 2:
                Object h3 = ((e7.q) ((e7.r) this.f2528g)).f2886i.h(dVar, obj);
                return h3 == i6.a.f4956f ? h3 : d6.z.f2639a;
            case 3:
                if (dVar instanceof g3.r) {
                    rVar = (g3.r) dVar;
                    int i8 = rVar.f4187g;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        rVar.f4187g = i8 - Integer.MIN_VALUE;
                        Object obj2 = rVar.f4186f;
                        i7 = rVar.f4187g;
                        if (i7 != 0) {
                            d6.a.e(obj2);
                            f7.g gVar = (f7.g) this.f2528g;
                            g3.i0 i0Var = (g3.i0) obj;
                            if (i0Var instanceof g3.d0) {
                                throw ((g3.d0) i0Var).f4111b;
                            }
                            if (!(i0Var instanceof g3.c)) {
                                if (i0Var instanceof g3.b0 ? true : i0Var instanceof g3.k0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new b4.c();
                            }
                            Object obj3 = ((g3.c) i0Var).f4101b;
                            rVar.f4187g = 1;
                            Object k8 = gVar.k(obj3, rVar);
                            i6.a aVar = i6.a.f4956f;
                            if (k8 == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d6.a.e(obj2);
                        }
                        return d6.z.f2639a;
                    }
                }
                rVar = new g3.r(this, dVar);
                Object obj22 = rVar.f4186f;
                i7 = rVar.f4187g;
                if (i7 != 0) {
                }
                return d6.z.f2639a;
            case 4:
                g3.a0 a0Var = (g3.a0) this.f2528g;
                return ((a0Var.f4095l.p() instanceof g3.b0) || (b9 = g3.a0.b(a0Var, true, dVar)) != i6.a.f4956f) ? d6.z.f2639a : b9;
            case 5:
                ((s1.s1) this.f2528g).f8416f.f(((Number) obj).floatValue());
                return d6.z.f2639a;
            default:
                y.p pVar = (y.p) this.f2528g;
                if (Build.VERSION.SDK_INT >= 34) {
                    y.g.f9716a.a(pVar.a(), pVar.f9723b);
                }
                return d6.z.f2639a;
        }
    }
}
