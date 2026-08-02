package B0;

import I.C0069d;
import I.C0084t;
import I.b0;
import I.d0;
import I.k0;
import I.l0;
import java.util.Set;

/* loaded from: classes.dex */
public final class D implements b1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f90e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1.e f91f;

    public /* synthetic */ D(b1.e eVar, int i2) {
        this.f90e = i2;
        this.f91f = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    @Override // b1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, H0.d dVar) {
        C c2;
        int i2;
        C0084t c0084t;
        int i3;
        switch (this.f90e) {
            case 0:
                if (dVar instanceof C) {
                    c2 = (C) dVar;
                    int i4 = c2.f88i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c2.f88i = i4 - Integer.MIN_VALUE;
                        Object obj2 = c2.f87h;
                        I0.a aVar = I0.a.f733e;
                        i2 = c2.f88i;
                        if (i2 != 0) {
                            i1.a.G(obj2);
                            Set keySet = ((L.b) obj).a().keySet();
                            c2.f88i = 1;
                            if (this.f91f.a(keySet, c2) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i1.a.G(obj2);
                        }
                        return F0.h.f469a;
                    }
                }
                c2 = new C(this, dVar);
                Object obj22 = c2.f87h;
                I0.a aVar2 = I0.a.f733e;
                i2 = c2.f88i;
                if (i2 != 0) {
                }
                return F0.h.f469a;
            default:
                if (dVar instanceof C0084t) {
                    c0084t = (C0084t) dVar;
                    int i5 = c0084t.f707i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0084t.f707i = i5 - Integer.MIN_VALUE;
                        Object obj3 = c0084t.f706h;
                        I0.a aVar3 = I0.a.f733e;
                        i3 = c0084t.f707i;
                        if (i3 != 0) {
                            i1.a.G(obj3);
                            k0 k0Var = (k0) obj;
                            if (k0Var instanceof d0) {
                                throw ((d0) k0Var).f625b;
                            }
                            if (!(k0Var instanceof C0069d)) {
                                if (k0Var instanceof b0 ? true : k0Var instanceof l0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new F0.b();
                            }
                            Object obj4 = ((C0069d) k0Var).f623b;
                            c0084t.f707i = 1;
                            if (this.f91f.a(obj4, c0084t) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i1.a.G(obj3);
                        }
                        return F0.h.f469a;
                    }
                }
                c0084t = new C0084t(this, dVar);
                Object obj32 = c0084t.f706h;
                I0.a aVar32 = I0.a.f733e;
                i3 = c0084t.f707i;
                if (i3 != 0) {
                }
                return F0.h.f469a;
        }
    }
}
