package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.internal.UMInternalManager;
import com.umeng.commonsdk.internal.systemlocation.UMSysLocationCache;
import com.umeng.commonsdk.internal.utils.ApplicationLayerUtil;
import com.umeng.commonsdk.internal.utils.BatteryUtils;
import com.umeng.commonsdk.internal.utils.SystemLayerUtil;
import com.umeng.commonsdk.internal.utils.UMProbe;
import com.umeng.commonsdk.statistics.common.d;

/* compiled from: UMConfigureImpl.java */
/* loaded from: classes2.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f8965a;

    b(Context context) {
        this.f8965a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String a2 = com.umeng.commonsdk.framework.b.a(this.f8965a);
            String packageName = this.f8965a.getPackageName();
            if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(packageName) || !a2.equals(packageName)) {
                return;
            }
            try {
                com.umeng.commonsdk.proguard.a.a(this.f8965a);
            } catch (Exception e) {
                d.c("internal", "e is " + e);
            }
            try {
                UMSysLocationCache.saveLocationJson(this.f8965a);
            } catch (Throwable th) {
                d.c("internal", "e is " + th);
            }
            try {
                if (!BatteryUtils.getInstance(this.f8965a).isUsed()) {
                    BatteryUtils.getInstance(this.f8965a).registerListener();
                }
            } catch (Throwable th2) {
                d.c("internal", "e is " + th2);
            }
            try {
                UMProbe.detect(this.f8965a);
            } catch (Exception e2) {
                d.c("internal", "e is " + e2);
            }
            try {
                ApplicationLayerUtil.startBluethInfo(this.f8965a);
            } catch (Exception e3) {
                d.c("internal", "e is " + e3);
            }
            try {
                ApplicationLayerUtil.wifiChange(this.f8965a);
            } catch (Exception e4) {
                d.c("internal", "e is " + e4);
            }
            try {
                SystemLayerUtil.registerSensor(this.f8965a);
            } catch (Exception e5) {
                d.c("internal", "e is " + e5);
            }
            try {
                UMInternalManager.sendInternalEnvelopeByStateful(this.f8965a);
            } catch (Exception e6) {
                d.c("internal", "e is " + e6);
            }
            try {
                UMInternalManager.sendInternalEnvelope(this.f8965a);
            } catch (Throwable unused) {
            }
        } catch (Throwable th3) {
            com.umeng.commonsdk.proguard.b.a(this.f8965a, th3);
        }
    }
}
