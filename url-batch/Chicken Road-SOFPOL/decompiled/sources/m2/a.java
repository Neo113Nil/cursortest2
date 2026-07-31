package m2;

import java.util.Locale;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f5216a;

    public a(Locale locale) {
        this.f5216a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i.a(this.f5216a.toLanguageTag(), ((a) obj).f5216a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f5216a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f5216a.toLanguageTag();
    }
}
