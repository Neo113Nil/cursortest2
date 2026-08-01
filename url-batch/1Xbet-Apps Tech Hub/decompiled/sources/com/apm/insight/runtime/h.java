package com.apm.insight.runtime;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class h {
    private Context a;
    private HashMap<String, Long> b;
    private int c = 50;
    private int d = 100;

    public h(Context context) {
        this.b = null;
        this.a = context;
        this.b = c();
        b();
    }

    private void a(File file) {
        File g = com.apm.insight.l.o.g(this.a);
        file.renameTo(new File(g, String.valueOf(System.currentTimeMillis())));
        String[] list = g.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(g, list[0]).delete();
        }
    }

    private void b() {
        this.c = a.a(this.c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.d = a.a(this.d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> c() {
        JSONArray b;
        File h = com.apm.insight.l.o.h(this.a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            b = com.apm.insight.l.i.b(h.getAbsolutePath());
        } catch (IOException unused) {
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        if (com.apm.insight.l.l.a(b)) {
            return hashMap;
        }
        Long decode = Long.decode(b.optString(0, null));
        if (System.currentTimeMillis() - decode.longValue() > 86400000) {
            a(h);
            return hashMap;
        }
        hashMap.put("time", decode);
        for (int i = 1; i < b.length(); i++) {
            String[] split = b.optString(i, "").split(" ");
            if (split.length == 2) {
                hashMap.put(split[0], Long.decode(split[1]));
            }
        }
        return hashMap;
    }

    public void a() {
        HashMap<String, Long> hashMap = this.b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder append = new StringBuilder().append(remove).append('\n');
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            append.append(entry.getKey()).append(' ').append(entry.getValue()).append('\n');
        }
        try {
            com.apm.insight.l.i.a(com.apm.insight.l.o.h(this.a), append.toString(), false);
        } catch (IOException unused) {
        }
    }

    public boolean a(String str) {
        if (str == null) {
            str = "default";
        }
        return com.apm.insight.l.r.a(this.b, str, 1L).longValue() < ((long) this.c) && com.apm.insight.l.r.a(this.b, "all", 1L).longValue() < ((long) this.d);
    }
}
