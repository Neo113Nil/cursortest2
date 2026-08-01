package n0;

import X.V;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f3197b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3196a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3198c = new ArrayList();

    public u(View view) {
        this.f3197b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f3197b == uVar.f3197b && this.f3196a.equals(uVar.f3196a);
    }

    public final int hashCode() {
        return this.f3196a.hashCode() + (this.f3197b.hashCode() * 31);
    }

    public final String toString() {
        String e2 = V.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3197b + "\n", "    values:");
        HashMap hashMap = this.f3196a;
        for (String str : hashMap.keySet()) {
            e2 = e2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e2;
    }
}
