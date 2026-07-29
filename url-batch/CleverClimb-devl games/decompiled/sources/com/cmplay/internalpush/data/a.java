package com.cmplay.internalpush.data;

import android.net.Uri;
import com.cmplay.internalpush.a.a.b;
import com.cmplay.internalpush.ipc.IpcCloudHelper;
import com.cmplay.internalpush.ipc.IpcSpHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ExitGameParseCloudData.java */
/* loaded from: classes.dex */
public class a extends n {
    @Override // com.cmplay.internalpush.data.n
    public String a() {
        return "section_quit_card";
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
            com.cmplay.internalpush.o.a().a(b2, 1, "exit_game", "");
        } else {
            com.cmplay.internalpush.o.a().a(b2, 2, "exit_game", "");
        }
        return super.b();
    }

    @Override // com.cmplay.internalpush.a.a.a
    public void c() {
        String a2 = com.cmplay.internalpush.a.a.b.a().a(com.cmplay.base.util.j.c(), a());
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
                    com.cmplay.base.util.h.a("internal_push", "ProID:" + next.h() + "  已经过期，不下载资源素材");
                }
                if (next != null && com.cmplay.internalpush.a.c.a(next)) {
                    z = true;
                }
            }
        }
        if (!this.f4244c.isEmpty()) {
            com.cmplay.internalpush.o.a().a(5, z ? 21 : 22, "", 0L, z ? "" : Uri.encode(IpcCloudHelper.getInstance().innpush_getUrl("")), 0, 0, 0L);
        }
        com.cmplay.internalpush.a.a.b.a().a(a(), arrayList, (b.a) null);
    }
}
