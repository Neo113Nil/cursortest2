package s0;

import G.C0192d;
import G.C0230w0;
import G.C0234y0;
import G.C0236z0;
import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import android.view.View;
import androidx.lifecycle.InterfaceC0481v;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class d1 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10189k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f10190l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M2.E f10191m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0236z0 f10192n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0481v f10193o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e1 f10194p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f10195q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(M2.E e4, C0236z0 c0236z0, InterfaceC0481v interfaceC0481v, e1 e1Var, View view, C2.a aVar) {
        super(2, aVar);
        this.f10191m = e4;
        this.f10192n = c0236z0;
        this.f10193o = interfaceC0481v;
        this.f10194p = e1Var;
        this.f10195q = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((d1) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        d1 d1Var = new d1(this.f10191m, this.f10192n, this.f10193o, this.f10194p, this.f10195q, aVar);
        d1Var.f10190l = obj;
        return d1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        InterfaceC0280c0 interfaceC0280c0;
        W2.r0 r0Var;
        Object obj2 = D2.a.f2163d;
        int i2 = this.f10189k;
        InterfaceC0481v interfaceC0481v = this.f10193o;
        e1 e1Var = this.f10194p;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f10190l;
            try {
                C1173v0 c1173v0 = (C1173v0) this.f10191m.f3580d;
                if (c1173v0 != null) {
                    Z2.P a4 = h1.a(this.f10195q.getContext().getApplicationContext());
                    c1173v0.f10403d.f(((Number) a4.getValue()).floatValue());
                    r0Var = W2.B.m(interfaceC0302y, null, null, new c1(a4, c1173v0, null), 3);
                } else {
                    r0Var = null;
                }
            } catch (Throwable th) {
                th = th;
                interfaceC0280c0 = null;
            }
            try {
                C0236z0 c0236z0 = this.f10192n;
                this.f10190l = r0Var;
                this.f10189k = 1;
                C0234y0 c0234y0 = new C0234y0(c0236z0, null);
                CoroutineContext coroutineContext = this.f2311e;
                Intrinsics.c(coroutineContext);
                Object q2 = W2.B.q(c0236z0.f2982a, new C0230w0(c0236z0, c0234y0, C0192d.F(coroutineContext), null), this);
                if (q2 != obj2) {
                    q2 = Unit.f7487a;
                }
                if (q2 != obj2) {
                    q2 = Unit.f7487a;
                }
                if (q2 == obj2) {
                    return obj2;
                }
                interfaceC0280c0 = r0Var;
            } catch (Throwable th2) {
                interfaceC0280c0 = r0Var;
                th = th2;
                if (interfaceC0280c0 != null) {
                }
                interfaceC0481v.e().f(e1Var);
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0280c0 = (InterfaceC0280c0) this.f10190l;
            try {
                AbstractC1343r.b(obj);
            } catch (Throwable th3) {
                th = th3;
                if (interfaceC0280c0 != null) {
                    interfaceC0280c0.a(null);
                }
                interfaceC0481v.e().f(e1Var);
                throw th;
            }
        }
        if (interfaceC0280c0 != null) {
            interfaceC0280c0.a(null);
        }
        interfaceC0481v.e().f(e1Var);
        return Unit.f7487a;
    }
}
