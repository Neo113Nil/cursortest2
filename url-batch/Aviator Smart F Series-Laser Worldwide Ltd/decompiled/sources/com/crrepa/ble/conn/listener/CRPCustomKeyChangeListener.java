package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPCustomKeyInfo;
import com.crrepa.ble.conn.type.CRPCustomKeyGameType;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPCustomKeyChangeListener {
    void onSendResult(boolean z7);

    void onSupportFeatureList(CRPCustomKeyInfo cRPCustomKeyInfo, List<CRPCustomKeyType> list);

    void onSupportGameList(List<CRPCustomKeyGameType> list);

    void onSupportTrainingList(List<Integer> list);
}
