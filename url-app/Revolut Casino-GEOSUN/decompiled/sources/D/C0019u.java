package D;

import java.util.Set;
import u0.C0247g;

/* renamed from: D.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019u implements P0.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P0.e f267f;

    public /* synthetic */ C0019u(P0.e eVar, int i2) {
        this.f266e = i2;
        this.f267f = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // P0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, w0.d dVar) {
        C0018t c0018t;
        int i2;
        s0.z zVar;
        int i3;
        switch (this.f266e) {
            case 0:
                if (dVar instanceof C0018t) {
                    c0018t = (C0018t) dVar;
                    int i4 = c0018t.f264i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0018t.f264i = i4 - Integer.MIN_VALUE;
                        Object obj2 = c0018t.f263h;
                        x0.a aVar = x0.a.f3094e;
                        i2 = c0018t.f264i;
                        if (i2 != 0) {
                            o.g.z(obj2);
                            m0 m0Var = (m0) obj;
                            if (m0Var instanceof f0) {
                                throw ((f0) m0Var).f189b;
                            }
                            if (!(m0Var instanceof C0003d)) {
                                if (m0Var instanceof d0 ? true : m0Var instanceof n0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new M.c();
                            }
                            Object obj3 = ((C0003d) m0Var).f175b;
                            c0018t.f264i = 1;
                            if (this.f267f.a(obj3, c0018t) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj2);
                        }
                        return C0247g.f3005a;
                    }
                }
                c0018t = new C0018t(this, dVar);
                Object obj22 = c0018t.f263h;
                x0.a aVar2 = x0.a.f3094e;
                i2 = c0018t.f264i;
                if (i2 != 0) {
                }
                return C0247g.f3005a;
            default:
                if (dVar instanceof s0.z) {
                    zVar = (s0.z) dVar;
                    int i5 = zVar.f2962i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        zVar.f2962i = i5 - Integer.MIN_VALUE;
                        Object obj4 = zVar.f2961h;
                        x0.a aVar3 = x0.a.f3094e;
                        i3 = zVar.f2962i;
                        if (i3 != 0) {
                            o.g.z(obj4);
                            Set keySet = ((G.b) obj).a().keySet();
                            zVar.f2962i = 1;
                            if (this.f267f.a(keySet, zVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj4);
                        }
                        return C0247g.f3005a;
                    }
                }
                zVar = new s0.z(this, dVar);
                Object obj42 = zVar.f2961h;
                x0.a aVar32 = x0.a.f3094e;
                i3 = zVar.f2962i;
                if (i3 != 0) {
                }
                return C0247g.f3005a;
        }
    }
}
