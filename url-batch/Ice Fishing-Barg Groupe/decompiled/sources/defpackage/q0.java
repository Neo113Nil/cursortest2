package defpackage;

import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q0 extends kv0 implements re0 {
    public final /* synthetic */ r0 OPXfSBeufaJ8;
    public final /* synthetic */ vw0 wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, vw0 vw0Var) {
        super(4);
        this.OPXfSBeufaJ8 = r0Var;
        this.wdg6QnbFHrFF = vw0Var;
    }

    @Override // defpackage.re0
    public final Object r3s1LDPKFs1S(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        r0 r0Var = this.OPXfSBeufaJ8;
        r0Var.cpQdD2nAriOS.set(intValue, intValue2, intValue3, intValue4);
        i2 i2Var = r0Var.rtx2ld2ELZv4;
        ((AutofillManager) i2Var.OPXfSBeufaJ8).requestAutofill(r0Var.wdg6QnbFHrFF, this.wdg6QnbFHrFF.OPXfSBeufaJ8, r0Var.cpQdD2nAriOS);
        return no2.PxuCJdSBwIXG;
    }
}
