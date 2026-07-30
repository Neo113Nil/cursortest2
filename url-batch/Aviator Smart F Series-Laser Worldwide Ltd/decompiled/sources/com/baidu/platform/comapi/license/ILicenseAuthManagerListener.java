package com.baidu.platform.comapi.license;

import java.util.Map;

/* loaded from: classes2.dex */
public interface ILicenseAuthManagerListener {
    void onError(String str, String str2, int i8, int i9, String str3);

    void onSuccess(String str, String str2, int i8, Map<String, Integer> map);
}
