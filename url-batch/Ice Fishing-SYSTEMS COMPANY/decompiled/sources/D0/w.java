package D0;

import android.view.View;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.HashMap;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public final View f672b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f671a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f673c = new ArrayList();

    public w(View view) {
        this.f672b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f672b == wVar.f672b && this.f671a.equals(wVar.f671a);
    }

    public final int hashCode() {
        return this.f671a.hashCode() + (this.f672b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder c4 = AbstractC5088e.c("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        c4.append(this.f672b);
        c4.append("\n");
        String j9 = CL.j(c4.toString(), "    values:");
        HashMap hashMap = this.f671a;
        for (String str : hashMap.keySet()) {
            j9 = j9 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return j9;
    }
}
