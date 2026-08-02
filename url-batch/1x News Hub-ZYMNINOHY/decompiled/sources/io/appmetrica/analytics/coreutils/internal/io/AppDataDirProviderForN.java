package io.appmetrica.analytics.coreutils.internal.io;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class AppDataDirProviderForN {
    public static final AppDataDirProviderForN INSTANCE = new AppDataDirProviderForN();

    private AppDataDirProviderForN() {
    }

    public final File dataDir(Context context) {
        return context.getDataDir();
    }
}
