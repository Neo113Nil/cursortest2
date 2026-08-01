package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class p3 implements u10 {
    public final /* synthetic */ int a;
    public final Object b;

    public p3(v10 v10Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        v10Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.u10
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((r3) obj).q().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
                return bundle2;
        }
    }

    public p3(r3 r3Var) {
        this.a = 0;
        this.b = r3Var;
    }
}
