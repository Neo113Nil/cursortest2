package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbbu implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbby.zza(new zzfvk() { // from class: com.google.android.gms.internal.ads.zzbbr
                @Override // com.google.android.gms.internal.ads.zzfvk
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zza(final zzbbn zzbbnVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbbnVar.zzm();
            }
        }
        if (zzbbnVar.zze() != 2) {
            return (zzbbnVar.zze() == 1 && this.zzh.has(zzbbnVar.zzn())) ? zzbbnVar.zza(this.zzh) : zzbby.zza(new zzfvk() { // from class: com.google.android.gms.internal.ads.zzbbs
                @Override // com.google.android.gms.internal.ads.zzfvk
                public final Object zza() {
                    return zzbbu.this.zzc(zzbbnVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbbnVar.zzm() : zzbbnVar.zzb(bundle);
    }

    final /* synthetic */ Object zzc(zzbbn zzbbnVar) {
        return zzbbnVar.zzc(this.zze);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0117, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbby.zza(new com.google.android.gms.internal.ads.zzbbq(r3))).optBoolean("local_flags_enabled") != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f A[Catch: all -> 0x015f, DONT_GENERATE, TRY_ENTER, TryCatch #3 {, blocks: (B:8:0x0008, B:10:0x000c, B:12:0x000e, B:14:0x0013, B:15:0x0015, B:17:0x0027, B:18:0x002b, B:20:0x002d, B:39:0x0099, B:40:0x00a0, B:49:0x00d1, B:50:0x00d8, B:57:0x011f, B:58:0x0126, B:66:0x014d, B:67:0x0154, B:82:0x0157, B:83:0x015e, B:23:0x0042, B:26:0x004c, B:29:0x0055, B:31:0x0060, B:32:0x0068, B:34:0x006e, B:36:0x007e, B:38:0x0095, B:42:0x00a2, B:44:0x00a6, B:46:0x00b6, B:48:0x00cd, B:52:0x00da, B:55:0x0119, B:60:0x0128, B:62:0x013f, B:64:0x0143, B:65:0x0146, B:69:0x00eb, B:71:0x00f9, B:73:0x0101, B:75:0x010c), top: B:7:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128 A[Catch: all -> 0x0156, TRY_ENTER, TryCatch #0 {all -> 0x0156, blocks: (B:23:0x0042, B:26:0x004c, B:29:0x0055, B:31:0x0060, B:32:0x0068, B:34:0x006e, B:36:0x007e, B:38:0x0095, B:42:0x00a2, B:44:0x00a6, B:46:0x00b6, B:48:0x00cd, B:52:0x00da, B:55:0x0119, B:60:0x0128, B:62:0x013f, B:64:0x0143, B:65:0x0146, B:69:0x00eb, B:71:0x00f9, B:73:0x0101, B:75:0x010c), top: B:22:0x0042, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzg = context;
            try {
                this.zzf = Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context context2 = this.zzg;
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context2);
                if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                    context2 = remoteContext;
                }
                if (context2 != null) {
                    com.google.android.gms.ads.internal.client.zzba.zzb();
                    sharedPreferences = zzbbp.zza(context2);
                } else {
                    sharedPreferences = null;
                }
                if (sharedPreferences != null) {
                    zzbej.zzc(new zzbbt(this, sharedPreferences));
                }
                if (!this.zzi && ((Long) zzbdk.zzd.zze()).longValue() > 0 && zzbbg.zza(this.zzg) >= ((Long) zzbdk.zzd.zze()).longValue()) {
                    this.zzj = true;
                    this.zzd = true;
                    return;
                }
                if (!this.zzi && ((Long) zzbdk.zzf.zze()).longValue() > 0 && zzbbg.zzb(this.zzg) >= ((Long) zzbdk.zzf.zze()).longValue()) {
                    this.zzj = true;
                    this.zzd = true;
                    return;
                }
                Context context3 = this.zzg;
                if (!((Boolean) zzbds.zzh.zze()).booleanValue()) {
                    if (((Boolean) zzbds.zzi.zze()).booleanValue() && (r3 = context3.getSharedPreferences("admob", 0)) != null) {
                    }
                    if (context2 != null) {
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzba.zzb();
                    this.zze = zzbbp.zza(context2);
                    if (!((Boolean) zzbds.zza.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzg(this.zze);
                    this.zzd = true;
                    return;
                }
                context2 = this.zzg;
                if (context2 != null) {
                }
            } finally {
                this.zza = false;
                this.zzc.open();
            }
        }
    }

    public final boolean zze() {
        return this.zzj;
    }

    final boolean zzf() {
        return this.zzi;
    }

    public final Object zzb(zzbbn zzbbnVar) {
        return (this.zzd || this.zza) ? zza(zzbbnVar) : zzbbnVar.zzm();
    }
}
