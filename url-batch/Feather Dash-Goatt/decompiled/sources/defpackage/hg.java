package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class hg implements d40 {
    public final CoroutineContext d;
    public final int e;
    public final ue g;
    public final c00 h;

    public hg(c00 c00Var, CoroutineContext coroutineContext, int i, ue ueVar) {
        this.d = coroutineContext;
        this.e = i;
        this.g = ueVar;
        this.h = c00Var;
    }

    public abstract hg a(CoroutineContext coroutineContext, int i, ue ueVar);

    public c00 b() {
        return null;
    }

    public abstract Object c(d00 d00Var, dn dnVar);

    public final String d() {
        ArrayList arrayList = new ArrayList(4);
        g gVar = g.d;
        CoroutineContext coroutineContext = this.d;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        ue ueVar = ue.d;
        ue ueVar2 = this.g;
        if (ueVar2 != ueVar) {
            arrayList.add("onBufferOverflow=" + ueVar2);
        }
        return getClass().getSimpleName() + '[' + CollectionsKt.r(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // defpackage.c00
    public final Object f(d00 d00Var, dn dnVar) {
        dn dnVar2 = null;
        if (this.e == -3) {
            CoroutineContext g = dnVar.g();
            Boolean bool = Boolean.FALSE;
            e9 e9Var = new e9(8, (byte) 0);
            CoroutineContext coroutineContext = this.d;
            CoroutineContext i = !((Boolean) coroutineContext.p(bool, e9Var)).booleanValue() ? g.i(coroutineContext) : jn.a(g, coroutineContext, false);
            if (Intrinsics.a(i, g)) {
                Object c = c(d00Var, dnVar);
                return c == tn.d ? c : Unit.a;
            }
            gn gnVar = d.f;
            if (Intrinsics.a(i.d(gnVar), g.d(gnVar))) {
                CoroutineContext g2 = dnVar.g();
                if (!(d00Var instanceof e91) && !(d00Var instanceof xp0)) {
                    d00Var = new k00(d00Var, g2);
                }
                Object W = uq1.W(i, d00Var, bi1.b(i), new gg(this, dnVar2, 1), dnVar);
                return W == tn.d ? W : Unit.a;
            }
        }
        Object A = la0.A(new f(d00Var, this, dnVar2, 2), dnVar);
        tn tnVar = tn.d;
        if (A != tnVar) {
            A = Unit.a;
        }
        return A == tnVar ? A : Unit.a;
    }

    @Override // defpackage.d40
    public final c00 i(CoroutineContext coroutineContext, int i, ue ueVar) {
        CoroutineContext coroutineContext2 = this.d;
        CoroutineContext i2 = coroutineContext.i(coroutineContext2);
        ue ueVar2 = ue.d;
        ue ueVar3 = this.g;
        int i3 = this.e;
        if (ueVar == ueVar2) {
            if (i3 != -3) {
                if (i != -3) {
                    if (i3 != -2) {
                        if (i != -2) {
                            i += i3;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i3;
            }
            ueVar = ueVar3;
        }
        return (Intrinsics.a(i2, coroutineContext2) && i == i3 && ueVar == ueVar3) ? this : a(i2, i, ueVar);
    }

    public final String toString() {
        return this.h + " -> " + d();
    }
}
