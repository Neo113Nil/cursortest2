package k0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    public View f40980b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f40979a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f40981c = new ArrayList();

    public s(View view) {
        this.f40980b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f40980b == sVar.f40980b && this.f40979a.equals(sVar.f40979a);
    }

    public int hashCode() {
        return (this.f40980b.hashCode() * 31) + this.f40979a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f40980b + "\n") + "    values:";
        for (String str2 : this.f40979a.keySet()) {
            str = str + "    " + str2 + ": " + this.f40979a.get(str2) + "\n";
        }
        return str;
    }
}
