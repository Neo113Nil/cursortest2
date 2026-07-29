package com.xsj.crasheye;

import android.content.Context;
import com.applovin.sdk.AppLovinEventParameters;
import com.xsj.crasheye.TransactionsDatabase;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ActionTransactionStop extends ActionTransaction implements InterfaceDataType {
    protected long duration;
    protected String reason;
    protected EnumTransactionStatus status;

    @Override // com.xsj.crasheye.BaseDTO
    public /* bridge */ /* synthetic */ JSONObject getBasicDataFixtureJson() {
        return super.getBasicDataFixtureJson();
    }

    @Override // com.xsj.crasheye.ActionTransaction
    public /* bridge */ /* synthetic */ void save(AsyncDataSaver asyncDataSaver) {
        super.save(asyncDataSaver);
    }

    private ActionTransactionStop(String str, EnumTransactionStatus enumTransactionStatus, String str2, HashMap<String, Object> hashMap) {
        super(str, EnumActionType.trstop, hashMap);
        this.duration = 0L;
        this.status = EnumTransactionStatus.FAIL;
        this.reason = "";
        this.status = enumTransactionStatus;
        this.reason = str2;
        if (str2 == null || str2.length() == 0) {
            this.reason = "NA";
        }
        TransactionsDatabase.Container startedTransactionContainer = Properties.transactionsDatabase.getStartedTransactionContainer(str);
        if (startedTransactionContainer != null) {
            this.transaction_id = startedTransactionContainer.transid;
            long longValue = startedTransactionContainer.timestamp.longValue();
            if (longValue != -1) {
                this.duration = this.timestampMilis.longValue() - longValue;
            }
        } else {
            this.transaction_id = null;
        }
        Properties.transactionsDatabase.closeStartedTransaction(str);
    }

    protected static final ActionTransactionStop createTransactionStop(String str, HashMap<String, Object> hashMap) {
        return new ActionTransactionStop(str, EnumTransactionStatus.SUCCESS, null, hashMap);
    }

    protected static final ActionTransactionStop createTransactionCancel(String str, String str2, HashMap<String, Object> hashMap) {
        return new ActionTransactionStop(str, EnumTransactionStatus.CANCEL, str2, hashMap);
    }

    public static final ActionTransactionStop createTransactionFail(String str, String str2, HashMap<String, Object> hashMap) {
        return new ActionTransactionStop(str, EnumTransactionStatus.FAIL, str2, hashMap);
    }

    @Override // com.xsj.crasheye.ActionTransaction, com.xsj.crasheye.InterfaceDataType
    public String toJsonLine() {
        if (this.transaction_id == null) {
            return null;
        }
        JSONObject basicDataFixtureJson = getBasicDataFixtureJson();
        try {
            basicDataFixtureJson.put("tr_name", this.name);
            basicDataFixtureJson.put("status", this.status.toString());
            basicDataFixtureJson.put("reason", this.reason);
            basicDataFixtureJson.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, this.transaction_id);
            basicDataFixtureJson.put("tr_duration", String.valueOf(this.duration));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (Properties.transactions.contains(this.transaction_id)) {
            Properties.transactions.remove(this.transaction_id);
        }
        return String.valueOf(basicDataFixtureJson.toString()) + Properties.getSeparator(EnumActionType.trstop);
    }

    @Override // com.xsj.crasheye.ActionTransaction, com.xsj.crasheye.InterfaceDataType
    public void send(NetSender netSender, boolean z) {
        String jsonLine = toJsonLine();
        if (jsonLine != null) {
            netSender.send(jsonLine, z);
        }
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void save(BaseDataSaver baseDataSaver) {
        String jsonLine = toJsonLine();
        if (jsonLine != null) {
            new AsyncDataSaver().save(jsonLine);
        }
    }

    @Override // com.xsj.crasheye.ActionTransaction, com.xsj.crasheye.InterfaceDataType
    public void send(Context context, NetSender netSender, boolean z) {
        String jsonLine = toJsonLine();
        if (jsonLine != null) {
            netSender.send(jsonLine, z);
        }
    }
}
