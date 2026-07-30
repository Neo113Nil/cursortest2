package com.facebook.internal.instrument.errorreport;

import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ErrorReportData {
    public static final Companion Companion = new Companion(null);
    private static final String PARAM_TIMESTAMP = "timestamp";
    private static final String PRARAM_ERROR_MESSAGE = "error_message";
    private String errorMessage;
    private String filename;
    private Long timestamp;

    public ErrorReportData(String str) {
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        this.errorMessage = str;
        StringBuffer stringBuffer = new StringBuffer(InstrumentUtility.ERROR_REPORT_PREFIX);
        Long l = this.timestamp;
        l.getClass();
        stringBuffer.append(l.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        this.filename = stringBuffer2;
    }

    public final void clear() {
        InstrumentUtility.deleteFile(this.filename);
    }

    public final int compareTo(ErrorReportData errorReportData) {
        errorReportData.getClass();
        Long l = this.timestamp;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = errorReportData.timestamp;
        if (l2 != null) {
            return Intrinsics.d(l2.longValue(), longValue);
        }
        return 1;
    }

    public final JSONObject getParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.errorMessage);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean isValid() {
        return (this.errorMessage == null || this.timestamp == null) ? false : true;
    }

    public final void save() {
        if (isValid()) {
            InstrumentUtility.writeFile(this.filename, toString());
        }
    }

    public String toString() {
        JSONObject parameters = getParameters();
        if (parameters == null) {
            return super.toString();
        }
        String jSONObject = parameters.toString();
        jSONObject.getClass();
        return jSONObject;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ErrorReportData(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        this.filename = name;
        JSONObject readFile = InstrumentUtility.readFile(name, true);
        if (readFile != null) {
            this.timestamp = Long.valueOf(readFile.optLong("timestamp", 0L));
            this.errorMessage = readFile.optString("error_message", null);
        }
    }
}
