package u0;

import I.C0089d;
import I.C0129x0;
import I.C0133z0;
import android.view.View;
import androidx.lifecycle.InterfaceC0236v;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import n2.InterfaceC0690O;

/* loaded from: classes.dex */
public final class R0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f8227e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f8228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z1.t f8229g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ I.A0 f8230h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0236v f8231i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S0 f8232j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f8233k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(Z1.t tVar, I.A0 a02, InterfaceC0236v interfaceC0236v, S0 s02, View view, P1.d dVar) {
        super(2, dVar);
        this.f8229g = tVar;
        this.f8230h = a02;
        this.f8231i = interfaceC0236v;
        this.f8232j = s02;
        this.f8233k = view;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        R0 r02 = new R0(this.f8229g, this.f8230h, this.f8231i, this.f8232j, this.f8233k, dVar);
        r02.f8228f = obj;
        return r02;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((R0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k2.X x3;
        k2.m0 m0Var;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8227e;
        InterfaceC0236v interfaceC0236v = this.f8231i;
        L1.z zVar = L1.z.f2729a;
        S0 s02 = this.f8232j;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f8228f;
            try {
                C0987n0 c0987n0 = (C0987n0) this.f8229g.f3480d;
                if (c0987n0 != null) {
                    InterfaceC0690O a3 = V0.a(this.f8233k.getContext().getApplicationContext());
                    c0987n0.f8378d.h(((Number) a3.getValue()).floatValue());
                    m0Var = AbstractC0552y.q(interfaceC0550w, null, null, new Q0(a3, c0987n0, null), 3);
                } else {
                    m0Var = null;
                }
                try {
                    I.A0 a02 = this.f8230h;
                    this.f8228f = m0Var;
                    this.f8227e = 1;
                    Object y3 = AbstractC0552y.y(a02.f2060a, new C0129x0(a02, new C0133z0(a02, null), C0089d.F(getContext()), null), this);
                    if (y3 != aVar) {
                        y3 = zVar;
                    }
                    if (y3 != aVar) {
                        y3 = zVar;
                    }
                    if (y3 == aVar) {
                        return aVar;
                    }
                    x3 = m0Var;
                } catch (Throwable th) {
                    x3 = m0Var;
                    th = th;
                    if (x3 != null) {
                    }
                    interfaceC0236v.e().f(s02);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                x3 = null;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x3 = (k2.X) this.f8228f;
            try {
                I2.l.Q(obj);
            } catch (Throwable th3) {
                th = th3;
                if (x3 != null) {
                    x3.a(null);
                }
                interfaceC0236v.e().f(s02);
                throw th;
            }
        }
        if (x3 != null) {
            x3.a(null);
        }
        interfaceC0236v.e().f(s02);
        return zVar;
    }
}
