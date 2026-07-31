package com.yandex.div.internal.widget.slider;

import B.w;
import W1.m;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.SeekBar;
import androidx.core.view.AbstractC1281a0;
import com.yandex.div.R$string;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j2.AbstractC3185a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class SliderView extends View {

    @NotNull
    private final A11yHelper a11yHelper;

    @NotNull
    private final ActiveRange activeRange;

    @Nullable
    private Drawable activeTickMarkDrawable;

    @Nullable
    private Drawable activeTrackDrawable;
    private long animationDuration;
    private boolean animationEnabled;

    @NotNull
    private AccelerateDecelerateInterpolator animationInterpolator;

    @NotNull
    private final SliderView$animatorListener$1 animatorListener;

    @NotNull
    private final SliderView$animatorSecondaryListener$1 animatorSecondaryListener;

    @Nullable
    private Drawable inactiveTickMarkDrawable;

    @Nullable
    private Drawable inactiveTrackDrawable;
    private boolean interactive;
    private float interceptionAngle;
    private float interceptionAngleTg;

    @NotNull
    private final ObserverList<ChangedListener> listeners;
    private int maxTickmarkOrThumbWidth;
    private float maxValue;
    private float minValue;
    private float prevX;
    private float prevY;

    @NotNull
    private final List<Range> ranges;

    @Nullable
    private ValueAnimator sliderAnimator;

    @NotNull
    private final SliderDrawDelegate sliderDrawDelegate;

    @Nullable
    private ValueAnimator sliderSecondaryAnimator;

    @Nullable
    private Drawable thumbDrawable;

    @NotNull
    private Thumb thumbOnTouch;

    @Nullable
    private TextDrawable thumbSecondTextDrawable;

    @Nullable
    private Drawable thumbSecondaryDrawable;

    @Nullable
    private Float thumbSecondaryValue;

    @Nullable
    private TextDrawable thumbTextDrawable;
    private float thumbValue;

    @Nullable
    private Integer touchSlop;

    @Metadata
    private final class A11yHelper extends N.a {

        @NotNull
        private final Rect bounds;

        @NotNull
        private final SliderView slider;
        final /* synthetic */ SliderView this$0;

        @Metadata
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Thumb.values().length];
                try {
                    iArr[Thumb.THUMB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Thumb.THUMB_SECONDARY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A11yHelper(@NotNull SliderView sliderView, SliderView slider) {
            super(slider);
            Intrinsics.checkNotNullParameter(slider, "slider");
            this.this$0 = sliderView;
            this.slider = slider;
            this.bounds = new Rect();
        }

        private final int getStep() {
            return Math.max(AbstractC3185a.b((this.this$0.getMaxValue() - this.this$0.getMinValue()) * 0.05d), 1);
        }

        private final void setThumbValue(int i4, float f4) {
            this.this$0.setValueToThumb(toThumb(i4), this.this$0.inBoarders(f4), false, true);
            sendEventForVirtualView(i4, 4);
            invalidateVirtualView(i4);
        }

        private final String startOrEndDescription(int i4) {
            if (this.this$0.getThumbSecondaryValue() == null) {
                return "";
            }
            if (i4 == 0) {
                String string = this.this$0.getContext().getString(R$string.div_slider_range_start);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.div_slider_range_start)");
                return string;
            }
            if (i4 != 1) {
                return "";
            }
            String string2 = this.this$0.getContext().getString(R$string.div_slider_range_end);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.div_slider_range_end)");
            return string2;
        }

        private final Thumb toThumb(int i4) {
            return i4 == 0 ? Thumb.THUMB : this.this$0.getThumbSecondaryValue() != null ? Thumb.THUMB_SECONDARY : Thumb.THUMB;
        }

        private final float toThumbValue(int i4) {
            if (i4 == 0) {
                return this.this$0.getThumbValue();
            }
            Float thumbSecondaryValue = this.this$0.getThumbSecondaryValue();
            return thumbSecondaryValue != null ? thumbSecondaryValue.floatValue() : this.this$0.getThumbValue();
        }

        private final void updateBounds(int i4) {
            int boundsWidth;
            int boundsHeight;
            if (i4 == 1) {
                SliderView sliderView = this.this$0;
                boundsWidth = sliderView.getBoundsWidth(sliderView.getThumbSecondaryDrawable());
                SliderView sliderView2 = this.this$0;
                boundsHeight = sliderView2.getBoundsHeight(sliderView2.getThumbSecondaryDrawable());
            } else {
                SliderView sliderView3 = this.this$0;
                boundsWidth = sliderView3.getBoundsWidth(sliderView3.getThumbDrawable());
                SliderView sliderView4 = this.this$0;
                boundsHeight = sliderView4.getBoundsHeight(sliderView4.getThumbDrawable());
            }
            int position$default = SliderView.toPosition$default(this.this$0, toThumbValue(i4), 0, 1, null) + this.slider.getPaddingLeft();
            Rect rect = this.bounds;
            rect.left = position$default;
            rect.right = position$default + boundsWidth;
            int i5 = boundsHeight / 2;
            rect.top = (this.slider.getHeight() / 2) - i5;
            this.bounds.bottom = (this.slider.getHeight() / 2) + i5;
        }

        @Override // N.a
        protected int getVirtualViewAt(float f4, float f5) {
            if (f4 < this.this$0.getLeftPaddingOffset()) {
                return 0;
            }
            int i4 = WhenMappings.$EnumSwitchMapping$0[this.this$0.getClosestThumb((int) f4).ordinal()];
            if (i4 == 1) {
                return 0;
            }
            if (i4 == 2) {
                return 1;
            }
            throw new m();
        }

        @Override // N.a
        protected void getVisibleVirtualViews(@NotNull List<Integer> virtualViewIds) {
            Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
            virtualViewIds.add(0);
            if (this.this$0.getThumbSecondaryValue() != null) {
                virtualViewIds.add(1);
            }
        }

        @Override // N.a
        protected boolean onPerformActionForVirtualView(int i4, int i5, @Nullable Bundle bundle) {
            if (i5 == 4096) {
                setThumbValue(i4, toThumbValue(i4) + getStep());
                return true;
            }
            if (i5 == 8192) {
                setThumbValue(i4, toThumbValue(i4) - getStep());
                return true;
            }
            if (i5 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            setThumbValue(i4, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
            return true;
        }

        @Override // N.a
        protected void onPopulateNodeForVirtualView(int i4, @NotNull w node) {
            Intrinsics.checkNotNullParameter(node, "node");
            node.k0(SeekBar.class.getName());
            node.C0(w.g.a(0, this.this$0.getMinValue(), this.this$0.getMaxValue(), toThumbValue(i4)));
            StringBuilder sb = new StringBuilder();
            CharSequence contentDescription = this.slider.getContentDescription();
            if (contentDescription != null) {
                sb.append(contentDescription);
                sb.append(StringUtils.COMMA);
            }
            sb.append(startOrEndDescription(i4));
            node.o0(sb.toString());
            node.b(w.a.f152q);
            node.b(w.a.f153r);
            updateBounds(i4);
            node.g0(this.bounds);
        }
    }

    @Metadata
    private final class ActiveRange {
        public ActiveRange() {
        }

        private final float max(float f4, Float f5) {
            return f5 != null ? Math.max(f4, f5.floatValue()) : f4;
        }

        private final float min(float f4, Float f5) {
            return f5 != null ? Math.min(f4, f5.floatValue()) : f4;
        }

        public final float getEnd() {
            return !SliderView.this.isThumbSecondaryEnabled() ? SliderView.this.getThumbValue() : max(SliderView.this.getThumbValue(), SliderView.this.getThumbSecondaryValue());
        }

        public final float getStart() {
            return !SliderView.this.isThumbSecondaryEnabled() ? SliderView.this.getMinValue() : min(SliderView.this.getThumbValue(), SliderView.this.getThumbSecondaryValue());
        }
    }

    @Metadata
    public interface ChangedListener {
        default void onThumbSecondaryValueChanged(@Nullable Float f4) {
        }

        default void onThumbValueChanged(float f4) {
        }
    }

    @Metadata
    public static final class Range {

        @Nullable
        private Drawable activeTrackDrawable;
        private int endPosition;
        private float endValue;

        @Nullable
        private Drawable inactiveTrackDrawable;
        private int marginEnd;
        private int marginStart;
        private int startPosition;
        private float startValue;

        @Nullable
        public final Drawable getActiveTrackDrawable() {
            return this.activeTrackDrawable;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final float getEndValue() {
            return this.endValue;
        }

        @Nullable
        public final Drawable getInactiveTrackDrawable() {
            return this.inactiveTrackDrawable;
        }

        public final int getMarginEnd() {
            return this.marginEnd;
        }

        public final int getMarginStart() {
            return this.marginStart;
        }

        public final int getStartPosition() {
            return this.startPosition;
        }

        public final float getStartValue() {
            return this.startValue;
        }

        public final void setActiveTrackDrawable(@Nullable Drawable drawable) {
            this.activeTrackDrawable = drawable;
        }

        public final void setEndPosition(int i4) {
            this.endPosition = i4;
        }

        public final void setEndValue(float f4) {
            this.endValue = f4;
        }

        public final void setInactiveTrackDrawable(@Nullable Drawable drawable) {
            this.inactiveTrackDrawable = drawable;
        }

        public final void setMarginEnd(int i4) {
            this.marginEnd = i4;
        }

        public final void setMarginStart(int i4) {
            this.marginStart = i4;
        }

        public final void setStartPosition(int i4) {
            this.startPosition = i4;
        }

        public final void setStartValue(float f4) {
            this.startValue = f4;
        }
    }

    @Metadata
    private enum Thumb {
        THUMB,
        THUMB_SECONDARY
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Thumb.values().length];
            try {
                iArr[Thumb.THUMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Thumb.THUMB_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.sliderDrawDelegate = new SliderDrawDelegate();
        this.listeners = new ObserverList<>();
        this.animatorListener = new SliderView$animatorListener$1(this);
        this.animatorSecondaryListener = new SliderView$animatorSecondaryListener$1(this);
        this.ranges = new ArrayList();
        this.animationDuration = 300L;
        this.animationInterpolator = new AccelerateDecelerateInterpolator();
        this.animationEnabled = true;
        this.maxValue = 100.0f;
        this.thumbValue = this.minValue;
        A11yHelper a11yHelper = new A11yHelper(this, this);
        this.a11yHelper = a11yHelper;
        AbstractC1281a0.o0(this, a11yHelper);
        setAccessibilityLiveRegion(1);
        this.maxTickmarkOrThumbWidth = -1;
        this.activeRange = new ActiveRange();
        this.thumbOnTouch = Thumb.THUMB;
        this.interactive = true;
        this.interceptionAngle = 45.0f;
        this.interceptionAngleTg = (float) Math.tan(45.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBoundsHeight(Drawable drawable) {
        Rect bounds;
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.height();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBoundsWidth(Drawable drawable) {
        Rect bounds;
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.width();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Thumb getClosestThumb(int i4) {
        if (!isThumbSecondaryEnabled()) {
            return Thumb.THUMB;
        }
        int abs = Math.abs(i4 - toPosition$default(this, this.thumbValue, 0, 1, null));
        Float f4 = this.thumbSecondaryValue;
        Intrinsics.checkNotNull(f4);
        return abs < Math.abs(i4 - toPosition$default(this, f4.floatValue(), 0, 1, null)) ? Thumb.THUMB : Thumb.THUMB_SECONDARY;
    }

    private final int getMaxTickmarkOrThumbWidth() {
        if (this.maxTickmarkOrThumbWidth == -1) {
            this.maxTickmarkOrThumbWidth = Math.max(Math.max(getBoundsWidth(this.activeTickMarkDrawable), getBoundsWidth(this.inactiveTickMarkDrawable)), Math.max(getBoundsWidth(this.thumbDrawable), getBoundsWidth(this.thumbSecondaryDrawable)));
        }
        return this.maxTickmarkOrThumbWidth;
    }

    private final float getTouchValue(int i4) {
        return (this.inactiveTickMarkDrawable == null && this.activeTickMarkDrawable == null) ? toValue(i4) : AbstractC3185a.c(toValue(i4));
    }

    private final int getTrackLength(int i4) {
        return ((i4 - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
    }

    static /* synthetic */ int getTrackLength$default(SliderView sliderView, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrackLength");
        }
        if ((i5 & 1) != 0) {
            i4 = sliderView.getWidth();
        }
        return sliderView.getTrackLength(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float inBoarders(float f4) {
        return Math.min(Math.max(f4, this.minValue), this.maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isThumbSecondaryEnabled() {
        return this.thumbSecondaryValue != null;
    }

    private final int measureDimension(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i4 : size : Math.min(i4, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbChangedListeners(Float f4, float f5) {
        if (Intrinsics.areEqual(f4, f5)) {
            return;
        }
        Iterator<ChangedListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onThumbValueChanged(f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbSecondaryChangedListeners(Float f4, Float f5) {
        if (Intrinsics.areEqual(f4, f5)) {
            return;
        }
        Iterator<ChangedListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onThumbSecondaryValueChanged(f5);
        }
    }

    private static final void onDraw$lambda$10$drawTrackPart(Range range, SliderView sliderView, Canvas canvas, Drawable drawable, int i4, int i5) {
        sliderView.sliderDrawDelegate.drawTrackPart(canvas, drawable, i4, i5);
    }

    static /* synthetic */ void onDraw$lambda$10$drawTrackPart$default(Range range, SliderView sliderView, Canvas canvas, Drawable drawable, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDraw$lambda$10$drawTrackPart");
        }
        if ((i6 & 16) != 0) {
            i4 = range.getStartPosition();
        }
        int i7 = i4;
        if ((i6 & 32) != 0) {
            i5 = range.getEndPosition();
        }
        onDraw$lambda$10$drawTrackPart(range, sliderView, canvas, drawable, i7, i5);
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.animationDuration);
        valueAnimator.setInterpolator(this.animationInterpolator);
    }

    private final void setThumbsInBoarders() {
        trySetThumbValue(inBoarders(this.thumbValue), false, true);
        if (isThumbSecondaryEnabled()) {
            Float f4 = this.thumbSecondaryValue;
            trySetThumbSecondaryValue(f4 != null ? Float.valueOf(inBoarders(f4.floatValue())) : null, false, true);
        }
    }

    private final void setThumbsOnTickMarks() {
        trySetThumbValue(AbstractC3185a.c(this.thumbValue), false, true);
        if (this.thumbSecondaryValue != null) {
            trySetThumbSecondaryValue(Float.valueOf(AbstractC3185a.c(r0.floatValue())), false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValueToThumb(Thumb thumb, float f4, boolean z4, boolean z5) {
        int i4 = WhenMappings.$EnumSwitchMapping$0[thumb.ordinal()];
        if (i4 == 1) {
            trySetThumbValue(f4, z4, z5);
        } else {
            if (i4 != 2) {
                throw new m();
            }
            trySetThumbSecondaryValue(Float.valueOf(f4), z4, z5);
        }
    }

    static /* synthetic */ void setValueToThumb$default(SliderView sliderView, Thumb thumb, float f4, boolean z4, boolean z5, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setValueToThumb");
        }
        if ((i4 & 8) != 0) {
            z5 = false;
        }
        sliderView.setValueToThumb(thumb, f4, z4, z5);
    }

    private final int toPosition(float f4, int i4) {
        return AbstractC3185a.c((getTrackLength(i4) / (this.maxValue - this.minValue)) * (ViewsKt.isLayoutRtl(this) ? this.maxValue - f4 : f4 - this.minValue));
    }

    static /* synthetic */ int toPosition$default(SliderView sliderView, float f4, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPosition");
        }
        if ((i5 & 1) != 0) {
            i4 = sliderView.getWidth();
        }
        return sliderView.toPosition(f4, i4);
    }

    private final float toValue(int i4) {
        float f4 = this.minValue;
        float trackLength$default = (i4 * (this.maxValue - f4)) / getTrackLength$default(this, 0, 1, null);
        if (ViewsKt.isLayoutRtl(this)) {
            trackLength$default = (this.maxValue - trackLength$default) - 1;
        }
        return f4 + trackLength$default;
    }

    private final void trySetThumbSecondaryValue(Float f4, boolean z4, boolean z5) {
        ValueAnimator valueAnimator;
        Float f5;
        Float valueOf = f4 != null ? Float.valueOf(inBoarders(f4.floatValue())) : null;
        if (Intrinsics.areEqual(this.thumbSecondaryValue, valueOf)) {
            return;
        }
        if (!z4 || !this.animationEnabled || (f5 = this.thumbSecondaryValue) == null || valueOf == null) {
            if (z5 && (valueAnimator = this.sliderSecondaryAnimator) != null) {
                valueAnimator.cancel();
            }
            if (z5 || this.sliderSecondaryAnimator == null) {
                this.animatorSecondaryListener.setPrevThumbSecondaryValue(this.thumbSecondaryValue);
                this.thumbSecondaryValue = valueOf;
                notifyThumbSecondaryChangedListeners(this.animatorSecondaryListener.getPrevThumbSecondaryValue(), this.thumbSecondaryValue);
            }
        } else {
            if (this.sliderSecondaryAnimator == null) {
                this.animatorSecondaryListener.setPrevThumbSecondaryValue(f5);
            }
            ValueAnimator valueAnimator2 = this.sliderSecondaryAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            Float f6 = this.thumbSecondaryValue;
            Intrinsics.checkNotNull(f6);
            ValueAnimator trySetThumbSecondaryValue$lambda$5 = ValueAnimator.ofFloat(f6.floatValue(), valueOf.floatValue());
            trySetThumbSecondaryValue$lambda$5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.slider.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SliderView.trySetThumbSecondaryValue$lambda$5$lambda$4(SliderView.this, valueAnimator3);
                }
            });
            trySetThumbSecondaryValue$lambda$5.addListener(this.animatorSecondaryListener);
            Intrinsics.checkNotNullExpressionValue(trySetThumbSecondaryValue$lambda$5, "trySetThumbSecondaryValue$lambda$5");
            setBaseParams(trySetThumbSecondaryValue$lambda$5);
            trySetThumbSecondaryValue$lambda$5.start();
            this.sliderSecondaryAnimator = trySetThumbSecondaryValue$lambda$5;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbSecondaryValue$lambda$5$lambda$4(SliderView this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.thumbSecondaryValue = (Float) animatedValue;
        this$0.postInvalidateOnAnimation();
    }

    private final void trySetThumbValue(float f4, boolean z4, boolean z5) {
        ValueAnimator valueAnimator;
        float inBoarders = inBoarders(f4);
        float f5 = this.thumbValue;
        if (f5 == inBoarders) {
            return;
        }
        if (z4 && this.animationEnabled) {
            if (this.sliderAnimator == null) {
                this.animatorListener.setPrevThumbValue(f5);
            }
            ValueAnimator valueAnimator2 = this.sliderAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator trySetThumbValue$lambda$3 = ValueAnimator.ofFloat(this.thumbValue, inBoarders);
            trySetThumbValue$lambda$3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.slider.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SliderView.trySetThumbValue$lambda$3$lambda$2(SliderView.this, valueAnimator3);
                }
            });
            trySetThumbValue$lambda$3.addListener(this.animatorListener);
            Intrinsics.checkNotNullExpressionValue(trySetThumbValue$lambda$3, "trySetThumbValue$lambda$3");
            setBaseParams(trySetThumbValue$lambda$3);
            trySetThumbValue$lambda$3.start();
            this.sliderAnimator = trySetThumbValue$lambda$3;
        } else {
            if (z5 && (valueAnimator = this.sliderAnimator) != null) {
                valueAnimator.cancel();
            }
            if (z5 || this.sliderAnimator == null) {
                this.animatorListener.setPrevThumbValue(this.thumbValue);
                this.thumbValue = inBoarders;
                notifyThumbChangedListeners(Float.valueOf(this.animatorListener.getPrevThumbValue()), this.thumbValue);
            }
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbValue$lambda$3$lambda$2(SliderView this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.thumbValue = ((Float) animatedValue).floatValue();
        this$0.postInvalidateOnAnimation();
    }

    public final void addOnThumbChangedListener(@NotNull ChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.addObserver(listener);
    }

    public final void clearOnThumbChangedListener() {
        this.listeners.clear();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.a11yHelper.dispatchHoverEvent(event) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.a11yHelper.dispatchKeyEvent(event) || super.dispatchKeyEvent(event);
    }

    @Nullable
    public final Drawable getActiveTickMarkDrawable() {
        return this.activeTickMarkDrawable;
    }

    @Nullable
    public final Drawable getActiveTrackDrawable() {
        return this.activeTrackDrawable;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getAnimationEnabled() {
        return this.animationEnabled;
    }

    @NotNull
    public final AccelerateDecelerateInterpolator getAnimationInterpolator() {
        return this.animationInterpolator;
    }

    @Nullable
    public final Drawable getInactiveTickMarkDrawable() {
        return this.inactiveTickMarkDrawable;
    }

    @Nullable
    public final Drawable getInactiveTrackDrawable() {
        return this.inactiveTrackDrawable;
    }

    public final boolean getInteractive() {
        return this.interactive;
    }

    public final float getInterceptionAngle() {
        return this.interceptionAngle;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final List<Range> getRanges() {
        return this.ranges;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        Integer num;
        int max = Math.max(getBoundsHeight(this.activeTrackDrawable), getBoundsHeight(this.inactiveTrackDrawable));
        Iterator<T> it = this.ranges.iterator();
        if (it.hasNext()) {
            Range range = (Range) it.next();
            Integer valueOf = Integer.valueOf(Math.max(getBoundsHeight(range.getActiveTrackDrawable()), getBoundsHeight(range.getInactiveTrackDrawable())));
            while (it.hasNext()) {
                Range range2 = (Range) it.next();
                Integer valueOf2 = Integer.valueOf(Math.max(getBoundsHeight(range2.getActiveTrackDrawable()), getBoundsHeight(range2.getInactiveTrackDrawable())));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        return Math.max(Math.max(getBoundsHeight(this.thumbDrawable), getBoundsHeight(this.thumbSecondaryDrawable)), Math.max(max, num != null ? num.intValue() : 0));
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        int max = Math.max(Math.max(getBoundsWidth(this.thumbDrawable), getBoundsWidth(this.thumbSecondaryDrawable)), Math.max(getBoundsWidth(this.activeTrackDrawable), getBoundsWidth(this.inactiveTrackDrawable)) * ((int) ((this.maxValue - this.minValue) + 1)));
        TextDrawable textDrawable = this.thumbTextDrawable;
        int intrinsicWidth = textDrawable != null ? textDrawable.getIntrinsicWidth() : 0;
        TextDrawable textDrawable2 = this.thumbSecondTextDrawable;
        return Math.max(max, Math.max(intrinsicWidth, textDrawable2 != null ? textDrawable2.getIntrinsicWidth() : 0));
    }

    @Nullable
    public final Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    @Nullable
    public final TextDrawable getThumbSecondTextDrawable() {
        return this.thumbSecondTextDrawable;
    }

    @Nullable
    public final Drawable getThumbSecondaryDrawable() {
        return this.thumbSecondaryDrawable;
    }

    @Nullable
    public final Float getThumbSecondaryValue() {
        return this.thumbSecondaryValue;
    }

    @Nullable
    public final TextDrawable getThumbTextDrawable() {
        return this.thumbTextDrawable;
    }

    public final float getThumbValue() {
        return this.thumbValue;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        SliderView sliderView;
        SliderView sliderView2 = this;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(sliderView2.getPaddingLeft() + (sliderView2.getMaxTickmarkOrThumbWidth() / 2), sliderView2.getPaddingTop());
        int save = canvas2.save();
        for (Range range : sliderView2.ranges) {
            canvas2.clipRect(range.getStartPosition() - range.getMarginStart(), 0.0f, range.getEndPosition() + range.getMarginEnd(), sliderView2.getHeight(), Region.Op.DIFFERENCE);
        }
        sliderView2.sliderDrawDelegate.drawInactiveTrack(canvas2, sliderView2.inactiveTrackDrawable);
        float start = sliderView2.activeRange.getStart();
        float end = sliderView2.activeRange.getEnd();
        int position$default = toPosition$default(sliderView2, start, 0, 1, null);
        int position$default2 = toPosition$default(sliderView2, end, 0, 1, null);
        sliderView2.sliderDrawDelegate.drawTrackPart(canvas2, sliderView2.activeTrackDrawable, g.g(position$default, position$default2), g.d(position$default2, position$default));
        canvas2.restoreToCount(save);
        for (Range range2 : sliderView2.ranges) {
            if (range2.getEndPosition() < position$default || range2.getStartPosition() > position$default2) {
                canvas2 = canvas;
                onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getInactiveTrackDrawable(), 0, 0, 48, null);
                sliderView = this;
            } else if (range2.getStartPosition() < position$default || range2.getEndPosition() > position$default2) {
                if (range2.getStartPosition() < position$default && range2.getEndPosition() <= position$default2) {
                    canvas2 = canvas;
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getInactiveTrackDrawable(), 0, g.d(position$default - 1, range2.getStartPosition()), 16, null);
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getActiveTrackDrawable(), position$default, 0, 32, null);
                } else if (range2.getStartPosition() < position$default || range2.getEndPosition() <= position$default2) {
                    canvas2 = canvas;
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getInactiveTrackDrawable(), 0, 0, 48, null);
                    onDraw$lambda$10$drawTrackPart(range2, this, canvas2, range2.getActiveTrackDrawable(), position$default, position$default2);
                } else {
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getActiveTrackDrawable(), 0, position$default2, 16, null);
                    canvas2 = canvas;
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getInactiveTrackDrawable(), g.g(position$default2 + 1, range2.getEndPosition()), 0, 32, null);
                }
                sliderView = this;
            } else {
                onDraw$lambda$10$drawTrackPart$default(range2, sliderView2, canvas2, range2.getActiveTrackDrawable(), 0, 0, 48, null);
                sliderView = this;
                canvas2 = canvas;
            }
            sliderView2 = sliderView;
        }
        SliderView sliderView3 = sliderView2;
        int i4 = (int) sliderView3.minValue;
        int i5 = (int) sliderView3.maxValue;
        if (i4 <= i5) {
            while (true) {
                sliderView3.sliderDrawDelegate.drawOnPosition(canvas2, (i4 > ((int) end) || ((int) start) > i4) ? sliderView3.inactiveTickMarkDrawable : sliderView3.activeTickMarkDrawable, sliderView3.toPosition(i4));
                if (i4 == i5) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        sliderView3.sliderDrawDelegate.drawThumb(canvas2, toPosition$default(sliderView3, sliderView3.thumbValue, 0, 1, null), sliderView3.thumbDrawable, (int) sliderView3.thumbValue, sliderView3.thumbTextDrawable);
        if (sliderView3.isThumbSecondaryEnabled()) {
            SliderDrawDelegate sliderDrawDelegate = sliderView3.sliderDrawDelegate;
            Float f4 = sliderView3.thumbSecondaryValue;
            Intrinsics.checkNotNull(f4);
            int position$default3 = toPosition$default(sliderView3, f4.floatValue(), 0, 1, null);
            Drawable drawable = sliderView3.thumbSecondaryDrawable;
            Float f5 = sliderView3.thumbSecondaryValue;
            Intrinsics.checkNotNull(f5);
            sliderDrawDelegate.drawThumb(canvas, position$default3, drawable, (int) f5.floatValue(), sliderView3.thumbSecondTextDrawable);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z4, int i4, @Nullable Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        this.a11yHelper.onFocusChanged(z4, i4, rect);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int measureDimension = measureDimension(suggestedMinimumWidth, i4);
        int measureDimension2 = measureDimension(suggestedMinimumHeight, i5);
        setMeasuredDimension(measureDimension, measureDimension2);
        this.sliderDrawDelegate.onMeasure(getTrackLength(measureDimension), (measureDimension2 - getPaddingTop()) - getPaddingBottom());
        for (Range range : this.ranges) {
            range.setStartPosition(toPosition(Math.max(range.getStartValue(), this.minValue), measureDimension) + range.getMarginStart());
            range.setEndPosition(toPosition(Math.min(range.getEndValue(), this.maxValue), measureDimension) - range.getMarginEnd());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        int scaledTouchSlop;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (!this.interactive) {
            return false;
        }
        int x4 = (((int) ev.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
        int action = ev.getAction();
        if (action == 0) {
            Thumb closestThumb = getClosestThumb(x4);
            this.thumbOnTouch = closestThumb;
            setValueToThumb$default(this, closestThumb, getTouchValue(x4), this.animationEnabled, false, 8, null);
            this.prevX = ev.getX();
            this.prevY = ev.getY();
            return true;
        }
        if (action == 1) {
            setValueToThumb$default(this, this.thumbOnTouch, getTouchValue(x4), this.animationEnabled, false, 8, null);
            return true;
        }
        if (action != 2) {
            return false;
        }
        setValueToThumb(this.thumbOnTouch, getTouchValue(x4), false, true);
        Integer num = this.touchSlop;
        if (num != null) {
            scaledTouchSlop = num.intValue();
        } else {
            scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            this.touchSlop = Integer.valueOf(scaledTouchSlop);
        }
        float abs = Math.abs(ev.getY() - this.prevY);
        if (abs < scaledTouchSlop) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getParent().requestDisallowInterceptTouchEvent(abs / Math.abs(ev.getX() - this.prevX) <= this.interceptionAngleTg);
        }
        this.prevX = ev.getX();
        this.prevY = ev.getY();
        return true;
    }

    public final void setActiveTickMarkDrawable(@Nullable Drawable drawable) {
        this.activeTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    public final void setActiveTrackDrawable(@Nullable Drawable drawable) {
        this.activeTrackDrawable = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j4) {
        if (this.animationDuration == j4 || j4 < 0) {
            return;
        }
        this.animationDuration = j4;
    }

    public final void setAnimationEnabled(boolean z4) {
        this.animationEnabled = z4;
    }

    public final void setAnimationInterpolator(@NotNull AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        Intrinsics.checkNotNullParameter(accelerateDecelerateInterpolator, "<set-?>");
        this.animationInterpolator = accelerateDecelerateInterpolator;
    }

    public final void setInactiveTickMarkDrawable(@Nullable Drawable drawable) {
        this.inactiveTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    public final void setInactiveTrackDrawable(@Nullable Drawable drawable) {
        this.inactiveTrackDrawable = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z4) {
        this.interactive = z4;
    }

    public final void setInterceptionAngle(float f4) {
        float max = Math.max(45.0f, Math.abs(f4) % 90);
        this.interceptionAngle = max;
        this.interceptionAngleTg = (float) Math.tan(max);
    }

    public final void setMaxValue(float f4) {
        if (this.maxValue == f4) {
            return;
        }
        setMinValue(Math.min(this.minValue, f4 - 1.0f));
        this.maxValue = f4;
        setThumbsInBoarders();
        invalidate();
    }

    public final void setMinValue(float f4) {
        if (this.minValue == f4) {
            return;
        }
        setMaxValue(Math.max(this.maxValue, 1.0f + f4));
        this.minValue = f4;
        setThumbsInBoarders();
        invalidate();
    }

    public final void setThumbDrawable(@Nullable Drawable drawable) {
        this.thumbDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(@Nullable TextDrawable textDrawable) {
        this.thumbSecondTextDrawable = textDrawable;
        invalidate();
    }

    public final void setThumbSecondaryDrawable(@Nullable Drawable drawable) {
        this.thumbSecondaryDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondaryValue(@Nullable Float f4, boolean z4) {
        trySetThumbSecondaryValue(f4, z4, true);
    }

    public final void setThumbTextDrawable(@Nullable TextDrawable textDrawable) {
        this.thumbTextDrawable = textDrawable;
        invalidate();
    }

    public final void setThumbValue(float f4, boolean z4) {
        trySetThumbValue(f4, z4, true);
    }

    private final int toPosition(int i4) {
        return toPosition$default(this, i4, 0, 1, null);
    }
}
