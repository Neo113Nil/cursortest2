package k0;

import X.V;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: k0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198u {

    /* renamed from: b, reason: collision with root package name */
    public final View f2832b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2831a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2833c = new ArrayList();

    public C0198u(View view) {
        this.f2832b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0198u)) {
            return false;
        }
        C0198u c0198u = (C0198u) obj;
        return this.f2832b == c0198u.f2832b && this.f2831a.equals(c0198u.f2831a);
    }

    public final int hashCode() {
        return this.f2831a.hashCode() + (this.f2832b.hashCode() * 31);
    }

    public final String toString() {
        String e2 = V.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2832b + "\n", "    values:");
        HashMap hashMap = this.f2831a;
        for (String str : hashMap.keySet()) {
            e2 = e2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e2;
    }
}
