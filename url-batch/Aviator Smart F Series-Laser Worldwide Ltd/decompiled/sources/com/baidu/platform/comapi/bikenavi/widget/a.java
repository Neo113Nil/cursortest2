package com.baidu.platform.comapi.bikenavi.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import cn.hutool.core.text.l;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.bikenavi.controllers.BNavigatorWrapper;
import com.baidu.mapapi.bikenavi.model.BikeNaviDisplayOption;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.platform.comapi.bikenavi.widget.CustomScrollView;
import com.baidu.platform.comapi.h.t.h;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class a extends com.baidu.platform.comapi.walknavi.k.f.b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    private static int f8812b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f8813c = 135;

    /* renamed from: d, reason: collision with root package name */
    private static int f8814d = 90;
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private TextView G;
    private TextView H;
    private TextView I;
    private int J;
    private final com.baidu.platform.comapi.b.c.c R;

    /* renamed from: e, reason: collision with root package name */
    private Activity f8815e;

    /* renamed from: i, reason: collision with root package name */
    private int f8819i;

    /* renamed from: k, reason: collision with root package name */
    private com.baidu.platform.comapi.b.c.b f8821k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f8822l;

    /* renamed from: m, reason: collision with root package name */
    private ImageView f8823m;

    /* renamed from: n, reason: collision with root package name */
    private RelativeLayout f8824n;

    /* renamed from: o, reason: collision with root package name */
    private RelativeLayout f8825o;

    /* renamed from: p, reason: collision with root package name */
    private RelativeLayout f8826p;

    /* renamed from: q, reason: collision with root package name */
    private CustomScrollView f8827q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f8828r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f8829s;

    /* renamed from: t, reason: collision with root package name */
    private LinearLayout f8830t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f8831u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f8832v;

    /* renamed from: w, reason: collision with root package name */
    private View f8833w;

    /* renamed from: x, reason: collision with root package name */
    private View f8834x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f8835y;

    /* renamed from: z, reason: collision with root package name */
    private ImageView f8836z;

    /* renamed from: f, reason: collision with root package name */
    private final int f8816f = 1;

    /* renamed from: g, reason: collision with root package name */
    private final int f8817g = 2;

    /* renamed from: h, reason: collision with root package name */
    private final int f8818h = 3;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8820j = false;
    private int K = 0;
    private boolean L = true;
    private com.baidu.mapapi.bikenavi.model.b M = null;
    private boolean N = false;
    private com.baidu.mapapi.bikenavi.model.a O = null;
    private boolean P = false;
    private boolean Q = true;

    /* renamed from: com.baidu.platform.comapi.bikenavi.widget.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0100a implements View.OnClickListener {
        ViewOnClickListenerC0100a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!com.baidu.platform.comapi.walknavi.b.n().o()) {
                a.this.f8821k.a(false, a.this.R.j());
            } else {
                if (a.this.f8821k == null || a.this.f8821k.x() == null) {
                    return;
                }
                a.this.f8821k.x().a();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.J = h.e(aVar.f8815e) - h.a(a.this.f8815e, a.f8813c + a.f8812b);
            a.this.f8827q.setBlankHeight(a.this.J);
            a.this.f8827q.setStatusHeight(a.this.J + h.a(a.this.f8815e, (a.f8813c + a.f8812b) - a.f8814d), 0);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f8827q.getStatus() == com.baidu.platform.comapi.h.s.c.BOTTOM) {
                a.this.b(true);
            } else if (a.this.f8827q.getStatus() == com.baidu.platform.comapi.h.s.c.TOP) {
                a.this.a(true);
            }
        }
    }

    class d implements CustomScrollView.c {
        d() {
        }

        @Override // com.baidu.platform.comapi.bikenavi.widget.CustomScrollView.c
        public void a(int i8) {
        }

        @Override // com.baidu.platform.comapi.bikenavi.widget.CustomScrollView.c
        public void a(com.baidu.platform.comapi.h.s.c cVar, com.baidu.platform.comapi.h.s.c cVar2) {
            if (cVar == cVar2) {
                return;
            }
            int i8 = e.f8841a[cVar2.ordinal()];
            if (i8 == 1) {
                a.this.f8835y.setVisibility(8);
                a.this.f8836z.setVisibility(0);
                a.this.d(true);
            } else {
                if (i8 != 2) {
                    return;
                }
                a.this.f8835y.setVisibility(0);
                a.this.f8836z.setVisibility(8);
                a.this.d(false);
            }
        }
    }

    static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8841a;

        static {
            int[] iArr = new int[com.baidu.platform.comapi.h.s.c.values().length];
            f8841a = iArr;
            try {
                iArr[com.baidu.platform.comapi.h.s.c.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8841a[com.baidu.platform.comapi.h.s.c.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != a.this.f8831u) {
                return;
            }
            if (a.this.f8820j) {
                if (a.this.f8831u != null) {
                    a.this.f8831u.setText(com.baidu.platform.comapi.h.t.p.a.b(a.this.f8815e, a.this.R.k()));
                }
                a.this.f8820j = !r8.f8820j;
                com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.overview");
                com.baidu.platform.comapi.walknavi.b.n().l().run("[查看全览]按钮点击");
                a.this.f8832v.setVisibility(8);
                a.this.f8821k.D();
                a.this.j();
                a.this.f8821k.a(a.this.f8815e, com.baidu.platform.comapi.walknavi.b.n().t().e(), 10, 0, 0, a.f8813c + a.f8812b + 10);
            } else {
                if (a.this.f8831u != null) {
                    a.this.f8831u.setText(com.baidu.platform.comapi.h.t.p.a.b(a.this.f8815e, a.this.R.V()));
                }
                a.this.f8820j = !r8.f8820j;
                com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.continue");
                com.baidu.platform.comapi.walknavi.b.n().l().run("[3D车头向上]按钮点击");
                a.this.f8832v.setVisibility(0);
                com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE);
                com.baidu.platform.comapi.walknavi.b.n().s().x();
                a.this.h();
                a.this.f8821k.a(a.this.f8815e, com.baidu.platform.comapi.walknavi.b.n().t().e(), 70, 0, 0, a.f8812b + 60);
            }
            if (com.baidu.platform.comapi.walknavi.b.n().t().e() != null) {
                com.baidu.platform.comapi.walknavi.b.n().t().e().requestLayout();
            }
        }
    }

    class g extends AsyncTask<Integer, Integer, String> {

        /* renamed from: a, reason: collision with root package name */
        private ScrollView f8843a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8844b;

        /* renamed from: c, reason: collision with root package name */
        private int f8845c = 15;

        public g(ScrollView scrollView, boolean z7) {
            this.f8843a = scrollView;
            this.f8844b = z7;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Integer... numArr) {
            try {
                int i8 = 153;
                if (this.f8844b) {
                    int i9 = 0;
                    while (i9 < 153) {
                        i9 += this.f8845c;
                        publishProgress(Integer.valueOf(i9));
                        Thread.sleep(10L);
                    }
                    return null;
                }
                while (i8 > 0) {
                    i8 -= this.f8845c;
                    if (i8 < 0) {
                        i8 = 0;
                    }
                    publishProgress(Integer.valueOf(i8));
                    Thread.sleep(10L);
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            try {
                int intValue = numArr[0].intValue();
                String hexString = Integer.toHexString(intValue);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                String str = "#" + hexString + "000000";
                com.baidu.platform.comapi.h.g.a.c("yang12", "onProgressUpdate:" + str + "alpha:" + intValue);
                this.f8843a.setBackgroundColor(Color.parseColor(str));
                a.this.K = intValue;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public a(Context context, com.baidu.platform.comapi.b.c.b bVar, View view, com.baidu.platform.comapi.b.c.c cVar) {
        this.f8815e = (Activity) context;
        this.f8821k = bVar;
        this.R = cVar;
        f(view);
    }

    public void a(com.baidu.mapapi.bikenavi.model.a aVar) {
        this.O = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.bikenavi_btn_location) {
            if (!this.f8820j) {
                com.baidu.platform.comapi.h.q.a.a().a("status", "overview");
            }
            com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.turnDire");
            int i8 = this.f8819i;
            if (i8 == 1) {
                com.baidu.platform.comapi.walknavi.b.n().l().run("[3D车头向上]按钮点击");
            } else if (i8 == 2) {
                com.baidu.platform.comapi.walknavi.b.n().l().run("[2D正北]按钮点击");
            } else {
                if (i8 != 3) {
                    return;
                }
                com.baidu.platform.comapi.walknavi.b.n().l().run("[回车位]按钮点击");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f8827q.setVisibility(8);
        BNavigatorWrapper.getWNavigator();
        BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
        if (e8 == null || e8.getShowSpeedLayout()) {
            this.f8830t.setVisibility(0);
        } else {
            this.f8830t.setVisibility(8);
        }
    }

    private void i() {
        BNavigatorWrapper.getWNavigator();
        BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
        if (e8 == null || e8.getBikeNaviTypeface() == null) {
            return;
        }
        TextView textView = this.f8828r;
        if (textView != null) {
            textView.setTypeface(e8.getBikeNaviTypeface());
        }
        TextView textView2 = this.f8829s;
        if (textView2 != null) {
            textView2.setTypeface(e8.getBikeNaviTypeface());
        }
        TextView textView3 = this.f8831u;
        if (textView3 != null) {
            textView3.setTypeface(e8.getBikeNaviTypeface());
        }
        TextView textView4 = this.f8832v;
        if (textView4 != null) {
            textView4.setTypeface(e8.getBikeNaviTypeface());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f8827q.setBackgroundColor(Color.parseColor("#00000000"));
        this.K = 0;
        a(false);
        this.f8827q.setVisibility(0);
        this.f8830t.setVisibility(8);
    }

    public void a(com.baidu.mapapi.bikenavi.model.b bVar) {
        this.M = bVar;
    }

    private void c(View view) {
        this.f8827q = (CustomScrollView) view.findViewById(R.id.vw_scroll);
        view.post(new b());
        View a8 = com.baidu.platform.comapi.h.t.p.a.a(this.f8815e, R.layout.wsdk_layout_bikenavi_drawer, null);
        this.f8834x = a8;
        this.f8827q.addContentView(a8);
        this.f8827q.updateStatus(com.baidu.platform.comapi.h.s.c.BOTTOM, false);
        this.f8835y = (ImageView) this.f8834x.findViewById(R.id.icon_arrow_up);
        this.f8836z = (ImageView) this.f8834x.findViewById(R.id.icon_arrow_down);
        this.A = (TextView) this.f8834x.findViewById(R.id.drawer_curspeed);
        this.B = (TextView) this.f8834x.findViewById(R.id.drawer_avgspeed);
        this.C = (TextView) this.f8834x.findViewById(R.id.drawer_maxspeed);
        this.D = (TextView) this.f8834x.findViewById(R.id.drawer_remain_dist);
        this.E = (TextView) this.f8834x.findViewById(R.id.drawer_remain_time);
        this.F = (TextView) this.f8834x.findViewById(R.id.drawer_calorie);
        this.G = (TextView) this.f8834x.findViewById(R.id.drawer_altiDiff);
        this.H = (TextView) this.f8834x.findViewById(R.id.drawer_altitude);
        this.I = (TextView) this.f8834x.findViewById(R.id.drawer_progress_info_tv);
        this.f8833w = this.f8834x.findViewById(R.id.drawer_header);
        a(i.DOUBLE_EPSILON, 0L);
        ((TextView) this.f8834x.findViewById(R.id.tvRemainingDistance)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.J()));
        ((TextView) this.f8834x.findViewById(R.id.tvRemainingTime)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.L()));
        ((TextView) this.f8834x.findViewById(R.id.tvCurrentSpeed)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.m()));
        ((TextView) this.f8834x.findViewById(R.id.tvAverageVelocity)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.h()));
        ((TextView) this.f8834x.findViewById(R.id.tvTopSpeed)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.T()));
        ((TextView) this.f8834x.findViewById(R.id.tvAccumulatedClimb)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.a()));
        ((TextView) this.f8834x.findViewById(R.id.tvCurrentAltitude)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.l()));
        this.f8833w.setOnClickListener(new c());
        this.f8827q.setOnScrollChangeListener(new d());
    }

    private void d(View view) {
        if (view != null) {
            this.f8830t = (LinearLayout) view.findViewById(R.id.speed_layout);
            BNavigatorWrapper.getWNavigator();
            BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
            if (e8 != null && !e8.getShowSpeedLayout()) {
                this.f8830t.setVisibility(8);
            }
            if (e8 != null && e8.isUseCustomSpeedLayout()) {
                if (b(e8)) {
                    return;
                }
                this.f8828r = (TextView) view.findViewById(R.id.speed_tv);
                this.f8829s = (TextView) view.findViewById(R.id.tv_speed_unit);
                return;
            }
            this.f8828r = (TextView) view.findViewById(R.id.speed_tv);
            this.f8829s = (TextView) view.findViewById(R.id.tv_speed_unit);
        }
    }

    private void e(View view) {
        this.f8825o = (RelativeLayout) view.findViewById(R.id.sync_view);
        BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
        if (e8 == null || e8.getCustomBottomView() == null) {
            return;
        }
        this.f8825o.addView(e8.getCustomBottomView());
        f8812b = e8.getBottomViewHeight();
        this.f8825o.setVisibility(0);
    }

    private void f(View view) {
        this.f8822l = (ImageView) view.findViewById(R.id.bikenavi_btn_location);
        BNavigatorWrapper.getWNavigator();
        BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
        if (e8 != null && !e8.getShowImageToLocation()) {
            this.f8822l.setVisibility(8);
        }
        d(view);
        a(view);
        c(view);
        this.f8822l.setOnClickListener(this);
        this.f8831u.setOnClickListener(new f());
        this.f8823m.setOnClickListener(new ViewOnClickListenerC0100a());
        i();
    }

    private void b(View view) {
        if (view != null) {
            this.f8823m = (ImageView) view.findViewById(R.id.bikenavi_btn_back);
            TextView textView = (TextView) view.findViewById(R.id.bikenavi_btn_lookover);
            this.f8831u = textView;
            textView.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.V()));
            this.f8832v = (TextView) view.findViewById(R.id.bikenavi_overview_remain_info_tv);
        }
    }

    private void a(View view) {
        if (view != null) {
            e(view);
            this.f8824n = (RelativeLayout) view.findViewById(R.id.bikenav_bottom_bar_layout);
            BNavigatorWrapper.getWNavigator();
            BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
            if (e8 != null && e8.isUseCustomBottomSetting()) {
                if (a(e8)) {
                    return;
                }
                b(view);
                return;
            }
            b(view);
            if (e8 == null || e8.getIsShowBottomGuideLayout()) {
                this.Q = true;
            } else {
                this.f8824n.setVisibility(8);
                this.Q = false;
            }
        }
    }

    private boolean b(BikeNaviDisplayOption bikeNaviDisplayOption) {
        if (bikeNaviDisplayOption == null) {
            Log.e("CustomWNaviView", "Load BikeSpeed layout failed,BikeNaviDisplayOption is null.");
            return false;
        }
        int speedLayout = bikeNaviDisplayOption.getSpeedLayout();
        if (speedLayout == 0) {
            Log.e("CustomWNaviView", "BikeSpeed layout resource is empty.");
            return false;
        }
        if (this.f8830t == null) {
            Log.e("CustomWNaviView", "BikeSpeed layout add failed.");
            return false;
        }
        View inflate = LayoutInflater.from(this.f8815e).inflate(speedLayout, (ViewGroup) this.f8830t, false);
        if (inflate == null) {
            Log.e("CustomWNaviView", "Load BikeSpeed layout failed,please checking layout.");
            return false;
        }
        if (!com.baidu.platform.comapi.walknavi.k.g.b.a().a(this.f8815e, 5, speedLayout, this)) {
            Log.e("CustomWNaviView", "Parser BikeSpeed layout failed,please checking layout.");
            return false;
        }
        com.baidu.mapapi.bikenavi.model.b bVar = this.M;
        if (bVar == null) {
            Log.e("CustomWNaviView", "Parser BikeSpeed layout failed,missing other keywords like TAG attribute or ID attribute.");
            return false;
        }
        if (!TextUtils.isEmpty(bVar.a()) && !TextUtils.isEmpty(this.M.b())) {
            try {
                this.f8828r = (TextView) inflate.findViewById(Integer.parseInt(this.M.a().replace("@", "")));
                TextView textView = (TextView) inflate.findViewById(Integer.parseInt(this.M.b().replace("@", "")));
                this.f8829s = textView;
                if (this.f8828r != null && textView != null) {
                    this.f8830t.removeAllViews();
                    this.f8830t.addView(inflate);
                    this.N = true;
                    this.f8830t.setBackgroundColor(0);
                    return true;
                }
                Log.e("CustomWNaviView", "BikeSpeed layout control initialize failed,Missing other keywords like TAG attribute or ID attribute.");
                return false;
            } catch (Exception e8) {
                e8.printStackTrace();
                Log.e("CustomWNaviView", "BikeSpeed layout control type error.");
                return false;
            }
        }
        Log.e("CustomWNaviView", "BikeSpeed layout missing other keywords like TAG attribute or ID attribute.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z7) {
        if (z7) {
            new g(this.f8827q, true).execute(new Integer[0]);
        } else if (this.K != 0) {
            new g(this.f8827q, false).execute(new Integer[0]);
        }
    }

    private boolean a(BikeNaviDisplayOption bikeNaviDisplayOption) {
        if (bikeNaviDisplayOption == null) {
            Log.e("CustomWNaviView", "Load BottomSetting layout failed,BikeNaviDisplayOption is null.");
            return false;
        }
        int bottomSettingLayout = bikeNaviDisplayOption.getBottomSettingLayout();
        if (bottomSettingLayout == 0) {
            Log.e("CustomWNaviView", "BottomSetting layout resource is empty.");
            return false;
        }
        if (this.f8824n == null) {
            Log.e("CustomWNaviView", "BottomSetting layout add failed.");
            return false;
        }
        View inflate = LayoutInflater.from(this.f8815e).inflate(bottomSettingLayout, (ViewGroup) this.f8824n, false);
        if (inflate == null) {
            Log.e("CustomWNaviView", "Load BottomSetting layout failed,please checking layout.");
            return false;
        }
        if (!com.baidu.platform.comapi.walknavi.k.g.b.a().a(this.f8815e, 6, bottomSettingLayout, this)) {
            Log.e("CustomWNaviView", "Parser BottomSetting layout failed,please checking layout.");
            return false;
        }
        com.baidu.mapapi.bikenavi.model.a aVar = this.O;
        if (aVar == null) {
            Log.e("CustomWNaviView", "Parser BottomSetting layout failed,missing other keywords like TAG attribute or ID attribute.");
            return false;
        }
        if (!TextUtils.isEmpty(aVar.c()) && !TextUtils.isEmpty(this.O.b()) && !TextUtils.isEmpty(this.O.a())) {
            try {
                this.f8823m = (ImageView) inflate.findViewById(Integer.parseInt(this.O.c().replace("@", "")));
                this.f8831u = (TextView) inflate.findViewById(Integer.parseInt(this.O.b().replace("@", "")));
                TextView textView = (TextView) inflate.findViewById(Integer.parseInt(this.O.a().replace("@", "")));
                this.f8832v = textView;
                if (this.f8823m != null && this.f8831u != null && textView != null) {
                    this.f8824n.removeAllViews();
                    this.f8824n.addView(inflate);
                    this.P = true;
                    this.f8824n.setBackgroundColor(0);
                    return true;
                }
                Log.e("CustomWNaviView", "BottomSetting layout control initialize failed,Missing other keywords like TAG attribute or ID attribute.");
                return false;
            } catch (Exception e8) {
                e8.printStackTrace();
                Log.e("CustomWNaviView", "BottomSetting layout control type error.");
                return false;
            }
        }
        Log.e("CustomWNaviView", "BottomSetting layout missing other keywords like TAG attribute or ID attribute.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z7) {
        this.f8827q.updateStatus(com.baidu.platform.comapi.h.s.c.TOP, z7);
        this.f8835y.setVisibility(8);
        this.f8836z.setVisibility(0);
        com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.bigDrawer");
    }

    @Override // com.baidu.platform.comapi.walknavi.k.f.b
    protected void c() {
        super.c();
        if (this.Q) {
            Animation c8 = com.baidu.platform.comapi.h.t.p.a.c(this.f8815e, R.anim.wsdk_anim_rg_down_in);
            if (!this.f8824n.isShown()) {
                this.f8824n.setAnimation(c8);
            }
            this.f8824n.setVisibility(0);
            RelativeLayout relativeLayout = this.f8826p;
            if (relativeLayout != null) {
                if (!relativeLayout.isShown()) {
                    this.f8826p.setAnimation(c8);
                }
                this.f8826p.setVisibility(0);
            }
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.k.f.b
    protected void b() {
        super.b();
        Animation c8 = com.baidu.platform.comapi.h.t.p.a.c(this.f8815e, R.anim.wsdk_anim_rg_down_out);
        if (this.f8824n.isShown()) {
            this.f8824n.setAnimation(c8);
        }
        this.f8824n.setVisibility(8);
        RelativeLayout relativeLayout = this.f8826p;
        if (relativeLayout != null) {
            if (relativeLayout.isShown()) {
                this.f8826p.setAnimation(c8);
            }
            this.f8826p.setVisibility(8);
        }
    }

    public void a(double d8, double d9, double d10) {
        this.f8828r.setText(((int) d8) + "");
        this.A.setText(d8 + "");
        this.C.setText(d10 + "");
        this.B.setText(d9 + "");
    }

    public void c(boolean z7) {
        this.f8820j = z7;
        if (z7) {
            TextView textView = this.f8831u;
            if (textView != null) {
                textView.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.V()));
            }
            this.f8832v.setVisibility(0);
            return;
        }
        TextView textView2 = this.f8831u;
        if (textView2 != null) {
            textView2.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.k()));
        }
        this.f8832v.setVisibility(8);
    }

    public void a(double d8, long j8) {
        StringBuffer stringBuffer = new StringBuffer();
        MapLanguage x7 = this.R.x();
        com.baidu.platform.comapi.h.t.g.a((int) d8, x7, stringBuffer);
        StringBuilder sb = new StringBuilder();
        sb.append(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.b0()) + ((Object) stringBuffer) + l.SPACE);
        sb.append(com.baidu.platform.comapi.h.t.g.a((int) j8, x7));
        this.I.setText(sb.toString());
    }

    public void a(float f8, float f9, float f10) {
        this.F.setText(f8 + "");
        this.G.setText(f9 + "");
        this.H.setText(f10 + "");
    }

    public void a(String str, String str2) {
        this.D.setText(str);
        this.E.setText(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(com.baidu.platform.comapi.h.t.p.a.b(this.f8815e, this.R.K()) + ": ");
        sb.append(str + l.SPACE);
        sb.append(str2);
        this.f8832v.setText(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z7) {
        this.f8827q.updateStatus(com.baidu.platform.comapi.h.s.c.BOTTOM, z7);
        this.f8835y.setVisibility(0);
        this.f8836z.setVisibility(8);
        com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.smallDrawer");
    }

    public void a(int i8) {
        if (i8 == R.drawable.wsdk_drawable_rg_ic_walk_bike3d_new) {
            this.f8822l.setImageDrawable(this.f8815e.getResources().getDrawable(this.R.X()));
            this.f8819i = 2;
        } else {
            if (i8 == R.drawable.wsdk_drawable_rg_ic_north_walk_bike2d) {
                this.f8822l.setImageDrawable(this.f8815e.getResources().getDrawable(this.R.W()));
                this.f8819i = 1;
                return;
            }
            int i9 = R.drawable.wsdk_drawable_rg_ic_locate_walk_bike_point;
            if (i8 == i9) {
                this.f8822l.setImageDrawable(this.f8815e.getResources().getDrawable(i9));
                this.f8819i = 3;
            }
        }
    }
}
