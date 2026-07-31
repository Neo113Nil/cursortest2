package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "GlobalTypefaceRequestCache", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "getGlobalTypefaceRequestCache", "()Landroidx/compose/ui/text/font/TypefaceRequestCache;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "GlobalAsyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "getGlobalAsyncTypefaceCache", "()Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "getGlobalAsyncTypefaceCache$annotations", "()V", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontFamilyResolverKt {
    private static final TypefaceRequestCache GlobalTypefaceRequestCache = new TypefaceRequestCache();
    private static final AsyncTypefaceCache GlobalAsyncTypefaceCache = new AsyncTypefaceCache();

    public static final TypefaceRequestCache getGlobalTypefaceRequestCache() {
        return GlobalTypefaceRequestCache;
    }

    public static final AsyncTypefaceCache getGlobalAsyncTypefaceCache() {
        return GlobalAsyncTypefaceCache;
    }
}
