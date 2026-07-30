package defpackage;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ba3 {
    public final oe a;
    public final mk0 b;

    public /* synthetic */ ba3(oe oeVar, mk0 mk0Var) {
        this.a = oeVar;
        this.b = mk0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ba3)) {
            return false;
        }
        ba3 ba3Var = (ba3) obj;
        return ll3.C(this.a, ba3Var.a) && ll3.C(this.b, ba3Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        tt1 tt1Var = new tt1(this);
        tt1Var.k(this.a, SDKConstants.PARAM_KEY);
        tt1Var.k(this.b, "feature");
        return tt1Var.toString();
    }
}
