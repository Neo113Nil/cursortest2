package com.appsflyer.internal;

import java.text.SimpleDateFormat;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface AFe1tSDK {
    String AFInAppEventParameterName();

    String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat);

    void AFInAppEventParameterName(boolean z, Map<String, Object> map, int i);

    String AFInAppEventType();

    void AFInAppEventType(Map<String, Object> map);

    void AFInAppEventType(Map<String, Object> map, String str);

    long AFKeystoreWrapper();

    void AFKeystoreWrapper(Map<String, Object> map);

    void AFKeystoreWrapper(Map<String, Object> map, String str);

    boolean AFLogger();

    String afDebugLog();

    boolean afErrorLog();

    boolean afInfoLog();

    String valueOf();

    void valueOf(Map<String, Object> map);

    String values();

    void values(Map<String, ? extends Object> map);

    void values(Map<String, Object> map, boolean z);
}
