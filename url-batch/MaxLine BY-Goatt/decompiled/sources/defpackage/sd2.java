package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sd2 implements vd2 {
    public final wd2 a;
    public boolean b;
    public Bundle c;
    public final y91 d;

    public sd2(wd2 wd2Var, u53 u53Var) {
        wd2Var.getClass();
        this.a = wd2Var;
        this.d = ya1.b(new dj(10, u53Var));
    }

    @Override // defpackage.vd2
    public final Bundle a() {
        mi1.c();
        Bundle o = iv1.o((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            o.putAll(bundle);
        }
        for (Map.Entry entry : ((td2) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((gc0) ((pd2) entry.getValue()).b.r).a();
            if (!a.isEmpty()) {
                str.getClass();
                o.putBundle(str, a);
            }
        }
        this.b = false;
        return o;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        mi1.c();
        Bundle o = iv1.o((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            o.putAll(bundle);
        }
        if (a != null) {
            o.putAll(a);
        }
        this.c = o;
        this.b = true;
    }
}
