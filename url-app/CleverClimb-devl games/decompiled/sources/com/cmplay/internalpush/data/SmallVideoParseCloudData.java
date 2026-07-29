package com.cmplay.internalpush.data;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.cmplay.base.util.s;
import com.cmplay.internalpush.ipc.IpcCloudHelper;
import com.cmplay.internalpush.video.a.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class SmallVideoParseCloudData extends n {

    /* renamed from: a, reason: collision with root package name */
    private static SmallVideoParseCloudData f4192a;
    private com.cmplay.internalpush.video.b.c m;
    private HandlerThread o;
    private Handler p;
    private VideoProgressStatusReceiver v;
    private com.cmplay.internalpush.video.b.a w;
    private Timer x;
    private boolean l = false;
    private boolean n = false;
    private int q = 0;
    private int r = 0;
    private List<c> s = new ArrayList();
    private List<Long> t = new ArrayList();
    private ArrayList<com.cmplay.internalpush.video.b.d> u = new ArrayList<>();
    private com.cmplay.internalpush.video.b.b y = new com.cmplay.internalpush.video.b.b() { // from class: com.cmplay.internalpush.data.SmallVideoParseCloudData.1
        @Override // com.cmplay.internalpush.video.b.b
        public void a() {
            if (!com.cmplay.internalpush.video.h.e) {
                com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.IVideoDownloadFinishCallback  先等待其其它视频拉取，innerpush不被允许拉取视频 not allowed load video");
            } else {
                SmallVideoParseCloudData.this.a(com.cmplay.internalpush.g.a(com.cmplay.base.util.j.c(), "inner_push_common_section", "inner_push_reward_video_init_delay_time", com.cmplay.base.util.j.d()) * 1000, new TimerTask() { // from class: com.cmplay.internalpush.data.SmallVideoParseCloudData.1.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.IVideoDownloadFinishCallback TimerTask    延时时间到，开始下载视频");
                        SmallVideoParseCloudData.this.f();
                    }
                });
            }
        }
    };

    @Override // com.cmplay.internalpush.data.n
    public String a() {
        return "section_small_video";
    }

    @Override // com.cmplay.internalpush.a.a.a
    public void c() {
    }

    static /* synthetic */ int b(SmallVideoParseCloudData smallVideoParseCloudData) {
        int i = smallVideoParseCloudData.q;
        smallVideoParseCloudData.q = i + 1;
        return i;
    }

    private SmallVideoParseCloudData(Context context) {
        this.i = context.getApplicationContext();
        com.cmplay.internalpush.a.d.a(context);
        this.o = new HandlerThread("clean_videocache_thread");
        this.o.start();
        this.p = new Handler(this.o.getLooper());
        d();
    }

    public void d() {
        this.v = new VideoProgressStatusReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.cmplay.small_video.Progress_notify");
        this.i.registerReceiver(this.v, intentFilter);
    }

    public static SmallVideoParseCloudData a(Context context) {
        if (f4192a == null) {
            f4192a = new SmallVideoParseCloudData(context);
        }
        return f4192a;
    }

    public void a(String str, com.cmplay.internalpush.video.b.a aVar, com.cmplay.internalpush.video.b.c cVar) {
        this.m = cVar;
        this.w = aVar;
        a(str);
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.startAsynPreLoadImg video json:" + str);
        if (this.f4244c.size() > 0 && com.cmplay.internalpush.video.f.f4379b != null) {
            com.cmplay.internalpush.video.f.f4379b.a(4);
        }
        g();
        boolean z = false;
        if (!this.f4244c.isEmpty()) {
            Iterator<c> it = this.f4244c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c next = it.next();
                if (next != null && com.cmplay.internalpush.a.c.a(next)) {
                    z = true;
                    break;
                }
            }
            com.cmplay.internalpush.o.a().a(8, z ? 21 : 22, "", 0L, z ? "" : Uri.encode(IpcCloudHelper.getInstance().innpush_getUrl("")), 0, 0, 0L);
        }
        e();
    }

    public void e() {
        a(true);
    }

    public void f() {
        a(false, (com.cmplay.internalpush.video.b.c) null);
    }

    public String c(String str) {
        return "innerpush_" + com.cmplay.internalpush.a.b.a(str, a());
    }

    public void a(boolean z, final com.cmplay.internalpush.video.b.c cVar) {
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextVideo()");
        if (z) {
            n();
        }
        ArrayList arrayList = new ArrayList(this.e);
        if (this.q > this.f4244c.size()) {
            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextVideo() 内推视频 循环遍历了一遍， resetDownloadFailTag  停止下一个下载");
            l();
            return;
        }
        com.cmplay.base.util.h.a("SmallVideoResultParseCloudData.getNextVideo()  内推视频 需要下载的个数：" + arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final c cVar2 = (c) it.next();
            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextVideo()  内推视频 开始下载 pro_id:" + cVar2.h() + "    isHitTopApp:" + cVar2.Y());
            cVar2.e(true);
            com.cmplay.internalpush.video.a.b.a().a(cVar2.h(), cVar2.r(), cVar2.F(), c(cVar2.F()), cVar2.l(), cVar2.y(), cVar2.i(), p(), new c.a() { // from class: com.cmplay.internalpush.data.SmallVideoParseCloudData.2
                @Override // com.cmplay.internalpush.video.a.c.a
                public void a(int i, String str) {
                    com.cmplay.base.util.h.a("info id =" + cVar2.h());
                    cVar2.e(false);
                    if (SmallVideoParseCloudData.this.m != null) {
                        if (i != 0 && i != 1000) {
                            SmallVideoParseCloudData.this.l = false;
                            SmallVideoParseCloudData.this.m.a(i, str);
                            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextVideo()  内推视频 下载失败 pro_id:" + cVar2.h());
                            SmallVideoParseCloudData.this.a(cVar2.h());
                            SmallVideoParseCloudData.b(SmallVideoParseCloudData.this);
                            if (s.c(SmallVideoParseCloudData.this.i)) {
                                com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextVideo()  内推视频 下载失败 有网络   下载下一个");
                                SmallVideoParseCloudData.this.a(true, (com.cmplay.internalpush.video.b.c) null);
                            } else {
                                com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextVideo()  内推视频 下载失败 无网络   停止下载下一个");
                            }
                        } else if (!SmallVideoParseCloudData.this.a(cVar2.h(), str)) {
                            SmallVideoParseCloudData.this.m.a(-1, "not set local video path");
                            if (cVar != null) {
                                cVar.a(-1, "not set local video path");
                            }
                            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextVideo()  内推视频 下载失败 pro_id:" + cVar2.h() + "   下载下一个");
                            SmallVideoParseCloudData.this.a(cVar2.h());
                            SmallVideoParseCloudData.b(SmallVideoParseCloudData.this);
                            SmallVideoParseCloudData.this.a(true, (com.cmplay.internalpush.video.b.c) null);
                        } else {
                            com.cmplay.base.util.h.a("internal_push", "zzb SmallVideoResultParseCloudData.getNextVideo()  内推视频 下载成功 pro_id:" + cVar2.h() + "    isLoaded = true");
                            SmallVideoParseCloudData.this.l();
                            SmallVideoParseCloudData.this.q = 0;
                            SmallVideoParseCloudData.this.l = true;
                            SmallVideoParseCloudData.this.m.b();
                            if (cVar != null) {
                                cVar.b();
                            }
                        }
                    }
                    String r = cVar2.r();
                    long h = cVar2.h();
                    if (cVar2.Y()) {
                        return;
                    }
                    if (i == 1000) {
                        com.cmplay.internalpush.o.a().a(8, 12, r, h, "1000", 0, SmallVideoParseCloudData.this.p(), (int) cVar2.i());
                    }
                    switch (i) {
                        case -1:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "-1", 0, SmallVideoParseCloudData.this.p(), (int) cVar2.i());
                            break;
                        case 0:
                            com.cmplay.internalpush.o.a().a(8, 7, r, h, "0", 0, SmallVideoParseCloudData.this.p(), (int) cVar2.i());
                            break;
                        case 1:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "1", 0, SmallVideoParseCloudData.this.p(), (int) cVar2.i());
                            break;
                        case 2:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "2", 0, SmallVideoParseCloudData.this.p(), (int) cVar2.i());
                            break;
                        case 3:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, Constants.ALL_LOAD, 0, SmallVideoParseCloudData.this.p(), (int) cVar2.i());
                            break;
                        case 4:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, Constants.ALL_READY, 0, SmallVideoParseCloudData.this.p(), (int) cVar2.i());
                            break;
                        case 5:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "5", 0, SmallVideoParseCloudData.this.p(), (int) cVar2.i());
                            break;
                        case 6:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "6", 0, SmallVideoParseCloudData.this.p(), (int) cVar2.i());
                            break;
                        case 7:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "7", 0, SmallVideoParseCloudData.this.p(), (int) cVar2.i());
                            break;
                        case 8:
                            com.cmplay.base.util.h.a("zzb", cVar2.h() + " 无网，去筛选缓存的-----------");
                            break;
                    }
                }
            });
        }
    }

    public void a(boolean z) {
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextHitTopVideo()");
        if (z) {
            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextHitTopVideo()  执行canShow()刷新mAdCansShowList");
            n();
        }
        if (this.q > this.s.size()) {
            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextHitTopVideo  爆款 内推视频 循环遍历了一遍， resetDownloadFailTag  停止下一个下载");
            l();
            if (this.y != null) {
                this.y.a();
                return;
            }
            return;
        }
        final c m = m();
        if (m != null) {
            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextHitTopVideo  爆款 内推视频 开始下载 pro_id:" + m.h() + "    isHitTopApp:" + m.Y());
            m.e(true);
            com.cmplay.internalpush.video.a.b.a().a(m.h(), m.r(), m.F(), c(m.F()), m.l(), m.y(), m.i(), p(), new c.a() { // from class: com.cmplay.internalpush.data.SmallVideoParseCloudData.3
                @Override // com.cmplay.internalpush.video.a.c.a
                public void a(int i, String str) {
                    com.cmplay.base.util.h.a("info id =" + m.h());
                    m.e(false);
                    if (i == 0 || i == 1000) {
                        if (SmallVideoParseCloudData.this.a(m.h(), str)) {
                            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextHitTopVideo  爆款 内推视频 下载成功 pro_id:" + m.h());
                            SmallVideoParseCloudData.this.l();
                            SmallVideoParseCloudData.this.a(false);
                            SmallVideoParseCloudData.this.q = 0;
                        } else {
                            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextHitTopVideo  爆款 内推视频 下载失败 pro_id:" + m.h() + "   下载下一个");
                            SmallVideoParseCloudData.this.a(m.h());
                            SmallVideoParseCloudData.b(SmallVideoParseCloudData.this);
                            SmallVideoParseCloudData.this.c(m.h());
                            SmallVideoParseCloudData.this.a(true);
                        }
                    } else {
                        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextHitTopVideo  爆款 内推视频 下载失败 pro_id:" + m.h() + "   下载下一个");
                        SmallVideoParseCloudData.this.a(m.h());
                        SmallVideoParseCloudData.b(SmallVideoParseCloudData.this);
                        SmallVideoParseCloudData.this.c(m.h());
                        SmallVideoParseCloudData.this.a(true);
                    }
                    String r = m.r();
                    long h = m.h();
                    if (i == 1000) {
                        com.cmplay.internalpush.o.a().a(8, 12, r, h, "1000", 0, 0, m.i());
                    }
                    switch (i) {
                        case -1:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "-1", 0, 0, m.i());
                            break;
                        case 0:
                            com.cmplay.internalpush.o.a().a(8, 7, r, h, "0", 0, 0, m.i());
                            break;
                        case 1:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "1", 0, 0, m.i());
                            break;
                        case 2:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "2", 0, 0, m.i());
                            break;
                        case 3:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, Constants.ALL_LOAD, 0, 0, m.i());
                            break;
                        case 4:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, Constants.ALL_READY, 0, 0, m.i());
                            break;
                        case 5:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "5", 0, 0, m.i());
                            break;
                        case 6:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "6", 0, 0, m.i());
                            break;
                        case 7:
                            com.cmplay.internalpush.o.a().a(8, 8, r, h, "7", 0, 0, m.i());
                            break;
                        case 8:
                            com.cmplay.base.util.h.a("zzb", m.h() + " 无网，去筛选缓存的-----------");
                            break;
                    }
                }
            });
            return;
        }
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getNextHitTopVideo  爆款 内推视频  info=null  没有需要下载");
        if (this.y != null) {
            this.y.a();
        }
    }

    public boolean g() {
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getHitTopCanShowList()  过滤找出需要下载素材的爆款");
        this.s.clear();
        this.t.clear();
        if (this.f.isEmpty()) {
            return false;
        }
        int size = this.f.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            c cVar = this.f.get(i);
            if (cVar != null && cVar.Y()) {
                com.cmplay.internalpush.a.c.f4175a = 0;
                if (com.cmplay.internalpush.a.c.a(this.i, cVar) && com.cmplay.internalpush.a.c.b(cVar) && com.cmplay.internalpush.a.c.i(cVar)) {
                    this.s.add(cVar);
                    com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getHitTopCanShowList()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                    z = true;
                } else {
                    com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getHitTopCanShowList()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                }
            }
        }
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getHitTopCanShowList()  haveDataDl:" + z + "  mAdHitTopDataList.size()" + this.f.size() + "  mHitTopDownloadList.size():" + this.s.size());
        return z;
    }

    public c m() {
        Iterator it = new ArrayList(this.s).iterator();
        c cVar = null;
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            if (cVar2 != null && !cVar2.U() && !com.cmplay.internalpush.a.c.h(cVar2)) {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        int i = 0;
        while (i < this.s.size()) {
            c cVar = this.s.get(i);
            if (cVar != null && cVar.h() == j) {
                this.t.add(Long.valueOf(cVar.h()));
                this.s.remove(i);
                i--;
            }
            i++;
        }
    }

    private void r() {
        Iterator<c> it = this.f4244c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            for (Long l : this.t) {
                if (next != null && next.h() == l.longValue()) {
                    next.f(true);
                }
            }
        }
    }

    @Override // com.cmplay.internalpush.data.n
    public CopyOnWriteArrayList<c> b() {
        return super.b();
    }

    private boolean s() {
        Iterator<c> it = this.f4244c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null && next.x() >= next.j()) {
                next.e(0);
            }
        }
        a(this.f4244c);
        StringBuilder sb = new StringBuilder();
        int size = this.f4244c.size();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= size) {
                break;
            }
            c cVar = this.f4244c.get(i);
            if (cVar != null) {
                com.cmplay.internalpush.a.c.f4175a = 0;
                if (com.cmplay.internalpush.a.c.a(this.i, cVar) && com.cmplay.internalpush.a.c.a(cVar) && com.cmplay.internalpush.a.c.c(cVar) && com.cmplay.internalpush.a.c.i(cVar) && com.cmplay.internalpush.a.c.k(cVar)) {
                    this.e.add(cVar);
                    com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.resetHaveRotationTimesAndCheckAgain() name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                    if (!cVar.Y()) {
                        z = true;
                        break;
                    }
                    z = true;
                } else {
                    if (i != 0) {
                        sb.append("!");
                    }
                    sb.append(String.valueOf(cVar.h()));
                    sb.append(":");
                    sb.append(String.valueOf(com.cmplay.internalpush.a.c.f4175a));
                    a(cVar, com.cmplay.internalpush.a.c.f4175a);
                    com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.resetHaveRotationTimesAndCheckAgain()name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                }
            }
            i++;
        }
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.resetHaveRotationTimesAndCheckAgain()  canShow:" + z + "   mInfoList.size():" + this.f4244c.size() + "    \tmErrorCodeStr:" + this.k);
        this.k = sb.toString();
        if (!z) {
            a(4);
        }
        return z;
    }

    public void b(long j) {
        com.cmplay.internalpush.o.a().a(8, 4, "", 0L, this.k, 0, p(), j);
    }

    public boolean n() {
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.canShow()");
        this.e.clear();
        this.f.clear();
        this.g.clear();
        b();
        r();
        if (!this.f4244c.isEmpty()) {
            boolean a2 = com.cmplay.internalpush.a.b.a(com.cmplay.internalpush.a.d.a("last_show_hit_top_time" + a(), 0L));
            int size = this.f4244c.size();
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= size) {
                    break;
                }
                c cVar = this.f4244c.get(i);
                if (cVar != null) {
                    if (!a2 && cVar.Y()) {
                        cVar.r(0);
                        cVar.e(0);
                        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.canShow()  不是相同自然天，重置爆款当天展示次");
                    }
                    com.cmplay.internalpush.a.c.f4175a = 0;
                    if (com.cmplay.internalpush.a.c.a(this.i, cVar) && com.cmplay.internalpush.a.c.a(cVar) && com.cmplay.internalpush.a.c.c(cVar) && com.cmplay.internalpush.a.c.i(cVar) && com.cmplay.internalpush.a.c.k(cVar)) {
                        this.e.add(cVar);
                        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.canShow() name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                        if (!cVar.Y()) {
                            z = true;
                            break;
                        }
                        z = true;
                    } else {
                        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.canShow() name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                    }
                }
                i++;
            }
            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.canShow()  canShow:" + z + "  mInfoList.size()" + this.f4244c.size() + "     mAdCansShowList.size():" + this.e.size());
            return !z ? s() : z;
        }
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.canShow()  没有数据");
        com.cmplay.internalpush.o.a().a(8, 16, "", 0L, String.valueOf(10), p(), 0, 0L);
        return false;
    }

    public boolean a(final Activity activity, final int i, final int i2, final int i3, final int i4, final int i5) {
        com.cmplay.internalpush.s.a().a(activity);
        this.r = i5;
        if (this.e.isEmpty()) {
            return false;
        }
        c cVar = this.e.get(0);
        if (!TextUtils.isEmpty(cVar.r()) && com.cmplay.internalpush.a.b.a(this.i, cVar.r())) {
            com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.show()   已经安装");
            a(true, new com.cmplay.internalpush.video.b.c() { // from class: com.cmplay.internalpush.data.SmallVideoParseCloudData.4
                @Override // com.cmplay.internalpush.video.b.c
                public void a(int i6, String str) {
                }

                @Override // com.cmplay.internalpush.video.b.c
                public void b() {
                    com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.show()  1 成功获取下一个展示");
                    SmallVideoParseCloudData.this.a(activity, i, i2, i3, i4, i5);
                }
            });
            return false;
        }
        boolean a2 = a(cVar);
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.show()   isShow =" + a2);
        if (a2) {
            k();
            String o = o();
            com.cmplay.internalpush.s.a().a(activity, i, i2, i3, i4, o, 8);
            h hVar = new h(o);
            com.cmplay.internalpush.o.a().a(8, 1, hVar.e(), hVar.c(), "", p(), 0, hVar.l());
            return true;
        }
        this.l = false;
        return false;
    }

    public void a(com.cmplay.internalpush.video.b.d dVar) {
        if (this.u.contains(dVar)) {
            return;
        }
        com.cmplay.base.util.h.a("internal_push", "SmallVideoParseCloudData  setShowVideoListener   mVideoPlayingCallBackList.add(listener)");
        this.u.add(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        Iterator<com.cmplay.internalpush.video.b.d> it = this.u.iterator();
        while (it.hasNext()) {
            com.cmplay.internalpush.video.b.d next = it.next();
            if (next != null) {
                next.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        Iterator<com.cmplay.internalpush.video.b.d> it = this.u.iterator();
        while (it.hasNext()) {
            com.cmplay.internalpush.video.b.d next = it.next();
            if (next != null) {
                next.a(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        Iterator<com.cmplay.internalpush.video.b.d> it = this.u.iterator();
        while (it.hasNext()) {
            com.cmplay.internalpush.video.b.d next = it.next();
            if (next != null) {
                next.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        Iterator<com.cmplay.internalpush.video.b.d> it = this.u.iterator();
        while (it.hasNext()) {
            com.cmplay.internalpush.video.b.d next = it.next();
            if (next != null) {
                next.c(str);
            }
        }
    }

    public boolean b(int i) {
        this.r = i;
        com.cmplay.base.util.h.a("reportNeituiSdkApp", "SmallVideoResultParseCloudData.isPlayable scene:" + this.r);
        return this.l;
    }

    public boolean a(c cVar) {
        if (cVar == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.cmplay.base.util.h.a("zzb", "show id =" + cVar.h() + ", videourl=" + cVar.F() + ", ");
        StringBuilder sb = new StringBuilder();
        sb.append("show LocalPathVideo=");
        sb.append(cVar.G());
        com.cmplay.base.util.h.a("zzb", sb.toString());
        if (!TextUtils.isEmpty(cVar.F()) && !TextUtils.isEmpty(cVar.G())) {
            File file = new File(cVar.G());
            if (file.exists() && file.length() > 0) {
                com.cmplay.base.util.h.a("zzb", "checkVideoDownloaded 耗时：" + (System.currentTimeMillis() - currentTimeMillis));
                return true;
            }
        }
        return false;
    }

    public String o() {
        String str;
        if (this.h != null) {
            str = new h(this.h.h(), this.h.r(), this.h.A(), this.h.B(), this.h.F(), this.h.G(), this.h.H(), this.h.I(), this.h.t(), this.h.s(), this.h.N(), this.h.M(), this.h.b(), this.r, this.h.i()).n();
        } else if (this.e.isEmpty()) {
            str = null;
        } else {
            this.h = this.e.get(0);
            a(this.h.h(), 1);
            if (this.h.Y()) {
                com.cmplay.internalpush.a.d.b("last_show_hit_top_time" + a(), System.currentTimeMillis());
            } else {
                com.cmplay.internalpush.a.d.b("last_show_open_screen_time" + a(), System.currentTimeMillis());
            }
            str = new h(this.h.h(), this.h.r(), this.h.A(), this.h.B(), this.h.F(), this.h.G(), this.h.H(), this.h.I(), this.h.t(), this.h.s(), this.h.N(), this.h.M(), this.h.b(), this.r, this.h.i()).n();
        }
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.getInnerPushModelForShow  dataJson:" + str);
        return str;
    }

    public class VideoProgressStatusReceiver extends BroadcastReceiver {
        public VideoProgressStatusReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !intent.getAction().equals("com.cmplay.small_video.Progress_notify")) {
                return;
            }
            switch (intent.getIntExtra("video_progress_status", 0)) {
                case 1:
                    com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.VideoProgressStatusReceiver  onReceive onVideoShow()");
                    SmallVideoParseCloudData.this.t();
                    SmallVideoParseCloudData.this.l = false;
                    SmallVideoParseCloudData.this.a(true, (com.cmplay.internalpush.video.b.c) null);
                    SmallVideoParseCloudData.this.n = true;
                    break;
                case 2:
                    boolean booleanExtra = intent.getBooleanExtra("is_complete_view", false);
                    com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.VideoProgressStatusReceiver  onReceive onVideoComplete()");
                    SmallVideoParseCloudData.this.b(booleanExtra);
                    break;
                case 3:
                    com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.VideoProgressStatusReceiver  onReceive onVideoClick()");
                    SmallVideoParseCloudData.this.u();
                    break;
                case 4:
                    String stringExtra = intent.getStringExtra("error_info");
                    com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.VideoProgressStatusReceiver  onReceive onVideoShowFail()");
                    SmallVideoParseCloudData.this.d(stringExtra);
                    SmallVideoParseCloudData.this.n = false;
                    break;
                case 5:
                    SmallVideoParseCloudData.this.n = false;
                    break;
            }
        }
    }

    public int p() {
        com.cmplay.base.util.h.a("reportNeituiSdkApp", "SmallVideoResultParseCloudData.getScence scene:" + this.r);
        return this.r;
    }

    public void a(int i, TimerTask timerTask) {
        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData.startTimer   delayTime:" + i);
        q();
        v();
        if (i < 0) {
            i = 0;
        }
        this.x.schedule(timerTask, i);
    }

    private void v() {
        if (this.x == null) {
            this.x = new Timer();
        }
    }

    public void q() {
        if (this.x != null) {
            this.x.cancel();
            this.x = null;
        }
    }
}
