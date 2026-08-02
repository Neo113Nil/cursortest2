package com.squareup.cash.ui.widget.text;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.components.MooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1;
import com.squareup.util.android.Views;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes7.dex */
public final class AnimatedAmountTextView extends View {
    public static final PathInterpolator SLIDE_INTERPOLATOR = new PathInterpolator(0.3f, 0.9f);
    public boolean animateEvenIfSame;
    public AnimationSpeed animationSpeed;
    public int gravity;
    public Float minTextSizeInPx;
    public float originalTextSizeInPx;
    public final TextPaint paint;
    public final ArrayDeque texts;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AnimationDirection {
        public static final /* synthetic */ AnimationDirection[] $VALUES;
        public static final AnimationDirection DECREASE;
        public static final AnimationDirection INCREASE;

        static {
            AnimationDirection animationDirection = new AnimationDirection("INCREASE", 0);
            INCREASE = animationDirection;
            AnimationDirection animationDirection2 = new AnimationDirection("DECREASE", 1);
            DECREASE = animationDirection2;
            $VALUES = new AnimationDirection[]{animationDirection, animationDirection2};
        }

        public static AnimationDirection valueOf(String str) {
            return (AnimationDirection) Enum.valueOf(AnimationDirection.class, str);
        }

        public static AnimationDirection[] values() {
            return (AnimationDirection[]) $VALUES.clone();
        }
    }

    public final class Text {
        public ValueAnimator enterAnimator;
        public ValueAnimator exitAnimator;
        public float fontAscent;
        public final String text;
        public float textHeight;
        public float textWidth;
        public final Double value;
        public List characterXLocations = EmptyList.INSTANCE;
        public AnimationDirection animationDirection = AnimationDirection.INCREASE;

        public Text(String str, Double d) {
            this.text = str;
            this.value = d;
        }

        public final long calculateDuration(String str) {
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt != ',' && charAt != '.') {
                    i++;
                }
            }
            AnimationSpeed animationSpeed = AnimatedAmountTextView.this.animationSpeed;
            return (animationSpeed.characterOffset * (i - 1)) + animationSpeed.slideDuration;
        }

        public final void enter(AnimationDirection animationDirection) {
            String str = this.text;
            if (str == null) {
                return;
            }
            this.animationDirection = animationDirection;
            long calculateDuration = calculateDuration(str);
            MooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1 mooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1 = new MooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1(AnimatedAmountTextView.this, 1);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
            ofFloat.setStartDelay(0L);
            ofFloat.setDuration(calculateDuration);
            ofFloat.setRepeatCount(0);
            ofFloat.setRepeatMode(1);
            ofFloat.addUpdateListener(mooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1);
            ofFloat.addListener(mooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1);
            ofFloat.start();
            this.enterAnimator = ofFloat;
        }

        public final void exit(AnimationDirection animationDirection, Function1 function1) {
            animationDirection.getClass();
            String str = this.text;
            if (str == null) {
                function1.invoke(this);
                return;
            }
            this.animationDirection = animationDirection;
            ValueAnimator valueAnimator = this.enterAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            long calculateDuration = calculateDuration(str);
            AnimatedAmountTextView$Text$exit$$inlined$valueAnimatorOf$default$1 animatedAmountTextView$Text$exit$$inlined$valueAnimatorOf$default$1 = new AnimatedAmountTextView$Text$exit$$inlined$valueAnimatorOf$default$1(AnimatedAmountTextView.this, function1, this);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
            ofFloat.setStartDelay(0L);
            ofFloat.setDuration(calculateDuration);
            ofFloat.setRepeatCount(0);
            ofFloat.setRepeatMode(1);
            ofFloat.addUpdateListener(animatedAmountTextView$Text$exit$$inlined$valueAnimatorOf$default$1);
            ofFloat.addListener(animatedAmountTextView$Text$exit$$inlined$valueAnimatorOf$default$1);
            ofFloat.start();
            this.exitAnimator = ofFloat;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedAmountTextView(Context context) {
        super(context);
        context.getClass();
        this.gravity = 8388611;
        this.animationSpeed = new AnimationSpeed(15);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        Typeface font = ResourcesCompat.getFont(context, R.font.cashsans_regular);
        font.getClass();
        textPaint.setTypeface(font);
        textPaint.setColor(-16777216);
        textPaint.setTextSize(Views.sp((View) this, 14.0f));
        this.paint = textPaint;
        this.originalTextSizeInPx = textPaint.getTextSize();
        this.texts = new ArrayDeque();
    }

    public static /* synthetic */ void setText$default(AnimatedAmountTextView animatedAmountTextView, String str, AnimationDirection animationDirection, int i, Object obj) {
        if ((i & 2) != 0) {
            animationDirection = AnimationDirection.INCREASE;
        }
        animatedAmountTextView.setText(str, animationDirection);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        String str;
        long j;
        int coerceIn;
        float f;
        float interpolation;
        float width;
        char charAt;
        AnimatedAmountTextView animatedAmountTextView = this;
        canvas.getClass();
        super.draw(canvas);
        Iterator it = animatedAmountTextView.texts.iterator();
        while (it.hasNext()) {
            Text text = (Text) it.next();
            AnimatedAmountTextView animatedAmountTextView2 = AnimatedAmountTextView.this;
            TextPaint textPaint = animatedAmountTextView.paint;
            textPaint.getClass();
            String str2 = text.text;
            if (str2 != null) {
                ValueAnimator valueAnimator = text.enterAnimator;
                long animatedFraction = valueAnimator != null ? (long) (valueAnimator.getAnimatedFraction() * valueAnimator.getDuration()) : Long.MAX_VALUE;
                ValueAnimator valueAnimator2 = text.exitAnimator;
                long animatedFraction2 = valueAnimator2 != null ? (long) (valueAnimator2.getAnimatedFraction() * valueAnimator2.getDuration()) : 0L;
                int length = str2.length();
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    long j2 = i2;
                    long j3 = AnimatedAmountTextView.this.animationSpeed.characterOffset;
                    Iterator it2 = it;
                    long j4 = animatedFraction - (j2 * j3);
                    long j5 = animatedFraction2 - (j2 * j3);
                    AnimationSpeed animationSpeed = animatedAmountTextView2.animationSpeed;
                    int i3 = length;
                    if (animatedFraction2 > 0) {
                        str = str2;
                        coerceIn = (int) ((1.0f - RangesKt___RangesKt.coerceIn(j5 / animationSpeed.fadeDuration, RecyclerView.DECELERATION_RATE, 1.0f)) * 255.0f);
                        j = animatedFraction;
                    } else {
                        str = str2;
                        j = animatedFraction;
                        coerceIn = (int) (RangesKt___RangesKt.coerceIn((j4 - r4) / animationSpeed.fadeDuration, RecyclerView.DECELERATION_RATE, 1.0f) * 255.0f);
                    }
                    textPaint.setAlpha(coerceIn);
                    AnimationSpeed animationSpeed2 = animatedAmountTextView2.animationSpeed;
                    PathInterpolator pathInterpolator = SLIDE_INTERPOLATOR;
                    if (animatedFraction2 > 0) {
                        f = RecyclerView.DECELERATION_RATE;
                        interpolation = pathInterpolator.getInterpolation(RangesKt___RangesKt.coerceIn(j5 / animationSpeed2.slideDuration, RecyclerView.DECELERATION_RATE, 1.0f)) * ((-text.textHeight) / 2.0f);
                    } else {
                        f = RecyclerView.DECELERATION_RATE;
                        interpolation = (1.0f - pathInterpolator.getInterpolation(RangesKt___RangesKt.coerceIn(j4 / animationSpeed2.slideDuration, RecyclerView.DECELERATION_RATE, 1.0f))) * (text.textHeight / 2.0f);
                    }
                    if (text.animationDirection == AnimationDirection.DECREASE) {
                        interpolation = -interpolation;
                    }
                    int i4 = animatedAmountTextView2.gravity;
                    if (i4 == 1) {
                        width = (((animatedAmountTextView2.getWidth() - animatedAmountTextView2.getPaddingStart()) - animatedAmountTextView2.getPaddingEnd()) - text.textWidth) / 2.0f;
                    } else if (i4 == 8388611) {
                        width = f;
                    } else {
                        if (i4 != 8388613) {
                            Path$$ExternalSyntheticBUOutline0.m();
                            return;
                        }
                        width = ((animatedAmountTextView2.getWidth() - animatedAmountTextView2.getPaddingStart()) - animatedAmountTextView2.getPaddingEnd()) - text.textWidth;
                    }
                    float floatValue = ((Number) text.characterXLocations.get(i)).floatValue() + animatedAmountTextView2.getPaddingStart() + width;
                    float paddingTop = animatedAmountTextView2.getPaddingTop() + text.fontAscent + interpolation;
                    int i5 = i2;
                    int i6 = i + 1;
                    str2 = str;
                    canvas.drawText(str2, i, i6, floatValue, paddingTop, (Paint) textPaint);
                    if (i == str2.length() - 1 || ((charAt = str2.charAt(i)) != ',' && charAt != '.')) {
                        i5++;
                    }
                    i = i6;
                    length = i3;
                    it = it2;
                    animatedFraction = j;
                    i2 = i5;
                }
            }
            animatedAmountTextView = this;
            it = it;
        }
    }

    public final void measureText() {
        Iterator it = this.texts.iterator();
        while (it.hasNext()) {
            Text text = (Text) it.next();
            text.getClass();
            TextPaint textPaint = this.paint;
            textPaint.getClass();
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            fontMetrics.getClass();
            float f = fontMetrics.descent;
            float f2 = fontMetrics.ascent;
            text.textHeight = f - f2;
            text.fontAscent = Math.abs(f2);
            String str = text.text;
            if (str == null) {
                text.textWidth = RecyclerView.DECELERATION_RATE;
                text.characterXLocations = EmptyList.INSTANCE;
            } else {
                text.textWidth = textPaint.measureText(str);
                ArrayList arrayList = new ArrayList();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (i == 0) {
                        arrayList.add(Float.valueOf(RecyclerView.DECELERATION_RATE));
                    } else {
                        arrayList.add(Float.valueOf(textPaint.measureText(str.substring(0, i + 1)) - textPaint.measureText(String.valueOf(str.charAt(i)))));
                    }
                }
                text.characterXLocations = CollectionsKt.toList(arrayList);
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Float valueOf;
        Float valueOf2;
        Float valueOf3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        Float f = this.minTextSizeInPx;
        ArrayDeque arrayDeque = this.texts;
        float f2 = RecyclerView.DECELERATION_RATE;
        TextPaint textPaint = this.paint;
        if (f != null && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            float floatValue = f.floatValue();
            int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                float f3 = ((Text) it.next()).textWidth;
                while (it.hasNext()) {
                    f3 = Math.max(f3, ((Text) it.next()).textWidth);
                }
                valueOf2 = Float.valueOf(f3);
            } else {
                valueOf2 = null;
            }
            float f4 = paddingStart;
            if ((valueOf2 != null ? valueOf2.floatValue() : 0.0f) > f4 && paddingStart > 0) {
                float f5 = this.originalTextSizeInPx;
                float f6 = floatValue;
                while (floatValue <= f5) {
                    float f7 = (floatValue + f5) / 2.0f;
                    textPaint.setTextSize(f7);
                    measureText();
                    Iterator it2 = arrayDeque.iterator();
                    if (it2.hasNext()) {
                        float f8 = ((Text) it2.next()).textWidth;
                        while (it2.hasNext()) {
                            f8 = Math.max(f8, ((Text) it2.next()).textWidth);
                        }
                        valueOf3 = Float.valueOf(f8);
                    } else {
                        valueOf3 = null;
                    }
                    if ((valueOf3 != null ? valueOf3.floatValue() : 0.0f) <= f4) {
                        floatValue = f7 + 0.5f;
                        f6 = f7;
                    } else {
                        f5 = f7 - 0.5f;
                    }
                    if (f5 - floatValue < 0.5f) {
                        break;
                    }
                }
                textPaint.setTextSize(f6);
                measureText();
            }
        }
        if (mode == Integer.MIN_VALUE || mode == 0) {
            Iterator it3 = arrayDeque.iterator();
            if (it3.hasNext()) {
                float f9 = ((Text) it3.next()).textWidth;
                while (it3.hasNext()) {
                    f9 = Math.max(f9, ((Text) it3.next()).textWidth);
                }
                valueOf = Float.valueOf(f9);
            } else {
                valueOf = null;
            }
            if (valueOf != null) {
                f2 = valueOf.floatValue();
            }
            int paddingEnd = getPaddingEnd() + getPaddingStart() + ((int) f2);
            if (mode != Integer.MIN_VALUE || paddingEnd <= size) {
                size = paddingEnd;
            }
        } else if (mode != 1073741824) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unexpected widthMeasureSpec: "));
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            fontMetrics.getClass();
            int paddingBottom = getPaddingBottom() + getPaddingTop() + ((int) (fontMetrics.descent - fontMetrics.ascent));
            if (mode2 != Integer.MIN_VALUE || paddingBottom <= size2) {
                size2 = paddingBottom;
            }
        } else if (mode2 != 1073741824) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Unexpected heightMeasureSpec: "));
            return;
        }
        setMeasuredDimension(size, size2);
    }

    public final void setAnimateEvenIfSame(boolean z) {
        this.animateEvenIfSame = z;
    }

    public final void setAnimationSpeed(AnimationSpeed animationSpeed) {
        animationSpeed.getClass();
        this.animationSpeed = animationSpeed;
    }

    public final void setGravity(int i) {
        if (!CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{8388611, 1, 8388613}).contains(Integer.valueOf(i))) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported gravity: "));
        } else {
            if (this.gravity == i) {
                return;
            }
            this.gravity = i;
            invalidate();
        }
    }

    public final void setLetterSpacing(float f) {
        TextPaint textPaint = this.paint;
        if (f == textPaint.getLetterSpacing()) {
            return;
        }
        textPaint.setLetterSpacing(f);
        textPaint.setTextSize(this.originalTextSizeInPx);
        measureText();
    }

    public final void setMinTextSizeInPx(Float f) {
        if (Intrinsics.areEqual(this.minTextSizeInPx, f)) {
            return;
        }
        this.minTextSizeInPx = f;
        this.paint.setTextSize(this.originalTextSizeInPx);
        measureText();
    }

    public final void setText(Amount amount) {
        ArrayDeque arrayDeque = this.texts;
        Text text = (Text) arrayDeque.peekLast();
        if (!this.animateEvenIfSame) {
            if (Intrinsics.areEqual(amount != null ? amount.text : null, text != null ? text.text : null)) {
                return;
            }
        }
        String str = amount != null ? amount.text : null;
        Double valueOf = amount != null ? Double.valueOf(amount.amount) : null;
        Text text2 = new Text(str, valueOf);
        setContentDescription(amount != null ? amount.text : null);
        arrayDeque.add(text2);
        if (text != null) {
            valueOf.getClass();
            double doubleValue = valueOf.doubleValue();
            Double d = text.value;
            AnimationDirection animationDirection = doubleValue > (d != null ? d.doubleValue() : 0.0d) ? AnimationDirection.INCREASE : AnimationDirection.DECREASE;
            text.exit(animationDirection, new AnimatedAmountTextView$$ExternalSyntheticLambda0(this, 1));
            text2.enter(animationDirection);
        }
        measureText();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.paint;
        if (i == textPaint.getColor()) {
            return;
        }
        textPaint.setColor(i);
        measureText();
    }

    public final void setTextSize(float f) {
        setTextSizeInPx(Views.sp(this, f));
    }

    public final void setTextSizeInPx(float f) {
        if (f == this.originalTextSizeInPx) {
            return;
        }
        this.paint.setTextSize(f);
        this.originalTextSizeInPx = f;
        measureText();
    }

    public final void setTypeface(Typeface typeface) {
        typeface.getClass();
        TextPaint textPaint = this.paint;
        if (Intrinsics.areEqual(typeface, textPaint.getTypeface())) {
            return;
        }
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(this.originalTextSizeInPx);
        measureText();
    }

    /* loaded from: classes6.dex */
    public final class Amount {
        public final double amount;
        public final long forceRecomposition;
        public final String text;

        public Amount(String str, double d, long j) {
            str.getClass();
            this.text = str;
            this.amount = d;
            this.forceRecomposition = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj;
            return Intrinsics.areEqual(this.text, amount.text) && Double.compare(this.amount, amount.amount) == 0 && this.forceRecomposition == amount.forceRecomposition;
        }

        public final int hashCode() {
            return Long.hashCode(this.forceRecomposition) + Fragment$5$$ExternalSyntheticOutline0.m(this.amount, this.text.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Amount(text=");
            sb.append(this.text);
            sb.append(", amount=");
            sb.append(this.amount);
            return Boxes$$ExternalSyntheticOutline1.m(this.forceRecomposition, ", forceRecomposition=", ")", sb);
        }

        public /* synthetic */ Amount(String str, double d) {
            this(str, d, 1L);
        }

        public /* synthetic */ Amount(String str, long j) {
            this(j, 1L, str);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Amount(long j, long j2, String str) {
            this(str, j, j2);
            str.getClass();
        }
    }

    public final class AnimationSpeed {
        public final long characterOffset;
        public final long fadeDuration;
        public final long fadeInDelay;
        public final long slideDuration;

        public /* synthetic */ AnimationSpeed(int i) {
            this((i & 1) != 0 ? 350L : 600L, 120L, 100L, 30L);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimationSpeed)) {
                return false;
            }
            AnimationSpeed animationSpeed = (AnimationSpeed) obj;
            return this.slideDuration == animationSpeed.slideDuration && this.fadeDuration == animationSpeed.fadeDuration && this.fadeInDelay == animationSpeed.fadeInDelay && this.characterOffset == animationSpeed.characterOffset;
        }

        public final int hashCode() {
            return Long.hashCode(this.characterOffset) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.slideDuration) * 31, 31, this.fadeDuration), 31, this.fadeInDelay);
        }

        public final String toString() {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.slideDuration, "AnimationSpeed(slideDuration=", ", fadeDuration=");
            m1149m.append(this.fadeDuration);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.fadeInDelay, ", fadeInDelay=", ", characterOffset=", m1149m);
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.characterOffset, ")", m1149m);
        }

        public AnimationSpeed(long j, long j2, long j3, long j4) {
            this.slideDuration = j;
            this.fadeDuration = j2;
            this.fadeInDelay = j3;
            this.characterOffset = j4;
        }
    }

    @Deprecated
    public final void setText(String str, AnimationDirection animationDirection) {
        animationDirection.getClass();
        ArrayDeque arrayDeque = this.texts;
        Text text = (Text) arrayDeque.peekLast();
        if (Intrinsics.areEqual(str, text != null ? text.text : null)) {
            return;
        }
        Text text2 = new Text(str, null);
        setContentDescription(str);
        arrayDeque.add(text2);
        if (text != null) {
            text.exit(animationDirection, new AnimatedAmountTextView$$ExternalSyntheticLambda0(this, 0));
            text2.enter(animationDirection);
        }
        measureText();
    }
}
