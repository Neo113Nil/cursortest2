package com.tapjoy;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mopub.common.GpsHelper;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class TapjoyAdIdClient {

    /* renamed from: a, reason: collision with root package name */
    private Context f7741a;

    /* renamed from: b, reason: collision with root package name */
    private String f7742b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7743c;

    public TapjoyAdIdClient(Context context) {
        this.f7741a = context;
    }

    public boolean setupAdIdInfo() {
        try {
            this.f7742b = AdvertisingIdClient.getAdvertisingIdInfo(this.f7741a).getId();
            this.f7743c = !r1.isLimitAdTrackingEnabled();
            return true;
        } catch (Error unused) {
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    public boolean setupAdIdInfoReflection() {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Method method = cls.getMethod("getAdvertisingIdInfo", Context.class);
            TapjoyLog.d("TapjoyAdIdClient", "Found method: " + method);
            Object invoke = method.invoke(cls, this.f7741a);
            Method method2 = invoke.getClass().getMethod(GpsHelper.IS_LIMIT_AD_TRACKING_ENABLED_KEY, new Class[0]);
            Method method3 = invoke.getClass().getMethod("getId", new Class[0]);
            this.f7743c = !((Boolean) method2.invoke(invoke, new Object[0])).booleanValue();
            this.f7742b = (String) method3.invoke(invoke, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public String getAdvertisingId() {
        return this.f7742b;
    }

    public boolean isAdTrackingEnabled() {
        return this.f7743c;
    }
}
