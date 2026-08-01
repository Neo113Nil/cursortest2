package k0;

import X.V;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f2800b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2799a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2801c = new ArrayList();

    public u(View view) {
        this.f2800b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f2800b == uVar.f2800b && this.f2799a.equals(uVar.f2799a);
    }

    public final int hashCode() {
        return this.f2799a.hashCode() + (this.f2800b.hashCode() * 31);
    }

    public final String toString() {
        String e2 = V.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2800b + "\n", "    values:");
        HashMap hashMap = this.f2799a;
        for (String str : hashMap.keySet()) {
            e2 = e2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e2;
    }
}
