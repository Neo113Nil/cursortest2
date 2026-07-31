package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "kotlin.jvm.PlatformType", "awaitLoad", "Landroid/graphics/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public android.graphics.Typeface loadBlocking(Font font) {
        Object m8023constructorimpl;
        android.graphics.Typeface load;
        android.graphics.Typeface load2;
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return typefaceLoader.loadBlocking(context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
        if (FontLoadingStrategy.m2291equalsimpl0(loadingStrategy, companion.m2296getBlockingPKNRLFQ())) {
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            load2 = AndroidFontLoader_androidKt.load((ResourceFont) font, context2);
            return load2;
        }
        if (FontLoadingStrategy.m2291equalsimpl0(loadingStrategy, companion.m2297getOptionalLocalPKNRLFQ())) {
            try {
                Result.Companion companion2 = Result.INSTANCE;
                Context context3 = this.context;
                Intrinsics.checkNotNullExpressionValue(context3, "context");
                load = AndroidFontLoader_androidKt.load((ResourceFont) font, context3);
                m8023constructorimpl = Result.m8023constructorimpl(load);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            return (android.graphics.Typeface) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
        }
        if (FontLoadingStrategy.m2291equalsimpl0(loadingStrategy, companion.m2295getAsyncPKNRLFQ())) {
            throw new UnsupportedOperationException("Unsupported Async font load path");
        }
        throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m2293toStringimpl(font.getLoadingStrategy())));
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object awaitLoad(Font font, Continuation continuation) {
        Object loadAsync;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return typefaceLoader.awaitLoad(context, androidFont, continuation);
        }
        if (font instanceof ResourceFont) {
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            loadAsync = AndroidFontLoader_androidKt.loadAsync((ResourceFont) font, context2, continuation);
            return loadAsync == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? loadAsync : (android.graphics.Typeface) loadAsync;
        }
        throw new IllegalArgumentException("Unknown font type: " + font);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
