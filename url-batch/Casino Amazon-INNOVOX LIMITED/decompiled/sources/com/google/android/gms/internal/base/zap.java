package com.google.android.gms.internal.base;

import android.os.Build;
import androidx.sqlite.driver.bundled.BundledSQLite;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class zap {
    public static final int zaa;

    static {
        zaa = Build.VERSION.SDK_INT >= 31 ? BundledSQLite.SQLITE_OPEN_EXRESCODE : 0;
    }
}
