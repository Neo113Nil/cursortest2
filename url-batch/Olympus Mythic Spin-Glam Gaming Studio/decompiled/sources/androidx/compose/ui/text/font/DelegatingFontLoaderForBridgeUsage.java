package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.Font;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/DelegatingFontLoaderForBridgeUsage;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/Font;", "font", "", "loadBlocking", "(Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "loader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLoader$ui_text_release", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "cacheKey", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {
    private final Object cacheKey;
    private final Context context;
    private final Font.ResourceLoader loader;

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object loadBlocking(Font font) {
        Intrinsics.checkNotNullParameter(font, "font");
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object awaitLoad(Font font, Continuation continuation) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().awaitLoad(this.context, androidFont, continuation);
    }
}
