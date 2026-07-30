package com.facebook.internal.instrument.crashreport;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import defpackage.n;
import defpackage.o;
import defpackage.t31;
import defpackage.zv;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CrashHandler implements Thread.UncaughtExceptionHandler {
    private static final int MAX_CRASH_REPORT_NUM = 5;
    private static CrashHandler instance;
    private final Thread.UncaughtExceptionHandler previousHandler;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = CrashHandler.class.getCanonicalName();

    private CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.previousHandler = uncaughtExceptionHandler;
    }

    public static final synchronized void enable() {
        synchronized (CrashHandler.class) {
            Companion.enable();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        thread.getClass();
        th.getClass();
        if (InstrumentUtility.isSDKRelatedException(th)) {
            ExceptionAnalyzer.execute(th);
            InstrumentData.Builder.build(th, InstrumentData.Type.CrashReport).save();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void sendExceptionReports() {
            if (Utility.isDataProcessingRestricted()) {
                return;
            }
            File[] listExceptionReportFiles = InstrumentUtility.listExceptionReportFiles();
            ArrayList arrayList = new ArrayList(listExceptionReportFiles.length);
            for (File file : listExceptionReportFiles) {
                arrayList.add(InstrumentData.Builder.load(file));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((InstrumentData) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            List I = zv.I(arrayList2, new n(2));
            JSONArray jSONArray = new JSONArray();
            t31 it = d.f(0, Math.min(I.size(), 5)).iterator();
            while (it.o) {
                jSONArray.put(I.get(it.nextInt()));
            }
            InstrumentUtility.sendReports("crash_reports", jSONArray, new o(1, I));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int sendExceptionReports$lambda$2(InstrumentData instrumentData, InstrumentData instrumentData2) {
            instrumentData2.getClass();
            return instrumentData.compareTo(instrumentData2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void sendExceptionReports$lambda$5(List list, GraphResponse graphResponse) {
            JSONObject jsonObject;
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
        }

        public final synchronized void enable() {
            try {
                if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                    sendExceptionReports();
                }
                if (CrashHandler.instance != null) {
                    Log.w(CrashHandler.TAG, "Already enabled!");
                } else {
                    CrashHandler.instance = new CrashHandler(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(CrashHandler.instance);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }
}
