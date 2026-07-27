package W2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1338m;

/* renamed from: W2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0275a extends k0 implements C2.a, InterfaceC0302y {

    /* renamed from: i, reason: collision with root package name */
    public final CoroutineContext f4246i;

    public AbstractC0275a(CoroutineContext coroutineContext, boolean z4) {
        super(z4);
        R((InterfaceC0280c0) coroutineContext.k(C0299v.f4296e));
        this.f4246i = coroutineContext.s(this);
    }

    @Override // W2.k0
    public final String F() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // W2.k0
    public final void Q(I1.b bVar) {
        B.i(bVar, this.f4246i);
    }

    @Override // W2.k0
    public final void Z(Object obj) {
        if (!(obj instanceof C0294p)) {
            i0(obj);
        } else {
            C0294p c0294p = (C0294p) obj;
            h0(c0294p.f4291a, C0294p.f4290b.get(c0294p) != 0);
        }
    }

    public void h0(Throwable th, boolean z4) {
    }

    public void i0(Object obj) {
    }

    public final void j0(EnumC0303z enumC0303z, AbstractC0275a abstractC0275a, Function2 function2) {
        Object h4;
        int ordinal = enumC0303z.ordinal();
        if (ordinal == 0) {
            c3.a.a(function2, abstractC0275a, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                Intrinsics.checkNotNullParameter(function2, "<this>");
                Intrinsics.checkNotNullParameter(this, "completion");
                C2.a b4 = D2.f.b(D2.f.a(abstractC0275a, this, function2));
                AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                b4.u(Unit.f7487a);
                return;
            }
            if (ordinal != 3) {
                throw new C1338m();
            }
            Intrinsics.checkNotNullParameter(this, "completion");
            try {
                CoroutineContext coroutineContext = this.f4246i;
                Object c4 = b3.v.c(coroutineContext, null);
                try {
                    Intrinsics.checkNotNullParameter(this, "frame");
                    if (function2 instanceof E2.a) {
                        M2.J.d(2, function2);
                        h4 = function2.h(abstractC0275a, this);
                    } else {
                        h4 = D2.f.c(function2, abstractC0275a, this);
                    }
                    b3.v.a(coroutineContext, c4);
                    if (h4 != D2.a.f2163d) {
                        AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                        u(h4);
                    }
                } catch (Throwable th) {
                    b3.v.a(coroutineContext, c4);
                    throw th;
                }
            } catch (Throwable th2) {
                AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                u(AbstractC1343r.a(th2));
            }
        }
    }

    @Override // C2.a
    public final CoroutineContext p() {
        return this.f4246i;
    }

    @Override // W2.InterfaceC0302y
    public final CoroutineContext q() {
        return this.f4246i;
    }

    @Override // C2.a
    public final void u(Object obj) {
        Throwable a4 = AbstractC1341p.a(obj);
        if (a4 != null) {
            obj = new C0294p(a4, false);
        }
        Object V3 = V(obj);
        if (V3 == B.f4212e) {
            return;
        }
        B(V3);
    }
}
