package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class s3 implements qb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public s3(i5 i5Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        i5Var.N("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.qb0
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((u3) obj).k().getClass();
                return bundle;
            default:
                Bundle j = bi.j((k50[]) Arrays.copyOf(new k50[0], 0));
                List q0 = uc.q0((LinkedHashSet) obj);
                j.putStringArrayList("classes_to_restore", q0 instanceof ArrayList ? (ArrayList) q0 : new ArrayList<>(q0));
                return j;
        }
    }

    public s3(u3 u3Var) {
        this.a = 0;
        this.b = u3Var;
    }
}
