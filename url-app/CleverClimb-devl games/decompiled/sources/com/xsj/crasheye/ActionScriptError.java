package com.xsj.crasheye;

import android.content.Context;
import com.umeng.commonsdk.proguard.d;
import com.xsj.crasheye.util.EnumStateStatus;
import com.xsj.crasheye.util.Utils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class ActionScriptError extends BaseDTO implements InterfaceDataType {
    private JSONArray breadcrumbs;
    private int count;
    private EnumStateStatus gpsStatus;
    private Boolean handled;
    private String language;
    private String message;
    private String msFromStart;
    private String stacktrace;

    public ActionScriptError(String str, String str2, String str3, int i, HashMap<String, Object> hashMap) {
        super(EnumActionType.error, hashMap);
        this.message = str;
        this.stacktrace = str2;
        this.language = str3;
        this.count = i;
        this.handled = true;
        this.gpsStatus = Properties.IS_GPS_ON;
        this.msFromStart = Utils.getMilisFromStart();
        this.breadcrumbs = Properties.breadcrumbs.getList();
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public String toJsonLine() {
        JSONObject basicDataFixtureJson = getBasicDataFixtureJson();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stack", this.stacktrace);
            jSONObject.put("error", this.message);
            basicDataFixtureJson.put("crash", jSONObject);
            basicDataFixtureJson.put("screensize", this.screenSize);
            basicDataFixtureJson.put("dumptype", EnumErrorType.script.toString());
            basicDataFixtureJson.put("handled", this.handled);
            basicDataFixtureJson.put("rooted", this.rooted);
            basicDataFixtureJson.put("count", this.count);
            basicDataFixtureJson.put(d.M, this.language);
            basicDataFixtureJson.put("gpsstatus", this.gpsStatus.toString());
            basicDataFixtureJson.put("msfromstart", this.msFromStart);
            if (this.breadcrumbs != null && this.breadcrumbs.length() > 0) {
                basicDataFixtureJson.put("breadcrumbs", this.breadcrumbs);
            }
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
        new AsyncDataSaver().save(toJsonLine());
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(Context context, NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }
}
