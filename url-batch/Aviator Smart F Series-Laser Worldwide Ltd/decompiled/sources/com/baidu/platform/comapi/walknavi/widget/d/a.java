package com.baidu.platform.comapi.walknavi.widget.d;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.ar.NavigationConfiguration;
import com.baidu.ar.OnReciveCrossStreetFormLuaListener;
import com.baidu.ar.OnReciveFootBridgeFormLuaListener;
import com.baidu.ar.OnReciveShakeListener;
import com.baidu.ar.OnReciveTunnelFormLuaListener;
import com.baidu.ar.OnSetupComplete;
import com.baidu.ar.marker.IMarkerStateListener;
import com.baidu.ar.marker.PositioningModuleAddListener;
import com.baidu.ar.marker.model.LocationMarkerData;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.walknavi.model.WalkNaviDisplayOption;
import com.baidu.platform.comapi.basestruct.Point;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;

/* loaded from: classes2.dex */
public class a extends com.baidu.platform.comapi.walknavi.widget.d.c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f10381a = false;
    private Timer A;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10382b;

    /* renamed from: c, reason: collision with root package name */
    private Context f10383c;

    /* renamed from: d, reason: collision with root package name */
    private ViewGroup f10384d;

    /* renamed from: e, reason: collision with root package name */
    private final com.baidu.platform.comapi.walknavi.k.b f10385e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f10386f;

    /* renamed from: g, reason: collision with root package name */
    private View f10387g;

    /* renamed from: h, reason: collision with root package name */
    private RelativeLayout f10388h;

    /* renamed from: i, reason: collision with root package name */
    private CheckBox f10389i;

    /* renamed from: k, reason: collision with root package name */
    private RelativeLayout f10391k;

    /* renamed from: l, reason: collision with root package name */
    private RelativeLayout f10392l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f10393m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f10394n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f10395o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f10396p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f10397q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f10398r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f10399s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f10400t;

    /* renamed from: u, reason: collision with root package name */
    private RelativeLayout f10401u;

    /* renamed from: w, reason: collision with root package name */
    private RelativeLayout f10403w;

    /* renamed from: y, reason: collision with root package name */
    private final com.baidu.platform.comapi.walknavi.k.c f10405y;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10402v = false;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f10404x = false;

    /* renamed from: z, reason: collision with root package name */
    private Handler f10406z = new Handler(Looper.getMainLooper());
    private IMarkerStateListener B = new e();
    private boolean C = false;
    private PositioningModuleAddListener D = new f();

    /* renamed from: j, reason: collision with root package name */
    private boolean f10390j = com.baidu.platform.comapi.walknavi.b.n().x().a("six_dof_ar_auto", false);

    /* renamed from: com.baidu.platform.comapi.walknavi.widget.d.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0133a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.baidu.platform.comapi.h.s.b f10407a;

        ViewOnClickListenerC0133a(com.baidu.platform.comapi.h.s.b bVar) {
            this.f10407a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.baidu.platform.comapi.walknavi.widget.d.b x7 = ((com.baidu.platform.comapi.walknavi.k.b) this.f10407a).x();
            if (x7 != null) {
                a.this.f10391k.setVisibility(8);
                x7.a();
                com.baidu.platform.comapi.h.s.b bVar = this.f10407a;
                if (bVar instanceof com.baidu.platform.comapi.walknavi.k.b) {
                    ((com.baidu.platform.comapi.walknavi.k.b) bVar).f(0);
                }
            }
        }
    }

    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.b(1);
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.baidu.platform.comapi.walknavi.b.n().x().b("six_dof_ar_new_guide", false);
            if (a.this.f10401u != null) {
                a.this.f10401u.setVisibility(8);
            }
            if (a.this.f10402v) {
                return;
            }
            a.this.a(true);
        }
    }

    class e implements IMarkerStateListener {

        /* renamed from: com.baidu.platform.comapi.walknavi.widget.d.a$e$a, reason: collision with other inner class name */
        class RunnableC0134a implements Runnable {
            RunnableC0134a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.baidu.platform.comapi.walknavi.b.n().b("***onResuourceCreated");
                com.baidu.platform.comapi.h.a.a().a(true);
                a.this.k();
                if (a.this.f10402v) {
                    a.this.a(false);
                }
            }
        }

        e() {
        }

        @Override // com.baidu.ar.marker.IMarkerStateListener
        public void compassResult(double d8) {
        }

        @Override // com.baidu.ar.marker.IMarkerStateListener
        public void onCoordinateResult(int i8, double[] dArr) {
        }

        @Override // com.baidu.ar.marker.IMarkerStateListener
        public void onError(int i8, String str) {
        }

        @Override // com.baidu.ar.marker.IMarkerStateListener
        public void onLocationResult(boolean z7, List<LocationMarkerData> list) {
        }

        @Override // com.baidu.ar.marker.IMarkerStateListener
        public void onResuourceCreated() {
            a.this.a(new RunnableC0134a());
        }

        @Override // com.baidu.ar.marker.IMarkerStateListener
        public void onSessionCreated(boolean z7, String str) {
            com.baidu.platform.comapi.walknavi.b.n().b("onCreateSessionEnd：" + z7 + str);
        }
    }

    class f implements PositioningModuleAddListener {
        f() {
        }

        @Override // com.baidu.ar.marker.PositioningModuleAddListener
        public void addPositioningResult(boolean z7) {
            if (z7) {
                com.baidu.platform.comapi.walknavi.b.n().b("run IMU callback!!!" + z7);
                a.this.f10402v = true;
                com.baidu.platform.comapi.h.a.a().b(true);
            }
        }
    }

    class g implements OnReciveShakeListener {
        g() {
        }

        @Override // com.baidu.ar.OnReciveShakeListener
        public void onShake(HashMap<String, Object> hashMap) {
            com.baidu.platform.comapi.h.t.j.b().c();
        }
    }

    class h implements OnSetupComplete {
        h() {
        }

        @Override // com.baidu.ar.OnSetupComplete
        public void onSetup() {
            a.f10381a = true;
            com.baidu.platform.comapi.walknavi.b.n().b("call loadcase!!!");
            if (com.baidu.platform.comapi.h.a.a().b() != null) {
                com.baidu.platform.comapi.h.j.a j8 = com.baidu.platform.comapi.walknavi.b.n().j();
                com.baidu.platform.comapi.h.a.a().b().runWithInitConfiguration(NavigationConfiguration.NPC_IMU, a.this.D, (j8 == null || MapLanguage.ENGLISH != j8.e()) ? "10327252" : "10333459");
                com.baidu.platform.comapi.walknavi.b.n().b("run imu!!!");
            }
        }
    }

    class i implements OnReciveFootBridgeFormLuaListener {

        /* renamed from: com.baidu.platform.comapi.walknavi.widget.d.a$i$a, reason: collision with other inner class name */
        class RunnableC0135a implements Runnable {
            RunnableC0135a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f10385e != null) {
                    a.this.f10385e.c(4, true);
                }
            }
        }

        i() {
        }

        @Override // com.baidu.ar.OnReciveFootBridgeFormLuaListener
        public void onReciveFootBridge(HashMap<String, Object> hashMap) {
            com.baidu.platform.comapi.util.j.a(new RunnableC0135a(), 0L);
        }
    }

    class j implements OnReciveTunnelFormLuaListener {

        /* renamed from: com.baidu.platform.comapi.walknavi.widget.d.a$j$a, reason: collision with other inner class name */
        class RunnableC0136a implements Runnable {
            RunnableC0136a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f10385e != null) {
                    a.this.f10385e.c(5, true);
                }
            }
        }

        j() {
        }

        @Override // com.baidu.ar.OnReciveTunnelFormLuaListener
        public void onReciveTunnel(HashMap<String, Object> hashMap) {
            com.baidu.platform.comapi.util.j.a(new RunnableC0136a(), 0L);
        }
    }

    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.e();
        }
    }

    class l implements OnReciveCrossStreetFormLuaListener {

        /* renamed from: com.baidu.platform.comapi.walknavi.widget.d.a$l$a, reason: collision with other inner class name */
        class RunnableC0137a implements Runnable {
            RunnableC0137a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f10385e != null) {
                    a.this.f10385e.c(3, false);
                    a.this.f10385e.b(true);
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f10385e != null) {
                    a.this.f10385e.E();
                    a.this.f10385e.b(false);
                }
            }
        }

        l() {
        }

        @Override // com.baidu.ar.OnReciveCrossStreetFormLuaListener
        public void onReciveCrossStreetHide(HashMap<String, Object> hashMap) {
            com.baidu.platform.comapi.walknavi.b.n().b("cross streect hide");
            com.baidu.platform.comapi.util.j.a(new b(), 0L);
        }

        @Override // com.baidu.ar.OnReciveCrossStreetFormLuaListener
        public void onReciveCrossStreetShow(HashMap<String, Object> hashMap) {
            com.baidu.platform.comapi.walknavi.b.n().b("cross streect show");
            com.baidu.platform.comapi.util.j.a(new RunnableC0137a(), 0L);
        }
    }

    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f10403w != null) {
                a.this.f10403w.setVisibility(0);
            }
        }
    }

    class n implements CompoundButton.OnCheckedChangeListener {
        n() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            if (z7) {
                com.baidu.platform.comapi.walknavi.b.n().x().b("six_dof_ar_auto", true);
                a.this.f10390j = true;
            } else {
                com.baidu.platform.comapi.walknavi.b.n().x().b("six_dof_ar_auto", false);
                a.this.f10390j = false;
            }
        }
    }

    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f10388h.setVisibility(8);
        }
    }

    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f10388h.setVisibility(0);
        }
    }

    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f10403w != null) {
                a.this.f10403w.setVisibility(0);
            }
        }
    }

    class s implements View.OnTouchListener {
        s() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class t implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.baidu.platform.comapi.h.s.b f10432a;

        t(com.baidu.platform.comapi.h.s.b bVar) {
            this.f10432a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f10432a != null) {
                a.this.f10391k.setVisibility(8);
                this.f10432a.q();
            }
        }
    }

    public a(Context context, ViewGroup viewGroup, com.baidu.platform.comapi.h.s.b bVar, com.baidu.platform.comapi.walknavi.k.c cVar) {
        this.f10382b = false;
        this.f10383c = context;
        this.f10384d = viewGroup;
        this.f10385e = (com.baidu.platform.comapi.walknavi.k.b) bVar;
        this.f10405y = cVar;
        this.f10386f = (ImageView) viewGroup.findViewById(R.id.ar_setting_btn);
        this.f10388h = (RelativeLayout) viewGroup.findViewById(R.id.setting_mask);
        this.f10387g = viewGroup.findViewById(R.id.fake_touch_view);
        this.f10386f.setImageDrawable(com.baidu.platform.comapi.h.t.p.a.a(context, cVar.O0()));
        ((TextView) viewGroup.findViewById(R.id.title)).setText(com.baidu.platform.comapi.h.t.p.a.b(context, cVar.E0()));
        int i8 = R.id.switch_tx1;
        ((TextView) viewGroup.findViewById(i8)).setText(com.baidu.platform.comapi.h.t.p.a.b(context, cVar.N0()));
        TextView textView = (TextView) viewGroup.findViewById(i8);
        MapLanguage x7 = cVar.x();
        MapLanguage mapLanguage = MapLanguage.CHINESE;
        textView.setTextSize(x7 == mapLanguage ? 18.0f : 14.0f);
        int i9 = R.id.switch_tx2;
        ((TextView) viewGroup.findViewById(i9)).setText(com.baidu.platform.comapi.h.t.p.a.b(context, cVar.B0()));
        ((TextView) viewGroup.findViewById(i9)).setTextSize(cVar.x() == mapLanguage ? 15.0f : 12.0f);
        int i10 = R.id.user_guide;
        ((TextView) viewGroup.findViewById(i10)).setText(com.baidu.platform.comapi.h.t.p.a.b(context, cVar.M0()));
        ((TextView) viewGroup.findViewById(R.id.tvArLoading)).setText(com.baidu.platform.comapi.h.t.p.a.b(context, cVar.F0()));
        ((TextView) viewGroup.findViewById(R.id.tvArNavigationNewUpgradeTitle)).setText(com.baidu.platform.comapi.h.t.p.a.b(context, cVar.D0()));
        viewGroup.findViewById(R.id.guide_back).setOnClickListener(new k());
        viewGroup.findViewById(i10).setOnClickListener(new m());
        f();
        CheckBox checkBox = (CheckBox) viewGroup.findViewById(R.id.ar_switch_check);
        this.f10389i = checkBox;
        if (this.f10390j) {
            checkBox.setChecked(true);
        } else {
            checkBox.setChecked(false);
        }
        this.f10389i.setOnCheckedChangeListener(new n());
        viewGroup.findViewById(R.id.setting_panel).setOnClickListener(new o());
        viewGroup.findViewById(R.id.setting_mask_quit).setOnClickListener(new p());
        this.f10386f.setOnClickListener(new q());
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.goto_guide);
        textView2.getPaint().setFlags(8);
        textView2.getPaint().setAntiAlias(true);
        textView2.setOnClickListener(new r());
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(R.id.error_mask);
        this.f10391k = relativeLayout;
        relativeLayout.setOnTouchListener(new s());
        this.f10392l = (RelativeLayout) viewGroup.findViewById(R.id.loading_mask);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.exit_nav);
        this.f10393m = textView3;
        textView3.setOnClickListener(new t(bVar));
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.go_normal_nav);
        this.f10394n = textView4;
        textView4.setOnClickListener(new ViewOnClickListenerC0133a(bVar));
        this.f10395o = (TextView) viewGroup.findViewById(R.id.test);
        this.f10396p = (TextView) viewGroup.findViewById(R.id.test2);
        RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(R.id.ar_guide_mask);
        this.f10401u = relativeLayout2;
        relativeLayout2.setOnTouchListener(new b());
        this.f10397q = (TextView) viewGroup.findViewById(R.id.guide_text1);
        this.f10398r = (TextView) viewGroup.findViewById(R.id.guide_text2);
        this.f10399s = (ImageView) viewGroup.findViewById(R.id.guide_image);
        this.f10400t = (TextView) viewGroup.findViewById(R.id.bottom_btn);
        RelativeLayout relativeLayout3 = (RelativeLayout) viewGroup.findViewById(R.id.six_dof_guide);
        this.f10403w = relativeLayout3;
        a(relativeLayout3);
        String str = Build.BRAND;
        if ("huawei".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) {
            this.f10382b = true;
        }
    }

    private void j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Point c8 = com.baidu.platform.comapi.walknavi.b.n().s().c();
        if (c8 == null || c8.getIntX() == 0 || c8.getIntY() == 0) {
            return;
        }
        float[] fArr = {(float) c8.getDoubleX(), (float) c8.getDoubleY()};
        com.baidu.platform.comapi.walknavi.b.n().b("updateLocation DEFAULT !!!" + ((int) c8.getDoubleX()) + b5.b.VERTICAL + ((int) c8.getDoubleY()));
        com.baidu.platform.comapi.h.a.a().b().updateLocation(fArr, 1, true);
    }

    private void l() {
        Timer timer;
        if (this.f10382b && (timer = this.A) != null) {
            timer.cancel();
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.widget.d.c
    public void a(int i8) {
    }

    @Override // com.baidu.platform.comapi.walknavi.widget.d.c
    public boolean b() {
        return this.f10402v;
    }

    public void c(boolean z7) {
        this.f10390j = z7;
    }

    public void i() {
        this.f10404x = false;
        l();
    }

    private void f() {
        WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
        if (J != null) {
            c(J.isAutoChaneNaviMode());
        }
    }

    private void g() {
        com.baidu.platform.comapi.walknavi.b.n().b("initNavController");
        com.baidu.platform.comapi.h.a.a().a(this.B);
        h();
    }

    private void h() {
        this.f10402v = false;
        f10381a = false;
        if (com.baidu.platform.comapi.h.a.a().b() == null) {
            return;
        }
        com.baidu.platform.comapi.h.a.a().b().setOnReciveShakeListener(new g());
        com.baidu.platform.comapi.h.a.a().b().setOnSetupComplete(new h());
        com.baidu.platform.comapi.h.a.a().b().setOnReciveFootBridgeFormLuaListener(new i());
        com.baidu.platform.comapi.h.a.a().b().setOnReciveTunnelFormLuaListener(new j());
        com.baidu.platform.comapi.h.a.a().b().setOnReciveCrossStreetFormLuaListener(new l());
    }

    @Override // com.baidu.platform.comapi.walknavi.widget.d.c
    public boolean a() {
        return this.f10390j;
    }

    @Override // com.baidu.platform.comapi.walknavi.widget.d.c
    public void d() {
        if (com.baidu.platform.comapi.h.c.b().d()) {
            ImageView imageView = this.f10386f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            j();
            return;
        }
        if (com.baidu.platform.comapi.h.c.b().h()) {
            this.f10404x = false;
            a(false);
            ImageView imageView2 = this.f10386f;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.f10388h;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            com.baidu.platform.comapi.walknavi.k.b bVar = this.f10385e;
            if (bVar != null) {
                bVar.E();
                this.f10385e.b(false);
            }
            i();
        }
    }

    public void e() {
        RelativeLayout relativeLayout = this.f10403w;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.widget.d.c
    public boolean c() {
        RelativeLayout relativeLayout = this.f10403w;
        return relativeLayout == null || relativeLayout.getVisibility() == 8 || this.f10403w.getVisibility() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i8) {
        if (i8 != 0) {
            if (i8 == 1) {
                TextView textView = this.f10397q;
                if (textView != null) {
                    textView.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10383c, this.f10405y.L0()));
                }
                TextView textView2 = this.f10398r;
                if (textView2 != null) {
                    textView2.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10383c, this.f10405y.Q0()));
                }
                TextView textView3 = this.f10400t;
                if (textView3 != null) {
                    textView3.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10383c, this.f10405y.u()));
                    this.f10400t.setOnClickListener(new d());
                }
                ImageView imageView = this.f10399s;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.wsdk_horizontal);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView4 = this.f10397q;
        if (textView4 != null) {
            textView4.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10383c, this.f10405y.C0()));
        }
        TextView textView5 = this.f10398r;
        if (textView5 != null) {
            textView5.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10383c, this.f10405y.l0()));
        }
        TextView textView6 = this.f10400t;
        if (textView6 != null) {
            textView6.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10383c, this.f10405y.F()));
            this.f10400t.setOnClickListener(new c());
        }
        ImageView imageView2 = this.f10399s;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.wsdk_vertical);
        }
        RelativeLayout relativeLayout = this.f10401u;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.widget.d.c
    public void a(boolean z7) {
        RelativeLayout relativeLayout = this.f10392l;
        if (relativeLayout == null) {
            return;
        }
        if (z7) {
            relativeLayout.setVisibility(0);
        } else {
            relativeLayout.setVisibility(8);
        }
    }

    private void a(View view) {
        ((TextView) view.findViewById(R.id.tvArIntroductionToUsingArPedestrianNavigation)).setText(this.f10405y.A0());
        ((TextView) view.findViewById(R.id.tvWhatIsArPedestrianNavigation)).setText(this.f10405y.S0());
        ((TextView) view.findViewById(R.id.tvArPedestrianNavigation)).setText(this.f10405y.K0());
        ((TextView) view.findViewById(R.id.tvFunctionsOfAr)).setText(this.f10405y.R0());
        ((TextView) view.findViewById(R.id.tvFunctionsOfAr1)).setText(this.f10405y.r0());
        ((TextView) view.findViewById(R.id.tvFunctionsOfAr1Content)).setText(this.f10405y.m0());
        ((TextView) view.findViewById(R.id.tvFunctionsOfAr2)).setText(this.f10405y.s0());
        ((TextView) view.findViewById(R.id.tvFunctionsOfAr2Content)).setText(this.f10405y.n0());
        ((TextView) view.findViewById(R.id.tvFunctionsOfAr3)).setText(this.f10405y.t0());
        ((TextView) view.findViewById(R.id.tvFunctionsOfAr3Content1)).setText(this.f10405y.o0());
        ((TextView) view.findViewById(R.id.tvFunctionsOfAr3Content2)).setText(this.f10405y.p0());
        ((TextView) view.findViewById(R.id.tvFunctionsOfAr3Content3)).setText(this.f10405y.q0());
        ((TextView) view.findViewById(R.id.tvCommonProblem)).setText(this.f10405y.d0());
        ((TextView) view.findViewById(R.id.tvCommonProblem1)).setText(this.f10405y.e0());
        ((TextView) view.findViewById(R.id.tvCommonProblem1Content)).setText(this.f10405y.f0());
        ((TextView) view.findViewById(R.id.tvCommonProblem2)).setText(this.f10405y.g0());
        ((TextView) view.findViewById(R.id.tvCommonProblem2Content)).setText(this.f10405y.h0());
        ((TextView) view.findViewById(R.id.tvCommonProblem3)).setText(this.f10405y.i0());
        ((TextView) view.findViewById(R.id.tvCommonProblem3Content)).setText(this.f10405y.j0());
        ((TextView) view.findViewById(R.id.tvAndroidSo)).setText(this.f10405y.d());
        ((TextView) view.findViewById(R.id.tvSystemVersion)).setText(this.f10405y.P());
        ((TextView) view.findViewById(R.id.tvSystemVersionAndroid)).setText(this.f10405y.Q());
        ((TextView) view.findViewById(R.id.tvSystemVersionIos)).setText(this.f10405y.R());
        ((TextView) view.findViewById(R.id.tvEquipmentRequirements)).setText(this.f10405y.r());
        ((TextView) view.findViewById(R.id.tvEquipmentRequirementsAndroid)).setText(this.f10405y.s());
        ((TextView) view.findViewById(R.id.tvEquipmentRequirementsIos)).setText(this.f10405y.t());
        ((TextView) view.findViewById(R.id.tvApplicationVersion)).setText(this.f10405y.e());
        ((TextView) view.findViewById(R.id.tvApplicationVersionAndroid)).setText(this.f10405y.f());
        ((TextView) view.findViewById(R.id.tvApplicationVersionIos)).setText(this.f10405y.g());
        ((ImageView) view.findViewById(R.id.ivGuide1)).setBackgroundResource(this.f10405y.u0());
        ((ImageView) view.findViewById(R.id.ivGuide2)).setBackgroundResource(this.f10405y.v0());
        ((ImageView) view.findViewById(R.id.ivGuide3)).setBackgroundResource(this.f10405y.w0());
        ((ImageView) view.findViewById(R.id.ivGuide4)).setBackgroundResource(this.f10405y.x0());
        ((ImageView) view.findViewById(R.id.ivGuide5)).setBackgroundResource(this.f10405y.y0());
        ((ImageView) view.findViewById(R.id.ivGuide6)).setBackgroundResource(this.f10405y.z0());
    }

    @Override // com.baidu.platform.comapi.walknavi.widget.d.c
    public void b(boolean z7) {
        if (z7) {
            if (com.baidu.platform.comapi.walknavi.b.n().x().a("six_dof_ar_new_guide", true)) {
                b(0);
                g();
                return;
            } else {
                g();
                a(true);
                return;
            }
        }
        if (com.baidu.platform.comapi.walknavi.b.n().x().a("six_dof_ar_new_guide", true)) {
            b(0);
        }
        if (!this.f10402v) {
            g();
        }
        a(true);
        this.C = com.baidu.platform.comapi.h.a.a().h();
        com.baidu.platform.comapi.walknavi.b.n().b("ArEngine resume:" + this.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        runnable.run();
    }
}
