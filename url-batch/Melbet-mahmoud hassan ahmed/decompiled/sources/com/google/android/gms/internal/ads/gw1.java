package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class gw1 {

    /* renamed from: e, reason: collision with root package name */
    private final String f5790e;

    /* renamed from: f, reason: collision with root package name */
    private final cw1 f5791f;

    /* renamed from: b, reason: collision with root package name */
    private final List<Map<String, String>> f5787b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f5788c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5789d = false;

    /* renamed from: a, reason: collision with root package name */
    private final a3.t1 f5786a = y2.t.p().h();

    public gw1(String str, cw1 cw1Var) {
        this.f5790e = str;
        this.f5791f = cw1Var;
    }

    private final Map<String, String> f() {
        Map<String, String> c7 = this.f5791f.c();
        c7.put("tms", Long.toString(y2.t.a().a(), 10));
        c7.put("tid", this.f5786a.K() ? "" : this.f5790e);
        return c7;
    }

    public final synchronized void a(String str, String str2) {
        if (((Boolean) sw.c().b(m10.f8334x1)).booleanValue()) {
            if (!((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
                Map<String, String> f7 = f();
                f7.put("action", "adapter_init_finished");
                f7.put("ancn", str);
                f7.put("rqe", str2);
                this.f5787b.add(f7);
            }
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) sw.c().b(m10.f8334x1)).booleanValue()) {
            if (!((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
                Map<String, String> f7 = f();
                f7.put("action", "adapter_init_started");
                f7.put("ancn", str);
                this.f5787b.add(f7);
            }
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) sw.c().b(m10.f8334x1)).booleanValue()) {
            if (!((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
                Map<String, String> f7 = f();
                f7.put("action", "adapter_init_finished");
                f7.put("ancn", str);
                this.f5787b.add(f7);
            }
        }
    }

    public final synchronized void d() {
        if (((Boolean) sw.c().b(m10.f8334x1)).booleanValue()) {
            if (!((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
                if (this.f5789d) {
                    return;
                }
                Map<String, String> f7 = f();
                f7.put("action", "init_finished");
                this.f5787b.add(f7);
                Iterator<Map<String, String>> it = this.f5787b.iterator();
                while (it.hasNext()) {
                    this.f5791f.b(it.next());
                }
                this.f5789d = true;
            }
        }
    }

    public final synchronized void e() {
        if (((Boolean) sw.c().b(m10.f8334x1)).booleanValue()) {
            if (!((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
                if (this.f5788c) {
                    return;
                }
                Map<String, String> f7 = f();
                f7.put("action", "init_started");
                this.f5787b.add(f7);
                this.f5788c = true;
            }
        }
    }
}
