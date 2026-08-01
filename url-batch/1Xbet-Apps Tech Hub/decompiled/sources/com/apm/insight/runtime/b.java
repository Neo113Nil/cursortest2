package com.apm.insight.runtime;

import androidx.work.WorkRequest;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b {
    private static long a = -30000;
    private static File b;

    public static String a(long j, String str) {
        try {
            return com.apm.insight.l.i.c(new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/TrackInfo/" + ((j - (j % 86400000)) / 86400000) + "/" + str));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public static void a() {
        File file = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                com.apm.insight.l.i.a(new File(file, list[i]));
            }
        }
    }

    public static void a(long j) {
        if (j - a < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return;
        }
        a = j;
        try {
            com.apm.insight.l.i.a(b(), String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    private static File b() {
        if (b == null) {
            long currentTimeMillis = System.currentTimeMillis();
            b = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + "/" + com.apm.insight.i.f());
        }
        return b;
    }
}
