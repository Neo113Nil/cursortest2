package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.analytics.zzk;

/* loaded from: classes2.dex */
public final class zzcq extends zzar {
    private SharedPreferences zzaba;
    private long zzabb;
    private long zzabc;
    private final zzcs zzabd;

    protected zzcq(zzat zzatVar) {
        super(zzatVar);
        this.zzabc = -1L;
        this.zzabd = new zzcs(this, "monitoring", zzcc.zzzu.get().longValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        this.zzaba = getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final void zzac(String str) {
        zzk.zzab();
        zzch();
        SharedPreferences.Editor edit = this.zzaba.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (edit.commit()) {
            return;
        }
        zzt("Failed to commit campaign data");
    }

    public final long zzfa() {
        zzk.zzab();
        zzch();
        if (this.zzabb == 0) {
            long j = this.zzaba.getLong("first_run", 0L);
            if (j == 0) {
                j = zzbt().currentTimeMillis();
                SharedPreferences.Editor edit = this.zzaba.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    zzt("Failed to commit first run time");
                }
            }
            this.zzabb = j;
        }
        return this.zzabb;
    }

    public final zzcz zzfb() {
        return new zzcz(zzbt(), zzfa());
    }

    public final long zzfc() {
        zzk.zzab();
        zzch();
        if (this.zzabc == -1) {
            this.zzabc = this.zzaba.getLong("last_dispatch", 0L);
        }
        return this.zzabc;
    }

    public final void zzfd() {
        zzk.zzab();
        zzch();
        long currentTimeMillis = zzbt().currentTimeMillis();
        SharedPreferences.Editor edit = this.zzaba.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.zzabc = currentTimeMillis;
    }

    public final String zzfe() {
        zzk.zzab();
        zzch();
        String string = this.zzaba.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final zzcs zzff() {
        return this.zzabd;
    }
}
