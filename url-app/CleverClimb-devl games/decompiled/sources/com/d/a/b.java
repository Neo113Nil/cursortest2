package com.d.a;

import com.applovin.sdk.AppLovinErrorCodes;

/* compiled from: ErrorUtils.java */
/* loaded from: classes.dex */
final class b {
    static int a(String str) {
        if (str == null) {
            return -101;
        }
        if (str.equalsIgnoreCase("FNC") || str.equalsIgnoreCase("open failed: ENOENT (No such file or directory)")) {
            return AppLovinErrorCodes.FETCH_AD_TIMEOUT;
        }
        if (str.equalsIgnoreCase("TI")) {
            return AppLovinErrorCodes.NO_NETWORK;
        }
        if (str.equalsIgnoreCase("DIE")) {
            return -118;
        }
        if (str.equalsIgnoreCase("recvfrom failed: ETIMEDOUT (Connection timed out)") || str.equalsIgnoreCase("timeout")) {
            return -104;
        }
        if (str.equalsIgnoreCase("java.io.IOException: 404") || str.contains("No address associated with hostname")) {
            return -106;
        }
        if (str.contains("Unable to resolve host")) {
            return -105;
        }
        if (str.equalsIgnoreCase("open failed: EACCES (Permission denied)")) {
            return -107;
        }
        if (str.equalsIgnoreCase("write failed: ENOSPC (No space left on device)") || str.equalsIgnoreCase("database or disk is full (code 13)")) {
            return -108;
        }
        if (str.contains("SSRV:")) {
            return -110;
        }
        return str.contains("column _file_path is not unique") ? -113 : -101;
    }
}
