package com.startapp.sdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.common.utils.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class u9 extends y1 {

    /* renamed from: n0, reason: collision with root package name */
    public final d9 f7686n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f7687o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f7688p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f7689q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f7690r0;

    /* renamed from: s0, reason: collision with root package name */
    public String f7691s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f7692t0;

    /* renamed from: u0, reason: collision with root package name */
    public Map f7693u0;

    public u9(d9 d9Var) {
        super(8);
        this.f7686n0 = d9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        d9 d9Var = this.f7686n0;
        Long l4 = d9Var.f6796h;
        String l5 = l4 != null ? l4.toString() : AbstractC0366g.a();
        seVar.a(AbstractC0366g.f6958b, l5, true, true);
        seVar.a(AbstractC0366g.f6959c, AbstractC0366g.a(l5), true, true);
        seVar.a("category", d9Var.f6789a.f6849a, true, true);
        seVar.a("value", d9Var.f6792d, false, true);
        seVar.a("d", d9Var.f6795g, false, true);
        seVar.a("appActivity", d9Var.f6797i, false, true);
        seVar.a("details", d9Var.f6793e, false, true);
        seVar.a("detailsJson", d9Var.f6794f, false, true);
        seVar.a("isService", Boolean.valueOf(d9Var.f6798j), false, true);
        seVar.a("orientation", this.f7687o0, false, true);
        seVar.a("usedRam", this.f7688p0, false, true);
        seVar.a("freeRam", this.f7689q0, false, true);
        seVar.a("sessionTime", null, false, true);
        seVar.a("cellScanRes", this.f7690r0, false, true);
        seVar.a("sens", this.f7691s0, false, true);
        seVar.a("bt", this.f7692t0, false, true);
        Pair a3 = com.startapp.sdk.adsbase.g.a();
        Pair b4 = com.startapp.sdk.adsbase.g.b();
        seVar.a((String) a3.first, a3.second, false, true);
        seVar.a((String) b4.first, b4.second, false, true);
        Map map = this.f7693u0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                seVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        seVar.a("rcd", null, false, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(8:5|(1:7)(1:(1:24))|8|9|10|(1:12)|14|15)|25|8|9|10|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (com.startapp.sdk.internal.si.a(r10, java.lang.SecurityException.class) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        com.startapp.sdk.internal.d9.a(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:10:0x0029, B:12:0x0033), top: B:9:0x0029 }] */
    @Override // com.startapp.sdk.internal.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Context context, AdPreferences adPreferences) {
        String str;
        ActivityManager activityManager;
        Configuration configuration;
        super.b(context, adPreferences);
        Resources resources = context.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            int i4 = configuration.orientation;
            if (i4 == 2) {
                str = "landscape";
            } else if (i4 == 1) {
                str = "portrait";
            }
            this.f7687o0 = str;
            String[] strArr = {null, null};
            activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                strArr[0] = Long.toString(memoryInfo.availMem / 1048576);
                strArr[1] = Long.toString((p0.a(memoryInfo).longValue() - memoryInfo.availMem) / 1048576);
            }
            this.f7689q0 = strArr[0];
            this.f7688p0 = strArr[1];
        }
        str = StringUtils.UNDEFINED;
        this.f7687o0 = str;
        String[] strArr2 = {null, null};
        activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
        }
        this.f7689q0 = strArr2[0];
        this.f7688p0 = strArr2[1];
    }

    public final String toString() {
        return this.f7686n0.toString();
    }
}
