package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class eg1 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ l7 cpQdD2nAriOS;
    public final /* synthetic */ ab0 dgRBjINgWbAK;
    public final /* synthetic */ Object r3s1LDPKFs1S;
    public final /* synthetic */ ab0 wdg6QnbFHrFF;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg1(ab0 ab0Var, ab0 ab0Var2, Object obj, int i, l7 l7Var, int i2) {
        super(1);
        this.OPXfSBeufaJ8 = i2;
        this.wdg6QnbFHrFF = ab0Var;
        this.dgRBjINgWbAK = ab0Var2;
        this.r3s1LDPKFs1S = obj;
        this.x50lh2ztY7Y5 = i;
        this.cpQdD2nAriOS = l7Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.OPXfSBeufaJ8;
        l7 l7Var = this.cpQdD2nAriOS;
        int i2 = this.x50lh2ztY7Y5;
        Object obj2 = this.r3s1LDPKFs1S;
        ab0 ab0Var = this.dgRBjINgWbAK;
        ab0 ab0Var2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                jd jdVar = (jd) obj;
                if (ab0Var2 != ((qa0) ((r1) zv.wLFCmsViZrNT(ab0Var)).getFocusOwner()).a92UlCVFR9N8()) {
                    return Boolean.TRUE;
                }
                boolean xbgXKYA2cIfu = xi0.xbgXKYA2cIfu(ab0Var, (ab0) obj2, i2, l7Var);
                Boolean valueOf = Boolean.valueOf(xbgXKYA2cIfu);
                if (xbgXKYA2cIfu || !jdVar.PxuCJdSBwIXG()) {
                    return valueOf;
                }
                return null;
            default:
                jd jdVar2 = (jd) obj;
                if (ab0Var2 != ((qa0) ((r1) zv.wLFCmsViZrNT(ab0Var)).getFocusOwner()).a92UlCVFR9N8()) {
                    return Boolean.TRUE;
                }
                boolean xbgXKYA2cIfu2 = ki0.xbgXKYA2cIfu(i2, l7Var, ab0Var, (qt1) obj2);
                Boolean valueOf2 = Boolean.valueOf(xbgXKYA2cIfu2);
                if (xbgXKYA2cIfu2 || !jdVar2.PxuCJdSBwIXG()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
