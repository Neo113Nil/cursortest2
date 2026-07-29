package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.mopub.common.AdType;
import java.util.HashMap;
import java.util.UUID;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzae extends zzi<zzae> {
    private String zzug;
    private int zzuh;
    private int zzui;
    private String zzuj;
    private String zzuk;
    private boolean zzul;
    private boolean zzum;

    public zzae() {
        this(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzae(boolean z) {
        this(false, r0);
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
    }

    @VisibleForTesting
    private zzae(boolean z, int i) {
        Preconditions.checkNotZero(i);
        this.zzuh = i;
        this.zzum = false;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", this.zzug);
        hashMap.put(AdType.INTERSTITIAL, Boolean.valueOf(this.zzul));
        hashMap.put("automatic", Boolean.valueOf(this.zzum));
        hashMap.put("screenId", Integer.valueOf(this.zzuh));
        hashMap.put("referrerScreenId", Integer.valueOf(this.zzui));
        hashMap.put("referrerScreenName", this.zzuj);
        hashMap.put("referrerUri", this.zzuk);
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzae zzaeVar) {
        zzae zzaeVar2 = zzaeVar;
        if (!TextUtils.isEmpty(this.zzug)) {
            zzaeVar2.zzug = this.zzug;
        }
        if (this.zzuh != 0) {
            zzaeVar2.zzuh = this.zzuh;
        }
        if (this.zzui != 0) {
            zzaeVar2.zzui = this.zzui;
        }
        if (!TextUtils.isEmpty(this.zzuj)) {
            zzaeVar2.zzuj = this.zzuj;
        }
        if (!TextUtils.isEmpty(this.zzuk)) {
            String str = this.zzuk;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            zzaeVar2.zzuk = str;
        }
        if (this.zzul) {
            zzaeVar2.zzul = this.zzul;
        }
        if (this.zzum) {
            zzaeVar2.zzum = this.zzum;
        }
    }

    public final String zzbg() {
        return this.zzug;
    }

    public final int zzbh() {
        return this.zzuh;
    }

    public final String zzbi() {
        return this.zzuk;
    }
}
