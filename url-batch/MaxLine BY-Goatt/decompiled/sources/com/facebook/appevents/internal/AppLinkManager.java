package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.y91;
import defpackage.ya1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppLinkManager {
    public static final String APPLINK_DATA_KEY = "al_applink_data";
    public static final String APPLINK_INFO = "com.facebook.sdk.APPLINK_INFO";
    public static final String CAMPAIGN_IDS_KEY = "campaign_ids";
    public static final String CLICK_ID_KEY = "click_id";
    public static final Companion Companion = new Companion(null);
    private static volatile AppLinkManager instance;
    private final y91 preferences$delegate;

    private AppLinkManager() {
        this.preferences$delegate = ya1.b(AppLinkManager$preferences$2.INSTANCE);
    }

    public static final /* synthetic */ AppLinkManager access$getInstance$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppLinkManager.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppLinkManager.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(AppLinkManager appLinkManager) {
        if (CrashShieldHandler.isObjectCrashing(AppLinkManager.class)) {
            return;
        }
        try {
            instance = appLinkManager;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppLinkManager.class);
        }
    }

    private final SharedPreferences getPreferences() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Object value = this.preferences$delegate.getValue();
            value.getClass();
            return (SharedPreferences) value;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getCampaignIDFromIntentExtra(Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            intent.getClass();
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString(CAMPAIGN_IDS_KEY);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getCampaignIDFromUri(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            uri.getClass();
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter).getString(CAMPAIGN_IDS_KEY);
            } catch (Exception unused) {
                Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getInfo(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            str.getClass();
            return getPreferences().getString(str, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void handleURL(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            activity.getClass();
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            intent.getClass();
            processCampaignIds(data, intent);
            processClickId(data);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void processCampaignIds(Uri uri, Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            uri.getClass();
            intent.getClass();
            String campaignIDFromUri = getCampaignIDFromUri(uri);
            if (campaignIDFromUri == null) {
                campaignIDFromUri = getCampaignIDFromIntentExtra(intent);
            }
            if (campaignIDFromUri != null) {
                getPreferences().edit().putString(CAMPAIGN_IDS_KEY, campaignIDFromUri).apply();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void processClickId(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            uri.getClass();
            String queryParameter = uri.getQueryParameter("fbclid");
            if (queryParameter != null && queryParameter.length() != 0) {
                getPreferences().edit().putString(CLICK_ID_KEY, queryParameter).apply();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setupLifecycleListener(Application application) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            application.getClass();
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.appevents.internal.AppLinkManager$setupLifecycleListener$1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    activity.getClass();
                    AppLinkManager companion = AppLinkManager.Companion.getInstance();
                    if (companion != null) {
                        companion.handleURL(activity);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    activity.getClass();
                    bundle.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    activity.getClass();
                    AppLinkManager companion = AppLinkManager.Companion.getInstance();
                    if (companion != null) {
                        companion.handleURL(activity);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    activity.getClass();
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppLinkManager getInstance() {
            AppLinkManager access$getInstance$cp = AppLinkManager.access$getInstance$cp();
            if (access$getInstance$cp != null) {
                return access$getInstance$cp;
            }
            synchronized (this) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!FacebookSdk.isInitialized()) {
                    return null;
                }
                AppLinkManager access$getInstance$cp2 = AppLinkManager.access$getInstance$cp();
                if (access$getInstance$cp2 == null) {
                    access$getInstance$cp2 = new AppLinkManager(defaultConstructorMarker);
                    AppLinkManager.access$setInstance$cp(access$getInstance$cp2);
                }
                return access$getInstance$cp2;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppLinkManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
