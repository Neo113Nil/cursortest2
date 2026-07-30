package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageHandlerThreadSpectraRogue1949 extends PolarVoyageOnGlobalLayoutListenerBetaDragon6697 {
    public final PolarVoyageStateListAnimatorBlazePulseEpic2037 PolarVoyageBottomSheetOmegaNeo1907;
    public final Object[] PolarVoyageRotateAnimationCyberCelestialDelta4768;

    public PolarVoyageHandlerThreadSpectraRogue1949(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageStateListAnimatorBlazePulseEpic2037(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        PolarVoyageStateListAnimatorBlazePulseEpic2037 polarVoyageStateListAnimatorBlazePulseEpic2037 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageStateListAnimatorBlazePulseEpic2037.hasNext()) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485++;
            return polarVoyageStateListAnimatorBlazePulseEpic2037.next();
        }
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i + 1;
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768[i - polarVoyageStateListAnimatorBlazePulseEpic2037.PolarVoyageStrictModeLegendEpic1532];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageStateListAnimatorBlazePulseEpic2037 polarVoyageStateListAnimatorBlazePulseEpic2037 = this.PolarVoyageBottomSheetOmegaNeo1907;
        int i2 = polarVoyageStateListAnimatorBlazePulseEpic2037.PolarVoyageStrictModeLegendEpic1532;
        if (i <= i2) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i - 1;
            return polarVoyageStateListAnimatorBlazePulseEpic2037.previous();
        }
        int i3 = i - 1;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i3;
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768[i3 - i2];
    }
}
