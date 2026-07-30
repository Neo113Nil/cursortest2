package com.facebook.internal.instrument;

import android.os.Build;
import com.facebook.internal.Utility;
import defpackage.tp2;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InstrumentData {
    public static final Companion Companion = new Companion(null);
    private static final String PARAM_APP_VERSION = "app_version";
    private static final String PARAM_CALLSTACK = "callstack";
    private static final String PARAM_DEVICE_MODEL = "device_model";
    private static final String PARAM_DEVICE_OS = "device_os_version";
    private static final String PARAM_FEATURE_NAMES = "feature_names";
    private static final String PARAM_REASON = "reason";
    private static final String PARAM_TIMESTAMP = "timestamp";
    private static final String PARAM_TYPE = "type";
    private static final String UNKNOWN = "Unknown";
    private String appVersion;
    private String cause;
    private JSONArray featureNames;
    private String filename;
    private String stackTrace;
    private Long timestamp;
    private Type type;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.Analysis.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.AnrReport.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Type.CrashReport.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Type.CrashShield.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Type.ThreadCheck.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String getLogPrefix() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : InstrumentUtility.THREAD_CHECK_PREFIX : InstrumentUtility.CRASH_SHIELD_PREFIX : InstrumentUtility.CRASH_REPORT_PREFIX : InstrumentUtility.ANR_REPORT_PREFIX : InstrumentUtility.ANALYSIS_REPORT_PREFIX;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.AnrReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InstrumentData(File file) {
        String name = file.getName();
        name.getClass();
        this.filename = name;
        this.type = Companion.getType(name);
        JSONObject readFile = InstrumentUtility.readFile(this.filename, true);
        if (readFile != null) {
            this.timestamp = Long.valueOf(readFile.optLong("timestamp", 0L));
            this.appVersion = readFile.optString(PARAM_APP_VERSION, null);
            this.cause = readFile.optString(PARAM_REASON, null);
            this.stackTrace = readFile.optString(PARAM_CALLSTACK, null);
            this.featureNames = readFile.optJSONArray(PARAM_FEATURE_NAMES);
        }
    }

    private final JSONObject getAnalysisReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put(PARAM_FEATURE_NAMES, jSONArray);
            }
            Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getExceptionReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PARAM_DEVICE_OS, Build.VERSION.RELEASE);
            jSONObject.put(PARAM_DEVICE_MODEL, Build.MODEL);
            String str = this.appVersion;
            if (str != null) {
                jSONObject.put(PARAM_APP_VERSION, str);
            }
            Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put(PARAM_REASON, str2);
            }
            String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put(PARAM_CALLSTACK, str3);
            }
            Type type = this.type;
            if (type != null) {
                jSONObject.put("type", type);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getParameters() {
        Type type = this.type;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return getAnalysisReportParameters();
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return getExceptionReportParameters();
        }
        return null;
    }

    public final void clear() {
        InstrumentUtility.deleteFile(this.filename);
    }

    public final int compareTo(InstrumentData instrumentData) {
        instrumentData.getClass();
        Long l = this.timestamp;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = instrumentData.timestamp;
        if (l2 != null) {
            return Intrinsics.d(l2.longValue(), longValue);
        }
        return 1;
    }

    public final boolean isValid() {
        Type type = this.type;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        return i != 1 ? i != 2 ? ((i != 3 && i != 4 && i != 5) || this.stackTrace == null || this.timestamp == null) ? false : true : (this.stackTrace == null || this.cause == null || this.timestamp == null) ? false : true : (this.featureNames == null || this.timestamp == null) ? false : true;
    }

    public final void save() {
        if (isValid()) {
            InstrumentUtility.writeFile(this.filename, toString());
        }
    }

    public String toString() {
        JSONObject parameters = getParameters();
        if (parameters == null) {
            String jSONObject = new JSONObject().toString();
            jSONObject.getClass();
            return jSONObject;
        }
        String jSONObject2 = parameters.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Type getType(String str) {
            return tp2.o(str, InstrumentUtility.CRASH_REPORT_PREFIX, false) ? Type.CrashReport : tp2.o(str, InstrumentUtility.CRASH_SHIELD_PREFIX, false) ? Type.CrashShield : tp2.o(str, InstrumentUtility.THREAD_CHECK_PREFIX, false) ? Type.ThreadCheck : tp2.o(str, InstrumentUtility.ANALYSIS_REPORT_PREFIX, false) ? Type.Analysis : tp2.o(str, InstrumentUtility.ANR_REPORT_PREFIX, false) ? Type.AnrReport : Type.Unknown;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder {
        public static final Builder INSTANCE = new Builder();

        private Builder() {
        }

        public static final InstrumentData build(Throwable th, Type type) {
            type.getClass();
            return new InstrumentData(th, type, (DefaultConstructorMarker) null);
        }

        public static final InstrumentData load(File file) {
            file.getClass();
            return new InstrumentData(file, (DefaultConstructorMarker) null);
        }

        public static final InstrumentData build(JSONArray jSONArray) {
            jSONArray.getClass();
            return new InstrumentData(jSONArray, (DefaultConstructorMarker) null);
        }

        public static final InstrumentData build(String str, String str2) {
            return new InstrumentData(str, str2, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ InstrumentData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(Throwable th, Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, type);
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private InstrumentData(JSONArray jSONArray) {
        this.type = Type.Analysis;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        this.featureNames = jSONArray;
        StringBuffer stringBuffer = new StringBuffer(InstrumentUtility.ANALYSIS_REPORT_PREFIX);
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        this.filename = stringBuffer2;
    }

    private InstrumentData(Throwable th, Type type) {
        this.type = type;
        this.appVersion = Utility.getAppVersion();
        this.cause = InstrumentUtility.getCause(th);
        this.stackTrace = InstrumentUtility.getStackTrace(th);
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type.getLogPrefix());
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        this.filename = stringBuffer2;
    }

    private InstrumentData(String str, String str2) {
        this.type = Type.AnrReport;
        this.appVersion = Utility.getAppVersion();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer(InstrumentUtility.ANR_REPORT_PREFIX);
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        this.filename = stringBuffer2;
    }

    public /* synthetic */ InstrumentData(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }
}
