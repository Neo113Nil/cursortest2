package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: CompositeBackgroundDrawable.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EBo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0010\u00100\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u00101\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u00102\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u0005J\u0010\u00104\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001J\u0010\u00105\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u001a\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u00109\u001a\u00020:H\u0002J\u001a\u0010;\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u00109\u001a\u00020:H\u0002J\u001a\u0010=\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010 \u001a\u00020<2\u0006\u0010\u000f\u001a\u00020>H\u0016J=\u0010?\u001a\u00020\u0000\"\n\b\u0000\u0010@*\u0004\u0018\u00010\u00052\u0006\u0010A\u001a\u0002H@2\u0006\u00109\u001a\u00020:2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u0002H@\u0012\u0004\u0012\u00020<0CH\u0002¢\u0006\u0002\u0010DR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006F"}, d2 = {"Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "context", "Landroid/content/Context;", "originalBackground", "Landroid/graphics/drawable/Drawable;", "outerShadows", "cssBackground", "Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "border", "Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "feedbackUnderlay", "innerShadows", "outline", "Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "<init>", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/LayerDrawable;Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;Lcom/facebook/react/uimanager/drawable/BorderDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/LayerDrawable;Lcom/facebook/react/uimanager/drawable/OutlineDrawable;)V", "getOriginalBackground", "()Landroid/graphics/drawable/Drawable;", "getCssBackground", "()Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;", "value", "getOuterShadows", "()Landroid/graphics/drawable/LayerDrawable;", "getBackground", "()Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "getBorder", "()Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "getFeedbackUnderlay", "getInnerShadows", "getOutline", "()Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderInsets;", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", ViewProps.BORDER_RADIUS, "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "withNewCssBackground", "withNewOuterShadow", "withNewBackground", "withNewBorder", "withNewFeedbackUnderlay", "newUnderlay", "withNewInnerShadow", "withNewOutline", "updateLayer", "", "layer", "id", "", "insertNewLayer", "", "addLayer", "Landroid/graphics/Outline;", "withNewLayer", "T", "newLayer", "setNewLayer", "Lkotlin/Function1;", "(Landroid/graphics/drawable/Drawable;ILkotlin/jvm/functions/Function1;)Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositeBackgroundDrawable extends LayerDrawable {
    private static final int BACKGROUND_ID = 3;
    private static final int BORDER_ID = 4;
    private static final int CSS_BACKGROUND_ID = 2;
    private static final Companion Companion = new Companion(null);
    private static final int FEEDBACK_UNDERLAY_ID = 5;
    private static final int INNER_SHADOWS_ID = 6;
    private static final int ORIGINAL_BACKGROUND_ID = 0;
    private static final int OUTER_SHADOWS_ID = 1;
    private static final int OUTLINE_ID = 7;
    private BackgroundDrawable background;
    private BorderDrawable border;
    private BorderInsets borderInsets;
    private BorderRadiusStyle borderRadius;
    private final Context context;
    private final CSSBackgroundDrawable cssBackground;
    private Drawable feedbackUnderlay;
    private LayerDrawable innerShadows;
    private final Drawable originalBackground;
    private LayerDrawable outerShadows;
    private OutlineDrawable outline;

    public /* synthetic */ CompositeBackgroundDrawable(Context context, Drawable drawable, LayerDrawable layerDrawable, CSSBackgroundDrawable cSSBackgroundDrawable, BackgroundDrawable backgroundDrawable, BorderDrawable borderDrawable, Drawable drawable2, LayerDrawable layerDrawable2, OutlineDrawable outlineDrawable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? null : layerDrawable, (i & 8) != 0 ? null : cSSBackgroundDrawable, (i & 16) != 0 ? null : backgroundDrawable, (i & 32) != 0 ? null : borderDrawable, (i & 64) != 0 ? null : drawable2, (i & 128) != 0 ? null : layerDrawable2, (i & 256) == 0 ? outlineDrawable : null);
    }

    public final Drawable getOriginalBackground() {
        return this.originalBackground;
    }

    public final CSSBackgroundDrawable getCssBackground() {
        return this.cssBackground;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeBackgroundDrawable(Context context, Drawable drawable, LayerDrawable layerDrawable, CSSBackgroundDrawable cSSBackgroundDrawable, BackgroundDrawable backgroundDrawable, BorderDrawable borderDrawable, Drawable drawable2, LayerDrawable layerDrawable2, OutlineDrawable outlineDrawable) {
        super(new Drawable[0]);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.originalBackground = drawable;
        this.cssBackground = cSSBackgroundDrawable;
        this.outerShadows = layerDrawable;
        this.background = backgroundDrawable;
        this.border = borderDrawable;
        this.feedbackUnderlay = drawable2;
        this.innerShadows = layerDrawable2;
        this.outline = outlineDrawable;
        setPaddingMode(1);
        addLayer(drawable, 0);
        addLayer(layerDrawable, 1);
        addLayer(cSSBackgroundDrawable, 2);
        addLayer(backgroundDrawable, 3);
        addLayer(borderDrawable, 4);
        addLayer(drawable2, 5);
        addLayer(layerDrawable2, 6);
        addLayer(outlineDrawable, 7);
    }

    public final LayerDrawable getOuterShadows() {
        return this.outerShadows;
    }

    public final BackgroundDrawable getBackground() {
        return this.background;
    }

    public final BorderDrawable getBorder() {
        return this.border;
    }

    public final Drawable getFeedbackUnderlay() {
        return this.feedbackUnderlay;
    }

    public final LayerDrawable getInnerShadows() {
        return this.innerShadows;
    }

    public final OutlineDrawable getOutline() {
        return this.outline;
    }

    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    public final void setBorderInsets(BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    public final CompositeBackgroundDrawable withNewCssBackground(CSSBackgroundDrawable cssBackground) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, cssBackground, this.background, this.border, this.feedbackUnderlay, this.innerShadows, this.outline);
        compositeBackgroundDrawable.borderInsets = this.borderInsets;
        compositeBackgroundDrawable.borderRadius = this.borderRadius;
        return compositeBackgroundDrawable;
    }

    public final CompositeBackgroundDrawable withNewOuterShadow(LayerDrawable outerShadows) {
        return withNewLayer(outerShadows, 1, new CompositeBackgroundDrawable$withNewOuterShadow$1(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewOuterShadow$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getOuterShadows();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).outerShadows = (LayerDrawable) obj;
            }
        }));
    }

    public final CompositeBackgroundDrawable withNewBackground(BackgroundDrawable background) {
        return withNewLayer(background, 3, new CompositeBackgroundDrawable$withNewBackground$1(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewBackground$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getBackground();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).background = (BackgroundDrawable) obj;
            }
        }));
    }

    public final CompositeBackgroundDrawable withNewBorder(BorderDrawable border) {
        return withNewLayer(border, 4, new CompositeBackgroundDrawable$withNewBorder$1(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewBorder$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getBorder();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).border = (BorderDrawable) obj;
            }
        }));
    }

    public final CompositeBackgroundDrawable withNewFeedbackUnderlay(Drawable newUnderlay) {
        return withNewLayer(newUnderlay, 5, new CompositeBackgroundDrawable$withNewFeedbackUnderlay$1(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewFeedbackUnderlay$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getFeedbackUnderlay();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).feedbackUnderlay = (Drawable) obj;
            }
        }));
    }

    public final CompositeBackgroundDrawable withNewInnerShadow(LayerDrawable innerShadows) {
        return withNewLayer(innerShadows, 6, new CompositeBackgroundDrawable$withNewInnerShadow$1(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewInnerShadow$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getInnerShadows();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).innerShadows = (LayerDrawable) obj;
            }
        }));
    }

    public final CompositeBackgroundDrawable withNewOutline(OutlineDrawable outline) {
        return withNewLayer(outline, 7, new CompositeBackgroundDrawable$withNewOutline$1(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewOutline$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getOutline();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).outline = (OutlineDrawable) obj;
            }
        }));
    }

    private final boolean updateLayer(Drawable layer, int id) {
        if (layer == null) {
            return findDrawableByLayerId(id) == null;
        }
        if (findDrawableByLayerId(id) == null) {
            insertNewLayer(layer, id);
        } else {
            setDrawableByLayerId(id, layer);
        }
        invalidateSelf();
        return true;
    }

    private final void insertNewLayer(Drawable layer, int id) {
        if (layer == null) {
            return;
        }
        if (getNumberOfLayers() == 0) {
            addLayer(layer, id);
            return;
        }
        int numberOfLayers = getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            if (id < getId(i)) {
                Drawable drawable = getDrawable(i);
                Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
                int id2 = getId(i);
                setDrawable(i, layer);
                setId(i, id);
                insertNewLayer(drawable, id2);
                return;
            }
            if (i == getNumberOfLayers() - 1) {
                addLayer(layer, id);
                return;
            }
        }
    }

    private final void addLayer(Drawable layer, int id) {
        if (layer == null) {
            return;
        }
        addLayer(layer);
        layer.setCallback(this);
        setId(getNumberOfLayers() - 1, id);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle != null && borderRadiusStyle.hasRoundedBorders()) {
            Path path = new Path();
            BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
            ComputedBorderRadius resolve = borderRadiusStyle2 != null ? borderRadiusStyle2.resolve(getLayoutDirection(), this.context, getBounds().width(), getBounds().height()) : null;
            BorderInsets borderInsets = this.borderInsets;
            RectF resolve2 = borderInsets != null ? borderInsets.resolve(getLayoutDirection(), this.context) : null;
            if (resolve != null) {
                path.addRoundRect(new RectF(getBounds()), new float[]{PixelUtil.INSTANCE.dpToPx(resolve.getTopLeft().getHorizontal() + (resolve2 != null ? resolve2.left : 0.0f)), PixelUtil.INSTANCE.dpToPx(resolve.getTopLeft().getVertical() + (resolve2 != null ? resolve2.top : 0.0f)), PixelUtil.INSTANCE.dpToPx(resolve.getTopRight().getHorizontal() + (resolve2 != null ? resolve2.right : 0.0f)), PixelUtil.INSTANCE.dpToPx(resolve.getTopRight().getVertical() + (resolve2 != null ? resolve2.top : 0.0f)), PixelUtil.INSTANCE.dpToPx(resolve.getBottomRight().getHorizontal() + (resolve2 != null ? resolve2.right : 0.0f)), PixelUtil.INSTANCE.dpToPx(resolve.getBottomRight().getVertical() + (resolve2 != null ? resolve2.bottom : 0.0f)), PixelUtil.INSTANCE.dpToPx(resolve.getBottomLeft().getHorizontal() + (resolve2 != null ? resolve2.left : 0.0f)), PixelUtil.INSTANCE.dpToPx(resolve.getBottomLeft().getVertical() + (resolve2 != null ? resolve2.bottom : 0.0f))}, Path.Direction.CW);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                outline.setPath(path);
                return;
            } else {
                outline.setConvexPath(path);
                return;
            }
        }
        outline.setRect(getBounds());
    }

    private final <T extends Drawable> CompositeBackgroundDrawable withNewLayer(T newLayer, int id, Function1<? super T, Unit> setNewLayer) {
        setNewLayer.invoke(newLayer);
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables() && updateLayer(newLayer, id)) {
            return this;
        }
        CompositeBackgroundDrawable compositeBackgroundDrawable = new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, this.cssBackground, this.background, this.border, this.feedbackUnderlay, this.innerShadows, this.outline);
        compositeBackgroundDrawable.borderInsets = this.borderInsets;
        compositeBackgroundDrawable.borderRadius = this.borderRadius;
        return compositeBackgroundDrawable;
    }

    /* compiled from: CompositeBackgroundDrawable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable$Companion;", "", "<init>", "()V", "ORIGINAL_BACKGROUND_ID", "", "OUTER_SHADOWS_ID", "CSS_BACKGROUND_ID", "BACKGROUND_ID", "BORDER_ID", "FEEDBACK_UNDERLAY_ID", "INNER_SHADOWS_ID", "OUTLINE_ID", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
