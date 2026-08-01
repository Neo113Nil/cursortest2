package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ha0 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public ha0(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0Var = (ha0) obj;
        return this.b == ha0Var.b && this.a.equals(ha0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        String concat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
