package com.xsj.crasheye;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Base64;
import com.xsj.crasheye.util.EnumStateStatus;
import com.xsj.crasheye.util.Utils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class ActionNativeError extends BaseDTO implements InterfaceDataType {
    private JSONArray breadcrumbs;
    private String dumpFile;
    private String dumptype;
    private EnumStateStatus gpsStatus;
    private Boolean handled;
    private Boolean lastNotSave;
    private String memAppAvailable;
    private String memAppMax;
    private String memAppTotal;
    private String memSysAvailable;
    private String memSysLow;
    private String memSysThreshold;
    private String memSysTotal;
    private String msFromStart;
    private String nativefile;
    private String sigName;
    private String stacktrace;

    public ActionNativeError(String str, String str2) {
        super(EnumActionType.ndkerror, null);
        this.stacktrace = "";
        this.memSysTotal = null;
        this.memSysAvailable = null;
        this.lastNotSave = false;
        this.stacktrace = str2;
        this.handled = false;
        this.dumptype = EnumErrorType.unityndk.toString();
        this.sigName = str;
        this.stacktrace = str2;
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
        this.extraData = Properties.extraData;
    }

    public ActionNativeError(String str) {
        super(EnumActionType.ndkerror, null);
        this.stacktrace = "";
        this.memSysTotal = null;
        this.memSysAvailable = null;
        this.lastNotSave = false;
        this.dumptype = EnumErrorType.ndk.toString();
        this.handled = false;
        this.dumpFile = str;
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
    }

    public void SetNativeCrashData(String str) {
        try {
            byte[] bArr = new byte[(int) new File(str).length()];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            bufferedInputStream.read(bArr, 0, bArr.length);
            bufferedInputStream.close();
            this.nativefile = Base64.encodeToString(bArr, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SetLastUnSave() {
        this.lastNotSave = true;
    }

    public JSONObject toJson() {
        JSONObject basicDataFixtureJson = getBasicDataFixtureJson();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stack", this.stacktrace);
            jSONObject.put("error", this.sigName);
            jSONObject.put("dumpfile", this.dumpFile);
            jSONObject.put("file", this.nativefile);
            basicDataFixtureJson.put("crash", jSONObject);
            basicDataFixtureJson.put("dumptype", this.dumptype);
            basicDataFixtureJson.put("handled", this.handled);
            basicDataFixtureJson.put("rooted", this.rooted);
            if (!this.lastNotSave.booleanValue()) {
                basicDataFixtureJson.put("gpsstatus", this.gpsStatus.toString());
                basicDataFixtureJson.put("msfromstart", this.msFromStart);
                if (this.breadcrumbs != null && this.breadcrumbs.length() > 0) {
                    basicDataFixtureJson.put("breadcrumbs", this.breadcrumbs);
                }
                basicDataFixtureJson.put("memsysLow", this.memSysLow);
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
            } else {
                basicDataFixtureJson.remove("extradata");
                basicDataFixtureJson.remove("transactions");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return basicDataFixtureJson;
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public String toJsonLine() {
        return toJson().toString();
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void save(BaseDataSaver baseDataSaver) {
        new NativeExceptionDataSaver().save(toJsonLine());
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(Context context, NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }
}
