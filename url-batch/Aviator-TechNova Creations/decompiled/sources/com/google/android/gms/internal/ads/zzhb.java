package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public interface zzhb extends zzj {
    long zzb(zzhf zzhfVar) throws IOException;

    Uri zzc();

    void zzd() throws IOException;

    void zze(zzhz zzhzVar);

    default Map zzj() {
        return Collections.emptyMap();
    }
}
