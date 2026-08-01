package k3;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f5382a;

    static {
        new LocaleList(new Locale[0]);
    }

    public f(g gVar) {
        this.f5382a = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f5382a.equals(((f) obj).f5382a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5382a.f5383a.hashCode();
    }

    public final String toString() {
        return this.f5382a.f5383a.toString();
    }
}
