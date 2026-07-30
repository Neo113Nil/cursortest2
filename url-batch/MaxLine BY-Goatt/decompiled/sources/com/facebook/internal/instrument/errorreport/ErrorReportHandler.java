package com.facebook.internal.instrument.errorreport;

import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import defpackage.li0;
import defpackage.mi0;
import defpackage.n;
import defpackage.uv;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ErrorReportHandler {
    public static final ErrorReportHandler INSTANCE = new ErrorReportHandler();
    private static final int MAX_ERROR_REPORT_NUM = 1000;

    private ErrorReportHandler() {
    }

    public static final void enable() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            sendErrorReports();
        }
    }

    public static final File[] listErrorReportFiles() {
        File instrumentReportDir = InstrumentUtility.getInstrumentReportDir();
        int i = 0;
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new li0(i));
        listFiles.getClass();
        return listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listErrorReportFiles$lambda$3(File file, String str) {
        str.getClass();
        return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{InstrumentUtility.ERROR_REPORT_PREFIX}, 1))).a(str);
    }

    public static final void save(String str) {
        try {
            new ErrorReportData(str).save();
        } catch (Exception unused) {
        }
    }

    public static final void sendErrorReports() {
        if (Utility.isDataProcessingRestricted()) {
            return;
        }
        File[] listErrorReportFiles = listErrorReportFiles();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (File file : listErrorReportFiles) {
            ErrorReportData errorReportData = new ErrorReportData(file);
            if (errorReportData.isValid()) {
                arrayList.add(errorReportData);
            }
        }
        uv.n(arrayList, new n(3));
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size() && i2 < 1000; i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        InstrumentUtility.sendReports("error_reports", jSONArray, new mi0(i, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sendErrorReports$lambda$0(ErrorReportData errorReportData, ErrorReportData errorReportData2) {
        errorReportData2.getClass();
        return errorReportData.compareTo(errorReportData2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendErrorReports$lambda$2(ArrayList arrayList, GraphResponse graphResponse) {
        JSONObject jsonObject;
        arrayList.getClass();
        graphResponse.getClass();
        try {
            if (graphResponse.getError() == null && (jsonObject = graphResponse.getJsonObject()) != null && jsonObject.getBoolean("success")) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ErrorReportData) obj).clear();
                }
            }
        } catch (JSONException unused) {
        }
    }
}
