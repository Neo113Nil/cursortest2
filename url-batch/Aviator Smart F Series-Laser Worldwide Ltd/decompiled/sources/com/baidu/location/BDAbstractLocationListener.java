package com.baidu.location;

/* loaded from: classes2.dex */
public abstract class BDAbstractLocationListener {
    public void onConnectHotSpotMessage(String str, int i8) {
    }

    public void onLocDiagnosticMessage(int i8, int i9, String str) {
    }

    public void onReceiveLocString(String str) {
    }

    public abstract void onReceiveLocation(BDLocation bDLocation);

    public void onReceiveVdrLocation(BDLocation bDLocation) {
    }
}
