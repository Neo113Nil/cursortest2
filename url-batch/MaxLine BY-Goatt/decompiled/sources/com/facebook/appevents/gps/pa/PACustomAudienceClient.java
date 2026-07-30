package com.facebook.appevents.gps.pa;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.GpsDebugLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.pv;
import defpackage.up2;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class PACustomAudienceClient {
    private static final String BUYER = "facebook.com";
    private static final String DELIMITER = "@";
    private static final String EVENT_NAME_CONFIG_VERSION = "1";
    private static final String GPS_PREFIX = "gps";
    private static final String REPLACEMENT_STRING = "_removed_";
    private static String baseUri;
    private static CustomAudienceManager customAudienceManager;
    private static boolean enabled;
    private static GpsDebugLogger gpsDebugLogger;
    private static boolean isInitialized;
    public static final PACustomAudienceClient INSTANCE = new PACustomAudienceClient();
    private static final String TAG = "Fledge: PACustomAudienceClient";

    private PACustomAudienceClient() {
    }

    public static final /* synthetic */ GpsDebugLogger access$getGpsDebugLogger$p() {
        if (CrashShieldHandler.isObjectCrashing(PACustomAudienceClient.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PACustomAudienceClient.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        if (CrashShieldHandler.isObjectCrashing(PACustomAudienceClient.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PACustomAudienceClient.class);
            return null;
        }
    }

    public static final void enable() {
        String obj;
        if (CrashShieldHandler.isObjectCrashing(PACustomAudienceClient.class)) {
            return;
        }
        try {
            isInitialized = true;
            Context applicationContext = FacebookSdk.getApplicationContext();
            gpsDebugLogger = new GpsDebugLogger(applicationContext);
            baseUri = "https://www." + FacebookSdk.getFacebookDomain() + "/privacy_sandbox/pa/logic";
            try {
                CustomAudienceManager customAudienceManager2 = CustomAudienceManager.get(applicationContext);
                customAudienceManager = customAudienceManager2;
                if (customAudienceManager2 != null) {
                    enabled = true;
                }
                obj = null;
            } catch (Error e) {
                obj = e.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e);
            } catch (Exception e2) {
                obj = e2.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e2);
            }
            if (enabled) {
                return;
            }
            GpsDebugLogger gpsDebugLogger2 = gpsDebugLogger;
            if (gpsDebugLogger2 == null) {
                Intrinsics.f("gpsDebugLogger");
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Constants.GPS_PA_FAILED_REASON, obj);
            Unit unit = Unit.a;
            gpsDebugLogger2.log(Constants.GPS_PA_FAILED, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PACustomAudienceClient.class);
        }
    }

    private final void joinCustomAudienceImpl(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            String validateAndCreateCAName = validateAndCreateCAName(str, str2);
            if (validateAndCreateCAName == null) {
                return;
            }
            try {
                OutcomeReceiver<Object, Exception> outcomeReceiver = new OutcomeReceiver() { // from class: com.facebook.appevents.gps.pa.PACustomAudienceClient$joinCustomAudienceImpl$callback$1
                    public void onError(Exception exc) {
                        exc.getClass();
                        Log.e(PACustomAudienceClient.access$getTAG$p(), exc.toString());
                        GpsDebugLogger access$getGpsDebugLogger$p = PACustomAudienceClient.access$getGpsDebugLogger$p();
                        if (access$getGpsDebugLogger$p == null) {
                            Intrinsics.f("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants.GPS_PA_FAILED_REASON, exc.toString());
                        Unit unit = Unit.a;
                        access$getGpsDebugLogger$p.log(Constants.GPS_PA_FAILED, bundle);
                    }

                    public void onResult(Object obj) {
                        obj.getClass();
                        Log.i(PACustomAudienceClient.access$getTAG$p(), "Successfully joined custom audience");
                        GpsDebugLogger access$getGpsDebugLogger$p = PACustomAudienceClient.access$getGpsDebugLogger$p();
                        if (access$getGpsDebugLogger$p != null) {
                            access$getGpsDebugLogger$p.log(Constants.GPS_PA_SUCCEED, null);
                        } else {
                            Intrinsics.f("gpsDebugLogger");
                            throw null;
                        }
                    }
                };
                AdData.Builder builder = new AdData.Builder();
                String str3 = baseUri;
                if (str3 == null) {
                    Intrinsics.f("baseUri");
                    throw null;
                }
                Uri parse = Uri.parse(str3.concat("/ad"));
                parse.getClass();
                AdData build = builder.setRenderUri(parse).setMetadata("{'isRealAd': false}").build();
                build.getClass();
                TrustedBiddingData.Builder builder2 = new TrustedBiddingData.Builder();
                String str4 = baseUri;
                if (str4 == null) {
                    Intrinsics.f("baseUri");
                    throw null;
                }
                Uri parse2 = Uri.parse(str4.concat("?trusted_bidding"));
                parse2.getClass();
                TrustedBiddingData build2 = builder2.setTrustedBiddingUri(parse2).setTrustedBiddingKeys(pv.c(BuildConfig.FLAVOR)).build();
                build2.getClass();
                CustomAudience.Builder buyer = new CustomAudience.Builder().setName(validateAndCreateCAName).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb = new StringBuilder();
                String str5 = baseUri;
                if (str5 == null) {
                    Intrinsics.f("baseUri");
                    throw null;
                }
                sb.append(str5);
                sb.append("?daily&app_id=");
                sb.append(str);
                Uri parse3 = Uri.parse(sb.toString());
                parse3.getClass();
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(parse3);
                String str6 = baseUri;
                if (str6 == null) {
                    Intrinsics.f("baseUri");
                    throw null;
                }
                Uri parse4 = Uri.parse(str6.concat("?bidding"));
                parse4.getClass();
                CustomAudience build3 = dailyUpdateUri.setBiddingLogicUri(parse4).setTrustedBiddingData(build2).setUserBiddingSignals(AdSelectionSignals.fromString("{}")).setAds(pv.c(build)).build();
                build3.getClass();
                JoinCustomAudienceRequest build4 = new JoinCustomAudienceRequest.Builder().setCustomAudience(build3).build();
                build4.getClass();
                CustomAudienceManager customAudienceManager2 = customAudienceManager;
                if (customAudienceManager2 != null) {
                    customAudienceManager2.joinCustomAudience(build4, Executors.newSingleThreadExecutor(), outcomeReceiver);
                }
            } catch (Error e) {
                Log.w(TAG, "Failed to join Custom Audience: " + e);
                GpsDebugLogger gpsDebugLogger2 = gpsDebugLogger;
                if (gpsDebugLogger2 == null) {
                    Intrinsics.f("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString(Constants.GPS_PA_FAILED_REASON, e.toString());
                Unit unit = Unit.a;
                gpsDebugLogger2.log(Constants.GPS_PA_FAILED, bundle);
            } catch (Exception e2) {
                Log.w(TAG, "Failed to join Custom Audience: " + e2);
                GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                if (gpsDebugLogger3 == null) {
                    Intrinsics.f("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString(Constants.GPS_PA_FAILED_REASON, e2.toString());
                Unit unit2 = Unit.a;
                gpsDebugLogger3.log(Constants.GPS_PA_FAILED, bundle2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final String validateAndCreateCAName(String str, String str2) {
        if (!CrashShieldHandler.isObjectCrashing(this) && str != null && str2 != null) {
            try {
                if (!str2.equals(REPLACEMENT_STRING) && !up2.q(str2, GPS_PREFIX)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / 1000) + "@1";
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
        return null;
    }

    public final void joinCustomAudience(String str, AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (!isInitialized) {
                enable();
            }
            if (enabled) {
                String str2 = null;
                if (appEvent != null) {
                    try {
                        JSONObject jSONObject = appEvent.getJSONObject();
                        if (jSONObject != null) {
                            str2 = jSONObject.getString(Constants.EVENT_NAME_EVENT_KEY);
                        }
                    } catch (JSONException unused) {
                        Log.w(TAG, "Failed to get event name from event.");
                    }
                }
                joinCustomAudienceImpl(str, str2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void joinCustomAudience(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (!isInitialized) {
                enable();
            }
            if (enabled) {
                joinCustomAudienceImpl(str, str2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
