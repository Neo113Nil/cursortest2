package p000createpolar;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 implements Serializable {
    public final Pattern PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(String str, int i) {
        str.getClass();
        Pattern compile = Pattern.compile(str, 66);
        compile.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = compile;
    }

    public final boolean PolarVoyageKotlinBetaPulseBeta3653(CharSequence charSequence) {
        charSequence.getClass();
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(charSequence).matches();
    }

    public final PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        str.getClass();
        Matcher matcher = this.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new PolarVoyageAnimatorCelestialDeltaMaster5821(matcher, str);
        }
        return null;
    }

    public final PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageZipVortexCelestial6185(String str, int i) {
        str.getClass();
        Matcher region = this.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new PolarVoyageAnimatorCelestialDeltaMaster5821(region, str);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.PolarVoyageItemDecorationUltraDeltaEpic7485.toString();
        pattern.getClass();
        return pattern;
    }

    public PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = compile;
    }
}
