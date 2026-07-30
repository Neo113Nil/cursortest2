package com.baidu.platform.comapi.b.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.bikenavi.adapter.IBNaviStatusListener;
import com.baidu.mapapi.bikenavi.model.BikeNaviDisplayOption;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.walknavi.model.RouteGuideKind;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.walknavi.widget.b;
import com.google.android.exoplayer2.C;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.comapi.h.s.b {

    /* renamed from: a, reason: collision with root package name */
    private View f8745a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f8746b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.bikenavi.widget.a f8747c;

    /* renamed from: d, reason: collision with root package name */
    private com.baidu.platform.comapi.bikenavi.widget.b f8748d;

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.widget.b f8749e;

    /* renamed from: f, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.widget.b f8750f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8752h;

    /* renamed from: j, reason: collision with root package name */
    private long f8754j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8755k;

    /* renamed from: l, reason: collision with root package name */
    private double f8756l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f8757m;

    /* renamed from: n, reason: collision with root package name */
    private BitmapDescriptor f8758n;

    /* renamed from: o, reason: collision with root package name */
    private final com.baidu.platform.comapi.b.c.c f8759o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8760p;

    /* renamed from: q, reason: collision with root package name */
    LatLng f8761q;

    /* renamed from: g, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.k.f.a f8751g = null;

    /* renamed from: i, reason: collision with root package name */
    private IBNaviStatusListener f8753i = null;

    /* renamed from: r, reason: collision with root package name */
    private Handler f8762r = new Handler();

    /* renamed from: s, reason: collision with root package name */
    private Runnable f8763s = new a();

    /* renamed from: t, reason: collision with root package name */
    final Runnable f8764t = new RunnableC0099b();

    /* renamed from: u, reason: collision with root package name */
    final Runnable f8765u = new c();

    /* renamed from: v, reason: collision with root package name */
    private int f8766v = -1;

    /* renamed from: w, reason: collision with root package name */
    private j f8767w = null;

    /* renamed from: x, reason: collision with root package name */
    private com.baidu.platform.comapi.wnplatform.walkmap.b f8768x = new i();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.baidu.platform.comapi.walknavi.b.n().s().r()) {
                com.baidu.platform.comapi.walknavi.b.n().l().run("[回车位]按钮点击");
            }
        }
    }

    /* renamed from: com.baidu.platform.comapi.b.c.b$b, reason: collision with other inner class name */
    class RunnableC0099b implements Runnable {
        RunnableC0099b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            bVar.a(true, bVar.f8759o.D());
        }
    }

    class d implements b.c {
        d() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            if (b.this.f8767w != null) {
                b.this.f8767w.cancel();
            }
        }
    }

    class e implements b.c {
        e() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            if (b.this.f8767w == null) {
                b.this.e();
            } else {
                b.this.f8767w.onFinish();
                b.this.f8767w.cancel();
            }
        }
    }

    class f implements b.c {
        f() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            b.this.z();
        }
    }

    class g implements b.c {
        g() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            try {
                b.this.f8746b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
                com.baidu.platform.comapi.walknavi.k.g.a.a(b.this.f8746b, com.baidu.platform.comapi.h.t.p.a.b(b.this.f8746b, b.this.f8759o.v()));
            }
        }
    }

    class h implements DialogInterface.OnCancelListener {
        h() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            b.this.z();
        }
    }

    class i implements com.baidu.platform.comapi.wnplatform.walkmap.b {
        i() {
        }
    }

    public class j extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        Activity f8778a;

        /* renamed from: b, reason: collision with root package name */
        com.baidu.platform.comapi.walknavi.widget.b f8779b;

        public j(long j8, long j9, Activity activity, com.baidu.platform.comapi.walknavi.widget.b bVar) {
            super(j8, j9);
            this.f8778a = activity;
            this.f8779b = bVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            b.this.e();
            Activity activity = this.f8778a;
            if (activity == null || activity.isFinishing()) {
                return;
            }
            this.f8779b.dismiss();
        }

        @Override // android.os.CountDownTimer
        @SuppressLint({"SetTextI18n"})
        public void onTick(long j8) {
            com.baidu.platform.comapi.walknavi.widget.b bVar = this.f8779b;
            if (bVar != null) {
                ((Button) bVar.a()).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8778a, b.this.f8759o.O()) + "(" + ((j8 / 1000) - 1) + ")");
            }
        }
    }

    public b(Activity activity) {
        this.f8746b = activity;
        com.baidu.platform.comapi.h.j.a j8 = com.baidu.platform.comapi.walknavi.b.n().j();
        com.baidu.platform.comapi.b.c.c cVar = new com.baidu.platform.comapi.b.c.c(activity.getApplicationContext(), j8 == null ? MapLanguage.CHINESE : j8.e());
        this.f8759o = cVar;
        Bitmap decodeResource = BitmapFactory.decodeResource(com.baidu.platform.comapi.h.t.p.a.e(), cVar.N());
        this.f8757m = decodeResource;
        this.f8758n = BitmapDescriptorFactory.fromBitmap(decodeResource);
        this.f8745a = com.baidu.platform.comapi.h.t.p.a.a(activity, R.layout.wsdk_layout_bikenavi_ui_layout, null);
        F();
        K();
        E();
        this.f8755k = true;
    }

    private void B() {
        com.baidu.platform.comapi.walknavi.b.n().B().a(this);
        com.baidu.platform.comapi.walknavi.b.n().z().a((com.baidu.platform.comapi.h.m.a) this);
        com.baidu.platform.comapi.walknavi.b.n().z().a((com.baidu.platform.comapi.h.m.c) this);
        com.baidu.platform.comapi.walknavi.b.n().q().a(this);
    }

    private void C() {
        Bitmap bitmap = this.f8757m;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f8757m.recycle();
            this.f8757m = null;
        }
        BitmapDescriptor bitmapDescriptor = this.f8758n;
        if (bitmapDescriptor != null) {
            bitmapDescriptor.recycle();
            this.f8758n = null;
        }
    }

    private void F() {
        if (com.baidu.platform.comapi.walknavi.b.n().t().i()) {
            com.baidu.platform.comapi.walknavi.b.n().t().e().getMap().addOverlay(new MarkerOptions().position(w()).icon(this.f8758n).zIndex(9).draggable(false));
        }
        this.f8747c = new com.baidu.platform.comapi.bikenavi.widget.a(this.f8746b, this, this.f8745a, this.f8759o);
        this.f8748d = new com.baidu.platform.comapi.bikenavi.widget.b(this.f8746b, this, this.f8745a, this.f8759o);
        a(this.f8746b, com.baidu.platform.comapi.walknavi.b.n().t().e(), 70, 0, 0, j() + 60);
    }

    private void H() {
        try {
            if (this.f8750f == null) {
                com.baidu.platform.comapi.walknavi.widget.b b8 = new com.baidu.platform.comapi.walknavi.widget.b(this.f8746b).d(com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.S())).a(com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.y())).b(com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.M())).c().a(new g()).c(com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.i())).b(new f());
                this.f8750f = b8;
                b8.setOnCancelListener(new h());
            }
            Activity activity = this.f8746b;
            if (activity == null || activity.isFinishing()) {
                return;
            }
            this.f8750f.show();
        } catch (Exception unused) {
        }
    }

    private void I() {
        this.f8754j = System.currentTimeMillis();
    }

    private void J() {
        com.baidu.platform.comapi.walknavi.b.n().B().b(this);
        com.baidu.platform.comapi.walknavi.b.n().z().b((com.baidu.platform.comapi.h.m.a) this);
        com.baidu.platform.comapi.walknavi.b.n().z().b((com.baidu.platform.comapi.h.m.c) this);
        com.baidu.platform.comapi.walknavi.b.n().q().b(this);
    }

    private void K() {
        int j8 = com.baidu.platform.comapi.walknavi.b.n().s().j();
        com.baidu.platform.comapi.h.g.a.c("yang10", "all size:" + j8);
        if (j8 > 2) {
            int i8 = j8 - 2;
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            com.baidu.platform.comapi.walknavi.b.n().s().b(iArr, iArr2, iArr3);
            com.baidu.platform.comapi.h.l.b.c().a(this.f8746b, iArr, iArr2, iArr3);
        }
    }

    private void t() {
        if (this.f8752h) {
            return;
        }
        BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
        if (e8 == null || e8.getShowDialogEnable()) {
            if (com.baidu.platform.comapi.walknavi.b.n().q().d()) {
                u();
            } else {
                H();
            }
        }
    }

    private void u() {
        Activity activity;
        if (this.f8750f == null || (activity = this.f8746b) == null || activity.isFinishing()) {
            return;
        }
        if (this.f8750f.isShowing()) {
            this.f8750f.dismiss();
        }
        this.f8750f = null;
    }

    private void v() {
        int i8 = (int) (this.f8756l * 100.0d);
        int i9 = 3;
        if (i8 >= 0 && i8 < 30) {
            com.baidu.platform.comapi.h.q.a.a().a(MapBundleKey.OfflineMapKey.OFFLINE_RATION, 0);
        } else if (i8 >= 30 && i8 < 50) {
            com.baidu.platform.comapi.h.q.a.a().a(MapBundleKey.OfflineMapKey.OFFLINE_RATION, 1);
        } else if (i8 >= 50 && i8 < 80) {
            com.baidu.platform.comapi.h.q.a.a().a(MapBundleKey.OfflineMapKey.OFFLINE_RATION, 2);
        } else if (i8 >= 80 && i8 <= 100) {
            com.baidu.platform.comapi.h.q.a.a().a(MapBundleKey.OfflineMapKey.OFFLINE_RATION, 3);
        }
        com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.realDisAndTotalDisRatio");
        int i10 = this.f8766v;
        if (i10 >= 0 && i10 <= 1000) {
            i9 = 0;
        } else if (i10 > 1000 && i10 <= 3000) {
            i9 = 1;
        } else if (i10 > 3000 && i10 <= 5000) {
            i9 = 2;
        } else if (i10 <= 5000 || i10 > 10000) {
            i9 = (i10 <= 10000 || i10 > 20000) ? (i10 <= 20000 || i10 > 30000) ? (i10 <= 30000 || i10 > 50000) ? i10 > 50000 ? 7 : -1 : 6 : 5 : 4;
        }
        com.baidu.platform.comapi.h.q.a.a().a("distance", i9);
        com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.navDistance");
    }

    private LatLng w() {
        if (this.f8761q == null) {
            this.f8761q = com.baidu.platform.comapi.walknavi.b.n().D();
        }
        return this.f8761q;
    }

    private void y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        com.baidu.platform.comapi.walknavi.i.c.a();
        Activity activity = this.f8746b;
        if (activity != null) {
            com.baidu.platform.comapi.walknavi.k.g.a.a(activity, com.baidu.platform.comapi.h.t.p.a.b(activity, this.f8759o.U()));
        }
    }

    public void A() {
        com.baidu.platform.comapi.h.g.a.c("yang13", "call quitNavWhenConfirm:" + this.f8751g);
        com.baidu.platform.comapi.walknavi.k.f.a aVar = this.f8751g;
        if (aVar != null) {
            aVar.b();
            this.f8751g = null;
        }
    }

    public void D() {
        Runnable runnable;
        Handler handler = this.f8762r;
        if (handler == null || (runnable = this.f8764t) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public void E() {
        if (com.baidu.platform.comapi.h.c.b().h()) {
            com.baidu.platform.comapi.walknavi.b.n().t().e().showScaleControl(true);
            com.baidu.platform.comapi.walknavi.b.n().t().e().showZoomControls(false);
            com.baidu.platform.comapi.walknavi.b.n().t().e().getMap().getUiSettings().setAllGesturesEnabled(true);
            a(this.f8746b, com.baidu.platform.comapi.walknavi.b.n().t().e(), 60, 0, 0, 75);
        }
    }

    public void G() {
        com.baidu.platform.comapi.h.q.a.a().a("FootNaviAutoComplete");
        com.baidu.platform.comapi.bikenavi.widget.a aVar = this.f8747c;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.baidu.platform.comapi.h.n.f
    public void a() {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void b(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void d(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.f.a
    public void e(Message message) {
        Activity activity = this.f8746b;
        if (activity == null || activity.isFinishing() || message.arg1 != 0) {
            return;
        }
        com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE);
        com.baidu.platform.comapi.bikenavi.widget.b bVar = this.f8748d;
        if (bVar != null) {
            bVar.a(R.drawable.bn_gps_blue, com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.A()));
            this.f8748d.g();
        }
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int f() {
        return com.baidu.platform.comapi.h.t.q.b.b().d() - ((int) (com.baidu.platform.comapi.h.t.q.b.b().a() * 30.0f));
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int g() {
        return (int) (com.baidu.platform.comapi.h.t.q.b.b().a() * 45.0f);
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public View h() {
        return this.f8745a;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public float i() {
        return 0.0f;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int j() {
        BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
        if (e8 == null || e8.getCustomBottomView() == null) {
            return 0;
        }
        return e8.getBottomViewHeight();
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int k() {
        return 0;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public Handler l() {
        return null;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int m() {
        return 0;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void n() {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void o() {
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void onFinalEnd(Message message) {
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void onIndoorEnd(Message message) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void onNaviLocationUpdate() {
    }

    @Override // com.baidu.platform.comapi.h.n.f
    public void onRoutePlanStart() {
        com.baidu.platform.comapi.walknavi.b.n().s().z();
    }

    @Override // com.baidu.platform.comapi.h.n.f
    public void onRoutePlanSuccess() {
        com.baidu.platform.comapi.walknavi.b.n().t().d(1);
        y();
        com.baidu.platform.comapi.walknavi.b.n().s().b();
        com.baidu.platform.comapi.walknavi.b.n().s().y();
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void p() {
        this.f8752h = true;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void q() {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void r() {
        this.f8752h = false;
        t();
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        B();
        I();
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        J();
        Handler handler = this.f8762r;
        if (handler != null) {
            handler.removeCallbacks(this.f8764t);
            this.f8762r = null;
        }
        C();
    }

    public void s() {
        Runnable runnable;
        Handler handler = this.f8762r;
        if (handler == null || (runnable = this.f8765u) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f8762r.postDelayed(this.f8765u, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public com.baidu.platform.comapi.walknavi.k.f.a x() {
        return this.f8751g;
    }

    @Override // com.baidu.platform.comapi.h.n.f
    public void a(int i8) {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void c(int i8) {
        Runnable runnable;
        Handler handler = this.f8762r;
        if (handler == null || (runnable = this.f8763s) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f8762r.postDelayed(this.f8763s, i8);
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void d(Message message) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void a(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void b() {
        Runnable runnable;
        com.baidu.platform.comapi.bikenavi.widget.a aVar = this.f8747c;
        if (aVar != null) {
            aVar.d();
        }
        Handler handler = this.f8762r;
        if (handler == null || (runnable = this.f8764t) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f8762r.postDelayed(this.f8764t, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public boolean d() {
        return this.f8745a == null || this.f8746b == null;
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void f(Bundle bundle) {
        int i8 = bundle.getInt("simpleUpdateType");
        if (i8 == 0 || i8 == 3 || !bundle.containsKey("maneuverKind") || !bundle.containsKey("nDistance2GP")) {
            return;
        }
        int i9 = bundle.getInt("maneuverKind");
        int a8 = com.baidu.platform.comapi.b.c.a.a(com.baidu.platform.comapi.h.m.d.a(RouteGuideKind.values()[i9]));
        int i10 = bundle.getInt("nDistance2GP");
        int i11 = ((i10 + 5) / 10) * 10;
        String string = bundle.getString("usGuideText");
        if (string == null) {
            string = "";
        }
        String trim = string.trim();
        if ("到达目的地".equals(trim) || "Arrived at destination".equals(trim)) {
            s();
        }
        StringBuilder sb = new StringBuilder();
        if (i9 != 0) {
            com.baidu.platform.comapi.h.g.a.b("update guidance type:" + i9 + "dis:" + i10);
            StringBuffer stringBuffer = new StringBuffer();
            com.baidu.platform.comapi.h.t.g.a(i11, this.f8759o.x(), stringBuffer);
            sb.append(stringBuffer);
            int i12 = bundle.getInt("enSpliceType");
            if (i12 == 1) {
                sb.append(com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.w()));
            } else if (i12 == 3) {
                sb.append(com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.b()));
            }
            this.f8748d.a(a8, sb.toString());
            this.f8748d.e();
        }
    }

    public void a(IBNaviStatusListener iBNaviStatusListener) {
        this.f8753i = iBNaviStatusListener;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void c() {
        Runnable runnable;
        Handler handler = this.f8762r;
        if (handler == null || (runnable = this.f8763s) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(com.baidu.platform.comapi.walknavi.k.f.a aVar) {
        this.f8751g = aVar;
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void c(Bundle bundle) {
        try {
            double doubleValue = new BigDecimal((bundle.getFloat("curSpeed") * 3600.0f) / 1000.0f).setScale(1, 4).doubleValue();
            double doubleValue2 = new BigDecimal((bundle.getFloat("maxSpeed") * 3600.0f) / 1000.0f).setScale(1, 4).doubleValue();
            double doubleValue3 = new BigDecimal((bundle.getFloat("avgSpeed") * 3600.0f) / 1000.0f).setScale(1, 4).doubleValue();
            this.f8766v = bundle.getInt("AddDist");
            double doubleValue4 = new BigDecimal(bundle.getInt("AddDist") / 1000.0f).setScale(1, 4).doubleValue();
            double doubleValue5 = new BigDecimal(bundle.getInt("RouteDist") / 1000.0f).setScale(1, 4).doubleValue();
            this.f8747c.a(new BigDecimal(bundle.getFloat("realDistance")).setScale(1, 4).doubleValue(), bundle.getLong("secTime"));
            float f8 = bundle.getFloat("calorie");
            com.baidu.platform.comapi.h.g.a.b("bike cal:" + f8 + "or:" + bundle.getFloat("calorie"));
            double doubleValue6 = new BigDecimal((double) f8).setScale(1, 4).doubleValue();
            float f9 = bundle.getFloat("altidiff");
            float f10 = bundle.getFloat("altitude");
            this.f8756l = doubleValue4 / doubleValue5;
            this.f8747c.a(doubleValue, doubleValue3, doubleValue2);
            this.f8747c.a((float) doubleValue6, f9, f10);
        } catch (Exception unused) {
        }
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void d(int i8) {
        com.baidu.platform.comapi.bikenavi.widget.a aVar = this.f8747c;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(String str) {
    }

    @Override // com.baidu.platform.comapi.h.f.a
    public void b(int i8) {
        t();
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void e(Bundle bundle) {
        if (bundle.getInt("updatetype") == com.baidu.platform.comapi.h.m.e.f9156b) {
            int i8 = bundle.getInt("totaldist");
            int i9 = bundle.getInt("totaltime");
            StringBuffer stringBuffer = new StringBuffer();
            MapLanguage x7 = this.f8759o.x();
            com.baidu.platform.comapi.h.t.g.a(i8, x7, stringBuffer);
            this.f8747c.a(stringBuffer.toString(), com.baidu.platform.comapi.h.t.g.a(i9, x7));
        }
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void a(byte[] bArr) {
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void b(Message message) {
        com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.farAway");
        com.baidu.platform.comapi.h.g.a.c("yang13", "call onRouteFarAway");
        com.baidu.platform.comapi.walknavi.i.c.a();
        com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE);
        com.baidu.platform.comapi.bikenavi.widget.b bVar = this.f8748d;
        if (bVar != null) {
            bVar.a(R.drawable.bn_faraway_route_blue, com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.c()));
        }
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(boolean z7) {
        com.baidu.platform.comapi.bikenavi.widget.a aVar = this.f8747c;
        if (aVar != null) {
            aVar.c(z7);
        }
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void a(Message message) {
        com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.reRoute");
        com.baidu.platform.comapi.h.g.a.c("yang13", "call onReRouteComplete");
        if (this.f8752h) {
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().l().run("收到偏航算路成功消息");
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(Context context, View view, int i8, int i9, int i10, int i11) {
        super.a(context, view, i8, i9, i10, i11);
    }

    public void a(boolean z7, int i8) {
        String b8;
        Activity activity;
        try {
            Activity activity2 = this.f8746b;
            if (activity2 != null && !activity2.isFinishing()) {
                BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
                if (e8 != null && !e8.getShowExitDialogEnable()) {
                    e();
                    return;
                }
                com.baidu.platform.comapi.walknavi.widget.b d8 = new com.baidu.platform.comapi.walknavi.widget.b(this.f8746b).a(true).d(com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.S()));
                if (com.baidu.platform.comapi.walknavi.k.e.b.f10196a == 2) {
                    b8 = com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, i8);
                } else {
                    b8 = com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, i8);
                }
                this.f8749e = d8.a(b8).c(com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.O())).d().b(new e()).b(com.baidu.platform.comapi.h.t.p.a.b(this.f8746b, this.f8759o.i())).a(new d());
                if (z7) {
                    j jVar = new j(7000L, 1000L, this.f8746b, this.f8749e);
                    this.f8767w = jVar;
                    jVar.start();
                }
                if (this.f8749e.isShowing() || (activity = this.f8746b) == null || activity.isFinishing()) {
                    return;
                }
                this.f8749e.show();
                return;
            }
            com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.exitNavi");
            A();
        } catch (Exception unused) {
        }
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void e() {
        BikeNaviDisplayOption e8;
        this.f8760p = true;
        com.baidu.platform.comapi.walknavi.i.c.a();
        v();
        View view = this.f8745a;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f8745a = null;
        }
        Activity activity = this.f8746b;
        if (activity != null && !activity.isFinishing() && ((e8 = com.baidu.platform.comapi.walknavi.b.n().e()) == null || !e8.isIsRunInFragment())) {
            this.f8746b.finish();
        }
        com.baidu.platform.comapi.walknavi.b.n().a0();
        this.f8746b = null;
        A();
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void c(Message message) {
        G();
        if (com.baidu.platform.comapi.walknavi.b.n().e() == null || com.baidu.platform.comapi.walknavi.b.n().e().getShowDialogWithExitNavi()) {
            s();
        }
    }
}
