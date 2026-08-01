package j0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f2961b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2960a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2962c = new ArrayList();

    public u(View view) {
        this.f2961b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f2961b == uVar.f2961b && this.f2960a.equals(uVar.f2960a);
    }

    public final int hashCode() {
        return this.f2960a.hashCode() + (this.f2961b.hashCode() * 31);
    }

    public final String toString() {
        String e2 = X0.e.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2961b + "\n", "    values:");
        HashMap hashMap = this.f2960a;
        for (String str : hashMap.keySet()) {
            e2 = e2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e2;
    }
}
