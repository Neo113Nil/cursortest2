package com.cmplay.internalpush;

import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: ReportInfocHelper.java */
/* loaded from: classes.dex */
public class o {

    /* compiled from: ReportInfocHelper.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static o f4273a = new o();
    }

    public static o a() {
        return a.f4273a;
    }

    public void a(String str, String str2, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = str2 + "&uptime2=" + String.valueOf(currentTimeMillis / 1000) + "&player_time=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(currentTimeMillis)) + "&network=" + String.valueOf(com.cmplay.base.util.s.a(k.f4264a));
        com.cmplay.base.util.h.a("reportNeituiApp", "reportAction   InternalPushManager.getInnerPushCallBack():" + k.a());
        if (k.a() != null) {
            k.a().a(str, str3, z);
        }
    }

    public void a(int i, int i2, String str, long j, String str2, int i3, int i4, long j2) {
        a(com.cmplay.base.util.j.a() + "_neitui_app", "source=" + i + "&action=" + i2 + "&scenes=" + i3 + "&scene=" + i4 + "&pkgname=" + str + "&pro_id=" + j + "&remark=" + str2 + "&priority=" + j2 + "&sdk_version=" + q.f4278b + "&reserve1=&reserve2=", true);
    }

    public void a(String str, int i, String str2, String str3) {
        a(com.cmplay.base.util.j.a() + "_cloud_magic", "magic_ver=" + str + "&action=" + i + "&remark=" + str2 + "&error_url=" + str3 + "&reserve1=&reserve2=", true);
    }
}
