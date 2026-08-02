package A3;

import K.C0054c;
import K.M;
import K.X;
import K.Z;
import K.h0;
import K.i0;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class q implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f124b;

    public /* synthetic */ q(int i4, Object obj) {
        this.f123a = i4;
        this.f124b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // A3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC0425c interfaceC0425c) {
        K.r rVar;
        int i4;
        Object e4;
        switch (this.f123a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f124b).f14159a = obj;
                throw new B3.a(this);
            case 1:
                if (interfaceC0425c instanceof K.r) {
                    rVar = (K.r) interfaceC0425c;
                    int i5 = rVar.f1407b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rVar.f1407b = i5 - Integer.MIN_VALUE;
                        Object obj2 = rVar.f1406a;
                        EnumC0441a enumC0441a = EnumC0441a.f9038a;
                        i4 = rVar.f1407b;
                        if (i4 != 0) {
                            O3.l.w(obj2);
                            e eVar = (e) this.f124b;
                            h0 h0Var = (h0) obj;
                            if (h0Var instanceof Z) {
                                throw ((Z) h0Var).f1325b;
                            }
                            if (!(h0Var instanceof C0054c)) {
                                if (h0Var instanceof X ? true : h0Var instanceof i0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new G1.a();
                            }
                            Object obj3 = ((C0054c) h0Var).f1333b;
                            rVar.f1407b = 1;
                            if (eVar.emit(obj3, rVar) == enumC0441a) {
                                return enumC0441a;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            O3.l.w(obj2);
                        }
                        return C0297i.f5732a;
                    }
                }
                rVar = new K.r(this, (h3.c) interfaceC0425c);
                Object obj22 = rVar.f1406a;
                EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
                i4 = rVar.f1407b;
                if (i4 != 0) {
                }
                return C0297i.f5732a;
            case 2:
                M m4 = (M) this.f124b;
                return ((m4.f1280h.j() instanceof X) || (e4 = M.e(m4, true, (h3.c) interfaceC0425c)) != EnumC0441a.f9038a) ? C0297i.f5732a : e4;
            default:
                ((D.a) this.f124b).accept(obj);
                return C0297i.f5732a;
        }
    }
}
