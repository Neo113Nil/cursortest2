package p000createpolar;

import android.view.MotionEvent;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextInputEditTextNovaXSolarBlaze7350 {
    public static final PolarVoyageTextInputEditTextNovaXSolarBlaze7350 PolarVoyageZipVortexCelestial6185 = new PolarVoyageTextInputEditTextNovaXSolarBlaze7350();

    public final boolean PolarVoyageZipVortexCelestial6185(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        if ((Float.floatToRawIntBits(rawX) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & Integer.MAX_VALUE) < 2139095040;
    }
}
