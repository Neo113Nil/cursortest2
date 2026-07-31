package c5;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public final View f1735b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1734a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1736c = new ArrayList();

    public w(View view) {
        this.f1735b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f1735b == wVar.f1735b && this.f1734a.equals(wVar.f1734a);
    }

    public final int hashCode() {
        return this.f1734a.hashCode() + (this.f1735b.hashCode() * 31);
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1735b + "\n") + "    values:";
        HashMap hashMap = this.f1734a;
        for (String str2 : hashMap.keySet()) {
            str = str + "    " + str2 + ": " + hashMap.get(str2) + "\n";
        }
        return str;
    }
}
