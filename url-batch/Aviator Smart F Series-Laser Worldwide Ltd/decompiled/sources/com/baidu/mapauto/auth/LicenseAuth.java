package com.baidu.mapauto.auth;

import android.content.Context;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.util.LogUtil;
import java.util.Map;

/* loaded from: classes2.dex */
public final class LicenseAuth {

    /* renamed from: b, reason: collision with root package name */
    public static volatile LicenseAuth f7720b;

    /* renamed from: a, reason: collision with root package name */
    public final AuthCore f7721a = new AuthCore();

    public static LicenseAuth getInstance() {
        if (f7720b == null) {
            synchronized (LicenseAuth.class) {
                try {
                    if (f7720b == null) {
                        f7720b = new LicenseAuth();
                    }
                } finally {
                }
            }
        }
        return f7720b;
    }

    public void loadAuth(Context context, String str, String str2, String str3, String str4, int i8, ILicenseAuthListener iLicenseAuthListener) {
        loadAuth(context, str, str2, str3, str4, null, i8, null, iLicenseAuthListener);
    }

    public Map<String, Integer> loadLocalAuth(Context context, String str, String str2, int i8) {
        return this.f7721a.a(context, null, null, null, str, str2, i8);
    }

    public void setDebug(Boolean bool) {
        LogUtil.getInstance().openLog(bool);
    }

    public void loadAuth(Context context, String str, String str2, String str3, String str4, int i8, Map<String, Object> map, ILicenseAuthListener iLicenseAuthListener) {
        loadAuth(context, str, str2, str3, str4, null, i8, map, iLicenseAuthListener);
    }

    public Map<String, Integer> loadLocalAuth(Context context, String str, String str2, String str3, int i8) {
        return this.f7721a.a(context, null, null, str, str2, str3, i8);
    }

    public void loadAuth(Context context, String str, String str2, String str3, String str4, String str5, int i8, int i9, Map<String, Object> map, ILicenseAuthListener iLicenseAuthListener) {
        this.f7721a.a(context.getApplicationContext(), new AuthCore.AuthParam(str, str2, str3, str4, str5, i8, map), i9, iLicenseAuthListener);
    }

    public Map<String, Integer> loadLocalAuth(Context context, String str, String str2, String str3, String str4, String str5, int i8) {
        return this.f7721a.a(context, str, str3, str2, str4, str5, i8);
    }

    public void loadAuth(Context context, String str, String str2, String str3, String str4, String str5, int i8, Map<String, Object> map, ILicenseAuthListener iLicenseAuthListener) {
        this.f7721a.a(context.getApplicationContext(), new AuthCore.AuthParam(str, str2, str3, str4, str5, 1, map), i8, iLicenseAuthListener);
    }
}
