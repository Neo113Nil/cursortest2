package com.xsj.crasheye;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class ActionView extends BaseDTO implements InterfaceDataType {
    public String viewName;

    public ActionView(EnumActionType enumActionType, String str) {
        super(enumActionType, null);
        this.viewName = "";
        this.viewName = str;
    }

    public static final ActionView logView(String str) {
        return new ActionView(EnumActionType.view, str);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public String toJsonLine() {
        JSONObject basicDataFixtureJson = getBasicDataFixtureJson();
        try {
            if (this.viewName != null) {
                basicDataFixtureJson.put("view_name", this.viewName);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return String.valueOf(basicDataFixtureJson.toString()) + Properties.getSeparator(EnumActionType.view);
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
