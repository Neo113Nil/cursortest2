package j1;

import android.view.View;
import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public final View f1968b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1967a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1969c = new ArrayList();

    public w(View view) {
        this.f1968b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f1968b == wVar.f1968b && this.f1967a.equals(wVar.f1967a);
    }

    public final int hashCode() {
        return this.f1967a.hashCode() + (this.f1968b.hashCode() * 31);
    }

    public final String toString() {
        String f2 = w0.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1968b + "\n", "    values:");
        HashMap hashMap = this.f1967a;
        for (String str : hashMap.keySet()) {
            f2 = f2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f2;
    }
}
