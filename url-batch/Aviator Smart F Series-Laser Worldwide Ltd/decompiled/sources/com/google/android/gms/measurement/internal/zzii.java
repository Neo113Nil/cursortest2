package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzoy;

@VisibleForTesting
@TargetApi(14)
@MainThread
/* loaded from: classes3.dex */
final class zzii implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzij zza;

    zzii(zzij zzijVar) {
        this.zza = zzijVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzge zzgeVar;
        Uri uri;
        String stringExtra;
        String str;
        try {
            try {
                this.zza.zzt.zzaA().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
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
                                    str = TtmlNode.TEXT_EMPHASIS_AUTO;
                                    this.zza.zzt.zzaB().zzp(new zzih(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                                    zzgeVar = this.zza.zzt;
                                }
                                str = "gs";
                                this.zza.zzt.zzaB().zzp(new zzih(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                                zzgeVar = this.zza.zzt;
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
                            str = TtmlNode.TEXT_EMPHASIS_AUTO;
                            this.zza.zzt.zzaB().zzp(new zzih(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                            zzgeVar = this.zza.zzt;
                        }
                        str = "gs";
                        this.zza.zzt.zzaB().zzp(new zzih(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                        zzgeVar = this.zza.zzt;
                    }
                    zzgeVar = this.zza.zzt;
                }
            } catch (RuntimeException e8) {
                this.zza.zzt.zzaA().zzd().zzb("Throwable caught in onActivityCreated", e8);
                zzgeVar = this.zza.zzt;
            }
            zzgeVar.zzs().zzr(activity, bundle);
        } catch (Throwable th) {
            this.zza.zzt.zzs().zzr(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzt.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.zza.zzt.zzs().zzt(activity);
        zzko zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaB().zzp(new zzkh(zzu, zzu.zzt.zzax().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
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
