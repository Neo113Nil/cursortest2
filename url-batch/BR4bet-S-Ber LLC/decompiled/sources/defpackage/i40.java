package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class i40 implements l40 {
    public final s3 a;
    public boolean b;
    public Bundle c;
    public final a80 d;

    public i40(s3 s3Var, uc0 uc0Var) {
        s3Var.getClass();
        this.a = s3Var;
        this.d = new a80(new dp(2, uc0Var));
    }

    @Override // defpackage.l40
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((j40) this.d.a()).b.entrySet().iterator();
        if (!it.hasNext()) {
            this.b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((f40) entry.getValue()).getClass();
        throw null;
    }
}
