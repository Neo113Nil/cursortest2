package p000createpolar;

import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePaintFlagsDrawFilterOlympianPixel1746 extends PolarVoyageGeocoderMasterHyperHyperion4028 implements PolarVoyageStateFlowOmegaThunderSpeed9278, RandomAccess, Serializable {
    public final Enum[] PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyagePaintFlagsDrawFilterOlympianPixel1746(Enum[] enumArr) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = enumArr;
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416
    public final int PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.length;
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageLayerSpeedBlazeVortex2881(r2.ordinal(), this.PolarVoyageItemDecorationUltraDeltaEpic7485)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageLayerSpeedBlazeVortex2881(ordinal, this.PolarVoyageItemDecorationUltraDeltaEpic7485)) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageLayerSpeedBlazeVortex2881(ordinal, this.PolarVoyageItemDecorationUltraDeltaEpic7485)) == r3) {
            return ordinal;
        }
        return -1;
    }
}
