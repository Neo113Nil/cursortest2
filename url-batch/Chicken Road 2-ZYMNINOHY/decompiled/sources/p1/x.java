package p1;

import E.AbstractC0005f;
import android.view.View;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public final View f14805b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14804a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14806c = new ArrayList();

    public x(View view) {
        this.f14805b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f14805b == xVar.f14805b && this.f14804a.equals(xVar.f14804a);
    }

    public final int hashCode() {
        return this.f14804a.hashCode() + (this.f14805b.hashCode() * 31);
    }

    public final String toString() {
        String z = AbstractC0005f.z(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f14805b + IOUtils.LINE_SEPARATOR_UNIX, "    values:");
        HashMap hashMap = this.f14804a;
        for (String str : hashMap.keySet()) {
            z = z + "    " + str + ": " + hashMap.get(str) + IOUtils.LINE_SEPARATOR_UNIX;
        }
        return z;
    }
}
