package com.google.android.recaptcha.internal;

import W1.h;
import W1.i;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzfm {
    private final h zza;

    public zzfm() {
        int i4 = zzav.zza;
        this.zza = i.b(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection openConnection = new URL(str).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
