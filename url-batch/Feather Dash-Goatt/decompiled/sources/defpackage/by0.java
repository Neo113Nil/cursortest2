package defpackage;

import android.view.ViewStructure;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class by0 extends pc0 implements t30 {
    public final /* synthetic */ ViewStructure d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(ViewStructure viewStructure) {
        super(4);
        this.d = viewStructure;
    }

    @Override // defpackage.t30
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue() - intValue2;
        this.d.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4);
        return Unit.a;
    }
}
