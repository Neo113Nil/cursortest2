package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class k3 implements l40 {
    public final /* synthetic */ int a;
    public final Object b;

    public k3(s3 s3Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        s3Var.e("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.l40
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((m3) obj).j().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
                return bundle2;
        }
    }

    public k3(m3 m3Var) {
        this.a = 0;
        this.b = m3Var;
    }
}
