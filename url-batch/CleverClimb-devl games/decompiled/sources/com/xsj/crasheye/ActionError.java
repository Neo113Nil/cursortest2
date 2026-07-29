package com.xsj.crasheye;

import android.app.ActivityManager;
import android.content.Context;
import com.tapjoy.TJAdUnitConstants;
import com.xsj.crasheye.util.EnumStateStatus;
import com.xsj.crasheye.util.Utils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ActionError extends BaseDTO implements InterfaceDataType {
    private JSONArray breadcrumbs;
    private String crashTime;
    private String errorHash;
    private EnumStateStatus gpsStatus;
    private Boolean handled;
    private String klass;
    private String memAppAvailable;
    private String memAppMax;
    private String memAppTotal;
    private String memSysAvailable;
    private String memSysLow;
    private String memSysThreshold;
    private String memSysTotal;
    private String message;
    private String msFromStart;
    private String stacktrace;
    private String where;

    @Override // com.xsj.crasheye.BaseDTO
    public /* bridge */ /* synthetic */ JSONObject getBasicDataFixtureJson() {
        return super.getBasicDataFixtureJson();
    }

    public ActionError(EnumActionType enumActionType, String str, EnumExceptionType enumExceptionType, HashMap<String, Object> hashMap) {
        super(enumActionType, hashMap);
        this.memSysTotal = null;
        this.memSysAvailable = null;
        this.stacktrace = str;
        if (enumExceptionType == EnumExceptionType.HANDLED) {
            this.handled = true;
        } else {
            this.handled = false;
        }
        HashMap<String, String> manipulateStacktrace = StacktraceHash.manipulateStacktrace(Properties.APP_PACKAGE, str);
        this.klass = manipulateStacktrace.get("klass");
        this.message = manipulateStacktrace.get(TJAdUnitConstants.String.MESSAGE);
        this.errorHash = manipulateStacktrace.get("errorHash");
        this.where = manipulateStacktrace.get("where");
        this.gpsStatus = Properties.IS_GPS_ON;
        this.msFromStart = Utils.getMilisFromStart();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Runtime runtime = Runtime.getRuntime();
        if (!this.handled.booleanValue()) {
            HashMap<String, String> memoryInfo2 = Utils.getMemoryInfo();
            this.memSysTotal = memoryInfo2.get("memTotal");
            this.memSysAvailable = memoryInfo2.get("memFree");
        }
        double d2 = memoryInfo.threshold;
        Double.isNaN(d2);
        this.memSysThreshold = String.valueOf(d2 / 1048576.0d);
        this.memSysLow = String.valueOf(memoryInfo.lowMemory);
        double maxMemory = runtime.maxMemory();
        Double.isNaN(maxMemory);
        this.memAppMax = String.valueOf(maxMemory / 1048576.0d);
        double freeMemory = runtime.freeMemory();
        Double.isNaN(freeMemory);
        this.memAppAvailable = String.valueOf(freeMemory / 1048576.0d);
        double d3 = runtime.totalMemory();
        Double.isNaN(d3);
        this.memAppTotal = String.valueOf(d3 / 1048576.0d);
        this.breadcrumbs = Properties.breadcrumbs.getList();
        this.crashTime = Utils.getTime();
    }

    public ActionError(EnumActionType enumActionType, String str, String str2, String str3, String str4, HashMap<String, Object> hashMap, EnumExceptionType enumExceptionType) {
        super(enumActionType, hashMap);
        this.memSysTotal = null;
        this.memSysAvailable = null;
        this.stacktrace = str4;
        if (enumExceptionType == EnumExceptionType.HANDLED) {
            this.handled = true;
        } else {
            this.handled = false;
        }
        this.klass = str2;
        this.message = str;
        this.errorHash = StacktraceHash.getMD5ForJavascriptError(str4);
        this.where = "line: " + str3;
        this.gpsStatus = Properties.IS_GPS_ON;
        this.msFromStart = Utils.getMilisFromStart();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Runtime runtime = Runtime.getRuntime();
        if (!this.handled.booleanValue()) {
            HashMap<String, String> memoryInfo2 = Utils.getMemoryInfo();
            this.memSysTotal = memoryInfo2.get("memTotal");
            this.memSysAvailable = memoryInfo2.get("memFree");
        }
        double d2 = memoryInfo.threshold;
        Double.isNaN(d2);
        this.memSysThreshold = String.valueOf(d2 / 1048576.0d);
        this.memSysLow = String.valueOf(memoryInfo.lowMemory);
        double maxMemory = runtime.maxMemory();
        Double.isNaN(maxMemory);
        this.memAppMax = String.valueOf(maxMemory / 1048576.0d);
        double freeMemory = runtime.freeMemory();
        Double.isNaN(freeMemory);
        this.memAppAvailable = String.valueOf(freeMemory / 1048576.0d);
        double d3 = runtime.totalMemory();
        Double.isNaN(d3);
        this.memAppTotal = String.valueOf(d3 / 1048576.0d);
        this.breadcrumbs = Properties.breadcrumbs.getList();
        this.crashTime = Utils.getTime();
    }

    public final String getErrorHash() {
        return this.errorHash;
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public String toJsonLine() {
        JSONObject basicDataFixtureJson = getBasicDataFixtureJson();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stack", this.stacktrace);
            jSONObject.put("error", this.message);
            basicDataFixtureJson.put("crash", jSONObject);
            basicDataFixtureJson.put("crashtime", this.crashTime);
            basicDataFixtureJson.put("dumptype", EnumErrorType.java.toString());
            basicDataFixtureJson.put("handled", this.handled);
            basicDataFixtureJson.put("klass", this.klass);
            basicDataFixtureJson.put(TJAdUnitConstants.String.MESSAGE, this.message);
            basicDataFixtureJson.put("errorhash", this.errorHash);
            basicDataFixtureJson.put("where", this.where);
            basicDataFixtureJson.put("rooted", this.rooted);
            basicDataFixtureJson.put("gpsstatus", this.gpsStatus.toString());
            basicDataFixtureJson.put("msfromstart", this.msFromStart);
            if (this.breadcrumbs != null && this.breadcrumbs.length() > 0) {
                basicDataFixtureJson.put("breadcrumbs", this.breadcrumbs);
            }
            basicDataFixtureJson.put("memsyslow", this.memSysLow);
            if (!this.handled.booleanValue()) {
                basicDataFixtureJson.put("memsystotal", this.memSysTotal);
                basicDataFixtureJson.put("memsysavailable", this.memSysAvailable);
            }
            basicDataFixtureJson.put("memsysthreshold", this.memSysThreshold);
            basicDataFixtureJson.put("memappmax", this.memAppMax);
            basicDataFixtureJson.put("memappavailable", this.memAppAvailable);
            basicDataFixtureJson.put("memapptotal", this.memAppTotal);
            if (Properties.SEND_LOG) {
                basicDataFixtureJson.put("log", Utils.readLogs());
            } else {
                basicDataFixtureJson.put("log", "NA");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return String.valueOf(basicDataFixtureJson.toString()) + Properties.getSeparator(this.type);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void save(BaseDataSaver baseDataSaver) {
        Utils.writeFile(CrasheyeFileFilter.createNewFile(), toJsonLine());
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(Context context, NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }
}
