package com.startapp.sdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.common.utils.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class e9 extends u1 {
    public final n8 n0;
    public String o0;
    public String p0;
    public String q0;
    public String r0;
    public String s0;
    public String t0;
    public Map u0;

    public e9(n8 n8Var) {
        super(8);
        this.n0 = n8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.u1
    public final void a(be beVar) {
        super.a(beVar);
        n8 n8Var = this.n0;
        Long l = n8Var.h;
        String l2 = l != null ? l.toString() : g.a();
        beVar.a(g.b, l2, true, true);
        beVar.a(g.c, g.a(l2), true, true);
        beVar.a("category", n8Var.f348a.f361a, true, true);
        beVar.a("value", n8Var.d, false, true);
        beVar.a("d", n8Var.g, false, true);
        beVar.a("appActivity", n8Var.i, false, true);
        beVar.a("details", n8Var.e, false, true);
        beVar.a("detailsJson", n8Var.f, false, true);
        beVar.a("isService", Boolean.valueOf(n8Var.j), false, true);
        beVar.a("orientation", this.o0, false, true);
        beVar.a("usedRam", this.p0, false, true);
        beVar.a("freeRam", this.q0, false, true);
        beVar.a("sessionTime", null, false, true);
        beVar.a("cellScanRes", this.r0, false, true);
        beVar.a("sens", this.s0, false, true);
        beVar.a("bt", this.t0, false, true);
        Pair a2 = com.startapp.sdk.adsbase.g.a();
        Pair b = com.startapp.sdk.adsbase.g.b();
        beVar.a((String) a2.first, a2.second, false, true);
        beVar.a((String) b.first, b.second, false, true);
        Map map = this.u0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                beVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        beVar.a("rcd", null, false, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(8:5|(1:7)(1:(1:24))|8|9|10|(1:12)|14|15)|25|8|9|10|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (com.startapp.sdk.internal.zh.a(r10, java.lang.SecurityException.class) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        com.startapp.sdk.internal.n8.a(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:10:0x0029, B:12:0x0033), top: B:9:0x0029 }] */
    @Override // com.startapp.sdk.internal.u1
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
            int i = configuration.orientation;
            if (i == 2) {
                str = "landscape";
            } else if (i == 1) {
                str = "portrait";
            }
            this.o0 = str;
            String[] strArr = {null, null};
            activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                strArr[0] = Long.toString(memoryInfo.availMem / 1048576);
                strArr[1] = Long.toString((m0.a(memoryInfo).longValue() - memoryInfo.availMem) / 1048576);
            }
            this.q0 = strArr[0];
            this.p0 = strArr[1];
        }
        str = StringUtils.UNDEFINED;
        this.o0 = str;
        String[] strArr2 = {null, null};
        activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
        }
        this.q0 = strArr2[0];
        this.p0 = strArr2[1];
    }

    public final String toString() {
        return this.n0.toString();
    }
}
