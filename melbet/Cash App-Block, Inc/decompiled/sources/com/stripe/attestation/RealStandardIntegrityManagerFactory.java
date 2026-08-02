package com.stripe.attestation;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.mlkit.vision.face.internal.zzm;
import kotlin.Result;
import kotlin.text.StringsKt;
import papa.InputEventTrigger;

/* loaded from: classes8.dex */
public final class RealStandardIntegrityManagerFactory {
    public final Application appContext;

    public RealStandardIntegrityManagerFactory(Application application, int i) {
        switch (i) {
            case 1:
                application.getClass();
                this.appContext = application;
                break;
            default:
                this.appContext = application;
                break;
        }
    }

    public Intent createBrowserIntentForUrl(Uri uri) {
        ActivityInfo activityInfo;
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        Application application = this.appContext;
        ResolveInfo resolveActivity = application.getPackageManager().resolveActivity(intent, 65536);
        String str = (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) ? null : activityInfo.packageName;
        if (str != null && StringsKt.contains((CharSequence) str, (CharSequence) "org.mozilla", false)) {
            return intent;
        }
        zzm zzmVar = new zzm();
        zzmVar.setShareState(2);
        Intent intent2 = (Intent) zzmVar.build().val$videoEncoderSession;
        intent2.setData(uri);
        String packageName = InputEventTrigger.Companion.getPackageName(application);
        if (packageName != null) {
            intent2.setPackage(packageName);
        }
        return intent2;
    }

    public String getPackageToHandleUri(Uri uri) {
        Object failure;
        ActivityInfo activityInfo;
        uri.getClass();
        try {
            Result.Companion companion = Result.Companion;
            ResolveInfo resolveActivity = this.appContext.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", uri), 65536);
            failure = (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) ? null : activityInfo.packageName;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        return (String) (failure instanceof Result.Failure ? null : failure);
    }
}
