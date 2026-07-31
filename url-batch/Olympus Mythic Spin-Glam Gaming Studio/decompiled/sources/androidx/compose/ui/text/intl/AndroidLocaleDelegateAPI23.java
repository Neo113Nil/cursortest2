package androidx.compose.ui.text.intl;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidLocaleDelegate.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI23;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "", "languageTag", "Landroidx/compose/ui/text/intl/PlatformLocale;", "parseLanguageTag", "(Ljava/lang/String;)Landroidx/compose/ui/text/intl/PlatformLocale;", "", "getCurrent", "()Ljava/util/List;", "current", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public List getCurrent() {
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return CollectionsKt.listOf(new AndroidLocale(locale));
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public PlatformLocale parseLanguageTag(String languageTag) {
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
        java.util.Locale forLanguageTag = java.util.Locale.forLanguageTag(languageTag);
        Intrinsics.checkNotNullExpressionValue(forLanguageTag, "forLanguageTag(languageTag)");
        return new AndroidLocale(forLanguageTag);
    }
}
