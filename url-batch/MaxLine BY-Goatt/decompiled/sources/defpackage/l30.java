package defpackage;

import android.R;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l30 extends o81 implements Function2 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(int i) {
        super(2);
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        a00 a00Var = (a00) obj;
        ((Number) obj2).intValue();
        a00Var.X(-1451087197);
        int i2 = this.m;
        if (i2 == 1) {
            i = R.string.cut;
        } else if (i2 == 2) {
            i = R.string.copy;
        } else if (i2 == 3) {
            i = R.string.paste;
        } else {
            if (i2 != 4) {
                throw null;
            }
            i = R.string.selectAll;
        }
        String f = uj2.f(i, a00Var);
        a00Var.q(false);
        return f;
    }
}
