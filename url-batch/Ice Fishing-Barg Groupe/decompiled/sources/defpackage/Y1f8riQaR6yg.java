package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class Y1f8riQaR6yg implements ae0 {
    public final /* synthetic */ kk OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ Y1f8riQaR6yg(kk kkVar, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = kkVar;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        tx txVar;
        int i = this.rtx2ld2ELZv4;
        kk kkVar = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                yn0 yn0Var = (yn0) f2.QrzZRwfaDlRX(kkVar, vn0.PxuCJdSBwIXG);
                if (yn0Var == null) {
                    hp0.PxuCJdSBwIXG("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + yn0Var);
                }
                yn0 yn0Var2 = kkVar.rZjpSjn4zoMv;
                kkVar.rZjpSjn4zoMv = yn0Var;
                if (yn0Var2 != null && !cs0.wdg6QnbFHrFF(yn0Var, yn0Var2) && ((txVar = kkVar.ozEBbv0hFTAB) != null || !kkVar.amuv7NJvPxHu)) {
                    if (txVar != null) {
                        kkVar.X1HMmH2Ks65g(txVar);
                    }
                    kkVar.ozEBbv0hFTAB = null;
                    kkVar.qYgDo2Ye5PY7();
                }
                return no2.PxuCJdSBwIXG;
            default:
                kkVar.aF05bpZJlKEP.PxuCJdSBwIXG();
                return Boolean.TRUE;
        }
    }
}
