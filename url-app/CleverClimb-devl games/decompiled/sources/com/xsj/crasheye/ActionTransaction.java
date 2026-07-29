package com.xsj.crasheye;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
abstract class ActionTransaction extends BaseDTO implements InterfaceDataType {
    protected String name;
    protected String transaction_id;

    protected ActionTransaction(String str, EnumActionType enumActionType, HashMap<String, Object> hashMap) {
        super(enumActionType, hashMap);
        this.name = "";
        this.transaction_id = "";
        this.name = str;
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public String toJsonLine() {
        return Properties.getSeparator(EnumActionType.trstart);
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }

    public void save(AsyncDataSaver asyncDataSaver) {
        new AsyncDataSaver().save(toJsonLine());
    }

    @Override // com.xsj.crasheye.InterfaceDataType
    public void send(Context context, NetSender netSender, boolean z) {
        netSender.send(toJsonLine(), z);
    }
}
