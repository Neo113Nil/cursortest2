package com.yandex.mobile.ads.impl;

import android.media.MediaDrm;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.auth.AuthCode;

/* loaded from: classes3.dex */
final class a40 {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        int a4 = u82.a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo());
        if (a4 == 2 || a4 == 4) {
            return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
        }
        if (a4 == 10) {
            return AuthCode.StatusCode.PERMISSION_NOT_EXIST;
        }
        if (a4 == 7) {
            return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
        }
        if (a4 == 8) {
            return AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
        }
        switch (a4) {
            case 15:
                return AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
            case 16:
            case 18:
                return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return AuthCode.StatusCode.PERMISSION_NOT_EXIST;
            default:
                switch (a4) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
                    default:
                        return AuthCode.StatusCode.PERMISSION_EXPIRED;
                }
        }
    }
}
