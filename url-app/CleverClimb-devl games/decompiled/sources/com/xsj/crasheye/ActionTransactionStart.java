package com.xsj.crasheye;

import android.content.Context;
import com.applovin.sdk.AppLovinEventParameters;
import com.xsj.crasheye.util.Utils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class ActionTransactionStart extends ActionTransaction implements InterfaceDataType {
    private ActionTransactionStart(String str, HashMap<String, Object> hashMap) {
        super(str, EnumActionType.trstart, hashMap);
        this.transaction_id = Utils.getRandomSessionNumber();
        if (Properties.transactions.contains(this.transaction_id)) {
            return;
        }
        Properties.transactions.add(this.transaction_id);
    }

    public static ActionTransactionStart createTransactionStart(String str, HashMap<String, Object> hashMap) {
        ActionTransactionStart actionTransactionStart = new ActionTransactionStart(str, hashMap);
        Properties.transactionsDatabase.addStartedTransaction(actionTransactionStart);
        return actionTransactionStart;
    }

    @Override // com.xsj.crasheye.ActionTransaction, com.xsj.crasheye.InterfaceDataType
    public String toJsonLine() {
        JSONObject basicDataFixtureJson = getBasicDataFixtureJson();
        try {
            basicDataFixtureJson.put("tr_name", this.name);
            basicDataFixtureJson.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, this.transaction_id);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return String.valueOf(basicDataFixtureJson.toString()) + Properties.getSeparator(EnumActionType.trstart);
    }

    @Override // com.xsj.crasheye.ActionTransaction, com.xsj.crasheye.InterfaceDataType
    public void send(NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void save(BaseDataSaver baseDataSaver) {
        new AsyncDataSaver().save(toJsonLine());
    }

    @Override // com.xsj.crasheye.ActionTransaction, com.xsj.crasheye.InterfaceDataType
    public void send(Context context, NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }
}
