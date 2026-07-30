package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yd2 {
    public final zd2 a;
    public final dj b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final dq2 c = new dq2(2);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public yd2(zd2 zd2Var, dj djVar) {
        this.a = zd2Var;
        this.b = djVar;
    }

    public final void a() {
        zd2 zd2Var = this.a;
        if (zd2Var.getLifecycle().b() != zc1.n) {
            lh.g("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                lh.g("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            zd2Var.getLifecycle().a(new ep1(1, this));
            this.e = true;
        }
    }
}
