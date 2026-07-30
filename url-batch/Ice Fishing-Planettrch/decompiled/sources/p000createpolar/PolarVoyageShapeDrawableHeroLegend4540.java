package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageShapeDrawableHeroLegend4540 implements PolarVoyageProcessCameraProviderLegendTurbo5502 {
    public final PolarVoyageRoomDatabaseCosmosCosmosSpeed2417 PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageRoomDatabaseCosmosCosmosSpeed2417(0);

    public final boolean PolarVoyageDiffUtilTurboStrike5735(int i) {
        return (this.PolarVoyageItemDecorationUltraDeltaEpic7485.get() & i) != 0;
    }

    public final void PolarVoyageTextInputEditTextNebulaHero6651(int i) {
        PolarVoyageRoomDatabaseCosmosCosmosSpeed2417 polarVoyageRoomDatabaseCosmosCosmosSpeed2417;
        int i2;
        do {
            polarVoyageRoomDatabaseCosmosCosmosSpeed2417 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            i2 = polarVoyageRoomDatabaseCosmosCosmosSpeed2417.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!polarVoyageRoomDatabaseCosmosCosmosSpeed2417.compareAndSet(i2, i2 | i));
    }
}
