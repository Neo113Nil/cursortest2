package com.xsj.crasheye;

/* loaded from: classes2.dex */
public interface CrasheyeCallback {
    void dataSaverResponse(DataSaverResponse dataSaverResponse);

    void lastBreath(Exception exc);

    void netSenderResponse(NetSenderResponse netSenderResponse);
}
