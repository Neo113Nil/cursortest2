package p000createpolar;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePlaceholderOmegaBeta9165 extends CharacterStyle {
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final boolean PolarVoyageZipVortexCelestial6185;

    public PolarVoyagePlaceholderOmegaBeta9165(boolean z, boolean z2) {
        this.PolarVoyageZipVortexCelestial6185 = z;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.PolarVoyageZipVortexCelestial6185);
        textPaint.setStrikeThruText(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
    }
}
