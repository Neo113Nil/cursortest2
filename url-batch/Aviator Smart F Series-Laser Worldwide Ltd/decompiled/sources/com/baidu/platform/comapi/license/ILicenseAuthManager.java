package com.baidu.platform.comapi.license;

import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
public interface ILicenseAuthManager {
    boolean isEffective(String str, String str2);

    boolean isHaveAuthority();

    boolean isHaveAuthority(Map<String, Integer> map);

    void loadAuth(Context context, ILicenseAuthManagerListener iLicenseAuthManagerListener);

    Map<String, Integer> loadLocalAuth(Context context);
}
