package com.anythink.expressad.video.module.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.y;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k extends f {

    /* renamed from: X, reason: collision with root package name */
    public static final int f21925X = 2;

    /* renamed from: a, reason: collision with root package name */
    public static final int f21926a = 1;
    private static final String ai = "camp_position";
    protected boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    protected com.anythink.expressad.foundation.d.d f21927Z;
    protected List<com.anythink.expressad.foundation.d.d> aa;
    protected boolean ab;
    protected com.anythink.expressad.videocommon.b.c ac;
    protected com.anythink.expressad.videocommon.c.c ad;
    protected String ae;
    protected String af;
    protected com.anythink.expressad.video.module.a.a ag;
    protected int ah;
    private boolean aj = false;
    private boolean ak = false;
    private boolean al = false;

    public k(com.anythink.expressad.foundation.d.d dVar, com.anythink.expressad.videocommon.b.c cVar, com.anythink.expressad.videocommon.c.c cVar2, String str, String str2, com.anythink.expressad.video.module.a.a aVar, int i, boolean z8) {
        this.ab = false;
        this.ag = new f();
        this.ah = 1;
        if (!z8 && dVar != null && y.b(str2) && cVar != null && aVar != null) {
            this.f21927Z = dVar;
            this.af = str;
            this.ae = str2;
            this.ac = cVar;
            this.ad = cVar2;
            this.ag = aVar;
            this.Y = true;
            this.ah = i;
            this.ab = false;
            return;
        }
        if (!z8 || dVar == null || !y.b(str2) || aVar == null) {
            return;
        }
        this.f21927Z = dVar;
        this.af = str;
        this.ae = str2;
        this.ac = cVar;
        this.ad = cVar2;
        this.ag = aVar;
        this.Y = true;
        this.ah = i;
        this.ab = true;
    }

    private static void g() {
    }

    private static void h() {
    }

    private static void i() {
        com.anythink.expressad.videocommon.b.e.a().a(false);
    }

    private static void j() {
    }

    private void k() {
        if (!this.Y || com.anythink.expressad.foundation.g.a.f.f19286k == null || TextUtils.isEmpty(this.f21927Z.bh())) {
            return;
        }
        com.anythink.expressad.foundation.g.a.f.a(this.ae, this.f21927Z, "reward");
    }

    private static void l() {
    }

    private static void m() {
    }

    private static void n() {
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f21927Z = dVar;
    }

    public final void b(int i) {
        com.anythink.expressad.foundation.d.d dVar = this.f21927Z;
        if (dVar != null) {
            String aj = dVar.aj();
            if (TextUtils.isEmpty(aj)) {
                return;
            }
            if (i == 1 || i == 2) {
                if (!aj.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(aj);
                    if (aj.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i);
                    }
                    aj = sb.toString();
                } else if (i == 2) {
                    if (aj.contains("endscreen_type=1")) {
                        aj = aj.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (aj.contains("endscreen_type=2")) {
                    aj = aj.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f21927Z.r(aj);
            }
        }
    }

    public final void c() {
        Map<String, Long> map;
        String str;
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f21927Z;
            if (dVar != null && dVar.j() && this.ab && !this.f21927Z.l()) {
                this.ak = true;
                return;
            }
            if (!this.Y || TextUtils.isEmpty(this.f21927Z.ak()) || (map = com.anythink.expressad.foundation.g.a.f.f19284h) == null || map.containsKey(this.f21927Z.ak()) || this.ak) {
                return;
            }
            com.anythink.expressad.foundation.g.a.f.f19284h.put(this.f21927Z.ak(), Long.valueOf(System.currentTimeMillis()));
            String ak = this.f21927Z.ak();
            if (this.f21927Z.n() == 1) {
                str = ak + "&to=1&cbt=" + this.f21927Z.aB() + "&tmorl=" + this.ah;
            } else {
                str = ak + "&to=0&cbt=" + this.f21927Z.aB() + "&tmorl=" + this.ah;
            }
            String str2 = str;
            if (!this.ab) {
                com.anythink.expressad.b.a.a(t.b().g(), this.f21927Z, this.ae, str2, true);
            } else if (this.f21927Z.l()) {
                com.anythink.expressad.b.a.a(t.b().g(), this.f21927Z, this.ae, str2, false, true, com.anythink.expressad.b.b.a.f18315j);
            }
            this.ak = true;
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public final void d() {
        String str;
        try {
            if (!this.Y || this.aj || TextUtils.isEmpty(this.f21927Z.ai())) {
                return;
            }
            this.aj = true;
            this.f21927Z.B();
            String ai2 = this.f21927Z.ai();
            if (this.f21927Z.n() == 1) {
                str = ai2 + "&to=1&cbt=" + this.f21927Z.aB() + "&tmorl=" + this.ah;
            } else {
                str = ai2 + "&to=0&cbt=" + this.f21927Z.aB() + "&tmorl=" + this.ah;
            }
            com.anythink.expressad.b.a.a(t.b().g(), this.f21927Z, this.ae, str, false, true, com.anythink.expressad.b.b.a.i);
            com.anythink.expressad.video.module.b.a.a(t.b().g(), this.f21927Z);
            if (!this.Y || com.anythink.expressad.foundation.g.a.f.f19286k == null || TextUtils.isEmpty(this.f21927Z.bh())) {
                return;
            }
            com.anythink.expressad.foundation.g.a.f.a(this.ae, this.f21927Z, "reward");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void e() {
        com.anythink.expressad.foundation.d.d dVar;
        List<String> d2;
        try {
            if (!this.Y || this.al || (dVar = this.f21927Z) == null) {
                return;
            }
            this.al = true;
            if ((dVar.j() && this.ab && !this.f21927Z.l()) || this.ab || (d2 = this.f21927Z.d()) == null || d2.size() <= 0) {
                return;
            }
            Iterator<String> it = d2.iterator();
            while (it.hasNext()) {
                com.anythink.expressad.b.a.a(t.b().g(), this.f21927Z, this.ae, it.next(), true);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void f() {
        com.anythink.expressad.foundation.d.d dVar = this.f21927Z;
        if (dVar == null || TextUtils.isEmpty(dVar.L()) || this.f21927Z.M() == null || this.f21927Z.M().n() == null) {
            return;
        }
        Context g9 = t.b().g();
        com.anythink.expressad.foundation.d.d dVar2 = this.f21927Z;
        com.anythink.expressad.b.a.a(g9, dVar2, dVar2.L(), this.f21927Z.M().n(), false);
    }

    public final void a(List<com.anythink.expressad.foundation.d.d> list) {
        this.aa = list;
    }

    @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        this.ag.a(i, obj);
    }

    public final void a(int i) {
        if (this.f21927Z != null) {
            if (i == 1 || i == 2) {
                com.anythink.expressad.video.module.b.a.a(t.b().g(), this.f21927Z, i, this.ah);
            }
        }
    }

    public final void a() {
        if (!this.Y || this.f21927Z == null) {
            return;
        }
        t.b().g();
        new com.anythink.expressad.foundation.d.t(com.anythink.expressad.foundation.d.t.f19086q, this.f21927Z.bh(), this.f21927Z.aa(), this.f21927Z.ac(), this.ae, com.anythink.expressad.foundation.h.n.b()).a(this.f21927Z.I() ? com.anythink.expressad.foundation.d.t.aQ : com.anythink.expressad.foundation.d.t.aR);
    }

    public final void a(int i, String str) {
        if (this.f21927Z != null) {
            t.b().g();
            new com.anythink.expressad.foundation.d.t(com.anythink.expressad.foundation.d.t.f19087r, this.f21927Z.bh(), this.f21927Z.aa(), this.f21927Z.ac(), this.ae, com.anythink.expressad.foundation.h.n.b(), i, str);
        }
    }

    public final void a(String str) {
        List<com.anythink.expressad.foundation.d.d> list;
        if (this.f21927Z == null || (list = this.aa) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(ai)) {
                this.f21927Z = this.aa.get(jSONObject.getInt(ai));
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public final void b() {
        com.anythink.expressad.videocommon.b.c cVar = this.ac;
        if (cVar != null) {
            cVar.b(true);
        }
    }
}
