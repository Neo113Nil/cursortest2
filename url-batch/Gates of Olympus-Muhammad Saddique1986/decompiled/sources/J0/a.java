package J0;

import f2.j;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f3154a;

    public a(Locale locale) {
        this.f3154a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j.a(this.f3154a.toLanguageTag(), ((a) obj).f3154a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f3154a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f3154a.toLanguageTag();
    }
}
