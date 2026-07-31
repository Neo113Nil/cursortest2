package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.oi0;
import com.yandex.mobile.ads.impl.y91;
import j2.AbstractC3185a;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class lt extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    private ImageView f28736A;

    /* renamed from: B, reason: collision with root package name */
    private LinearLayout f28737B;

    /* renamed from: C, reason: collision with root package name */
    private CustomizableMediaView f28738C;

    /* renamed from: D, reason: collision with root package name */
    private LinearLayout f28739D;

    /* renamed from: E, reason: collision with root package name */
    @Nullable
    private ct f28740E;

    /* renamed from: F, reason: collision with root package name */
    @Nullable
    private z81 f28741F;

    /* renamed from: G, reason: collision with root package name */
    @Nullable
    private p81 f28742G;

    /* renamed from: H, reason: collision with root package name */
    private r51 f28743H;

    /* renamed from: I, reason: collision with root package name */
    @Nullable
    private f61 f28744I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final b f28745J;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d10 f28746a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mt f28747b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mp1 f28748c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28749d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28750e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28751f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private rt f28752g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f28753h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f28754i;

    /* renamed from: j, reason: collision with root package name */
    private Button f28755j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f28756k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f28757l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final ImageView f28758m;

    /* renamed from: n, reason: collision with root package name */
    private t12 f28759n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f28760o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f28761p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f28762q;

    /* renamed from: r, reason: collision with root package name */
    private jn1 f28763r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f28764s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f28765t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f28766u;

    /* renamed from: v, reason: collision with root package name */
    private LinearLayout f28767v;

    /* renamed from: w, reason: collision with root package name */
    private FrameLayout f28768w;

    /* renamed from: x, reason: collision with root package name */
    private LinearLayout f28769x;

    /* renamed from: y, reason: collision with root package name */
    private LinearLayout f28770y;

    /* renamed from: z, reason: collision with root package name */
    private LinearLayout f28771z;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28772a;

        static {
            int[] iArr = new int[y91.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y91.a aVar = y91.a.f34936b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                y91.a aVar2 = y91.a.f34936b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28772a = iArr;
        }
    }

    public static final class b implements ft {
        b() {
        }

        @Override // com.yandex.mobile.ads.impl.ft
        public final void onFinishLoadingImages() {
            f61 f61Var = lt.this.f28744I;
            if (f61Var != null) {
                f61Var.a(this);
            }
            r51 r51Var = lt.this.f28743H;
            if (r51Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdImagesAnimator");
                r51Var = null;
            }
            r51Var.a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lt(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull rt defaultTemplateAppearance, @NotNull i92 varioqubAdapterProvider, @NotNull InterfaceC2343xd appAdAnalyticsActivator) {
        this(context, attributeSet, i4, defaultTemplateAppearance, varioqubAdapterProvider, appAdAnalyticsActivator, null, null, null, 448, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultTemplateAppearance, "defaultTemplateAppearance");
        Intrinsics.checkNotNullParameter(varioqubAdapterProvider, "varioqubAdapterProvider");
        Intrinsics.checkNotNullParameter(appAdAnalyticsActivator, "appAdAnalyticsActivator");
    }

    private final void a() {
        float borderWidth = this.f28752g.getBannerAppearance().getBorderWidth();
        d10 d10Var = this.f28746a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d10Var.getClass();
        int a4 = d10.a(context, borderWidth);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f28752g.getBannerAppearance().getBackgroundColor());
        paint.setStyle(Paint.Style.FILL);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new RectShape());
        Paint paint2 = shapeDrawable2.getPaint();
        paint2.setColor(this.f28752g.getBannerAppearance().getBorderColor());
        paint2.setStrokeWidth(a4 * 2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        setBackground(new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2}));
        setPadding(a4, a4, a4, a4);
        v91 contentPadding = this.f28752g.getBannerAppearance().getContentPadding();
        t12 t12Var = null;
        if (contentPadding != null) {
            d10 d10Var2 = this.f28746a;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            float left = contentPadding.getLeft();
            d10Var2.getClass();
            int a5 = d10.a(context2, left);
            d10 d10Var3 = this.f28746a;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            float right = contentPadding.getRight();
            d10Var3.getClass();
            int a6 = d10.a(context3, right);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(a5, this.f28750e, a6, this.f28749d);
            LinearLayout linearLayout = this.f28769x;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topContainer");
                linearLayout = null;
            }
            linearLayout.setLayoutParams(layoutParams);
            LinearLayout linearLayout2 = this.f28769x;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topContainer");
                linearLayout2 = null;
            }
            linearLayout2.invalidate();
        }
        v91 contentPadding2 = this.f28752g.getBannerAppearance().getContentPadding();
        if (contentPadding2 != null) {
            d10 d10Var4 = this.f28746a;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            float left2 = contentPadding2.getLeft();
            d10Var4.getClass();
            int a7 = d10.a(context4, left2);
            d10 d10Var5 = this.f28746a;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            float right2 = contentPadding2.getRight();
            d10Var5.getClass();
            int a8 = d10.a(context5, right2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.leftMargin = a7;
            layoutParams2.rightMargin = a8;
            layoutParams2.bottomMargin = this.f28749d;
            LinearLayout linearLayout3 = this.f28770y;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
                linearLayout3 = null;
            }
            linearLayout3.setLayoutParams(layoutParams2);
            LinearLayout linearLayout4 = this.f28770y;
            if (linearLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
                linearLayout4 = null;
            }
            linearLayout4.invalidate();
        }
        v91 contentPadding3 = this.f28752g.getBannerAppearance().getContentPadding();
        if (contentPadding3 != null) {
            d10 d10Var6 = this.f28746a;
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            float left3 = contentPadding3.getLeft();
            d10Var6.getClass();
            int a9 = d10.a(context6, left3);
            d10 d10Var7 = this.f28746a;
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            float right3 = contentPadding3.getRight();
            d10Var7.getClass();
            int a10 = d10.a(context7, right3);
            TextView warningView = getWarningView();
            int i4 = this.f28749d;
            warningView.setPadding(a9, i4, a10, i4);
            getWarningView().invalidate();
        }
        z91 textAppearance = this.f28752g.getCallToActionAppearance().getTextAppearance();
        if (textAppearance != null) {
            getCallToActionView().setTextColor(textAppearance.getTextColor());
        }
        z91 textAppearance2 = this.f28752g.getCallToActionAppearance().getTextAppearance();
        if (textAppearance2 != null) {
            getCallToActionView().setTextSize(textAppearance2.getTextSize());
            Button callToActionView = getCallToActionView();
            z91 textAppearance3 = this.f28752g.getCallToActionAppearance().getTextAppearance();
            callToActionView.setTypeface(Typeface.create(textAppearance3 != null ? textAppearance3.getFontFamilyName() : null, textAppearance2.getFontStyle()));
        }
        d10 d10Var8 = this.f28746a;
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        d10Var8.getClass();
        float a11 = d10.a(context8, 5.0f);
        float[] fArr = new float[8];
        Arrays.fill(fArr, a11);
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, fArr);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(roundRectShape);
        shapeDrawable3.getPaint().setColor(this.f28752g.getCallToActionAppearance().getPressedColor());
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(roundRectShape);
        shapeDrawable4.getPaint().setColor(this.f28752g.getCallToActionAppearance().getNormalColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, shapeDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, shapeDrawable3);
        stateListDrawable.addState(new int[0], shapeDrawable4);
        d10 d10Var9 = this.f28746a;
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        float borderWidth2 = this.f28752g.getCallToActionAppearance().getBorderWidth();
        d10Var9.getClass();
        int a12 = d10.a(context9, borderWidth2);
        ShapeDrawable shapeDrawable5 = new ShapeDrawable();
        shapeDrawable5.setShape(roundRectShape);
        Paint paint3 = shapeDrawable5.getPaint();
        paint3.setColor(this.f28752g.getCallToActionAppearance().getBorderColor());
        paint3.setStrokeWidth(a12);
        paint3.setStyle(style);
        getCallToActionView().setBackground(new LayerDrawable(new Drawable[]{stateListDrawable, shapeDrawable5}));
        jn1 jn1Var = this.f28763r;
        if (jn1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_ratingView");
            jn1Var = null;
        }
        Drawable progressDrawable = jn1Var.getProgressDrawable();
        Intrinsics.checkNotNull(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
        Drawable drawable = layerDrawable.getDrawable(2);
        int progressStarColor = this.f28752g.getRatingAppearance().getProgressStarColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawable.setColorFilter(progressStarColor, mode);
        layerDrawable.getDrawable(1).setColorFilter(this.f28752g.getRatingAppearance().getBackgroundStarColor(), mode);
        layerDrawable.getDrawable(0).setColorFilter(this.f28752g.getRatingAppearance().getBackgroundStarColor(), mode);
        getAgeView().setTypeface(Typeface.create(this.f28752g.getAgeAppearance().getFontFamilyName(), this.f28752g.getAgeAppearance().getFontStyle()));
        getAgeView().setTextColor(this.f28752g.getAgeAppearance().getTextColor());
        getAgeView().setTextSize(2, this.f28752g.getAgeAppearance().getTextSize());
        getBodyView().setTypeface(Typeface.create(this.f28752g.getBodyAppearance().getFontFamilyName(), this.f28752g.getBodyAppearance().getFontStyle()));
        getBodyView().setTextColor(this.f28752g.getBodyAppearance().getTextColor());
        getBodyView().setTextSize(2, this.f28752g.getBodyAppearance().getTextSize());
        getDomainView().setTypeface(Typeface.create(this.f28752g.getDomainAppearance().getFontFamilyName(), this.f28752g.getDomainAppearance().getFontStyle()));
        getDomainView().setTextColor(this.f28752g.getDomainAppearance().getTextColor());
        getDomainView().setTextSize(2, this.f28752g.getDomainAppearance().getTextSize());
        getReviewCountView().setTypeface(Typeface.create(this.f28752g.getReviewCountAppearance().getFontFamilyName(), this.f28752g.getReviewCountAppearance().getFontStyle()));
        getReviewCountView().setTextColor(this.f28752g.getReviewCountAppearance().getTextColor());
        getReviewCountView().setTextSize(2, this.f28752g.getReviewCountAppearance().getTextSize());
        t12 t12Var2 = this.f28759n;
        if (t12Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_sponsoredView");
            t12Var2 = null;
        }
        t12Var2.setTypeface(Typeface.create(this.f28752g.getSponsoredAppearance().getFontFamilyName(), this.f28752g.getSponsoredAppearance().getFontStyle()));
        t12 t12Var3 = this.f28759n;
        if (t12Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_sponsoredView");
            t12Var3 = null;
        }
        t12Var3.setTextColor(this.f28752g.getSponsoredAppearance().getTextColor());
        t12 t12Var4 = this.f28759n;
        if (t12Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_sponsoredView");
        } else {
            t12Var = t12Var4;
        }
        t12Var.setTextSize(2, this.f28752g.getSponsoredAppearance().getTextSize());
        getTitleView().setTypeface(Typeface.create(this.f28752g.getTitleAppearance().getFontFamilyName(), this.f28752g.getTitleAppearance().getFontStyle()));
        getTitleView().setTextColor(this.f28752g.getTitleAppearance().getTextColor());
        getTitleView().setTextSize(2, this.f28752g.getTitleAppearance().getTextSize());
        getWarningView().setTypeface(Typeface.create(this.f28752g.getWarningAppearance().getFontFamilyName(), this.f28752g.getWarningAppearance().getFontStyle()));
        getWarningView().setTextColor(this.f28752g.getWarningAppearance().getTextColor());
        getWarningView().setTextSize(2, this.f28752g.getWarningAppearance().getTextSize());
        invalidate();
        requestLayout();
    }

    private final void b() {
        FrameLayout frameLayout;
        this.f28766u = c();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f28769x = linearLayout2;
        linearLayout2.setOrientation(0);
        LinearLayout linearLayout3 = this.f28769x;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContainer");
            linearLayout3 = null;
        }
        linearLayout3.setGravity(17);
        LinearLayout linearLayout4 = this.f28769x;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContainer");
            linearLayout4 = null;
        }
        linearLayout4.setWeightSum(4.0f);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        LinearLayout linearLayout5 = new LinearLayout(getContext());
        linearLayout5.setGravity(17);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t12 t12Var = new t12(context);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        t12Var.setEllipsize(truncateAt);
        t12Var.setMaxLines(1);
        t12Var.setGravity(17);
        d10 d10Var = this.f28746a;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        d10Var.getClass();
        t12Var.setPadding(0, 0, 0, d10.a(context2, 4.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        t12Var.setLayoutParams(layoutParams);
        this.f28759n = t12Var;
        linearLayout5.addView(t12Var);
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(getContext());
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(8388611);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.rightMargin = this.f28749d;
        textView.setLayoutParams(layoutParams2);
        this.f28753h = textView;
        linearLayout6.addView(getAgeView());
        LinearLayout linearLayout7 = this.f28769x;
        if (linearLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContainer");
            linearLayout7 = null;
        }
        linearLayout7.addView(linearLayout6);
        ViewGroup viewGroup = this.f28769x;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContainer");
            viewGroup2 = null;
        }
        viewGroup2.addView(linearLayout5);
        LinearLayout linearLayout8 = this.f28769x;
        if (linearLayout8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContainer");
            linearLayout8 = null;
        }
        linearLayout8.addView(view);
        LinearLayout linearLayout9 = this.f28769x;
        if (linearLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContainer");
            linearLayout9 = null;
        }
        LinearLayout linearLayout10 = new LinearLayout(getContext());
        this.f28770y = linearLayout10;
        linearLayout10.setOrientation(0);
        LinearLayout linearLayout11 = this.f28770y;
        if (linearLayout11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
            linearLayout11 = null;
        }
        linearLayout11.setBaselineAligned(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = this.f28749d;
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setLayoutParams(layoutParams3);
        this.f28762q = c();
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType(scaleType);
        this.f28765t = imageView;
        frameLayout2.addView(getIconView());
        frameLayout2.addView(this.f28758m);
        frameLayout2.addView(getFaviconView());
        LinearLayout linearLayout12 = new LinearLayout(getContext());
        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout12.setOrientation(1);
        TextView textView2 = new TextView(getContext());
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(2);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f28760o = textView2;
        TextView textView3 = new TextView(getContext());
        textView3.setEllipsize(truncateAt);
        textView3.setMaxLines(3);
        textView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f28754i = textView3;
        TextView textView4 = new TextView(getContext());
        textView4.setEllipsize(truncateAt);
        textView4.setMaxLines(1);
        textView4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f28756k = textView4;
        linearLayout12.addView(getTitleView());
        linearLayout12.addView(getBodyView());
        linearLayout12.addView(getDomainView());
        LinearLayout linearLayout13 = new LinearLayout(getContext());
        this.f28771z = linearLayout13;
        linearLayout13.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = this.f28750e;
        LinearLayout linearLayout14 = this.f28771z;
        if (linearLayout14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
            linearLayout14 = null;
        }
        linearLayout14.setLayoutParams(layoutParams4);
        LinearLayout linearLayout15 = new LinearLayout(getContext());
        linearLayout15.setOrientation(1);
        linearLayout15.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        jn1 jn1Var = new jn1(context3, null, R.attr.ratingBarStyleSmall);
        jn1Var.setNumStars(5);
        jn1Var.setStepSize(0.5f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.rightMargin = this.f28750e;
        jn1Var.setLayoutParams(layoutParams5);
        this.f28763r = jn1Var;
        TextView textView5 = new TextView(getContext());
        textView5.setEllipsize(truncateAt);
        textView5.setMaxLines(1);
        textView5.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f28764s = textView5;
        jn1 jn1Var2 = this.f28763r;
        if (jn1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_ratingView");
            jn1Var2 = null;
        }
        linearLayout15.addView(jn1Var2);
        linearLayout15.addView(getReviewCountView());
        LinearLayout linearLayout16 = new LinearLayout(getContext());
        linearLayout16.setOrientation(0);
        linearLayout16.setGravity(5);
        linearLayout16.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(getContext(), null, R.attr.borderlessButtonStyle);
        button.setEllipsize(truncateAt);
        button.setMaxLines(1);
        button.setTransformationMethod(null);
        d10 d10Var2 = this.f28746a;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        d10Var2.getClass();
        int a4 = d10.a(context4, 26.0f);
        button.setMinimumHeight(a4);
        button.setMinHeight(a4);
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f28755j = button;
        linearLayout16.addView(getCallToActionView());
        LinearLayout linearLayout17 = this.f28771z;
        if (linearLayout17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
            linearLayout17 = null;
        }
        linearLayout17.addView(linearLayout15);
        LinearLayout linearLayout18 = this.f28771z;
        if (linearLayout18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
            linearLayout18 = null;
        }
        linearLayout18.addView(linearLayout16);
        LinearLayout linearLayout19 = this.f28771z;
        if (linearLayout19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
            linearLayout19 = null;
        }
        linearLayout12.addView(linearLayout19);
        LinearLayout linearLayout20 = this.f28770y;
        if (linearLayout20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
            linearLayout20 = null;
        }
        linearLayout20.addView(frameLayout2);
        LinearLayout linearLayout21 = this.f28770y;
        if (linearLayout21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
            linearLayout21 = null;
        }
        linearLayout21.addView(linearLayout12);
        LinearLayout linearLayout22 = this.f28770y;
        if (linearLayout22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
            linearLayout22 = null;
        }
        LinearLayout linearLayout23 = new LinearLayout(getContext());
        linearLayout23.setOrientation(0);
        linearLayout23.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f28737B = linearLayout23;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setAdjustViewBounds(true);
        imageView2.setScaleType(scaleType);
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f28736A = imageView2;
        LinearLayout linearLayout24 = this.f28737B;
        if (linearLayout24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("largeImageContainer");
            linearLayout24 = null;
        }
        ImageView imageView3 = this.f28736A;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("largeImageView");
            imageView3 = null;
        }
        linearLayout24.addView(imageView3);
        LinearLayout linearLayout25 = this.f28737B;
        if (linearLayout25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("largeImageContainer");
            linearLayout25 = null;
        }
        LinearLayout linearLayout26 = new LinearLayout(getContext());
        linearLayout26.setOrientation(0);
        linearLayout26.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f28739D = linearLayout26;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        CustomizableMediaView customizableMediaView = new CustomizableMediaView(context5);
        customizableMediaView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f28738C = customizableMediaView;
        LinearLayout linearLayout27 = this.f28739D;
        if (linearLayout27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaContainer");
            linearLayout27 = null;
        }
        linearLayout27.addView(getMediaView());
        LinearLayout linearLayout28 = this.f28739D;
        if (linearLayout28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaContainer");
            linearLayout28 = null;
        }
        TextView textView6 = new TextView(getContext());
        textView6.setEllipsize(truncateAt);
        this.f28761p = textView6;
        TextView warningView = getWarningView();
        linearLayout.addView(linearLayout9);
        linearLayout.addView(linearLayout22);
        linearLayout.addView(linearLayout25);
        linearLayout.addView(linearLayout28);
        linearLayout.addView(warningView);
        this.f28767v = linearLayout;
        v91 contentPadding = this.f28752g.getBannerAppearance().getContentPadding();
        if (contentPadding != null) {
            d10 d10Var3 = this.f28746a;
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            float right = contentPadding.getRight();
            d10Var3.getClass();
            int a5 = d10.a(context6, right) - this.f28750e;
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            ta0 ta0Var = new ta0(context7);
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            this.f28768w = new la0(context8).a();
            this.f28757l = ta0Var.a(a5, this.f28749d);
            FrameLayout frameLayout3 = this.f28768w;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedbackContainer");
                frameLayout3 = null;
            }
            frameLayout3.addView(getFeedbackView());
            FrameLayout frameLayout4 = this.f28768w;
            if (frameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedbackContainer");
                frameLayout4 = null;
            }
            frameLayout4.setVisibility(8);
        }
        ImageView imageView4 = this.f28766u;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adFoxView");
            imageView4 = null;
        }
        addView(imageView4, new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout29 = this.f28767v;
        if (linearLayout29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainContainer");
            linearLayout29 = null;
        }
        addView(linearLayout29, new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout5 = this.f28768w;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedbackContainer");
            frameLayout = null;
        } else {
            frameLayout = frameLayout5;
        }
        addView(frameLayout);
        hideContent();
        ImageView faviconView = getFaviconView();
        ImageView iconView = getIconView();
        ImageView imageView5 = this.f28758m;
        ImageView imageView6 = this.f28736A;
        if (imageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("largeImageView");
            imageView6 = null;
        }
        ImageView imageView7 = this.f28766u;
        if (imageView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adFoxView");
            imageView7 = null;
        }
        this.f28743H = new r51(faviconView, iconView, imageView5, imageView6, imageView7);
        a();
    }

    private final ImageView c() {
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    public final void applyAppearance(@NotNull rt templateAppearance) {
        Intrinsics.checkNotNullParameter(templateAppearance, "templateAppearance");
        if (Intrinsics.areEqual(templateAppearance, this.f28752g)) {
            return;
        }
        this.f28752g = templateAppearance;
        a();
    }

    @NotNull
    public final TextView getAgeView() {
        TextView textView = this.f28753h;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ageView");
        return null;
    }

    @NotNull
    public final TextView getBodyView() {
        TextView textView = this.f28754i;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bodyView");
        return null;
    }

    @NotNull
    public final Button getCallToActionView() {
        Button button = this.f28755j;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callToActionView");
        return null;
    }

    @NotNull
    public final TextView getDomainView() {
        TextView textView = this.f28756k;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("domainView");
        return null;
    }

    @NotNull
    public final ImageView getFaviconView() {
        ImageView imageView = this.f28765t;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("faviconView");
        return null;
    }

    @NotNull
    public final ImageView getFeedbackView() {
        ImageView imageView = this.f28757l;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
        return null;
    }

    @NotNull
    public final ImageView getIconView() {
        ImageView imageView = this.f28762q;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iconView");
        return null;
    }

    @NotNull
    public final ImageView getImageView() {
        ct ctVar;
        et image;
        ImageView imageView = this.f28758m;
        if (this.f28742G != null && (ctVar = this.f28740E) != null && (image = ctVar.h()) != null) {
            Intrinsics.checkNotNullParameter(image, "image");
            if (Intrinsics.areEqual("fill", image.c())) {
                ImageView imageView2 = this.f28766u;
                if (imageView2 != null) {
                    return imageView2;
                }
                Intrinsics.throwUninitializedPropertyAccessException("adFoxView");
                return null;
            }
            if (p81.a(image) && (imageView = this.f28736A) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("largeImageView");
                return null;
            }
        }
        return imageView;
    }

    @NotNull
    public final CustomizableMediaView getMediaView() {
        CustomizableMediaView customizableMediaView = this.f28738C;
        if (customizableMediaView != null) {
            return customizableMediaView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaView");
        return null;
    }

    @NotNull
    public final View getRatingView() {
        jn1 jn1Var = this.f28763r;
        if (jn1Var != null) {
            return jn1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_ratingView");
        return null;
    }

    @NotNull
    public final TextView getReviewCountView() {
        TextView textView = this.f28764s;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reviewCountView");
        return null;
    }

    @NotNull
    public final TextView getSponsoredView() {
        t12 t12Var = this.f28759n;
        if (t12Var != null) {
            return t12Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_sponsoredView");
        return null;
    }

    @NotNull
    public final TextView getTitleView() {
        TextView textView = this.f28760o;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("titleView");
        return null;
    }

    @NotNull
    public final TextView getWarningView() {
        TextView textView = this.f28761p;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("warningView");
        return null;
    }

    public final void hideContent() {
        ImageView imageView = this.f28766u;
        LinearLayout linearLayout = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adFoxView");
            imageView = null;
        }
        imageView.setVisibility(8);
        LinearLayout linearLayout2 = this.f28767v;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainContainer");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f61 f61Var = this.f28744I;
        if (f61Var != null) {
            f61Var.b(this.f28745J);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        f61 f61Var = this.f28744I;
        if (f61Var != null) {
            f61Var.a(this.f28745J);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i4, int i5) {
        LinearLayout linearLayout;
        et image;
        int i6;
        int i7;
        z81 z81Var;
        ct ctVar;
        et h4;
        ct ctVar2;
        et g4;
        ct ctVar3;
        et e4;
        int size = View.MeasureSpec.getSize(i4);
        float borderWidth = this.f28752g.getBannerAppearance().getBorderWidth();
        d10 d10Var = this.f28746a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d10Var.getClass();
        int a4 = size - (d10.a(context, borderWidth) * 2);
        if (a4 < 0) {
            a4 = 0;
        }
        p81 p81Var = this.f28742G;
        if (p81Var != null) {
            v91 contentPadding = this.f28752g.getBannerAppearance().getContentPadding();
            if (contentPadding != null) {
                Context context2 = getContext();
                d10 d10Var2 = this.f28746a;
                Intrinsics.checkNotNull(context2);
                float left = contentPadding.getLeft();
                d10Var2.getClass();
                int a5 = d10.a(context2, left);
                d10 d10Var3 = this.f28746a;
                float right = contentPadding.getRight();
                d10Var3.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                int c4 = AbstractC3185a.c(TypedValue.applyDimension(1, right, context2.getResources().getDisplayMetrics()));
                v91 imageMargins = this.f28752g.getBannerAppearance().getImageMargins();
                if (imageMargins != null) {
                    if (p81Var.a() || p81Var.b() || p81Var.e()) {
                        int c5 = AbstractC3185a.c((a4 - a5) - c4);
                        float left2 = imageMargins.getLeft();
                        d10 d10Var4 = this.f28746a;
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        d10Var4.getClass();
                        int a6 = d10.a(context3, left2);
                        this.f28746a.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        int c6 = AbstractC3185a.c(TypedValue.applyDimension(1, a5, context2.getResources().getDisplayMetrics())) + a6;
                        float right2 = imageMargins.getRight();
                        d10 d10Var5 = this.f28746a;
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        d10Var5.getClass();
                        int a7 = d10.a(context4, right2);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
                        if (p81Var.a() && (ctVar3 = this.f28740E) != null && (e4 = ctVar3.e()) != null) {
                            int d4 = e4.d();
                            int b4 = e4.b();
                            y91 widthConstraint = this.f28752g.getFaviconAppearance().getWidthConstraint();
                            if (widthConstraint != null) {
                                oi0 a8 = a(widthConstraint);
                                Context context5 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                oi0.d a9 = a8.a(context5, c5, d4, b4);
                                d10 d10Var6 = this.f28746a;
                                Context context6 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                                d10Var6.getClass();
                                int a10 = d10.a(context6, 5.0f);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a9.b(), a9.a());
                                layoutParams2.leftMargin = c6;
                                layoutParams2.rightMargin = a10;
                                layoutParams = layoutParams2;
                            }
                        }
                        getFaviconView().setLayoutParams(layoutParams);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                        if (p81Var.b() && (ctVar2 = this.f28740E) != null && (g4 = ctVar2.g()) != null) {
                            layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                            y91 widthConstraint2 = this.f28752g.getImageAppearance().getWidthConstraint();
                            if (widthConstraint2 != null) {
                                int d5 = g4.d();
                                int b5 = g4.b();
                                oi0 a11 = a(widthConstraint2);
                                Context context7 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                                oi0.d a12 = a11.a(context7, c5, d5, b5);
                                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(a12.b(), a12.a());
                                layoutParams4.leftMargin = c6;
                                layoutParams4.rightMargin = a7;
                                layoutParams3 = layoutParams4;
                            }
                        }
                        getIconView().setLayoutParams(layoutParams3);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(0, 0);
                        if (p81Var.e() && (ctVar = this.f28740E) != null && (h4 = ctVar.h()) != null) {
                            layoutParams5 = new FrameLayout.LayoutParams(0, 0);
                            y91 widthConstraint3 = this.f28752g.getImageAppearance().getWidthConstraint();
                            if (widthConstraint3 != null) {
                                int d6 = h4.d();
                                int b6 = h4.b();
                                oi0 a13 = a(widthConstraint3);
                                Context context8 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                                oi0.d a14 = a13.a(context8, c5, d6, b6);
                                layoutParams5 = new FrameLayout.LayoutParams(a14.b(), a14.a());
                                layoutParams5.leftMargin = c6;
                                layoutParams5.rightMargin = a7;
                            }
                        }
                        this.f28758m.setLayoutParams(layoutParams5);
                        LinearLayout linearLayout2 = this.f28770y;
                        if (linearLayout2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
                            linearLayout2 = null;
                        }
                        ViewGroup.LayoutParams layoutParams6 = linearLayout2.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams6;
                        layoutParams7.leftMargin = 0;
                        LinearLayout linearLayout3 = this.f28770y;
                        if (linearLayout3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
                            linearLayout3 = null;
                        }
                        linearLayout3.setLayoutParams(layoutParams7);
                    } else {
                        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(0, 0);
                        getFaviconView().setLayoutParams(layoutParams8);
                        getIconView().setLayoutParams(layoutParams8);
                        this.f28758m.setLayoutParams(layoutParams8);
                        LinearLayout linearLayout4 = this.f28770y;
                        if (linearLayout4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
                            linearLayout4 = null;
                        }
                        ViewGroup.LayoutParams layoutParams9 = linearLayout4.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
                        layoutParams10.leftMargin = a5;
                        LinearLayout linearLayout5 = this.f28770y;
                        if (linearLayout5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
                            linearLayout5 = null;
                        }
                        linearLayout5.setLayoutParams(layoutParams10);
                    }
                }
            }
            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, 0);
            if (p81Var.c()) {
                layoutParams11 = new LinearLayout.LayoutParams(0, 0);
                ct ctVar4 = this.f28740E;
                if (ctVar4 != null && (image = ctVar4.h()) != null) {
                    int d7 = image.d();
                    int b7 = image.b();
                    Intrinsics.checkNotNullParameter(image, "image");
                    float d8 = image.d();
                    float b8 = image.b();
                    if (b8 != 0.0f && d8 / b8 < 1.0f) {
                        i7 = AbstractC3185a.c(a4 * 0.75f);
                        i6 = AbstractC3185a.c((i7 / b7) * d7);
                    } else {
                        if (d7 != 0) {
                            b7 = AbstractC3185a.c(b7 * (a4 / d7));
                        }
                        i6 = a4;
                        i7 = b7;
                    }
                    Intrinsics.checkNotNullParameter(image, "image");
                    float d9 = image.d();
                    float b9 = image.b();
                    if (b9 == 0.0f || d9 / b9 <= 1.5f) {
                        i7 = AbstractC3185a.c(i7 * 0.8f);
                    }
                    LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(i6, i7);
                    z81 z81Var2 = this.f28741F;
                    layoutParams12.topMargin = ((z81Var2 == null || !z81Var2.a()) && ((z81Var = this.f28741F) == null || !z81Var.e())) ? 0 : this.f28749d;
                    layoutParams12.gravity = 1;
                    layoutParams11 = layoutParams12;
                }
            }
            LinearLayout linearLayout6 = this.f28737B;
            if (linearLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("largeImageContainer");
                linearLayout6 = null;
            }
            linearLayout6.setLayoutParams(layoutParams11);
        }
        p81 p81Var2 = this.f28742G;
        if (p81Var2 != null) {
            LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(0, 0);
            ct ctVar5 = this.f28740E;
            jt i8 = ctVar5 != null ? ctVar5.i() : null;
            if (i8 != null && p81Var2.d()) {
                layoutParams13 = new LinearLayout.LayoutParams(a4, new C2230sf(i8.a()).a(a4));
            }
            LinearLayout linearLayout7 = this.f28739D;
            if (linearLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mediaContainer");
                linearLayout7 = null;
            }
            linearLayout7.setLayoutParams(layoutParams13);
        }
        z81 z81Var3 = this.f28741F;
        if (z81Var3 == null || !z81Var3.f()) {
            LinearLayout linearLayout8 = this.f28771z;
            if (linearLayout8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
                linearLayout8 = null;
            }
            linearLayout8.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        } else {
            z81 z81Var4 = this.f28741F;
            if (z81Var4 == null || !z81Var4.h()) {
                LinearLayout linearLayout9 = this.f28771z;
                if (linearLayout9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
                    linearLayout9 = null;
                }
                ViewParent parent = linearLayout9.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewManager");
                ViewManager viewManager = (ViewManager) parent;
                LinearLayout linearLayout10 = this.f28771z;
                if (linearLayout10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
                    linearLayout10 = null;
                }
                viewManager.removeView(linearLayout10);
                LinearLayout linearLayout11 = this.f28771z;
                if (linearLayout11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
                    linearLayout11 = null;
                }
                linearLayout11.setPadding(0, 0, 0, 0);
                LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
                int i9 = this.f28750e;
                layoutParams14.topMargin = i9;
                layoutParams14.bottomMargin = i9;
                ViewParent parent2 = getDomainView().getParent();
                Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewManager");
                ViewManager viewManager2 = (ViewManager) parent2;
                LinearLayout linearLayout12 = this.f28771z;
                if (linearLayout12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
                    linearLayout12 = null;
                }
                viewManager2.addView(linearLayout12, layoutParams14);
            } else {
                LinearLayout linearLayout13 = this.f28771z;
                if (linearLayout13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
                    linearLayout13 = null;
                }
                ViewParent parent3 = linearLayout13.getParent();
                Intrinsics.checkNotNull(parent3, "null cannot be cast to non-null type android.view.ViewManager");
                ViewManager viewManager3 = (ViewManager) parent3;
                LinearLayout linearLayout14 = this.f28771z;
                if (linearLayout14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
                    linearLayout14 = null;
                }
                viewManager3.removeView(linearLayout14);
                LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, -2);
                z81 z81Var5 = this.f28741F;
                if (z81Var5 == null || !z81Var5.c()) {
                    layoutParams15.topMargin = this.f28749d;
                } else {
                    layoutParams15.topMargin = this.f28751f;
                }
                layoutParams15.bottomMargin = this.f28750e;
                LinearLayout linearLayout15 = this.f28771z;
                if (linearLayout15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
                    linearLayout15 = null;
                }
                linearLayout15.setLayoutParams(layoutParams15);
                v91 contentPadding2 = this.f28752g.getBannerAppearance().getContentPadding();
                if (contentPadding2 != null) {
                    d10 d10Var7 = this.f28746a;
                    Context context9 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                    float left3 = contentPadding2.getLeft();
                    d10Var7.getClass();
                    int a15 = d10.a(context9, left3);
                    d10 d10Var8 = this.f28746a;
                    Context context10 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                    float right3 = contentPadding2.getRight();
                    d10Var8.getClass();
                    int a16 = d10.a(context10, right3);
                    LinearLayout linearLayout16 = this.f28771z;
                    if (linearLayout16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
                        linearLayout16 = null;
                    }
                    linearLayout16.setPadding(a15, 0, a16, 0);
                    LinearLayout linearLayout17 = this.f28767v;
                    if (linearLayout17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mainContainer");
                        linearLayout17 = null;
                    }
                    LinearLayout linearLayout18 = this.f28771z;
                    if (linearLayout18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("callToActionContainer");
                        linearLayout18 = null;
                    }
                    LinearLayout linearLayout19 = this.f28767v;
                    if (linearLayout19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mainContainer");
                        linearLayout = null;
                    } else {
                        linearLayout = linearLayout19;
                    }
                    linearLayout17.addView(linearLayout18, linearLayout.getChildCount() - 1);
                }
            }
            z81 z81Var6 = this.f28741F;
            getCallToActionView().setLayoutParams((z81Var6 == null || !z81Var6.g()) ? new LinearLayout.LayoutParams(-2, -2) : new LinearLayout.LayoutParams(-1, -2));
        }
        int c7 = AbstractC3185a.c(a4 * 0.4f);
        getCallToActionView().setMinWidth(c7);
        getCallToActionView().setMinimumWidth(c7);
        z81 z81Var7 = this.f28741F;
        if (z81Var7 != null && z81Var7.i()) {
            TextView warningView = getWarningView();
            z81 z81Var8 = this.f28741F;
            if (z81Var8 == null || !z81Var8.j()) {
                warningView.setBackgroundColor(lh2.a(warningView.getCurrentTextColor(), 92.0f));
            } else {
                warningView.setBackgroundColor(0);
            }
            getWarningView().setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        super.onMeasure(i4, i5);
    }

    public final void setAd(@NotNull f61 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        f61 f61Var = this.f28744I;
        if (f61Var != nativeAd) {
            if (f61Var != null) {
                try {
                    f61Var.a(this.f28745J);
                } catch (t51 e4) {
                    ap0.b(new Object[0]);
                    this.f28748c.reportError("Failed to set Native Ad", e4);
                    return;
                }
            }
            nativeAd.b(this.f28745J);
            zq1 adType = nativeAd.getAdType();
            ct adAssets = nativeAd.getAdAssets();
            this.f28741F = new z81(adAssets, adType);
            this.f28742G = new p81(adAssets, adType);
            this.f28740E = adAssets;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ha0 ha0Var = new ha0(context, adAssets, new ia0(adAssets, new C2232sh()));
            ImageView feedbackView = getFeedbackView();
            FrameLayout frameLayout = this.f28768w;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedbackContainer");
                frameLayout = null;
            }
            ha0Var.a(feedbackView, frameLayout, this.f28751f);
            this.f28747b.getClass();
            nativeAd.b(mt.a(this));
            showContent();
            this.f28744I = nativeAd;
        }
    }

    public final void showContent() {
        et image;
        ct ctVar = this.f28740E;
        LinearLayout linearLayout = null;
        int i4 = 0;
        if (ctVar != null && (image = ctVar.h()) != null) {
            if (this.f28742G != null) {
                Intrinsics.checkNotNullParameter(image, "image");
                if (Intrinsics.areEqual("fill", image.c())) {
                    ImageView imageView = this.f28766u;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adFoxView");
                        imageView = null;
                    }
                    imageView.setVisibility(0);
                    i4 = 8;
                }
            }
            if (this.f28742G != null && p81.a(image)) {
                z81 z81Var = this.f28741F;
                if (z81Var != null && !z81Var.a()) {
                    LinearLayout linearLayout2 = this.f28770y;
                    if (linearLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("centerContainer");
                        linearLayout2 = null;
                    }
                    linearLayout2.setVisibility(8);
                }
                z81 z81Var2 = this.f28741F;
                if (z81Var2 != null && !z81Var2.e()) {
                    LinearLayout linearLayout3 = this.f28769x;
                    if (linearLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topContainer");
                        linearLayout3 = null;
                    }
                    linearLayout3.setVisibility(8);
                }
            }
        }
        LinearLayout linearLayout4 = this.f28767v;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainContainer");
        } else {
            linearLayout = linearLayout4;
        }
        linearLayout.setVisibility(i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lt(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull rt defaultTemplateAppearance, @NotNull i92 varioqubAdapterProvider, @NotNull InterfaceC2343xd appAdAnalyticsActivator, @NotNull d10 dimensionConverter) {
        this(context, attributeSet, i4, defaultTemplateAppearance, varioqubAdapterProvider, appAdAnalyticsActivator, dimensionConverter, null, null, 384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultTemplateAppearance, "defaultTemplateAppearance");
        Intrinsics.checkNotNullParameter(varioqubAdapterProvider, "varioqubAdapterProvider");
        Intrinsics.checkNotNullParameter(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lt(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull rt defaultTemplateAppearance, @NotNull i92 varioqubAdapterProvider, @NotNull InterfaceC2343xd appAdAnalyticsActivator, @NotNull d10 dimensionConverter, @NotNull mt coreNativeBannerViewAdapter) {
        this(context, attributeSet, i4, defaultTemplateAppearance, varioqubAdapterProvider, appAdAnalyticsActivator, dimensionConverter, coreNativeBannerViewAdapter, null, UserVerificationMethods.USER_VERIFY_HANDPRINT, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultTemplateAppearance, "defaultTemplateAppearance");
        Intrinsics.checkNotNullParameter(varioqubAdapterProvider, "varioqubAdapterProvider");
        Intrinsics.checkNotNullParameter(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        Intrinsics.checkNotNullParameter(coreNativeBannerViewAdapter, "coreNativeBannerViewAdapter");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull rt defaultTemplateAppearance, @NotNull i92 varioqubAdapterProvider, @NotNull InterfaceC2343xd appAdAnalyticsActivator, @NotNull d10 dimensionConverter, @NotNull mt coreNativeBannerViewAdapter, @NotNull mp1 reporter) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultTemplateAppearance, "defaultTemplateAppearance");
        Intrinsics.checkNotNullParameter(varioqubAdapterProvider, "varioqubAdapterProvider");
        Intrinsics.checkNotNullParameter(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        Intrinsics.checkNotNullParameter(coreNativeBannerViewAdapter, "coreNativeBannerViewAdapter");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f28746a = dimensionConverter;
        this.f28747b = coreNativeBannerViewAdapter;
        this.f28748c = reporter;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        dimensionConverter.getClass();
        this.f28749d = d10.a(context2, 4.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f28750e = d10.a(context3, 8.0f);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.f28751f = d10.a(context4, 12.0f);
        this.f28752g = defaultTemplateAppearance;
        this.f28758m = c();
        this.f28745J = new b();
        b();
    }

    public /* synthetic */ lt(Context context, AttributeSet attributeSet, int i4, rt rtVar, i92 i92Var, InterfaceC2343xd interfaceC2343xd, d10 d10Var, mt mtVar, mp1 mp1Var, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i4, rtVar, i92Var, interfaceC2343xd, (i5 & 64) != 0 ? new d10() : d10Var, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new mt() : mtVar, (i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? C1900ed.a(context, i92Var, interfaceC2343xd) : mp1Var);
    }

    private static oi0 a(y91 y91Var) {
        y91.a type = y91Var.getSizeConstraintType().getType();
        int i4 = type == null ? -1 : a.f28772a[type.ordinal()];
        if (i4 == 1) {
            return new oi0.a(y91Var.getValue());
        }
        if (i4 == 2) {
            return new oi0.b(y91Var.getValue());
        }
        if (i4 != 3) {
            return new oi0.c(y91Var.getValue());
        }
        return new oi0.c(y91Var.getValue());
    }
}
