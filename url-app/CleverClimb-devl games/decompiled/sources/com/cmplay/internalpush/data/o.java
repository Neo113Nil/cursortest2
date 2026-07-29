package com.cmplay.internalpush.data;

import android.content.Context;
import android.net.Uri;
import com.cmplay.internalpush.a.a.b;
import com.cmplay.internalpush.ipc.IpcCloudHelper;
import com.cmplay.internalpush.ipc.IpcSpHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ResultPageParseCloudData.java */
/* loaded from: classes.dex */
public class o extends n {

    /* renamed from: a, reason: collision with root package name */
    private static o f4247a;

    @Override // com.cmplay.internalpush.data.n
    public String a() {
        return "section_result_card";
    }

    private o(Context context) {
        this.i = context.getApplicationContext();
        com.cmplay.internalpush.a.d.a(context);
        com.cmplay.internalpush.k.f4264a = context;
        com.cmplay.internalpush.a.a.b.a().a(this);
    }

    public static o a(Context context) {
        if (f4247a == null) {
            f4247a = new o(context);
        }
        return f4247a;
    }

    @Override // com.cmplay.internalpush.data.n
    public CopyOnWriteArrayList<c> b() {
        Iterator<c> it = this.f4244c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            next.l(com.cmplay.internalpush.a.a.b.a(this.i, a(), next.y()));
        }
        boolean sp_getBooleanValue = IpcSpHelper.getInstance().sp_getBooleanValue(a(), false);
        String b2 = com.ijinshan.cloudconfig.b.a.a().b("local_version", "none");
        com.cmplay.base.util.h.a("cloudVersion =" + b2);
        if (sp_getBooleanValue) {
            com.cmplay.internalpush.o.a().a(b2, 1, "result_page", "");
        } else {
            com.cmplay.internalpush.o.a().a(b2, 2, "result_page", "");
        }
        return super.b();
    }

    @Override // com.cmplay.internalpush.a.a.a
    public void c() {
        String a2 = com.cmplay.internalpush.a.a.b.a().a(com.cmplay.base.util.j.c(), a());
        com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.startAsynPreLoadImg result card json:" + a2);
        StringBuilder sb = new StringBuilder();
        sb.append("获取结果页魔方数据--------------------");
        boolean z = false;
        sb.append(a2 != null ? a2.length() : 0);
        com.cmplay.base.util.h.a(sb.toString());
        a(a2);
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<c> it = this.f4244c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null) {
                if (com.cmplay.internalpush.a.c.b(next)) {
                    arrayList.add(next.y());
                } else {
                    com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.startAsynPreLoadImg  ProID:" + next.h() + "  已经过期，不下载资源素材");
                }
                if (next != null && com.cmplay.internalpush.a.c.a(next)) {
                    z = true;
                }
            }
        }
        if (!this.f4244c.isEmpty()) {
            com.cmplay.internalpush.o.a().a(2, z ? 21 : 22, "", 0L, z ? "" : Uri.encode(IpcCloudHelper.getInstance().innpush_getUrl("")), 0, 0, 0L);
        }
        com.cmplay.internalpush.a.a.b.a().a(a(), arrayList, (b.a) null);
    }

    private boolean c(boolean z) {
        boolean z2;
        Iterator<c> it = this.f4244c.iterator();
        while (true) {
            z2 = false;
            if (!it.hasNext()) {
                break;
            }
            c next = it.next();
            if (next != null && next.x() >= next.j()) {
                next.e(0);
            }
        }
        a(this.f4244c);
        long a2 = com.cmplay.internalpush.a.d.a("last_show_open_screen_time" + a(), 0L);
        long a3 = com.cmplay.internalpush.a.d.a("last_show_hit_top_time" + a(), 0L);
        StringBuilder sb = new StringBuilder();
        int size = this.f4244c.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            c cVar = this.f4244c.get(i);
            if (cVar != null) {
                com.cmplay.internalpush.a.c.f4175a = 0;
                if (com.cmplay.internalpush.a.c.a(cVar, z) && com.cmplay.internalpush.a.c.a(this.i, cVar) && com.cmplay.internalpush.a.c.a(cVar) && com.cmplay.internalpush.a.c.a(cVar, a2, a3) && com.cmplay.internalpush.a.c.c(cVar) && com.cmplay.internalpush.a.c.d(cVar) && com.cmplay.internalpush.a.c.g(cVar) && com.cmplay.internalpush.a.c.k(cVar)) {
                    this.e.add(cVar);
                    com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.resetHaveRotationTimesAndCheckAgain()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a) + "   是否爆款:" + cVar.Y());
                    z2 = true;
                    break;
                }
                if (i != 0) {
                    sb.append("!");
                }
                sb.append(String.valueOf(cVar.h()));
                sb.append(":");
                sb.append(String.valueOf(com.cmplay.internalpush.a.c.f4175a));
                a(cVar, com.cmplay.internalpush.a.c.f4175a);
                com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.resetHaveRotationTimesAndCheckAgain()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a) + "   是否爆款:" + cVar.Y());
            }
            i++;
        }
        com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.resetHaveRotationTimesAndCheckAgain()  canShow:" + z2 + "   mInfoList.size():" + this.f4244c.size());
        this.k = sb.toString();
        if (!z2) {
            a(2);
        }
        return z2;
    }

    public void d() {
        com.cmplay.internalpush.o.a().a(2, 4, "", 0L, this.k, com.cmplay.internalpush.p.a().b(), 0, 0L);
    }

    public boolean a(boolean z, boolean z2) {
        com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.canShow()");
        this.e.clear();
        this.f.clear();
        this.g.clear();
        b();
        boolean z3 = false;
        if (!this.f4244c.isEmpty()) {
            long a2 = com.cmplay.internalpush.a.d.a("last_show_open_screen_time" + a(), 0L);
            long a3 = com.cmplay.internalpush.a.d.a("last_show_hit_top_time" + a(), 0L);
            boolean a4 = com.cmplay.internalpush.a.b.a(a3);
            int size = this.f4244c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                c cVar = this.f4244c.get(i);
                if (cVar != null) {
                    if (!a4 && cVar.Y()) {
                        cVar.r(0);
                        cVar.e(0);
                        com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.canShow()  不是相同自然天，重置爆款当天展示次");
                    }
                    com.cmplay.internalpush.a.c.f4175a = 0;
                    if (com.cmplay.internalpush.a.c.a(cVar, z) && com.cmplay.internalpush.a.c.a(this.i, cVar) && com.cmplay.internalpush.a.c.a(cVar) && com.cmplay.internalpush.a.c.a(cVar, a2, a3) && com.cmplay.internalpush.a.c.c(cVar) && com.cmplay.internalpush.a.c.d(cVar) && com.cmplay.internalpush.a.c.g(cVar) && com.cmplay.internalpush.a.c.k(cVar)) {
                        this.e.add(cVar);
                        com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.canShow()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a) + "   是否爆款:" + cVar.Y());
                        z3 = true;
                        break;
                    }
                    com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.canShow()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a) + "   是否爆款:" + cVar.Y());
                }
                i++;
            }
            com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.canShow()  canShow:" + z3 + "  mInfoList.size()" + this.f4244c.size());
            return !z3 ? c(z) : z3;
        }
        com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.canShow()  没有数据");
        com.cmplay.internalpush.o.a().a(2, z ? 17 : 16, "", 0L, String.valueOf(10), com.cmplay.internalpush.p.a().b(), 0, 0L);
        return false;
    }

    public g a(boolean z) {
        com.cmplay.base.util.h.a("internal_push", "ResultPageParseCloudData.getInfoForShowNt()");
        if (this.e.isEmpty()) {
            return null;
        }
        c cVar = this.e.get(0);
        a(cVar.h(), 1);
        if (cVar.Y()) {
            com.cmplay.internalpush.a.d.b("last_show_hit_top_time" + a(), System.currentTimeMillis());
        } else {
            com.cmplay.internalpush.a.d.b("last_show_open_screen_time" + a(), System.currentTimeMillis());
        }
        if (z) {
            com.cmplay.internalpush.o.a().a(2, 1, cVar.r(), cVar.h(), "", com.cmplay.internalpush.p.a().b(), 0, cVar.i());
        }
        return new g(cVar.h(), cVar.r(), cVar.g(), cVar.z(), cVar.A(), cVar.B(), cVar.C(), cVar.D(), cVar.t(), cVar.s(), cVar.b(), cVar.i());
    }

    public String b(boolean z) {
        g a2 = a(z);
        if (a2 == null) {
            return null;
        }
        return a2.n();
    }
}
