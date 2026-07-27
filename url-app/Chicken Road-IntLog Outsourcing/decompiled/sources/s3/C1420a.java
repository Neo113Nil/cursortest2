package s3;

import m2.AbstractC1286i;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1420a extends AbstractC1286i {
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
    /* JADX WARN: Type inference failed for: r11v1, types: [j5.i] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [j5.i] */
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
    /* JADX WARN: Type inference failed for: r9v3, types: [s3.d] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // m2.AbstractC1286i
    public final java.lang.Object b(V0.j r14) {
        /*
            r13 = this;
            j5.i r0 = j5.i.f10496d
            long r1 = r14.z()
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
            java.lang.Object r4 = r14.f3212b
            m2.a r4 = (m2.C1278a) r4
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
            r14.O(r4)
            goto Le
        L20:
            m2.c r4 = m2.AbstractC1286i.f11171n
            java.lang.Object r4 = r4.b(r14)
            r11 = r4
            j5.i r11 = (j5.i) r11
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            goto Le
        L30:
            s3.k r4 = s3.l.f11835d
            java.lang.Object r4 = r4.b(r14)
            r10 = r4
            s3.l r10 = (s3.l) r10
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            goto Le
        L40:
            s3.c r4 = s3.d.f11820d
            java.lang.Object r4 = r4.b(r14)
            r9 = r4
            s3.d r9 = (s3.d) r9
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r10 = r8
            goto Ld
        L4f:
            m2.c r4 = m2.AbstractC1286i.f11170m
            java.lang.Object r4 = r4.b(r14)
            r8 = r4
            java.lang.Double r8 = (java.lang.Double) r8
            r5 = r3
            r6 = r5
            r7 = r6
            r9 = r7
            goto Lc
        L5d:
            m2.c r4 = m2.AbstractC1286i.f11167j
            java.lang.Object r4 = r4.b(r14)
            r7 = r4
            java.lang.Long r7 = (java.lang.Long) r7
            r5 = r3
            r6 = r5
            r8 = r6
            goto Lb
        L6a:
            m2.c r4 = m2.AbstractC1286i.f11163f
            java.lang.Object r4 = r4.b(r14)
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r5 = r3
            r7 = r5
            goto La
        L76:
            m2.c r4 = m2.AbstractC1286i.f11172o
            java.lang.Object r4 = r4.b(r14)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r6 = r3
            goto L9
        L81:
            j5.i r14 = r14.D(r1)
            java.lang.String r1 = "unknownFields"
            kotlin.jvm.internal.i.e(r14, r1)
            int r1 = r14.a()
            if (r1 <= 0) goto La2
            j5.f r3 = new j5.f
            r3.<init>()
            java.lang.String r1 = "value"
            kotlin.jvm.internal.i.e(r0, r1)
            r3.G(r0)
            j5.i r0 = j5.i.f10496d
            r3.G(r14)
        La2:
            s3.b r14 = new s3.b
            if (r3 == 0) goto Lac
            long r0 = r3.f10495b
            j5.i r0 = r3.o(r0)
        Lac:
            r12 = r0
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1420a.b(V0.j):java.lang.Object");
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e eVar, Object obj) {
        b bVar = (b) obj;
        AbstractC1286i.f11172o.e(eVar, 1, bVar.f11813c);
        AbstractC1286i.f11163f.e(eVar, 2, bVar.f11814d);
        AbstractC1286i.f11167j.e(eVar, 3, bVar.f11815e);
        AbstractC1286i.f11170m.e(eVar, 4, bVar.f11816f);
        d.f11820d.e(eVar, 5, bVar.f11817g);
        l.f11835d.e(eVar, 6, bVar.f11818h);
        AbstractC1286i.f11171n.e(eVar, 7, bVar.f11819i);
        eVar.D(bVar.a());
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        b bVar = (b) obj;
        return bVar.a().a() + AbstractC1286i.f11171n.g(7, bVar.f11819i) + l.f11835d.g(6, bVar.f11818h) + d.f11820d.g(5, bVar.f11817g) + AbstractC1286i.f11170m.g(4, bVar.f11816f) + AbstractC1286i.f11167j.g(3, bVar.f11815e) + AbstractC1286i.f11163f.g(2, bVar.f11814d) + AbstractC1286i.f11172o.g(1, bVar.f11813c);
    }
}
