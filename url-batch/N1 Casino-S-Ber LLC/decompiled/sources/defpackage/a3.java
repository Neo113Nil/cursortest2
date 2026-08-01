package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class a3 implements e10 {
    public final /* synthetic */ int a;
    public final Object b;

    public a3(i3 i3Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        i3Var.e("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.e10
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((c3) obj).j().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
                return bundle2;
        }
    }

    public a3(c3 c3Var) {
        this.a = 0;
        this.b = c3Var;
    }
}
