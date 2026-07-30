package com.baidu.platform.comapi.walknavi.widget.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.walknavi.model.WalkNaviDisplayOption;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f10434a;
    private TextView A;
    private ImageView B;
    n E;

    /* renamed from: b, reason: collision with root package name */
    private Context f10435b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.k.b f10436c;

    /* renamed from: d, reason: collision with root package name */
    private ViewGroup f10437d;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f10439f;

    /* renamed from: g, reason: collision with root package name */
    private View f10440g;

    /* renamed from: h, reason: collision with root package name */
    private View f10441h;

    /* renamed from: i, reason: collision with root package name */
    private RelativeLayout f10442i;

    /* renamed from: j, reason: collision with root package name */
    private LinearLayout f10443j;

    /* renamed from: k, reason: collision with root package name */
    private View f10444k;

    /* renamed from: l, reason: collision with root package name */
    private View f10445l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f10446m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f10447n;

    /* renamed from: o, reason: collision with root package name */
    private LinearLayout f10448o;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f10449p;

    /* renamed from: s, reason: collision with root package name */
    private TextView f10452s;

    /* renamed from: t, reason: collision with root package name */
    private final com.baidu.platform.comapi.walknavi.k.c f10453t;

    /* renamed from: u, reason: collision with root package name */
    private LinearLayout f10454u;

    /* renamed from: v, reason: collision with root package name */
    private RelativeLayout f10455v;

    /* renamed from: w, reason: collision with root package name */
    private RelativeLayout f10456w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f10457x;

    /* renamed from: y, reason: collision with root package name */
    private RelativeLayout f10458y;

    /* renamed from: z, reason: collision with root package name */
    private ImageView f10459z;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10438e = true;

    /* renamed from: q, reason: collision with root package name */
    private View f10450q = null;

    /* renamed from: r, reason: collision with root package name */
    private View f10451r = null;
    private int C = -1;
    private int D = 0;
    private int F = 0;

    class a implements View.OnClickListener {

        /* renamed from: com.baidu.platform.comapi.walknavi.widget.d.b$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0138a implements View.OnClickListener {
            ViewOnClickListenerC0138a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b.this.f();
            }
        }

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f10455v != null) {
                if (b.this.f10455v.getParent() != null) {
                    b.this.f10437d.removeView(b.this.f10455v);
                }
                b.this.f10437d.addView(b.this.f10455v);
                return;
            }
            b bVar = b.this;
            bVar.f10455v = (RelativeLayout) LayoutInflater.from(bVar.f10435b).inflate(R.layout.wsdk_layout_indoor_poi_panel, (ViewGroup) null);
            b.this.f10455v.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            b.this.f10437d.addView(b.this.f10455v);
            b.this.f10455v.setOnClickListener(new ViewOnClickListenerC0138a());
            RelativeLayout relativeLayout = (RelativeLayout) b.this.f10455v.findViewById(R.id.ar_indoor_poi_skin_switch_panel);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.baidu.platform.comapi.h.t.h.a(b.this.f10435b, 270));
            layoutParams.setMargins(com.baidu.platform.comapi.h.t.h.a(b.this.f10435b, 7), 0, com.baidu.platform.comapi.h.t.h.a(b.this.f10435b, 7), ((int) (com.baidu.platform.comapi.h.t.h.b(b.this.f10435b) * 0.5d)) - ((int) (com.baidu.platform.comapi.h.t.h.a(b.this.f10435b, 270) * 0.5d)));
            layoutParams.addRule(12);
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.baidu.platform.comapi.walknavi.widget.d.b$b, reason: collision with other inner class name */
    class AnimationAnimationListenerC0139b implements Animation.AnimationListener {
        AnimationAnimationListenerC0139b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            b.this.f10441h.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            b.this.f10445l.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class d implements Animation.AnimationListener {
        d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            b.this.f10440g.setVisibility(8);
            n nVar = b.this.E;
            if (nVar != null) {
                nVar.a();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            b.this.f10444k.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f10436c != null) {
                b.this.f10436c.q();
            }
        }
    }

    class g implements View.OnTouchListener {
        g() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                b.this.c();
            }
            return true;
        }
    }

    class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                b.this.b();
            }
            return true;
        }
    }

    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f10436c != null) {
                b.this.f10436c.q();
            }
        }
    }

    class j implements View.OnTouchListener {
        j() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f10436c != null) {
                b.this.f10456w.clearAnimation();
                b.this.f10456w.setVisibility(8);
            }
        }
    }

    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f10456w.clearAnimation();
            b.this.f10456w.setVisibility(8);
            try {
                JSONObject jSONObject = new JSONObject();
                if (b.this.C == 0) {
                    jSONObject.put("status", "routeLoading");
                } else if (b.this.C == 1) {
                    jSONObject.put("status", "routeSuc");
                } else if (b.this.C == 2) {
                    jSONObject.put("status", "routeFail");
                } else if (b.this.C == 4) {
                    jSONObject.put("status", "poiLoading");
                }
            } catch (Exception unused) {
            }
        }
    }

    class m implements Animation.AnimationListener {
        m() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            b.this.f10455v.setVisibility(8);
            b.this.f10437d.removeView(b.this.f10455v);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public interface n {
        void a();

        void b();
    }

    private class o extends com.baidu.platform.comapi.h.t.m {
        private o() {
        }

        @Override // com.baidu.platform.comapi.h.t.m
        public void a(View view) {
            b.this.a();
            if (b.this.f10436c instanceof com.baidu.platform.comapi.walknavi.k.b) {
                b.this.f10436c.f(0);
            }
        }

        /* synthetic */ o(b bVar, a aVar) {
            this();
        }
    }

    public b(Context context, ViewGroup viewGroup, com.baidu.platform.comapi.walknavi.k.b bVar, com.baidu.platform.comapi.walknavi.k.c cVar) {
        this.f10435b = context;
        this.f10437d = viewGroup;
        this.f10436c = bVar;
        this.f10453t = cVar;
        i();
        g();
        f10434a = 0;
    }

    public RelativeLayout a(n nVar) {
        this.E = nVar;
        return this.f10439f;
    }

    public TextView d() {
        return this.f10447n;
    }

    public TextView e() {
        return this.f10446m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        f10434a++;
        a(false);
        this.f10441h.setVisibility(8);
        Context context = this.f10435b;
        int i8 = R.anim.wsdk_anim_small_map_out;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i8);
        loadAnimation.setDuration(400L);
        this.f10440g.setAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new d());
        this.f10440g.startAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f10435b, R.anim.wsdk_anim_comeout);
        this.f10445l.setVisibility(0);
        this.f10445l.setAnimation(loadAnimation2);
        this.f10445l.startAnimation(loadAnimation2);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(this.f10435b, i8);
        loadAnimation3.setDuration(400L);
        this.f10444k.setAnimation(loadAnimation3);
        this.f10444k.startAnimation(loadAnimation3);
        loadAnimation3.setAnimationListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        a(true);
        Context context = this.f10435b;
        int i8 = R.anim.wsdk_anim_small_map_in;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i8);
        loadAnimation.setDuration(400L);
        this.f10440g.setAnimation(loadAnimation);
        this.f10440g.setVisibility(0);
        this.f10440g.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new AnimationAnimationListenerC0139b());
        n nVar = this.E;
        if (nVar != null) {
            nVar.b();
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f10435b, i8);
        loadAnimation2.setDuration(400L);
        this.f10444k.setVisibility(0);
        this.f10444k.setAnimation(loadAnimation2);
        this.f10444k.startAnimation(loadAnimation2);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(this.f10435b, R.anim.wsdk_anim_fadeaway);
        this.f10445l.setAnimation(loadAnimation3);
        this.f10445l.startAnimation(loadAnimation3);
        loadAnimation3.setAnimationListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f10435b == null) {
            return;
        }
        this.f10455v.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f10435b, R.anim.wsdk_anim_rg_right_out);
        loadAnimation.setFillAfter(true);
        this.f10455v.setAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new m());
    }

    private void g() {
        ViewGroup viewGroup = (ViewGroup) this.f10437d.findViewById(R.id.bnav_ar_bar_layout);
        this.f10449p = viewGroup;
        ((TextView) viewGroup.findViewById(R.id.ar_close_tv)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10435b, this.f10453t.H()));
        ((TextView) this.f10449p.findViewById(R.id.tvMapFlag)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10435b, this.f10453t.C()));
        ((TextView) this.f10449p.findViewById(R.id.tvPeriphery)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10435b, this.f10453t.G()));
        ((TextView) this.f10449p.findViewById(R.id.vps_btn_txt)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10435b, this.f10453t.B()));
        ((TextView) this.f10449p.findViewById(R.id.normal_close_tv)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10435b, this.f10453t.H()));
        ((TextView) this.f10449p.findViewById(R.id.tvMapFlag1)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10435b, this.f10453t.C()));
        ViewGroup viewGroup2 = this.f10449p;
        int i8 = R.id.normal_nav_btn_tip;
        ((TextView) viewGroup2.findViewById(i8)).setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10435b, this.f10453t.W0()));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10449p.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = (int) (com.baidu.platform.comapi.h.t.h.b(this.f10435b) * 0.55d);
        layoutParams.addRule(12);
        this.f10449p.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) this.f10437d.findViewById(R.id.ar_search_poi);
        this.f10454u = linearLayout;
        linearLayout.setOnClickListener(new a());
        this.f10444k = this.f10437d.findViewById(R.id.small_map_open_bottom_bar);
        this.f10445l = this.f10437d.findViewById(R.id.small_map_close_bottom_bar);
        this.f10439f = (RelativeLayout) this.f10437d.findViewById(R.id.small_map_container);
        this.f10440g = this.f10437d.findViewById(R.id.small_map_arc_layout);
        this.f10441h = this.f10437d.findViewById(R.id.small_map_shadow);
        this.f10450q = this.f10437d.findViewById(R.id.ar_normal_nav_small_map_open);
        this.f10451r = this.f10437d.findViewById(R.id.ar_normal_nav_small_map_close);
        a aVar = null;
        this.f10450q.setOnClickListener(new o(this, aVar));
        this.f10451r.setOnClickListener(new o(this, aVar));
        h();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10440g.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = (int) (com.baidu.platform.comapi.h.t.h.b(this.f10435b) * 0.34d);
        layoutParams2.addRule(12);
        this.f10440g.setLayoutParams(layoutParams2);
        this.f10442i = (RelativeLayout) this.f10437d.findViewById(R.id.small_map_down_arrow);
        this.f10443j = (LinearLayout) this.f10437d.findViewById(R.id.small_map_up_arrow);
        this.f10446m = (TextView) this.f10437d.findViewById(R.id.remain_time_small_map_open);
        this.f10447n = (TextView) this.f10437d.findViewById(R.id.remain_time_small_map_close);
        this.f10437d.findViewById(R.id.ar_close_small_map_open).setOnClickListener(new f());
        this.f10443j.setOnTouchListener(new g());
        this.f10442i.setOnTouchListener(new h());
        LinearLayout linearLayout2 = (LinearLayout) this.f10437d.findViewById(R.id.ar_close);
        this.f10448o = linearLayout2;
        linearLayout2.setOnClickListener(new i());
        TextView textView = (TextView) this.f10437d.findViewById(i8);
        this.f10452s = textView;
        textView.setVisibility(8);
    }

    private void h() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f10437d.findViewById(R.id.ar_status_bar);
        this.f10456w = relativeLayout;
        relativeLayout.setOnTouchListener(new j());
        TextView textView = (TextView) this.f10437d.findViewById(R.id.clear_poi);
        this.f10457x = textView;
        textView.setOnClickListener(new k());
        this.f10458y = (RelativeLayout) this.f10437d.findViewById(R.id.net_status_bar);
        this.f10459z = (ImageView) this.f10437d.findViewById(R.id.status_icon);
        this.A = (TextView) this.f10437d.findViewById(R.id.status_text);
        ImageView imageView = (ImageView) this.f10437d.findViewById(R.id.status_close);
        this.B = imageView;
        imageView.setOnClickListener(new l());
    }

    private void i() {
        WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
        if (J == null || !J.getIsCustomWNaviRgBarLayout()) {
            if (J == null || J.getIsShowBottomSmallMapUI()) {
                this.f10438e = true;
            } else {
                this.f10438e = false;
            }
        }
    }

    public void a(int i8) {
        this.F = i8;
    }

    private void a(boolean z7) {
        if (z7) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f10437d.findViewById(R.id.user_npc);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.bottomMargin = (int) (com.baidu.platform.comapi.h.t.h.b(this.f10435b) * 0.1d);
            layoutParams.topMargin = -((int) (com.baidu.platform.comapi.h.t.h.b(this.f10435b) * 0.1d));
            relativeLayout.setLayoutParams(layoutParams);
            com.baidu.platform.comapi.walknavi.b.n().t().a(com.baidu.platform.comapi.walknavi.b.n().t().d());
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f10437d.findViewById(R.id.user_npc);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.bottomMargin = 0;
        relativeLayout2.setLayoutParams(layoutParams2);
        com.baidu.platform.comapi.walknavi.b.n().t().a(com.baidu.platform.comapi.walknavi.b.n().t().d());
    }

    public void b(int i8) {
        if (com.baidu.platform.comapi.h.c.b().d()) {
            this.f10449p.setVisibility(0);
            if (this.f10438e) {
                c();
            } else {
                b();
            }
            if (com.baidu.platform.comapi.h.c.b().f()) {
                return;
            }
            this.f10454u.setVisibility(8);
            return;
        }
        b();
        a(false);
        View view = this.f10445l;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void a() {
        this.f10449p.setVisibility(8);
        com.baidu.platform.comapi.walknavi.b.n().a((com.baidu.platform.comapi.h.c.b().a() & (-3)) | 1, false);
        com.baidu.platform.comapi.walknavi.b.n().x().b("normal_nav_btn_has_click", true);
    }
}
