package y3;

import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c0 extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public final String f8852d;

    public c0(FileNotFoundException fileNotFoundException) {
        super(fileNotFoundException);
        this.f8852d = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f8852d;
    }
}
