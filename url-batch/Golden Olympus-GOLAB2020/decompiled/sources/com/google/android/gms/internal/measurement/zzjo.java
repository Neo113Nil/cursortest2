package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.g;

/* loaded from: classes.dex */
public final class zzjo {
    private final g zza;

    zzjo(g gVar) {
        this.zza = gVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        g gVar = uri != null ? (g) this.zza.get(uri.toString()) : null;
        if (gVar == null) {
            return null;
        }
        return (String) gVar.get("".concat(str3));
    }
}
