package androidx.compose.ui.text.intl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidLocaleDelegate.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "Ljava/util/Locale;", "javaLocale", "<init>", "(Ljava/util/Locale;)V", "", "toLanguageTag", "()Ljava/lang/String;", "Ljava/util/Locale;", "getJavaLocale", "()Ljava/util/Locale;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidLocale implements PlatformLocale {
    private final java.util.Locale javaLocale;

    public AndroidLocale(java.util.Locale javaLocale) {
        Intrinsics.checkNotNullParameter(javaLocale, "javaLocale");
        this.javaLocale = javaLocale;
    }

    public final java.util.Locale getJavaLocale() {
        return this.javaLocale;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    public String toLanguageTag() {
        String languageTag = this.javaLocale.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
