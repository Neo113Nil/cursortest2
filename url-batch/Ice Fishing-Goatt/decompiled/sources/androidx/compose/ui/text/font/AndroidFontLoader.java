package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "kotlin.jvm.PlatformType", "awaitLoad", "Landroid/graphics/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public android.graphics.Typeface loadBlocking(Font font) {
        Object m6577constructorimpl;
        android.graphics.Typeface typeface;
        android.graphics.Typeface load;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        if (FontLoadingStrategy.m5849equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m5854getBlockingPKNRLFQ())) {
            typeface = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
        } else if (FontLoadingStrategy.m5849equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m5855getOptionalLocalPKNRLFQ())) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AndroidFontLoader androidFontLoader = this;
                load = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
                m6577constructorimpl = Result.m6577constructorimpl(load);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m6577constructorimpl = Result.m6577constructorimpl(ResultKt.createFailure(th));
            }
            typeface = (android.graphics.Typeface) (Result.m6583isFailureimpl(m6577constructorimpl) ? null : m6577constructorimpl);
        } else {
            if (FontLoadingStrategy.m5849equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m5853getAsyncPKNRLFQ())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m5851toStringimpl(font.getLoadingStrategy())));
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typeface, ((ResourceFont) font).getVariationSettings(), this.context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitLoad(Font font, Continuation<? super android.graphics.Typeface> continuation) {
        AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        int i;
        if (continuation instanceof AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1) continuation;
            if ((androidFontLoader$awaitLoad$1.label & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.label -= Integer.MIN_VALUE;
                Object obj = androidFontLoader$awaitLoad$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidFontLoader$awaitLoad$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (font instanceof AndroidFont) {
                        AndroidFont androidFont = (AndroidFont) font;
                        AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
                        Context context = this.context;
                        androidFontLoader$awaitLoad$1.label = 1;
                        Object awaitLoad = typefaceLoader.awaitLoad(context, androidFont, androidFontLoader$awaitLoad$1);
                        if (awaitLoad != coroutine_suspended) {
                            return awaitLoad;
                        }
                    } else if (font instanceof ResourceFont) {
                        Context context2 = this.context;
                        androidFontLoader$awaitLoad$1.L$0 = this;
                        androidFontLoader$awaitLoad$1.L$1 = font;
                        androidFontLoader$awaitLoad$1.label = 2;
                        obj = AndroidFontLoader_androidKt.loadAsync((ResourceFont) font, context2, androidFontLoader$awaitLoad$1);
                    } else {
                        throw new IllegalArgumentException("Unknown font type: " + font);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                font = (Font) androidFontLoader$awaitLoad$1.L$1;
                this = (AndroidFontLoader) androidFontLoader$awaitLoad$1.L$0;
                ResultKt.throwOnFailure(obj);
                return PlatformTypefaces_androidKt.setFontVariationSettings((android.graphics.Typeface) obj, ((ResourceFont) font).getVariationSettings(), this.context);
            }
        }
        androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, continuation);
        Object obj2 = androidFontLoader$awaitLoad$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidFontLoader$awaitLoad$1.label;
        if (i != 0) {
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings((android.graphics.Typeface) obj2, ((ResourceFont) font).getVariationSettings(), this.context);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
