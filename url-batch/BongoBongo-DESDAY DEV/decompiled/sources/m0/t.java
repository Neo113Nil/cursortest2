package m0;

import Z.V;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public final View f3309b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3308a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3310c = new ArrayList();

    public t(View view) {
        this.f3309b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f3309b == tVar.f3309b && this.f3308a.equals(tVar.f3308a);
    }

    public final int hashCode() {
        return this.f3308a.hashCode() + (this.f3309b.hashCode() * 31);
    }

    public final String toString() {
        String f2 = V.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3309b + "\n", "    values:");
        HashMap hashMap = this.f3308a;
        for (String str : hashMap.keySet()) {
            f2 = f2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f2;
    }
}
