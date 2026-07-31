package H0;

import Z1.i;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f1847a;

    public a(Locale locale) {
        this.f1847a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i.a(this.f1847a.toLanguageTag(), ((a) obj).f1847a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f1847a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f1847a.toLanguageTag();
    }
}
