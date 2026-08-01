package k0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final View f2816b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2815a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2817c = new ArrayList();

    public v(View view) {
        this.f2816b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f2816b == vVar.f2816b && this.f2815a.equals(vVar.f2815a);
    }

    public final int hashCode() {
        return this.f2815a.hashCode() + (this.f2816b.hashCode() * 31);
    }

    public final String toString() {
        String e2 = T0.c.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2816b + "\n", "    values:");
        HashMap hashMap = this.f2815a;
        for (String str : hashMap.keySet()) {
            e2 = e2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e2;
    }
}
