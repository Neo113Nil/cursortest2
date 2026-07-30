package com.crrepa.band.my.health.widgets;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class WaveHelper {
    private static final float DEFAULT_MAX_AMPLITUDE_RATIO = 0.03f;
    private static final float DEFAULT_MAX_LEVEL_RATIO = 1.0f;
    private static final float DEFAULT_MAX_SHIFT_RATIO = 1.0f;
    private static final float DEFAULT_MIN_AMPLITUDE_RATIO = 1.0E-4f;
    private static final float DEFAULT_MIN_LEVEL_RATIO = 0.0f;
    private static final float DEFAULT_MIN_SHIFT_RATIO = 0.0f;
    private AnimatorSet mAnimatorSet;
    private final WaveView mWaveView;
    private AnimatorStatus status = AnimatorStatus.INIT;

    public enum AnimatorStatus {
        INIT,
        START,
        RESUME,
        PAUSE,
        END
    }

    public WaveHelper(WaveView waveView) {
        this.mWaveView = waveView;
        initAnimation();
        waveView.setShowWave(true);
    }

    private float checkLevelRatio(float f8) {
        float max;
        if (f8 <= 0.5f || f8 >= 1.0f) {
            max = Math.max(DEFAULT_MAX_AMPLITUDE_RATIO, f8);
        } else {
            double d8 = f8;
            max = (float) (d8 - (0.05d * d8));
        }
        return Math.min(max, 0.92f);
    }

    @SuppressLint({"AnimatorKeep"})
    private ObjectAnimator getAmplitudeAnimator(float f8, float f9) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWaveView, "amplitudeRatio", f8, f9);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setDuration(1500L);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    @SuppressLint({"AnimatorKeep"})
    private ObjectAnimator getWaveLevelAnimator(float f8, float f9) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWaveView, "waterLevelRatio", f8, f9);
        ofFloat.setDuration(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        return ofFloat;
    }

    @SuppressLint({"AnimatorKeep"})
    private ObjectAnimator getWaveShiftAnimator(float f8, float f9) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWaveView, "waveShiftRatio", f8, f9);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    private void initAnimation() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getWaveShiftAnimator(0.0f, 1.0f));
        arrayList.add(getAmplitudeAnimator(1.0E-4f, DEFAULT_MAX_AMPLITUDE_RATIO));
        AnimatorSet animatorSet = new AnimatorSet();
        this.mAnimatorSet = animatorSet;
        animatorSet.playTogether(arrayList);
    }

    public void end() {
        AnimatorSet animatorSet = this.mAnimatorSet;
        if (animatorSet != null) {
            animatorSet.end();
            this.status = AnimatorStatus.END;
        }
    }

    public AnimatorStatus getStatus() {
        return this.status;
    }

    public void pause() {
        AnimatorSet animatorSet = this.mAnimatorSet;
        if (animatorSet != null) {
            animatorSet.pause();
            this.status = AnimatorStatus.PAUSE;
        }
    }

    public void resume() {
        AnimatorSet animatorSet = this.mAnimatorSet;
        if (animatorSet != null) {
            animatorSet.resume();
            this.status = AnimatorStatus.RESUME;
        }
    }

    public void setWaterLevelRatio(float f8) {
        this.mWaveView.setWaterLevelRatio(checkLevelRatio(f8));
        start();
    }

    public void start() {
        AnimatorSet animatorSet = this.mAnimatorSet;
        if (animatorSet != null) {
            animatorSet.start();
            this.status = AnimatorStatus.START;
        }
    }

    public void updateWaterLevelRatio(float f8) {
        float checkLevelRatio = checkLevelRatio(f8);
        ArrayList<Animator> childAnimations = this.mAnimatorSet.getChildAnimations();
        if (childAnimations != null) {
            if (childAnimations.size() == 2) {
                childAnimations.add(getWaveLevelAnimator(this.mWaveView.getWaterLevelRatio(), checkLevelRatio));
            } else if (childAnimations.size() == 3) {
                childAnimations.set(2, getWaveLevelAnimator(this.mWaveView.getWaterLevelRatio(), checkLevelRatio));
            }
            this.mAnimatorSet.cancel();
            AnimatorSet animatorSet = new AnimatorSet();
            this.mAnimatorSet = animatorSet;
            animatorSet.playTogether(childAnimations);
            start();
        }
    }
}
