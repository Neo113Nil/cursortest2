package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzlv implements Application.ActivityLifecycleCallbacks, zzlt {
    final /* synthetic */ zzlw zza;

    zzlv(zzlw zzlwVar) {
        this.zza = zzlwVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(com.google.android.gms.internal.measurement.zzdj.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzb(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzc(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzd(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zze(com.google.android.gms.internal.measurement.zzdj.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:13|(12:20|21|22|(1:24)(1:39)|25|26|27|28|29|30|31|32)|40|21|22|(0)(0)|25|26|27|28|29|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        r2.zza.zzu.zzaW().zze().zzb("Throwable caught in onActivityCreated", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // com.google.android.gms.measurement.internal.zzlt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(com.google.android.gms.internal.measurement.zzdj zzdjVar, Bundle bundle) {
        zzlv zzlvVar;
        zzio zzioVar;
        zzlw zzlwVar;
        zzio zzioVar2;
        Intent intent;
        Uri uri;
        String stringExtra;
        String str;
        try {
            try {
                zzlwVar = this.zza;
                zzioVar2 = zzlwVar.zzu;
                zzioVar2.zzaW().zzj().zza("onActivityCreated");
                intent = zzdjVar.zzc;
            } catch (Throwable th) {
                th = th;
                zzlvVar.zza.zzu.zzt().zzs(zzdjVar, bundle);
                throw th;
            }
        } catch (RuntimeException e4) {
            e = e4;
            zzlvVar = this;
        } catch (Throwable th2) {
            th = th2;
            zzlvVar = this;
            zzlvVar.zza.zzu.zzt().zzs(zzdjVar, bundle);
            throw th;
        }
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                if (!data.isHierarchical()) {
                }
                uri = data;
                if (uri != null && uri.isHierarchical()) {
                    zzioVar2.zzw();
                    stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                        str = "auto";
                        String str2 = str;
                        String queryParameter = uri.getQueryParameter("referrer");
                        zzlvVar = this;
                        zzioVar2.zzaX().zzq(new zzlu(zzlvVar, bundle != null, uri, str2, queryParameter));
                        zzioVar = zzlvVar.zza.zzu;
                        zzioVar.zzt().zzs(zzdjVar, bundle);
                    }
                    str = "gs";
                    String str22 = str;
                    String queryParameter2 = uri.getQueryParameter("referrer");
                    zzlvVar = this;
                    zzioVar2.zzaX().zzq(new zzlu(zzlvVar, bundle != null, uri, str22, queryParameter2));
                    zzioVar = zzlvVar.zza.zzu;
                    zzioVar.zzt().zzs(zzdjVar, bundle);
                }
            }
            Bundle extras = intent.getExtras();
            uri = null;
            if (extras != null) {
                String string = extras.getString("com.android.vending.referral_url");
                if (!TextUtils.isEmpty(string)) {
                    data = Uri.parse(string);
                    uri = data;
                }
            }
            if (uri != null) {
                zzioVar2.zzw();
                stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                    str = "auto";
                    String str222 = str;
                    String queryParameter22 = uri.getQueryParameter("referrer");
                    zzlvVar = this;
                    zzioVar2.zzaX().zzq(new zzlu(zzlvVar, bundle != null, uri, str222, queryParameter22));
                    zzioVar = zzlvVar.zza.zzu;
                    zzioVar.zzt().zzs(zzdjVar, bundle);
                }
                str = "gs";
                String str2222 = str;
                String queryParameter222 = uri.getQueryParameter("referrer");
                zzlvVar = this;
                zzioVar2.zzaX().zzq(new zzlu(zzlvVar, bundle != null, uri, str2222, queryParameter222));
                zzioVar = zzlvVar.zza.zzu;
                zzioVar.zzt().zzs(zzdjVar, bundle);
            }
        }
        zzioVar = zzlwVar.zzu;
        zzioVar.zzt().zzs(zzdjVar, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzb(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        this.zza.zzu.zzt().zzt(zzdjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzc(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        zzio zzioVar = this.zza.zzu;
        zzioVar.zzt().zzu(zzdjVar);
        zzop zzv = zzioVar.zzv();
        zzio zzioVar2 = zzv.zzu;
        zzioVar2.zzaX().zzq(new zzoi(zzv, zzioVar2.zzaU().elapsedRealtime()));
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzd(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        zzio zzioVar = this.zza.zzu;
        zzop zzv = zzioVar.zzv();
        zzio zzioVar2 = zzv.zzu;
        zzioVar2.zzaX().zzq(new zzoh(zzv, zzioVar2.zzaU().elapsedRealtime()));
        zzioVar.zzt().zzv(zzdjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zze(com.google.android.gms.internal.measurement.zzdj zzdjVar, Bundle bundle) {
        this.zza.zzu.zzt().zzw(zzdjVar, bundle);
    }
}
