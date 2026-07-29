package com.youappi.sdk.logic;

import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.net.model.DeviceOrientation;
import com.youappi.sdk.net.model.VastError;

/* loaded from: classes2.dex */
public interface IAdEventListener {
    void onGotEvent(String str, VastError vastError, String str2, DeviceOrientation deviceOrientation, int i, AdItem adItem);
}
