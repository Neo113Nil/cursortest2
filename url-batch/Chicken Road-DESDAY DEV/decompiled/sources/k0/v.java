package k0;

import X.V;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final View f2767b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2766a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2768c = new ArrayList();

    public v(View view) {
        this.f2767b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f2767b == vVar.f2767b && this.f2766a.equals(vVar.f2766a);
    }

    public final int hashCode() {
        return this.f2766a.hashCode() + (this.f2767b.hashCode() * 31);
    }

    public final String toString() {
        String e2 = V.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2767b + "\n", "    values:");
        HashMap hashMap = this.f2766a;
        for (String str : hashMap.keySet()) {
            e2 = e2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e2;
    }
}
