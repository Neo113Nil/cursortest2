package com.yandex.div.core.view2.divs;

import O1.AbstractC1130x5;
import O1.C1022r5;
import O1.EnumC0770d3;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.EnumC1163z2;
import O1.O6;
import O1.Y6;
import O1.Z;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivImageBinder extends DivViewBinder<Z.h, O6, DivImageView> {

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final DivPlaceholderLoader placeholderLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivImageBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivImageLoader imageLoader, @NotNull DivPlaceholderLoader placeholderLoader, @NotNull ErrorCollectors errorCollectors) {
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
    public final void applyContentAlignment(AspectImageView aspectImageView, EnumC1091v2 enumC1091v2, EnumC1109w2 enumC1109w2) {
        aspectImageView.setGravity(BaseDivViewExtensionsKt.evaluateGravity(enumC1091v2, enumC1109w2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFiltersAndSetBitmap(DivImageView divImageView, BindingContext bindingContext, List<? extends AbstractC1130x5> list) {
        Bitmap currentBitmapWithoutFilters$div_release = divImageView.getCurrentBitmapWithoutFilters$div_release();
        if (currentBitmapWithoutFilters$div_release == null) {
            divImageView.setImageBitmap(null);
        } else {
            BaseDivViewExtensionsKt.applyBitmapFilters(divImageView, bindingContext, currentBitmapWithoutFilters$div_release, list, new DivImageBinder$applyFiltersAndSetBitmap$1(divImageView));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean applyImage(final DivImageView divImageView, final BindingContext bindingContext, final O6 o6, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final Uri uri = (Uri) o6.f4212B.evaluate(expressionResolver);
        if (Intrinsics.areEqual(uri, divImageView.getImageUrl$div_release())) {
            return false;
        }
        boolean isHighPriorityShow = isHighPriorityShow(expressionResolver, divImageView, o6);
        divImageView.resetImageLoaded();
        clearTint(divImageView);
        LoadReference loadReference$div_release = divImageView.getLoadReference$div_release();
        if (loadReference$div_release != null) {
            loadReference$div_release.cancel();
        }
        applyPlaceholders(divImageView, bindingContext, o6, isHighPriorityShow, errorCollector);
        divImageView.setImageUrl$div_release(uri);
        DivImageLoader divImageLoader = this.imageLoader;
        String uri2 = uri.toString();
        final Div2View divView = bindingContext.getDivView();
        LoadReference loadImage = divImageLoader.loadImage(uri2, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                DivImageView.this.setImageUrl$div_release(null);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                Intrinsics.checkNotNullParameter(cachedBitmap, "cachedBitmap");
                super.onSuccess(cachedBitmap);
                DivImageView.this.setCurrentBitmapWithoutFilters$div_release(cachedBitmap.getBitmap());
                this.applyFiltersAndSetBitmap(DivImageView.this, bindingContext, o6.f4260t);
                this.applyLoadingFade(DivImageView.this, o6, expressionResolver, cachedBitmap.getFrom());
                DivImageView.this.imageLoaded();
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = DivImageView.this;
                Expression expression = o6.f4226P;
                divImageBinder.applyTint(divImageView2, expression != null ? (Integer) expression.evaluate(expressionResolver) : null, (EnumC0770d3) o6.f4227Q.evaluate(expressionResolver));
                DivImageView.this.invalidate();
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                boolean isVectorCompatible;
                Intrinsics.checkNotNullParameter(pictureDrawable, "pictureDrawable");
                isVectorCompatible = this.isVectorCompatible(o6);
                if (!isVectorCompatible) {
                    onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, uri, null, 2, null));
                    return;
                }
                super.onSuccess(pictureDrawable);
                DivImageView.this.setImageDrawable(pictureDrawable);
                this.applyLoadingFade(DivImageView.this, o6, expressionResolver, null);
                DivImageView.this.imageLoaded();
                DivImageView.this.invalidate();
            }
        });
        Intrinsics.checkNotNullExpressionValue(loadImage, "private fun DivImageView…        return true\n    }");
        bindingContext.getDivView().addLoadReference(loadImage, divImageView);
        divImageView.setLoadReference$div_release(loadImage);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyImageScale(DivImageView divImageView, Y6 y6) {
        divImageView.setImageScale(BaseDivViewExtensionsKt.toImageScale(y6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLoadingFade(DivImageView divImageView, O6 o6, ExpressionResolver expressionResolver, BitmapSource bitmapSource) {
        divImageView.animate().cancel();
        C1022r5 c1022r5 = o6.f4249i;
        float doubleValue = (float) ((Number) o6.v().evaluate(expressionResolver)).doubleValue();
        if (c1022r5 == null || bitmapSource == BitmapSource.MEMORY) {
            divImageView.setAlpha(doubleValue);
            return;
        }
        long longValue = ((Number) c1022r5.b().evaluate(expressionResolver)).longValue();
        Interpolator androidInterpolator = DivUtilKt.getAndroidInterpolator((EnumC1163z2) c1022r5.c().evaluate(expressionResolver));
        divImageView.setAlpha((float) ((Number) c1022r5.f7772a.evaluate(expressionResolver)).doubleValue());
        divImageView.animate().alpha(doubleValue).setDuration(longValue).setInterpolator(androidInterpolator).setStartDelay(((Number) c1022r5.d().evaluate(expressionResolver)).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlaceholders(DivImageView divImageView, BindingContext bindingContext, O6 o6, boolean z4, ErrorCollector errorCollector) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression expression = o6.f4221K;
        divPlaceholderLoader.applyPlaceholder(divImageView, errorCollector, expression != null ? (String) expression.evaluate(expressionResolver) : null, ((Number) o6.f4217G.evaluate(expressionResolver)).intValue(), z4, new DivImageBinder$applyPlaceholders$1(divImageView), new DivImageBinder$applyPlaceholders$2(divImageView, this, bindingContext, o6, expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTint(LoadableImageView loadableImageView, Integer num, EnumC0770d3 enumC0770d3) {
        if ((loadableImageView.isImageLoaded() || loadableImageView.isImagePreview()) && num != null) {
            loadableImageView.setColorFilter(num.intValue(), BaseDivViewExtensionsKt.toPorterDuffMode(enumC0770d3));
        } else {
            clearTint(loadableImageView);
        }
    }

    private final void bindContentAlignment(DivImageView divImageView, O6 o6, O6 o62, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(o6.f4255o, o62 != null ? o62.f4255o : null)) {
            if (ExpressionsKt.equalsToConstant(o6.f4256p, o62 != null ? o62.f4256p : null)) {
                return;
            }
        }
        applyContentAlignment(divImageView, (EnumC1091v2) o6.f4255o.evaluate(expressionResolver), (EnumC1109w2) o6.f4256p.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(o6.f4255o) && ExpressionsKt.isConstant(o6.f4256p)) {
            return;
        }
        DivImageBinder$bindContentAlignment$callback$1 divImageBinder$bindContentAlignment$callback$1 = new DivImageBinder$bindContentAlignment$callback$1(this, divImageView, o6, expressionResolver);
        divImageView.addSubscription(o6.f4255o.observe(expressionResolver, divImageBinder$bindContentAlignment$callback$1));
        divImageView.addSubscription(o6.f4256p.observe(expressionResolver, divImageBinder$bindContentAlignment$callback$1));
    }

    private final void bindFilters(DivImageView divImageView, BindingContext bindingContext, O6 o6, O6 o62) {
        boolean z4;
        List list;
        List list2;
        List list3 = o6.f4260t;
        Boolean bool = null;
        boolean areEqual = Intrinsics.areEqual(list3 != null ? Integer.valueOf(list3.size()) : null, (o62 == null || (list2 = o62.f4260t) == null) ? null : Integer.valueOf(list2.size()));
        boolean z5 = false;
        if (areEqual) {
            List list4 = o6.f4260t;
            if (list4 != null) {
                int i4 = 0;
                z4 = true;
                for (Object obj : list4) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AbstractC1130x5 abstractC1130x5 = (AbstractC1130x5) obj;
                    if (z4) {
                        if (DivDataExtensionsKt.equalsToConstant(abstractC1130x5, (o62 == null || (list = o62.f4260t) == null) ? null : (AbstractC1130x5) list.get(i4))) {
                            z4 = true;
                            i4 = i5;
                        }
                    }
                    z4 = false;
                    i4 = i5;
                }
            } else {
                z4 = true;
            }
            if (z4) {
                return;
            }
        }
        applyFiltersAndSetBitmap(divImageView, bindingContext, o6.f4260t);
        List list5 = o6.f4260t;
        if (list5 != null) {
            List list6 = list5;
            if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                Iterator it = list6.iterator();
                while (it.hasNext()) {
                    if (!DivDataExtensionsKt.isConstant((AbstractC1130x5) it.next())) {
                        break;
                    }
                }
            }
            z5 = true;
            bool = Boolean.valueOf(z5);
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            DivImageBinder$bindFilters$callback$1 divImageBinder$bindFilters$callback$1 = new DivImageBinder$bindFilters$callback$1(this, divImageView, bindingContext, o6);
            List<AbstractC1130x5> list7 = o6.f4260t;
            if (list7 != null) {
                for (AbstractC1130x5 abstractC1130x52 : list7) {
                    if (abstractC1130x52 instanceof AbstractC1130x5.a) {
                        divImageView.addSubscription(((AbstractC1130x5.a) abstractC1130x52).c().f6074a.observe(bindingContext.getExpressionResolver(), divImageBinder$bindFilters$callback$1));
                    }
                }
            }
        }
    }

    private final void bindImageScale(DivImageView divImageView, O6 o6, O6 o62, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(o6.f4224N, o62 != null ? o62.f4224N : null)) {
            return;
        }
        applyImageScale(divImageView, (Y6) o6.f4224N.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(o6.f4224N)) {
            return;
        }
        divImageView.addSubscription(o6.f4224N.observe(expressionResolver, new DivImageBinder$bindImageScale$1(this, divImageView)));
    }

    private final void bindPreviewAndImage(DivImageView divImageView, BindingContext bindingContext, O6 o6, O6 o62, ErrorCollector errorCollector) {
        boolean z4;
        boolean z5;
        boolean equalsToConstant = ExpressionsKt.equalsToConstant(o6.f4212B, o62 != null ? o62.f4212B : null);
        if (ExpressionsKt.equalsToConstant(o6.f4221K, o62 != null ? o62.f4221K : null)) {
            if (ExpressionsKt.equalsToConstant(o6.f4217G, o62 != null ? o62.f4217G : null)) {
                z4 = false;
                boolean z6 = !ExpressionsKt.isConstantOrNull(o6.f4221K) && ExpressionsKt.isConstant(o6.f4217G);
                z5 = divImageView.isImageLoaded() && z4;
                if (z5 && !z6) {
                    observePlaceholders(divImageView, bindingContext, o6, errorCollector);
                }
                if (!equalsToConstant && !ExpressionsKt.isConstantOrNull(o6.f4212B)) {
                    divImageView.addSubscription(o6.f4212B.observe(bindingContext.getExpressionResolver(), new DivImageBinder$bindPreviewAndImage$1(this, divImageView, bindingContext, o6, errorCollector)));
                }
                if (applyImage(divImageView, bindingContext, o6, errorCollector) && z5) {
                    applyPlaceholders(divImageView, bindingContext, o6, isHighPriorityShow(bindingContext.getExpressionResolver(), divImageView, o6), errorCollector);
                    return;
                }
            }
        }
        z4 = true;
        if (ExpressionsKt.isConstantOrNull(o6.f4221K)) {
        }
        if (divImageView.isImageLoaded()) {
        }
        if (z5) {
            observePlaceholders(divImageView, bindingContext, o6, errorCollector);
        }
        if (!equalsToConstant) {
            divImageView.addSubscription(o6.f4212B.observe(bindingContext.getExpressionResolver(), new DivImageBinder$bindPreviewAndImage$1(this, divImageView, bindingContext, o6, errorCollector)));
        }
        if (applyImage(divImageView, bindingContext, o6, errorCollector)) {
        }
    }

    private final void bindTint(DivImageView divImageView, O6 o6, O6 o62, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(o6.f4226P, o62 != null ? o62.f4226P : null)) {
            if (ExpressionsKt.equalsToConstant(o6.f4227Q, o62 != null ? o62.f4227Q : null)) {
                return;
            }
        }
        Expression expression = o6.f4226P;
        applyTint(divImageView, expression != null ? (Integer) expression.evaluate(expressionResolver) : null, (EnumC0770d3) o6.f4227Q.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(o6.f4226P) && ExpressionsKt.isConstant(o6.f4227Q)) {
            return;
        }
        DivImageBinder$bindTint$callback$1 divImageBinder$bindTint$callback$1 = new DivImageBinder$bindTint$callback$1(this, divImageView, o6, expressionResolver);
        Expression expression2 = o6.f4226P;
        divImageView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, divImageBinder$bindTint$callback$1) : null);
        divImageView.addSubscription(o6.f4227Q.observe(expressionResolver, divImageBinder$bindTint$callback$1));
    }

    private final void clearTint(ImageView imageView) {
        imageView.setColorFilter((ColorFilter) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHighPriorityShow(ExpressionResolver expressionResolver, DivImageView divImageView, O6 o6) {
        return !divImageView.isImageLoaded() && ((Boolean) o6.f4264x.evaluate(expressionResolver)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVectorCompatible(O6 o6) {
        if (o6.f4226P != null) {
            return false;
        }
        List list = o6.f4260t;
        return list == null || list.isEmpty();
    }

    private final void observePlaceholders(DivImageView divImageView, BindingContext bindingContext, O6 o6, ErrorCollector errorCollector) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivImageBinder$observePlaceholders$callback$1 divImageBinder$observePlaceholders$callback$1 = new DivImageBinder$observePlaceholders$callback$1(divImageView, this, bindingContext, o6, expressionResolver, errorCollector);
        Expression expression = o6.f4221K;
        divImageView.addSubscription(expression != null ? expression.observe(expressionResolver, divImageBinder$observePlaceholders$callback$1) : null);
        divImageView.addSubscription(o6.f4217G.observe(expressionResolver, divImageBinder$observePlaceholders$callback$1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivImageView divImageView, @NotNull BindingContext bindingContext, @NotNull O6 div, @Nullable O6 o6) {
        Intrinsics.checkNotNullParameter(divImageView, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        BaseDivViewExtensionsKt.applyDivActions(divImageView, bindingContext, div.f4239b, div.f4243d, div.f4214D, div.f4258r, div.f4266z, div.f4265y, div.f4220J, div.f4219I, div.f4241c, div.d(), div.f4253m);
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(divImageView, div.f4250j, o6 != null ? o6.f4250j : null, expressionResolver);
        bindImageScale(divImageView, div, o6, expressionResolver);
        bindContentAlignment(divImageView, div, o6, expressionResolver);
        bindPreviewAndImage(divImageView, bindingContext, div, o6, orCreate);
        bindTint(divImageView, div, o6, expressionResolver);
        bindFilters(divImageView, bindingContext, div, o6);
    }
}
