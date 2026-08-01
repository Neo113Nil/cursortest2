package k0;

import X.V;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: k0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198u {

    /* renamed from: b, reason: collision with root package name */
    public final View f2836b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2835a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2837c = new ArrayList();

    public C0198u(View view) {
        this.f2836b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0198u)) {
            return false;
        }
        C0198u c0198u = (C0198u) obj;
        return this.f2836b == c0198u.f2836b && this.f2835a.equals(c0198u.f2835a);
    }

    public final int hashCode() {
        return this.f2835a.hashCode() + (this.f2836b.hashCode() * 31);
    }

    public final String toString() {
        String e2 = V.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2836b + "\n", "    values:");
        HashMap hashMap = this.f2835a;
        for (String str : hashMap.keySet()) {
            e2 = e2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e2;
    }
}
