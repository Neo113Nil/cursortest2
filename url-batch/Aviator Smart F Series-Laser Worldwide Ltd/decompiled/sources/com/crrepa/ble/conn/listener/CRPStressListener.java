package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPHistoryStressInfo;
import com.crrepa.ble.conn.bean.CRPTimingStressInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPStressListener {
    void onHistoryStressChange(List<CRPHistoryStressInfo> list);

    void onStressChange(int i8);

    void onSupportStress(boolean z7);

    void onTimingStressChange(CRPTimingStressInfo cRPTimingStressInfo);

    void onTimingStressStateChange(boolean z7);
}
