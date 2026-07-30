package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d61 {
    public final e61 a;
    public final i6 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final me1 c = new me1(1);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public d61(e61 e61Var, i6 i6Var) {
        this.a = e61Var;
        this.b = i6Var;
    }

    public final void a() {
        e61 e61Var = this.a;
        if (e61Var.f().c != og0.e) {
            dd0.j("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                dd0.j("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            e61Var.f().a(new nx(1, this));
            this.e = true;
        }
    }
}
