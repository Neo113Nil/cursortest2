package l0;

import Y.V;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f3114b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3113a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3115c = new ArrayList();

    public u(View view) {
        this.f3114b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f3114b == uVar.f3114b && this.f3113a.equals(uVar.f3113a);
    }

    public final int hashCode() {
        return this.f3113a.hashCode() + (this.f3114b.hashCode() * 31);
    }

    public final String toString() {
        String f2 = V.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3114b + "\n", "    values:");
        HashMap hashMap = this.f3113a;
        for (String str : hashMap.keySet()) {
            f2 = f2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f2;
    }
}
