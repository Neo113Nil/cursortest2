package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n21 {
    public static final m21 Companion = new m21();
    public final Locale PxuCJdSBwIXG;

    public n21(Locale locale) {
        this.PxuCJdSBwIXG = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n21)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG.toLanguageTag(), ((n21) obj).PxuCJdSBwIXG.toLanguageTag());
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.PxuCJdSBwIXG.toLanguageTag();
    }
}
