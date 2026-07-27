package G;

import android.os.Trace;
import i.C0660A;
import i.C0661B;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import r0.AbstractC1065f;
import r0.C1062c;
import r0.C1078t;
import r0.C1083y;
import r0.InterfaceC1081w;
import z2.C1441y;

/* renamed from: G.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2908b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2909c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2910d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2911e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2912f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2913g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2914h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2915i;

    public C0223t(r0.E e4) {
        this.f2907a = 1;
        this.f2908b = e4;
        C1078t c1078t = new C1078t(e4);
        this.f2909c = c1078t;
        this.f2910d = c1078t;
        r0.o0 o0Var = c1078t.f9841P;
        this.f2911e = o0Var;
        this.f2912f = o0Var;
    }

    public static final void a(C0223t c0223t, S.n nVar, r0.a0 a0Var) {
        c0223t.getClass();
        for (S.n nVar2 = nVar.f3982k; nVar2 != null; nVar2 = nVar2.f3982k) {
            if (nVar2 == r0.X.f9731a) {
                r0.E s4 = ((r0.E) c0223t.f2908b).s();
                a0Var.f9764t = s4 != null ? (C1078t) s4.B.f2909c : null;
                c0223t.f2910d = a0Var;
                return;
            } else {
                if ((nVar2.f3980i & 2) != 0) {
                    return;
                }
                nVar2.A0(a0Var);
            }
        }
    }

    public static S.n b(S.m mVar, S.n nVar) {
        S.n nVar2;
        if (mVar instanceof r0.T) {
            nVar2 = ((r0.T) mVar).l();
            nVar2.f3980i = r0.b0.g(nVar2);
        } else {
            C1062c c1062c = new C1062c();
            c1062c.f3980i = r0.b0.e(mVar);
            c1062c.f9774t = mVar;
            c1062c.f9776v = new HashSet();
            nVar2 = c1062c;
        }
        if (nVar2.f3990s) {
            AbstractC0864b.D("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        nVar2.f3986o = true;
        S.n nVar3 = nVar.f3983l;
        if (nVar3 != null) {
            nVar3.f3982k = nVar2;
            nVar2.f3983l = nVar3;
        }
        nVar.f3983l = nVar2;
        nVar2.f3982k = nVar;
        return nVar2;
    }

    public static S.n c(S.n nVar) {
        boolean z4 = nVar.f3990s;
        if (z4) {
            i.v vVar = r0.b0.f9773a;
            if (!z4) {
                AbstractC0864b.D("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            r0.b0.b(nVar, -1, 2);
            nVar.y0();
            nVar.s0();
        }
        S.n nVar2 = nVar.f3983l;
        S.n nVar3 = nVar.f3982k;
        if (nVar2 != null) {
            nVar2.f3982k = nVar3;
            nVar.f3983l = null;
        }
        if (nVar3 != null) {
            nVar3.f3983l = nVar2;
            nVar.f3982k = null;
        }
        Intrinsics.c(nVar3);
        return nVar3;
    }

    public static void l(S.m mVar, S.m mVar2, S.n nVar) {
        if ((mVar instanceof r0.T) && (mVar2 instanceof r0.T)) {
            r0.W w4 = r0.X.f9731a;
            Intrinsics.d(nVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((r0.T) mVar2).m(nVar);
            if (nVar.f3990s) {
                r0.b0.d(nVar);
                return;
            } else {
                nVar.f3987p = true;
                return;
            }
        }
        if (!(nVar instanceof C1062c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        C1062c c1062c = (C1062c) nVar;
        if (c1062c.f3990s) {
            c1062c.C0();
        }
        c1062c.f9774t = mVar2;
        c1062c.f3980i = r0.b0.e(mVar2);
        if (c1062c.f3990s) {
            c1062c.B0(false);
        }
        if (nVar.f3990s) {
            r0.b0.d(nVar);
        } else {
            nVar.f3987p = true;
        }
    }

    public void d() {
        C0660A c0660a = (C0660A) this.f2908b;
        if (c0660a.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c0660a.iterator();
            while (((T2.h) ((M.c) it).f3536e).hasNext()) {
                A0 a02 = (A0) ((T2.h) ((M.c) it).f3536e).next();
                ((M.c) it).remove();
                a02.d();
            }
            Unit unit = Unit.f7487a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void e() {
        g(Integer.MIN_VALUE);
        ArrayList arrayList = (ArrayList) this.f2910d;
        boolean isEmpty = arrayList.isEmpty();
        C0660A c0660a = (C0660A) this.f2908b;
        if (!isEmpty) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C0661B c0661b = (C0661B) this.f2913g;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    Object obj = arrayList.get(size);
                    if (obj instanceof A0) {
                        c0660a.remove(obj);
                        ((A0) obj).a();
                    }
                    if (obj instanceof InterfaceC0204j) {
                        if (c0661b == null || !c0661b.c(obj)) {
                            ((InterfaceC0204j) obj).a();
                        } else {
                            ((InterfaceC0204j) obj).c();
                        }
                    }
                }
                Unit unit = Unit.f7487a;
                Trace.endSection();
            } finally {
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f2909c;
        if (arrayList2.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:onRemembered");
        try {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                A0 a02 = (A0) arrayList2.get(i2);
                c0660a.remove(a02);
                a02.b();
            }
            Unit unit2 = Unit.f7487a;
            Trace.endSection();
        } finally {
        }
    }

    public boolean f(int i2) {
        return (i2 & ((S.n) this.f2912f).f3981j) != 0;
    }

    public void g(int i2) {
        ArrayList arrayList = (ArrayList) this.f2912f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i4 = 0;
        ArrayList arrayList2 = null;
        int i5 = 0;
        i.p pVar = null;
        i.p pVar2 = null;
        while (true) {
            i.p pVar3 = (i.p) this.f2915i;
            if (i5 >= pVar3.f6939b) {
                break;
            }
            if (i2 <= pVar3.c(i5)) {
                Object remove = arrayList.remove(i5);
                int d4 = pVar3.d(i5);
                int d5 = ((i.p) this.f2914h).d(i5);
                if (arrayList2 == null) {
                    arrayList2 = C1441y.f(remove);
                    pVar2 = new i.p();
                    pVar2.a(d4);
                    pVar = new i.p();
                    pVar.a(d5);
                } else {
                    Intrinsics.d(pVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    Intrinsics.d(pVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayList2.add(remove);
                    pVar2.a(d4);
                    pVar.a(d5);
                }
            } else {
                i5++;
            }
        }
        if (arrayList2 != null) {
            Intrinsics.d(pVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            Intrinsics.d(pVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayList2.size() - 1;
            while (i4 < size) {
                int i6 = i4 + 1;
                int size2 = arrayList2.size();
                for (int i7 = i6; i7 < size2; i7++) {
                    int c4 = pVar2.c(i4);
                    int c5 = pVar2.c(i7);
                    if (c4 < c5 || (c5 == c4 && pVar.c(i4) < pVar.c(i7))) {
                        Object obj = arrayList2.get(i4);
                        arrayList2.set(i4, arrayList2.get(i7));
                        arrayList2.set(i7, obj);
                        int c6 = pVar.c(i4);
                        pVar.e(i4, pVar.c(i7));
                        pVar.e(i7, c6);
                        int c7 = pVar2.c(i4);
                        pVar2.e(i4, pVar2.c(i7));
                        pVar2.e(i7, c7);
                    }
                }
                i4 = i6;
            }
            ((ArrayList) this.f2910d).addAll(arrayList2);
        }
    }

    public void h(Object obj, int i2, int i4, int i5) {
        g(i2);
        if (i5 < 0 || i5 >= i2) {
            ((ArrayList) this.f2910d).add(obj);
            return;
        }
        ((ArrayList) this.f2912f).add(obj);
        ((i.p) this.f2914h).a(i4);
        ((i.p) this.f2915i).a(i5);
    }

    public void i() {
        for (S.n nVar = (S.n) this.f2912f; nVar != null; nVar = nVar.f3983l) {
            nVar.x0();
            if (nVar.f3986o) {
                r0.b0.a(nVar);
            }
            if (nVar.f3987p) {
                r0.b0.d(nVar);
            }
            nVar.f3986o = false;
            nVar.f3987p = false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:java.lang.Object) from 0x0020: IPUT (r11v13 ?? I:java.lang.Object), (r29v0 'this' ?? I:G.t A[IMMUTABLE_TYPE, THIS]) G.t.i java.lang.Object
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void j(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:java.lang.Object) from 0x0020: IPUT (r11v13 ?? I:java.lang.Object), (r29v0 'this' ?? I:G.t A[IMMUTABLE_TYPE, THIS]) G.t.i java.lang.Object
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public void k() {
        r0.E e4;
        C1083y c1083y;
        S.n nVar = ((r0.o0) this.f2911e).f3982k;
        r0.a0 a0Var = (C1078t) this.f2909c;
        S.n nVar2 = nVar;
        while (true) {
            e4 = (r0.E) this.f2908b;
            if (nVar2 == null) {
                break;
            }
            InterfaceC1081w g4 = AbstractC1065f.g(nVar2);
            if (g4 != null) {
                r0.a0 a0Var2 = nVar2.f3985n;
                if (a0Var2 != null) {
                    C1083y c1083y2 = (C1083y) a0Var2;
                    InterfaceC1081w interfaceC1081w = c1083y2.f9854P;
                    c1083y2.l1(g4);
                    c1083y = c1083y2;
                    if (interfaceC1081w != nVar2) {
                        r0.f0 f0Var = c1083y2.f9761J;
                        c1083y = c1083y2;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            c1083y = c1083y2;
                        }
                    }
                } else {
                    C1083y c1083y3 = new C1083y(e4, g4);
                    nVar2.A0(c1083y3);
                    c1083y = c1083y3;
                }
                a0Var.f9764t = c1083y;
                c1083y.f9763s = a0Var;
                a0Var = c1083y;
            } else {
                nVar2.A0(a0Var);
            }
            nVar2 = nVar2.f3982k;
        }
        r0.E s4 = e4.s();
        a0Var.f9764t = s4 != null ? (C1078t) s4.B.f2909c : null;
        this.f2910d = a0Var;
    }

    public String toString() {
        switch (this.f2907a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                S.n nVar = (S.n) this.f2912f;
                r0.o0 o0Var = (r0.o0) this.f2911e;
                if (nVar == o0Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (nVar != null && nVar != o0Var) {
                            sb.append(String.valueOf(nVar));
                            if (nVar.f3983l == o0Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                nVar = nVar.f3983l;
                            }
                        }
                    }
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0223t(C0660A c0660a) {
        this.f2907a = 0;
        this.f2908b = c0660a;
        this.f2909c = new ArrayList();
        this.f2910d = new ArrayList();
        this.f2911e = new ArrayList();
        this.f2912f = new ArrayList();
        this.f2914h = new i.p();
        this.f2915i = new i.p();
    }
}
