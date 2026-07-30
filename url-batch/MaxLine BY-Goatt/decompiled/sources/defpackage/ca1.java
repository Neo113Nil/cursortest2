package defpackage;

import android.view.ViewStructure;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ca1 extends o81 implements yt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca1(int i, Object obj) {
        super(4);
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.yt0
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.m;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                ha1 ha1Var = (ha1) obj;
                ((Number) obj2).intValue();
                a00 a00Var = (a00) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= a00Var.f(ha1Var) ? 4 : 2;
                }
                if ((intValue & 131) == 130 && a00Var.B()) {
                    a00Var.S();
                } else {
                    ((my) obj5).a(ha1Var, a00Var, Integer.valueOf(intValue & 14));
                }
                break;
            default:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                ((ViewStructure) obj5).setDimens(intValue2, intValue3, 0, 0, ((Number) obj3).intValue() - intValue2, ((Number) obj4).intValue() - intValue3);
                break;
        }
        return Unit.a;
    }
}
