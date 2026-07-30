package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPGpsPathInfo;
import com.crrepa.ble.conn.bean.CRPHisiliconEpoInfo;
import com.crrepa.ble.conn.type.CRPEpoType;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPGpsChangeListener {
    void onGpsPathChange(CRPGpsPathInfo cRPGpsPathInfo);

    void onHistoryGpsPathChange(List<Integer> list);

    void onLocationChanged(CRPGpsPathInfo.Location location);

    void onUpdateEpoChange(CRPEpoType cRPEpoType);

    void onUpdateGpsLocationChange();

    void onUpdateHisiliconEpoChange(CRPHisiliconEpoInfo cRPHisiliconEpoInfo);
}
