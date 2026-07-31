package I;

import android.os.Trace;
import e2.AbstractC0381e;
import g2.C0411g;
import j.C0475A;
import j.C0497o;
import j.C0503u;
import j.C0508z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t0.AbstractC0898f;
import t0.C0895c;
import t0.C0911t;
import t0.C0916y;
import t0.InterfaceC0914w;

/* renamed from: I.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2351a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2352b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2353c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2354d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2355e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2356f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2357g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2358h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2359i;

    public C0120t(t0.D d3) {
        this.f2351a = 1;
        this.f2352b = d3;
        C0911t c0911t = new C0911t(d3);
        this.f2353c = c0911t;
        this.f2354d = c0911t;
        t0.o0 o0Var = c0911t.f7955L;
        this.f2355e = o0Var;
        this.f2356f = o0Var;
    }

    public static final void a(C0120t c0120t, U.k kVar, t0.a0 a0Var) {
        c0120t.getClass();
        for (U.k kVar2 = kVar.f3307h; kVar2 != null; kVar2 = kVar2.f3307h) {
            if (kVar2 == t0.X.f7852a) {
                t0.D q2 = ((t0.D) c0120t.f2352b).q();
                a0Var.f7878q = q2 != null ? (C0911t) q2.f7735x.f2353c : null;
                c0120t.f2354d = a0Var;
                return;
            } else {
                if ((kVar2.f3305f & 2) != 0) {
                    return;
                }
                kVar2.u0(a0Var);
            }
        }
    }

    public static U.k b(U.j jVar, U.k kVar) {
        U.k kVar2;
        if (jVar instanceof t0.T) {
            kVar2 = ((t0.T) jVar).h();
            kVar2.f3305f = t0.b0.g(kVar2);
        } else {
            C0895c c0895c = new C0895c();
            c0895c.f3305f = t0.b0.e(jVar);
            c0895c.f7891q = jVar;
            c0895c.f7893s = new HashSet();
            kVar2 = c0895c;
        }
        if (kVar2.p) {
            AbstractC0381e.N("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        kVar2.f3311l = true;
        U.k kVar3 = kVar.f3308i;
        if (kVar3 != null) {
            kVar3.f3307h = kVar2;
            kVar2.f3308i = kVar3;
        }
        kVar.f3308i = kVar2;
        kVar2.f3307h = kVar;
        return kVar2;
    }

    public static U.k c(U.k kVar) {
        boolean z3 = kVar.p;
        if (z3) {
            C0503u c0503u = t0.b0.f7890a;
            if (!z3) {
                AbstractC0381e.N("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            t0.b0.b(kVar, -1, 2);
            kVar.s0();
            kVar.m0();
        }
        U.k kVar2 = kVar.f3308i;
        U.k kVar3 = kVar.f3307h;
        if (kVar2 != null) {
            kVar2.f3307h = kVar3;
            kVar.f3308i = null;
        }
        if (kVar3 != null) {
            kVar3.f3308i = kVar2;
            kVar.f3307h = null;
        }
        Z1.i.c(kVar3);
        return kVar3;
    }

    public static void l(U.j jVar, U.j jVar2, U.k kVar) {
        if ((jVar instanceof t0.T) && (jVar2 instanceof t0.T)) {
            t0.W w3 = t0.X.f7852a;
            Z1.i.d(kVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((t0.T) jVar2).i(kVar);
            if (kVar.p) {
                t0.b0.d(kVar);
                return;
            } else {
                kVar.f3312m = true;
                return;
            }
        }
        if (!(kVar instanceof C0895c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        C0895c c0895c = (C0895c) kVar;
        if (c0895c.p) {
            c0895c.w0();
        }
        c0895c.f7891q = jVar2;
        c0895c.f3305f = t0.b0.e(jVar2);
        if (c0895c.p) {
            c0895c.v0(false);
        }
        if (kVar.p) {
            t0.b0.d(kVar);
        } else {
            kVar.f3312m = true;
        }
    }

    public void d() {
        C0508z c0508z = (C0508z) this.f2352b;
        if (c0508z.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c0508z.iterator();
            while (((C0411g) ((O.c) it).f2983e).hasNext()) {
                B0 b02 = (B0) ((C0411g) ((O.c) it).f2983e).next();
                ((O.c) it).remove();
                b02.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void e() {
        g(Integer.MIN_VALUE);
        ArrayList arrayList = (ArrayList) this.f2354d;
        boolean isEmpty = arrayList.isEmpty();
        C0508z c0508z = (C0508z) this.f2352b;
        if (!isEmpty) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C0475A c0475a = (C0475A) this.f2357g;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(size);
                    if (obj instanceof B0) {
                        c0508z.remove(obj);
                        ((B0) obj).a();
                    }
                    if (obj instanceof InterfaceC0101j) {
                        if (c0475a == null || !c0475a.c(obj)) {
                            ((InterfaceC0101j) obj).a();
                        } else {
                            ((InterfaceC0101j) obj).c();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f2353c;
        if (arrayList2.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:onRemembered");
        try {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                B0 b02 = (B0) arrayList2.get(i3);
                c0508z.remove(b02);
                b02.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    public boolean f(int i3) {
        return (i3 & ((U.k) this.f2356f).f3306g) != 0;
    }

    public void g(int i3) {
        ArrayList arrayList = (ArrayList) this.f2356f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i4 = 0;
        ArrayList arrayList2 = null;
        int i5 = 0;
        C0497o c0497o = null;
        C0497o c0497o2 = null;
        while (true) {
            C0497o c0497o3 = (C0497o) this.f2359i;
            if (i5 >= c0497o3.f5183b) {
                break;
            }
            if (i3 <= c0497o3.b(i5)) {
                Object remove = arrayList.remove(i5);
                int c3 = c0497o3.c(i5);
                int c4 = ((C0497o) this.f2358h).c(i5);
                if (arrayList2 == null) {
                    arrayList2 = M1.m.e0(remove);
                    c0497o2 = new C0497o();
                    c0497o2.a(c3);
                    c0497o = new C0497o();
                    c0497o.a(c4);
                } else {
                    Z1.i.d(c0497o, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    Z1.i.d(c0497o2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayList2.add(remove);
                    c0497o2.a(c3);
                    c0497o.a(c4);
                }
            } else {
                i5++;
            }
        }
        if (arrayList2 != null) {
            Z1.i.d(c0497o, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            Z1.i.d(c0497o2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayList2.size() - 1;
            while (i4 < size) {
                int i6 = i4 + 1;
                int size2 = arrayList2.size();
                for (int i7 = i6; i7 < size2; i7++) {
                    int b2 = c0497o2.b(i4);
                    int b3 = c0497o2.b(i7);
                    if (b2 < b3 || (b3 == b2 && c0497o.b(i4) < c0497o.b(i7))) {
                        Object obj = arrayList2.get(i4);
                        arrayList2.set(i4, arrayList2.get(i7));
                        arrayList2.set(i7, obj);
                        int b4 = c0497o.b(i4);
                        c0497o.d(i4, c0497o.b(i7));
                        c0497o.d(i7, b4);
                        int b5 = c0497o2.b(i4);
                        c0497o2.d(i4, c0497o2.b(i7));
                        c0497o2.d(i7, b5);
                    }
                }
                i4 = i6;
            }
            ((ArrayList) this.f2354d).addAll(arrayList2);
        }
    }

    public void h(Object obj, int i3, int i4, int i5) {
        g(i3);
        if (i5 < 0 || i5 >= i3) {
            ((ArrayList) this.f2354d).add(obj);
            return;
        }
        ((ArrayList) this.f2356f).add(obj);
        ((C0497o) this.f2358h).a(i4);
        ((C0497o) this.f2359i).a(i5);
    }

    public void i() {
        for (U.k kVar = (U.k) this.f2356f; kVar != null; kVar = kVar.f3308i) {
            kVar.r0();
            if (kVar.f3311l) {
                t0.b0.a(kVar);
            }
            if (kVar.f3312m) {
                t0.b0.d(kVar);
            }
            kVar.f3311l = false;
            kVar.f3312m = false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:java.lang.Object) from 0x0020: IPUT (r11v13 ?? I:java.lang.Object), (r29v0 'this' ?? I:I.t A[IMMUTABLE_TYPE, THIS]) (LINE:33) I.t.i java.lang.Object
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
          (r11v13 ?? I:java.lang.Object) from 0x0020: IPUT (r11v13 ?? I:java.lang.Object), (r29v0 'this' ?? I:I.t A[IMMUTABLE_TYPE, THIS]) (LINE:33) I.t.i java.lang.Object
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
        t0.D d3;
        C0916y c0916y;
        U.k kVar = ((t0.o0) this.f2355e).f3307h;
        t0.a0 a0Var = (C0911t) this.f2353c;
        U.k kVar2 = kVar;
        while (true) {
            d3 = (t0.D) this.f2352b;
            if (kVar2 == null) {
                break;
            }
            InterfaceC0914w g3 = AbstractC0898f.g(kVar2);
            if (g3 != null) {
                t0.a0 a0Var2 = kVar2.f3310k;
                if (a0Var2 != null) {
                    C0916y c0916y2 = (C0916y) a0Var2;
                    InterfaceC0914w interfaceC0914w = c0916y2.f7968L;
                    c0916y2.X0(g3);
                    c0916y = c0916y2;
                    if (interfaceC0914w != kVar2) {
                        t0.f0 f0Var = c0916y2.f7876G;
                        c0916y = c0916y2;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            c0916y = c0916y2;
                        }
                    }
                } else {
                    C0916y c0916y3 = new C0916y(d3, g3);
                    kVar2.u0(c0916y3);
                    c0916y = c0916y3;
                }
                a0Var.f7878q = c0916y;
                c0916y.p = a0Var;
                a0Var = c0916y;
            } else {
                kVar2.u0(a0Var);
            }
            kVar2 = kVar2.f3307h;
        }
        t0.D q2 = d3.q();
        a0Var.f7878q = q2 != null ? (C0911t) q2.f7735x.f2353c : null;
        this.f2354d = a0Var;
    }

    public String toString() {
        switch (this.f2351a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                U.k kVar = (U.k) this.f2356f;
                t0.o0 o0Var = (t0.o0) this.f2355e;
                if (kVar == o0Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (kVar != null && kVar != o0Var) {
                            sb.append(String.valueOf(kVar));
                            if (kVar.f3308i == o0Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                kVar = kVar.f3308i;
                            }
                        }
                    }
                }
                String sb2 = sb.toString();
                Z1.i.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0120t(C0508z c0508z) {
        this.f2351a = 0;
        this.f2352b = c0508z;
        this.f2353c = new ArrayList();
        this.f2354d = new ArrayList();
        this.f2355e = new ArrayList();
        this.f2356f = new ArrayList();
        this.f2358h = new C0497o();
        this.f2359i = new C0497o();
    }
}
