package com.baidu.mapauto.auth;

import java.util.Map;

/* loaded from: classes2.dex */
public interface ILicenseAuthListener {
    void onError(int i8, String str, Exception exc);

    void onSuccess(Map<String, Integer> map);
}
