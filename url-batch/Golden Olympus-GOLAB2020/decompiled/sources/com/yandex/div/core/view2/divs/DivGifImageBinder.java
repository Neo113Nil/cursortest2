package com.yandex.div.core.view2.divs;

import O1.C1167z6;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.Z;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import f2.i;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y1.n;

@Metadata
/* loaded from: classes2.dex */
public final class DivGifImageBinder extends DivViewBinder<Z.f, C1167z6, DivGifImageView> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final DivPlaceholderLoader placeholderLoader;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class LoadDrawableOnPostPTask extends AsyncTask<Void, Void, Drawable> {

        @NotNull
        private final CachedBitmap cachedBitmap;

        @NotNull
        private final WeakReference<DivGifImageView> view;

        public LoadDrawableOnPostPTask(@NotNull WeakReference<DivGifImageView> view, @NotNull CachedBitmap cachedBitmap) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(cachedBitmap, "cachedBitmap");
            this.view = view;
            this.cachedBitmap = cachedBitmap;
        }

        private final Drawable createDrawableFromBytes() {
            ImageDecoder.Source createSource;
            Drawable decodeDrawable;
            byte[] bytes = this.cachedBitmap.getBytes();
            if (bytes == null) {
                throw new IllegalStateException("no bytes stored in cached bitmap");
            }
            DivGifImageView divGifImageView = this.view.get();
            Context context = divGifImageView != null ? divGifImageView.getContext() : null;
            if (context == null) {
                throw new IllegalStateException("failed retrieve context");
            }
            File tempFile = File.createTempFile("if_u_see_me_in_file_system_plz_report", ".gif", context.getCacheDir());
            try {
                Intrinsics.checkNotNullExpressionValue(tempFile, "tempFile");
                i.f(tempFile, bytes);
                createSource = ImageDecoder.createSource(tempFile);
                Intrinsics.checkNotNullExpressionValue(createSource, "createSource(tempFile)");
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                Intrinsics.checkNotNullExpressionValue(decodeDrawable, "{\n                tempFi…ble(source)\n            }");
                return decodeDrawable;
            } finally {
                tempFile.delete();
            }
        }

        private final ImageDecoder.Source createSourceFromUri() {
            ImageDecoder.Source createSource;
            Uri cacheUri = this.cachedBitmap.getCacheUri();
            String path = cacheUri != null ? cacheUri.getPath() : null;
            if (path == null) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivGifImageBinder", "No bytes or file in cache to decode gif drawable");
                }
                return null;
            }
            try {
                createSource = ImageDecoder.createSource(new File(path));
                return createSource;
            } catch (IOException e4) {
                if (!KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                    return null;
                }
                Log.e("DivGifImageBinder", "", e4);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        @Override // android.os.AsyncTask
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Drawable doInBackground(@NotNull Void... params) {
            ImageDecoder.Source createSourceFromUri;
            Drawable decodeDrawable;
            Intrinsics.checkNotNullParameter(params, "params");
            try {
                return createDrawableFromBytes();
            } catch (IOException e4) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivGifImageBinder", "Failed writing bytes to temp file, exception: " + e4.getMessage());
                }
                createSourceFromUri = createSourceFromUri();
                if (createSourceFromUri != null) {
                    return null;
                }
                try {
                    decodeDrawable = ImageDecoder.decodeDrawable(createSourceFromUri);
                    return decodeDrawable;
                } catch (IOException e5) {
                    KLog kLog2 = KLog.INSTANCE;
                    if (!kLog2.isAtLeast(Severity.ERROR)) {
                        return null;
                    }
                    kLog2.print(6, "DivGifImageBinder", "Decode drawable from uri exception " + e5.getMessage());
                    return null;
                }
            } catch (IllegalStateException e6) {
                KLog kLog3 = KLog.INSTANCE;
                if (kLog3.isAtLeast(Severity.ERROR)) {
                    kLog3.print(6, "DivGifImageBinder", "Failed create drawable from bytes, exception: " + e6.getMessage());
                }
                createSourceFromUri = createSourceFromUri();
                if (createSourceFromUri != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(@Nullable Drawable drawable) {
            super.onPostExecute((LoadDrawableOnPostPTask) drawable);
            if (drawable == null || !n.a(drawable)) {
                DivGifImageView divGifImageView = this.view.get();
                if (divGifImageView != null) {
                    divGifImageView.setImage(this.cachedBitmap.getBitmap());
                }
            } else {
                DivGifImageView divGifImageView2 = this.view.get();
                if (divGifImageView2 != null) {
                    divGifImageView2.setImage(drawable);
                }
            }
            DivGifImageView divGifImageView3 = this.view.get();
            if (divGifImageView3 != null) {
                divGifImageView3.imageLoaded();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivGifImageBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivImageLoader imageLoader, @NotNull DivPlaceholderLoader placeholderLoader, @NotNull ErrorCollectors errorCollectors) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(placeholderLoader, "placeholderLoader");
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        this.imageLoader = imageLoader;
        this.placeholderLoader = placeholderLoader;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyContentAlignment(AspectImageView aspectImageView, ExpressionResolver expressionResolver, Expression<EnumC1091v2> expression, Expression<EnumC1109w2> expression2) {
        aspectImageView.setGravity(BaseDivViewExtensionsKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGifImage(final DivGifImageView divGifImageView, final Div2View div2View, ExpressionResolver expressionResolver, C1167z6 c1167z6, ErrorCollector errorCollector) {
        Uri uri = (Uri) c1167z6.f8784u.evaluate(expressionResolver);
        if (Intrinsics.areEqual(uri, divGifImageView.getGifUrl$div_release())) {
            return;
        }
        divGifImageView.resetImageLoaded();
        LoadReference loadReference$div_release = divGifImageView.getLoadReference$div_release();
        if (loadReference$div_release != null) {
            loadReference$div_release.cancel();
        }
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression expression = c1167z6.f8746H;
        divPlaceholderLoader.applyPlaceholder(divGifImageView, errorCollector, expression != null ? (String) expression.evaluate(expressionResolver) : null, ((Number) c1167z6.f8742D.evaluate(expressionResolver)).intValue(), false, new DivGifImageBinder$applyGifImage$1(divGifImageView), new DivGifImageBinder$applyGifImage$2(divGifImageView));
        divGifImageView.setGifUrl$div_release(uri);
        LoadReference loadImageBytes = this.imageLoader.loadImageBytes(uri.toString(), new DivIdLoggingImageDownloadCallback(div2View) { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                divGifImageView.setGifUrl$div_release(null);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                Intrinsics.checkNotNullParameter(cachedBitmap, "cachedBitmap");
                super.onSuccess(cachedBitmap);
                if (Build.VERSION.SDK_INT >= 28) {
                    this.loadDrawable(divGifImageView, cachedBitmap);
                } else {
                    divGifImageView.setImage(cachedBitmap.getBitmap());
                    divGifImageView.imageLoaded();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(loadImageBytes, "private fun DivGifImageV…ference = reference\n    }");
        div2View.addLoadReference(loadImageBytes, divGifImageView);
        divGifImageView.setLoadReference$div_release(loadImageBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDrawable(DivGifImageView divGifImageView, CachedBitmap cachedBitmap) {
        new LoadDrawableOnPostPTask(new WeakReference(divGifImageView), cachedBitmap).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private final void observeContentAlignment(DivGifImageView divGifImageView, ExpressionResolver expressionResolver, Expression<EnumC1091v2> expression, Expression<EnumC1109w2> expression2) {
        applyContentAlignment(divGifImageView, expressionResolver, expression, expression2);
        DivGifImageBinder$observeContentAlignment$callback$1 divGifImageBinder$observeContentAlignment$callback$1 = new DivGifImageBinder$observeContentAlignment$callback$1(this, divGifImageView, expressionResolver, expression, expression2);
        divGifImageView.addSubscription(expression.observe(expressionResolver, divGifImageBinder$observeContentAlignment$callback$1));
        divGifImageView.addSubscription(expression2.observe(expressionResolver, divGifImageBinder$observeContentAlignment$callback$1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivGifImageView divGifImageView, @NotNull BindingContext bindingContext, @NotNull C1167z6 div, @Nullable C1167z6 c1167z6) {
        Intrinsics.checkNotNullParameter(divGifImageView, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.applyDivActions(divGifImageView, bindingContext, div.f8765b, div.f8767d, div.f8739A, div.f8780q, div.f8787x, div.f8786w, div.f8745G, div.f8744F, div.f8766c, div.d(), div.f8775l);
        BaseDivViewExtensionsKt.bindAspectRatio(divGifImageView, div.f8772i, c1167z6 != null ? c1167z6.f8772i : null, expressionResolver);
        divGifImageView.addSubscription(div.f8749K.observeAndGet(expressionResolver, new DivGifImageBinder$bind$1(divGifImageView)));
        observeContentAlignment(divGifImageView, expressionResolver, div.f8777n, div.f8778o);
        divGifImageView.addSubscription(div.f8784u.observeAndGet(expressionResolver, new DivGifImageBinder$bind$2(this, divGifImageView, divView, expressionResolver, div, orCreate)));
    }
}
