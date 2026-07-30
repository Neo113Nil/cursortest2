package com.baidu.platform.comapi.f;

import com.baidu.ar.auth.FeatureCodes;
import com.baidu.platform.comapi.logstatistics.LogStatistics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static JSONObject f9010a;

    /* renamed from: b, reason: collision with root package name */
    public static a f9011b;

    /* renamed from: c, reason: collision with root package name */
    private LogStatistics f9012c = null;

    public static a a() {
        if (f9011b == null) {
            f9011b = new a();
        }
        if (f9010a == null) {
            f9010a = new JSONObject();
        }
        return f9011b;
    }

    private void b() {
        f9010a = null;
        f9010a = new JSONObject();
    }

    public synchronized boolean a(String str) {
        boolean z7;
        try {
            if (this.f9012c == null) {
                this.f9012c = LogStatistics.getInstance();
            }
            if (this.f9012c != null) {
                JSONObject jSONObject = f9010a;
                if (jSONObject != null && jSONObject.length() > 0) {
                    z7 = this.f9012c.addLog(FeatureCodes.BASIC_FILTER, 1, str, f9010a.toString());
                } else {
                    z7 = this.f9012c.addLog(FeatureCodes.BASIC_FILTER, 1, str, null);
                }
                b();
            } else {
                z7 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z7;
    }
}
