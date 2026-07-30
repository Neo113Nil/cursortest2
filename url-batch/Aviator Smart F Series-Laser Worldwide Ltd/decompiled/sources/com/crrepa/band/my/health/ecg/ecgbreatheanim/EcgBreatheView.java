package com.crrepa.band.my.health.ecg.ecgbreatheanim;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.crrepa.band.my.databinding.ComponentEcgBreatheBinding;
import com.crrepa.band.my.health.ecg.ecgbreatheanim.EcgBreatheAnimView;
import com.moyoung.dafit.module.common.utils.o;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class EcgBreatheView extends RelativeLayout {
    private static final int ANMI_DURATION = 4000;
    private static final int RESET_ANMI_DURATION = 100;
    private static final int ROTATION_VALUE = 90;
    private static final int TRANSLATION_VALUE = 18;
    private boolean animationEnd;
    private EcgBreatheAnimView.b animatorListener;
    private final ComponentEcgBreatheBinding binding;
    private int breathCount;
    private boolean reverse;
    private boolean stop;
    private int translationDistance;

    class a implements Animator.AnimatorListener {
        final /* synthetic */ boolean val$reverse;

        a(boolean z7) {
            this.val$reverse = z7;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            EcgBreatheView.this.animationEnd = true;
            EcgBreatheView.this.postAnim(true ^ this.val$reverse);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            EcgBreatheView.this.animationEnd = false;
        }
    }

    class b implements Consumer {
        final /* synthetic */ boolean val$reverse;

        b(boolean z7) {
            this.val$reverse = z7;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            EcgBreatheView.this.startAnim(this.val$reverse);
        }
    }

    public EcgBreatheView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postAnim(boolean z7) {
        Observable.timer(100L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(z7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAnim(boolean z7) {
        if (!this.stop && this.animationEnd) {
            this.reverse = z7;
            int i8 = this.translationDistance;
            if (!z7) {
                i8 = -i8;
            }
            int i9 = this.translationDistance;
            if (z7) {
                i9 = -i9;
            }
            int i10 = z7 ? -90 : 90;
            float f8 = i8;
            this.binding.ivTop.animate().setDuration(4000L).setInterpolator(new AccelerateDecelerateInterpolator()).translationYBy(f8);
            float f9 = i9;
            this.binding.ivBottom.animate().setDuration(4000L).setInterpolator(new AccelerateDecelerateInterpolator()).translationYBy(f9);
            this.binding.ivLeft.animate().setDuration(4000L).setInterpolator(new AccelerateDecelerateInterpolator()).translationXBy(f8);
            this.binding.ivRight.animate().setDuration(4000L).setInterpolator(new AccelerateDecelerateInterpolator()).translationXBy(f9);
            animate().setDuration(4000L).rotationBy(i10).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new a(z7));
            EcgBreatheAnimView.b bVar = this.animatorListener;
            if (bVar != null) {
                int i11 = this.breathCount;
                boolean z8 = i11 % 2 == 0;
                this.breathCount = i11 + 1;
                bVar.onBreathChanged(z8);
            }
        }
    }

    public void setAnimatorListener(EcgBreatheAnimView.b bVar) {
        this.animatorListener = bVar;
    }

    protected void show() {
        this.stop = false;
        startAnim(!this.reverse);
    }

    protected void stop() {
        this.stop = true;
    }

    public EcgBreatheView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EcgBreatheView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.stop = false;
        this.reverse = true;
        this.animationEnd = true;
        this.breathCount = 0;
        this.binding = ComponentEcgBreatheBinding.inflate(LayoutInflater.from(context), this, true);
        this.translationDistance = o.dp2px(context, 18.0f);
    }
}
