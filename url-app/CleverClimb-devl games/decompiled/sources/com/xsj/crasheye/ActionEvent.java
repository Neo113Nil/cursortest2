package com.xsj.crasheye;

import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import com.tapjoy.TJAdUnitConstants;
import com.xsj.crasheye.Properties;
import com.xsj.crasheye.log.Logger;
import com.xsj.crasheye.pushstrategy.DateRefreshStrategy;
import com.xsj.crasheye.util.Utils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ActionEvent extends BaseDTO implements InterfaceDataType {
    protected static String savedSessionID = "";
    protected long duration;
    protected Integer eventLevel;
    protected String eventName;
    protected String session_id;

    @Override // com.xsj.crasheye.BaseDTO
    public /* bridge */ /* synthetic */ JSONObject getBasicDataFixtureJson() {
        return super.getBasicDataFixtureJson();
    }

    public ActionEvent(EnumActionType enumActionType, String str, Integer num, HashMap<String, Object> hashMap) {
        super(enumActionType, hashMap);
        this.eventName = "";
        this.eventLevel = null;
        this.duration = -1L;
        this.session_id = "";
        this.eventName = str;
        this.eventLevel = num;
        if (enumActionType == EnumActionType.ping) {
            this.session_id = Utils.getRandomSessionNumber();
            savedSessionID = this.session_id;
        } else if (enumActionType == EnumActionType.gnip) {
            this.session_id = savedSessionID;
        }
    }

    public static final ActionEvent createEvent(String str) {
        return new ActionEvent(EnumActionType.event, str, Integer.valueOf(Utils.convertLoggingLevelToInt(CrasheyeLogLevel.Verbose)), null);
    }

    public static final ActionEvent createEvent(String str, CrasheyeLogLevel crasheyeLogLevel, HashMap<String, Object> hashMap) {
        return new ActionEvent(EnumActionType.event, str, Integer.valueOf(Utils.convertLoggingLevelToInt(crasheyeLogLevel)), hashMap);
    }

    public static final ActionEvent createPing() {
        ActionEvent actionEvent = new ActionEvent(EnumActionType.ping, null, null, null);
        Properties.lastPingTime = actionEvent.timestampMilis.longValue();
        return actionEvent;
    }

    public static final ActionEvent createGnip() {
        ActionEvent actionEvent = new ActionEvent(EnumActionType.gnip, null, null, null);
        actionEvent.duration = actionEvent.timestampMilis.longValue() - Properties.lastPingTime;
        return actionEvent;
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public String toJsonLine() {
        JSONObject basicDataFixtureJson = getBasicDataFixtureJson();
        try {
            basicDataFixtureJson.remove("isservice");
        } catch (Exception unused) {
        }
        try {
            if (this.duration != -1) {
                basicDataFixtureJson.put("ses_duration", this.duration);
            }
            if (this.eventName != null) {
                basicDataFixtureJson.put(TJAdUnitConstants.PARAM_PLACEMENT_NAME, this.eventName);
            }
            if (this.eventLevel != null) {
                basicDataFixtureJson.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.eventLevel);
            }
            if (this.type != EnumActionType.event) {
                basicDataFixtureJson.put("sessionid", this.session_id);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return String.valueOf(basicDataFixtureJson.toString()) + Properties.getSeparator(this.type);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(Context context, NetSender netSender, boolean z) {
        if (this.type.equals(EnumActionType.ping)) {
            RemoteSettingsData convertJsonToRemoteSettings = RemoteSettings.convertJsonToRemoteSettings(netSender.sendBlocking(null, toJsonLine(), z, true).getServerResponse());
            if (convertJsonToRemoteSettings == null) {
                Logger.logInfo("send return RemoteData is null, revert send report host!");
                RemoteSettings.revertAndLoadSendReoprtHost(context);
                return;
            }
            if ((convertJsonToRemoteSettings.actionSpan.intValue() < 1 || convertJsonToRemoteSettings.actionSpan.intValue() > 23) && convertJsonToRemoteSettings.actionSpan.intValue() != -1) {
                return;
            }
            if (convertJsonToRemoteSettings.actionCounts.intValue() > 0 || convertJsonToRemoteSettings.actionCounts.intValue() == -1) {
                if (((convertJsonToRemoteSettings.actionHost.intValue() < 0 || convertJsonToRemoteSettings.actionHost.intValue() > 99) && convertJsonToRemoteSettings.actionHost.intValue() != -1) || !RemoteSettings.saveAndLoadRemoteSettings(context, convertJsonToRemoteSettings)) {
                    return;
                }
                DateRefreshStrategy.getInstance().updataRecordStartDate(Utils.getTimeForLong());
                DateRefreshStrategy.getInstance().saveRecordStartDate(context);
                return;
            }
            return;
        }
        netSender.send(toJsonLine(), z);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void save(BaseDataSaver baseDataSaver) {
        if (this.eventLevel != null) {
            if (this.eventLevel.intValue() >= Properties.RemoteSettingsProps.eventLevel.intValue()) {
                baseDataSaver.save(toJsonLine());
                return;
            } else {
                Logger.logInfo("Event's level is lower than the minimum level from Remote Settings, event will not be saved");
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
