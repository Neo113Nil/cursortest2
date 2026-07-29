package com.cmplay.internalpush.data;

import android.content.Context;
import android.net.Uri;
import com.cmplay.internalpush.a.a.b;
import com.cmplay.internalpush.ipc.IpcCloudHelper;
import com.cmplay.internalpush.ipc.IpcSpHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: InsertScreenParseCloudData.java */
/* loaded from: classes.dex */
public class j extends n {

    /* renamed from: a, reason: collision with root package name */
    private static j f4231a;

    @Override // com.cmplay.internalpush.data.n
    public String a() {
        return "insert_screen_scene";
    }

    private j(Context context) {
        this.i = context.getApplicationContext();
        com.cmplay.internalpush.a.d.a(context);
        com.cmplay.internalpush.k.f4264a = context;
        com.cmplay.internalpush.a.a.b.a().a(this);
    }

    public static j a(Context context) {
        if (f4231a == null) {
            f4231a = new j(context);
        }
        return f4231a;
    }

    @Override // com.cmplay.internalpush.data.n
    public CopyOnWriteArrayList<c> b() {
        Iterator<c> it = this.f4244c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            next.d(com.cmplay.internalpush.a.a.b.a(this.i, a(), next.l()));
            next.g(com.cmplay.internalpush.a.a.b.a(this.i, a(), next.n()));
            next.h(com.cmplay.internalpush.a.a.b.a(this.i, a(), next.o()));
            com.cmplay.base.util.h.a("bgimg = " + next.m());
            com.cmplay.base.util.h.a("buttonimg = " + next.p());
            com.cmplay.base.util.h.a("buttonimg2 = " + next.q());
        }
        boolean sp_getBooleanValue = IpcSpHelper.getInstance().sp_getBooleanValue(a(), false);
        String b2 = com.ijinshan.cloudconfig.b.a.a().b("local_version", "none");
        com.cmplay.base.util.h.a("cloudVersion =" + b2);
        if (sp_getBooleanValue) {
            com.cmplay.internalpush.o.a().a(b2, 1, "insert_screen", "");
        } else {
            com.cmplay.internalpush.o.a().a(b2, 2, "insert_screen", "");
        }
        return super.b();
    }

    @Override // com.cmplay.internalpush.a.a.a
    public void c() {
        String a2 = com.cmplay.internalpush.a.a.b.a().a(com.cmplay.base.util.j.c(), a());
        com.cmplay.base.util.h.a("internal_push", "InsertScreenParseCloudData.startAsynPreLoadImg insertScreen json:" + a2);
        StringBuilder sb = new StringBuilder();
        sb.append("获取插屏魔方数据--------------------");
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
                    arrayList.add(next.l());
                    arrayList.add(next.n());
                    arrayList.add(next.o());
                } else {
                    com.cmplay.base.util.h.a("internal_push", "InsertScreenParseCloudData.startAsynPreLoadImg ProID:" + next.h() + "  已经过期，不下载资源素材");
                }
                if (next != null && com.cmplay.internalpush.a.c.a(next)) {
                    z = true;
                }
            }
        }
        if (!this.f4244c.isEmpty()) {
            com.cmplay.internalpush.o.a().a(6, z ? 21 : 22, "", 0L, z ? "" : Uri.encode(IpcCloudHelper.getInstance().innpush_getUrl("")), 0, 0, 0L);
        }
        com.cmplay.internalpush.a.a.b.a().a(a(), arrayList, (b.a) null);
    }
}
