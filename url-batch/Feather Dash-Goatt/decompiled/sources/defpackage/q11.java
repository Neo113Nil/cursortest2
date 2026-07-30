package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q11 implements c61 {
    public final LinkedHashSet a = new LinkedHashSet();

    public q11(c51 c51Var) {
        c51Var.k("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.c61
    public final Bundle a() {
        ov.d.getClass();
        Bundle D = yr1.D((Pair[]) Arrays.copyOf(new Pair[0], 0));
        List y = CollectionsKt.y(this.a);
        y.getClass();
        D.putStringArrayList("classes_to_restore", y instanceof ArrayList ? (ArrayList) y : new ArrayList<>(y));
        return D;
    }
}
