package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzhc {
    private final Object zzajo = new Object();

    @GuardedBy("mPoolLock")
    private boolean zzajp = false;
}
