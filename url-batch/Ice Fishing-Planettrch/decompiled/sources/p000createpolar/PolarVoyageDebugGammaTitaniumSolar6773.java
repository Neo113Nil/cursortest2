package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDebugGammaTitaniumSolar6773 implements PolarVoyageDebugCelestialNebula7743 {
    public static final Object PolarVoyageRotateAnimationCyberCelestialDelta4768 = new Object();
    public volatile PolarVoyageModelInputOutputInfernoBeta7978 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public volatile Object PolarVoyageStrictModeLegendEpic1532;

    public static PolarVoyageDebugCelestialNebula7743 PolarVoyageZipVortexCelestial6185(PolarVoyageModelInputOutputInfernoBeta7978 polarVoyageModelInputOutputInfernoBeta7978) {
        if (polarVoyageModelInputOutputInfernoBeta7978 instanceof PolarVoyageDebugGammaTitaniumSolar6773) {
            return polarVoyageModelInputOutputInfernoBeta7978;
        }
        PolarVoyageDebugGammaTitaniumSolar6773 polarVoyageDebugGammaTitaniumSolar6773 = new PolarVoyageDebugGammaTitaniumSolar6773();
        polarVoyageDebugGammaTitaniumSolar6773.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageRotateAnimationCyberCelestialDelta4768;
        polarVoyageDebugGammaTitaniumSolar6773.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageModelInputOutputInfernoBeta7978;
        return polarVoyageDebugGammaTitaniumSolar6773;
    }

    @Override // p000createpolar.PolarVoyageDebugCelestialNebula7743
    public final Object get() {
        Object obj;
        Object obj2 = this.PolarVoyageStrictModeLegendEpic1532;
        Object obj3 = PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.PolarVoyageStrictModeLegendEpic1532;
                if (obj == obj3) {
                    obj = this.PolarVoyageItemDecorationUltraDeltaEpic7485.get();
                    Object obj4 = this.PolarVoyageStrictModeLegendEpic1532;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.PolarVoyageStrictModeLegendEpic1532 = obj;
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
