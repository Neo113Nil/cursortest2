package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vy extends jc2 implements pe0 {
    public final /* synthetic */ int QrzZRwfaDlRX;
    public final /* synthetic */ wy cpQdD2nAriOS;
    public final /* synthetic */ int r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(wy wyVar, int i, int i2, bt btVar) {
        super(2, btVar);
        this.cpQdD2nAriOS = wyVar;
        this.r3s1LDPKFs1S = i;
        this.QrzZRwfaDlRX = i2;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        final int i2 = this.r3s1LDPKFs1S;
        wy wyVar = this.cpQdD2nAriOS;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            w51 w51Var = wyVar.lS5Rgt96tfkO;
            this.x50lh2ztY7Y5 = 1;
            ex1 ex1Var = w51Var.PxuCJdSBwIXG.PxuCJdSBwIXG;
            final int i3 = this.QrzZRwfaDlRX;
            Object fRTaYY6FBZcX = fx1.fRTaYY6FBZcX(this, new le0() { // from class: ss0
                @Override // defpackage.le0
                public final Object OPXfSBeufaJ8(Object obj2) {
                    int i4 = i3;
                    int i5 = i2;
                    fy1 fy1Var = (fy1) obj2;
                    fy1Var.getClass();
                    hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("UPDATE items SET rating = ? WHERE id = ?");
                    try {
                        amuv7NJvPxHu.Y1f8riQaR6yg(1, i4);
                        amuv7NJvPxHu.Y1f8riQaR6yg(2, i5);
                        amuv7NJvPxHu.tmVwIGCQF4zR();
                        amuv7NJvPxHu.close();
                        return no2.PxuCJdSBwIXG;
                    } catch (Throwable th) {
                        amuv7NJvPxHu.close();
                        throw th;
                    }
                }
            }, ex1Var, false, true);
            su suVar = su.rtx2ld2ELZv4;
            if (fRTaYY6FBZcX != suVar) {
                fRTaYY6FBZcX = no2Var;
            }
            if (fRTaYY6FBZcX != suVar) {
                fRTaYY6FBZcX = no2Var;
            }
            if (fRTaYY6FBZcX == suVar) {
                return suVar;
            }
        } else {
            if (i != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ng0.tmVwIGCQF4zR(obj);
        }
        fx1.KUoIVIumpKat(fx1.nxJAScVArhE9(wyVar), null, new uy(wyVar, i2, null), 3);
        return no2Var;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        return new vy(this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((vy) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
