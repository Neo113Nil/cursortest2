package com.crrepa.ble.conn.callback;

import com.crrepa.ble.conn.bean.CRPAlarmInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPAlarmCallback {
    void onAlarmList(List<CRPAlarmInfo> list);

    void onNewAlarmList(List<CRPAlarmInfo> list);
}
