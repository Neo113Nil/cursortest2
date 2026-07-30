package h2;

import java.util.Locale;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f4642a;

    public a(Locale locale) {
        this.f4642a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return k.a(this.f4642a.toLanguageTag(), ((a) obj).f4642a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f4642a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f4642a.toLanguageTag();
    }
}
