package com.baidu.platform.comapi.walknavi.k;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.ar.NavigationType;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.baidumapsdk_api.R;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.walknavi.adapter.IWNaviStatusListener;
import com.baidu.mapapi.walknavi.model.RouteGuideKind;
import com.baidu.mapapi.walknavi.model.WalkNaviDisplayOption;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.walknavi.segmentbrowse.widget.g;
import com.baidu.platform.comapi.walknavi.widget.GuideContainerLinearLayout;
import com.baidu.platform.comapi.walknavi.widget.a;
import com.baidu.platform.comapi.walknavi.widget.b;
import com.baidu.platform.comapi.walknavi.widget.d.b;
import com.google.android.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.comapi.h.s.b {
    private ImageView A;
    private com.baidu.platform.comapi.walknavi.widget.a B;
    private final com.baidu.platform.comapi.walknavi.k.c D;
    private Bitmap E;
    private BitmapDescriptor F;
    private long G;
    private long H;
    private boolean M;
    private com.baidu.platform.comapi.walknavi.segmentbrowse.widget.a N;
    public int R;
    LatLng T;
    private com.baidu.platform.comapi.walknavi.widget.d.c W;
    private View Y;
    private AnimationDrawable Z;

    /* renamed from: a, reason: collision with root package name */
    private Activity f10117a;

    /* renamed from: a0, reason: collision with root package name */
    public com.baidu.platform.comapi.walknavi.widget.d.b f10118a0;

    /* renamed from: b, reason: collision with root package name */
    private View f10119b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.k.f.c f10121c;

    /* renamed from: c0, reason: collision with root package name */
    private TextView f10122c0;

    /* renamed from: d, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.widget.b f10123d;

    /* renamed from: d0, reason: collision with root package name */
    private ImageView f10124d0;

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.widget.b f10125e;

    /* renamed from: e0, reason: collision with root package name */
    private LinearLayout f10126e0;

    /* renamed from: f0, reason: collision with root package name */
    private ImageView f10128f0;

    /* renamed from: g0, reason: collision with root package name */
    private Runnable f10130g0;

    /* renamed from: j, reason: collision with root package name */
    private FrameLayout f10135j;

    /* renamed from: k, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.segmentbrowse.widget.g f10137k;

    /* renamed from: l, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.segmentbrowse.widget.h f10139l;

    /* renamed from: n, reason: collision with root package name */
    private GuideContainerLinearLayout f10143n;

    /* renamed from: o, reason: collision with root package name */
    private GuideContainerLinearLayout f10145o;

    /* renamed from: q, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.widget.c f10148q;

    /* renamed from: s, reason: collision with root package name */
    private TextView f10150s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10151t;

    /* renamed from: u, reason: collision with root package name */
    private float f10152u;

    /* renamed from: v, reason: collision with root package name */
    private double f10153v;

    /* renamed from: z, reason: collision with root package name */
    private View f10157z;

    /* renamed from: f, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.k.f.a f10127f = null;

    /* renamed from: g, reason: collision with root package name */
    private Handler f10129g = new Handler();

    /* renamed from: h, reason: collision with root package name */
    private boolean f10131h = true;

    /* renamed from: i, reason: collision with root package name */
    private y f10133i = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10141m = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10147p = false;

    /* renamed from: r, reason: collision with root package name */
    private IWNaviStatusListener f10149r = null;

    /* renamed from: w, reason: collision with root package name */
    public Bitmap f10154w = null;

    /* renamed from: x, reason: collision with root package name */
    public Bitmap f10155x = null;

    /* renamed from: y, reason: collision with root package name */
    public Bitmap f10156y = null;
    public com.baidu.platform.comapi.walknavi.k.d.a C = null;
    private boolean I = true;
    private boolean J = true;
    private boolean K = false;
    private boolean L = false;
    private Handler O = new a0(this);
    private Handler P = new Handler(Looper.getMainLooper());
    private Runnable Q = null;
    private Runnable S = new r();
    private Runnable U = new t();
    private Runnable V = new u();
    private String X = "";

    /* renamed from: b0, reason: collision with root package name */
    public boolean f10120b0 = false;

    /* renamed from: h0, reason: collision with root package name */
    final Runnable f10132h0 = new f();

    /* renamed from: i0, reason: collision with root package name */
    private Runnable f10134i0 = new j();

    /* renamed from: j0, reason: collision with root package name */
    a.InterfaceC0131a f10136j0 = new l();

    /* renamed from: k0, reason: collision with root package name */
    private Runnable f10138k0 = null;

    /* renamed from: l0, reason: collision with root package name */
    private g.a f10140l0 = new m();

    /* renamed from: m0, reason: collision with root package name */
    private int f10142m0 = -1;

    /* renamed from: n0, reason: collision with root package name */
    private final Runnable f10144n0 = new p();

    /* renamed from: o0, reason: collision with root package name */
    private com.baidu.platform.comapi.wnplatform.walkmap.b f10146o0 = new q();

    class a implements BaiduMap.OnBaseIndoorMapListener {
        a() {
        }

        @Override // com.baidu.mapapi.map.BaiduMap.OnBaseIndoorMapListener
        public void onBaseIndoorMapMode(boolean z7, MapBaseIndoorMapInfo mapBaseIndoorMapInfo) {
            if (!z7 || mapBaseIndoorMapInfo == null) {
                b.this.C.a();
            } else if (com.baidu.platform.comapi.h.c.b().f()) {
                b.this.C.a(mapBaseIndoorMapInfo);
            }
        }
    }

    private static class a0 extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<b> f10159a;

        public a0(b bVar) {
            this.f10159a = new WeakReference<>(bVar);
        }

        private void a(b bVar) {
            if (bVar == null) {
                return;
            }
            bVar.H = 0L;
            bVar.J = true;
            if (bVar.I) {
                bVar.I = false;
                bVar.G = System.currentTimeMillis();
            }
            if ((bVar.G > 0 ? System.currentTimeMillis() - bVar.G : 0L) <= 500 || !com.baidu.platform.comapi.h.c.b().h() || bVar.f10121c == null) {
                return;
            }
            bVar.f10121c.i();
        }

        private void b(b bVar) {
            com.baidu.platform.comapi.walknavi.widget.d.b bVar2;
            if (bVar == null) {
                return;
            }
            bVar.G = 0L;
            bVar.I = true;
            if (bVar.J) {
                bVar.J = false;
                bVar.H = System.currentTimeMillis();
            }
            if ((bVar.H > 0 ? System.currentTimeMillis() - bVar.H : 0L) <= 500 || !com.baidu.platform.comapi.h.c.b().d() || (bVar2 = bVar.f10118a0) == null) {
                return;
            }
            bVar2.a();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b bVar;
            WeakReference<b> weakReference = this.f10159a;
            if (weakReference == null || (bVar = weakReference.get()) == null) {
                return;
            }
            int i8 = message.what;
            if (i8 != 2) {
                if (i8 == 3) {
                    bVar.Q();
                    return;
                }
                return;
            }
            com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar = (com.baidu.platform.comapi.wnplatform.model.datastruct.a) message.obj;
            if (com.baidu.platform.comapi.h.a.a().b() != null) {
                com.baidu.platform.comapi.h.a.a().b().updateHeading((float) aVar.f10498d, (int) aVar.f10501g);
            }
            if (bVar.W != null) {
                bVar.W.a((int) aVar.f10498d);
            }
            double abs = Math.abs(aVar.f10499e) - 90.0d;
            if (bVar.R != 2 || bVar.W == null || !bVar.W.a() || !bVar.W.b() || !bVar.W.c() || com.baidu.platform.comapi.h.a.a().c()) {
                if (com.baidu.platform.comapi.h.a.a().c()) {
                    if (Math.abs(abs) < 20.0d) {
                        bVar.L = false;
                        return;
                    } else {
                        if (Math.abs(abs) <= 40.0d || bVar.L) {
                            return;
                        }
                        bVar.L = true;
                        return;
                    }
                }
                return;
            }
            if (Math.abs(Math.abs(aVar.f10500f) - 90.0d) <= 30.0d) {
                b(bVar);
                return;
            }
            if (Math.abs(abs) < 20.0d) {
                a(bVar);
            } else if (Math.abs(abs) > 40.0d) {
                if (!bVar.K) {
                    bVar.K = true;
                }
                b(bVar);
            }
        }
    }

    /* renamed from: com.baidu.platform.comapi.walknavi.k.b$b, reason: collision with other inner class name */
    class C0128b implements b.c {
        C0128b() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            if (b.this.f10133i != null) {
                b.this.f10133i.cancel();
            }
        }
    }

    class c implements b.c {
        c() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            if (b.this.f10133i == null) {
                b.this.e();
            } else {
                b.this.f10133i.onFinish();
                b.this.f10133i.cancel();
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimationDrawable f10162a;

        d(AnimationDrawable animationDrawable) {
            this.f10162a = animationDrawable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10162a == null || b.this.f10128f0 == null) {
                return;
            }
            this.f10162a.stop();
            b.this.f10128f0.setVisibility(8);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f10126e0.setVisibility(8);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f10121c != null) {
                b.this.f10121c.a();
            }
        }
    }

    class g implements b.c {
        g() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            b.this.I();
        }
    }

    class h implements b.c {
        h() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            try {
                b.this.f10117a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
                if (b.this.f10117a != null) {
                    com.baidu.platform.comapi.walknavi.k.g.a.a(b.this.f10117a, com.baidu.platform.comapi.h.t.p.a.b(b.this.f10117a, b.this.D.v()));
                }
            }
        }
    }

    class i implements DialogInterface.OnCancelListener {
        i() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            b.this.I();
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.baidu.platform.comapi.walknavi.b.n().s().r()) {
                com.baidu.platform.comapi.walknavi.b.n().l().run("[回车位]按钮点击");
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.R = 2;
        }
    }

    class l implements a.InterfaceC0131a {
        l() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.a.InterfaceC0131a
        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.equals("stop")) {
                com.baidu.platform.comapi.h.g.a.c("view listener", "stop");
            } else {
                com.baidu.platform.comapi.h.g.a.c("view listener", "finish");
                b.this.b(str);
            }
        }
    }

    class m implements g.a {
        m() {
        }

        @Override // com.baidu.platform.comapi.walknavi.segmentbrowse.widget.g.a
        public void a() {
            b.this.t();
            b.this.e(10000);
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baidu.platform.comapi.walknavi.b.n().s().x();
            com.baidu.platform.comapi.walknavi.b.n().l().run("[3D车头向上]按钮点击");
            com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE);
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baidu.platform.comapi.walknavi.b.n().l().runEntryState();
        }
    }

    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            bVar.a(true, bVar.D.D());
        }
    }

    class q implements com.baidu.platform.comapi.wnplatform.walkmap.b {
        q() {
        }
    }

    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtain = Message.obtain();
            obtain.what = 1;
            if (b.this.O != null) {
                b.this.O.dispatchMessage(obtain);
            }
        }
    }

    class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f10178a;

        s(int i8) {
            this.f10178a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapLanguage mapLanguage;
            MapLanguage mapLanguage2 = MapLanguage.CHINESE;
            com.baidu.platform.comapi.h.j.a j8 = com.baidu.platform.comapi.walknavi.b.n().j();
            if (j8 != null && (mapLanguage = MapLanguage.ENGLISH) == j8.e()) {
                mapLanguage2 = mapLanguage;
            }
            com.baidu.platform.comapi.h.n.i.b().a(b.C(), this.f10178a, mapLanguage2);
        }
    }

    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.Q();
            com.baidu.platform.comapi.walknavi.b.n().x().b("WALKNAVI_AR_ADJUST_HAS_SHOW", true);
        }
    }

    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f10117a != null) {
                com.baidu.platform.comapi.walknavi.b.n().x().b("WALKNAVI_AR_HINT_HAS_SHOW", true);
            }
        }
    }

    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baidu.platform.comapi.walknavi.b.n().t().a(com.baidu.platform.comapi.walknavi.b.n().t().c());
        }
    }

    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.D();
        }
    }

    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.D();
        }
    }

    public class y extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        Activity f10185a;

        /* renamed from: b, reason: collision with root package name */
        com.baidu.platform.comapi.walknavi.widget.b f10186b;

        public y(long j8, long j9, Activity activity, com.baidu.platform.comapi.walknavi.widget.b bVar) {
            super(j8, j9);
            this.f10185a = activity;
            this.f10186b = bVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Activity activity = this.f10185a;
            if (activity != null && !activity.isFinishing()) {
                this.f10186b.dismiss();
            }
            b.this.e();
        }

        @Override // android.os.CountDownTimer
        @SuppressLint({"SetTextI18n"})
        public void onTick(long j8) {
            com.baidu.platform.comapi.walknavi.widget.b bVar = this.f10186b;
            if (bVar != null) {
                ((Button) bVar.a()).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10185a, b.this.D.O()) + "(" + (j8 / 1000) + ")");
            }
        }
    }

    public interface z {
        void a();

        void a(int i8);

        void b(int i8);
    }

    public b(Activity activity) {
        this.f10119b = null;
        this.G = 0L;
        this.H = 0L;
        this.R = 0;
        this.H = 0L;
        this.G = 0L;
        this.R = 0;
        this.f10117a = activity;
        com.baidu.platform.comapi.h.j.a j8 = com.baidu.platform.comapi.walknavi.b.n().j();
        com.baidu.platform.comapi.walknavi.k.c cVar = new com.baidu.platform.comapi.walknavi.k.c(activity.getApplicationContext(), j8 == null ? MapLanguage.CHINESE : j8.e());
        this.D = cVar;
        Bitmap decodeResource = BitmapFactory.decodeResource(com.baidu.platform.comapi.h.t.p.a.e(), cVar.N());
        this.E = decodeResource;
        this.F = BitmapDescriptorFactory.fromBitmap(decodeResource);
        this.f10119b = com.baidu.platform.comapi.h.t.p.a.a(activity, R.layout.wsdk_layout_rg_ui_layoutndof, null);
        g(0);
        N();
        V();
        this.f10151t = true;
    }

    private LatLng A() {
        if (this.T == null) {
            this.T = com.baidu.platform.comapi.walknavi.b.n().D();
        }
        return this.T;
    }

    public static WalkPlan C() {
        return com.baidu.platform.comapi.walknavi.b.n().g().d().e();
    }

    private void F() {
        if (this.f10135j == null) {
            return;
        }
        com.baidu.platform.comapi.walknavi.widget.a aVar = this.B;
        if (aVar == null || !aVar.a()) {
            this.f10135j.removeAllViews();
            com.baidu.platform.comapi.walknavi.widget.a aVar2 = new com.baidu.platform.comapi.walknavi.widget.a(this.f10117a, 1);
            this.B = aVar2;
            a.InterfaceC0131a interfaceC0131a = this.f10136j0;
            if (interfaceC0131a != null) {
                aVar2.a(interfaceC0131a);
            }
            GuideContainerLinearLayout guideContainerLinearLayout = this.f10143n;
            if (guideContainerLinearLayout != null) {
                guideContainerLinearLayout.removeAllViews();
                this.f10143n.addView(this.B);
            }
            GuideContainerLinearLayout guideContainerLinearLayout2 = this.f10143n;
            if (guideContainerLinearLayout2 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) guideContainerLinearLayout2.getLayoutParams();
                layoutParams.setMargins(20, 0, 20, 0);
                this.f10143n.setLayoutParams(layoutParams);
                this.f10135j.addView(this.f10143n);
            }
            com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE);
            return;
        }
        if (this.B != null) {
            WalkPlan C = C();
            String h8 = com.baidu.platform.comapi.walknavi.b.n().s().h();
            if (C == null || TextUtils.isEmpty(h8)) {
                this.B.a("");
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(h8) && !TextUtils.equals(h8, "null")) {
                sb.append(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.n()) + ":" + h8 + "   ");
            }
            String c8 = com.baidu.platform.comapi.h.t.g.c(C);
            if (!TextUtils.isEmpty(c8)) {
                sb.append(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.o()) + ":" + c8);
            }
            this.B.a(sb.toString());
        }
    }

    private void G() {
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.d();
        }
    }

    private void H() {
        View view = this.f10119b;
        if (view != null) {
            View findViewById = view.findViewById(R.id.sensor_adjust_layout);
            this.Y = findViewById;
            findViewById.setVisibility(8);
            this.Y.setOnClickListener(new w());
            ImageView imageView = (ImageView) this.f10119b.findViewById(R.id.sensor_adjust_iv_close);
            if (imageView != null) {
                imageView.setOnClickListener(new x());
            }
            ImageView imageView2 = (ImageView) this.f10119b.findViewById(R.id.sensor_adjust_iv);
            if (imageView2 != null) {
                this.Z = (AnimationDrawable) imageView2.getBackground();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        com.baidu.platform.comapi.walknavi.i.c.a();
        Activity activity = this.f10117a;
        if (activity != null) {
            com.baidu.platform.comapi.walknavi.k.g.a.a(activity, com.baidu.platform.comapi.h.t.p.a.b(activity, this.D.U()));
        }
    }

    private void K() {
        com.baidu.platform.comapi.walknavi.b.n().B().a(this);
        com.baidu.platform.comapi.walknavi.b.n().z().a((com.baidu.platform.comapi.h.m.a) this);
        com.baidu.platform.comapi.walknavi.b.n().z().a((com.baidu.platform.comapi.h.m.c) this);
        com.baidu.platform.comapi.walknavi.b.n().q().a(this);
    }

    private void L() {
        Bitmap bitmap = this.E;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.E.recycle();
            this.E = null;
        }
        BitmapDescriptor bitmapDescriptor = this.F;
        if (bitmapDescriptor != null) {
            bitmapDescriptor.recycle();
            this.F = null;
        }
    }

    private void M() {
        Bitmap bitmap = this.f10154w;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f10154w.recycle();
            this.f10154w = null;
        }
        Bitmap bitmap2 = this.f10155x;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f10155x.recycle();
            this.f10155x = null;
        }
        Bitmap bitmap3 = this.f10156y;
        if (bitmap3 == null || bitmap3.isRecycled()) {
            return;
        }
        this.f10156y.recycle();
        this.f10156y = null;
    }

    private void N() {
        H();
        if (com.baidu.platform.comapi.walknavi.b.n().t().i()) {
            com.baidu.platform.comapi.walknavi.b.n().t().e().getMap().addOverlay(new MarkerOptions().position(A()).icon(this.F).zIndex(9).draggable(false));
        }
        this.f10121c = new com.baidu.platform.comapi.walknavi.k.f.c(this.f10117a, this, this.f10119b, this.D);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f10117a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        com.baidu.platform.comapi.walknavi.i.c.f10101b = displayMetrics.widthPixels;
        com.baidu.platform.comapi.h.g.a.c("walk engine", "screen width" + com.baidu.platform.comapi.walknavi.i.c.f10101b);
        com.baidu.platform.comapi.walknavi.k.d.a aVar = new com.baidu.platform.comapi.walknavi.k.d.a((ViewGroup) this.f10119b, this.f10117a, this.D);
        this.C = aVar;
        aVar.b();
        this.f10120b0 = false;
        boolean z7 = com.baidu.platform.comapi.h.p.a.f9234a;
        this.f10118a0 = new com.baidu.platform.comapi.walknavi.widget.d.b(this.f10117a, (ViewGroup) this.f10119b, this, this.D);
        this.f10117a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        com.baidu.platform.comapi.walknavi.i.c.f10101b = displayMetrics.widthPixels;
        com.baidu.platform.comapi.h.g.a.c("walk engine", "screen width" + com.baidu.platform.comapi.walknavi.i.c.f10101b);
        this.A = (ImageView) this.f10119b.findViewById(R.id.gps_status);
        this.f10157z = this.f10119b.findViewById(R.id.wnavi_page_youdao_container);
        FrameLayout frameLayout = (FrameLayout) this.f10119b.findViewById(R.id.framelayout);
        this.f10135j = frameLayout;
        frameLayout.setMinimumHeight(z());
        this.f10143n = (GuideContainerLinearLayout) this.f10119b.findViewById(R.id.normal_guide_view);
        this.f10145o = (GuideContainerLinearLayout) this.f10119b.findViewById(R.id.segment_guide_view);
        this.f10121c.j().setVisibility(4);
        WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
        if (J != null && !J.getIsShowTopGuideLayout()) {
            this.f10157z.setVisibility(8);
        }
        Bundle y7 = com.baidu.platform.comapi.walknavi.b.n().y();
        if (y7 != null) {
            if (y7.containsKey("distance") || y7.containsKey("time")) {
                this.f10121c.j().setVisibility(0);
            }
            com.baidu.platform.comapi.h.t.o.b().a(y7.getInt("time"), y7.getInt("distance"), this.D.x());
            StringBuilder sb = new StringBuilder();
            sb.append(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.K()) + ": ");
            if (com.baidu.platform.comapi.h.t.o.b().c() != null) {
                sb.append(com.baidu.platform.comapi.h.t.o.b().c() + cn.hutool.core.text.l.SPACE);
            }
            if (com.baidu.platform.comapi.h.t.o.b().d() != null) {
                sb.append(com.baidu.platform.comapi.h.t.o.b().d() + cn.hutool.core.text.l.SPACE);
            }
            this.f10121c.j().setText(sb.toString());
            this.f10118a0.e().setText(sb.toString());
            this.f10118a0.d().setText(sb.toString());
        }
        com.baidu.platform.comapi.walknavi.segmentbrowse.widget.e.a(com.baidu.platform.comapi.walknavi.i.c.a(this.f10117a));
        a("---- UI LOG ");
        this.f10126e0 = (LinearLayout) this.f10119b.findViewById(R.id.top_hint_layout);
        this.f10122c0 = (TextView) this.f10119b.findViewById(R.id.top_hint_tv);
        this.f10124d0 = (ImageView) this.f10119b.findViewById(R.id.top_hint_iv);
        ImageView imageView = (ImageView) this.f10119b.findViewById(R.id.mid_dlg);
        this.f10128f0 = imageView;
        imageView.setBackgroundResource(R.drawable.wsdk_phone_down_anim);
        this.K = false;
        this.L = false;
        ((TextView) this.f10119b.findViewById(R.id.bnav_rg_bar_tv)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.H()));
    }

    private void P() {
        if (this.f10117a == null) {
            return;
        }
        try {
            if (this.f10125e == null) {
                com.baidu.platform.comapi.walknavi.widget.b b8 = new com.baidu.platform.comapi.walknavi.widget.b(this.f10117a).d(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.S())).a(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.y())).b(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.M())).c().a(new h()).c(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.i())).b(new g());
                this.f10125e = b8;
                b8.setOnCancelListener(new i());
            }
            Activity activity = this.f10117a;
            if (activity == null || activity.isFinishing()) {
                return;
            }
            this.f10125e.show();
        } catch (Exception unused) {
        }
    }

    private void S() {
        com.baidu.platform.comapi.walknavi.b.n().B().b(this);
        com.baidu.platform.comapi.walknavi.b.n().z().b((com.baidu.platform.comapi.h.m.a) this);
        com.baidu.platform.comapi.walknavi.b.n().z().b((com.baidu.platform.comapi.h.m.c) this);
        com.baidu.platform.comapi.walknavi.b.n().q().b(this);
    }

    private void T() {
        com.baidu.platform.comapi.walknavi.segmentbrowse.widget.a aVar;
        if (com.baidu.platform.comapi.h.c.b().h()) {
            com.baidu.platform.comapi.walknavi.segmentbrowse.widget.a aVar2 = this.N;
            if (aVar2 != null) {
                aVar2.setVisibility(0);
                return;
            }
            return;
        }
        if (!com.baidu.platform.comapi.h.c.b().d() || (aVar = this.N) == null) {
            return;
        }
        aVar.setVisibility(8);
    }

    private void U() {
        int q8 = com.baidu.platform.comapi.walknavi.b.n().s().q();
        com.baidu.platform.comapi.h.g.a.c("tag", "traffic size:" + q8);
        if (q8 != 0) {
            int[] iArr = new int[q8];
            int[] iArr2 = new int[q8];
            int[] iArr3 = new int[q8];
            com.baidu.platform.comapi.walknavi.b.n().s().a(iArr, iArr2, iArr3);
            com.baidu.platform.comapi.h.l.a.c().a(this.f10117a, iArr, iArr2, iArr3);
        }
    }

    private void V() {
        int j8 = com.baidu.platform.comapi.walknavi.b.n().s().j();
        com.baidu.platform.comapi.h.g.a.c("tag", "all size:" + j8);
        if (j8 > 2) {
            int i8 = j8 - 2;
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            com.baidu.platform.comapi.walknavi.b.n().s().b(iArr, iArr2, iArr3);
            com.baidu.platform.comapi.h.l.b.c().a(this.f10117a, iArr, iArr2, iArr3);
        }
    }

    private void s() {
        Runnable runnable;
        Handler handler = this.f10129g;
        if (handler == null || (runnable = this.f10144n0) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f10129g.postDelayed(this.f10144n0, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private void u() {
        if (this.f10131h) {
            return;
        }
        WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
        if (J == null || J.getShowDialogEnable()) {
            if (com.baidu.platform.comapi.walknavi.b.n().q().d()) {
                v();
            } else {
                P();
            }
        }
    }

    private void v() {
        Activity activity;
        try {
            if (this.f10125e == null || (activity = this.f10117a) == null || activity.isFinishing()) {
                return;
            }
            if (this.f10125e.isShowing()) {
                this.f10125e.dismiss();
            }
            this.f10125e = null;
        } catch (Exception unused) {
        }
    }

    private int y() {
        int c8 = (int) (com.baidu.platform.comapi.h.t.h.c(this.f10117a) / 2.7d);
        int a8 = com.baidu.platform.comapi.h.t.h.a(this.f10117a, com.baidu.platform.comapi.h.t.h.f9273d);
        if (c8 > a8) {
            c8 = a8;
        }
        return c8 - a((Context) this.f10117a);
    }

    private int z() {
        int c8 = (int) (com.baidu.platform.comapi.h.t.h.c(this.f10117a) / 2.9d);
        int a8 = com.baidu.platform.comapi.h.t.h.a(this.f10117a, com.baidu.platform.comapi.h.t.h.f9272c);
        return c8 > a8 ? a8 : c8;
    }

    public com.baidu.platform.comapi.walknavi.k.f.c B() {
        return this.f10121c;
    }

    public void D() {
        View view = this.Y;
        if (view != null) {
            view.setVisibility(8);
        }
        AnimationDrawable animationDrawable = this.Z;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    public void E() {
        LinearLayout linearLayout = this.f10126e0;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public void J() {
        com.baidu.platform.comapi.walknavi.k.f.a aVar = this.f10127f;
        if (aVar != null) {
            aVar.b();
            this.f10127f = null;
        }
    }

    public void O() {
        com.baidu.platform.comapi.h.q.a.a().a("FootNaviAutoComplete");
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.d();
        }
    }

    public void Q() {
        View view = this.Y;
        if (view != null) {
            view.setVisibility(0);
        }
        AnimationDrawable animationDrawable = this.Z;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    public void R() {
        if (com.baidu.platform.comapi.h.c.b().h()) {
            com.baidu.platform.comapi.walknavi.b.n().t().e().showScaleControl(true);
            com.baidu.platform.comapi.walknavi.b.n().t().e().showZoomControls(false);
            com.baidu.platform.comapi.walknavi.b.n().t().e().getMap().getUiSettings().setAllGesturesEnabled(true);
            a(this.f10117a, com.baidu.platform.comapi.walknavi.b.n().t().e(), 60, 0, 0, 75);
            return;
        }
        if (com.baidu.platform.comapi.h.c.b().d()) {
            com.baidu.platform.comapi.walknavi.b.n().t().e().showScaleControl(false);
            com.baidu.platform.comapi.walknavi.b.n().t().e().showZoomControls(false);
            com.baidu.platform.comapi.walknavi.b.n().t().e().getMap().getUiSettings().setAllGesturesEnabled(false);
            a(this.f10117a, com.baidu.platform.comapi.walknavi.b.n().t().e(), 0, 0, 0, 0);
        }
    }

    @Override // com.baidu.platform.comapi.h.n.f
    public void a(int i8) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void b(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public boolean d() {
        return this.f10119b == null || this.f10117a == null;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public View h() {
        return this.f10119b;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public float i() {
        return this.f10152u;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int k() {
        return 12;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public Handler l() {
        return this.O;
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void onFinalEnd(Message message) {
        if (com.baidu.platform.comapi.walknavi.b.n().s().s()) {
            O();
            if (com.baidu.platform.comapi.walknavi.b.n().J() == null || com.baidu.platform.comapi.walknavi.b.n().J().isShowDialogWithExitNavi()) {
                s();
            }
        }
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void onIndoorEnd(Message message) {
        if (com.baidu.platform.comapi.walknavi.b.n().s().s()) {
            com.baidu.platform.comapi.walknavi.b.n().f(false);
        }
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
        if (com.baidu.platform.comapi.walknavi.b.n().u() == 4) {
            com.baidu.platform.comapi.walknavi.b.n().l().setInitialState("Entry");
        }
        G();
        com.baidu.platform.comapi.walknavi.b.n().s().b();
        com.baidu.platform.comapi.walknavi.b.n().s().y();
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void p() {
        this.f10131h = true;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void q() {
        if (!com.baidu.platform.comapi.walknavi.b.n().o()) {
            a(false, this.D.j());
            return;
        }
        com.baidu.platform.comapi.walknavi.k.f.a aVar = this.f10127f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void r() {
        this.f10131h = false;
        if (com.baidu.platform.comapi.walknavi.b.n().u() != 4) {
            u();
        }
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.w();
            this.f10121c.s();
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        K();
        a(this.f10117a);
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        S();
        Handler handler = this.f10129g;
        if (handler != null) {
            handler.removeCallbacks(this.f10132h0);
            this.f10129g = null;
        }
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.h();
        }
        M();
        L();
        this.f10150s = null;
    }

    public void t() {
        Runnable runnable;
        Handler handler = this.f10129g;
        if (handler == null || (runnable = this.f10138k0) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public com.baidu.platform.comapi.walknavi.widget.d.c w() {
        return this.W;
    }

    public com.baidu.platform.comapi.walknavi.widget.d.b x() {
        return this.f10118a0;
    }

    private void g(int i8) {
        com.baidu.platform.comapi.util.j.b().execute(new s(i8));
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void a(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void e() {
        WalkNaviDisplayOption J;
        Activity activity;
        Runnable runnable;
        this.M = true;
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.o();
        }
        com.baidu.platform.comapi.h.n.i.b().d();
        Handler handler = this.O;
        if (handler != null && (runnable = this.S) != null) {
            handler.removeCallbacks(runnable);
        }
        com.baidu.platform.comapi.walknavi.widget.b bVar = this.f10123d;
        if (bVar != null && bVar.isShowing() && (activity = this.f10117a) != null && !activity.isFinishing()) {
            this.f10123d.dismiss();
        }
        com.baidu.platform.comapi.walknavi.i.c.a();
        View view = this.f10119b;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                int i8 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (i8 >= viewGroup.getChildCount()) {
                        break;
                    }
                    viewGroup.removeView(viewGroup.getChildAt(i8));
                    i8++;
                }
            }
            this.f10119b = null;
        }
        Activity activity2 = this.f10117a;
        if (activity2 != null && !activity2.isFinishing() && ((J = com.baidu.platform.comapi.walknavi.b.n().J()) == null || !J.isIsRunInFragment())) {
            this.f10117a.finish();
        }
        com.baidu.platform.comapi.walknavi.b.n().b0();
        this.f10117a = null;
        com.baidu.platform.comapi.h.a.a().g();
        com.baidu.platform.comapi.h.a.a().f();
        J();
    }

    public void f(int i8) {
        Handler handler;
        if (i8 != 1 || (handler = this.f10129g) == null) {
            if (i8 == 0) {
                this.R = i8;
                return;
            }
            return;
        }
        this.R = i8;
        Runnable runnable = this.Q;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        k kVar = new k();
        this.Q = kVar;
        this.f10129g.postDelayed(kVar, 4000L);
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int j() {
        WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
        if (J == null || J.getCustomBottomView() == null) {
            return 0;
        }
        return J.getBottomViewHeight();
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int m() {
        com.baidu.platform.comapi.walknavi.k.f.c cVar;
        if (this.f10135j == null || (cVar = this.f10121c) == null || cVar.k() == null) {
            return 50;
        }
        return this.f10135j.getHeight() + this.f10121c.k().getHeight();
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void n() {
        this.C.a();
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void o() {
        G();
    }

    public void a(IWNaviStatusListener iWNaviStatusListener) {
        this.f10149r = iWNaviStatusListener;
    }

    public void c(int i8, boolean z7) {
        if (i8 == 0) {
            this.f10122c0.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.z()));
            this.f10124d0.setBackgroundResource(R.drawable.wsdk_warning_hint);
        } else if (i8 == 1) {
            this.f10122c0.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.I()));
            this.f10124d0.setBackgroundResource(R.drawable.wsdk_ok_hint);
        } else if (i8 != 2) {
            if (i8 == 3) {
                this.f10122c0.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.Y0()));
                this.f10124d0.setBackgroundResource(R.drawable.wsdk_warning_hint);
            } else if (i8 == 4) {
                this.f10122c0.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.b0()));
                this.f10124d0.setBackgroundResource(R.drawable.wsdk_warning_hint);
            } else if (i8 == 5) {
                this.f10122c0.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.c0()));
                this.f10124d0.setBackgroundResource(R.drawable.wsdk_warning_hint);
            }
        }
        this.f10126e0.setVisibility(0);
        Runnable runnable = this.f10130g0;
        if (runnable != null) {
            this.f10129g.removeCallbacks(runnable);
        }
        if (z7) {
            e eVar = new e();
            this.f10130g0 = eVar;
            this.f10129g.postDelayed(eVar, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int g() {
        return (int) (com.baidu.platform.comapi.h.t.q.b.b().a() * 155.0f);
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(com.baidu.platform.comapi.walknavi.k.f.a aVar) {
        this.f10127f = aVar;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void d(int i8) {
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.a(i8);
        }
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(String str) {
    }

    public void b(int i8, boolean z7) {
        R();
        if (com.baidu.platform.comapi.h.c.b().d()) {
            if (z7) {
                f(1);
            }
            if (this.W == null && com.baidu.platform.comapi.h.a.a().e() != NavigationType.ARCore && com.baidu.platform.comapi.h.a.a().e() != NavigationType.AREngine && com.baidu.platform.comapi.h.a.a().e() == NavigationType.ARIMU) {
                this.W = new com.baidu.platform.comapi.walknavi.widget.d.a(this.f10117a, (ViewGroup) this.f10119b, this, this.D);
            }
            com.baidu.platform.comapi.walknavi.widget.d.c cVar = this.W;
            if (cVar != null) {
                cVar.b(z7);
                this.W.d();
            }
            this.f10135j.setVisibility(4);
            this.A.setVisibility(4);
            com.baidu.platform.comapi.walknavi.b.n().x().b("WALKNAVI_FIRST_AR", false);
            if (!com.baidu.platform.comapi.walknavi.b.n().x().a("WALKNAVI_AR_HINT_HAS_SHOW", false)) {
                this.O.postDelayed(this.V, 10000L);
            }
            a(i8, z7);
            com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE);
            com.baidu.platform.comapi.walknavi.b.n().s().x();
            this.O.postDelayed(new v(), 500L);
            return;
        }
        if (com.baidu.platform.comapi.h.c.b().h()) {
            com.baidu.platform.comapi.walknavi.b.n().t().e().onResume();
            com.baidu.platform.comapi.walknavi.widget.d.c cVar2 = this.W;
            if (cVar2 != null) {
                cVar2.d();
            }
            if (z7) {
                f(0);
            }
            com.baidu.platform.comapi.h.a.a().g();
            this.f10135j.setVisibility(0);
            this.O.removeCallbacks(this.V);
            this.O.removeCallbacks(this.U);
            a(i8, z7);
            com.baidu.platform.comapi.h.t.e.a(true);
        }
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void d(Bundle bundle) {
        com.baidu.platform.comapi.h.g.a.b("onCompassInfoUpdate" + bundle.toString());
        if (com.baidu.platform.comapi.walknavi.b.n().u() == 4 && bundle.containsKey("uid")) {
            com.baidu.platform.comapi.walknavi.i.c.c(bundle.getInt("uid"));
            com.baidu.platform.comapi.walknavi.i.a aVar = new com.baidu.platform.comapi.walknavi.i.a();
            aVar.f(bundle.getInt("uid"));
            aVar.c(com.baidu.platform.comapi.walknavi.segmentbrowse.widget.e.a(bundle, MapController.COMPASS_LAYER_TAG));
            aVar.a(com.baidu.platform.comapi.walknavi.segmentbrowse.widget.e.a(bundle, false));
            aVar.b(com.baidu.platform.comapi.walknavi.segmentbrowse.widget.e.a(bundle));
            if (bundle.containsKey("usGuideText")) {
                aVar.c(bundle.getString("usGuideText"));
            }
            if (bundle.containsKey("maneuverKind")) {
                aVar.d(com.baidu.platform.comapi.h.m.d.b(RouteGuideKind.values()[bundle.getInt("maneuverKind")]));
            }
            if (bundle.containsKey("nParagraphLength")) {
                aVar.e(bundle.getInt("nParagraphLength"));
            }
            com.baidu.platform.comapi.walknavi.i.c.a(aVar);
            this.f10135j.removeAllViews();
            new Handler().postDelayed(new o(), 500L);
            com.baidu.platform.comapi.walknavi.b.n().s().c(true);
            com.baidu.platform.comapi.walknavi.segmentbrowse.widget.g gVar = new com.baidu.platform.comapi.walknavi.segmentbrowse.widget.g(this.f10117a, this);
            this.f10137k = gVar;
            this.f10135j.addView(gVar);
        }
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int f() {
        return (int) (com.baidu.platform.comapi.h.t.q.b.b().a() * 30.0f);
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void a(byte[] bArr) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void f(Bundle bundle) {
        Activity activity;
        String g8;
        if (bundle == null || (activity = this.f10117a) == null || activity.isFinishing()) {
            return;
        }
        if (bundle.containsKey("floor") && !TextUtils.isEmpty(bundle.getString("floor"))) {
            String string = bundle.getString("floor");
            if (!TextUtils.isEmpty(bundle.getString("building"))) {
                g8 = bundle.getString("building");
            } else {
                g8 = com.baidu.platform.comapi.walknavi.b.n().s().g();
            }
            if (com.baidu.platform.comapi.h.c.b().f()) {
                this.C.a(string);
                com.baidu.platform.comapi.h.t.e.a(string, g8, false);
            }
        }
        int i8 = bundle.getInt("simpleUpdateType");
        if (i8 == com.baidu.platform.comapi.h.m.e.f9155a || i8 == com.baidu.platform.comapi.h.m.e.f9157c) {
            return;
        }
        com.baidu.platform.comapi.walknavi.k.e.a.a(bundle, 1, bundle.getInt("nRemainDist"), bundle.getInt("nStartDist"));
        if (bundle.containsKey("uid")) {
            int i9 = bundle.getInt("uid");
            if (bundle.containsKey("usGuideText")) {
                String string2 = bundle.getString("usGuideText");
                if (string2 == null) {
                    string2 = "";
                }
                String trim = string2.trim();
                if (trim.equals("到达目的地") || trim.equals("Arrived at destination")) {
                    bundle.putInt("uid", com.baidu.platform.comapi.walknavi.i.c.h());
                    i9 = com.baidu.platform.comapi.walknavi.i.c.h();
                }
            }
            if (i9 == com.baidu.platform.comapi.walknavi.i.c.g() || com.baidu.platform.comapi.walknavi.i.c.g() == -1 || com.baidu.platform.comapi.walknavi.i.c.t() == com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE) {
                com.baidu.platform.comapi.walknavi.i.c.a(a(i9, bundle));
            }
        }
        F();
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.wsdk_gps_ok);
        }
    }

    public RelativeLayout a(b.n nVar) {
        return this.f10118a0.a(nVar);
    }

    private void a(int i8, boolean z7) {
        if (this.f10135j != null) {
            if (com.baidu.platform.comapi.h.c.b().d()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, y());
                int i9 = R.id.walk_navi_youdao_inner_empty_top;
                layoutParams.addRule(3, i9);
                this.f10135j.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, y() + a((Context) this.f10117a));
                layoutParams2.addRule(3, i9);
                this.f10157z.setLayoutParams(layoutParams2);
                this.f10135j.setBackgroundResource(R.drawable.wsdk_newar_guide_bg);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, z());
                int i10 = R.id.walk_navi_youdao_inner_empty_top;
                layoutParams3.addRule(3, i10);
                this.f10135j.setLayoutParams(layoutParams3);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, z() + a((Context) this.f10117a));
                layoutParams4.addRule(3, i10);
                this.f10157z.setLayoutParams(layoutParams4);
                this.f10157z.setBackgroundColor(0);
                this.f10135j.setPadding(0, 0, 0, 0);
                this.f10135j.setBackgroundResource(R.drawable.wsdk_guide_bar_bg);
            }
        }
        if (this.f10143n != null) {
            if (com.baidu.platform.comapi.h.c.b().d()) {
                this.f10143n.setVisibility(8);
            } else {
                this.f10143n.setVisibility(0);
            }
        }
        GuideContainerLinearLayout guideContainerLinearLayout = this.f10145o;
        if (guideContainerLinearLayout != null) {
            guideContainerLinearLayout.setVisibility(8);
        }
        this.C.c();
        com.baidu.platform.comapi.walknavi.b.n().P();
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.a(i8, z7);
            if (com.baidu.platform.comapi.h.c.b().d()) {
                this.f10121c.m();
            }
        }
        com.baidu.platform.comapi.walknavi.widget.d.b bVar = this.f10118a0;
        if (bVar != null) {
            bVar.b(i8);
        }
        T();
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void c(int i8) {
        Runnable runnable;
        Handler handler = this.f10129g;
        if (handler == null || (runnable = this.f10134i0) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f10129g.postDelayed(this.f10134i0, i8);
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void c() {
        Runnable runnable;
        Handler handler = this.f10129g;
        if (handler == null || (runnable = this.f10134i0) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void c(Bundle bundle) {
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        float f8 = 0.0f;
        try {
            this.f10152u = bundle.getFloat("curSpeed");
            this.f10142m0 = bundle.getInt("AddDist");
            d8 = new BigDecimal(bundle.getInt("AddDist") / 1000.0f).setScale(1, 4).doubleValue();
            f8 = bundle.getInt("RouteDist") / 1000.0f;
            float f9 = bundle.getFloat("calorie");
            com.baidu.platform.comapi.h.g.a.b("walk cal:" + f9 + "or:" + bundle.getFloat("calorie"));
            new BigDecimal((double) f9).setScale(1, 4).doubleValue();
        } catch (Exception e8) {
            com.baidu.platform.comapi.h.g.a.b("exception" + e8.getMessage());
        }
        this.f10153v = d8 / f8;
    }

    public void e(int i8) {
        Runnable runnable = this.f10138k0;
        if (runnable != null) {
            runnable.run();
        }
        n nVar = new n();
        this.f10138k0 = nVar;
        this.f10129g.postDelayed(nVar, i8);
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void e(Bundle bundle) {
        if (bundle.getInt("updatetype") == com.baidu.platform.comapi.h.m.e.f9156b) {
            int i8 = bundle.getInt("totaldist");
            a(i8, bundle.getInt("totaltime"));
            com.baidu.platform.comapi.h.n.i.b().b(i8);
        }
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void d(Message message) {
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.b(3);
        }
        com.baidu.platform.comapi.walknavi.widget.c cVar2 = this.f10148q;
        if (cVar2 != null) {
            cVar2.a(R.drawable.wn_reroute, com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.Z()));
        }
        com.baidu.platform.comapi.walknavi.b.n().B().e();
    }

    @Override // com.baidu.platform.comapi.h.f.a
    public void e(Message message) {
        if (message.arg1 == 0 && this.f10117a != null && this.f10135j != null) {
            ArrayList arrayList = new ArrayList();
            if (com.baidu.platform.comapi.h.c.b().f()) {
                arrayList.add(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.a1()) + cn.hutool.core.text.l.SPACE);
                arrayList.add(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.T0()));
            } else {
                arrayList.add(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.Y()) + cn.hutool.core.text.l.SPACE);
                arrayList.add(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.Z0()));
            }
            this.f10135j.removeAllViews();
            com.baidu.platform.comapi.walknavi.i.c.a();
            this.N = new com.baidu.platform.comapi.walknavi.segmentbrowse.widget.a(this.f10117a, arrayList, R.drawable.wn_gps_white);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10143n.getLayoutParams();
            layoutParams.height = com.baidu.platform.comapi.walknavi.segmentbrowse.widget.b.a(this.f10117a, 95.0f);
            layoutParams.gravity = 16;
            this.N.setLayoutParams(layoutParams);
            this.f10135j.addView(this.N);
            T();
            com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE);
            if (com.baidu.platform.comapi.h.c.b().d()) {
                c(0, true);
            }
        }
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.wsdk_gps_weak);
        }
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void c(Message message) {
        if (com.baidu.platform.comapi.walknavi.b.n().s().s()) {
            com.baidu.platform.comapi.walknavi.b.n().a(true, false);
            if (com.baidu.platform.comapi.h.c.b().f()) {
                return;
            }
            com.baidu.platform.comapi.walknavi.b.n().h0();
            return;
        }
        O();
        if (com.baidu.platform.comapi.walknavi.b.n().J() == null || com.baidu.platform.comapi.walknavi.b.n().J().isShowDialogWithExitNavi()) {
            s();
        }
    }

    public void b(boolean z7) {
        ImageView imageView = this.f10128f0;
        if (imageView == null) {
            return;
        }
        if (z7) {
            AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
            animationDrawable.start();
            this.f10129g.postDelayed(new d(animationDrawable), 1800L);
            this.f10128f0.setVisibility(0);
            return;
        }
        ((AnimationDrawable) imageView.getBackground()).stop();
        this.f10128f0.setVisibility(8);
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void b() {
        Runnable runnable;
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.d();
        }
        Handler handler = this.f10129g;
        if (handler == null || (runnable = this.f10132h0) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f10129g.postDelayed(this.f10132h0, 20000L);
    }

    public static int a(Context context) {
        Resources resources;
        int identifier;
        if (context != null && (identifier = (resources = context.getResources()).getIdentifier("status_bar_height", "dimen", HttpConstants.OS_TYPE_VALUE)) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        GuideContainerLinearLayout guideContainerLinearLayout;
        Runnable runnable;
        try {
            Handler handler = this.O;
            if (handler != null && (runnable = this.S) != null) {
                handler.removeCallbacks(runnable);
            }
            GuideContainerLinearLayout guideContainerLinearLayout2 = this.f10145o;
            if (guideContainerLinearLayout2 != null) {
                guideContainerLinearLayout2.setVisibility(0);
            }
            com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG.segment");
            com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.GUIDING_TO_SEGMENTBROWSE);
            com.baidu.platform.comapi.walknavi.b.n().l().run("强诱导转到分段");
            com.baidu.platform.comapi.walknavi.b.n().s().u();
            this.f10135j.removeAllViews();
            com.baidu.platform.comapi.walknavi.segmentbrowse.widget.h hVar = this.f10139l;
            if (hVar != null) {
                hVar.a();
            }
            com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
            if (cVar != null) {
                cVar.c(false);
            }
            int g8 = com.baidu.platform.comapi.walknavi.i.c.g();
            if (str.equals("next")) {
                com.baidu.platform.comapi.h.g.a.c("chang view", "next");
                com.baidu.platform.comapi.walknavi.i.c.c(g8 + 1);
            } else if (str.equals("last")) {
                com.baidu.platform.comapi.h.g.a.c("chang view", "last");
                com.baidu.platform.comapi.walknavi.i.c.c(g8 - 1);
            }
            GuideContainerLinearLayout guideContainerLinearLayout3 = this.f10145o;
            if (guideContainerLinearLayout3 != null) {
                this.f10135j.addView(guideContainerLinearLayout3);
            }
            com.baidu.platform.comapi.walknavi.segmentbrowse.widget.g gVar = new com.baidu.platform.comapi.walknavi.segmentbrowse.widget.g(this.f10117a, this);
            this.f10137k = gVar;
            gVar.setScrollListener(this.f10140l0);
            if (this.f10137k == null || (guideContainerLinearLayout = this.f10145o) == null) {
                return;
            }
            guideContainerLinearLayout.removeAllViews();
            this.f10145o.addView(this.f10137k);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private void a(Activity activity) {
        BaiduMap map;
        com.baidu.platform.comapi.wnplatform.walkmap.c t7 = com.baidu.platform.comapi.walknavi.b.n().t();
        if (t7 == null || t7.e() == null || (map = t7.e().getMap()) == null) {
            return;
        }
        map.setOnBaseIndoorMapListener(new a());
    }

    public void a(boolean z7, int i8) {
        String b8;
        Activity activity;
        System.out.println("WalkUIController showQuitDialog");
        try {
            Activity activity2 = this.f10117a;
            if (activity2 != null && !activity2.isFinishing()) {
                WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
                if (J != null && !J.getShowExitDialogEnable()) {
                    e();
                    return;
                }
                com.baidu.platform.comapi.walknavi.widget.b d8 = new com.baidu.platform.comapi.walknavi.widget.b(this.f10117a).a(true).d(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.S()));
                if (com.baidu.platform.comapi.walknavi.k.e.b.f10196a == 2) {
                    b8 = com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.j());
                } else {
                    b8 = com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, i8);
                }
                this.f10123d = d8.a(b8).c(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.O())).d().b(new c()).b(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.i())).a(new C0128b());
                if (z7) {
                    y yVar = new y(6000L, 1000L, this.f10117a, this.f10123d);
                    this.f10133i = yVar;
                    yVar.start();
                }
                if (this.f10123d.isShowing() || (activity = this.f10117a) == null || activity.isFinishing()) {
                    return;
                }
                this.f10123d.show();
                return;
            }
            com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG.exitNavi");
            J();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void b(Message message) {
        com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG.farAway");
        this.f10135j.removeAllViews();
        com.baidu.platform.comapi.walknavi.i.c.a();
        com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE);
        com.baidu.platform.comapi.walknavi.widget.c cVar = this.f10148q;
        if (cVar != null) {
            cVar.a(R.drawable.wn_faraway_route_blue, com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.p()));
        }
    }

    @Override // com.baidu.platform.comapi.h.f.a
    public void b(int i8) {
        u();
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(boolean z7) {
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.c(z7);
        }
    }

    private com.baidu.platform.comapi.walknavi.i.a a(int i8, Bundle bundle) {
        com.baidu.platform.comapi.walknavi.i.c.c(i8);
        com.baidu.platform.comapi.walknavi.i.a aVar = new com.baidu.platform.comapi.walknavi.i.a();
        aVar.f(bundle.getInt("uid"));
        aVar.c(com.baidu.platform.comapi.walknavi.segmentbrowse.widget.e.a(bundle, "walk"));
        if (bundle.containsKey("enGuideType")) {
            aVar.b(((Integer) bundle.get("enGuideType")).intValue());
        }
        if (bundle.containsKey("nDistance2GP")) {
            aVar.a(((Integer) bundle.get("nDistance2GP")).intValue());
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.b());
            sb.append("\n");
        }
        if (bundle.containsKey("usGuideText")) {
            aVar.c(bundle.getString("usGuideText"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(bundle.getString("usGuideText"));
            sb2.append("\n");
        }
        if (bundle.containsKey("enSpliceType")) {
            aVar.c(((Integer) bundle.get("enSpliceType")).intValue());
        }
        if (bundle.containsKey("maneuverKind")) {
            int intValue = ((Integer) bundle.get("maneuverKind")).intValue();
            String b8 = com.baidu.platform.comapi.h.m.d.b(RouteGuideKind.values()[intValue]);
            aVar.d(intValue);
            aVar.d(b8);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(intValue);
            sb3.append("\n");
        }
        if (i8 == com.baidu.platform.comapi.walknavi.i.c.h()) {
            aVar.e(20);
            com.baidu.platform.comapi.walknavi.i.c.f(20);
        } else if (bundle.containsKey("nParagraphLength")) {
            aVar.e(bundle.getInt("nParagraphLength"));
            if (bundle.containsKey("nRemainDist")) {
                if (bundle.getInt("nRemainDist") == bundle.getInt("nParagraphLength")) {
                    com.baidu.platform.comapi.walknavi.i.c.f(bundle.getInt("nRemainDist") - 1);
                } else {
                    com.baidu.platform.comapi.walknavi.i.c.f(bundle.getInt("nRemainDist"));
                }
            }
        }
        if (com.baidu.platform.comapi.h.c.b().d() && aVar.c() == 0) {
            com.baidu.platform.comapi.h.a.a().a(aVar.b());
        }
        return aVar;
    }

    public void a(RouteGuideKind routeGuideKind) {
        if (com.baidu.platform.comapi.walknavi.g.g.a().a(routeGuideKind)) {
            com.baidu.platform.comapi.walknavi.g.g.a().c();
        }
        if (com.baidu.platform.comapi.walknavi.g.g.a().b(routeGuideKind)) {
            com.baidu.platform.comapi.walknavi.g.g.a().f();
        }
    }

    public void a(int i8, int i9) {
        com.baidu.platform.comapi.h.t.o.b().a(i9, i8, this.D.x());
        StringBuilder sb = new StringBuilder();
        sb.append(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.K()) + ": ");
        sb.append(com.baidu.platform.comapi.h.t.o.b().c());
        sb.append(cn.hutool.core.text.l.SPACE);
        sb.append(com.baidu.platform.comapi.h.t.o.b().d());
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null && cVar.j() != null) {
            this.f10121c.j().setText(sb.toString());
        }
        this.f10118a0.a(i8);
        this.f10118a0.d().setText(sb.toString());
        this.f10118a0.e().setText(sb.toString());
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void a(Message message) {
        com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG.reRoute");
        if (!this.f10131h) {
            com.baidu.platform.comapi.walknavi.b.n().l().run("收到偏航算路成功消息");
        }
        U();
        com.baidu.platform.comapi.walknavi.k.f.c cVar = this.f10121c;
        if (cVar != null) {
            cVar.b(4);
        }
        com.baidu.platform.comapi.walknavi.widget.a aVar = this.B;
        if (aVar != null) {
            aVar.a(com.baidu.platform.comapi.h.t.p.a.b(this.f10117a, this.D.a0()));
        }
    }

    @Override // com.baidu.platform.comapi.h.n.f
    public void a() {
        g(1);
    }
}
