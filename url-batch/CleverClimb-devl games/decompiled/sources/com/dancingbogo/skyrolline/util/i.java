package com.dancingbogo.skyrolline.util;

import com.cmplay.kinfoc.report.KInfocReportClient;
import com.cmplay.kinfoc.report.KInfocReportManager;
import com.dancingbogo.skyrolline.GameApp;

/* compiled from: KinfocHelper.java */
/* loaded from: classes2.dex */
public class i {
    public static void a(final String str, final String str2, boolean z) {
        a.a(new Runnable() { // from class: com.dancingbogo.skyrolline.util.i.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    KInfocReportClient CreateClient = KInfocReportManager.getInstance().CreateClient();
                    CreateClient.SetTable(str);
                    CreateClient.AddInfo(str2);
                    KInfocReportManager.getInstance().Report(CreateClient);
                    com.cmplay.base.util.h.a("KinfocHelper", "internal_push  strTableName:" + str + "  strParams:" + str2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void b(final String str, final String str2, boolean z) {
        a.a(new Runnable() { // from class: com.dancingbogo.skyrolline.util.i.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String str3 = str2 + "&uptime=" + String.valueOf(System.currentTimeMillis() / 1000) + "&network=" + String.valueOf(l.a(GameApp.f4485a));
                    KInfocReportClient CreateClient = KInfocReportManager.getInstance().CreateClient();
                    CreateClient.SetTable(str);
                    CreateClient.AddInfo(str3);
                    KInfocReportManager.getInstance().Report(CreateClient);
                    b.b("KinfocHelper", str + " ============= reportRsinfoc:" + str2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
