package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzoy;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
final class zzii implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzij zza;

    zzii(zzij zzijVar) {
        this.zza = zzijVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:16|(9:23|24|(1:26)(1:39)|27|28|29|30|31|32)|40|24|(0)(0)|27|28|29|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        r2.zza.zzt.zzaA().zzd().zzb("Throwable caught in onActivityCreated", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        r0 = r2.zza.zzt;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzii zziiVar;
        zzge zzgeVar;
        Intent intent;
        Uri uri;
        String stringExtra;
        String str;
        try {
            try {
                this.zza.zzt.zzaA().zzj().zza("onActivityCreated");
                intent = activity.getIntent();
            } catch (Throwable th) {
                th = th;
                zziiVar.zza.zzt.zzs().zzr(activity, bundle);
                throw th;
            }
        } catch (RuntimeException e) {
            e = e;
            zziiVar = this;
        } catch (Throwable th2) {
            th = th2;
            zziiVar = this;
            zziiVar.zza.zzt.zzs().zzr(activity, bundle);
            throw th;
        }
        if (intent == null) {
            zzgeVar = this.zza.zzt;
        } else {
            zzoy.zzc();
            Uri uri2 = null;
            if (this.zza.zzt.zzf().zzs(null, zzeh.zzaF)) {
                Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        this.zza.zzt.zzv();
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                            String str2 = str;
                            String queryParameter = uri.getQueryParameter("referrer");
                            zziiVar = this;
                            this.zza.zzt.zzaB().zzp(new zzih(zziiVar, bundle != null, uri, str2, queryParameter));
                            zzgeVar = zziiVar.zza.zzt;
                        }
                        str = "gs";
                        String str22 = str;
                        String queryParameter2 = uri.getQueryParameter("referrer");
                        zziiVar = this;
                        this.zza.zzt.zzaB().zzp(new zzih(zziiVar, bundle != null, uri, str22, queryParameter2));
                        zzgeVar = zziiVar.zza.zzt;
                    }
                    zzgeVar = this.zza.zzt;
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        uri2 = Uri.parse(string);
                    }
                }
            } else {
                uri2 = intent.getData();
            }
            uri = uri2;
            if (uri != null) {
                this.zza.zzt.zzv();
                stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                    str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                    String str222 = str;
                    String queryParameter22 = uri.getQueryParameter("referrer");
                    zziiVar = this;
                    this.zza.zzt.zzaB().zzp(new zzih(zziiVar, bundle != null, uri, str222, queryParameter22));
                    zzgeVar = zziiVar.zza.zzt;
                }
                str = "gs";
                String str2222 = str;
                String queryParameter222 = uri.getQueryParameter("referrer");
                zziiVar = this;
                this.zza.zzt.zzaB().zzp(new zzih(zziiVar, bundle != null, uri, str2222, queryParameter222));
                zzgeVar = zziiVar.zza.zzt;
            }
            zzgeVar = this.zza.zzt;
        }
        zzgeVar.zzs().zzr(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzt.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzt.zzs().zzt(activity);
        zzko zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaB().zzp(new zzkh(zzu, zzu.zzt.zzax().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzko zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaB().zzp(new zzkg(zzu, zzu.zzt.zzax().elapsedRealtime()));
        this.zza.zzt.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzt.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
