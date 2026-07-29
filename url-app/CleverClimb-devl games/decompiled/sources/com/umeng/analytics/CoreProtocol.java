package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.pro.i;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CoreProtocol implements UMLogDataProtocol {

    /* renamed from: a, reason: collision with root package name */
    private static Context f8819a;

    private CoreProtocol() {
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final CoreProtocol f8820a = new CoreProtocol();

        private a() {
        }
    }

    public static CoreProtocol getInstance(Context context) {
        if (f8819a == null && context != null) {
            f8819a = context.getApplicationContext();
        }
        return a.f8820a;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i) {
        i.a(f8819a).a(obj, i);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        i.a(f8819a).a(obj);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        return i.a(f8819a).b(j);
    }
}
