package x4;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731a extends z3.i {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0019. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [n6.i] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [n6.i] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [x4.d] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // z3.i
    public final java.lang.Object b(V5.g r14) {
        /*
            r13 = this;
            n6.i r0 = n6.i.f5525i
            long r1 = r14.h()
            r3 = 0
            r5 = r3
            r6 = r5
        L9:
            r7 = r6
        La:
            r8 = r7
        Lb:
            r9 = r8
        Lc:
            r10 = r9
        Ld:
            r11 = r10
        Le:
            java.lang.Object r4 = r14.f2734g
            z3.a r4 = (z3.a) r4
            int r4 = r4.f()
            r12 = -1
            if (r4 == r12) goto L81
            switch(r4) {
                case 1: goto L76;
                case 2: goto L6a;
                case 3: goto L5d;
                case 4: goto L4f;
                case 5: goto L40;
                case 6: goto L30;
                case 7: goto L20;
                default: goto L1c;
            }
        L1c:
            r14.o(r4)
            goto Le
        L20:
            z3.c r4 = z3.i.f6317n
            java.lang.Object r4 = r4.b(r14)
            r11 = r4
            n6.i r11 = (n6.i) r11
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            goto Le
        L30:
            x4.k r4 = x4.l.f6221i
            java.lang.Object r4 = r4.b(r14)
            r10 = r4
            x4.l r10 = (x4.l) r10
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            goto Le
        L40:
            x4.c r4 = x4.d.f6206i
            java.lang.Object r4 = r4.b(r14)
            r9 = r4
            x4.d r9 = (x4.d) r9
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r10 = r8
            goto Ld
        L4f:
            z3.c r4 = z3.i.f6316m
            java.lang.Object r4 = r4.b(r14)
            r8 = r4
            java.lang.Double r8 = (java.lang.Double) r8
            r5 = r3
            r6 = r5
            r7 = r6
            r9 = r7
            goto Lc
        L5d:
            z3.c r4 = z3.i.f6313j
            java.lang.Object r4 = r4.b(r14)
            r7 = r4
            java.lang.Long r7 = (java.lang.Long) r7
            r5 = r3
            r6 = r5
            r8 = r6
            goto Lb
        L6a:
            z3.c r4 = z3.i.f6309f
            java.lang.Object r4 = r4.b(r14)
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r5 = r3
            r7 = r5
            goto La
        L76:
            z3.c r4 = z3.i.f6318o
            java.lang.Object r4 = r4.b(r14)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r6 = r3
            goto L9
        L81:
            n6.i r14 = r14.i(r1)
            java.lang.String r1 = "unknownFields"
            kotlin.jvm.internal.i.e(r14, r1)
            int r1 = r14.a()
            if (r1 <= 0) goto La2
            n6.f r3 = new n6.f
            r3.<init>()
            java.lang.String r1 = "value"
            kotlin.jvm.internal.i.e(r0, r1)
            r3.G(r0)
            n6.i r0 = n6.i.f5525i
            r3.G(r14)
        La2:
            x4.b r4 = new x4.b
            if (r3 == 0) goto Lac
            long r0 = r3.f5524g
            n6.i r0 = r3.f(r0)
        Lac:
            r12 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C0731a.b(V5.g):java.lang.Object");
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        b bVar = (b) obj;
        z3.i.f6318o.e(dVar, 1, bVar.f6199h);
        z3.i.f6309f.e(dVar, 2, bVar.f6200i);
        z3.i.f6313j.e(dVar, 3, bVar.f6201j);
        z3.i.f6316m.e(dVar, 4, bVar.f6202k);
        d.f6206i.e(dVar, 5, bVar.f6203l);
        l.f6221i.e(dVar, 6, bVar.f6204m);
        z3.i.f6317n.e(dVar, 7, bVar.f6205n);
        dVar.l(bVar.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        b bVar = (b) obj;
        return bVar.a().a() + z3.i.f6317n.g(7, bVar.f6205n) + l.f6221i.g(6, bVar.f6204m) + d.f6206i.g(5, bVar.f6203l) + z3.i.f6316m.g(4, bVar.f6202k) + z3.i.f6313j.g(3, bVar.f6201j) + z3.i.f6309f.g(2, bVar.f6200i) + z3.i.f6318o.g(1, bVar.f6199h);
    }
}
