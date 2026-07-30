package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pe implements vd2 {
    public final /* synthetic */ int a;
    public final Object b;

    public pe(wd2 wd2Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        wd2Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.vd2
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((re) obj).h().getClass();
                return bundle;
            default:
                mi1.c();
                Bundle o = iv1.o((Pair[]) Arrays.copyOf(new Pair[0], 0));
                List M = zv.M((LinkedHashSet) obj);
                M.getClass();
                o.putStringArrayList("classes_to_restore", M instanceof ArrayList ? (ArrayList) M : new ArrayList<>(M));
                return o;
        }
    }

    public pe(re reVar) {
        this.a = 0;
        this.b = reVar;
    }
}
