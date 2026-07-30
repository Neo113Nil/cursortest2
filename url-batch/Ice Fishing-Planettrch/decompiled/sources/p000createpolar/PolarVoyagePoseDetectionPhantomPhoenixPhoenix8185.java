package p000createpolar;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePoseDetectionPhantomPhoenixPhoenix8185 implements CharacterIterator {
    public final CharSequence PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyagePoseDetectionPhantomPhoenixPhoenix8185(CharSequence charSequence, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = charSequence;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i == this.PolarVoyageStrictModeLegendEpic1532) {
            return (char) 65535;
        }
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        if (i == 0) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i < i2) {
            return this.PolarVoyageItemDecorationUltraDeltaEpic7485.charAt(i);
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.PolarVoyageStrictModeLegendEpic1532 || i < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("invalid position");
            return (char) 0;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
        return current();
    }
}
