package sqip.internal;

import android.animation.ValueAnimator;

/* loaded from: classes10.dex */
public final /* synthetic */ class CardImage$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardImage f$0;

    public /* synthetic */ CardImage$$ExternalSyntheticLambda0(CardImage cardImage, int i) {
        this.$r8$classId = i;
        this.f$0 = cardImage;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        CardImage cardImage = this.f$0;
        switch (i) {
            case 0:
                CardImage.animateLargeCardNumberDots$lambda$25$lambda$24(cardImage, valueAnimator);
                break;
            case 1:
                CardImage.animateFocusedDot$lambda$27$lambda$26(cardImage, valueAnimator);
                break;
            case 2:
                CardImage.startCurtainAnimation$lambda$16$lambda$15(cardImage, valueAnimator);
                break;
            case 3:
                CardImage.showLastFewDigits$lambda$23$lambda$22(cardImage, valueAnimator);
                break;
            default:
                CardImage.animateCvv$lambda$29$lambda$28(cardImage, valueAnimator);
                break;
        }
    }
}
