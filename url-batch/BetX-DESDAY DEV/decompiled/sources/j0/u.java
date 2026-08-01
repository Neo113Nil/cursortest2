package j0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f2965b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2964a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2966c = new ArrayList();

    public u(View view) {
        this.f2965b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f2965b == uVar.f2965b && this.f2964a.equals(uVar.f2964a);
    }

    public final int hashCode() {
        return this.f2964a.hashCode() + (this.f2965b.hashCode() * 31);
    }

    public final String toString() {
        String e2 = X0.e.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2965b + "\n", "    values:");
        HashMap hashMap = this.f2964a;
        for (String str : hashMap.keySet()) {
            e2 = e2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e2;
    }
}
