package com.huawei.hms.framework.common;

/* loaded from: classes.dex */
public class SecurityRandomHelper {
    public static volatile SecurityRandomHelper instance;

    private SecurityRandomHelper() {
    }

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                try {
                    if (instance == null) {
                        S0.a.f(true);
                        instance = new SecurityRandomHelper();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public byte[] generateSecureRandom(int i4) {
        return S0.a.d(i4);
    }

    public String generateSecureRandomStr(int i4) {
        return S0.a.e(i4);
    }
}
