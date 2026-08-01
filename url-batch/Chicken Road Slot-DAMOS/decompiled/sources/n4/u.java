package n4;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s.s0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class u extends s implements Iterable, xd.a {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f7124u = 0;

    /* renamed from: t, reason: collision with root package name */
    public final e3.o f7125t;

    public u(w wVar) {
        super(wVar);
        this.f7125t = new e3.o(this);
    }

    @Override // n4.s
    public final r e(a1.n nVar) {
        r e2 = super.e(nVar);
        e3.o oVar = this.f7125t;
        oVar.getClass();
        return oVar.t(e2, nVar, false, (u) oVar.f3828b);
    }

    @Override // n4.s
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u) || !super.equals(obj)) {
            return false;
        }
        e3.o oVar = this.f7125t;
        int f3 = ((s0) oVar.f3829c).f();
        e3.o oVar2 = ((u) obj).f7125t;
        if (f3 != ((s0) oVar2.f3829c).f() || oVar.f3827a != oVar2.f3827a) {
            return false;
        }
        s0 s0Var = (s0) oVar.f3829c;
        s0Var.getClass();
        Iterator it = de.k.b(new hd.u(7, s0Var)).iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (!sVar.equals(((s0) oVar2.f3829c).c(sVar.f7115e.f1694a))) {
                return false;
            }
        }
        return true;
    }

    public final r f(a1.n nVar, s sVar) {
        return this.f7125t.t(super.e(nVar), nVar, true, sVar);
    }

    public final r g(String str, boolean z10, s sVar) {
        r rVar;
        e3.o oVar = this.f7125t;
        oVar.getClass();
        u uVar = (u) oVar.f3828b;
        r c10 = uVar.f7115e.c(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = uVar.iterator();
        while (true) {
            q4.j jVar = (q4.j) it;
            rVar = null;
            if (!jVar.hasNext()) {
                break;
            }
            s sVar2 = (s) jVar.next();
            if (!Intrinsics.a(sVar2, sVar)) {
                if (sVar2 instanceof u) {
                    rVar = ((u) sVar2).g(str, false, uVar);
                } else {
                    sVar2.getClass();
                    rVar = sVar2.f7115e.c(str);
                }
            }
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        r rVar2 = (r) CollectionsKt.E(arrayList);
        u uVar2 = uVar.f7116i;
        if (uVar2 != null && z10 && !uVar2.equals(sVar)) {
            rVar = uVar2.g(str, true, uVar);
        }
        return (r) CollectionsKt.E(kotlin.collections.w.m(new r[]{c10, rVar2, rVar}));
    }

    @Override // n4.s
    public final int hashCode() {
        e3.o oVar = this.f7125t;
        int i3 = oVar.f3827a;
        s0 s0Var = (s0) oVar.f3829c;
        int f3 = s0Var.f();
        for (int i10 = 0; i10 < f3; i10++) {
            i3 = (((i3 * 31) + s0Var.d(i10)) * 31) + ((s) s0Var.g(i10)).hashCode();
        }
        return i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        e3.o oVar = this.f7125t;
        oVar.getClass();
        return new q4.j(oVar);
    }

    @Override // n4.s
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        e3.o oVar = this.f7125t;
        String str = (String) oVar.f3831e;
        oVar.getClass();
        s q3 = (str == null || StringsKt.r(str)) ? null : oVar.q(str, true);
        if (q3 == null) {
            q3 = oVar.p(oVar.f3827a);
        }
        sb2.append(" startDestination=");
        if (q3 == null) {
            String str2 = (String) oVar.f3831e;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = (String) oVar.f3830d;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(oVar.f3827a));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(q3.toString());
            sb2.append("}");
        }
        return sb2.toString();
    }
}
