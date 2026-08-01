package f1;

import android.view.View;
import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public final View f1725b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1724a = new HashMap();
    public final ArrayList c = new ArrayList();

    public w(View view) {
        this.f1725b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f1725b == wVar.f1725b && this.f1724a.equals(wVar.f1724a);
    }

    public final int hashCode() {
        return this.f1724a.hashCode() + (this.f1725b.hashCode() * 31);
    }

    public final String toString() {
        String f4 = w0.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1725b + "\n", "    values:");
        HashMap hashMap = this.f1724a;
        for (String str : hashMap.keySet()) {
            f4 = f4 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f4;
    }
}
