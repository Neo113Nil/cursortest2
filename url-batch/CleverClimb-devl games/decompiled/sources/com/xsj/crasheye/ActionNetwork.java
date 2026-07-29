package com.xsj.crasheye;

import android.content.Context;
import com.umeng.analytics.pro.b;
import com.umeng.commonsdk.proguard.d;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ActionNetwork extends BaseDTO implements InterfaceDataType {
    private String exception;
    private Boolean failed;
    private Long latency;
    private String protocol;
    private Long requestLength;
    private Long responseLength;
    private Integer statusCode;
    private String url;

    @Override // com.xsj.crasheye.BaseDTO
    public /* bridge */ /* synthetic */ JSONObject getBasicDataFixtureJson() {
        return super.getBasicDataFixtureJson();
    }

    public ActionNetwork(EnumActionType enumActionType, String str, HashMap<String, Object> hashMap) {
        super(enumActionType, hashMap);
        this.url = "";
        this.latency = 0L;
        this.statusCode = 0;
        this.responseLength = 0L;
        this.requestLength = 0L;
        this.failed = true;
        this.exception = "NA";
        this.protocol = "NA";
        this.url = str;
    }

    public static final void logNetwork(String str, long j, long j2, String str2, int i, long j3, long j4, String str3, HashMap<String, Object> hashMap) {
        ActionNetwork actionNetwork = new ActionNetwork(EnumActionType.network, str, hashMap);
        actionNetwork.latency = Long.valueOf(j2 - j);
        actionNetwork.statusCode = Integer.valueOf(i);
        actionNetwork.responseLength = Long.valueOf(j4);
        actionNetwork.requestLength = Long.valueOf(j3);
        if (actionNetwork.statusCode.intValue() >= 200 && actionNetwork.statusCode.intValue() < 400) {
            actionNetwork.failed = false;
        } else {
            actionNetwork.failed = true;
        }
        actionNetwork.exception = str3;
        actionNetwork.protocol = str2;
        actionNetwork.save(new AsyncDataSaver());
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public String toJsonLine() {
        JSONObject basicDataFixtureJson = getBasicDataFixtureJson();
        try {
            basicDataFixtureJson.put("url", stripHttpFromUrl(this.url));
            basicDataFixtureJson.put(d.ay, this.latency);
            basicDataFixtureJson.put("statusCode", this.statusCode);
            basicDataFixtureJson.put("responseLength", this.responseLength);
            basicDataFixtureJson.put("requestLength", this.requestLength);
            basicDataFixtureJson.put("failed", this.failed);
            basicDataFixtureJson.put("protocol", this.protocol);
            if (this.exception != null && this.exception.length() > 0) {
                basicDataFixtureJson.put(b.ao, this.exception);
            } else {
                basicDataFixtureJson.put(b.ao, "NA");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return String.valueOf(basicDataFixtureJson.toString()) + Properties.getSeparator(EnumActionType.network);
    }

    private static final String stripHttpFromUrl(String str) {
        if (str != null) {
            if (str.toLowerCase().startsWith("http://")) {
                return str.replaceFirst("(?i)http://", "");
            }
            if (str.toLowerCase().startsWith("https://")) {
                return str.replaceFirst("(?i)https://", "");
            }
        }
        return str;
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(Context context, NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void save(BaseDataSaver baseDataSaver) {
        baseDataSaver.save(toJsonLine());
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }
}
