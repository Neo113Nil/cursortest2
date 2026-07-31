package com.google.android.recaptcha.internal;

import com.ironsource.cc;
import com.ironsource.jn;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class zzex {
    private final zzfm zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final zzew zza(String str) {
        try {
            HttpURLConnection zza = this.zza.zza(str);
            zza.setRequestMethod(jn.f16865b);
            zza.setDoOutput(true);
            zza.setRequestProperty(cc.f15718K, "application/x-protobuffer");
            return new zzew(zza);
        } catch (zzbd e4) {
            throw e4;
        } catch (Exception e5) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e5.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = new zzfm();
    }
}
