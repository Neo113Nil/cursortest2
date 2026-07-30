package defpackage;

import android.os.Bundle;
import com.feathherdashh.dashgame.MainActivity;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z51 implements c61 {
    public final c51 a;
    public boolean b;
    public Bundle c;
    public final cg1 d;

    public z51(c51 c51Var, MainActivity mainActivity) {
        c51Var.getClass();
        this.a = c51Var;
        this.d = ee0.b(new nj(mainActivity, 2));
    }

    @Override // defpackage.c61
    public final Bundle a() {
        ov.d.getClass();
        Bundle D = yr1.D((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            D.putAll(bundle);
        }
        for (Map.Entry entry : ((a61) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((oj) ((x51) entry.getValue()).a.i).a();
            if (!a.isEmpty()) {
                str.getClass();
                D.putBundle(str, a);
            }
        }
        this.b = false;
        return D;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle d = this.a.d("androidx.lifecycle.internal.SavedStateHandlesProvider");
        ov.d.getClass();
        Bundle D = yr1.D((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            D.putAll(bundle);
        }
        if (d != null) {
            D.putAll(d);
        }
        this.c = D;
        this.b = true;
    }
}
