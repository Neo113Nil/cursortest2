package H0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f3224a;

    public a(Locale locale) {
        this.f3224a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.a(this.f3224a.toLanguageTag(), ((a) obj).f3224a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f3224a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f3224a.toLanguageTag();
    }
}
