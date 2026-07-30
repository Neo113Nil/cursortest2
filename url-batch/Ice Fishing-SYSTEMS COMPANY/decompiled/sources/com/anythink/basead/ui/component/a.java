package com.anythink.basead.ui.component;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.b.e;
import com.anythink.basead.d.f;
import com.anythink.basead.d.j;
import com.anythink.basead.d.k;
import com.anythink.basead.ui.RoundCornerRelativeLayout;
import com.anythink.basead.ui.animplayerview.AlbumScaleAnimPlayerView;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.basead.ui.animplayerview.EmptyAnimPlayer;
import com.anythink.basead.ui.animplayerview.GuideToClickAnimPlayerView;
import com.anythink.basead.ui.animplayerview.RedPacketAnimPlayerView;
import com.anythink.basead.ui.animplayerview.ViewPagerAnimPlayerView;
import com.anythink.basead.ui.animplayerview.WebLandpagePlayerView;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.basead.webtemplet.WTWebContainerView;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.a.n;
import com.anythink.core.common.a.o;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.bl;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b.c;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10825a;

    /* renamed from: b, reason: collision with root package name */
    Context f10826b;

    /* renamed from: c, reason: collision with root package name */
    x f10827c;

    /* renamed from: d, reason: collision with root package name */
    w f10828d;

    /* renamed from: e, reason: collision with root package name */
    int f10829e;

    /* renamed from: f, reason: collision with root package name */
    boolean f10830f;

    /* renamed from: g, reason: collision with root package name */
    com.anythink.basead.ui.improveclick.a f10831g;

    /* renamed from: h, reason: collision with root package name */
    BasePlayerView f10832h;
    BasePlayerView.a i;

    /* renamed from: j, reason: collision with root package name */
    InterfaceC0055a f10833j;

    /* renamed from: k, reason: collision with root package name */
    long f10834k;

    /* renamed from: l, reason: collision with root package name */
    long f10835l;

    /* renamed from: m, reason: collision with root package name */
    BasePlayerView.a f10836m;

    /* renamed from: n, reason: collision with root package name */
    ConcurrentHashMap<Integer, Boolean> f10837n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.basead.a.a f10838o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10839p;

    /* renamed from: q, reason: collision with root package name */
    private View f10840q;

    /* renamed from: r, reason: collision with root package name */
    private WTWebContainerView f10841r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f10842s;

    /* renamed from: com.anythink.basead.ui.component.a$a, reason: collision with other inner class name */
    public interface InterfaceC0055a {
        j a();

        com.anythink.basead.d.a b();
    }

    public a(View view, x xVar, w wVar) {
        this(view, xVar, wVar, m.f(view.getContext()));
    }

    private void q() {
        InterfaceC0055a interfaceC0055a = this.f10833j;
        if (interfaceC0055a != null) {
            com.anythink.basead.b.b.a(1, this.f10828d, interfaceC0055a.a());
        }
    }

    private void r() {
        InterfaceC0055a interfaceC0055a = this.f10833j;
        if (interfaceC0055a != null) {
            j a9 = interfaceC0055a.a();
            com.anythink.basead.b.b.a(5, this.f10828d, a9);
            com.anythink.basead.b.b.a(31, this.f10828d, a9);
        }
    }

    private void s() {
        InterfaceC0055a interfaceC0055a = this.f10833j;
        if (interfaceC0055a != null) {
            j a9 = interfaceC0055a.a();
            a9.f6371j = d(false);
            com.anythink.basead.b.b.a(17, this.f10828d, a9);
        }
    }

    private void t() {
        InterfaceC0055a interfaceC0055a = this.f10833j;
        if (interfaceC0055a != null) {
            j a9 = interfaceC0055a.a();
            a9.i = this.f10833j.b();
            com.anythink.basead.b.b.a(14, this.f10828d, a9);
        }
    }

    private void u() {
        InterfaceC0055a interfaceC0055a = this.f10833j;
        if (interfaceC0055a != null) {
            com.anythink.basead.b.b.a(35, this.f10828d, interfaceC0055a.a());
        }
    }

    private void v() {
        InterfaceC0055a interfaceC0055a = this.f10833j;
        if (interfaceC0055a != null) {
            j a9 = interfaceC0055a.a();
            a9.i = this.f10833j.b();
            com.anythink.basead.b.b.a(16, this.f10828d, a9);
        }
    }

    private void w() {
        if (this.f10833j != null) {
            this.f10834k = System.currentTimeMillis();
            long currentPosition = this.f10832h.getCurrentPosition();
            this.f10835l = currentPosition;
            if (currentPosition != 0) {
                com.anythink.basead.b.b.a(15, this.f10828d, this.f10833j.a());
            }
        }
    }

    private void x() {
        InterfaceC0055a interfaceC0055a = this.f10833j;
        if (interfaceC0055a != null) {
            com.anythink.basead.b.b.a(11, this.f10828d, interfaceC0055a.a());
        }
    }

    private void y() {
        if (this.f10839p) {
            if (this.f10838o == null) {
                com.anythink.basead.a.a aVar = new com.anythink.basead.a.a();
                this.f10838o = aVar;
                aVar.a(this.f10826b);
            }
            this.f10838o.a();
        }
    }

    private void z() {
        com.anythink.basead.a.a aVar = this.f10838o;
        if (aVar != null) {
            aVar.b();
            this.f10838o = null;
        }
    }

    public final void a(int i) {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            basePlayerView.setViewType(i);
        }
    }

    public final void b(int i) {
        com.anythink.basead.ui.improveclick.a aVar = this.f10831g;
        if (aVar != null) {
            aVar.a(i);
        }
        if (this.f10841r != null) {
            com.anythink.basead.ui.improveclick.a aVar2 = this.f10831g;
            this.f10841r.notifyInnerAdEvent(i, aVar2 != null ? aVar2.b() : null);
        }
    }

    public final void c(int i) {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            basePlayerView.setVisibility(i);
        }
    }

    public final void d() {
        BasePlayerView basePlayerView;
        if (this.f10842s && (basePlayerView = this.f10832h) != null && basePlayerView.hasVideo()) {
            if (!this.f10832h.isPlaying()) {
                w();
            }
            this.f10832h.start();
            if (this.f10830f) {
                return;
            }
            y();
        }
    }

    public final void e() {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            if (basePlayerView.isPlaying()) {
                x();
            }
            this.f10832h.pause();
        }
    }

    public final boolean f() {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            return basePlayerView.isMute();
        }
        return false;
    }

    public final boolean g() {
        BasePlayerView basePlayerView = this.f10832h;
        return basePlayerView != null && (basePlayerView instanceof WebLandpagePlayerView);
    }

    public final long h() {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            return basePlayerView.getVideoLength();
        }
        return 0L;
    }

    public final long i() {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            return basePlayerView.getCurrentPosition();
        }
        return 0L;
    }

    public final boolean j() {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            return basePlayerView.isPlaying();
        }
        return false;
    }

    public final boolean k() {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            return basePlayerView.isPlayCompletion();
        }
        return false;
    }

    public final BasePlayerView l() {
        return this.f10832h;
    }

    public final View m() {
        return this.f10840q;
    }

    public final void n() {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            this.f10833j = null;
            this.f10831g = null;
            basePlayerView.setListener(this.f10836m);
            this.f10832h.rePlayVideo();
        }
    }

    public final void o() {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            basePlayerView.setNeedInterruptRelease(true);
        }
    }

    public final void p() {
        com.anythink.basead.a.a aVar = this.f10838o;
        if (aVar != null) {
            aVar.b();
            this.f10838o = null;
        }
    }

    public a(View view, x xVar, w wVar, int i) {
        boolean z8;
        View findViewById;
        this.f10825a = "a";
        this.f10842s = true;
        Context context = view.getContext();
        this.f10826b = context;
        this.f10827c = xVar;
        this.f10828d = wVar;
        this.f10829e = i;
        this.f10832h = (BasePlayerView) view.findViewById(q.a(context, "myoffer_player_view_id", "id"));
        w wVar2 = this.f10828d;
        x xVar2 = this.f10827c;
        if (xVar2 != null && wVar2 != null) {
            String valueOf = String.valueOf(xVar2.f14320j);
            valueOf.getClass();
            if (valueOf.equals("1")) {
                if (!TextUtils.isEmpty(wVar2.E())) {
                    z8 = true;
                }
            } else if (valueOf.equals("3")) {
                z8 = e.a(wVar2, xVar2);
            }
            this.f10839p = z8;
            findViewById = view.findViewById(q.a(this.f10826b, "myoffer_player_view_container_id", "id"));
            this.f10840q = findViewById;
            if (findViewById != null && (findViewById instanceof RoundCornerRelativeLayout)) {
                ((RoundCornerRelativeLayout) findViewById).setRadius(0);
            }
            this.f10842s = true;
        }
        z8 = false;
        this.f10839p = z8;
        findViewById = view.findViewById(q.a(this.f10826b, "myoffer_player_view_container_id", "id"));
        this.f10840q = findViewById;
        if (findViewById != null) {
            ((RoundCornerRelativeLayout) findViewById).setRadius(0);
        }
        this.f10842s = true;
    }

    private void g(int i) {
        InterfaceC0055a interfaceC0055a = this.f10833j;
        if (interfaceC0055a != null) {
            j a9 = interfaceC0055a.a();
            if (i == 25) {
                com.anythink.basead.b.b.a(2, this.f10828d, a9);
            } else if (i == 50) {
                com.anythink.basead.b.b.a(3, this.f10828d, a9);
            } else {
                if (i != 75) {
                    return;
                }
                com.anythink.basead.b.b.a(4, this.f10828d, a9);
            }
        }
    }

    public final void a(BasePlayerView.a aVar) {
        this.i = aVar;
    }

    public final void c() {
        b(124);
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView == null || !basePlayerView.isPlaying()) {
            return;
        }
        this.f10832h.stop();
        this.f10832h.removeAllViews();
        InterfaceC0055a interfaceC0055a = this.f10833j;
        if (interfaceC0055a != null) {
            j a9 = interfaceC0055a.a();
            a9.i = this.f10833j.b();
            com.anythink.basead.b.b.a(16, this.f10828d, a9);
        }
    }

    public final void f(int i) {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            basePlayerView.release(i);
        }
    }

    public final void a(InterfaceC0055a interfaceC0055a) {
        this.f10833j = interfaceC0055a;
    }

    public final void a(com.anythink.basead.ui.improveclick.a aVar) {
        this.f10831g = aVar;
    }

    public final void e(int i) {
        BasePlayerView emptyAnimPlayer;
        if (this.f10832h != null) {
            Context context = this.f10826b;
            if (i == 1) {
                emptyAnimPlayer = new EmptyAnimPlayer(context);
            } else if (i == 2) {
                emptyAnimPlayer = new GuideToClickAnimPlayerView(context);
            } else if (i == 3) {
                emptyAnimPlayer = new RedPacketAnimPlayerView(context);
            } else if (i == 4) {
                emptyAnimPlayer = new ViewPagerAnimPlayerView(context);
            } else if (i == 5) {
                emptyAnimPlayer = new AlbumScaleAnimPlayerView(context);
            } else if (i != 101) {
                emptyAnimPlayer = new EmptyAnimPlayer(context);
            } else {
                emptyAnimPlayer = new WebLandpagePlayerView(context);
            }
            emptyAnimPlayer.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f10832h.getParent();
            viewGroup.addView(emptyAnimPlayer, viewGroup.indexOfChild(this.f10832h), this.f10832h.getLayoutParams());
            viewGroup.removeView(this.f10832h);
            this.f10832h = emptyAnimPlayer;
        }
    }

    public final void a(WTWebContainerView wTWebContainerView) {
        this.f10841r = wTWebContainerView;
    }

    public final BasePlayerView a(boolean z8, List<Bitmap> list, com.anythink.basead.j.e eVar) {
        this.f10830f = z8;
        if (this.f10832h != null) {
            BasePlayerView.a aVar = new BasePlayerView.a() { // from class: com.anythink.basead.ui.component.a.1
                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void a() {
                    a.this.b(101);
                    a aVar2 = a.this;
                    com.anythink.basead.ui.improveclick.a aVar3 = aVar2.f10831g;
                    if (aVar3 != null) {
                        aVar3.a(aVar2.f10832h.getVideoLength());
                    }
                    a.this.f10834k = System.currentTimeMillis();
                    a.a(a.this);
                    BasePlayerView.a aVar4 = a.this.i;
                    if (aVar4 != null) {
                        aVar4.a();
                        a.this.i.a(0L);
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void b() {
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void c() {
                    a.this.b(107);
                    a.b(a.this);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.c();
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void d() {
                    a.a(a.this, true);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.d();
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void e() {
                    a.a(a.this, false);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.e();
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void f() {
                    c.a().c(a.this.f10828d.E());
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.f();
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void b(int i) {
                    a.d(a.this);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.b(i);
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void b(long j9) {
                    if (a.this.f10831g != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("video_length", Long.valueOf(j9));
                        a.this.f10831g.a(hashMap);
                    }
                    a.this.b(123);
                    a.e(a.this);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.b(j9);
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void a(long j9) {
                    if (a.this.f10831g != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(g.a.f11332k, Long.valueOf(j9));
                        a.this.f10831g.a(hashMap);
                    }
                    a.this.b(125);
                    a.a(a.this, j9);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.a(j9);
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void a(f fVar) {
                    fVar.c();
                    if (a.this.f10831g != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(g.a.i, fVar.c());
                        a.this.f10831g.a(hashMap);
                    }
                    a.this.b(108);
                    a.c(a.this);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.a(fVar);
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void a(int i) {
                    a.a(a.this, i);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.a(i);
                    }
                }
            };
            this.f10836m = aVar;
            this.f10832h.setListener(aVar);
            this.f10832h.init(this.f10828d, this.f10827c, this.f10830f, list, eVar);
        }
        return this.f10832h;
    }

    public final void b() {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView == null || basePlayerView.getParent() == null) {
            return;
        }
        ((ViewGroup) this.f10832h.getParent()).removeView(this.f10832h);
        this.f10832h = null;
    }

    public final void d(final int i) {
        boolean j9 = j();
        e();
        if (j9) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.ui.component.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    long j10;
                    long j11;
                    n a9;
                    long i4 = a.this.i();
                    long h9 = a.this.h();
                    if (a.this.f10828d == null || (a9 = o.a().a(a.this.f10828d.E())) == null) {
                        j10 = 0;
                        j11 = 0;
                    } else {
                        long e6 = a9.e();
                        j11 = a9.d();
                        j10 = e6;
                    }
                    a aVar = a.this;
                    com.anythink.core.common.u.e.a(aVar.f10827c, aVar.f10828d, i, i4, j10, h9, j11);
                }
            }, 8);
        }
    }

    public final void b(boolean z8) {
        this.f10842s = z8;
        e();
    }

    public final void c(boolean z8) {
        if (!z8) {
            y();
        }
        this.f10830f = z8;
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null) {
            basePlayerView.setMute(z8);
        }
    }

    public static /* synthetic */ void b(a aVar) {
        InterfaceC0055a interfaceC0055a = aVar.f10833j;
        if (interfaceC0055a != null) {
            j a9 = interfaceC0055a.a();
            com.anythink.basead.b.b.a(5, aVar.f10828d, a9);
            com.anythink.basead.b.b.a(31, aVar.f10828d, a9);
        }
    }

    public final k d(boolean z8) {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView != null && !basePlayerView.hasVideo()) {
            return null;
        }
        k kVar = new k();
        kVar.f6396l = this.f10829e == 2 ? 4 : 1;
        kVar.f6398r = 1;
        BasePlayerView basePlayerView2 = this.f10832h;
        kVar.f6388a = basePlayerView2 != null ? basePlayerView2.getVideoLength() / 1000 : 0L;
        kVar.f6389b = this.f10835l / 1000;
        BasePlayerView basePlayerView3 = this.f10832h;
        kVar.f6390c = basePlayerView3 != null ? basePlayerView3.getCurrentPosition() / 1000 : 0L;
        long j9 = this.f10835l;
        kVar.f6391d = j9 == 0 ? 1 : 0;
        kVar.f6397o = j9 == 0 ? 1 : 2;
        BasePlayerView basePlayerView4 = this.f10832h;
        kVar.f6392e = (basePlayerView4 == null || basePlayerView4.getCurrentPosition() != this.f10832h.getVideoLength()) ? 0 : 1;
        kVar.f6399u = z8 ? 0 : 2;
        kVar.f6393f = this.f10834k;
        kVar.f6394g = System.currentTimeMillis();
        BasePlayerView basePlayerView5 = this.f10832h;
        kVar.f6395h = basePlayerView5 != null ? basePlayerView5.getCurrentPosition() : 0L;
        kVar.toString();
        return kVar;
    }

    public final boolean a() {
        BasePlayerView basePlayerView = this.f10832h;
        return (basePlayerView == null || basePlayerView.getParent() == null || !(this.f10832h.getParent() instanceof ViewGroup)) ? false : true;
    }

    public final void a(boolean z8) {
        if (z8) {
            this.f10842s = z8;
        }
        d();
    }

    public static /* synthetic */ void c(a aVar) {
        InterfaceC0055a interfaceC0055a = aVar.f10833j;
        if (interfaceC0055a != null) {
            j a9 = interfaceC0055a.a();
            a9.f6371j = aVar.d(false);
            com.anythink.basead.b.b.a(17, aVar.f10828d, a9);
        }
    }

    public final void a(int i, int i4, Intent intent) {
        if (g()) {
            ((WebLandpagePlayerView) this.f10832h).onActivityResult(i, i4, intent);
        }
    }

    public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        BasePlayerView basePlayerView = this.f10832h;
        if (basePlayerView == null || !(basePlayerView instanceof WebLandpagePlayerView)) {
            return false;
        }
        return ((WebLandpagePlayerView) basePlayerView).openInternalWebView(str, iOfferClickHandler);
    }

    private void a(long j9) {
        bl aH;
        Map<Integer, String[]> z8;
        w wVar = this.f10828d;
        if (!(wVar instanceof bj) || (aH = ((bj) wVar).aH()) == null || (z8 = aH.z()) == null || z8.size() <= 0) {
            return;
        }
        if (this.f10837n == null) {
            this.f10837n = new ConcurrentHashMap<>();
        }
        long j10 = j9 / 1000;
        for (Integer num : z8.keySet()) {
            if (this.f10837n.get(num) == null || !this.f10837n.get(num).booleanValue()) {
                if (j10 >= num.intValue() && this.f10833j != null) {
                    this.f10837n.put(num, Boolean.TRUE);
                    j a9 = this.f10833j.a();
                    a9.f6371j.i = num.intValue();
                    com.anythink.basead.b.b.a(32, this.f10828d, a9);
                }
            }
        }
    }

    private void e(boolean z8) {
        InterfaceC0055a interfaceC0055a = this.f10833j;
        if (interfaceC0055a != null) {
            if (z8) {
                j a9 = interfaceC0055a.a();
                a9.i = this.f10833j.b();
                com.anythink.basead.b.b.a(12, this.f10828d, a9);
            } else {
                j a10 = interfaceC0055a.a();
                a10.i = this.f10833j.b();
                com.anythink.basead.b.b.a(13, this.f10828d, a10);
            }
        }
    }

    public static /* synthetic */ void d(a aVar) {
        InterfaceC0055a interfaceC0055a = aVar.f10833j;
        if (interfaceC0055a != null) {
            j a9 = interfaceC0055a.a();
            a9.i = aVar.f10833j.b();
            com.anythink.basead.b.b.a(14, aVar.f10828d, a9);
        }
    }

    public static /* synthetic */ void e(a aVar) {
        InterfaceC0055a interfaceC0055a = aVar.f10833j;
        if (interfaceC0055a != null) {
            com.anythink.basead.b.b.a(35, aVar.f10828d, interfaceC0055a.a());
        }
    }

    public static /* synthetic */ void a(a aVar) {
        InterfaceC0055a interfaceC0055a = aVar.f10833j;
        if (interfaceC0055a != null) {
            com.anythink.basead.b.b.a(1, aVar.f10828d, interfaceC0055a.a());
        }
    }

    public static /* synthetic */ void a(a aVar, long j9) {
        bl aH;
        Map<Integer, String[]> z8;
        w wVar = aVar.f10828d;
        if (!(wVar instanceof bj) || (aH = ((bj) wVar).aH()) == null || (z8 = aH.z()) == null || z8.size() <= 0) {
            return;
        }
        if (aVar.f10837n == null) {
            aVar.f10837n = new ConcurrentHashMap<>();
        }
        long j10 = j9 / 1000;
        for (Integer num : z8.keySet()) {
            if (aVar.f10837n.get(num) == null || !aVar.f10837n.get(num).booleanValue()) {
                if (j10 >= num.intValue() && aVar.f10833j != null) {
                    aVar.f10837n.put(num, Boolean.TRUE);
                    j a9 = aVar.f10833j.a();
                    a9.f6371j.i = num.intValue();
                    com.anythink.basead.b.b.a(32, aVar.f10828d, a9);
                }
            }
        }
    }

    public static /* synthetic */ void a(a aVar, int i) {
        InterfaceC0055a interfaceC0055a = aVar.f10833j;
        if (interfaceC0055a != null) {
            j a9 = interfaceC0055a.a();
            if (i == 25) {
                com.anythink.basead.b.b.a(2, aVar.f10828d, a9);
            } else if (i == 50) {
                com.anythink.basead.b.b.a(3, aVar.f10828d, a9);
            } else {
                if (i != 75) {
                    return;
                }
                com.anythink.basead.b.b.a(4, aVar.f10828d, a9);
            }
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z8) {
        InterfaceC0055a interfaceC0055a = aVar.f10833j;
        if (interfaceC0055a != null) {
            if (z8) {
                j a9 = interfaceC0055a.a();
                a9.i = aVar.f10833j.b();
                com.anythink.basead.b.b.a(12, aVar.f10828d, a9);
            } else {
                j a10 = interfaceC0055a.a();
                a10.i = aVar.f10833j.b();
                com.anythink.basead.b.b.a(13, aVar.f10828d, a10);
            }
        }
    }
}
