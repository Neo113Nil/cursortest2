package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class rb0 {
    public final sb0 a;
    public final h2 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final xy c = new xy(18);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public rb0(sb0 sb0Var, h2 h2Var) {
        this.a = sb0Var;
        this.b = h2Var;
    }

    public final void a() {
        sb0 sb0Var = this.a;
        if (sb0Var.e().c != gx.INITIALIZED) {
            s9.u("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                s9.u("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            sb0Var.e().a(new qd(2, this));
            this.e = true;
        }
    }
}
