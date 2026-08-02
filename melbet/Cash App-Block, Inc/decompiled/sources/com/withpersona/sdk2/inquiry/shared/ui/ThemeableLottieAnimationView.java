package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$$ExternalSyntheticLambda2;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes9.dex */
public final class ThemeableLottieAnimationView extends LottieAnimationView {
    public final ContextScope scope;
    public final LinkedHashMap srcColorToDestColor;

    public static void $r8$lambda$GE0bdkpbO_TbMgGLiBqAl0dRWW8(final ThemeableLottieAnimationView themeableLottieAnimationView) {
        final int i = 0;
        themeableLottieAnimationView.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.COLOR, (LottieValueCallback<KeyPath>) new LottieValueCallback(themeableLottieAnimationView) { // from class: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$1$1
            public final /* synthetic */ ThemeableLottieAnimationView this$0;

            {
                this.this$0 = themeableLottieAnimationView;
            }

            @Override // com.airbnb.lottie.value.LottieValueCallback
            public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                int i2 = i;
                ThemeableLottieAnimationView themeableLottieAnimationView2 = this.this$0;
                switch (i2) {
                    case 0:
                        Integer num = (Integer) themeableLottieAnimationView2.srcColorToDestColor.get(lottieFrameInfo != null ? (Integer) lottieFrameInfo.getStartValue() : null);
                        if (num != null) {
                            return num;
                        }
                        if (lottieFrameInfo != null) {
                            return (Integer) lottieFrameInfo.getEndValue();
                        }
                        return null;
                    default:
                        Integer num2 = (Integer) themeableLottieAnimationView2.srcColorToDestColor.get(lottieFrameInfo != null ? (Integer) lottieFrameInfo.getStartValue() : null);
                        if (num2 != null) {
                            return num2;
                        }
                        if (lottieFrameInfo != null) {
                            return (Integer) lottieFrameInfo.getEndValue();
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        themeableLottieAnimationView.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.STROKE_COLOR, (LottieValueCallback<KeyPath>) new LottieValueCallback(themeableLottieAnimationView) { // from class: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$1$1
            public final /* synthetic */ ThemeableLottieAnimationView this$0;

            {
                this.this$0 = themeableLottieAnimationView;
            }

            @Override // com.airbnb.lottie.value.LottieValueCallback
            public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                int i22 = i2;
                ThemeableLottieAnimationView themeableLottieAnimationView2 = this.this$0;
                switch (i22) {
                    case 0:
                        Integer num = (Integer) themeableLottieAnimationView2.srcColorToDestColor.get(lottieFrameInfo != null ? (Integer) lottieFrameInfo.getStartValue() : null);
                        if (num != null) {
                            return num;
                        }
                        if (lottieFrameInfo != null) {
                            return (Integer) lottieFrameInfo.getEndValue();
                        }
                        return null;
                    default:
                        Integer num2 = (Integer) themeableLottieAnimationView2.srcColorToDestColor.get(lottieFrameInfo != null ? (Integer) lottieFrameInfo.getStartValue() : null);
                        if (num2 != null) {
                            return num2;
                        }
                        if (lottieFrameInfo != null) {
                            return (Integer) lottieFrameInfo.getEndValue();
                        }
                        return null;
                }
            }
        });
    }

    public ThemeableLottieAnimationView(Context context) {
        super(context);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = JobKt.CoroutineScope(Dispatchers.Default);
        addLottieOnCompositionLoadedListener(new OldSelfieOverlayView$$ExternalSyntheticLambda2(this, 2));
    }

    public final void addColorReplacement(int i, int i2) {
        this.srcColorToDestColor.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        JobKt.cancel(this.scope, (CancellationException) null);
    }

    public ThemeableLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = JobKt.CoroutineScope(Dispatchers.Default);
        addLottieOnCompositionLoadedListener(new OldSelfieOverlayView$$ExternalSyntheticLambda2(this, 2));
    }

    public ThemeableLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = JobKt.CoroutineScope(Dispatchers.Default);
        addLottieOnCompositionLoadedListener(new OldSelfieOverlayView$$ExternalSyntheticLambda2(this, 2));
    }
}
