package I2;

import B0.C;
import F.A0;
import F.D0;
import F.J;
import F.L;
import F.U0;
import F.V0;
import F.X0;
import F.a1;
import F.b1;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0105l;
import I.C0109n;
import I.C0113p;
import I.C0119s0;
import I.InterfaceC0088c0;
import I.InterfaceC0110n0;
import I.X;
import J.E;
import L1.A;
import L1.o;
import L1.w;
import L1.z;
import M1.B;
import P0.q;
import U.l;
import a.AbstractC0157a;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0259J;
import b0.C0288u;
import com.gates.olympus.miruv.R;
import d1.C0327a;
import e2.AbstractC0381e;
import f2.InterfaceC0387b;
import g0.AbstractC0393b;
import h.AbstractC0416e;
import h0.C0425f;
import h2.AbstractC0447i;
import java.io.Closeable;
import java.util.List;
import java.util.UUID;
import m.AbstractC0595e;
import m.AbstractC0614y;
import m.C0579D;
import m.C0580E;
import m.C0583H;
import m.y0;
import m.z0;
import r.AbstractC0801M;
import r.AbstractC0813j;
import r.AbstractC0818o;
import r.AbstractC0821s;
import r.C0802N;
import r.C0807d;
import r.C0810g;
import r.C0823u;
import r.C0824v;
import r.InterfaceC0796H;
import r0.C0836i;
import r0.InterfaceC0827A;
import t.C0891a;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import u0.AbstractC0963b0;
import x.C1050d;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static C0425f f2495a = null;

    /* renamed from: b, reason: collision with root package name */
    public static C0425f f2496b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2497c = 66305;

    public static final Class A(InterfaceC0387b interfaceC0387b) {
        Z1.i.f(interfaceC0387b, "<this>");
        Class a3 = ((Z1.c) interfaceC0387b).a();
        Z1.i.d(a3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class B(InterfaceC0387b interfaceC0387b) {
        Z1.i.f(interfaceC0387b, "<this>");
        Class a3 = ((Z1.c) interfaceC0387b).a();
        if (!a3.isPrimitive()) {
            return a3;
        }
        String name = a3.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a3;
    }

    public static final C0327a C(View view) {
        C0327a c0327a = (C0327a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c0327a != null) {
            return c0327a;
        }
        C0327a c0327a2 = new C0327a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c0327a2);
        return c0327a2;
    }

    public static boolean D() {
        return e.f2498d;
    }

    public static L1.g E(L1.h hVar, Y1.a aVar) {
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            return new o(aVar);
        }
        w wVar = w.f2726a;
        if (ordinal == 1) {
            L1.n nVar = new L1.n();
            nVar.f2712d = aVar;
            nVar.f2713e = wVar;
            return nVar;
        }
        if (ordinal != 2) {
            throw new L1.f();
        }
        A a3 = new A();
        a3.f2697d = aVar;
        a3.f2698e = wVar;
        return a3;
    }

    public static o F(Y1.a aVar) {
        Z1.i.f(aVar, "initializer");
        return new o(aVar);
    }

    public static A2.o G(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr2[i4];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i4] = AbstractC0447i.H0(str).toString();
        }
        int D = l.D(0, strArr2.length - 1, 2);
        if (D >= 0) {
            while (true) {
                String str2 = strArr2[i3];
                String str3 = strArr2[i3 + 1];
                p(str2);
                t(str3, str2);
                if (i3 == D) {
                    break;
                }
                i3 += 2;
            }
        }
        return new A2.o(strArr2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r12v0 ?? I:I.p), (r8v0 ?? I:java.lang.Object) VIRTUAL call: I.p.a0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final java.lang.Object H(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r12v0 ?? I:I.p), (r8v0 ?? I:java.lang.Object) VIRTUAL call: I.p.a0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
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

    public static final void K(E e3, int i3, int i4) {
        int i5 = 1 << i3;
        int i6 = e3.f2535l;
        if ((i6 & i5) == 0) {
            e3.f2535l = i5 | i6;
            e3.f2531h[(e3.f2532i - e3.Y().f2523a) + i3] = i4;
        } else {
            C0089d.S("Already pushed argument " + e3.Y().b(i3));
            throw null;
        }
    }

    public static final void L(E e3, int i3, Object obj) {
        int i4 = 1 << i3;
        int i5 = e3.f2536m;
        if ((i5 & i4) == 0) {
            e3.f2536m = i4 | i5;
            e3.f2533j[(e3.f2534k - e3.Y().f2524b) + i3] = obj;
        } else {
            C0089d.S("Already pushed argument " + e3.Y().c(i3));
            throw null;
        }
    }

    public static String M(int i3) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i4 = i3 & 255;
        String str = "Invalid";
        sb.append((Object) (AbstractC0157a.x(i4, 1) ? "Strategy.Simple" : AbstractC0157a.x(i4, 2) ? "Strategy.HighQuality" : AbstractC0157a.x(i4, 3) ? "Strategy.Balanced" : AbstractC0157a.x(i4, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i5 = (i3 >> 8) & 255;
        sb.append((Object) (B.z(i5, 1) ? "Strictness.None" : B.z(i5, 2) ? "Strictness.Loose" : B.z(i5, 3) ? "Strictness.Normal" : B.z(i5, 4) ? "Strictness.Strict" : B.z(i5, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i6 = (i3 >> 16) & 255;
        if (i6 == 1) {
            str = "WordBreak.None";
        } else if (i6 == 2) {
            str = "WordBreak.Phrase";
        } else if (i6 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public static final String N(float f3) {
        if (Float.isNaN(f3)) {
            return "NaN";
        }
        if (Float.isInfinite(f3)) {
            return f3 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f4 = f3 * pow;
        int i3 = (int) f4;
        if (f4 - i3 >= 0.5f) {
            i3++;
        }
        float f5 = i3 / pow;
        return max > 0 ? String.valueOf(f5) : String.valueOf((int) f5);
    }

    public static final M0.d a(Context context) {
        float f3 = context.getResources().getConfiguration().fontScale;
        float f4 = context.getResources().getDisplayMetrics().density;
        N0.a a3 = N0.b.a(f3);
        if (a3 == null) {
            a3 = new M0.k(f3);
        }
        return new M0.d(f4, f3, a3);
    }

    public static final void b(Y1.a aVar, P0.o oVar, Q.a aVar2, C0113p c0113p, int i3) {
        int i4;
        int i5;
        int i6;
        Object obj;
        c0113p.S(-2032877254);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(oVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(aVar2) ? 256 : 128;
        }
        int i7 = i4;
        if ((i7 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            View view = (View) c0113p.k(AndroidCompositionLocals_androidKt.f3742f);
            M0.b bVar = (M0.b) c0113p.k(AbstractC0963b0.f8296f);
            M0.j jVar = (M0.j) c0113p.k(AbstractC0963b0.f8302l);
            C0109n L2 = C0089d.L(c0113p);
            InterfaceC0088c0 M3 = C0089d.M(aVar2, c0113p);
            UUID uuid = (UUID) H(new Object[0], null, P0.g.f3038f, c0113p, 3072, 6);
            boolean f3 = c0113p.f(view) | c0113p.f(bVar);
            Object G3 = c0113p.G();
            Object obj2 = C0105l.f2272a;
            if (f3 || G3 == obj2) {
                i5 = i7;
                i6 = 32;
                q qVar = new q(aVar, oVar, view, jVar, bVar, uuid);
                Q.a aVar3 = new Q.a(488261145, new P0.f(M3, 1), true);
                P0.n nVar = qVar.f3064j;
                nVar.setParentCompositionContext(L2);
                nVar.f3051m.setValue(aVar3);
                nVar.f3053o = true;
                if (nVar.f8281g == null && !nVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                nVar.c();
                c0113p.a0(qVar);
                obj = qVar;
            } else {
                i5 = i7;
                i6 = 32;
                obj = G3;
            }
            q qVar2 = (q) obj;
            boolean h3 = c0113p.h(qVar2);
            Object G4 = c0113p.G();
            if (h3 || G4 == obj2) {
                G4 = new P0.b(qVar2, 0);
                c0113p.a0(G4);
            }
            C0089d.c(qVar2, (Y1.c) G4, c0113p);
            boolean h4 = c0113p.h(qVar2) | ((i5 & 14) == 4) | ((i5 & 112) == i6) | c0113p.f(jVar);
            Object G5 = c0113p.G();
            if (h4 || G5 == obj2) {
                G5 = new P0.c(qVar2, aVar, oVar, jVar, 0);
                c0113p.a0(G5);
            }
            C0089d.g((Y1.a) G5, c0113p);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.d(aVar, oVar, aVar2, i3, 0);
        }
    }

    public static final long c(int i3, int i4) {
        return (i4 & 4294967295L) | (i3 << 32);
    }

    public static final void d(I1.c cVar, Y1.a aVar, C0113p c0113p, int i3) {
        int i4;
        long j3;
        c0113p.S(1514328598);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(cVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            boolean z3 = cVar.f2462f;
            boolean z4 = cVar.f2463g;
            boolean z5 = z3 || z4;
            if (z4) {
                c0113p.Q(1312528517);
                j3 = C0288u.b(((J) c0113p.k(L.f1045a)).f997f, 0.22f);
                c0113p.p(false);
            } else if (z5) {
                c0113p.Q(1312530553);
                j3 = ((J) c0113p.k(L.f1045a)).p;
                c0113p.p(false);
            } else {
                c0113p.Q(1312532153);
                j3 = ((J) c0113p.k(L.f1045a)).f992a;
                c0113p.p(false);
            }
            A0.c(aVar, androidx.compose.foundation.layout.a.c(U.i.f3302a, 0.82f), !z5, null, A0.f(j3, c0113p), null, null, null, Q.f.b(112843211, new I1.g(z5, cVar), c0113p), c0113p, ((i4 >> 3) & 14) | 100663344, 232);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new G1.i(i3, 3, cVar, aVar);
        }
    }

    public static final void e(I1.m mVar, InterfaceC0796H interfaceC0796H, C0113p c0113p, int i3) {
        int i4;
        U.l g3;
        C0113p c0113p2;
        U.l g4;
        boolean z3;
        U.l g5;
        C0906n c0906n;
        C0900h c0900h;
        Z1.i.f(interfaceC0796H, "contentPadding");
        c0113p.S(-2005147620);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(mVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(interfaceC0796H) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            InterfaceC0088c0 u3 = AbstractC0381e.u(mVar.f2485d, c0113p);
            U.i iVar = U.i.f3302a;
            float f3 = 16;
            float f4 = 12;
            U.l o3 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.f3645b, f3, interfaceC0796H.d() + f4, f3, interfaceC0796H.c() + f3);
            C0807d c0807d = AbstractC0813j.f7061a;
            C0810g c0810g = new C0810g(14);
            U.b bVar = U.a.f3291o;
            C0823u a3 = AbstractC0821s.a(c0810g, bVar, c0113p, 6);
            int i5 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c3 = U.m.c(c0113p, o3);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n2 = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n2);
            } else {
                c0113p.d0();
            }
            C0900h c0900h2 = C0901i.f7923e;
            C0089d.Q(c0113p, c0900h2, a3);
            C0900h c0900h3 = C0901i.f7922d;
            C0089d.Q(c0113p, c0900h3, m3);
            C0900h c0900h4 = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i5))) {
                AbstractC0080b.p(i5, c0113p, i5, c0900h4);
            }
            C0900h c0900h5 = C0901i.f7921c;
            C0089d.Q(c0113p, c0900h5, c3);
            c0113p.Q(2133653034);
            C0823u a4 = AbstractC0821s.a(new C0810g(2), bVar, c0113p, 6);
            int i6 = c0113p.f2306P;
            InterfaceC0110n0 m4 = c0113p.m();
            U.l c4 = U.m.c(c0113p, iVar);
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n2);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, c0900h2, a4);
            C0089d.Q(c0113p, c0900h3, m4);
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i6))) {
                AbstractC0080b.p(i6, c0113p, i6, c0900h4);
            }
            C0089d.Q(c0113p, c0900h5, c4);
            C c5 = A0.i(c0113p).f1189f;
            F0.l lVar = F0.l.f1457i;
            X0.b("Memory Match", null, A0.h(c0113p).f1006o, 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, c5, c0113p, 196614, 0, 65498);
            X0.b("Pair each joint diagram with its name", null, A0.h(c0113p).f1009s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, A0.i(c0113p).f1194k, c0113p, 6, 0, 65530);
            c0113p.p(true);
            long j3 = A0.h(c0113p).f1008r;
            C1050d a5 = x.e.a(f4);
            g3 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
            U0.a(g3, a5, j3, 0L, 0.0f, 0.0f, null, Q.f.b(88062251, new G1.k(4, u3), c0113p), c0113p, 12582918, 120);
            c0113p.Q(-69683996);
            boolean z4 = ((I1.i) u3.getValue()).f2475f;
            X x3 = C0105l.f2272a;
            if (z4) {
                g5 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
                U.l a6 = C0824v.a(g5);
                InterfaceC0827A e3 = AbstractC0818o.e(U.a.f3284h, false);
                int i7 = c0113p.f2306P;
                InterfaceC0110n0 m5 = c0113p.m();
                U.l c6 = U.m.c(c0113p, a6);
                c0113p.U();
                if (c0113p.f2305O) {
                    c0906n = c0906n2;
                    c0113p.l(c0906n);
                } else {
                    c0906n = c0906n2;
                    c0113p.d0();
                }
                C0089d.Q(c0113p, c0900h2, e3);
                C0089d.Q(c0113p, c0900h3, m5);
                if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i7))) {
                    c0900h = c0900h4;
                    AbstractC0080b.p(i7, c0113p, i7, c0900h);
                } else {
                    c0900h = c0900h4;
                }
                C0089d.Q(c0113p, c0900h5, c6);
                C0823u a7 = AbstractC0821s.a(new C0810g(f4), U.a.p, c0113p, 54);
                int i8 = c0113p.f2306P;
                InterfaceC0110n0 m6 = c0113p.m();
                U.l c7 = U.m.c(c0113p, iVar);
                c0113p.U();
                if (c0113p.f2305O) {
                    c0113p.l(c0906n);
                } else {
                    c0113p.d0();
                }
                C0089d.Q(c0113p, c0900h2, a7);
                C0089d.Q(c0113p, c0900h3, m6);
                if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i8))) {
                    AbstractC0080b.p(i8, c0113p, i8, c0900h);
                }
                C0089d.Q(c0113p, c0900h5, c7);
                X0.b(AbstractC0080b.i("Cleared in ", ((I1.i) u3.getValue()).f2471b, " moves"), null, A0.h(c0113p).f992a, 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, A0.i(c0113p).f1189f, c0113p, 196608, 0, 65498);
                I1.i iVar2 = (I1.i) u3.getValue();
                int i9 = iVar2.f2471b;
                X0.b(AbstractC0080b.i("Efficiency ", i9 == 0 ? 0 : (iVar2.f2473d * 100) / i9, "%"), null, A0.h(c0113p).f1006o, 0L, null, null, null, 0L, null, new L0.f(3), 0L, 0, false, 0, 0, null, A0.i(c0113p).f1191h, c0113p, 0, 0, 65018);
                c0113p2 = c0113p;
                c0113p2.Q(1027247601);
                boolean h3 = c0113p2.h(mVar);
                Object G3 = c0113p.G();
                if (h3 || G3 == x3) {
                    G3 = new D1.g(4, mVar);
                    c0113p2.a0(G3);
                }
                c0113p2.p(false);
                A0.e((Y1.a) G3, null, false, null, null, null, null, null, null, I1.b.f2456a, c0113p, 805306368);
                c0113p2.p(true);
                c0113p2.p(true);
                c0113p2.p(false);
                c0113p2.p(false);
                z3 = true;
            } else {
                c0113p2 = c0113p;
                c0113p2.p(false);
                C0891a c0891a = new C0891a();
                float f5 = 10;
                C0810g c0810g2 = new C0810g(f5);
                C0810g c0810g3 = new C0810g(f5);
                g4 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
                U.l a8 = C0824v.a(g4);
                c0113p2.Q(-69639649);
                boolean f6 = c0113p2.f(u3) | c0113p2.h(mVar);
                Object G4 = c0113p.G();
                if (f6 || G4 == x3) {
                    G4 = new H1.o(u3, mVar);
                    c0113p2.a0(G4);
                }
                c0113p2.p(false);
                AbstractC0416e.f(c0891a, a8, null, null, false, c0810g3, c0810g2, null, false, (Y1.c) G4, c0113p, 1769472);
                c0113p2.p(false);
                z3 = true;
            }
            c0113p2.p(z3);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new G1.i(i3, 2, mVar, interfaceC0796H);
        }
    }

    public static final void f(final int i3, C0113p c0113p) {
        boolean z3;
        Object obj;
        c0113p.S(-317298375);
        if (i3 == 0 && c0113p.x()) {
            c0113p.L();
        } else {
            Object G3 = c0113p.G();
            Object obj2 = C0105l.f2272a;
            Object obj3 = G3;
            if (G3 == obj2) {
                Object c0583h = new C0583H();
                c0113p.a0(c0583h);
                obj3 = c0583h;
            }
            C0583H c0583h2 = (C0583H) obj3;
            c0583h2.a(0, c0113p);
            C0579D c0579d = new C0579D(AbstractC0595e.i(1400, 0, AbstractC0614y.f5880a, 2), 2, 0);
            Float valueOf = Float.valueOf(1.0f);
            Float valueOf2 = Float.valueOf(1.06f);
            y0 y0Var = z0.f5885a;
            Object G4 = c0113p.G();
            Object obj4 = G4;
            if (G4 == obj2) {
                Object c0580e = new C0580E(c0583h2, valueOf, valueOf2, c0579d);
                c0113p.a0(c0580e);
                obj4 = c0580e;
            }
            Object obj5 = (C0580E) obj4;
            boolean h3 = c0113p.h(c0579d);
            Object G5 = c0113p.G();
            Object obj6 = G5;
            if (h3 || G5 == obj2) {
                Object cVar = new P0.c(valueOf, obj5, valueOf2, c0579d, 1);
                c0113p.a0(cVar);
                obj6 = cVar;
            }
            C0089d.g((Y1.a) obj6, c0113p);
            boolean h4 = c0113p.h(c0583h2);
            Object G6 = c0113p.G();
            Object obj7 = G6;
            if (h4 || G6 == obj2) {
                Object d02 = new D0(c0583h2, 14, obj5);
                c0113p.a0(d02);
                obj7 = d02;
            }
            C0089d.c(obj5, (Y1.c) obj7, c0113p);
            long c3 = AbstractC0259J.c(4279967309L);
            F0.a aVar = AbstractC0259J.f4215a;
            FillElement fillElement = androidx.compose.foundation.layout.a.f3645b;
            U.l a3 = androidx.compose.foundation.a.a(fillElement, c3, aVar);
            InterfaceC0827A e3 = AbstractC0818o.e(U.a.f3280d, false);
            int i4 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c4 = U.m.c(c0113p, a3);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, e3);
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i4))) {
                AbstractC0080b.p(i4, c0113p, i4, c0900h);
            }
            C0089d.Q(c0113p, C0901i.f7921c, c4);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f3646a;
            AbstractC0381e.b(g2.i.U(R.drawable.splash_bg, c0113p), fillElement, null, C0836i.f7146a, 0.0f, null, c0113p, 25008, 104);
            AbstractC0393b U2 = g2.i.U(R.drawable.splash_crest, c0113p);
            U.l c5 = androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.a.g(bVar.a(), 0.62f), 1.0f);
            c0113p.Q(-1571188035);
            boolean f3 = c0113p.f(obj5);
            Object G7 = c0113p.G();
            if (f3 || G7 == obj2) {
                z3 = false;
                Object kVar = new E1.k(false ? 1 : 0, obj5);
                c0113p.a0(kVar);
                obj = kVar;
            } else {
                z3 = false;
                obj = G7;
            }
            c0113p.p(z3);
            AbstractC0381e.b(U2, androidx.compose.ui.graphics.a.a(c5, (Y1.c) obj), null, null, 0.0f, null, c0113p, 48, 120);
            c0113p.p(true);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new Y1.e() { // from class: E1.l
                @Override // Y1.e
                public final Object g(Object obj8, Object obj9) {
                    ((Integer) obj9).intValue();
                    I2.d.f(C0089d.T(i3 | 1), (C0113p) obj8);
                    return z.f2729a;
                }
            };
        }
    }

    public static final void g(final String str, final int i3, int i4, long j3, U.l lVar, C0113p c0113p, final int i5, final int i6) {
        int i7;
        long j4;
        long j5;
        int i8;
        U.l lVar2;
        final int i9;
        final long j6;
        final U.l lVar3;
        int i10;
        c0113p.S(1451217011);
        if ((i5 & 6) == 0) {
            i7 = (c0113p.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= c0113p.d(i3) ? 32 : 16;
        }
        int i11 = i7 | 384;
        if ((i5 & 3072) == 0) {
            if ((i6 & 8) == 0) {
                j4 = j3;
                if (c0113p.e(j4)) {
                    i10 = 2048;
                    i11 |= i10;
                }
            } else {
                j4 = j3;
            }
            i10 = 1024;
            i11 |= i10;
        } else {
            j4 = j3;
        }
        int i12 = i11 | 24576;
        if ((i12 & 9363) == 9362 && c0113p.x()) {
            c0113p.L();
            i9 = i4;
            lVar3 = lVar;
            j6 = j4;
        } else {
            c0113p.N();
            int i13 = i5 & 1;
            U.i iVar = U.i.f3302a;
            if (i13 == 0 || c0113p.w()) {
                if ((i6 & 8) != 0) {
                    j4 = ((J) c0113p.k(L.f1045a)).f997f;
                    i12 &= -7169;
                }
                j5 = j4;
                i8 = 5;
                lVar2 = iVar;
            } else {
                c0113p.L();
                if ((i6 & 8) != 0) {
                    i12 &= -7169;
                }
                i8 = i4;
                lVar2 = lVar;
                j5 = j4;
            }
            c0113p.q();
            U.c cVar = U.a.f3290n;
            C0807d c0807d = AbstractC0813j.f7061a;
            C0802N a3 = AbstractC0801M.a(new C0810g(8), cVar, c0113p, 54);
            int i14 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c3 = U.m.c(c0113p, lVar2);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0900h c0900h = C0901i.f7923e;
            C0089d.Q(c0113p, c0900h, a3);
            C0900h c0900h2 = C0901i.f7922d;
            C0089d.Q(c0113p, c0900h2, m3);
            C0900h c0900h3 = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i14))) {
                AbstractC0080b.p(i14, c0113p, i14, c0900h3);
            }
            C0900h c0900h4 = C0901i.f7921c;
            C0089d.Q(c0113p, c0900h4, c3);
            int i15 = i8;
            U.l lVar4 = lVar2;
            X0.b(str, null, ((J) c0113p.k(L.f1045a)).f1009s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p.k(b1.f1200a)).f1197n, c0113p, i12 & 14, 0, 65530);
            C0802N a4 = AbstractC0801M.a(new C0810g(3), U.a.f3289m, c0113p, 6);
            int i16 = c0113p.f2306P;
            InterfaceC0110n0 m4 = c0113p.m();
            U.l c4 = U.m.c(c0113p, iVar);
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, c0900h, a4);
            C0089d.Q(c0113p, c0900h2, m4);
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i16))) {
                AbstractC0080b.p(i16, c0113p, i16, c0900h3);
            }
            C0089d.Q(c0113p, c0900h4, c4);
            c0113p.Q(-1945528784);
            if (1 <= i15) {
                int i17 = 1;
                while (true) {
                    U.l m5 = l.m(androidx.compose.foundation.layout.a.q(iVar, 11), x.e.f8716a);
                    c0113p.Q(-1945521836);
                    long b2 = i17 <= i3 ? j5 : C0288u.b(((J) c0113p.k(L.f1045a)).f1009s, 0.22f);
                    c0113p.p(false);
                    AbstractC0818o.a(androidx.compose.foundation.a.a(m5, b2, AbstractC0259J.f4215a), c0113p, 0);
                    if (i17 == i15) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            c0113p.p(false);
            c0113p.p(true);
            c0113p.p(true);
            i9 = i15;
            j6 = j5;
            lVar3 = lVar4;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new Y1.e() { // from class: F1.d
                @Override // Y1.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int T2 = C0089d.T(i5 | 1);
                    String str2 = str;
                    l lVar5 = lVar3;
                    I2.d.g(str2, i3, i9, j6, lVar5, (C0113p) obj, T2, i6);
                    return z.f2729a;
                }
            };
        }
    }

    public static final long h(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final long i(int i3, int i4) {
        if (i3 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i3 + ", end: " + i4 + ']').toString());
        }
        if (i4 >= 0) {
            long j3 = (i4 & 4294967295L) | (i3 << 32);
            int i5 = B0.B.f232c;
            return j3;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i3 + ", end: " + i4 + ']').toString());
    }

    public static final void j(U.l lVar, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-1177876616);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(lVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            P0.i iVar = P0.i.f3043a;
            int i5 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c3 = U.m.c(c0113p, lVar);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            int i6 = (((((i4 << 3) & 112) | (((i4 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, iVar);
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i5))) {
                AbstractC0080b.p(i5, c0113p, i5, c0900h);
            }
            C0089d.Q(c0113p, C0901i.f7921c, c3);
            aVar.g(c0113p, Integer.valueOf((i6 >> 6) & 14));
            c0113p.p(true);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new V0(i3, 3, lVar, aVar);
        }
    }

    public static final void k(int i3, List list) {
        int size = list.size();
        if (i3 < 0 || i3 >= size) {
            throw new IndexOutOfBoundsException("Index " + i3 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void l(List list, int i3, int i4) {
        int size = list.size();
        if (i3 > i4) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i3 + ") is greater than toIndex (" + i4 + ").");
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0080b.i("fromIndex (", i3, ") is less than 0."));
        }
        if (i4 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is more than than the list size (" + size + ')');
    }

    public static final boolean m(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        Z1.i.f(bArr, "a");
        Z1.i.f(bArr2, "b");
        for (int i6 = 0; i6 < i5; i6++) {
            if (bArr[i6 + i3] != bArr2[i6 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static N1.i n(N1.i iVar) {
        N1.g gVar = iVar.f2891d;
        gVar.b();
        return gVar.f2884l > 0 ? iVar : N1.i.f2890e;
    }

    public static void o(int i3, int i4, int i5) {
        if (i3 >= 0 && i4 <= i5) {
            if (i3 > i4) {
                throw new IllegalArgumentException(AbstractC0080b.g(i3, i4, "startIndex: ", " > endIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i3 + ", endIndex: " + i4 + ", size: " + i5);
    }

    public static void p(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(B2.c.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i3), str).toString());
            }
        }
    }

    public static final void q(long j3, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j3 || j3 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException("size=" + j3 + " offset=" + j4 + " byteCount=" + j5);
        }
    }

    public static void r(int i3, int i4, int i5) {
        if (i3 >= 0 && i4 <= i5) {
            if (i3 > i4) {
                throw new IllegalArgumentException(AbstractC0080b.g(i3, i4, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
    }

    public static int s(Context context, String str) {
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : S0.c.a(new S0.d(context).f3275a) ? 0 : -1;
    }

    public static void t(String str, String str2) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(B2.c.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i3), str2));
                sb.append(B2.c.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void u(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                B.o(th, th2);
            }
        }
    }

    public static final boolean v(int i3, int i4) {
        return i3 == i4;
    }

    public static String w(List list, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static A2.B x(String str) {
        Z1.i.f(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return A2.B.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return A2.B.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return A2.B.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return A2.B.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return A2.B.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final String y(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final long z(long j3) {
        if (j3 != 9205357640488583168L) {
            return l.f(Float.intBitsToFloat((int) (j3 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j3 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public abstract void J(boolean z3);

    public void I(boolean z3) {
    }
}
