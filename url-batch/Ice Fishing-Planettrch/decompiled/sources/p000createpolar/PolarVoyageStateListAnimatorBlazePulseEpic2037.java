package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageStateListAnimatorBlazePulseEpic2037 extends PolarVoyageOnGlobalLayoutListenerBetaDragon6697 {
    public Object[] PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public boolean PolarVoyageViewRogueMaster4778;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public PolarVoyageStateListAnimatorBlazePulseEpic2037(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i3;
        Object[] objArr2 = new Object[i3];
        this.PolarVoyageBottomSheetOmegaNeo1907 = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.PolarVoyageViewRogueMaster4778 = r5;
        objArr2[0] = objArr;
        PolarVoyageMotionLayoutTransitionHeroVision4068(i - r5, 1);
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(int i) {
        int i2 = 0;
        while (PolarVoyageFragmentManagerEpicMax6434.PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageItemDecorationUltraDeltaEpic7485, ((this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1) - (i2 / 5)) + 1);
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(int i, int i2) {
        int i3 = (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - i2) * 5;
        while (i2 < this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            Object[] objArr = this.PolarVoyageBottomSheetOmegaNeo1907;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[PolarVoyageFragmentManagerEpicMax6434.PolarVoyageStrictModeLegendEpic1532(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final Object PolarVoyageZipVortexCelestial6185() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485 & 31;
        Object obj = this.PolarVoyageBottomSheetOmegaNeo1907[this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        Object PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185();
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485 + 1;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        if (i == this.PolarVoyageStrictModeLegendEpic1532) {
            this.PolarVoyageViewRogueMaster4778 = true;
            return PolarVoyageZipVortexCelestial6185;
        }
        PolarVoyageKotlinBetaPulseBeta3653(0);
        return PolarVoyageZipVortexCelestial6185;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485--;
        if (this.PolarVoyageViewRogueMaster4778) {
            this.PolarVoyageViewRogueMaster4778 = false;
            return PolarVoyageZipVortexCelestial6185();
        }
        PolarVoyageKotlinBetaPulseBeta3653(31);
        return PolarVoyageZipVortexCelestial6185();
    }
}
