package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPQuickResponsesCountInfo;
import com.crrepa.ble.conn.bean.CRPQuickResponsesDetailInfo;

/* loaded from: classes3.dex */
public interface CRPQuickResponsesChangeListener {
    void onQuickResponsesCount(CRPQuickResponsesCountInfo cRPQuickResponsesCountInfo);

    void onQuickResponsesDetail(CRPQuickResponsesDetailInfo cRPQuickResponsesDetailInfo);

    void onSendSms(String str);
}
