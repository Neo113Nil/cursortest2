package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbhc implements SharedPreferences.OnSharedPreferenceChangeListener {
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
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbgz
                    @Override // com.google.android.gms.internal.ads.zzgru
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x011a, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbhg.zza(new com.google.android.gms.internal.ads.zzbha(r3))).optBoolean("local_flags_enabled") != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120 A[Catch: all -> 0x017b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:6:0x0009, B:8:0x000d, B:11:0x000f, B:13:0x0014, B:14:0x0016, B:16:0x0028, B:17:0x002c, B:19:0x002e, B:37:0x009e, B:38:0x00a5, B:47:0x00d5, B:53:0x0120, B:65:0x0169, B:66:0x0170, B:88:0x0173, B:89:0x017a, B:22:0x0043, B:27:0x005e, B:29:0x0067, B:30:0x006f, B:32:0x0075, B:34:0x0085, B:36:0x009a, B:40:0x00a8, B:42:0x00ac, B:44:0x00bc, B:46:0x00d1, B:48:0x00dd, B:51:0x011c, B:54:0x0129, B:56:0x0136, B:58:0x0144, B:59:0x014d, B:61:0x015b, B:63:0x015f, B:64:0x0162, B:68:0x00ee, B:70:0x00fc, B:72:0x0104, B:74:0x010f, B:79:0x004a, B:81:0x0054), top: B:5:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129 A[Catch: all -> 0x0172, TRY_ENTER, TryCatch #0 {all -> 0x0172, blocks: (B:22:0x0043, B:27:0x005e, B:29:0x0067, B:30:0x006f, B:32:0x0075, B:34:0x0085, B:36:0x009a, B:40:0x00a8, B:42:0x00ac, B:44:0x00bc, B:46:0x00d1, B:48:0x00dd, B:51:0x011c, B:54:0x0129, B:56:0x0136, B:58:0x0144, B:59:0x014d, B:61:0x015b, B:63:0x015f, B:64:0x0162, B:68:0x00ee, B:70:0x00fc, B:72:0x0104, B:74:0x010f, B:79:0x004a, B:81:0x0054), top: B:21:0x0043, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Context context) {
        Context context2;
        SharedPreferences sharedPreferences;
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
                Context context3 = this.zzg;
                SharedPreferences sharedPreferences2 = null;
                if (context3 == null) {
                    context3 = null;
                } else {
                    try {
                        context2 = context3.createPackageContext("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        context2 = null;
                    }
                    if (context2 != null || (context2 = context3.getApplicationContext()) != null) {
                        context3 = context2;
                    }
                }
                if (context3 != null) {
                    com.google.android.gms.ads.internal.client.zzbd.zza();
                    sharedPreferences2 = zzbgx.zzb(context3);
                }
                if (sharedPreferences2 != null) {
                    zzbjw.zzc(new zzbgy(this, sharedPreferences2));
                }
                if (!this.zzi) {
                    zzbio zzbioVar = zzbiw.zzd;
                    if (((Long) zzbioVar.zze()).longValue() > 0 && zzbgp.zzd(this.zzg) >= ((Long) zzbioVar.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        return;
                    }
                }
                if (!this.zzi) {
                    zzbio zzbioVar2 = zzbiw.zzf;
                    if (((Long) zzbioVar2.zze()).longValue() > 0 && zzbgp.zzc(this.zzg) >= ((Long) zzbioVar2.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                }
                Context context4 = this.zzg;
                if (!((Boolean) zzbje.zzk.zze()).booleanValue()) {
                    if (((Boolean) zzbje.zzl.zze()).booleanValue() && (r3 = context4.getSharedPreferences("admob", 0)) != null) {
                    }
                    if (context3 != null) {
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzbd.zza();
                    this.zze = zzbgx.zzb(context3);
                    if (!this.zzi && ((Boolean) zzbje.zze.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                    }
                    if (!((Boolean) zzbje.zzc.zze()).booleanValue() && (sharedPreferences = this.zze) != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzg(this.zze);
                    this.zzd = true;
                    return;
                }
                context3 = this.zzg;
                if (context3 != null) {
                }
            } finally {
                this.zza = false;
                this.zzc.open();
            }
        }
    }

    final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbgv zzbgvVar) {
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
                return zzbgvVar.zzf();
            }
        }
        if (zzbgvVar.zzm() != 2) {
            return (zzbgvVar.zzm() == 1 && this.zzh.has(zzbgvVar.zze())) ? zzbgvVar.zzc(this.zzh) : zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbhb
                @Override // com.google.android.gms.internal.ads.zzgru
                public final /* synthetic */ Object zza() {
                    return zzbhc.this.zzf(zzbgvVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbgvVar.zzf() : zzbgvVar.zza(bundle);
    }

    final /* synthetic */ Object zzf(zzbgv zzbgvVar) {
        return zzbgvVar.zzd(this.zze);
    }

    public final Object zze(zzbgv zzbgvVar) {
        return (this.zzd || this.zza) ? zzd(zzbgvVar) : zzbgvVar.zzf();
    }
}
