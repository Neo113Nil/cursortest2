package com.cmplay.internalpush.data;

import android.content.Context;
import android.net.Uri;
import com.aiming.mdt.utils.Constants;
import com.cmplay.internalpush.a.a.b;
import com.cmplay.internalpush.ipc.IpcCloudHelper;
import com.cmplay.internalpush.ipc.IpcSpHelper;
import com.cmplay.internalpush.video.a.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OpenScreenParseCloudData.java */
/* loaded from: classes.dex */
public class m extends n {
    private static m l;

    /* renamed from: a, reason: collision with root package name */
    protected List<c> f4239a = new ArrayList();
    private int m = 0;

    @Override // com.cmplay.internalpush.data.n
    public String a() {
        return "open_screen_scene";
    }

    static /* synthetic */ int a(m mVar) {
        int i = mVar.m;
        mVar.m = i + 1;
        return i;
    }

    private m(Context context) {
        this.i = context.getApplicationContext();
        com.cmplay.internalpush.a.d.a(context);
        com.cmplay.internalpush.k.f4264a = context;
        com.cmplay.internalpush.a.a.b.a().a(this);
    }

    public static m a(Context context) {
        if (l == null) {
            l = new m(context);
        }
        return l;
    }

    @Override // com.cmplay.internalpush.data.n
    public CopyOnWriteArrayList<c> b() {
        boolean sp_getBooleanValue = IpcSpHelper.getInstance().sp_getBooleanValue(a(), false);
        String b2 = com.ijinshan.cloudconfig.b.a.a().b("local_version", "none");
        com.cmplay.base.util.h.a("cloudVersion =" + b2);
        if (sp_getBooleanValue) {
            com.cmplay.internalpush.o.a().a(b2, 1, "open_screen", "");
        } else {
            com.cmplay.internalpush.o.a().a(b2, 2, "open_screen", "");
        }
        return super.b();
    }

    @Override // com.cmplay.internalpush.a.a.a
    public void c() {
        String a2 = com.cmplay.internalpush.a.a.b.a().a(com.cmplay.base.util.j.c(), a());
        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.startAsynPreLoadImg openScreen 内推 json:" + a2);
        StringBuilder sb = new StringBuilder();
        sb.append("获取开屏魔方数据--------------------");
        boolean z = false;
        sb.append(a2 != null ? a2.length() : 0);
        com.cmplay.base.util.h.a(sb.toString());
        a(a2);
        String a3 = com.cmplay.internalpush.a.a.b.a().a(com.cmplay.base.util.j.c(), "open_screen_scene_rs_game_fuction");
        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.startAsynPreLoadImg openScreen RS 功能开屏 rsJson:" + a3);
        b(a3);
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<c> it = this.f4244c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null) {
                if (com.cmplay.internalpush.a.c.b(next)) {
                    arrayList.add(next.l());
                    arrayList.add(next.n());
                    arrayList.add(next.o());
                    arrayList.add(next.y());
                } else {
                    com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.startAsynPreLoadImg   ProID:" + next.h() + "  已经过期，不下载资源素材");
                }
                if (next != null && com.cmplay.internalpush.a.c.a(next)) {
                    z = true;
                }
            }
        }
        if (!this.f4244c.isEmpty()) {
            com.cmplay.internalpush.o.a().a(1, z ? 21 : 22, "", 0L, z ? "" : Uri.encode(IpcCloudHelper.getInstance().innpush_getUrl("")), 0, 0, 0L);
        }
        com.cmplay.internalpush.a.a.b.a().a(a(), arrayList, new b.a() { // from class: com.cmplay.internalpush.data.m.1
            @Override // com.cmplay.internalpush.a.a.b.a
            public void a(String str, String str2) {
                Iterator<c> it2 = m.this.f4244c.iterator();
                while (it2.hasNext()) {
                    c next2 = it2.next();
                    if (next2 != null) {
                        if (next2.l() != null && next2.l().equalsIgnoreCase(str)) {
                            next2.d(str2);
                            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.startAsynPreLoadImg   下载图片成功，保存本地路径  setLocalPathBgImg  localPath:" + str2 + "   ProId:" + next2.h());
                        }
                        if (next2.n() != null && next2.n().equalsIgnoreCase(str)) {
                            next2.g(str2);
                            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.startAsynPreLoadImg   下载图片成功，保存本地路径  setLocalPathButtonImg  localPath:" + str2 + "   ProId:" + next2.h());
                        }
                        if (next2.o() != null && next2.o().equalsIgnoreCase(str)) {
                            next2.h(str2);
                            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.startAsynPreLoadImg   下载图片成功，保存本地路径  setLocalPathButtonImg2  localPath:" + str2 + "   ProId:" + next2.h());
                        }
                        if (next2.y() != null && next2.y().equalsIgnoreCase(str)) {
                            next2.l(str2);
                            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.startAsynPreLoadImg   下载图片成功，保存本地路径  setLocalPathIconImg  localPath:" + str2 + "   ProId:" + next2.h());
                        }
                    }
                }
            }
        });
        g();
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        if (com.cmplay.internalpush.a.c.a(r20.i, r10) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0138, code lost:
    
        if (r10.t() != 2) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean c(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        c cVar;
        Iterator<c> it = this.f4244c.iterator();
        while (true) {
            z2 = false;
            if (!it.hasNext()) {
                z3 = false;
                break;
            }
            c next = it.next();
            if (next != null && next.j() > 0 && next.x() == 0 && 14 == next.P()) {
                com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.resetHaveRotationTimesAndCheckAgain()    仍然有因为启动次数而未曾展示的  id:" + next.h());
                z3 = true;
                break;
            }
        }
        if (2 != com.cmplay.internalpush.n.a().b()) {
            Iterator<c> it2 = this.f4244c.iterator();
            while (it2.hasNext()) {
                c next2 = it2.next();
                if (next2 != null && next2.x() >= next2.j() && !z3) {
                    next2.e(0);
                    com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.resetHaveRotationTimesAndCheckAgain()  轮询次数重置  setHaveRotationTimes(0)  id:" + next2.h());
                }
            }
        } else {
            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.resetHaveRotationTimesAndCheckAgain()   返回开屏的场景，轮询次数不做重置");
        }
        a(this.f4244c);
        long a2 = com.cmplay.internalpush.a.d.a("last_show_open_screen_time" + a(), 0L);
        long a3 = com.cmplay.internalpush.a.d.a("last_show_hit_top_time" + a(), 0L);
        StringBuilder sb = new StringBuilder();
        int size = this.f4244c.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            c cVar2 = this.f4244c.get(i3);
            if (cVar2 != null) {
                com.cmplay.internalpush.a.c.f4175a = 0;
                if (com.cmplay.internalpush.a.c.a(cVar2, z) && com.cmplay.internalpush.a.c.a(cVar2)) {
                    i = i3;
                    i2 = size;
                    if (com.cmplay.internalpush.a.c.a(cVar2, a2, a3, com.cmplay.internalpush.n.a().b(), this.f4243b)) {
                        if (cVar2.t() != 4) {
                            cVar = cVar2;
                        } else {
                            cVar = cVar2;
                        }
                        if (cVar.t() != 4) {
                        }
                        if (com.cmplay.internalpush.a.c.c(cVar) && com.cmplay.internalpush.a.c.d(cVar) && (((cVar.R() != 2 && com.cmplay.internalpush.a.c.e(cVar)) || (cVar.R() == 2 && com.cmplay.internalpush.a.c.h(cVar) && com.cmplay.internalpush.a.c.g(cVar))) && com.cmplay.internalpush.a.c.f(cVar) && com.cmplay.internalpush.a.c.k(cVar) && com.cmplay.internalpush.a.c.j(cVar))) {
                            this.e.add(cVar);
                            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.resetHaveRotationTimesAndCheckAgain()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a) + "   是否爆款:" + cVar.Y());
                            z2 = true;
                            break;
                        }
                    } else {
                        cVar = cVar2;
                    }
                } else {
                    cVar = cVar2;
                    i = i3;
                    i2 = size;
                }
                cVar.o(com.cmplay.internalpush.a.c.f4175a);
                if (i != 0) {
                    sb.append("!");
                }
                sb.append(String.valueOf(cVar.h()));
                sb.append(":");
                sb.append(String.valueOf(com.cmplay.internalpush.a.c.f4175a));
                a(cVar, com.cmplay.internalpush.a.c.f4175a);
                com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.resetHaveRotationTimesAndCheckAgain()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a) + "   是否爆款:" + cVar.Y());
            } else {
                i = i3;
                i2 = size;
            }
            i3 = i + 1;
            size = i2;
        }
        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.resetHaveRotationTimesAndCheckAgain()  canShow:" + z2 + "   mInfoList.size():" + this.f4244c.size());
        this.k = sb.toString();
        if (!z2) {
            a(1);
        }
        return z2;
    }

    public void d() {
        com.cmplay.internalpush.o.a().a(1, 4, "", 0L, this.k, com.cmplay.internalpush.n.a().b(), 0, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d1, code lost:
    
        if (com.cmplay.internalpush.a.c.a(r19.i, r9) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e0, code lost:
    
        if (r9.t() != 2) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(boolean z, boolean z2) {
        int i;
        c cVar;
        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.canShow()   isNewPlayer:" + z);
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
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                c cVar2 = this.f4244c.get(i2);
                if (cVar2 != null) {
                    if (!a4 && cVar2.Y()) {
                        cVar2.r(0);
                        cVar2.e(0);
                        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.canShow()  不是相同自然天，重置爆款当天展示次");
                    }
                    com.cmplay.internalpush.a.c.f4175a = 0;
                    if (com.cmplay.internalpush.a.c.a(cVar2, z) && com.cmplay.internalpush.a.c.a(cVar2)) {
                        i = i2;
                        if (com.cmplay.internalpush.a.c.a(cVar2, a2, a3, com.cmplay.internalpush.n.a().b(), this.f4243b)) {
                            if (cVar2.t() != 4) {
                                cVar = cVar2;
                            } else {
                                cVar = cVar2;
                            }
                            if (cVar.t() != 4) {
                            }
                            if (com.cmplay.internalpush.a.c.c(cVar) && com.cmplay.internalpush.a.c.d(cVar) && (((cVar.R() != 2 && com.cmplay.internalpush.a.c.e(cVar)) || (cVar.R() == 2 && com.cmplay.internalpush.a.c.h(cVar) && com.cmplay.internalpush.a.c.g(cVar))) && com.cmplay.internalpush.a.c.f(cVar) && com.cmplay.internalpush.a.c.k(cVar) && com.cmplay.internalpush.a.c.j(cVar))) {
                                this.e.add(cVar);
                                com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.canShow()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a) + "   是否爆款:" + cVar.Y());
                                z3 = true;
                                break;
                            }
                        } else {
                            cVar = cVar2;
                        }
                    } else {
                        cVar = cVar2;
                        i = i2;
                    }
                    cVar.o(com.cmplay.internalpush.a.c.f4175a);
                    com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.canShow()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a) + "   是否爆款:" + cVar.Y());
                } else {
                    i = i2;
                }
                i2 = i + 1;
            }
            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.canShow()  canShow:" + z3 + "  mInfoList.size()" + this.f4244c.size());
            return !z3 ? c(z) : z3;
        }
        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.canShow()  没有数据");
        com.cmplay.internalpush.o.a().a(1, z ? 17 : 16, "", 0L, String.valueOf(10), com.cmplay.internalpush.n.a().b(), 0, 0L);
        return false;
    }

    public f a(boolean z) {
        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getInfoForShowNt()");
        if (this.e.isEmpty()) {
            return null;
        }
        this.f4243b = true;
        c cVar = this.e.get(0);
        a(cVar.h(), 1);
        if (cVar.Y()) {
            com.cmplay.internalpush.a.d.b("last_show_hit_top_time" + a(), System.currentTimeMillis());
        } else {
            com.cmplay.internalpush.a.d.b("last_show_open_screen_time" + a(), System.currentTimeMillis());
        }
        if (z) {
            com.cmplay.internalpush.o.a().a(1, 1, cVar.r(), cVar.h(), "", com.cmplay.internalpush.n.a().b(), 0, cVar.i());
        }
        return new f(cVar.h(), cVar.r(), cVar.g(), cVar.z(), cVar.A(), cVar.B(), cVar.m(), cVar.p(), cVar.q(), cVar.t(), cVar.s(), cVar.L(), cVar.M(), cVar.N(), cVar.b(), cVar.Q(), cVar.G(), cVar.H(), cVar.I(), cVar.R(), cVar.S(), cVar.a(), cVar.i());
    }

    public String b(boolean z) {
        f a2 = a(z);
        if (a2 == null) {
            return null;
        }
        return a2.n();
    }

    private String c(String str) {
        return "innerpush_" + com.cmplay.internalpush.a.b.a(str, a());
    }

    public c e() {
        Iterator it = new ArrayList(this.f4239a).iterator();
        c cVar = null;
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            if (cVar2 != null && !cVar2.U() && !com.cmplay.internalpush.a.c.h(cVar2)) {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    public void f() {
        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getNextVideo()");
        if (this.m > this.f4239a.size()) {
            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getNextVideo()  开屏 循环遍历了一遍， resetDownloadFailTag  停止下一个下载");
            l();
            return;
        }
        final c e = e();
        if (e != null) {
            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getNextVideo()  开屏视频 开始下载 pro_id:" + e.h());
            e.e(true);
            com.cmplay.internalpush.video.a.b.a().a(e.h(), e.r(), e.F(), c(e.F()), e.l(), e.y(), e.i(), com.cmplay.internalpush.n.a().b(), new c.a() { // from class: com.cmplay.internalpush.data.m.2
                @Override // com.cmplay.internalpush.video.a.c.a
                public void a(int i, String str) {
                    com.cmplay.base.util.h.a("info id =" + e.h());
                    e.e(false);
                    if (i == 0 || i == 1000) {
                        if (m.this.a(e.h(), str)) {
                            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getNextVideo()  开屏视频 下载成功 pro_id:" + e.h() + "  resetDownloadFailTag()");
                            m.this.l();
                            m.this.f();
                            m.this.m = 0;
                        } else {
                            com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getNextVideo()  开屏视频 下载失败 pro_id:" + e.h() + "   下载下一个");
                            m.this.a(e.h());
                            m.a(m.this);
                            m.this.f();
                        }
                    } else {
                        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getNextVideo()  开屏视频 下载失败 pro_id:" + e.h() + "   下载下一个");
                        m.this.a(e.h());
                        m.a(m.this);
                        m.this.f();
                    }
                    String r = e.r();
                    long h = e.h();
                    if (i == 1000) {
                        com.cmplay.internalpush.o.a().a(1, 12, r, h, "1000", com.cmplay.internalpush.n.a().b(), 0, e.i());
                    }
                    switch (i) {
                        case -1:
                            com.cmplay.internalpush.o.a().a(1, 8, r, h, "-1", com.cmplay.internalpush.n.a().b(), 0, e.i());
                            break;
                        case 0:
                            com.cmplay.internalpush.o.a().a(1, 7, r, h, "0", com.cmplay.internalpush.n.a().b(), 0, e.i());
                            break;
                        case 1:
                            com.cmplay.internalpush.o.a().a(1, 8, r, h, "1", com.cmplay.internalpush.n.a().b(), 0, e.i());
                            break;
                        case 2:
                            com.cmplay.internalpush.o.a().a(1, 8, r, h, "2", com.cmplay.internalpush.n.a().b(), 0, e.i());
                            break;
                        case 3:
                            com.cmplay.internalpush.o.a().a(1, 8, r, h, Constants.ALL_LOAD, com.cmplay.internalpush.n.a().b(), 0, e.i());
                            break;
                        case 4:
                            com.cmplay.internalpush.o.a().a(1, 8, r, h, Constants.ALL_READY, com.cmplay.internalpush.n.a().b(), 0, e.i());
                            break;
                        case 5:
                            com.cmplay.internalpush.o.a().a(1, 8, r, h, "5", com.cmplay.internalpush.n.a().b(), 0, e.i());
                            break;
                        case 6:
                            com.cmplay.internalpush.o.a().a(1, 8, r, h, "6", com.cmplay.internalpush.n.a().b(), 0, e.i());
                            break;
                        case 7:
                            com.cmplay.internalpush.o.a().a(1, 8, r, h, "7", com.cmplay.internalpush.n.a().b(), 0, e.i());
                            break;
                        case 8:
                            com.cmplay.base.util.h.a("zzb", e.h() + " 无网，去筛选缓存的-----------");
                            break;
                    }
                }
            });
            return;
        }
        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getNextVideo()  开屏视频  info=null  没有需要下载");
    }

    public boolean g() {
        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getVideoCanShowList()  过滤找出需要下载视频的");
        this.f4239a.clear();
        if (this.f4244c.isEmpty()) {
            return false;
        }
        int size = this.f4244c.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            c cVar = this.f4244c.get(i);
            if (cVar != null && 2 == cVar.R()) {
                com.cmplay.internalpush.a.c.f4175a = 0;
                if (((cVar.t() != 4 && com.cmplay.internalpush.a.c.a(this.i, cVar)) || cVar.t() == 4 || cVar.t() == 2) && com.cmplay.internalpush.a.c.a(cVar) && com.cmplay.internalpush.a.c.i(cVar)) {
                    this.f4239a.add(cVar);
                    com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getVideoCanShowList()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                    z = true;
                } else {
                    com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getVideoCanShowList()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                }
            }
        }
        com.cmplay.base.util.h.a("internal_push", "OpenScreenParseCloudData.getVideoCanShowList()  haveDataDl:" + z + "  mInfoList.size()" + this.f4244c.size() + "  mAdVideoCanShowList.size():" + this.f4239a.size());
        return z;
    }
}
