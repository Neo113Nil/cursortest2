package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzhys {
    public abstract void zza(zzhzs zzhzsVar, Object obj) throws IOException;

    public final zzhys zzc() {
        return !(this instanceof zzhyr) ? new zzhyr(this, null) : this;
    }
}
