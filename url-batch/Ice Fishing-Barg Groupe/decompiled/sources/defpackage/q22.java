package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q22 extends sv1 implements pe0 {
    public /* synthetic */ Object cpQdD2nAriOS;
    public long dgRBjINgWbAK;
    public final /* synthetic */ Object r3s1LDPKFs1S;
    public final /* synthetic */ int wdg6QnbFHrFF = 0;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q22(long j, yt1 yt1Var, bt btVar) {
        super(2, btVar);
        this.dgRBjINgWbAK = j;
        this.r3s1LDPKFs1S = yt1Var;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0043 -> B:7:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object RfyTYNmI9Srp(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.wdg6QnbFHrFF
            java.lang.Object r1 = r9.r3s1LDPKFs1S
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            su r4 = defpackage.su.rtx2ld2ELZv4
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.x50lh2ztY7Y5
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.dgRBjINgWbAK
            java.lang.Object r2 = r9.cpQdD2nAriOS
            oc2 r2 = (defpackage.oc2) r2
            defpackage.ng0.tmVwIGCQF4zR(r10)
            goto L47
        L1d:
            defpackage.u9.rtx2ld2ELZv4(r3)
            goto L50
        L21:
            defpackage.ng0.tmVwIGCQF4zR(r10)
            java.lang.Object r10 = r9.cpQdD2nAriOS
            oc2 r10 = (defpackage.oc2) r10
            ao1 r1 = (defpackage.ao1) r1
            long r0 = r1.lS5Rgt96tfkO
            vq2 r2 = r10.a92UlCVFR9N8()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.cpQdD2nAriOS = r2
            r9.dgRBjINgWbAK = r0
            r9.x50lh2ztY7Y5 = r5
            r10 = 3
            java.lang.Object r10 = defpackage.rd2.lS5Rgt96tfkO(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            ao1 r10 = (defpackage.ao1) r10
            long r6 = r10.lS5Rgt96tfkO
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            yt1 r1 = (defpackage.yt1) r1
            int r0 = r9.x50lh2ztY7Y5
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.cpQdD2nAriOS
            oc2 r9 = (defpackage.oc2) r9
            defpackage.ng0.tmVwIGCQF4zR(r10)
            goto L84
        L61:
            defpackage.u9.rtx2ld2ELZv4(r3)
            goto Lb6
        L65:
            defpackage.ng0.tmVwIGCQF4zR(r10)
            java.lang.Object r10 = r9.cpQdD2nAriOS
            oc2 r10 = (defpackage.oc2) r10
            long r2 = r9.dgRBjINgWbAK
            l4 r0 = new l4
            r6 = 15
            r0.<init>(r6, r1)
            r9.cpQdD2nAriOS = r10
            r9.x50lh2ztY7Y5 = r5
            java.lang.Object r9 = defpackage.n20.TSizfFm2Yiuu(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            ao1 r10 = (defpackage.ao1) r10
            if (r10 == 0) goto L9c
            long r0 = r1.rtx2ld2ELZv4
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            h10 r2 = defpackage.h10.OPXfSBeufaJ8
            goto Lb6
        L9c:
            pc2 r9 = r9.cpQdD2nAriOS
            qn1 r9 = r9.IAToe7bXGz4N
            java.util.List r9 = r9.PxuCJdSBwIXG
            java.lang.Object r9 = defpackage.zk.MDTGUQSX7PXD(r9)
            ao1 r9 = (defpackage.ao1) r9
            boolean r10 = defpackage.ni0.x50lh2ztY7Y5(r9)
            if (r10 == 0) goto Lb4
            r9.PxuCJdSBwIXG()
            h10 r2 = defpackage.h10.rtx2ld2ELZv4
            goto Lb6
        Lb4:
            h10 r2 = defpackage.h10.dgRBjINgWbAK
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q22.RfyTYNmI9Srp(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.wdg6QnbFHrFF;
        Object obj2 = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                q22 q22Var = new q22(this.dgRBjINgWbAK, (yt1) obj2, btVar);
                q22Var.cpQdD2nAriOS = obj;
                return q22Var;
            default:
                q22 q22Var2 = new q22((ao1) obj2, btVar);
                q22Var2.cpQdD2nAriOS = obj;
                return q22Var2;
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.wdg6QnbFHrFF;
        no2 no2Var = no2.PxuCJdSBwIXG;
        oc2 oc2Var = (oc2) obj;
        bt btVar = (bt) obj2;
        switch (i) {
        }
        return ((q22) gPXPFXrUH4XX(btVar, oc2Var)).RfyTYNmI9Srp(no2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q22(ao1 ao1Var, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = ao1Var;
    }
}
