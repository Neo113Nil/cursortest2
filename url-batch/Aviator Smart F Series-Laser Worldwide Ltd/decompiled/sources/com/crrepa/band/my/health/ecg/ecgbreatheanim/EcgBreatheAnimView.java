package com.crrepa.band.my.health.ecg.ecgbreatheanim;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.crrepa.band.my.databinding.ComponentEcgBreatheAnimBinding;

/* loaded from: classes2.dex */
public class EcgBreatheAnimView extends RelativeLayout {
    private final ComponentEcgBreatheAnimBinding binding;
    private boolean rotation;

    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            EcgBreatheAnimView.this.startAnim();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface b {
        void onBreathChanged(boolean z7);
    }

    public EcgBreatheAnimView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAnim() {
        this.binding.positiveEcgBreatheView.show();
        this.binding.positiveEcgBreatheView.setVisibility(0);
        this.binding.obliqueEcgBreatheView.show();
        this.binding.obliqueEcgBreatheView.setVisibility(0);
    }

    public void setAnimatorListener(b bVar) {
        this.binding.obliqueEcgBreatheView.setAnimatorListener(bVar);
    }

    public synchronized void show() {
        if (this.rotation) {
            startAnim();
        } else {
            this.rotation = true;
            this.binding.obliqueEcgBreatheView.animate().setDuration(20L).rotation(45.0f).setListener(new a()).start();
        }
    }

    public void stop() {
        this.binding.positiveEcgBreatheView.stop();
        this.binding.obliqueEcgBreatheView.stop();
    }

    public EcgBreatheAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EcgBreatheAnimView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.rotation = false;
        this.binding = ComponentEcgBreatheAnimBinding.inflate(LayoutInflater.from(context), this, true);
    }
}
