package p000createpolar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFilterNebulaHeroHero5497 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        PolarVoyageRunnableVisionPhoenix2735 polarVoyageRunnableVisionPhoenix2735 = PolarVoyageThemeOverlayCelestialOmegaSpark3810.PolarVoyageZipVortexCelestial6185;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageTransformNeoTitanium1654.PolarVoyageDisplayMetricsVortexDragon9516(layout, lineForOffset, paint) + PolarVoyageTransformNeoTitanium1654.PolarVoyageBitmapMaxTitanTitan7960(layout, lineForOffset, paint);
            if (PolarVoyageDisplayMetricsVortexDragon9516 == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(PolarVoyageDisplayMetricsVortexDragon9516, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
