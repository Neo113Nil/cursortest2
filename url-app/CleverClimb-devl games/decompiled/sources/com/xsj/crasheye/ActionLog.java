package com.xsj.crasheye;

import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import com.xsj.crasheye.Properties;
import com.xsj.crasheye.log.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class ActionLog extends BaseDTO implements InterfaceDataType {
    public Integer eventLevel;
    public String eventName;

    public ActionLog(EnumActionType enumActionType, String str, Integer num) {
        super(enumActionType, null);
        this.eventName = "";
        this.eventLevel = 2;
        this.eventName = str;
        this.eventLevel = num;
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public String toJsonLine() {
        JSONObject basicDataFixtureJson = getBasicDataFixtureJson();
        try {
            basicDataFixtureJson.put("log_name", this.eventName);
            basicDataFixtureJson.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.eventLevel);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return String.valueOf(basicDataFixtureJson.toString()) + Properties.getSeparator(this.type);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(Context context, NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void save(BaseDataSaver baseDataSaver) {
        if (this.eventLevel != null) {
            if (this.eventLevel.intValue() >= Properties.RemoteSettingsProps.logLevel.intValue()) {
                baseDataSaver.save(toJsonLine());
                return;
            } else {
                Logger.logInfo("Logs's level is lower than the minimum level from Remote Settings, log will not be saved");
                return;
            }
        }
        baseDataSaver.save(toJsonLine());
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }
}
