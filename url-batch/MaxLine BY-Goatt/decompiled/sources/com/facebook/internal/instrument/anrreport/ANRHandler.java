package com.facebook.internal.instrument.anrreport;

import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.n;
import defpackage.o;
import defpackage.t31;
import defpackage.zv;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ranges.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ANRHandler {
    private static final int MAX_ANR_REPORT_NUM = 5;
    public static final ANRHandler INSTANCE = new ANRHandler();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    private ANRHandler() {
    }

    public static final synchronized void enable() {
        synchronized (ANRHandler.class) {
            if (CrashShieldHandler.isObjectCrashing(ANRHandler.class)) {
                return;
            }
            try {
                if (enabled.getAndSet(true)) {
                    return;
                }
                if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                    sendANRReports();
                }
                ANRDetector.start();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ANRHandler.class);
            }
        }
    }

    public static final void sendANRReports() {
        if (CrashShieldHandler.isObjectCrashing(ANRHandler.class)) {
            return;
        }
        try {
            if (Utility.isDataProcessingRestricted()) {
                return;
            }
            File[] listAnrReportFiles = InstrumentUtility.listAnrReportFiles();
            ArrayList arrayList = new ArrayList(listAnrReportFiles.length);
            int i = 0;
            for (File file : listAnrReportFiles) {
                arrayList.add(InstrumentData.Builder.load(file));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((InstrumentData) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            List I = zv.I(arrayList2, new n(i));
            JSONArray jSONArray = new JSONArray();
            t31 it = d.f(0, Math.min(I.size(), 5)).iterator();
            while (it.o) {
                jSONArray.put(I.get(it.nextInt()));
            }
            InstrumentUtility.sendReports("anr_reports", jSONArray, new o(i, I));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ANRHandler.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sendANRReports$lambda$2(InstrumentData instrumentData, InstrumentData instrumentData2) {
        if (CrashShieldHandler.isObjectCrashing(ANRHandler.class)) {
            return 0;
        }
        try {
            instrumentData2.getClass();
            return instrumentData.compareTo(instrumentData2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ANRHandler.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendANRReports$lambda$5(List list, GraphResponse graphResponse) {
        JSONObject jsonObject;
        if (CrashShieldHandler.isObjectCrashing(ANRHandler.class)) {
            return;
        }
        try {
            list.getClass();
            graphResponse.getClass();
            try {
                if (graphResponse.getError() == null && (jsonObject = graphResponse.getJsonObject()) != null && jsonObject.getBoolean("success")) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((InstrumentData) it.next()).clear();
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ANRHandler.class);
        }
    }
}
