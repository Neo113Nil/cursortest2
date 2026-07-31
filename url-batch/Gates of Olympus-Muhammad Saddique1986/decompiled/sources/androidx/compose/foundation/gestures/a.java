package androidx.compose.foundation.gestures;

import U.q;
import X1.c;
import a0.C0238c;
import f2.r;
import n.e0;
import n.l0;
import p.C0752a0;
import p.C0775m;
import p.C0793v0;
import p.InterfaceC0757d;
import p.InterfaceC0778n0;
import p.P;
import p.W;
import p.X;
import p.Y;
import p.Z;
import q.k;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final X f4801a = new X();

    /* renamed from: b, reason: collision with root package name */
    public static final W f4802b = new W();

    /* renamed from: c, reason: collision with root package name */
    public static final Y f4803c = new Y();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0793v0 c0793v0, long j3, c cVar) {
        Z z3;
        int i3;
        r rVar;
        if (cVar instanceof Z) {
            z3 = (Z) cVar;
            int i4 = z3.f7636j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z3.f7636j = i4 - Integer.MIN_VALUE;
                Object obj = z3.f7635i;
                W1.a aVar = W1.a.f4608d;
                i3 = z3.f7636j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    rVar = new r();
                    e0 e0Var = e0.f7122d;
                    C0752a0 c0752a0 = new C0752a0(c0793v0, j3, rVar, null);
                    z3.f7633g = c0793v0;
                    z3.f7634h = rVar;
                    z3.f7636j = 1;
                    if (c0793v0.e(e0Var, c0752a0, z3) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r rVar2 = z3.f7634h;
                    C0793v0 c0793v02 = z3.f7633g;
                    R1.a.e(obj);
                    rVar = rVar2;
                    c0793v0 = c0793v02;
                }
                return new C0238c(c0793v0.g(rVar.f5829d));
            }
        }
        z3 = new Z(cVar);
        Object obj2 = z3.f7635i;
        W1.a aVar2 = W1.a.f4608d;
        i3 = z3.f7636j;
        if (i3 != 0) {
        }
        return new C0238c(c0793v0.g(rVar.f5829d));
    }

    public static final q b(q qVar, InterfaceC0778n0 interfaceC0778n0, P p3, l0 l0Var, boolean z3, boolean z4, C0775m c0775m, k kVar, InterfaceC0757d interfaceC0757d) {
        return qVar.i(new ScrollableElement(l0Var, interfaceC0757d, c0775m, p3, interfaceC0778n0, kVar, z3, z4));
    }
}
