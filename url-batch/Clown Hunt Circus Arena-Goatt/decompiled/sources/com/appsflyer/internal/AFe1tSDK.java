package com.appsflyer.internal;

import android.content.pm.PackageManager;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Map;

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

    String valueOf() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException;

    void valueOf(Map<String, Object> map);

    String values();

    void values(Map<String, ? extends Object> map);

    void values(Map<String, Object> map, boolean z);
}
