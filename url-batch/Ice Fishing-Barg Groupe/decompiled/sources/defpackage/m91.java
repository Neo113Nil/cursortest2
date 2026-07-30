package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m91 extends jc2 implements pe0 {
    public /* synthetic */ Object BRwzKIf41E4i;
    public final /* synthetic */ pe0 EcgxDIVH5in8;
    public n91 QrzZRwfaDlRX;
    public final /* synthetic */ n91 RfyTYNmI9Srp;
    public final /* synthetic */ Object S9EYkSpbGuxq;
    public final /* synthetic */ h91 XL4ISE6Oc65B;
    public Object cpQdD2nAriOS;
    public int gPXPFXrUH4XX;
    public Object r3s1LDPKFs1S;
    public p91 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m91(h91 h91Var, n91 n91Var, pe0 pe0Var, Object obj, bt btVar) {
        super(2, btVar);
        this.XL4ISE6Oc65B = h91Var;
        this.RfyTYNmI9Srp = n91Var;
        this.EcgxDIVH5in8 = pe0Var;
        this.S9EYkSpbGuxq = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.nc
    public final java.lang.Object RfyTYNmI9Srp(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.gPXPFXrUH4XX
            r1 = 2
            r2 = 1
            r3 = 0
            su r4 = defpackage.su.rtx2ld2ELZv4
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.cpQdD2nAriOS
            n91 r0 = (defpackage.n91) r0
            p91 r1 = r8.x50lh2ztY7Y5
            java.lang.Object r8 = r8.BRwzKIf41E4i
            k91 r8 = (defpackage.k91) r8
            defpackage.ng0.tmVwIGCQF4zR(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u9.rtx2ld2ELZv4(r8)
            return r3
        L25:
            n91 r0 = r8.QrzZRwfaDlRX
            java.lang.Object r2 = r8.r3s1LDPKFs1S
            java.lang.Object r5 = r8.cpQdD2nAriOS
            pe0 r5 = (defpackage.pe0) r5
            p91 r6 = r8.x50lh2ztY7Y5
            java.lang.Object r7 = r8.BRwzKIf41E4i
            k91 r7 = (defpackage.k91) r7
            defpackage.ng0.tmVwIGCQF4zR(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            defpackage.ng0.tmVwIGCQF4zR(r9)
            java.lang.Object r9 = r8.BRwzKIf41E4i
            ru r9 = (defpackage.ru) r9
            k91 r0 = new k91
            hu r9 = r9.cpQdD2nAriOS()
            ih0 r5 = defpackage.ih0.BRwzKIf41E4i
            fu r9 = r9.S2OOm9zPNm0h(r5)
            r9.getClass()
            xs0 r9 = (defpackage.xs0) r9
            h91 r5 = r8.XL4ISE6Oc65B
            r0.<init>(r5, r9)
            n91 r9 = r8.RfyTYNmI9Srp
            defpackage.n91.PxuCJdSBwIXG(r9, r0)
            r91 r5 = r9.lS5Rgt96tfkO
            r8.BRwzKIf41E4i = r0
            r8.x50lh2ztY7Y5 = r5
            pe0 r6 = r8.EcgxDIVH5in8
            r8.cpQdD2nAriOS = r6
            java.lang.Object r7 = r8.S9EYkSpbGuxq
            r8.r3s1LDPKFs1S = r7
            r8.QrzZRwfaDlRX = r9
            r8.gPXPFXrUH4XX = r2
            java.lang.Object r2 = r5.a92UlCVFR9N8(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.BRwzKIf41E4i = r0     // Catch: java.lang.Throwable -> La5
            r8.x50lh2ztY7Y5 = r5     // Catch: java.lang.Throwable -> La5
            r8.cpQdD2nAriOS = r9     // Catch: java.lang.Throwable -> La5
            r8.r3s1LDPKFs1S = r3     // Catch: java.lang.Throwable -> La5
            r8.QrzZRwfaDlRX = r3     // Catch: java.lang.Throwable -> La5
            r8.gPXPFXrUH4XX = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.rtx2ld2ELZv4(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.PxuCJdSBwIXG     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.lS5Rgt96tfkO(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.PxuCJdSBwIXG     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.lS5Rgt96tfkO(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m91.RfyTYNmI9Srp(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        m91 m91Var = new m91(this.XL4ISE6Oc65B, this.RfyTYNmI9Srp, this.EcgxDIVH5in8, this.S9EYkSpbGuxq, btVar);
        m91Var.BRwzKIf41E4i = obj;
        return m91Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((m91) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
