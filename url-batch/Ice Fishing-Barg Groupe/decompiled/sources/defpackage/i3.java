package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i3 extends sv1 implements pe0 {
    public final /* synthetic */ Object cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public final /* synthetic */ int wdg6QnbFHrFF;
    public /* synthetic */ Object x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(Object obj, bt btVar, int i) {
        super(2, btVar);
        this.wdg6QnbFHrFF = i;
        this.cpQdD2nAriOS = obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00e2 -> B:35:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0037 -> B:7:0x003a). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object RfyTYNmI9Srp(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3.RfyTYNmI9Srp(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.wdg6QnbFHrFF;
        Object obj2 = this.cpQdD2nAriOS;
        switch (i) {
            case 0:
                i3 i3Var = new i3((k3) obj2, btVar, 0);
                i3Var.x50lh2ztY7Y5 = obj;
                return i3Var;
            case 1:
                i3 i3Var2 = new i3((le0) obj2, btVar, 1);
                i3Var2.x50lh2ztY7Y5 = obj;
                return i3Var2;
            default:
                i3 i3Var3 = new i3((mt) obj2, btVar, 2);
                i3Var3.x50lh2ztY7Y5 = obj;
                return i3Var3;
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.wdg6QnbFHrFF;
        no2 no2Var = no2.PxuCJdSBwIXG;
        oc2 oc2Var = (oc2) obj;
        bt btVar = (bt) obj2;
        switch (i) {
            case 0:
                return ((i3) gPXPFXrUH4XX(btVar, oc2Var)).RfyTYNmI9Srp(no2Var);
            case 1:
                return ((i3) gPXPFXrUH4XX(btVar, oc2Var)).RfyTYNmI9Srp(no2Var);
            default:
                ((i3) gPXPFXrUH4XX(btVar, oc2Var)).RfyTYNmI9Srp(no2Var);
                return su.rtx2ld2ELZv4;
        }
    }
}
