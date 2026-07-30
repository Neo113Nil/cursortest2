package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPLocalNavigationIconInfo;

/* loaded from: classes3.dex */
public interface CRPLocalNavigationListener {
    void onNavigationIconConfig(CRPLocalNavigationIconInfo cRPLocalNavigationIconInfo);

    void onStopNavigation();

    void onSupportedLocalNavigation();
}
