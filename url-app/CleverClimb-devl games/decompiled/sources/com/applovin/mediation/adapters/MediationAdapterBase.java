package com.applovin.mediation.adapters;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.j;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public abstract class MediationAdapterBase implements MaxAdapter {
    protected static final String KEY_MUTED = "muted";
    private final j mSdk;
    private final String mTag = getClass().getSimpleName();

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mSdk = l.a(appLovinSdk);
    }

    protected static String mediationTag() {
        return "AppLovinSdk_9.1.3";
    }

    protected void checkActivities(Context context, Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        for (Class<?> cls : clsArr) {
            try {
                if (context.getPackageManager().getActivityInfo(new ComponentName(context, cls), 128) == null) {
                    throw new PackageManager.NameNotFoundException("null_activity_info");
                }
                log("Found defined activity: " + cls.getName());
            } catch (PackageManager.NameNotFoundException e) {
                log("No activity found for: " + cls);
                throw new IllegalStateException("Activity " + cls.getName() + " not defined", e);
            }
        }
    }

    protected void checkExistence(Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        for (Class<?> cls : clsArr) {
            log("Found: " + cls.getName());
        }
    }

    protected j getSdk() {
        return this.mSdk;
    }

    protected void log(String str) {
        Log.i(this.mTag, str);
    }

    protected void log(String str, Throwable th) {
        Log.i(this.mTag, str, th);
    }
}
