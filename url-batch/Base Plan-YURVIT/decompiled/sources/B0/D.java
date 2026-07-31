package B0;

import F.C0022d;
import F.C0037t;
import F.b0;
import F.d0;
import F.l0;
import F.m0;
import a.AbstractC0086a;
import java.util.Set;

/* loaded from: classes.dex */
public final class D implements Z0.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z0.e f18f;

    public /* synthetic */ D(Z0.e eVar, int i2) {
        this.f17e = i2;
        this.f18f = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    @Override // Z0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, I0.b bVar) {
        C c2;
        int i2;
        C0037t c0037t;
        int i3;
        switch (this.f17e) {
            case 0:
                if (bVar instanceof C) {
                    c2 = (C) bVar;
                    int i4 = c2.f15i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c2.f15i = i4 - Integer.MIN_VALUE;
                        Object obj2 = c2.f14h;
                        i2 = c2.f15i;
                        if (i2 != 0) {
                            AbstractC0086a.I(obj2);
                            Set keySet = ((I.b) obj).a().keySet();
                            c2.f15i = 1;
                            Object a2 = this.f18f.a(keySet, c2);
                            H0.a aVar = H0.a.f511e;
                            if (a2 == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0086a.I(obj2);
                        }
                        return D0.h.f206a;
                    }
                }
                c2 = new C(this, bVar);
                Object obj22 = c2.f14h;
                i2 = c2.f15i;
                if (i2 != 0) {
                }
                return D0.h.f206a;
            default:
                if (bVar instanceof C0037t) {
                    c0037t = (C0037t) bVar;
                    int i5 = c0037t.f428i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0037t.f428i = i5 - Integer.MIN_VALUE;
                        Object obj3 = c0037t.f427h;
                        i3 = c0037t.f428i;
                        if (i3 != 0) {
                            AbstractC0086a.I(obj3);
                            l0 l0Var = (l0) obj;
                            if (l0Var instanceof d0) {
                                throw ((d0) l0Var).f344b;
                            }
                            if (!(l0Var instanceof C0022d)) {
                                if (l0Var instanceof b0 ? true : l0Var instanceof m0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new D0.b();
                            }
                            Object obj4 = ((C0022d) l0Var).f342b;
                            c0037t.f428i = 1;
                            Object a3 = this.f18f.a(obj4, c0037t);
                            H0.a aVar2 = H0.a.f511e;
                            if (a3 == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0086a.I(obj3);
                        }
                        return D0.h.f206a;
                    }
                }
                c0037t = new C0037t(this, bVar);
                Object obj32 = c0037t.f427h;
                i3 = c0037t.f428i;
                if (i3 != 0) {
                }
                return D0.h.f206a;
        }
    }
}
