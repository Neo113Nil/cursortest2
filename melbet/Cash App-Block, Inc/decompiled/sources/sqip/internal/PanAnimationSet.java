package sqip.internal;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lsqip/internal/PanAnimationSet;", "", "()V", "ANIMATION_DURATION_MS", "", "createAnimation", "Landroid/view/animation/Animation;", "startX", "", "endX", "startAlpha", "endAlpha", "getInFromLeft", "getInFromRight", "getOutToLeft", "getOutToRight", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PanAnimationSet {
    private static final long ANIMATION_DURATION_MS = 150;
    public static final PanAnimationSet INSTANCE = new PanAnimationSet();

    private PanAnimationSet() {
    }

    private final Animation createAnimation(float startX, float endX, float startAlpha, float endAlpha) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        animationSet.addAnimation(new AlphaAnimation(startAlpha, endAlpha));
        animationSet.setDuration(ANIMATION_DURATION_MS);
        animationSet.addAnimation(new TranslateAnimation(1, startX, 1, endX, 0, RecyclerView.DECELERATION_RATE, 0, RecyclerView.DECELERATION_RATE));
        return animationSet;
    }

    public final Animation getInFromLeft() {
        return createAnimation(-0.44f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
    }

    public final Animation getInFromRight() {
        return createAnimation(0.44f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
    }

    public final Animation getOutToLeft() {
        return createAnimation(RecyclerView.DECELERATION_RATE, -0.44f, 1.0f, RecyclerView.DECELERATION_RATE);
    }

    public final Animation getOutToRight() {
        return createAnimation(RecyclerView.DECELERATION_RATE, 0.44f, 1.0f, RecyclerView.DECELERATION_RATE);
    }
}
