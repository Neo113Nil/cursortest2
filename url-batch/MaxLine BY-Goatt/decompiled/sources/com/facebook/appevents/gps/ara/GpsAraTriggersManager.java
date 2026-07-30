package com.facebook.appevents.gps.ara;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.GpsDebugLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.aj2;
import defpackage.b71;
import defpackage.de2;
import defpackage.dj2;
import defpackage.ps2;
import defpackage.up2;
import defpackage.yl0;
import defpackage.zv0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GpsAraTriggersManager {
    private static final String GPS_PREFIX = "gps";
    public static final GpsAraTriggersManager INSTANCE = new GpsAraTriggersManager();
    private static final String REPLACEMENT_STRING = "_removed_";
    private static final String TAG;
    private static boolean enabled;
    private static GpsDebugLogger gpsDebugLogger;
    private static String serverUri;

    static {
        String cls = GpsAraTriggersManager.class.toString();
        cls.getClass();
        TAG = cls;
    }

    private GpsAraTriggersManager() {
    }

    public static final /* synthetic */ GpsDebugLogger access$getGpsDebugLogger$p() {
        if (CrashShieldHandler.isObjectCrashing(GpsAraTriggersManager.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsAraTriggersManager.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        if (CrashShieldHandler.isObjectCrashing(GpsAraTriggersManager.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsAraTriggersManager.class);
            return null;
        }
    }

    private final boolean canRegisterTrigger() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (!enabled || Build.VERSION.SDK_INT < 33) {
                return false;
            }
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                Class.forName("android.os.OutcomeReceiver");
                return true;
            } catch (Error e) {
                Log.i(TAG, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                GpsDebugLogger gpsDebugLogger2 = gpsDebugLogger;
                if (gpsDebugLogger2 == null) {
                    Intrinsics.f("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString(Constants.GPS_ARA_FAILED_REASON, e.toString());
                Unit unit = Unit.a;
                gpsDebugLogger2.log(Constants.GPS_ARA_FAILED, bundle);
                return false;
            } catch (Exception e2) {
                Log.i(TAG, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                if (gpsDebugLogger3 == null) {
                    Intrinsics.f("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString(Constants.GPS_ARA_FAILED_REASON, e2.toString());
                Unit unit2 = Unit.a;
                gpsDebugLogger3.log(Constants.GPS_ARA_FAILED, bundle2);
                return false;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(GpsAraTriggersManager.class)) {
            return;
        }
        try {
            enabled = true;
            gpsDebugLogger = new GpsDebugLogger(FacebookSdk.getApplicationContext());
            serverUri = "https://www." + FacebookSdk.getFacebookDomain() + "/privacy_sandbox/mobile/register/trigger";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsAraTriggersManager.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    private final String getEventParameters(AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = appEvent.getJSONObject();
            if (jSONObject != null && jSONObject.length() != 0) {
                Iterator<String> keys = jSONObject.keys();
                keys.getClass();
                this = dj2.d(new yl0(new ps2(aj2.b(keys), new GpsAraTriggersManager$getEventParameters$1(jSONObject), 1), new de2(23)), "&");
                return this;
            }
            return BuildConfig.FLAVOR;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean isValidEvent(AppEvent appEvent) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                String string = appEvent.getJSONObject().getString(Constants.EVENT_NAME_EVENT_KEY);
                if (!Intrinsics.b(string, REPLACEMENT_STRING)) {
                    string.getClass();
                    if (!up2.q(string, GPS_PREFIX)) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerTriggerAsync$lambda$0(String str, AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(GpsAraTriggersManager.class)) {
            return;
        }
        try {
            str.getClass();
            appEvent.getClass();
            INSTANCE.registerTrigger(str, appEvent);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsAraTriggersManager.class);
        }
    }

    public final void registerTrigger(String str, AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            str.getClass();
            appEvent.getClass();
            if (isValidEvent(appEvent) && canRegisterTrigger()) {
                Context applicationContext = FacebookSdk.getApplicationContext();
                try {
                    try {
                        MeasurementManager d = b71.d(applicationContext.getSystemService(b71.e()));
                        if (d == null) {
                            d = MeasurementManager.get(applicationContext.getApplicationContext());
                        }
                        if (d == null) {
                            Log.w(TAG, "FAILURE_GET_MEASUREMENT_MANAGER");
                            GpsDebugLogger gpsDebugLogger2 = gpsDebugLogger;
                            if (gpsDebugLogger2 == null) {
                                Intrinsics.f("gpsDebugLogger");
                                throw null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString(Constants.GPS_ARA_FAILED_REASON, "Failed to get measurement manager");
                            Unit unit = Unit.a;
                            gpsDebugLogger2.log(Constants.GPS_ARA_FAILED, bundle);
                            return;
                        }
                        String eventParameters = getEventParameters(appEvent);
                        StringBuilder sb = new StringBuilder();
                        String str2 = serverUri;
                        if (str2 == null) {
                            Intrinsics.f("serverUri");
                            throw null;
                        }
                        sb.append(str2);
                        sb.append("?app_id=");
                        sb.append(str);
                        sb.append('&');
                        sb.append(eventParameters);
                        Uri parse = Uri.parse(sb.toString());
                        parse.getClass();
                        d.registerTrigger(parse, FacebookSdk.getExecutor(), new OutcomeReceiver() { // from class: com.facebook.appevents.gps.ara.GpsAraTriggersManager$registerTrigger$outcomeReceiver$1
                            public void onError(Exception exc) {
                                exc.getClass();
                                Log.d(GpsAraTriggersManager.access$getTAG$p(), "OUTCOME_RECEIVER_TRIGGER_FAILURE");
                                GpsDebugLogger access$getGpsDebugLogger$p = GpsAraTriggersManager.access$getGpsDebugLogger$p();
                                if (access$getGpsDebugLogger$p == null) {
                                    Intrinsics.f("gpsDebugLogger");
                                    throw null;
                                }
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(Constants.GPS_ARA_FAILED_REASON, exc.toString());
                                Unit unit2 = Unit.a;
                                access$getGpsDebugLogger$p.log(Constants.GPS_ARA_FAILED, bundle2);
                            }

                            public void onResult(Object obj) {
                                obj.getClass();
                                Log.d(GpsAraTriggersManager.access$getTAG$p(), "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
                                GpsDebugLogger access$getGpsDebugLogger$p = GpsAraTriggersManager.access$getGpsDebugLogger$p();
                                if (access$getGpsDebugLogger$p != null) {
                                    access$getGpsDebugLogger$p.log(Constants.GPS_ARA_SUCCEED, null);
                                } else {
                                    Intrinsics.f("gpsDebugLogger");
                                    throw null;
                                }
                            }
                        });
                    } catch (Exception e) {
                        Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                        GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                        if (gpsDebugLogger3 == null) {
                            Intrinsics.f("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.GPS_ARA_FAILED_REASON, e.toString());
                        Unit unit2 = Unit.a;
                        gpsDebugLogger3.log(Constants.GPS_ARA_FAILED, bundle2);
                    }
                } catch (Error e2) {
                    Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    GpsDebugLogger gpsDebugLogger4 = gpsDebugLogger;
                    if (gpsDebugLogger4 == null) {
                        Intrinsics.f("gpsDebugLogger");
                        throw null;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(Constants.GPS_ARA_FAILED_REASON, e2.toString());
                    Unit unit3 = Unit.a;
                    gpsDebugLogger4.log(Constants.GPS_ARA_FAILED, bundle3);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void registerTriggerAsync(String str, AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            str.getClass();
            appEvent.getClass();
            FacebookSdk.getExecutor().execute(new zv0(str, appEvent, 0));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
