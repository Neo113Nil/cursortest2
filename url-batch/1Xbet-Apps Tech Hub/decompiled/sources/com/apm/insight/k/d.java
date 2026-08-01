package com.apm.insight.k;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.l.o;
import com.apm.insight.l.q;
import com.apm.insight.l.r;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.r;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static volatile d a;
    private volatile Context b;

    private d(Context context) {
        this.b = context;
    }

    public static d a() {
        if (a == null) {
            a = new d(com.apm.insight.i.g());
        }
        return a;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String f = e.f();
            File file = new File(o.a(this.b), o.c());
            com.apm.insight.l.i.a(file, file.getName(), f, jSONObject, e.b());
            if (e.a(f, jSONObject.toString()).a()) {
                com.apm.insight.l.i.a(file);
            }
        } catch (Throwable th) {
            q.b(th);
        }
    }

    public void a(JSONObject jSONObject, long j, boolean z) {
        File[] fileArr;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String c = e.c();
            int i = 0;
            File file = new File(o.a(this.b), com.apm.insight.i.a(j, CrashType.ANR, false, false));
            com.apm.insight.l.i.a(file, file.getName(), c, jSONObject, e.b());
            if (z && !Npth.isStopUpload()) {
                jSONObject.put("upload_scene", "direct");
                jSONObject.put("crash_uuid", file.getName());
                r.a(jSONObject);
                if (com.apm.insight.runtime.a.j()) {
                    HashMap<String, r.a> a2 = com.apm.insight.runtime.r.a(j, "anr_trace");
                    fileArr = new File[a2.size() + 2];
                    for (Map.Entry<String, r.a> entry : a2.entrySet()) {
                        if (!entry.getKey().equals(com.apm.insight.l.a.c(this.b))) {
                            fileArr[i] = o.a(this.b, entry.getValue().b);
                            i++;
                        }
                    }
                } else {
                    fileArr = new File[2];
                }
                fileArr[fileArr.length - 1] = o.a(this.b, com.apm.insight.i.f());
                fileArr[fileArr.length - 2] = com.apm.insight.runtime.r.a(j);
                if (e.a(c, jSONObject.toString(), fileArr).a()) {
                    com.apm.insight.l.i.a(file);
                    if (Npth.hasCrash()) {
                        return;
                    }
                    com.apm.insight.l.i.a(o.e(com.apm.insight.i.g()));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean a(long j, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c = e.c();
                File file = new File(o.a(this.b), o.a(com.apm.insight.i.e()));
                com.apm.insight.l.i.a(file, file.getName(), c, jSONObject, e.a());
                jSONObject.put("upload_scene", "direct");
                com.apm.insight.l.r.a(jSONObject);
                if (!e.b(c, jSONObject.toString()).a()) {
                    return false;
                }
                com.apm.insight.l.i.a(file);
                return true;
            } catch (Throwable th) {
                q.b(th);
            }
        }
        return false;
    }

    public boolean a(JSONObject jSONObject, File file, File file2) {
        try {
            String g = e.g();
            com.apm.insight.l.r.a(jSONObject);
            return e.a(g, jSONObject.toString(), file, file2, com.apm.insight.runtime.r.a(System.currentTimeMillis()), new File(com.apm.insight.h.b.a())).a();
        } catch (Throwable th) {
            q.b(th);
            return false;
        }
    }

    public void b(final JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        p.b().a(new Runnable() { // from class: com.apm.insight.k.d.1
            @Override // java.lang.Runnable
            public void run() {
                String c = e.c();
                try {
                    jSONObject.put("upload_scene", "direct");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                e.b(c, jSONObject.toString());
            }
        });
    }
}
