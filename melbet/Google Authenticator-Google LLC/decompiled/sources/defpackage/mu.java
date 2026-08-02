package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageButton;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.libraries.material.productlockup.AnimatableProductLockupView;
import com.google.android.libraries.material.speeddial.expandable.ExpandableFloatingActionButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((mv) this.a).p = valueAnimator.getAnimatedFraction();
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
                js jsVar = (js) this.a;
                int i = (int) floatValue;
                jsVar.b.setAlpha(i);
                jsVar.c.setAlpha(i);
                jsVar.e();
                break;
            case 2:
                ((View) ((el) ((kee) this.a).a).c.getParent()).invalidate();
                break;
            case 3:
                ((dne) this.a).b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ((AnimatableProductLockupView) this.a).c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dns dnsVar = (dns) this.a;
                if (dnsVar.a != floatValue2) {
                    dnsVar.a = floatValue2;
                    dnsVar.invalidateSelf();
                    break;
                }
                break;
            case 6:
                ((ExpandableFloatingActionButton) this.a).b(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                break;
            case 7:
                String str = eea.a;
                ((MaterialCardView) this.a).c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fgn fgnVar = (fgn) this.a;
                fgnVar.l.setAlpha((int) (255.0f * floatValue3));
                fgnVar.v = floatValue3;
                break;
            case 9:
                ((ClippableRoundedCornerLayout) this.a).b((float[]) valueAnimator.getAnimatedValue());
                break;
            case 10:
                ((DrawerLayout) this.a).n(va.c(-1728053248, fes.b(fkr.a, 0, valueAnimator.getAnimatedFraction())));
                break;
            case 11:
                flp flpVar = (flp) this.a;
                flpVar.b.e = flpVar.e.getInterpolation(flpVar.d.getAnimatedFraction());
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int i2 = fnr.x;
                ((eo) this.a).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int i3 = fnr.x;
                ((fis) this.a).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i4 = fnr.x;
                ((ImageButton) this.a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                ((fno) this.a).a.f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                ((fno) this.a).a.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                fno.g(((fno) this.a).a.i, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 18:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fnr fnrVar = ((fnq) this.a).a;
                fnrVar.j.setAlpha(floatValue4);
                fnrVar.p.z.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                ((fqe) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = ((fqe) this.a).h;
                checkableImageButton.setScaleX(floatValue5);
                checkableImageButton.setScaleY(floatValue5);
                break;
        }
    }

    public /* synthetic */ mu(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
