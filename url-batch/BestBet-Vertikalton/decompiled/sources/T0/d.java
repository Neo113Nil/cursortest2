package T0;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1031b;

    public /* synthetic */ d(i iVar, int i) {
        this.f1030a = i;
        this.f1031b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        WindowMetrics currentWindowMetrics;
        i iVar = this.f1031b;
        switch (this.f1030a) {
            case 0:
                if (iVar.i != null) {
                    Context context = iVar.h;
                    int i = L0.k.d;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    h hVar = iVar.i;
                    hVar.getLocationInWindow(iArr);
                    int height2 = (height - (hVar.getHeight() + iArr[1])) + ((int) hVar.getTranslationY());
                    int i2 = iVar.f1061p;
                    if (height2 < i2) {
                        ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(i.f1048z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i3 = iVar.f1061p;
                            iVar.f1062q = i3;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                            hVar.requestLayout();
                            break;
                        }
                    } else {
                        iVar.f1062q = i2;
                        break;
                    }
                }
                break;
            case 1:
                iVar.b();
                break;
            default:
                h hVar2 = iVar.i;
                if (hVar2 != null) {
                    ViewParent parent = hVar2.getParent();
                    h hVar3 = iVar.i;
                    if (parent != null) {
                        hVar3.setVisibility(0);
                    }
                    if (hVar3.getAnimationMode() != 1) {
                        int height3 = hVar3.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = hVar3.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        hVar3.setTranslationY(height3);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height3, 0);
                        valueAnimator.setInterpolator(iVar.f1052e);
                        valueAnimator.setDuration(iVar.f1051c);
                        valueAnimator.addListener(new a(iVar, 1));
                        valueAnimator.addUpdateListener(new b(iVar, height3));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1937A0, 1.0f);
                        ofFloat.setInterpolator(iVar.d);
                        ofFloat.addUpdateListener(new b(iVar, 0, (byte) 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(iVar.f1053f);
                        ofFloat2.addUpdateListener(new b(iVar, 1, (byte) 0));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(iVar.f1049a);
                        animatorSet.addListener(new a(iVar, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
