package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ag extends y1 {

    /* renamed from: n0, reason: collision with root package name */
    public final qe f6671n0;

    /* renamed from: o0, reason: collision with root package name */
    public final String f6672o0;

    public ag(Context context) {
        super(1);
        ServiceInfo serviceInfo;
        String str;
        Signature[] signatureArr;
        if (je.f7156a == null) {
            try {
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                    String str2 = serviceInfo.packageName;
                    String str3 = serviceInfo.name;
                    if ("com.android.vending".equals(str2) && str3 != null && context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                        Intent intent2 = new Intent(intent);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        ie ieVar = new ie(context.getPackageName(), countDownLatch);
                        if (context.bindService(intent2, ieVar, 1)) {
                            try {
                                countDownLatch.await(1L, TimeUnit.SECONDS);
                            } catch (InterruptedException unused) {
                            }
                            int i4 = p0.f7428a;
                            context.unbindService(ieVar);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        this.f6671n0 = je.f7156a;
        int i5 = p0.f7428a;
        try {
            signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        } catch (Throwable unused3) {
        }
        if (signatureArr != null && signatureArr.length > 0) {
            if (signatureArr.length == 1) {
                str = signatureArr[0].toCharsString();
            } else {
                Arrays.sort(signatureArr, new o0());
                StringBuilder sb = new StringBuilder();
                for (int i6 = 0; i6 < signatureArr.length; i6++) {
                    sb.append(signatureArr[i6].toCharsString());
                    if (i6 < signatureArr.length - 1) {
                        sb.append(';');
                    }
                }
                str = sb.toString();
            }
            this.f6672o0 = str;
        }
        str = null;
        this.f6672o0 = str;
    }

    @Override // com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        seVar.a("placement", "INAPP_DOWNLOAD", true, true);
        qe qeVar = this.f6671n0;
        if (qeVar != null) {
            seVar.a("install_referrer", qeVar.f7509a.getString("install_referrer"), true, true);
            seVar.a("referrer_click_timestamp_seconds", Long.valueOf(this.f6671n0.f7509a.getLong("referrer_click_timestamp_seconds")), true, true);
            seVar.a("install_begin_timestamp_seconds", Long.valueOf(this.f6671n0.f7509a.getLong("install_begin_timestamp_seconds")), true, true);
        }
        seVar.a("apkSig", this.f6672o0, true, true);
        long j4 = com.startapp.sdk.adsbase.g.f6420c;
        if (j4 != 0) {
            seVar.a("firstInstalledAppTS", Long.valueOf(j4), false, true);
        }
    }
}
