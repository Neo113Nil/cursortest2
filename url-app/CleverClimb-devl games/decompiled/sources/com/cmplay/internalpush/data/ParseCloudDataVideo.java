package com.cmplay.internalpush.data;

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
import com.cmplay.internalpush.video.IncentiveVideoPlayActivity;
import com.cmplay.internalpush.video.a.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ParseCloudDataVideo extends n {

    /* renamed from: a, reason: collision with root package name */
    private static ParseCloudDataVideo f4183a = null;
    private static int y = 800;
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
    private long z = 0;
    private com.cmplay.internalpush.video.b.b A = new com.cmplay.internalpush.video.b.b() { // from class: com.cmplay.internalpush.data.ParseCloudDataVideo.2
        @Override // com.cmplay.internalpush.video.b.b
        public void a() {
            if (!com.cmplay.internalpush.video.h.e) {
                com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.IVideoDownloadFinishCallback  先等待其其它视频拉取，innerpush不被允许拉取视频 not allowed load video");
            } else {
                ParseCloudDataVideo.this.a(com.cmplay.internalpush.g.a(com.cmplay.base.util.j.c(), "inner_push_common_section", "inner_push_reward_video_init_delay_time", com.cmplay.base.util.j.d()) * 1000, new TimerTask() { // from class: com.cmplay.internalpush.data.ParseCloudDataVideo.2.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.IVideoDownloadFinishCallback TimerTask    延时时间到，开始下载视频");
                        ParseCloudDataVideo.this.f();
                    }
                });
            }
        }
    };

    @Override // com.cmplay.internalpush.data.n
    public String a() {
        return "section_video_distribution";
    }

    @Override // com.cmplay.internalpush.a.a.a
    public void c() {
    }

    static /* synthetic */ int e(ParseCloudDataVideo parseCloudDataVideo) {
        int i = parseCloudDataVideo.q;
        parseCloudDataVideo.q = i + 1;
        return i;
    }

    private ParseCloudDataVideo(Context context) {
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
        intentFilter.addAction("com.cmplay.libinnerpushvideo.video.Progress_notify");
        this.i.registerReceiver(this.v, intentFilter);
    }

    public static ParseCloudDataVideo a(Context context) {
        if (f4183a == null) {
            f4183a = new ParseCloudDataVideo(context);
        }
        return f4183a;
    }

    public void a(String str, com.cmplay.internalpush.video.b.a aVar, com.cmplay.internalpush.video.b.c cVar) {
        this.m = cVar;
        this.w = aVar;
        a(str);
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.startAsynPreLoadImg video json:" + str);
        if (this.f4244c.size() > 0 && com.cmplay.internalpush.video.e.f4377b != null) {
            com.cmplay.internalpush.video.e.f4377b.a(4);
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
            com.cmplay.internalpush.o.a().a(4, z ? 21 : 22, "", 0L, z ? "" : Uri.encode(IpcCloudHelper.getInstance().innpush_getUrl("")), 0, 0, 0L);
        }
        if (!this.n) {
            this.p.post(new Runnable() { // from class: com.cmplay.internalpush.data.ParseCloudDataVideo.1
                @Override // java.lang.Runnable
                public void run() {
                    ArrayList<String> arrayList = new ArrayList<>();
                    Iterator<c> it2 = ParseCloudDataVideo.this.f4244c.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(ParseCloudDataVideo.this.c(it2.next().F()));
                    }
                    Iterator it3 = ParseCloudDataVideo.this.r().iterator();
                    while (it3.hasNext()) {
                        arrayList.add(ParseCloudDataVideo.this.c(((c) it3.next()).F()));
                    }
                    Iterator it4 = ParseCloudDataVideo.this.s().iterator();
                    while (it4.hasNext()) {
                        arrayList.add(SmallVideoParseCloudData.a(ParseCloudDataVideo.this.i).c(((c) it4.next()).F()));
                    }
                    Iterator it5 = ParseCloudDataVideo.this.t().iterator();
                    while (it5.hasNext()) {
                        arrayList.add(SmallVideoSettingParseCloudData.a(ParseCloudDataVideo.this.i).c(((c) it5.next()).F()));
                    }
                    com.cmplay.internalpush.video.a.b.a().a(arrayList);
                }
            });
        }
        e();
    }

    public void e() {
        b(true);
    }

    public void f() {
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<c> r() {
        return a(com.cmplay.internalpush.a.a.b.a().a(com.cmplay.base.util.j.c(), "open_screen_scene"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<c> s() {
        return a(com.cmplay.internalpush.a.a.b.a().a(com.cmplay.base.util.j.c(), "section_small_video"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<c> t() {
        return a(com.cmplay.internalpush.a.a.b.a().a(com.cmplay.base.util.j.c(), "section_small_video_setting"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        return "innerpush_" + com.cmplay.internalpush.a.b.a(str, a());
    }

    public void a(boolean z) {
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextVideo()");
        if (z) {
            n();
        }
        ArrayList arrayList = new ArrayList(this.e);
        if (this.q > this.f4244c.size()) {
            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextVideo() 内推视频 循环遍历了一遍， resetDownloadFailTag  停止下一个下载");
            l();
            return;
        }
        com.cmplay.base.util.h.a("ParseCloudDataVideo.getNextVideo()  内推视频 需要下载的个数：" + arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final c cVar = (c) it.next();
            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextVideo()  内推视频 开始下载 pro_id:" + cVar.h() + "    isHitTopApp:" + cVar.Y());
            cVar.e(true);
            com.cmplay.internalpush.video.a.b.a().a(cVar.h(), cVar.r(), cVar.F(), c(cVar.F()), cVar.l(), cVar.y(), cVar.i(), p(), new c.a() { // from class: com.cmplay.internalpush.data.ParseCloudDataVideo.3
                @Override // com.cmplay.internalpush.video.a.c.a
                public void a(int i, String str) {
                    com.cmplay.base.util.h.a("info id =" + cVar.h());
                    cVar.e(false);
                    if (ParseCloudDataVideo.this.m != null) {
                        if (i != 0 && i != 1000) {
                            ParseCloudDataVideo.this.l = false;
                            ParseCloudDataVideo.this.m.a(i, str);
                            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextVideo()  内推视频 下载失败 pro_id:" + cVar.h());
                            ParseCloudDataVideo.this.a(cVar.h());
                            ParseCloudDataVideo.e(ParseCloudDataVideo.this);
                            if (s.c(ParseCloudDataVideo.this.i)) {
                                com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextVideo()  内推视频 下载失败 有网络   下载下一个");
                                ParseCloudDataVideo.this.a(true);
                            } else {
                                com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextVideo()  内推视频 下载失败 无网络   停止下载下一个");
                            }
                        } else if (!ParseCloudDataVideo.this.a(cVar.h(), str)) {
                            ParseCloudDataVideo.this.m.a(-1, "not set local video path");
                            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextVideo()  内推视频 下载失败 pro_id:" + cVar.h() + "   下载下一个");
                            ParseCloudDataVideo.this.a(cVar.h());
                            ParseCloudDataVideo.e(ParseCloudDataVideo.this);
                            ParseCloudDataVideo.this.a(true);
                        } else {
                            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextVideo()  内推视频 下载成功 pro_id:" + cVar.h() + "    isLoaded = true");
                            ParseCloudDataVideo.this.l();
                            ParseCloudDataVideo.this.q = 0;
                            ParseCloudDataVideo.this.l = true;
                            ParseCloudDataVideo.this.m.b();
                        }
                    }
                    String r = cVar.r();
                    long h = cVar.h();
                    if (cVar.Y()) {
                        return;
                    }
                    if (i == 1000) {
                        com.cmplay.internalpush.o.a().a(4, 12, r, h, "1000", 0, ParseCloudDataVideo.this.p(), (int) cVar.i());
                    }
                    switch (i) {
                        case -1:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "-1", 0, ParseCloudDataVideo.this.p(), (int) cVar.i());
                            break;
                        case 0:
                            com.cmplay.internalpush.o.a().a(4, 7, r, h, "0", 0, ParseCloudDataVideo.this.p(), (int) cVar.i());
                            break;
                        case 1:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "1", 0, ParseCloudDataVideo.this.p(), (int) cVar.i());
                            break;
                        case 2:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "2", 0, ParseCloudDataVideo.this.p(), (int) cVar.i());
                            break;
                        case 3:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, Constants.ALL_LOAD, 0, ParseCloudDataVideo.this.p(), (int) cVar.i());
                            break;
                        case 4:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, Constants.ALL_READY, 0, ParseCloudDataVideo.this.p(), (int) cVar.i());
                            break;
                        case 5:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "5", 0, ParseCloudDataVideo.this.p(), (int) cVar.i());
                            break;
                        case 6:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "6", 0, ParseCloudDataVideo.this.p(), (int) cVar.i());
                            break;
                        case 7:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "7", 0, ParseCloudDataVideo.this.p(), (int) cVar.i());
                            break;
                        case 8:
                            com.cmplay.base.util.h.a("zzb", cVar.h() + " 无网，去筛选缓存的-----------");
                            break;
                    }
                }
            });
            if (!com.cmplay.internalpush.video.h.f4392d) {
                com.cmplay.internalpush.video.h.a(cVar.l());
                com.cmplay.internalpush.video.h.a(cVar.y());
            }
        }
    }

    public void b(boolean z) {
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextHitTopVideo()");
        if (z) {
            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextHitTopVideo()  执行canShow()刷新mAdCansShowList");
            n();
        }
        if (this.q > this.s.size()) {
            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextHitTopVideo  爆款 内推视频 循环遍历了一遍， resetDownloadFailTag  停止下一个下载");
            l();
            if (this.A != null) {
                this.A.a();
                return;
            }
            return;
        }
        final c m = m();
        if (m != null) {
            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextHitTopVideo  爆款 内推视频 开始下载 pro_id:" + m.h() + "    isHitTopApp:" + m.Y());
            m.e(true);
            com.cmplay.internalpush.video.a.b.a().a(m.h(), m.r(), m.F(), c(m.F()), m.l(), m.y(), m.i(), p(), new c.a() { // from class: com.cmplay.internalpush.data.ParseCloudDataVideo.4
                @Override // com.cmplay.internalpush.video.a.c.a
                public void a(int i, String str) {
                    com.cmplay.base.util.h.a("info id =" + m.h());
                    m.e(false);
                    if (i == 0 || i == 1000) {
                        if (ParseCloudDataVideo.this.a(m.h(), str)) {
                            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextHitTopVideo  爆款 内推视频 下载成功 pro_id:" + m.h());
                            ParseCloudDataVideo.this.l();
                            ParseCloudDataVideo.this.b(false);
                            ParseCloudDataVideo.this.q = 0;
                        } else {
                            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextHitTopVideo  爆款 内推视频 下载失败 pro_id:" + m.h() + "   下载下一个");
                            ParseCloudDataVideo.this.a(m.h());
                            ParseCloudDataVideo.e(ParseCloudDataVideo.this);
                            ParseCloudDataVideo.this.c(m.h());
                            ParseCloudDataVideo.this.b(true);
                        }
                    } else {
                        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextHitTopVideo  爆款 内推视频 下载失败 pro_id:" + m.h() + "   下载下一个");
                        ParseCloudDataVideo.this.a(m.h());
                        ParseCloudDataVideo.e(ParseCloudDataVideo.this);
                        ParseCloudDataVideo.this.c(m.h());
                        ParseCloudDataVideo.this.b(true);
                    }
                    String r = m.r();
                    long h = m.h();
                    if (i == 1000) {
                        com.cmplay.internalpush.o.a().a(4, 12, r, h, "1000", 0, 0, m.i());
                    }
                    switch (i) {
                        case -1:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "-1", 0, 0, m.i());
                            break;
                        case 0:
                            com.cmplay.internalpush.o.a().a(4, 7, r, h, "0", 0, 0, m.i());
                            break;
                        case 1:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "1", 0, 0, m.i());
                            break;
                        case 2:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "2", 0, 0, m.i());
                            break;
                        case 3:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, Constants.ALL_LOAD, 0, 0, m.i());
                            break;
                        case 4:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, Constants.ALL_READY, 0, 0, m.i());
                            break;
                        case 5:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "5", 0, 0, m.i());
                            break;
                        case 6:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "6", 0, 0, m.i());
                            break;
                        case 7:
                            com.cmplay.internalpush.o.a().a(4, 8, r, h, "7", 0, 0, m.i());
                            break;
                        case 8:
                            com.cmplay.base.util.h.a("zzb", m.h() + " 无网，去筛选缓存的-----------");
                            break;
                    }
                }
            });
            return;
        }
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getNextHitTopVideo  爆款 内推视频  info=null  没有需要下载");
        if (this.A != null) {
            this.A.a();
        }
    }

    public boolean g() {
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getHitTopCanShowList()  过滤找出需要下载素材的爆款");
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
                    com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getHitTopCanShowList()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                    z = true;
                } else {
                    com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getHitTopCanShowList()  name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                }
            }
        }
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getHitTopCanShowList()  haveDataDl:" + z + "  mAdHitTopDataList.size()" + this.f.size() + "  mHitTopDownloadList.size():" + this.s.size());
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

    private void u() {
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

    private boolean v() {
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
                    com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.resetHaveRotationTimesAndCheckAgain() name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
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
                    com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.resetHaveRotationTimesAndCheckAgain()name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                }
            }
            i++;
        }
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.resetHaveRotationTimesAndCheckAgain()  canShow:" + z + "   mInfoList.size():" + this.f4244c.size() + "    \tmErrorCodeStr:" + this.k);
        this.k = sb.toString();
        if (!z) {
            a(4);
        }
        return z;
    }

    public void b(long j) {
        com.cmplay.internalpush.o.a().a(4, 4, "", 0L, this.k, 0, p(), j);
    }

    public boolean n() {
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.canShow()");
        this.e.clear();
        this.f.clear();
        this.g.clear();
        b();
        u();
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
                        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.canShow()  不是相同自然天，重置爆款当天展示次");
                    }
                    com.cmplay.internalpush.a.c.f4175a = 0;
                    if (com.cmplay.internalpush.a.c.a(this.i, cVar) && com.cmplay.internalpush.a.c.a(cVar) && com.cmplay.internalpush.a.c.c(cVar) && com.cmplay.internalpush.a.c.i(cVar) && com.cmplay.internalpush.a.c.k(cVar)) {
                        this.e.add(cVar);
                        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.canShow() name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                        if (!cVar.Y()) {
                            z = true;
                            break;
                        }
                        z = true;
                    } else {
                        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.canShow() name:" + cVar.g() + "  pro_id:" + cVar.h() + "  filter rusult:" + com.cmplay.internalpush.a.c.a(com.cmplay.internalpush.a.c.f4175a));
                    }
                }
                i++;
            }
            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.canShow()  canShow:" + z + "  mInfoList.size()" + this.f4244c.size() + "     mAdCansShowList.size():" + this.e.size());
            return !z ? v() : z;
        }
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.canShow()  没有数据");
        com.cmplay.internalpush.o.a().a(4, 16, "", 0L, String.valueOf(10), p(), 0, 0L);
        return false;
    }

    public boolean b(int i) {
        this.r = i;
        if (this.e.isEmpty()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.z > y) {
            this.z = currentTimeMillis;
            boolean a2 = a(this.e.get(0));
            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.show()   isShow =" + a2);
            if (a2) {
                k();
                return IncentiveVideoPlayActivity.a(this.i, false, o());
            }
        } else {
            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.show()    频繁调起");
        }
        this.l = false;
        return false;
    }

    public void a(com.cmplay.internalpush.video.b.d dVar) {
        if (this.u.contains(dVar)) {
            return;
        }
        this.u.add(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        Iterator<com.cmplay.internalpush.video.b.d> it = this.u.iterator();
        while (it.hasNext()) {
            com.cmplay.internalpush.video.b.d next = it.next();
            if (next != null) {
                next.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        Iterator<com.cmplay.internalpush.video.b.d> it = this.u.iterator();
        while (it.hasNext()) {
            com.cmplay.internalpush.video.b.d next = it.next();
            if (next != null) {
                next.a(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
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

    public boolean c(int i) {
        this.r = i;
        com.cmplay.base.util.h.a("reportNeituiSdkApp", "ParseCloudDataVideo.isPlayable scene:" + this.r);
        return this.l;
    }

    public boolean d(int i) {
        c cVar;
        this.r = i;
        boolean z = false;
        if (!this.e.isEmpty() && (cVar = this.e.get(0)) != null && cVar.Y() && a(cVar)) {
            z = true;
        }
        com.cmplay.base.util.h.a("reportNeituiSdkApp", "ParseCloudDataVideo.isHitTopPlayable scene:" + this.r + "   isHitTopPlayable:" + z);
        return z;
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
            str = new com.cmplay.internalpush.video.b(this.h.h(), this.h.r(), this.h.A(), this.h.B(), this.h.y(), this.h.F(), this.h.G(), this.h.l(), this.h.H(), this.h.I(), this.h.t(), this.h.s(), this.h.J(), this.h.K(), this.h.N(), this.h.M(), this.h.b(), this.r, this.h.i()).n();
        } else if (this.e.isEmpty()) {
            str = null;
        } else {
            this.h = this.e.get(0);
            a(this.i).a(this.h.h(), 1);
            if (this.h.Y()) {
                com.cmplay.internalpush.a.d.b("last_show_hit_top_time" + a(), System.currentTimeMillis());
            } else {
                com.cmplay.internalpush.a.d.b("last_show_open_screen_time" + a(), System.currentTimeMillis());
            }
            str = new com.cmplay.internalpush.video.b(this.h.h(), this.h.r(), this.h.A(), this.h.B(), this.h.y(), this.h.F(), this.h.G(), this.h.l(), this.h.H(), this.h.I(), this.h.t(), this.h.s(), this.h.J(), this.h.K(), this.h.N(), this.h.M(), this.h.b(), this.r, this.h.i()).n();
        }
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.getInnerPushModelForShow  dataJson:" + str);
        return str;
    }

    public class VideoProgressStatusReceiver extends BroadcastReceiver {
        public VideoProgressStatusReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !intent.getAction().equals("com.cmplay.libinnerpushvideo.video.Progress_notify")) {
                return;
            }
            switch (intent.getIntExtra("video_progress_status", 0)) {
                case 1:
                    com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.VideoProgressStatusReceiver  onReceive onVideoShow()");
                    ParseCloudDataVideo.this.w();
                    ParseCloudDataVideo.this.l = false;
                    ParseCloudDataVideo.this.a(true);
                    ParseCloudDataVideo.this.n = true;
                    break;
                case 2:
                    boolean booleanExtra = intent.getBooleanExtra("is_complete_view", false);
                    com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.VideoProgressStatusReceiver  onReceive onVideoComplete()");
                    ParseCloudDataVideo.this.c(booleanExtra);
                    break;
                case 3:
                    com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.VideoProgressStatusReceiver  onReceive onVideoClick()");
                    ParseCloudDataVideo.this.x();
                    break;
                case 4:
                    String stringExtra = intent.getStringExtra("error_info");
                    com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.VideoProgressStatusReceiver  onReceive onVideoShowFail()");
                    ParseCloudDataVideo.this.d(stringExtra);
                    ParseCloudDataVideo.this.n = false;
                    break;
                case 5:
                    ParseCloudDataVideo.this.n = false;
                    break;
            }
        }
    }

    public int p() {
        com.cmplay.base.util.h.a("reportNeituiSdkApp", "ParseCloudDataVideo.getScence scene:" + this.r);
        return this.r;
    }

    public void a(int i, TimerTask timerTask) {
        com.cmplay.base.util.h.a("internal_push", "ParseCloudDataVideo.startTimer   delayTime:" + i);
        q();
        y();
        if (i < 0) {
            i = 0;
        }
        this.x.schedule(timerTask, i);
    }

    private void y() {
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
