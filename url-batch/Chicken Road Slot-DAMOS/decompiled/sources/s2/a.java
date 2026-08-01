package s2;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f8408a;

    public a(Locale locale) {
        this.f8408a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.a(this.f8408a.toLanguageTag(), ((a) obj).f8408a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f8408a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f8408a.toLanguageTag();
    }
}
