package m0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f3202b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3201a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3203c = new ArrayList();

    public u(View view) {
        this.f3202b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f3202b == uVar.f3202b && this.f3201a.equals(uVar.f3201a);
    }

    public final int hashCode() {
        return this.f3201a.hashCode() + (this.f3202b.hashCode() * 31);
    }

    public final String toString() {
        String f2 = X0.a.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3202b + "\n", "    values:");
        HashMap hashMap = this.f3201a;
        for (String str : hashMap.keySet()) {
            f2 = f2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f2;
    }
}
