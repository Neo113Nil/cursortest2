package p000createpolar;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSupervisorJobHeroHero4111 implements LineHeightSpan {
    public final float PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageSupervisorJobHeroHero4111(float f) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r0 * 1.0f) / r1));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.PolarVoyageItemDecorationUltraDeltaEpic7485));
    }
}
