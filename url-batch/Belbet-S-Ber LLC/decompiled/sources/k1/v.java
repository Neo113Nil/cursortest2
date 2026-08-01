package k1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final View f2377b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2376a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2378c = new ArrayList();

    public v(View view) {
        this.f2377b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f2377b == vVar.f2377b && this.f2376a.equals(vVar.f2376a);
    }

    public final int hashCode() {
        return this.f2376a.hashCode() + (this.f2377b.hashCode() * 31);
    }

    public final String toString() {
        String g3 = a4.b.g(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2377b + "\n", "    values:");
        HashMap hashMap = this.f2376a;
        for (String str : hashMap.keySet()) {
            g3 = g3 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return g3;
    }
}
