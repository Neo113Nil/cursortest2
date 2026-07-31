package com.yandex.div.core.view2.divs.widgets;

import O1.C0735b4;
import O1.C0860i3;
import O1.C1081ua;
import O1.Ib;
import O1.J4;
import O1.Qc;
import O1.Tc;
import W1.h;
import W1.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.NinePatch;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import c2.AbstractC1380c;
import com.yandex.div.R$dimen;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ShadowCache;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientViewKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivBorderDrawer implements ExpressionSubscriber {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private C0860i3 border;

    @NotNull
    private final h borderParams$delegate;

    @NotNull
    private final ClipParams clipParams;

    @Nullable
    private float[] cornerRadii;

    @NotNull
    private final Div2View divView;
    private boolean hasBorder;
    private boolean hasCustomShadow;
    private boolean hasDifferentCornerRadii;
    private boolean hasShadow;
    private boolean needClipping;

    @NotNull
    private final RoundedRectOutlineProvider outlineProvider;

    @NotNull
    private final h shadowParams$delegate;
    private float strokeWidth;

    @NotNull
    private final List<Disposable> subscriptions;

    @NotNull
    private final View view;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    final class BorderParams {
        private final float defaultDashWidth;
        private final float defaultGapWidth;
        private final float halfDp;
        private boolean isDashed;

        @NotNull
        private final Paint paint;

        @NotNull
        private final Path path;

        @NotNull
        private final RectF rect;

        public BorderParams() {
            Paint paint = new Paint();
            this.paint = paint;
            this.path = new Path();
            this.halfDp = BaseDivViewExtensionsKt.dpToPxF(Double.valueOf(0.5d), DivBorderDrawer.this.getDisplayMetrics());
            this.defaultDashWidth = BaseDivViewExtensionsKt.dpToPxF(6, DivBorderDrawer.this.getDisplayMetrics());
            this.defaultGapWidth = BaseDivViewExtensionsKt.dpToPxF(2, DivBorderDrawer.this.getDisplayMetrics());
            this.rect = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
        }

        private final float calculatePerimeter(float f4, float f5, float[] fArr) {
            float f6 = 2;
            float f7 = (f4 * f6) + (f6 * f5);
            if (fArr.length != 8) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivBorderDrawer", "Wrong corner radii count " + fArr.length + ". Expected 8");
                }
                return f7;
            }
            int i4 = 0;
            int c4 = AbstractC1380c.c(0, fArr.length - 1, 2);
            if (c4 >= 0) {
                while (true) {
                    float f8 = fArr[i4];
                    f7 = ((f7 - f8) - fArr[i4 + 1]) + ((float) (Math.sqrt(((f8 * f8) + (r2 * r2)) / 8.0d) * 3.141592653589793d));
                    if (i4 == c4) {
                        break;
                    }
                    i4 += 2;
                }
            }
            return g.c(f7, 0.0f);
        }

        private final DashPathEffect createDashPathEffect(float f4) {
            float f5;
            float f6;
            if (f4 > 0.0f) {
                float f7 = this.defaultDashWidth;
                float f8 = this.defaultGapWidth;
                float f9 = f7 + f8;
                float f10 = (int) (f4 / f9);
                float f11 = f4 - (f9 * f10);
                f5 = f7 + (((f11 * f7) / f9) / f10);
                f6 = f8 + (((f11 * f8) / f9) / f10);
            } else {
                f5 = this.defaultDashWidth;
                f6 = this.defaultGapWidth;
            }
            return new DashPathEffect(new float[]{f5, f6}, 0.0f);
        }

        private final float getStrokeOffset() {
            return Math.min(this.halfDp, Math.max(1.0f, DivBorderDrawer.this.strokeWidth * 0.1f));
        }

        @NotNull
        public final Paint getPaint() {
            return this.paint;
        }

        @NotNull
        public final Path getPath() {
            return this.path;
        }

        public final void invalidate(@NotNull float[] radii) {
            Intrinsics.checkNotNullParameter(radii, "radii");
            float strokeOffset = (DivBorderDrawer.this.strokeWidth - getStrokeOffset()) / 2.0f;
            this.rect.set(strokeOffset, strokeOffset, DivBorderDrawer.this.view.getWidth() - strokeOffset, DivBorderDrawer.this.view.getHeight() - strokeOffset);
            this.path.reset();
            this.path.addRoundRect(this.rect, radii, Path.Direction.CW);
            this.path.close();
            this.paint.setPathEffect(this.isDashed ? createDashPathEffect(calculatePerimeter(this.rect.width(), this.rect.height(), radii)) : null);
        }

        public final void setDashed(boolean z4) {
            this.isDashed = z4;
        }

        public final void setPaintParams(float f4, int i4) {
            this.paint.setStrokeWidth(f4 + getStrokeOffset());
            this.paint.setColor(i4);
        }
    }

    @Metadata
    private final class ClipParams {

        @NotNull
        private final Path path = new Path();

        @NotNull
        private final RectF rect = new RectF();

        public ClipParams() {
        }

        @NotNull
        public final Path getPath() {
            return this.path;
        }

        public final void invalidatePath(@Nullable float[] fArr) {
            this.rect.set(0.0f, 0.0f, DivBorderDrawer.this.view.getWidth(), DivBorderDrawer.this.view.getHeight());
            this.path.reset();
            if (fArr != null) {
                this.path.addRoundRect(this.rect, (float[]) fArr.clone(), Path.Direction.CW);
                this.path.close();
            }
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float clampCornerRadius(float f4, float f5, float f6) {
            if (f6 <= 0.0f || f5 <= 0.0f) {
                return 0.0f;
            }
            float min = Math.min(f6, f5) / 2;
            if (f4 > min) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.WARNING)) {
                    kLog.print(5, "DivBorderDrawer", "Corner radius " + f4 + " is greater than half of the smallest side " + min);
                }
            }
            return Math.min(f4, min);
        }

        private Companion() {
        }
    }

    @Metadata
    private static final class RoundedRectOutlineProvider extends ViewOutlineProvider {
        private float cornerRadius;

        public /* synthetic */ RoundedRectOutlineProvider(float f4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0.0f : f4);
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@NotNull View view, @NotNull Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), DivBorderDrawer.Companion.clampCornerRadius(this.cornerRadius, view.getWidth(), view.getHeight()));
        }

        public final void setCornerRadius(float f4) {
            this.cornerRadius = f4;
        }

        public RoundedRectOutlineProvider(float f4) {
            this.cornerRadius = f4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    final class ShadowParams {
        private float alpha;

        @Nullable
        private NinePatch cachedShadow;
        private int color;
        private final float defaultRadius;
        private float offsetX;
        private float offsetY;

        @NotNull
        private final Paint paint;
        private float radius;

        @NotNull
        private final Rect rect;

        public ShadowParams() {
            float dimension = DivBorderDrawer.this.view.getContext().getResources().getDimension(R$dimen.div_shadow_elevation);
            this.defaultRadius = dimension;
            this.radius = dimension;
            this.color = -16777216;
            this.alpha = 0.14f;
            this.paint = new Paint();
            this.rect = new Rect();
            this.offsetY = 0.5f;
        }

        @Nullable
        public final NinePatch getCachedShadow() {
            return this.cachedShadow;
        }

        public final float getOffsetX() {
            return this.offsetX;
        }

        public final float getOffsetY() {
            return this.offsetY;
        }

        @NotNull
        public final Paint getPaint() {
            return this.paint;
        }

        @NotNull
        public final Rect getRect() {
            return this.rect;
        }

        public final void invalidateShadow(@NotNull float[] radii) {
            Intrinsics.checkNotNullParameter(radii, "radii");
            float f4 = 2;
            this.rect.set(0, 0, (int) (DivBorderDrawer.this.view.getWidth() + (this.radius * f4)), (int) (DivBorderDrawer.this.view.getHeight() + (this.radius * f4)));
            this.paint.setColor(this.color);
            this.paint.setAlpha((int) (this.alpha * DivBorderDrawer.this.view.getAlpha() * KotlinVersion.MAX_COMPONENT_VALUE));
            ShadowCache shadowCache = ShadowCache.INSTANCE;
            Context context = DivBorderDrawer.this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            this.cachedShadow = shadowCache.getShadow(context, radii, this.radius);
        }

        public final void set(@Nullable Ib ib, @NotNull ExpressionResolver resolver) {
            C1081ua c1081ua;
            J4 j4;
            C1081ua c1081ua2;
            J4 j42;
            Expression expression;
            Expression expression2;
            Expression expression3;
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            this.radius = (ib == null || (expression3 = ib.f3162b) == null) ? this.defaultRadius : BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(((Number) expression3.evaluate(resolver)).longValue()), DivBorderDrawer.this.getDisplayMetrics());
            this.color = (ib == null || (expression2 = ib.f3163c) == null) ? -16777216 : ((Number) expression2.evaluate(resolver)).intValue();
            this.alpha = (ib == null || (expression = ib.f3161a) == null) ? 0.14f : (float) ((Number) expression.evaluate(resolver)).doubleValue();
            this.offsetX = ((ib == null || (c1081ua2 = ib.f3164d) == null || (j42 = c1081ua2.f8167a) == null) ? BaseDivViewExtensionsKt.dpToPx(Float.valueOf(0.0f), r0) : BaseDivViewExtensionsKt.toPx(j42, r0, resolver)) - this.radius;
            this.offsetY = ((ib == null || (c1081ua = ib.f3164d) == null || (j4 = c1081ua.f8168b) == null) ? BaseDivViewExtensionsKt.dpToPx(Float.valueOf(0.5f), r0) : BaseDivViewExtensionsKt.toPx(j4, r0, resolver)) - this.radius;
        }
    }

    public DivBorderDrawer(@NotNull Div2View divView, @NotNull View view) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(view, "view");
        this.divView = divView;
        this.view = view;
        this.clipParams = new ClipParams();
        this.borderParams$delegate = i.b(new DivBorderDrawer$borderParams$2(this));
        this.shadowParams$delegate = i.b(new DivBorderDrawer$shadowParams$2(this));
        this.outlineProvider = new RoundedRectOutlineProvider(0.0f, 1, null);
        this.needClipping = true;
        this.subscriptions = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        if ((r10.view.getParent() instanceof com.yandex.div.core.view2.divs.widgets.DivFrameLayout) == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyBorder(C0860i3 c0860i3, ExpressionResolver expressionResolver) {
        boolean z4;
        View view;
        View view2;
        Expression expression;
        boolean z5;
        Qc qc;
        Qc qc2;
        Expression expression2;
        Qc qc3;
        DisplayMetrics displayMetrics = getDisplayMetrics();
        float f4 = 0.0f;
        float widthPx = (c0860i3 == null || (qc3 = c0860i3.f6463e) == null) ? 0.0f : DivBorderDrawerKt.widthPx(qc3, expressionResolver, displayMetrics);
        this.strokeWidth = widthPx;
        boolean z6 = true;
        boolean z7 = widthPx > 0.0f;
        this.hasBorder = z7;
        if (z7) {
            getBorderParams().setPaintParams(this.strokeWidth, (c0860i3 == null || (qc2 = c0860i3.f6463e) == null || (expression2 = qc2.f4476a) == null) ? 0 : ((Number) expression2.evaluate(expressionResolver)).intValue());
            getBorderParams().setDashed(((c0860i3 == null || (qc = c0860i3.f6463e) == null) ? null : qc.f4477b) instanceof Tc.c);
        }
        float[] cornerRadii = c0860i3 != null ? DivUtilKt.getCornerRadii(c0860i3, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(this.view.getWidth()), displayMetrics), BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(this.view.getHeight()), displayMetrics), displayMetrics, expressionResolver) : null;
        this.cornerRadii = cornerRadii;
        if (cornerRadii != null) {
            float E4 = AbstractC3219i.E(cornerRadii);
            int length = cornerRadii.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z5 = true;
                    break;
                } else {
                    if (!Float.valueOf(cornerRadii[i4]).equals(Float.valueOf(E4))) {
                        z5 = false;
                        break;
                    }
                    i4++;
                }
            }
            z4 = !z5;
        } else {
            z4 = false;
        }
        this.hasDifferentCornerRadii = z4;
        boolean z8 = this.hasCustomShadow;
        boolean booleanValue = (c0860i3 == null || (expression = c0860i3.f6461c) == null) ? false : ((Boolean) expression.evaluate(expressionResolver)).booleanValue();
        this.hasShadow = booleanValue;
        if (booleanValue) {
            if ((c0860i3 != null ? c0860i3.f6462d : null) == null) {
            }
            this.hasCustomShadow = z6;
            view = this.view;
            if (this.hasShadow && !z6) {
                f4 = view.getContext().getResources().getDimension(R$dimen.div_shadow_elevation);
            }
            view.setElevation(f4);
            if (this.hasCustomShadow) {
                getShadowParams().set(c0860i3 != null ? c0860i3.f6462d : null, expressionResolver);
            }
            invalidateBorder();
            if (!this.hasCustomShadow || z8) {
                Object parent = this.view.getParent();
                view2 = parent instanceof View ? (View) parent : null;
                if (view2 == null) {
                    view2.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        z6 = false;
        this.hasCustomShadow = z6;
        view = this.view;
        if (this.hasShadow) {
            f4 = view.getContext().getResources().getDimension(R$dimen.div_shadow_elevation);
        }
        view.setElevation(f4);
        if (this.hasCustomShadow) {
        }
        invalidateBorder();
        if (this.hasCustomShadow) {
        }
        Object parent2 = this.view.getParent();
        if (parent2 instanceof View) {
        }
        if (view2 == null) {
        }
    }

    private final void bindBorder(C0860i3 c0860i3, ExpressionResolver expressionResolver) {
        applyBorder(c0860i3, expressionResolver);
        observeBorder(c0860i3, expressionResolver);
    }

    private final BorderParams getBorderParams() {
        return (BorderParams) this.borderParams$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "view.resources.displayMetrics");
        return displayMetrics;
    }

    private final ShadowParams getShadowParams() {
        return (ShadowParams) this.shadowParams$delegate.getValue();
    }

    private final void invalidateOutline() {
        if (shouldUseCanvasClipping()) {
            this.view.setClipToOutline(false);
            this.view.setOutlineProvider(shouldUseNinePatchShadows() ? null : ViewOutlineProvider.BACKGROUND);
            return;
        }
        float[] fArr = this.cornerRadii;
        float E4 = fArr != null ? AbstractC3219i.E(fArr) : 0.0f;
        if (E4 == 0.0f) {
            this.view.setClipToOutline(false);
            this.view.setOutlineProvider(shouldUseNinePatchShadows() ? null : ViewOutlineProvider.BACKGROUND);
        } else {
            this.outlineProvider.setCornerRadius(E4);
            this.view.setOutlineProvider(this.outlineProvider);
            this.view.setClipToOutline(this.needClipping);
        }
    }

    private final void invalidatePaths() {
        float[] fArr;
        float[] fArr2 = this.cornerRadii;
        if (fArr2 == null || (fArr = (float[]) fArr2.clone()) == null) {
            return;
        }
        this.clipParams.invalidatePath(fArr);
        float f4 = this.strokeWidth / 2.0f;
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            fArr[i4] = Math.max(0.0f, fArr[i4] - f4);
        }
        if (this.hasBorder) {
            getBorderParams().invalidate(fArr);
        }
        if (this.hasCustomShadow) {
            getShadowParams().invalidateShadow(fArr);
        }
    }

    private final void observeBorder(C0860i3 c0860i3, ExpressionResolver expressionResolver) {
        C1081ua c1081ua;
        J4 j4;
        Expression expression;
        C1081ua c1081ua2;
        J4 j42;
        Expression expression2;
        C1081ua c1081ua3;
        J4 j43;
        Expression expression3;
        C1081ua c1081ua4;
        J4 j44;
        Expression expression4;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        Expression expression8;
        Expression expression9;
        Expression expression10;
        Expression expression11;
        Expression expression12;
        Expression expression13;
        Expression expression14;
        if (c0860i3 == null || DivDataExtensionsKt.isConstant(c0860i3)) {
            return;
        }
        DivBorderDrawer$observeBorder$callback$1 divBorderDrawer$observeBorder$callback$1 = new DivBorderDrawer$observeBorder$callback$1(this, c0860i3, expressionResolver);
        Expression expression15 = c0860i3.f6459a;
        Disposable disposable = null;
        addSubscription(expression15 != null ? expression15.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1) : null);
        C0735b4 c0735b4 = c0860i3.f6460b;
        addSubscription((c0735b4 == null || (expression14 = c0735b4.f5779c) == null) ? null : expression14.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        C0735b4 c0735b42 = c0860i3.f6460b;
        addSubscription((c0735b42 == null || (expression13 = c0735b42.f5780d) == null) ? null : expression13.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        C0735b4 c0735b43 = c0860i3.f6460b;
        addSubscription((c0735b43 == null || (expression12 = c0735b43.f5778b) == null) ? null : expression12.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        C0735b4 c0735b44 = c0860i3.f6460b;
        addSubscription((c0735b44 == null || (expression11 = c0735b44.f5777a) == null) ? null : expression11.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        addSubscription(c0860i3.f6461c.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        Qc qc = c0860i3.f6463e;
        addSubscription((qc == null || (expression10 = qc.f4476a) == null) ? null : expression10.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        Qc qc2 = c0860i3.f6463e;
        addSubscription((qc2 == null || (expression9 = qc2.f4479d) == null) ? null : expression9.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        Qc qc3 = c0860i3.f6463e;
        addSubscription((qc3 == null || (expression8 = qc3.f4478c) == null) ? null : expression8.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        Ib ib = c0860i3.f6462d;
        addSubscription((ib == null || (expression7 = ib.f3161a) == null) ? null : expression7.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        Ib ib2 = c0860i3.f6462d;
        addSubscription((ib2 == null || (expression6 = ib2.f3162b) == null) ? null : expression6.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        Ib ib3 = c0860i3.f6462d;
        addSubscription((ib3 == null || (expression5 = ib3.f3163c) == null) ? null : expression5.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        Ib ib4 = c0860i3.f6462d;
        addSubscription((ib4 == null || (c1081ua4 = ib4.f3164d) == null || (j44 = c1081ua4.f8167a) == null || (expression4 = j44.f3317a) == null) ? null : expression4.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        Ib ib5 = c0860i3.f6462d;
        addSubscription((ib5 == null || (c1081ua3 = ib5.f3164d) == null || (j43 = c1081ua3.f8167a) == null || (expression3 = j43.f3318b) == null) ? null : expression3.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        Ib ib6 = c0860i3.f6462d;
        addSubscription((ib6 == null || (c1081ua2 = ib6.f3164d) == null || (j42 = c1081ua2.f8168b) == null || (expression2 = j42.f3317a) == null) ? null : expression2.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1));
        Ib ib7 = c0860i3.f6462d;
        if (ib7 != null && (c1081ua = ib7.f3164d) != null && (j4 = c1081ua.f8168b) != null && (expression = j4.f3318b) != null) {
            disposable = expression.observe(expressionResolver, divBorderDrawer$observeBorder$callback$1);
        }
        addSubscription(disposable);
    }

    private final boolean shouldUseCanvasClipping() {
        if (!this.needClipping) {
            return false;
        }
        if (this.divView.getForceCanvasClipping() || this.hasCustomShadow) {
            return true;
        }
        return (!this.hasShadow && (this.hasDifferentCornerRadii || this.hasBorder)) || TransientViewKt.isInTransientHierarchy(this.view);
    }

    private final boolean shouldUseNinePatchShadows() {
        return this.hasCustomShadow || TransientViewKt.isInTransientHierarchy(this.view);
    }

    public final void clipCorners(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (shouldUseCanvasClipping()) {
            canvas.clipPath(this.clipParams.getPath());
        }
    }

    public final void drawBorder(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.hasBorder) {
            canvas.drawPath(getBorderParams().getPath(), getBorderParams().getPaint());
        }
    }

    public final void drawShadow(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (TransientViewKt.isInTransientHierarchy(this.view)) {
            ViewParent parent = this.view.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "view.parent");
            if (!TransientViewKt.isInTransientHierarchy(parent)) {
                return;
            }
        }
        if (this.hasCustomShadow) {
            float offsetX = getShadowParams().getOffsetX();
            float offsetY = getShadowParams().getOffsetY();
            int save = canvas.save();
            canvas.translate(offsetX, offsetY);
            try {
                NinePatch cachedShadow = getShadowParams().getCachedShadow();
                if (cachedShadow != null) {
                    cachedShadow.draw(canvas, getShadowParams().getRect(), getShadowParams().getPaint());
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final void invalidateBorder() {
        invalidatePaths();
        invalidateOutline();
    }

    public final void onBoundsChanged(int i4, int i5) {
        invalidateBorder();
    }

    public final void setBorder(@Nullable C0860i3 c0860i3, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (DivDataExtensionsKt.equalsToConstant(c0860i3, this.border)) {
            return;
        }
        release();
        this.border = c0860i3;
        bindBorder(c0860i3, resolver);
    }

    public final void setNeedClipping(boolean z4) {
        if (this.needClipping == z4) {
            return;
        }
        this.needClipping = z4;
        invalidateOutline();
        this.view.invalidate();
    }
}
