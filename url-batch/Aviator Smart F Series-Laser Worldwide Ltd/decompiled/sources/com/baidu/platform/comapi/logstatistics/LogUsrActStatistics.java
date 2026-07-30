package com.baidu.platform.comapi.logstatistics;

import com.baidu.ar.auth.FeatureCodes;
import java.util.Map;

/* loaded from: classes2.dex */
public class LogUsrActStatistics extends com.baidu.platform.comapi.logstatistics.a {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final LogUsrActStatistics f9351a = new LogUsrActStatistics();
    }

    public static LogUsrActStatistics getInstance() {
        return b.f9351a;
    }

    public void addLogWithLowLevel(String str, String str2, String str3, Map<String, Object> map) {
        LogStatistics.getInstance().addLogWithMap(FeatureCodes.FACE, 1, appendLogTag(str, str2, str3), map);
    }

    private LogUsrActStatistics() {
    }
}
