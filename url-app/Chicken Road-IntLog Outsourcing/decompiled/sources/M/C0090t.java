package M;

import java.util.Set;
import k4.InterfaceC1218d;
import l4.EnumC1260a;

/* renamed from: M.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090t implements G4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G4.e f1751b;

    public /* synthetic */ C0090t(G4.e eVar, int i2) {
        this.f1750a = i2;
        this.f1751b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // G4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, InterfaceC1218d interfaceC1218d) {
        C0089s c0089s;
        int i2;
        N2.x xVar;
        int i3;
        switch (this.f1750a) {
            case 0:
                if (interfaceC1218d instanceof C0089s) {
                    c0089s = (C0089s) interfaceC1218d;
                    int i6 = c0089s.f1748b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0089s.f1748b = i6 - Integer.MIN_VALUE;
                        Object obj2 = c0089s.f1747a;
                        EnumC1260a enumC1260a = EnumC1260a.f11058a;
                        i2 = c0089s.f1748b;
                        if (i2 != 0) {
                            e5.g.y(obj2);
                            k0 k0Var = (k0) obj;
                            if (k0Var instanceof d0) {
                                throw ((d0) k0Var).f1669b;
                            }
                            if (!(k0Var instanceof C0075d)) {
                                if (k0Var instanceof b0 ? true : k0Var instanceof l0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new C1.b();
                            }
                            Object obj3 = ((C0075d) k0Var).f1667b;
                            c0089s.f1748b = 1;
                            if (this.f1751b.b(obj3, c0089s) == enumC1260a) {
                                return enumC1260a;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e5.g.y(obj2);
                        }
                        return f4.v.f5689a;
                    }
                }
                c0089s = new C0089s(this, interfaceC1218d);
                Object obj22 = c0089s.f1747a;
                EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
                i2 = c0089s.f1748b;
                if (i2 != 0) {
                }
                return f4.v.f5689a;
            default:
                if (interfaceC1218d instanceof N2.x) {
                    xVar = (N2.x) interfaceC1218d;
                    int i7 = xVar.f2149b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        xVar.f2149b = i7 - Integer.MIN_VALUE;
                        Object obj4 = xVar.f2148a;
                        EnumC1260a enumC1260a3 = EnumC1260a.f11058a;
                        i3 = xVar.f2149b;
                        if (i3 != 0) {
                            e5.g.y(obj4);
                            Set keySet = ((P.b) obj).a().keySet();
                            xVar.f2149b = 1;
                            if (this.f1751b.b(keySet, xVar) == enumC1260a3) {
                                return enumC1260a3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e5.g.y(obj4);
                        }
                        return f4.v.f5689a;
                    }
                }
                xVar = new N2.x(this, interfaceC1218d);
                Object obj42 = xVar.f2148a;
                EnumC1260a enumC1260a32 = EnumC1260a.f11058a;
                i3 = xVar.f2149b;
                if (i3 != 0) {
                }
                return f4.v.f5689a;
        }
    }
}
