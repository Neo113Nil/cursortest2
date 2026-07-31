package com.yandex.div.core.view2.divs;

import O1.Aa;
import O1.AbstractC1130x5;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.Na;
import O1.P6;
import O1.X2;
import O1.Xa;
import O1.Y6;
import W1.m;
import android.R;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PictureDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import com.yandex.div.R$drawable;
import com.yandex.div.R$id;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.NinePatchDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivBackgroundBinder {

    @NotNull
    private final DivImageLoader imageLoader;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static abstract class DivBackgroundState {

        @Metadata
        public static final class Image extends DivBackgroundState {
            private final double alpha;

            @NotNull
            private final EnumC1091v2 contentAlignmentHorizontal;

            @NotNull
            private final EnumC1109w2 contentAlignmentVertical;

            @Nullable
            private final List<Filter> filters;

            @NotNull
            private final Uri imageUrl;
            private final boolean isVectorCompatible;
            private final boolean preloadRequired;

            @NotNull
            private final Y6 scale;

            @Metadata
            public static abstract class Filter {

                @Metadata
                public static final class Blur extends Filter {

                    @NotNull
                    private final AbstractC1130x5.a div;
                    private final int radius;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Blur(int i4, @NotNull AbstractC1130x5.a div) {
                        super(null);
                        Intrinsics.checkNotNullParameter(div, "div");
                        this.radius = i4;
                        this.div = div;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Blur)) {
                            return false;
                        }
                        Blur blur = (Blur) obj;
                        return this.radius == blur.radius && Intrinsics.areEqual(this.div, blur.div);
                    }

                    @NotNull
                    public final AbstractC1130x5.a getDiv() {
                        return this.div;
                    }

                    public int hashCode() {
                        return (Integer.hashCode(this.radius) * 31) + this.div.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Blur(radius=" + this.radius + ", div=" + this.div + ')';
                    }
                }

                @Metadata
                public static final class RtlMirror extends Filter {

                    @NotNull
                    private final AbstractC1130x5.d div;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public RtlMirror(@NotNull AbstractC1130x5.d div) {
                        super(null);
                        Intrinsics.checkNotNullParameter(div, "div");
                        this.div = div;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof RtlMirror) && Intrinsics.areEqual(this.div, ((RtlMirror) obj).div);
                    }

                    @NotNull
                    public final AbstractC1130x5.d getDiv() {
                        return this.div;
                    }

                    public int hashCode() {
                        return this.div.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "RtlMirror(div=" + this.div + ')';
                    }
                }

                public /* synthetic */ Filter(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final AbstractC1130x5 toDiv() {
                    if (this instanceof Blur) {
                        return ((Blur) this).getDiv();
                    }
                    if (this instanceof RtlMirror) {
                        return ((RtlMirror) this).getDiv();
                    }
                    throw new m();
                }

                private Filter() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Image(double d4, @NotNull EnumC1091v2 contentAlignmentHorizontal, @NotNull EnumC1109w2 contentAlignmentVertical, @NotNull Uri imageUrl, boolean z4, @NotNull Y6 scale, @Nullable List<? extends Filter> list, boolean z5) {
                super(null);
                Intrinsics.checkNotNullParameter(contentAlignmentHorizontal, "contentAlignmentHorizontal");
                Intrinsics.checkNotNullParameter(contentAlignmentVertical, "contentAlignmentVertical");
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(scale, "scale");
                this.alpha = d4;
                this.contentAlignmentHorizontal = contentAlignmentHorizontal;
                this.contentAlignmentVertical = contentAlignmentVertical;
                this.imageUrl = imageUrl;
                this.preloadRequired = z4;
                this.scale = scale;
                this.filters = list;
                this.isVectorCompatible = z5;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return Double.compare(this.alpha, image.alpha) == 0 && this.contentAlignmentHorizontal == image.contentAlignmentHorizontal && this.contentAlignmentVertical == image.contentAlignmentVertical && Intrinsics.areEqual(this.imageUrl, image.imageUrl) && this.preloadRequired == image.preloadRequired && this.scale == image.scale && Intrinsics.areEqual(this.filters, image.filters) && this.isVectorCompatible == image.isVectorCompatible;
            }

            @NotNull
            public final Drawable getDivImageBackground(@NotNull final BindingContext context, @NotNull final View target, @NotNull DivImageLoader imageLoader) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(target, "target");
                Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                final ScalingDrawable scalingDrawable = new ScalingDrawable();
                scalingDrawable.setAlpha((int) (this.alpha * KotlinVersion.MAX_COMPONENT_VALUE));
                scalingDrawable.setCustomScaleType(BaseDivViewExtensionsKt.toScaleType(this.scale));
                scalingDrawable.setAlignmentHorizontal(BaseDivViewExtensionsKt.toHorizontalAlignment(this.contentAlignmentHorizontal, ViewsKt.isLayoutRtl(target)));
                scalingDrawable.setAlignmentVertical(BaseDivViewExtensionsKt.toVerticalAlignment(this.contentAlignmentVertical));
                String uri = this.imageUrl.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "imageUrl.toString()");
                final Div2View divView = context.getDivView();
                LoadReference loadImage = imageLoader.loadImage(uri, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                        ArrayList arrayList;
                        Intrinsics.checkNotNullParameter(cachedBitmap, "cachedBitmap");
                        View view = target;
                        BindingContext bindingContext = context;
                        Bitmap bitmap = cachedBitmap.getBitmap();
                        Intrinsics.checkNotNullExpressionValue(bitmap, "cachedBitmap.bitmap");
                        List<DivBackgroundBinder.DivBackgroundState.Image.Filter> filters = this.getFilters();
                        if (filters != null) {
                            List<DivBackgroundBinder.DivBackgroundState.Image.Filter> list = filters;
                            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((DivBackgroundBinder.DivBackgroundState.Image.Filter) it.next()).toDiv());
                            }
                        } else {
                            arrayList = null;
                        }
                        BaseDivViewExtensionsKt.applyBitmapFilters(view, bindingContext, bitmap, arrayList, new DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2(scalingDrawable));
                    }

                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                        Intrinsics.checkNotNullParameter(pictureDrawable, "pictureDrawable");
                        if (!this.isVectorCompatible()) {
                            onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, this.getImageUrl(), null, 2, null));
                            return;
                        }
                        ScalingDrawable scalingDrawable2 = scalingDrawable;
                        Picture picture = pictureDrawable.getPicture();
                        Intrinsics.checkNotNullExpressionValue(picture, "pictureDrawable.picture");
                        scalingDrawable2.setPicture(picture);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(loadImage, "fun getDivImageBackgroun…aleDrawable\n            }");
                context.getDivView().addLoadReference(loadImage, target);
                return scalingDrawable;
            }

            @Nullable
            public final List<Filter> getFilters() {
                return this.filters;
            }

            @NotNull
            public final Uri getImageUrl() {
                return this.imageUrl;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((((((Double.hashCode(this.alpha) * 31) + this.contentAlignmentHorizontal.hashCode()) * 31) + this.contentAlignmentVertical.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
                boolean z4 = this.preloadRequired;
                int i4 = z4;
                if (z4 != 0) {
                    i4 = 1;
                }
                int hashCode2 = (((hashCode + i4) * 31) + this.scale.hashCode()) * 31;
                List<Filter> list = this.filters;
                int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                boolean z5 = this.isVectorCompatible;
                return hashCode3 + (z5 ? 1 : z5 ? 1 : 0);
            }

            public final boolean isVectorCompatible() {
                return this.isVectorCompatible;
            }

            @NotNull
            public String toString() {
                return "Image(alpha=" + this.alpha + ", contentAlignmentHorizontal=" + this.contentAlignmentHorizontal + ", contentAlignmentVertical=" + this.contentAlignmentVertical + ", imageUrl=" + this.imageUrl + ", preloadRequired=" + this.preloadRequired + ", scale=" + this.scale + ", filters=" + this.filters + ", isVectorCompatible=" + this.isVectorCompatible + ')';
            }
        }

        @Metadata
        public static final class LinearGradient extends DivBackgroundState {
            private final int angle;

            @NotNull
            private final Colormap colormap;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LinearGradient(int i4, @NotNull Colormap colormap) {
                super(null);
                Intrinsics.checkNotNullParameter(colormap, "colormap");
                this.angle = i4;
                this.colormap = colormap;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LinearGradient)) {
                    return false;
                }
                LinearGradient linearGradient = (LinearGradient) obj;
                return this.angle == linearGradient.angle && Intrinsics.areEqual(this.colormap, linearGradient.colormap);
            }

            public final int getAngle() {
                return this.angle;
            }

            @NotNull
            public final Colormap getColormap() {
                return this.colormap;
            }

            public int hashCode() {
                return (Integer.hashCode(this.angle) * 31) + this.colormap.hashCode();
            }

            @NotNull
            public String toString() {
                return "LinearGradient(angle=" + this.angle + ", colormap=" + this.colormap + ')';
            }
        }

        @Metadata
        public static final class NinePatch extends DivBackgroundState {

            @NotNull
            private final Uri imageUrl;

            @NotNull
            private final Rect insets;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NinePatch(@NotNull Uri imageUrl, @NotNull Rect insets) {
                super(null);
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(insets, "insets");
                this.imageUrl = imageUrl;
                this.insets = insets;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NinePatch)) {
                    return false;
                }
                NinePatch ninePatch = (NinePatch) obj;
                return Intrinsics.areEqual(this.imageUrl, ninePatch.imageUrl) && Intrinsics.areEqual(this.insets, ninePatch.insets);
            }

            @NotNull
            public final Rect getInsets() {
                return this.insets;
            }

            @NotNull
            public final Drawable getNinePatchDrawable(@NotNull final Div2View divView, @NotNull View target, @NotNull DivImageLoader imageLoader) {
                Intrinsics.checkNotNullParameter(divView, "divView");
                Intrinsics.checkNotNullParameter(target, "target");
                Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                final NinePatchDrawable ninePatchDrawable = new NinePatchDrawable();
                String uri = this.imageUrl.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "imageUrl.toString()");
                LoadReference loadImage = imageLoader.loadImage(uri, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$NinePatch$getNinePatchDrawable$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                        Intrinsics.checkNotNullParameter(cachedBitmap, "cachedBitmap");
                        NinePatchDrawable ninePatchDrawable2 = ninePatchDrawable;
                        DivBackgroundBinder.DivBackgroundState.NinePatch ninePatch = this;
                        ninePatchDrawable2.setBottom(ninePatch.getInsets().bottom);
                        ninePatchDrawable2.setLeft(ninePatch.getInsets().left);
                        ninePatchDrawable2.setRight(ninePatch.getInsets().right);
                        ninePatchDrawable2.setTop(ninePatch.getInsets().top);
                        ninePatchDrawable2.setBitmap(cachedBitmap.getBitmap());
                    }
                });
                Intrinsics.checkNotNullExpressionValue(loadImage, "fun getNinePatchDrawable…tchDrawable\n            }");
                divView.addLoadReference(loadImage, target);
                return ninePatchDrawable;
            }

            public int hashCode() {
                return (this.imageUrl.hashCode() * 31) + this.insets.hashCode();
            }

            @NotNull
            public String toString() {
                return "NinePatch(imageUrl=" + this.imageUrl + ", insets=" + this.insets + ')';
            }
        }

        @Metadata
        public static final class RadialGradient extends DivBackgroundState {

            @NotNull
            private final Center centerX;

            @NotNull
            private final Center centerY;

            @NotNull
            private final List<Integer> colors;

            @NotNull
            private final Radius radius;

            @Metadata
            public static abstract class Center {

                @Metadata
                public static final class Fixed extends Center {
                    private final float valuePx;

                    public Fixed(float f4) {
                        super(null);
                        this.valuePx = f4;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) obj).valuePx) == 0;
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.valuePx);
                    }

                    @NotNull
                    public String toString() {
                        return "Fixed(valuePx=" + this.valuePx + ')';
                    }
                }

                @Metadata
                public static final class Relative extends Center {
                    private final float value;

                    public Relative(float f4) {
                        super(null);
                        this.value = f4;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Relative) && Float.compare(this.value, ((Relative) obj).value) == 0;
                    }

                    public final float getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.value);
                    }

                    @NotNull
                    public String toString() {
                        return "Relative(value=" + this.value + ')';
                    }
                }

                public /* synthetic */ Center(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final RadialGradientDrawable.Center toRadialGradientDrawableCenter() {
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Center.Fixed(((Fixed) this).getValuePx());
                    }
                    if (this instanceof Relative) {
                        return new RadialGradientDrawable.Center.Relative(((Relative) this).getValue());
                    }
                    throw new m();
                }

                private Center() {
                }
            }

            @Metadata
            public static abstract class Radius {

                @Metadata
                public static final class Fixed extends Radius {
                    private final float valuePx;

                    public Fixed(float f4) {
                        super(null);
                        this.valuePx = f4;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) obj).valuePx) == 0;
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.valuePx);
                    }

                    @NotNull
                    public String toString() {
                        return "Fixed(valuePx=" + this.valuePx + ')';
                    }
                }

                @Metadata
                public static final class Relative extends Radius {

                    @NotNull
                    private final Xa.c value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Relative(@NotNull Xa.c value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Relative) && this.value == ((Relative) obj).value;
                    }

                    @NotNull
                    public final Xa.c getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Relative(value=" + this.value + ')';
                    }
                }

                @Metadata
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Xa.c.values().length];
                        try {
                            iArr[Xa.c.FARTHEST_CORNER.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Xa.c.NEAREST_CORNER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Xa.c.FARTHEST_SIDE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Xa.c.NEAREST_SIDE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Radius(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius() {
                    RadialGradientDrawable.Radius.Relative.Type type;
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Radius.Fixed(((Fixed) this).getValuePx());
                    }
                    if (!(this instanceof Relative)) {
                        throw new m();
                    }
                    int i4 = WhenMappings.$EnumSwitchMapping$0[((Relative) this).getValue().ordinal()];
                    if (i4 == 1) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
                    } else if (i4 == 2) {
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
                    } else if (i4 == 3) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
                    } else {
                        if (i4 != 4) {
                            throw new m();
                        }
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
                    }
                    return new RadialGradientDrawable.Radius.Relative(type);
                }

                private Radius() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RadialGradient(@NotNull Center centerX, @NotNull Center centerY, @NotNull List<Integer> colors, @NotNull Radius radius) {
                super(null);
                Intrinsics.checkNotNullParameter(centerX, "centerX");
                Intrinsics.checkNotNullParameter(centerY, "centerY");
                Intrinsics.checkNotNullParameter(colors, "colors");
                Intrinsics.checkNotNullParameter(radius, "radius");
                this.centerX = centerX;
                this.centerY = centerY;
                this.colors = colors;
                this.radius = radius;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RadialGradient)) {
                    return false;
                }
                RadialGradient radialGradient = (RadialGradient) obj;
                return Intrinsics.areEqual(this.centerX, radialGradient.centerX) && Intrinsics.areEqual(this.centerY, radialGradient.centerY) && Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.radius, radialGradient.radius);
            }

            @NotNull
            public final Center getCenterX() {
                return this.centerX;
            }

            @NotNull
            public final Center getCenterY() {
                return this.centerY;
            }

            @NotNull
            public final List<Integer> getColors() {
                return this.colors;
            }

            @NotNull
            public final Radius getRadius() {
                return this.radius;
            }

            public int hashCode() {
                return (((((this.centerX.hashCode() * 31) + this.centerY.hashCode()) * 31) + this.colors.hashCode()) * 31) + this.radius.hashCode();
            }

            @NotNull
            public String toString() {
                return "RadialGradient(centerX=" + this.centerX + ", centerY=" + this.centerY + ", colors=" + this.colors + ", radius=" + this.radius + ')';
            }
        }

        @Metadata
        public static final class Solid extends DivBackgroundState {
            private final int color;

            public Solid(int i4) {
                super(null);
                this.color = i4;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Solid) && this.color == ((Solid) obj).color;
            }

            public final int getColor() {
                return this.color;
            }

            public int hashCode() {
                return Integer.hashCode(this.color);
            }

            @NotNull
            public String toString() {
                return "Solid(color=" + this.color + ')';
            }
        }

        public /* synthetic */ DivBackgroundState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Drawable toDrawable(@NotNull BindingContext context, @NotNull View target, @NotNull DivImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            if (this instanceof Image) {
                return ((Image) this).getDivImageBackground(context, target, imageLoader);
            }
            if (this instanceof NinePatch) {
                return ((NinePatch) this).getNinePatchDrawable(context.getDivView(), target, imageLoader);
            }
            if (this instanceof Solid) {
                return new ColorDrawable(((Solid) this).getColor());
            }
            if (this instanceof LinearGradient) {
                return new LinearGradientDrawable(r4.getAngle(), ((LinearGradient) this).getColormap());
            }
            if (!(this instanceof RadialGradient)) {
                throw new m();
            }
            RadialGradient radialGradient = (RadialGradient) this;
            return new RadialGradientDrawable(radialGradient.getRadius().toRadialGradientDrawableRadius(), radialGradient.getCenterX().toRadialGradientDrawableCenter(), radialGradient.getCenterY().toRadialGradientDrawableCenter(), CollectionsKt.toIntArray(radialGradient.getColors()));
        }

        private DivBackgroundState() {
        }
    }

    public DivBackgroundBinder(@NotNull DivImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.imageLoader = imageLoader;
    }

    private void addBackgroundSubscriptions(List<? extends X2> list, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, Function1<Object, Unit> function1) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ExpressionSubscribersKt.observeBackground(expressionSubscriber, (X2) it.next(), expressionResolver, function1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDefaultBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends X2> list) {
        List<? extends DivBackgroundState> emptyList;
        DisplayMetrics metrics = view.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            List<? extends X2> list2 = list;
            emptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (X2 x22 : list2) {
                Div2View divView = bindingContext.getDivView();
                Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
                emptyList.add(toBackgroundState(x22, divView, metrics, expressionResolver));
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        List<DivBackgroundState> defaultBackgroundList = getDefaultBackgroundList(view);
        Drawable additionalLayer = getAdditionalLayer(view);
        if (Intrinsics.areEqual(defaultBackgroundList, emptyList) && Intrinsics.areEqual(additionalLayer, drawable)) {
            return;
        }
        updateBackground(view, toDrawable(emptyList, bindingContext, view, drawable));
        setDefaultBackgroundList(view, emptyList);
        setFocusedBackgroundList(view, null);
        setAdditionalLayer(view, drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyFocusedBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends X2> list, List<? extends X2> list2) {
        List<? extends DivBackgroundState> emptyList;
        DisplayMetrics metrics = view.getResources().getDisplayMetrics();
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            List<? extends X2> list3 = list;
            emptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (X2 x22 : list3) {
                Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
                emptyList.add(toBackgroundState(x22, divView, metrics, expressionResolver));
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        List<? extends X2> list4 = list2;
        List<? extends DivBackgroundState> arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (X2 x23 : list4) {
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            arrayList.add(toBackgroundState(x23, divView, metrics, expressionResolver));
        }
        List<DivBackgroundState> defaultBackgroundList = getDefaultBackgroundList(view);
        List<DivBackgroundState> focusedBackgroundList = getFocusedBackgroundList(view);
        Drawable additionalLayer = getAdditionalLayer(view);
        if (Intrinsics.areEqual(defaultBackgroundList, emptyList) && Intrinsics.areEqual(focusedBackgroundList, arrayList) && Intrinsics.areEqual(additionalLayer, drawable)) {
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, toDrawable(arrayList, bindingContext, view, drawable));
        if (list != null || drawable != null) {
            stateListDrawable.addState(StateSet.WILD_CARD, toDrawable(emptyList, bindingContext, view, drawable));
        }
        updateBackground(view, stateListDrawable);
        setDefaultBackgroundList(view, emptyList);
        setFocusedBackgroundList(view, arrayList);
        setAdditionalLayer(view, drawable);
    }

    private void bindDefaultBackground(BindingContext bindingContext, View view, Drawable drawable, List<? extends X2> list, List<? extends X2> list2, ExpressionSubscriber expressionSubscriber) {
        List<? extends X2> emptyList = list == null ? CollectionsKt.emptyList() : list;
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        Drawable additionalLayer = getAdditionalLayer(view);
        if (emptyList.size() == list2.size()) {
            Iterator<T> it = emptyList.iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!DivDataExtensionsKt.equalsToConstant((X2) next, list2.get(i4))) {
                        break;
                    } else {
                        i4 = i5;
                    }
                } else if (Intrinsics.areEqual(drawable, additionalLayer)) {
                    return;
                }
            }
        }
        applyDefaultBackground(view, bindingContext, drawable, list);
        List<? extends X2> list3 = emptyList;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return;
        }
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            if (!DivDataExtensionsKt.isConstant((X2) it2.next())) {
                addBackgroundSubscriptions(list, bindingContext.getExpressionResolver(), expressionSubscriber, new DivBackgroundBinder$bindDefaultBackground$callback$1(this, view, bindingContext, drawable, list));
                return;
            }
        }
    }

    private void bindFocusBackground(BindingContext bindingContext, View view, Drawable drawable, List<? extends X2> list, List<? extends X2> list2, List<? extends X2> list3, List<? extends X2> list4, ExpressionSubscriber expressionSubscriber) {
        List<? extends X2> emptyList = list == null ? CollectionsKt.emptyList() : list;
        List<? extends X2> emptyList2 = list2 == null ? CollectionsKt.emptyList() : list2;
        List<? extends X2> emptyList3 = list4 == null ? CollectionsKt.emptyList() : list4;
        Drawable additionalLayer = getAdditionalLayer(view);
        if (emptyList.size() == emptyList2.size()) {
            Iterator<T> it = emptyList.iterator();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!DivDataExtensionsKt.equalsToConstant((X2) next, emptyList2.get(i5))) {
                        break;
                    } else {
                        i5 = i6;
                    }
                } else if (list3.size() == emptyList3.size()) {
                    Iterator<T> it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            int i7 = i4 + 1;
                            if (i4 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (!DivDataExtensionsKt.equalsToConstant((X2) next2, emptyList3.get(i4))) {
                                break;
                            } else {
                                i4 = i7;
                            }
                        } else if (Intrinsics.areEqual(drawable, additionalLayer)) {
                            return;
                        }
                    }
                }
            }
        }
        applyFocusedBackground(view, bindingContext, drawable, list, list3);
        List<? extends X2> list5 = emptyList;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator<T> it3 = list5.iterator();
            while (it3.hasNext()) {
                if (!DivDataExtensionsKt.isConstant((X2) it3.next())) {
                    break;
                }
            }
        }
        List<? extends X2> list6 = list3;
        if ((list6 instanceof Collection) && list6.isEmpty()) {
            return;
        }
        Iterator<T> it4 = list6.iterator();
        while (it4.hasNext()) {
            if (!DivDataExtensionsKt.isConstant((X2) it4.next())) {
                DivBackgroundBinder$bindFocusBackground$callback$1 divBackgroundBinder$bindFocusBackground$callback$1 = new DivBackgroundBinder$bindFocusBackground$callback$1(this, view, bindingContext, drawable, list, list3);
                ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
                addBackgroundSubscriptions(list, expressionResolver, expressionSubscriber, divBackgroundBinder$bindFocusBackground$callback$1);
                addBackgroundSubscriptions(list3, expressionResolver, expressionSubscriber, divBackgroundBinder$bindFocusBackground$callback$1);
                return;
            }
        }
    }

    private Drawable getAdditionalLayer(View view) {
        Object tag = view.getTag(R$id.div_additional_background_layer_tag);
        if (tag instanceof Drawable) {
            return (Drawable) tag;
        }
        return null;
    }

    private List<DivBackgroundState> getDefaultBackgroundList(View view) {
        Object tag = view.getTag(R$id.div_default_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private List<DivBackgroundState> getFocusedBackgroundList(View view) {
        Object tag = view.getTag(R$id.div_focused_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private boolean isVectorCompatible(P6 p6, ExpressionResolver expressionResolver) {
        if (((Number) p6.f4321a.evaluate(expressionResolver)).doubleValue() != 1.0d) {
            return false;
        }
        List list = p6.f4324d;
        return list == null || list.isEmpty();
    }

    private void setAdditionalLayer(View view, Drawable drawable) {
        view.setTag(R$id.div_additional_background_layer_tag, drawable);
    }

    private void setDefaultBackgroundList(View view, List<? extends DivBackgroundState> list) {
        view.setTag(R$id.div_default_background_list_tag, list);
    }

    private void setFocusedBackgroundList(View view, List<? extends DivBackgroundState> list) {
        view.setTag(R$id.div_focused_background_list_tag, list);
    }

    private DivBackgroundState toBackgroundState(X2 x22, Div2View div2View, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList;
        List emptyList;
        int i8;
        if (x22 instanceof X2.d) {
            X2.d dVar = (X2.d) x22;
            long longValue = ((Number) dVar.c().f1312a.evaluate(expressionResolver)).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i8 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i8 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.LinearGradient(i8, ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(dVar.c(), expressionResolver), div2View));
        }
        if (x22 instanceof X2.f) {
            X2.f fVar = (X2.f) x22;
            DivBackgroundState.RadialGradient.Center backgroundState = toBackgroundState(fVar.c().f8809a, displayMetrics, expressionResolver);
            DivBackgroundState.RadialGradient.Center backgroundState2 = toBackgroundState(fVar.c().f8810b, displayMetrics, expressionResolver);
            ExpressionList expressionList = fVar.c().f8812d;
            if (expressionList == null || (emptyList = expressionList.evaluate(expressionResolver)) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            return new DivBackgroundState.RadialGradient(backgroundState, backgroundState2, emptyList, toBackgroundState(fVar.c().f8813e, displayMetrics, expressionResolver));
        }
        if (x22 instanceof X2.c) {
            X2.c cVar = (X2.c) x22;
            double doubleValue = ((Number) cVar.c().f4321a.evaluate(expressionResolver)).doubleValue();
            EnumC1091v2 enumC1091v2 = (EnumC1091v2) cVar.c().f4322b.evaluate(expressionResolver);
            EnumC1109w2 enumC1109w2 = (EnumC1109w2) cVar.c().f4323c.evaluate(expressionResolver);
            Uri uri = (Uri) cVar.c().f4325e.evaluate(expressionResolver);
            boolean booleanValue = ((Boolean) cVar.c().f4326f.evaluate(expressionResolver)).booleanValue();
            Y6 y6 = (Y6) cVar.c().f4327g.evaluate(expressionResolver);
            List list = cVar.c().f4324d;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(toBackgroundState((AbstractC1130x5) it.next(), expressionResolver));
                }
            } else {
                arrayList = null;
            }
            return new DivBackgroundState.Image(doubleValue, enumC1091v2, enumC1109w2, uri, booleanValue, y6, arrayList, isVectorCompatible(cVar.c(), expressionResolver));
        }
        if (x22 instanceof X2.g) {
            return new DivBackgroundState.Solid(((Number) ((X2.g) x22).c().f8341a.evaluate(expressionResolver)).intValue());
        }
        if (!(x22 instanceof X2.e)) {
            throw new m();
        }
        X2.e eVar = (X2.e) x22;
        Uri uri2 = (Uri) eVar.c().f4647a.evaluate(expressionResolver);
        long longValue2 = ((Number) eVar.c().f4648b.f5581b.evaluate(expressionResolver)).longValue();
        long j5 = longValue2 >> 31;
        if (j5 == 0 || j5 == -1) {
            i4 = (int) longValue2;
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue2 + "' to Int");
            }
            i4 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue3 = ((Number) eVar.c().f4648b.f5583d.evaluate(expressionResolver)).longValue();
        long j6 = longValue3 >> 31;
        if (j6 == 0 || j6 == -1) {
            i5 = (int) longValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue3 + "' to Int");
            }
            i5 = longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue4 = ((Number) eVar.c().f4648b.f5582c.evaluate(expressionResolver)).longValue();
        long j7 = longValue4 >> 31;
        if (j7 == 0 || j7 == -1) {
            i6 = (int) longValue4;
        } else {
            KAssert kAssert4 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue4 + "' to Int");
            }
            i6 = longValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue5 = ((Number) eVar.c().f4648b.f5580a.evaluate(expressionResolver)).longValue();
        long j8 = longValue5 >> 31;
        if (j8 == 0 || j8 == -1) {
            i7 = (int) longValue5;
        } else {
            KAssert kAssert5 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue5 + "' to Int");
            }
            i7 = longValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return new DivBackgroundState.NinePatch(uri2, new Rect(i4, i5, i6, i7));
    }

    private Drawable toDrawable(List<? extends DivBackgroundState> list, BindingContext bindingContext, View view, Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        if (list == null) {
            if (drawable != null) {
                return new LayerDrawable(new Drawable[]{drawable});
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Drawable mutate = ((DivBackgroundState) it.next()).toDrawable(bindingContext, view, this.imageLoader).mutate();
            if (mutate != null) {
                arrayList.add(mutate);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (drawable != null) {
            mutableList.add(drawable);
        }
        List list2 = mutableList;
        if (list2.isEmpty()) {
            return null;
        }
        return new LayerDrawable((Drawable[]) list2.toArray(new Drawable[0]));
    }

    private void updateBackground(View view, Drawable drawable) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(R$drawable.native_animation_background) : null) != null) {
            Drawable g4 = androidx.core.content.a.g(view.getContext(), R$drawable.native_animation_background);
            if (g4 != null) {
                arrayList.add(g4);
            }
            z4 = true;
        } else {
            z4 = false;
        }
        view.setBackground(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
        if (z4) {
            Drawable background2 = view.getBackground();
            Intrinsics.checkNotNull(background2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            Drawable background3 = view.getBackground();
            Intrinsics.checkNotNull(background3, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            ((LayerDrawable) background2).setId(((LayerDrawable) background3).getNumberOfLayers() - 1, R$drawable.native_animation_background);
        }
    }

    public void bindBackground(@NotNull BindingContext context, @NotNull View view, @Nullable List<? extends X2> list, @Nullable List<? extends X2> list2, @Nullable List<? extends X2> list3, @Nullable List<? extends X2> list4, @NotNull ExpressionSubscriber subscriber, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (list3 == null) {
            bindDefaultBackground(context, view, drawable, list, list2, subscriber);
        } else {
            bindFocusBackground(context, view, drawable, list, list2, list3, list4, subscriber);
        }
    }

    private DivBackgroundState.RadialGradient.Center toBackgroundState(Aa aa, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (aa instanceof Aa.c) {
            return new DivBackgroundState.RadialGradient.Center.Fixed(BaseDivViewExtensionsKt.toPxF(((Aa.c) aa).c(), displayMetrics, expressionResolver));
        }
        if (aa instanceof Aa.d) {
            return new DivBackgroundState.RadialGradient.Center.Relative((float) ((Number) ((Aa.d) aa).c().f4787a.evaluate(expressionResolver)).doubleValue());
        }
        throw new m();
    }

    private DivBackgroundState.RadialGradient.Radius toBackgroundState(Na na, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (na instanceof Na.c) {
            return new DivBackgroundState.RadialGradient.Radius.Fixed(BaseDivViewExtensionsKt.toPxF(((Na.c) na).c(), displayMetrics, expressionResolver));
        }
        if (na instanceof Na.d) {
            return new DivBackgroundState.RadialGradient.Radius.Relative((Xa.c) ((Na.d) na).c().f5269a.evaluate(expressionResolver));
        }
        throw new m();
    }

    private DivBackgroundState.Image.Filter toBackgroundState(AbstractC1130x5 abstractC1130x5, ExpressionResolver expressionResolver) {
        int i4;
        if (abstractC1130x5 instanceof AbstractC1130x5.a) {
            AbstractC1130x5.a aVar = (AbstractC1130x5.a) abstractC1130x5;
            long longValue = ((Number) aVar.c().f6074a.evaluate(expressionResolver)).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i4 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.Image.Filter.Blur(i4, aVar);
        }
        if (abstractC1130x5 instanceof AbstractC1130x5.d) {
            return new DivBackgroundState.Image.Filter.RtlMirror((AbstractC1130x5.d) abstractC1130x5);
        }
        throw new m();
    }
}
