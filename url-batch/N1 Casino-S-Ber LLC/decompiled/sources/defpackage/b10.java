package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class b10 implements e10 {
    public final i3 a;
    public boolean b;
    public Bundle c;
    public final x40 d;

    public b10(i3 i3Var, j90 j90Var) {
        i3Var.getClass();
        this.a = i3Var;
        this.d = new x40(new rm(2, j90Var));
    }

    @Override // defpackage.e10
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((c10) this.d.a()).c.entrySet().iterator();
        if (!it.hasNext()) {
            this.b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((a10) entry.getValue()).getClass();
        throw null;
    }
}
