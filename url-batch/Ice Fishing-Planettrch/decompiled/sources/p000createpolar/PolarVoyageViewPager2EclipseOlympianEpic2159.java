package p000createpolar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewPager2EclipseOlympianEpic2159 {
    public static PolarVoyageViewPager2EclipseOlympianEpic2159 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public boolean PolarVoyageKotlinBetaPulseBeta3653;
    public TypedValue PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final WeakHashMap PolarVoyageZipVortexCelestial6185 = new WeakHashMap(0);

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        new LinkedHashMap(0, 0.75f, true);
    }

    public final synchronized Drawable PolarVoyageKotlinBetaPulseBeta3653(Context context, int i) {
        Drawable PolarVoyageZipVortexCelestial6185;
        try {
            if (!this.PolarVoyageKotlinBetaPulseBeta3653) {
                this.PolarVoyageKotlinBetaPulseBeta3653 = true;
                Drawable PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(context, R.drawable.abc_vector_test);
                if (PolarVoyageMotionLayoutTransitionHeroVision4068 == null || !"android.graphics.drawable.VectorDrawable".equals(PolarVoyageMotionLayoutTransitionHeroVision4068.getClass().getName())) {
                    this.PolarVoyageKotlinBetaPulseBeta3653 = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(context, i);
            if (PolarVoyageZipVortexCelestial6185 == null) {
                PolarVoyageZipVortexCelestial6185 = context.getDrawable(i);
            }
            if (PolarVoyageZipVortexCelestial6185 != null) {
                synchronized (this) {
                }
            }
            if (PolarVoyageZipVortexCelestial6185 != null) {
                int[] iArr = PolarVoyageMaterialCardViewSolarSolarTitanium2988.PolarVoyageZipVortexCelestial6185;
                String name = PolarVoyageZipVortexCelestial6185.getClass().getName();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29 && i2 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                    int[] state = PolarVoyageZipVortexCelestial6185.getState();
                    if (state != null && state.length != 0) {
                        PolarVoyageZipVortexCelestial6185.setState(PolarVoyageMaterialCardViewSolarSolarTitanium2988.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        PolarVoyageZipVortexCelestial6185.setState(state);
                    }
                    PolarVoyageZipVortexCelestial6185.setState(PolarVoyageMaterialCardViewSolarSolarTitanium2988.PolarVoyageZipVortexCelestial6185);
                    PolarVoyageZipVortexCelestial6185.setState(state);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return PolarVoyageZipVortexCelestial6185;
    }

    public final synchronized Drawable PolarVoyageMotionLayoutTransitionHeroVision4068(Context context, int i) {
        return PolarVoyageKotlinBetaPulseBeta3653(context, i);
    }

    public final Drawable PolarVoyageZipVortexCelestial6185(Context context, int i) {
        Object obj;
        Drawable newDrawable;
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new TypedValue();
        }
        context.getResources().getValue(i, this.PolarVoyageMotionLayoutTransitionHeroVision4068, true);
        long j = (r0.assetCookie << 32) | r0.data;
        synchronized (this) {
            PolarVoyageScrollViewNovaDragon3767 polarVoyageScrollViewNovaDragon3767 = (PolarVoyageScrollViewNovaDragon3767) this.PolarVoyageZipVortexCelestial6185.get(context);
            if (polarVoyageScrollViewNovaDragon3767 != null) {
                int PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageScrollViewNovaDragon3767.PolarVoyageStrictModeLegendEpic1532, polarVoyageScrollViewNovaDragon3767.PolarVoyageBottomSheetOmegaNeo1907, j);
                if (PolarVoyageItemDecorationUltraDeltaEpic7485 < 0 || (obj = polarVoyageScrollViewNovaDragon3767.PolarVoyageRotateAnimationCyberCelestialDelta4768[PolarVoyageItemDecorationUltraDeltaEpic7485]) == PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageBitmapVisionAuroraPixel4705) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        polarVoyageScrollViewNovaDragon3767.PolarVoyageKotlinBetaPulseBeta3653(j);
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        return null;
    }
}
