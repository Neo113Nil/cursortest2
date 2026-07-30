package p000createpolar;

import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMapTitaniumBlazeNeo9405 extends IOException {
    public final String PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageMapTitaniumBlazeNeo9405(FileNotFoundException fileNotFoundException) {
        super(fileNotFoundException);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }
}
