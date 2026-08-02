package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apm {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    public apm(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof apm)) {
            return false;
        }
        apm apmVar = (apm) obj;
        return this.b == apmVar.b && this.a.equals(apmVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String concat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        Map map = this.a;
        for (String str : map.keySet()) {
            concat = concat + "    " + str + ": " + map.get(str) + "\n";
        }
        return concat;
    }

    @Deprecated
    public apm() {
    }
}
