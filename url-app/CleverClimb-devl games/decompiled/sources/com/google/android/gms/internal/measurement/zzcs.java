package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzcs {
    private final String name;
    private final long zzabe;
    private final /* synthetic */ zzcq zzabf;

    private zzcs(zzcq zzcqVar, String str, long j) {
        this.zzabf = zzcqVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.name = str;
        this.zzabe = j;
    }

    private final void zzfg() {
        SharedPreferences sharedPreferences;
        long currentTimeMillis = this.zzabf.zzbt().currentTimeMillis();
        sharedPreferences = this.zzabf.zzaba;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(zzfk());
        edit.remove(zzfl());
        edit.putLong(zzfj(), currentTimeMillis);
        edit.commit();
    }

    private final long zzfi() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzabf.zzaba;
        return sharedPreferences.getLong(zzfj(), 0L);
    }

    private final String zzfj() {
        return String.valueOf(this.name).concat(":start");
    }

    private final String zzfk() {
        return String.valueOf(this.name).concat(":count");
    }

    @VisibleForTesting
    private final String zzfl() {
        return String.valueOf(this.name).concat(":value");
    }

    public final void zzad(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        if (zzfi() == 0) {
            zzfg();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            sharedPreferences = this.zzabf.zzaba;
            long j = sharedPreferences.getLong(zzfk(), 0L);
            if (j <= 0) {
                sharedPreferences3 = this.zzabf.zzaba;
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.putString(zzfl(), str);
                edit.putLong(zzfk(), 1L);
                edit.apply();
                return;
            }
            long j2 = j + 1;
            boolean z = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2;
            sharedPreferences2 = this.zzabf.zzaba;
            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
            if (z) {
                edit2.putString(zzfl(), str);
            }
            edit2.putLong(zzfk(), j2);
            edit2.apply();
        }
    }

    public final Pair<String, Long> zzfh() {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        long zzfi = zzfi();
        long abs = zzfi == 0 ? 0L : Math.abs(zzfi - this.zzabf.zzbt().currentTimeMillis());
        if (abs < this.zzabe) {
            return null;
        }
        if (abs > (this.zzabe << 1)) {
            zzfg();
            return null;
        }
        sharedPreferences = this.zzabf.zzaba;
        String string = sharedPreferences.getString(zzfl(), null);
        sharedPreferences2 = this.zzabf.zzaba;
        long j = sharedPreferences2.getLong(zzfk(), 0L);
        zzfg();
        if (string == null || j <= 0) {
            return null;
        }
        return new Pair<>(string, Long.valueOf(j));
    }
}
