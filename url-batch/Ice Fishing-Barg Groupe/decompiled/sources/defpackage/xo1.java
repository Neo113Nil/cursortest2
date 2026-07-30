package defpackage;

import android.view.ViewStructure;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xo1 extends kv0 implements re0 {
    public final /* synthetic */ ViewStructure OPXfSBeufaJ8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo1(ViewStructure viewStructure) {
        super(4);
        this.OPXfSBeufaJ8 = viewStructure;
    }

    @Override // defpackage.re0
    public final Object r3s1LDPKFs1S(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue() - intValue2;
        this.OPXfSBeufaJ8.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4);
        return no2.PxuCJdSBwIXG;
    }
}
