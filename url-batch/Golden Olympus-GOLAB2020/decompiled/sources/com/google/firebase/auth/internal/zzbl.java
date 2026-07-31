package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.da;

/* loaded from: classes.dex */
public final class zzbl {
    private static long zza = 3600000;
    private static final com.google.android.gms.internal.p002firebaseauthapi.zzaj<String> zzb = com.google.android.gms.internal.p002firebaseauthapi.zzaj.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "statusMessage", da.a.f15878d);
    private static final zzbl zzc = new zzbl();
    private Task<AuthResult> zzd;
    private Task<String> zze;
    private long zzf = 0;

    private zzbl() {
    }

    public static zzbl zzc() {
        return zzc;
    }

    public final Task<AuthResult> zza() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zzf < zza) {
            return this.zzd;
        }
        return null;
    }

    public final Task<String> zzb() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zzf < zza) {
            return this.zze;
        }
        return null;
    }

    private static void zza(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        com.google.android.gms.internal.p002firebaseauthapi.zzaj<String> zzajVar = zzb;
        int size = zzajVar.size();
        int i4 = 0;
        while (i4 < size) {
            String str = zzajVar.get(i4);
            i4++;
            edit.remove(str);
        }
        edit.commit();
    }

    public final void zza(Context context) {
        Preconditions.checkNotNull(context);
        zza(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.zzd = null;
        this.zzf = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(firebaseAuth);
        char c4 = 0;
        SharedPreferences sharedPreferences = firebaseAuth.getApp().getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.getApp().getName().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (sharedPreferences.contains("verifyAssertionRequest")) {
                zzaic zzaicVar = (zzaic) SafeParcelableSerializer.deserializeFromString(sharedPreferences.getString("verifyAssertionRequest", ""), zzaic.CREATOR);
                String string = sharedPreferences.getString("operation", "");
                String string2 = sharedPreferences.getString("tenantId", null);
                String string3 = sharedPreferences.getString("firebaseUserUid", "");
                this.zzf = sharedPreferences.getLong(da.a.f15878d, 0L);
                if (string2 != null) {
                    firebaseAuth.setTenantId(string2);
                    zzaicVar.zzb(string2);
                }
                string.getClass();
                switch (string.hashCode()) {
                    case -98509410:
                        break;
                    case 175006864:
                        if (string.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1450464913:
                        if (string.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                        if (firebaseAuth.getCurrentUser().getUid().equals(string3)) {
                            this.zzd = firebaseAuth.zzc(firebaseAuth.getCurrentUser(), com.google.firebase.auth.zzc.zza(zzaicVar));
                            break;
                        } else {
                            this.zzd = null;
                            break;
                        }
                    case 1:
                        if (firebaseAuth.getCurrentUser().getUid().equals(string3)) {
                            this.zzd = firebaseAuth.zza(firebaseAuth.getCurrentUser(), com.google.firebase.auth.zzc.zza(zzaicVar));
                            break;
                        } else {
                            this.zzd = null;
                            break;
                        }
                    case 2:
                        this.zzd = firebaseAuth.signInWithCredential(com.google.firebase.auth.zzc.zza(zzaicVar));
                        break;
                    default:
                        this.zzd = null;
                        break;
                }
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("recaptchaToken")) {
                String string4 = sharedPreferences.getString("recaptchaToken", "");
                String string5 = sharedPreferences.getString("operation", "");
                this.zzf = sharedPreferences.getLong(da.a.f15878d, 0L);
                string5.getClass();
                if (!string5.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    this.zze = null;
                } else {
                    this.zze = Tasks.forResult(string4);
                }
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains(HiAnalyticsConstant.HaKey.BI_KEY_RESULT)) {
                Status status = new Status(sharedPreferences.getInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, 17062), sharedPreferences.getString("statusMessage", ""));
                this.zzf = sharedPreferences.getLong(da.a.f15878d, 0L);
                zza(sharedPreferences);
                this.zzd = Tasks.forException(zzadr.zza(status));
            }
        }
    }

    public static void zza(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, status.getStatusCode());
        edit.putString("statusMessage", status.getStatusMessage());
        edit.putLong(da.a.f15878d, DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        edit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        Preconditions.checkNotNull(firebaseUser);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        edit.putString("firebaseUserUid", firebaseUser.getUid());
        edit.commit();
    }

    public static void zza(Context context, zzaic zzaicVar, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", SafeParcelableSerializer.serializeToString(zzaicVar));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong(da.a.f15878d, DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    public static void zza(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong(da.a.f15878d, DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }
}
