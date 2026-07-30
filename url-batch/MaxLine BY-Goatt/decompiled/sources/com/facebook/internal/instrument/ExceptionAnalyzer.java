package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentData;
import defpackage.mi0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ExceptionAnalyzer {
    public static final ExceptionAnalyzer INSTANCE = new ExceptionAnalyzer();
    private static boolean enabled;

    private ExceptionAnalyzer() {
    }

    public static final void enable() {
        enabled = true;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            INSTANCE.sendExceptionAnalysisReports$facebook_core_release();
        }
    }

    public static final void execute(Throwable th) {
        if (!enabled || isDebug$facebook_core_release() || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            FeatureManager.Feature feature = FeatureManager.getFeature(className);
            if (feature != FeatureManager.Feature.Unknown) {
                FeatureManager.disableFeature(feature);
                hashSet.add(feature.toString());
            }
        }
        if (!FacebookSdk.getAutoLogAppEventsEnabled() || hashSet.isEmpty()) {
            return;
        }
        InstrumentData.Builder.build(new JSONArray((Collection) hashSet)).save();
    }

    public static final boolean isDebug$facebook_core_release() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendExceptionAnalysisReports$lambda$1(InstrumentData instrumentData, GraphResponse graphResponse) {
        JSONObject jsonObject;
        instrumentData.getClass();
        graphResponse.getClass();
        try {
            if (graphResponse.getError() == null && (jsonObject = graphResponse.getJsonObject()) != null && jsonObject.getBoolean("success")) {
                instrumentData.clear();
            }
        } catch (JSONException unused) {
        }
    }

    public final void sendExceptionAnalysisReports$facebook_core_release() {
        if (Utility.isDataProcessingRestricted()) {
            return;
        }
        File[] listExceptionAnalysisReportFiles = InstrumentUtility.listExceptionAnalysisReportFiles();
        ArrayList arrayList = new ArrayList();
        for (File file : listExceptionAnalysisReportFiles) {
            InstrumentData load = InstrumentData.Builder.load(file);
            if (load.isValid()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", load.toString());
                    arrayList.add(GraphRequest.Companion.newPostRequest(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1)), jSONObject, new mi0(1, load)));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new GraphRequestBatch(arrayList).executeAsync();
    }
}
