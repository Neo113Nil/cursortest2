package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.hb3;
import defpackage.hl2;
import defpackage.km3;
import defpackage.ll3;
import defpackage.pj3;
import defpackage.xc3;
import defpackage.yd3;
import defpackage.ye3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {
    public static volatile AppMeasurement b;
    public final yd3 a;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
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

    public AppMeasurement(pj3 pj3Var) {
        this.a = new hb3(pj3Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (b == null) {
            synchronized (AppMeasurement.class) {
                if (b == null) {
                    km3 km3Var = (km3) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (km3Var != null) {
                        b = new AppMeasurement(km3Var);
                    } else {
                        b = new AppMeasurement(pj3.s(context, new ye3(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return b;
    }

    public void beginAdUnitExposure(String str) {
        this.a.zzm(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.zzp(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.a.zzn(str);
    }

    public long generateEventId() {
        return this.a.zzl();
    }

    public String getAppInstanceId() {
        return this.a.zzj();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> zzq = this.a.zzq(str, str2);
        ArrayList arrayList = new ArrayList(zzq == null ? 0 : zzq.size());
        for (Bundle bundle : zzq) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            ll3.v(bundle);
            conditionalUserProperty.mAppId = (String) hl2.r(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) hl2.r(bundle, FirebaseAnalytics.Param.ORIGIN, String.class, null);
            conditionalUserProperty.mName = (String) hl2.r(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = hl2.r(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) hl2.r(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) hl2.r(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) hl2.r(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) hl2.r(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) hl2.r(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) hl2.r(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) hl2.r(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) hl2.r(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) hl2.r(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) hl2.r(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) hl2.r(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) hl2.r(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.a.zzi();
    }

    public String getCurrentScreenName() {
        return this.a.zzh();
    }

    public String getGmpAppId() {
        return this.a.zzk();
    }

    public int getMaxUserProperties(String str) {
        return this.a.zzr(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.a.zzd(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.a.zza(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        ll3.v(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(FirebaseAnalytics.Param.ORIGIN, str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            hl2.q(bundle, obj);
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
        this.a.zzo(bundle);
    }

    public AppMeasurement(km3 km3Var) {
        this.a = new xc3(km3Var);
    }
}
