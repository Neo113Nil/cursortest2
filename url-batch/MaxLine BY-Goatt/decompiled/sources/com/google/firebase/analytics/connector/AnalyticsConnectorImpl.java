package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import defpackage.af3;
import defpackage.bf3;
import defpackage.cf3;
import defpackage.dg3;
import defpackage.hl2;
import defpackage.ll3;
import defpackage.ph;
import defpackage.rf3;
import defpackage.tf3;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {
    private static volatile AnalyticsConnector zzc;
    final ph zza;
    final Map zzb;

    public AnalyticsConnectorImpl(ph phVar) {
        ll3.v(phVar);
        this.zza = phVar;
        this.zzb = new ConcurrentHashMap();
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        ll3.v(firebaseApp);
        ll3.v(context);
        ll3.v(subscriber);
        ll3.v(context.getApplicationContext());
        if (zzc == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                try {
                    if (zzc == null) {
                        Bundle bundle = new Bundle(1);
                        if (firebaseApp.isDefaultApp()) {
                            subscriber.subscribe(DataCollectionDefaultChange.class, zzb.zza, zza.zza);
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                        }
                        zzc = new AnalyticsConnectorImpl(dg3.e(context, bundle).b);
                    }
                } finally {
                }
            }
        }
        return zzc;
    }

    public static void zza(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            AnalyticsConnector analyticsConnector = zzc;
            ll3.v(analyticsConnector);
            dg3 dg3Var = ((AnalyticsConnectorImpl) analyticsConnector).zza.a;
            dg3Var.c(new rf3(dg3Var, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final boolean zzb(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.zzb;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || zzc.zzb(str2, bundle)) {
            dg3 dg3Var = this.zza.a;
            dg3Var.c(new cf3(dg3Var, str, str2, bundle));
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.zza.a.g(str, str2)) {
            int i = zzc.zza;
            ll3.v(bundle);
            AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
            String str3 = (String) hl2.r(bundle, FirebaseAnalytics.Param.ORIGIN, String.class, null);
            ll3.v(str3);
            conditionalUserProperty.origin = str3;
            String str4 = (String) hl2.r(bundle, "name", String.class, null);
            ll3.v(str4);
            conditionalUserProperty.name = str4;
            conditionalUserProperty.value = hl2.r(bundle, "value", Object.class, null);
            conditionalUserProperty.triggerEventName = (String) hl2.r(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.triggerTimeout = ((Long) hl2.r(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.timedOutEventName = (String) hl2.r(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.timedOutEventParams = (Bundle) hl2.r(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.triggeredEventName = (String) hl2.r(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.triggeredEventParams = (Bundle) hl2.r(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.timeToLive = ((Long) hl2.r(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.expiredEventName = (String) hl2.r(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.expiredEventParams = (Bundle) hl2.r(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.active = ((Boolean) hl2.r(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.creationTimestamp = ((Long) hl2.r(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.triggeredTimestamp = ((Long) hl2.r(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public int getMaxUserProperties(String str) {
        return this.zza.a.b(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public Map<String, Object> getUserProperties(boolean z) {
        return this.zza.a.a(null, null, z);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void logEvent(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (zzc.zza(str) && zzc.zzb(str2, bundle2) && zzc.zze(str, str2, bundle2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle2.putLong("_r", 1L);
            }
            dg3 dg3Var = this.zza.a;
            dg3Var.c(new tf3(dg3Var, null, str, str2, bundle2, true, true));
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(final String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        ll3.v(analyticsConnectorListener);
        if (zzc.zza(str) && !zzb(str)) {
            ph phVar = this.zza;
            com.google.firebase.analytics.connector.internal.zza zzeVar = "fiam".equals(str) ? new zze(phVar, analyticsConnectorListener) : "clx".equals(str) ? new zzg(phVar, analyticsConnectorListener) : null;
            if (zzeVar != null) {
                this.zzb.put(str, zzeVar);
                return new AnalyticsConnector.AnalyticsConnectorHandle(this) { // from class: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.1
                    final /* synthetic */ AnalyticsConnectorImpl zzb;

                    {
                        Objects.requireNonNull(this);
                        this.zzb = this;
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public void registerEventNames(Set<String> set) {
                        AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        String str2 = str;
                        if (!analyticsConnectorImpl.zzb(str2) || !str2.equals("fiam") || set == null || set.isEmpty()) {
                            return;
                        }
                        ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzb(set);
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public final void unregister() {
                        AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        String str2 = str;
                        if (analyticsConnectorImpl.zzb(str2)) {
                            Map map = analyticsConnectorImpl.zzb;
                            AnalyticsConnector.AnalyticsConnectorListener zza = ((com.google.firebase.analytics.connector.internal.zza) map.get(str2)).zza();
                            if (zza != null) {
                                zza.onMessageTriggered(0, null);
                            }
                            map.remove(str2);
                        }
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public void unregisterEventNames() {
                        AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        String str2 = str;
                        if (analyticsConnectorImpl.zzb(str2) && str2.equals("fiam")) {
                            ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzc();
                        }
                    }
                };
            }
        }
        return null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        int i = zzc.zza;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return;
        }
        Object obj = conditionalUserProperty.value;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    } catch (Throwable th2) {
                        th = th2;
                        objectInputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                objectOutputStream = null;
            }
            try {
                Object readObject = objectInputStream.readObject();
                objectOutputStream.close();
                objectInputStream.close();
                obj2 = readObject;
                if (obj2 == null) {
                    return;
                }
            } catch (Throwable th4) {
                th = th4;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (objectInputStream == null) {
                    throw th;
                }
                objectInputStream.close();
                throw th;
            }
        }
        if (zzc.zza(str) && zzc.zzd(str, conditionalUserProperty.name)) {
            String str2 = conditionalUserProperty.expiredEventName;
            if (str2 == null || (zzc.zzb(str2, conditionalUserProperty.expiredEventParams) && zzc.zze(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
                String str3 = conditionalUserProperty.triggeredEventName;
                if (str3 == null || (zzc.zzb(str3, conditionalUserProperty.triggeredEventParams) && zzc.zze(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
                    String str4 = conditionalUserProperty.timedOutEventName;
                    if (str4 == null || (zzc.zzb(str4, conditionalUserProperty.timedOutEventParams) && zzc.zze(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams))) {
                        ph phVar = this.zza;
                        Bundle bundle = new Bundle();
                        String str5 = conditionalUserProperty.origin;
                        if (str5 != null) {
                            bundle.putString(FirebaseAnalytics.Param.ORIGIN, str5);
                        }
                        String str6 = conditionalUserProperty.name;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj3 = conditionalUserProperty.value;
                        if (obj3 != null) {
                            hl2.q(bundle, obj3);
                        }
                        String str7 = conditionalUserProperty.triggerEventName;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", conditionalUserProperty.triggerTimeout);
                        String str8 = conditionalUserProperty.timedOutEventName;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = conditionalUserProperty.timedOutEventParams;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = conditionalUserProperty.triggeredEventName;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = conditionalUserProperty.triggeredEventParams;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", conditionalUserProperty.timeToLive);
                        String str10 = conditionalUserProperty.expiredEventName;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = conditionalUserProperty.expiredEventParams;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", conditionalUserProperty.creationTimestamp);
                        bundle.putBoolean("active", conditionalUserProperty.active);
                        bundle.putLong("triggered_timestamp", conditionalUserProperty.triggeredTimestamp);
                        dg3 dg3Var = phVar.a;
                        dg3Var.c(new bf3(dg3Var, bundle, 0));
                    }
                }
            }
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setUserProperty(String str, String str2, Object obj) {
        if (zzc.zza(str) && zzc.zzd(str, str2)) {
            dg3 dg3Var = this.zza.a;
            dg3Var.c(new af3(dg3Var, str, str2, obj, true));
        }
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.get(AnalyticsConnector.class);
    }

    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }
}
