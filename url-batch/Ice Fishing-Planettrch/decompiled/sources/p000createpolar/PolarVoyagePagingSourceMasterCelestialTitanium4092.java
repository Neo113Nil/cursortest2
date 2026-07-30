package p000createpolar;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePagingSourceMasterCelestialTitanium4092 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Runnable PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public ViewTreeObserver PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyagePagingSourceMasterCelestialTitanium4092(View view, Runnable runnable) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = view;
        this.PolarVoyageStrictModeLegendEpic1532 = view.getViewTreeObserver();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.PolarVoyageStrictModeLegendEpic1532.isAlive();
        View view = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (isAlive) {
            this.PolarVoyageStrictModeLegendEpic1532.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.PolarVoyageStrictModeLegendEpic1532 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.PolarVoyageStrictModeLegendEpic1532.isAlive();
        View view2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (isAlive) {
            this.PolarVoyageStrictModeLegendEpic1532.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
