package p0;

import G1.AbstractC0001b;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f3872b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3871a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3873c = new ArrayList();

    public u(View view) {
        this.f3872b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f3872b == uVar.f3872b && this.f3871a.equals(uVar.f3871a);
    }

    public final int hashCode() {
        return this.f3871a.hashCode() + (this.f3872b.hashCode() * 31);
    }

    public final String toString() {
        String f2 = AbstractC0001b.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3872b + "\n", "    values:");
        HashMap hashMap = this.f3871a;
        for (String str : hashMap.keySet()) {
            f2 = f2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f2;
    }
}
