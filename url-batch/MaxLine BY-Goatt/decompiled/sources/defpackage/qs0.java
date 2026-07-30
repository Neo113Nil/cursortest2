package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class qs0 {
    public static final vs0 a = new vs0();
    public static final vs0 b;

    static {
        vs0 vs0Var = null;
        try {
            vs0Var = (vs0) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = vs0Var;
    }

    public static void a(int i, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }
}
