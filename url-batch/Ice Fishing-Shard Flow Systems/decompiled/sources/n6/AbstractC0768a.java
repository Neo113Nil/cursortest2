package n6;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0768a extends f0 implements V5.b, InterfaceC0789w {

    /* renamed from: i, reason: collision with root package name */
    public final CoroutineContext f7037i;

    public AbstractC0768a(CoroutineContext coroutineContext, boolean z7) {
        super(z7);
        E((X) coroutineContext.g(C0787u.f7085e));
        this.f7037i = coroutineContext.j(this);
    }

    @Override // n6.f0
    public final void D(E1.i iVar) {
        AbstractC0792z.i(iVar, this.f7037i);
    }

    @Override // n6.f0
    public final void O(Object obj) {
        if (!(obj instanceof C0784q)) {
            X(obj);
        } else {
            C0784q c0784q = (C0784q) obj;
            W(c0784q.f7076a, C0784q.f7075b.get(c0784q) != 0);
        }
    }

    public final void Y(EnumC0790x enumC0790x, AbstractC0768a abstractC0768a, Function2 function2) {
        int ordinal = enumC0790x.ordinal();
        if (ordinal == 0) {
            V6.b.N(function2, abstractC0768a, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                Intrinsics.checkNotNullParameter(function2, "<this>");
                Intrinsics.checkNotNullParameter(this, "completion");
                V5.b b7 = W5.d.b(W5.d.a(function2, abstractC0768a, this));
                Unit unit = Unit.f6114a;
                R5.l lVar = R5.n.f2421d;
                b7.resumeWith(unit);
                return;
            }
            if (ordinal != 3) {
                throw new R5.k();
            }
            Intrinsics.checkNotNullParameter(this, "completion");
            try {
                CoroutineContext coroutineContext = this.f7037i;
                Object c7 = s6.u.c(coroutineContext, null);
                try {
                    Intrinsics.checkNotNullParameter(this, "frame");
                    kotlin.jvm.internal.I.b(2, function2);
                    Object invoke = function2.invoke(abstractC0768a, this);
                    if (invoke != W5.a.f2787d) {
                        R5.l lVar2 = R5.n.f2421d;
                        resumeWith(invoke);
                    }
                } finally {
                    s6.u.a(coroutineContext, c7);
                }
            } catch (Throwable th) {
                R5.l lVar3 = R5.n.f2421d;
                resumeWith(V6.b.n(th));
            }
        }
    }

    @Override // V5.b
    public final CoroutineContext getContext() {
        return this.f7037i;
    }

    @Override // n6.InterfaceC0789w
    public final CoroutineContext h() {
        return this.f7037i;
    }

    @Override // n6.f0
    public final String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // V5.b
    public final void resumeWith(Object obj) {
        Throwable a7 = R5.n.a(obj);
        if (a7 != null) {
            obj = new C0784q(a7, false);
        }
        Object K7 = K(obj);
        if (K7 == AbstractC0792z.f7099e) {
            return;
        }
        m(K7);
    }

    public void X(Object obj) {
    }

    public void W(Throwable th, boolean z7) {
    }
}
