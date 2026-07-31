package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Locale.kt */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "Landroidx/compose/ui/text/intl/PlatformLocale;", "platformLocale", "<init>", "(Landroidx/compose/ui/text/intl/PlatformLocale;)V", "", "languageTag", "(Ljava/lang/String;)V", "toLanguageTag", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroidx/compose/ui/text/intl/PlatformLocale;", "getPlatformLocale$ui_text_release", "()Landroidx/compose/ui/text/intl/PlatformLocale;", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Locale {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PlatformLocale platformLocale;

    public Locale(PlatformLocale platformLocale) {
        Intrinsics.checkNotNullParameter(platformLocale, "platformLocale");
        this.platformLocale = platformLocale;
    }

    /* compiled from: Locale.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "()V", "current", "Landroidx/compose/ui/text/intl/Locale;", "getCurrent", "()Landroidx/compose/ui/text/intl/Locale;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Locale getCurrent() {
            return new Locale((PlatformLocale) PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0));
        }
    }

    /* renamed from: getPlatformLocale$ui_text_release, reason: from getter */
    public final PlatformLocale getPlatformLocale() {
        return this.platformLocale;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Locale(String languageTag) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(languageTag));
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
    }

    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Locale)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return Intrinsics.areEqual(toLanguageTag(), ((Locale) other).toLanguageTag());
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    public String toString() {
        return toLanguageTag();
    }
}
