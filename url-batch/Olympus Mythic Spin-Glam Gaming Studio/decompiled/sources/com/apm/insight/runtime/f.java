package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.l.c;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: CrashTimes.java */
/* loaded from: classes5.dex */
public final class f {
    private Context a;
    private HashMap<String, Long> b;
    private int c;
    private int d;

    public f(Context context) {
        this.b = null;
        this.c = 50;
        this.d = 100;
        this.a = context;
        this.b = b();
        this.c = a.a(this.c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.d = a.a(this.d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> b() {
        JSONArray a;
        File h = com.apm.insight.l.j.h(this.a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            a = com.apm.insight.l.f.a(h.getAbsolutePath());
        } catch (IOException unused) {
        } catch (Throwable th) {
            com.apm.insight.c.a();
            j.a(th, "NPTH_CATCH");
        }
        if (com.apm.insight.a.a(a)) {
            return hashMap;
        }
        Long decode = Long.decode(a.optString(0, null));
        if (System.currentTimeMillis() - decode.longValue() <= 86400000) {
            hashMap.put("time", decode);
            for (int i = 1; i < a.length(); i++) {
                String[] split = a.optString(i, "").split(" ");
                if (split.length == 2) {
                    hashMap.put(split[0], Long.decode(split[1]));
                }
            }
            return hashMap;
        }
        File g = com.apm.insight.l.j.g(this.a);
        h.renameTo(new File(g, String.valueOf(System.currentTimeMillis())));
        String[] list = g.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(g, list[0]).delete();
        }
        return hashMap;
    }

    public final void a() {
        HashMap<String, Long> hashMap = this.b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            com.apm.insight.c.a();
            j.a(new RuntimeException("err times, no time"), "NPTH_CATCH");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(remove);
        sb.append('\n');
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append(' ');
            sb.append(entry.getValue());
            sb.append('\n');
        }
        try {
            com.apm.insight.l.f.a(com.apm.insight.l.j.h(this.a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    public final boolean a(String str) {
        if (str == null) {
            str = "default";
        }
        return c.AnonymousClass1.a(this.b, str, 1L).longValue() < ((long) this.c) && c.AnonymousClass1.a(this.b, "all", 1L).longValue() < ((long) this.d);
    }
}
