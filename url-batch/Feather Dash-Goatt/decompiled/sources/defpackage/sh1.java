package defpackage;

import android.os.Trace;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sh1 extends zl0 implements ad0, gu, j81 {
    public tu0 A;
    public qh1 B;
    public rh1 C;
    public String s;
    public th1 t;
    public v10 u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public HashMap z;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r1 != null) goto L15;
     */
    @Override // defpackage.gu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(ld0 ld0Var) {
        tu0 z0;
        if (this.r) {
            rh1 rh1Var = this.C;
            if (rh1Var != null) {
                if (!rh1Var.c) {
                    rh1Var = null;
                }
                if (rh1Var != null) {
                    z0 = rh1Var.d;
                }
            }
            z0 = z0();
            x5 x5Var = z0.j;
            if (x5Var == null) {
                r80.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.A + ", textSubstitution=" + this.C + ')');
                throw new kc0();
            }
            xf g = ld0Var.d.e.g();
            boolean z = z0.k;
            if (z) {
                long j = z0.l;
                g.k();
                g.g(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                jc1 jc1Var = this.t.a;
                wg1 wg1Var = jc1Var.m;
                if (wg1Var == null) {
                    wg1Var = wg1.b;
                }
                s91 s91Var = jc1Var.n;
                if (s91Var == null) {
                    s91Var = s91.d;
                }
                p4 p4Var = jc1Var.o;
                if (p4Var == null) {
                    p4Var = uy.q;
                }
                op j2 = jc1Var.a.j();
                if (j2 != null) {
                    float k = this.t.a.a.k();
                    l6 l6Var = x5Var.a.k;
                    int i = l6Var.c;
                    l6Var.c(j2, (Float.floatToRawIntBits(x5Var.c()) << 32) | (Float.floatToRawIntBits(x5Var.b()) & 4294967295L), k);
                    l6Var.f(s91Var);
                    l6Var.g(wg1Var);
                    l6Var.e(p4Var);
                    l6Var.b(3);
                    x5Var.d(g);
                    l6Var.b(i);
                } else {
                    long j3 = hi.g;
                    if (j3 == 16) {
                        j3 = this.t.b() != 16 ? this.t.b() : hi.b;
                    }
                    l6 l6Var2 = x5Var.a.k;
                    int i2 = l6Var2.c;
                    l6Var2.d(j3);
                    l6Var2.f(s91Var);
                    l6Var2.g(wg1Var);
                    l6Var2.e(p4Var);
                    l6Var2.b(3);
                    x5Var.d(g);
                    l6Var2.b(i2);
                }
                if (z) {
                    g.i();
                }
            } catch (Throwable th) {
                if (z) {
                    g.i();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r0 != null) goto L13;
     */
    @Override // defpackage.ad0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        tu0 z0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            rh1 rh1Var = this.C;
            if (rh1Var != null) {
                if (!rh1Var.c) {
                    rh1Var = null;
                }
                if (rh1Var != null) {
                    z0 = rh1Var.d;
                }
            }
            z0 = z0();
            z0.c(ej0Var);
            boolean a = z0.a(j, ej0Var.getLayoutDirection());
            su0 su0Var = z0.n;
            if (su0Var != null) {
                su0Var.c();
            }
            x5 x5Var = z0.j;
            x5Var.getClass();
            fh1 fh1Var = x5Var.d;
            long j2 = z0.l;
            if (a) {
                op.G(this, 2).Q0();
                HashMap hashMap = this.z;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.z = hashMap;
                }
                hashMap.put(z2.a, Integer.valueOf(Math.round(fh1Var.c(0))));
                hashMap.put(z2.b, Integer.valueOf(Math.round(fh1Var.c(fh1Var.f - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (4294967295L & j2);
            zw0 c = qk0Var.c(la0.E(i, i, i2, i2));
            HashMap hashMap2 = this.z;
            hashMap2.getClass();
            return ej0Var.D(i, i2, hashMap2, null, new aa(c, 5));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [qh1] */
    @Override // defpackage.j81
    public final void W(u81 u81Var) {
        qh1 qh1Var = this.B;
        qh1 qh1Var2 = qh1Var;
        if (qh1Var == null) {
            final int i = 0;
            ?? r0 = new Function1(this) { // from class: qh1
                public final /* synthetic */ sh1 e;

                {
                    this.e = this;
                }

                /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                    	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
                    	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
                    	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
                    */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r45v0 ??
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
                /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                    	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
                    	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
                    */
            };
            this.B = r0;
            qh1Var2 = r0;
        }
        y7 y7Var = new y7(this.s);
        dc0[] dc0VarArr = s81.a;
        u81Var.a(p81.z, yh.b(y7Var));
        rh1 rh1Var = this.C;
        if (rh1Var != null) {
            boolean z = rh1Var.c;
            t81 t81Var = p81.B;
            dc0[] dc0VarArr2 = s81.a;
            dc0 dc0Var = dc0VarArr2[17];
            u81Var.a(t81Var, Boolean.valueOf(z));
            y7 y7Var2 = new y7(rh1Var.b);
            t81 t81Var2 = p81.A;
            dc0 dc0Var2 = dc0VarArr2[16];
            u81Var.a(t81Var2, y7Var2);
        }
        final int i2 = 1;
        u81Var.a(g81.l, new z0(null, new Function1(this) { // from class: qh1
            public final /* synthetic */ sh1 e;

            {
                this.e = this;
            }

            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r45v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                */
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r45v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
                */
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                */
        }));
        final int i3 = 2;
        u81Var.a(g81.m, new z0(null, new Function1(this) { // from class: qh1
            public final /* synthetic */ sh1 e;

            {
                this.e = this;
            }

            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r45v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
                */
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r45v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
                */
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                */
        }));
        u81Var.a(g81.n, new z0(null, new i6(13, this)));
        u81Var.a(g81.a, new z0(null, qh1Var2));
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }

    public final tu0 z0() {
        if (this.A == null) {
            this.A = new tu0(this.s, this.t, this.u, this.v, this.w, this.x, this.y);
        }
        tu0 tu0Var = this.A;
        tu0Var.getClass();
        return tu0Var;
    }
}
