package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import c7.c0;
import com.google.android.gms.internal.measurement.n6;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r7.a;
import r7.b;
import r7.c;
import s7.d2;
import s7.q1;
import s7.r2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f3056b;

    /* renamed from: a, reason: collision with root package name */
    public final c f3057a;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(q1 q1Var) {
        this.f3057a = new a(q1Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f3056b == null) {
            synchronized (AppMeasurement.class) {
                if (f3056b == null) {
                    r2 r2Var = (r2) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (r2Var != null) {
                        f3056b = new AppMeasurement(r2Var);
                    } else {
                        f3056b = new AppMeasurement(q1.r(context, new n6(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return f3056b;
    }

    public void beginAdUnitExposure(String str) {
        this.f3057a.m(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f3057a.d(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f3057a.j(str);
    }

    public long generateEventId() {
        return this.f3057a.b();
    }

    public String getAppInstanceId() {
        return this.f3057a.i();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> f3 = this.f3057a.f(str, str2);
        ArrayList arrayList = new ArrayList(f3 == null ? 0 : f3.size());
        for (Bundle bundle : f3) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            c0.g(bundle);
            conditionalUserProperty.mAppId = (String) d2.e(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) d2.e(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) d2.e(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = d2.e(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) d2.e(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) d2.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) d2.e(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) d2.e(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) d2.e(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) d2.e(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) d2.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) d2.e(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) d2.e(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) d2.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) d2.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) d2.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f3057a.e();
    }

    public String getCurrentScreenName() {
        return this.f3057a.c();
    }

    public String getGmpAppId() {
        return this.f3057a.k();
    }

    public int getMaxUserProperties(String str) {
        return this.f3057a.h(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f3057a.l(str, str2, z10);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f3057a.a(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        c0.g(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            d2.c(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f3057a.g(bundle);
    }

    public AppMeasurement(r2 r2Var) {
        this.f3057a = new b(r2Var);
    }
}
