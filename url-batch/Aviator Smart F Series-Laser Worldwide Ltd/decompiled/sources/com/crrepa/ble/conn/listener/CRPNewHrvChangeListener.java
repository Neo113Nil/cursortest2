package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPHistoryHrvInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPNewHrvChangeListener {
    void onHistoryHrv(List<CRPHistoryHrvInfo> list);

    void onHrv(int i8);

    void onSupportHrv(boolean z7);
}
