package com.baidu.platform.comapi.walknavi.k.f;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.baidu.ar.auth.FeatureCodes;
import com.baidu.ar.constants.ARConfigKey;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.WinRound;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.walknavi.adapter.IWMoreNPCModelOnClickListener;
import com.baidu.mapapi.walknavi.adapter.IWNPCEngineInitListener;
import com.baidu.mapapi.walknavi.adapter.IWNPCLoadAndInitListener;
import com.baidu.mapapi.walknavi.model.BaseNpcModel;
import com.baidu.mapapi.walknavi.model.WalkNaviDisplayOption;
import com.baidu.platform.comapi.h.b;
import com.baidu.platform.comapi.walknavi.fsm.RGState;
import com.baidu.platform.comapi.walknavi.g.f;
import com.baidu.platform.comapi.walknavi.widget.b;
import com.baidu.platform.comapi.wnplatform.model.OverLookingMode;
import com.baidu.platform.comjni.jninative.tts.WNaviTTSPlayer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class c extends com.baidu.platform.comapi.walknavi.k.f.b implements CompoundButton.OnCheckedChangeListener, com.baidu.platform.comapi.walknavi.g.b {
    private RelativeLayout A;
    private RelativeLayout B;
    private int D;
    private ImageView E;
    private RelativeLayout F;
    private ImageView H;
    Animation I;
    Animation J;
    private String M;
    private RelativeLayout O;
    private TextView P;
    private int Q;
    private String R;
    private com.baidu.platform.comapi.walknavi.widget.b T;
    private IWMoreNPCModelOnClickListener U;
    private IWNPCLoadAndInitListener V;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f10205b;

    /* renamed from: b0, reason: collision with root package name */
    private com.baidu.mapapi.walknavi.model.b f10206b0;

    /* renamed from: c, reason: collision with root package name */
    private Context f10207c;

    /* renamed from: c0, reason: collision with root package name */
    private com.baidu.mapapi.walknavi.model.a f10208c0;

    /* renamed from: d, reason: collision with root package name */
    private View f10209d;

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.k.b f10211e;

    /* renamed from: e0, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.k.c f10212e0;

    /* renamed from: g, reason: collision with root package name */
    private View f10215g;

    /* renamed from: h, reason: collision with root package name */
    private RelativeLayout f10217h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f10219i;

    /* renamed from: i0, reason: collision with root package name */
    CheckBox f10220i0;

    /* renamed from: j, reason: collision with root package name */
    private ImageButton f10221j;

    /* renamed from: j0, reason: collision with root package name */
    CheckBox f10222j0;

    /* renamed from: k0, reason: collision with root package name */
    CheckBox f10224k0;

    /* renamed from: l0, reason: collision with root package name */
    Button f10226l0;

    /* renamed from: m0, reason: collision with root package name */
    View f10228m0;

    /* renamed from: n, reason: collision with root package name */
    private int f10229n;

    /* renamed from: n0, reason: collision with root package name */
    ImageView f10230n0;

    /* renamed from: o0, reason: collision with root package name */
    private final View.OnClickListener f10232o0;

    /* renamed from: p0, reason: collision with root package name */
    final Runnable f10234p0;

    /* renamed from: q, reason: collision with root package name */
    private RelativeLayout f10235q;

    /* renamed from: q0, reason: collision with root package name */
    final Runnable f10236q0;

    /* renamed from: r, reason: collision with root package name */
    private RelativeLayout f10237r;

    /* renamed from: s, reason: collision with root package name */
    private ImageButton f10238s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f10239t;

    /* renamed from: u, reason: collision with root package name */
    private View f10240u;

    /* renamed from: v, reason: collision with root package name */
    private RelativeLayout f10241v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f10242w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f10243x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10244y;

    /* renamed from: z, reason: collision with root package name */
    private RelativeLayout f10245z;

    /* renamed from: f, reason: collision with root package name */
    private Handler f10213f = new Handler();

    /* renamed from: k, reason: collision with root package name */
    private final int f10223k = 1;

    /* renamed from: l, reason: collision with root package name */
    private final int f10225l = 2;

    /* renamed from: m, reason: collision with root package name */
    private final int f10227m = 3;

    /* renamed from: o, reason: collision with root package name */
    private int f10231o = 1;

    /* renamed from: p, reason: collision with root package name */
    private int f10233p = 1;
    private ImageView C = null;
    private boolean G = false;
    private AlphaAnimation K = new AlphaAnimation(1.0f, 0.0f);
    private AlphaAnimation L = new AlphaAnimation(0.0f, 1.0f);
    private boolean N = false;
    private boolean S = false;
    private boolean W = true;
    private long X = 0;
    private boolean Y = true;
    private boolean Z = false;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f10204a0 = false;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f10210d0 = true;

    /* renamed from: f0, reason: collision with root package name */
    private TextView f10214f0 = null;

    /* renamed from: g0, reason: collision with root package name */
    private View f10216g0 = null;

    /* renamed from: h0, reason: collision with root package name */
    private TextView f10218h0 = null;

    class a implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseNpcModel f10246a;

        a(BaseNpcModel baseNpcModel) {
            this.f10246a = baseNpcModel;
        }

        @Override // com.baidu.platform.comapi.walknavi.k.f.c.y
        public void onFail() {
            if (c.this.V != null) {
                com.baidu.platform.comapi.walknavi.g.e.d().e("");
                c.this.a(true);
                com.baidu.platform.comapi.walknavi.b.n().s().a(0, 0);
                c.this.f();
                c.this.V.onFail();
            }
            c.this.H.setImageBitmap(BitmapFactory.decodeResource(com.baidu.platform.comapi.h.t.p.a.e(), R.drawable.wsdk_npc_drawer_img_default));
        }

        @Override // com.baidu.platform.comapi.walknavi.k.f.c.y
        public void onSuccess() {
            if (c.this.V != null) {
                c.this.V.onSuccess();
            }
            c.this.H.setImageBitmap(this.f10246a.getIcon());
        }
    }

    class b implements b.c {
        b() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
        }
    }

    /* renamed from: com.baidu.platform.comapi.walknavi.k.f.c$c, reason: collision with other inner class name */
    class C0129c implements b.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10249a;

        C0129c(String str) {
            this.f10249a = str;
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            c.this.a(this.f10249a, (y) null);
        }
    }

    class d implements Animation.AnimationListener {
        d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c.this.f10235q.clearAnimation();
            c.this.f10235q.setVisibility(8);
            c.this.B.clearAnimation();
            c.this.B.setVisibility(8);
            c.this.f10237r.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f10207c == null) {
                return;
            }
            c.this.A.setAnimation(com.baidu.platform.comapi.h.t.p.a.c(c.this.f10207c, R.anim.wsdk_anim_rg_down_out));
            c.this.A.setVisibility(8);
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.baidu.platform.comapi.walknavi.b.n().u() == 4) {
                c.this.f10220i0.setChecked(false);
            } else if (com.baidu.platform.comapi.walknavi.b.n().x().a("WALKNAVI_VOICE_ON_OFF", true)) {
                c.this.f10220i0.setChecked(true);
            } else {
                c.this.f10220i0.setChecked(false);
            }
            if (com.baidu.platform.comapi.walknavi.b.n().x().a("WALKNAVI_STREET_POI_ON_OFF", true)) {
                c.this.f10222j0.setChecked(true);
            } else {
                c.this.f10222j0.setChecked(false);
            }
            if (com.baidu.platform.comapi.walknavi.b.n().x().a("WALKNAVI_THREED_MAP_ON_OFF", true)) {
                c.this.f10224k0.setChecked(true);
            } else {
                c.this.f10224k0.setChecked(false);
            }
            try {
                c.this.A.setAnimation(com.baidu.platform.comapi.h.t.p.a.c(c.this.f10207c, R.anim.wsdk_anim_rg_down_in));
            } catch (Exception unused) {
            }
            c.this.A.setVisibility(0);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10254a;

        g(String str) {
            this.f10254a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baidu.platform.comapi.walknavi.b.n().s().a(true);
            c.this.c(this.f10254a);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10256a;

        h(String str) {
            this.f10256a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baidu.platform.comapi.walknavi.b.n().s().a(true);
            c.this.d(this.f10256a);
        }
    }

    class i implements Runnable {

        class a implements y {
            a() {
            }

            @Override // com.baidu.platform.comapi.walknavi.k.f.c.y
            public void onFail() {
                if (c.this.V != null) {
                    com.baidu.platform.comapi.walknavi.g.e.d().e("");
                    c.this.a(true);
                    com.baidu.platform.comapi.walknavi.b.n().s().a(0, 0);
                    c.this.f();
                    c.this.V.onFail();
                }
            }

            @Override // com.baidu.platform.comapi.walknavi.k.f.c.y
            public void onSuccess() {
                if (c.this.V != null) {
                    c.this.V.onSuccess();
                }
            }
        }

        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.W) {
                c.this.W = false;
                String a8 = com.baidu.platform.comapi.walknavi.b.n().x().a("walknavi_current_npc_token", "");
                if (!TextUtils.isEmpty(a8) && c.this.b(a8)) {
                    c.this.a(a8, new a());
                    return;
                }
            } else if (!TextUtils.isEmpty(com.baidu.platform.comapi.walknavi.g.e.d().c())) {
                c.this.q();
                return;
            }
            com.baidu.platform.comapi.walknavi.g.e.d().e("");
            c.this.a(true);
            com.baidu.platform.comapi.walknavi.b.n().s().a(0, 0);
            c.this.f();
        }
    }

    class j implements com.baidu.platform.comapi.walknavi.g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f10260a;

        j(w wVar) {
            this.f10260a = wVar;
        }

        @Override // com.baidu.platform.comapi.walknavi.g.c
        public void a(int i8) {
        }

        @Override // com.baidu.platform.comapi.walknavi.g.c
        public void a(boolean z7, float f8) {
        }

        @Override // com.baidu.platform.comapi.walknavi.g.c
        public void a(int i8, String str) {
            com.baidu.platform.comapi.h.g.a.b("downloadnpc:responseCode = " + i8 + ", responseMessage = " + str);
            if (i8 == 0) {
                c.this.M = str + File.separator + com.moyoung.dafit.module.common.utils.u.LANGUAGE_AR;
                this.f10260a.a(c.this.M);
                return;
            }
            if (i8 == 2 || i8 == 4 || i8 == 3) {
                Toast.makeText(c.this.f10207c, com.baidu.platform.comapi.h.t.p.a.b(c.this.f10207c, c.this.f10212e0.V0()), 0).show();
                this.f10260a.a(i8);
                return;
            }
            if (i8 == 7) {
                this.f10260a.a(i8);
                return;
            }
            if (i8 == 8) {
                Toast.makeText(c.this.f10207c, com.baidu.platform.comapi.h.t.p.a.b(c.this.f10207c, c.this.f10212e0.X0()), 0).show();
                this.f10260a.a(i8);
                return;
            }
            if (i8 == 1) {
                Toast.makeText(c.this.f10207c, com.baidu.platform.comapi.h.t.p.a.b(c.this.f10207c, c.this.f10212e0.E()), 0).show();
                this.f10260a.a(i8);
            } else if (i8 != 6 && i8 != 5 && i8 != -1) {
                this.f10260a.a(i8);
                Toast.makeText(c.this.f10207c, str, 0).show();
            } else {
                Toast.makeText(c.this.f10207c, com.baidu.platform.comapi.h.t.p.a.b(c.this.f10207c, c.this.f10212e0.q()), 0).show();
                this.f10260a.a(i8);
            }
        }
    }

    class k implements b.d {
        k() {
        }

        @Override // com.baidu.platform.comapi.h.b.d
        public void onDownLoadError() {
            if (com.baidu.platform.comapi.walknavi.b.n().d() != null) {
                com.baidu.platform.comapi.walknavi.b.n().d().onDownLoadError();
            }
        }

        @Override // com.baidu.platform.comapi.h.b.d
        public void onDownLoadFinish() {
            c.this.i();
            if (c.this.f10211e instanceof com.baidu.platform.comapi.walknavi.k.b) {
                c.this.f10211e.f(1);
            }
            if (com.baidu.platform.comapi.walknavi.b.n().d() != null) {
                com.baidu.platform.comapi.walknavi.b.n().d().onDownLoadFinish();
            }
        }

        @Override // com.baidu.platform.comapi.h.b.d
        public void onDownLoadProcess(int i8) {
            if (com.baidu.platform.comapi.walknavi.b.n().d() != null) {
                com.baidu.platform.comapi.walknavi.b.n().d().onDownLoadProcess(i8);
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baidu.platform.comapi.walknavi.g.e.d().o();
            com.baidu.platform.comapi.walknavi.g.e.d().a(false);
            com.baidu.platform.comapi.walknavi.g.e.d().b("\npod_node:stop_action(id_play_music)\nid_play_music = pod_node:play_audio(\"res/media/tap1.mp3\", -1, 0)\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"turnAndSayHi\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 1\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\ncurrent_scene:set_event_handler(0, 0)\nparam._repeat_count = 1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onTurnAndSayHiPlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onTurnAndSayHiPlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"action_name\", \"turnAndSayHi\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "turnAndSayHi");
        }
    }

    class o extends com.baidu.platform.comapi.h.t.m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.baidu.platform.comapi.walknavi.k.c f10270b;

        o(com.baidu.platform.comapi.walknavi.k.c cVar) {
            this.f10270b = cVar;
        }

        @Override // com.baidu.platform.comapi.h.t.m
        public void a(View view) {
            if (PermissionUtils.getInstance().isWalkARNaviAuthorized() || c.this.f10207c == null) {
                c.this.g();
            } else {
                Toast.makeText(c.this.f10207c, com.baidu.platform.comapi.h.t.p.a.b(c.this.f10207c, this.f10270b.G0()), 0).show();
            }
        }
    }

    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.E != null) {
                c.this.E.performClick();
            }
        }
    }

    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG.turnDire");
            com.baidu.platform.comapi.h.g.a.c("yang13", "loc click:" + com.baidu.platform.comapi.walknavi.i.c.t());
            if (com.baidu.platform.comapi.walknavi.i.c.t() == com.baidu.platform.comapi.walknavi.i.b.GUIDING_TO_SEGMENTBROWSE) {
                com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE);
                com.baidu.platform.comapi.walknavi.b.n().s().x();
                c.this.c(true);
                return;
            }
            int i8 = c.this.f10229n;
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

    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f10211e != null) {
                c.this.f10211e.q();
            }
        }
    }

    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f10211e != null) {
                c.this.f10211e.q();
            }
        }
    }

    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.t();
        }
    }

    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f10207c == null) {
                return;
            }
            c.this.A.setAnimation(AnimationUtils.loadAnimation(c.this.f10207c, R.anim.wsdk_anim_rg_down_out));
            c.this.A.setVisibility(8);
            c.this.f10241v.setVisibility(8);
        }
    }

    class v implements IWNPCEngineInitListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10278a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10279b;

        v(String str, String str2) {
            this.f10278a = str;
            this.f10279b = str2;
        }

        @Override // com.baidu.mapapi.walknavi.adapter.IWNPCEngineInitListener
        public void onFail(String str) {
            if (c.this.V != null) {
                c.this.V.onFail();
            }
        }

        @Override // com.baidu.mapapi.walknavi.adapter.IWNPCEngineInitListener
        public void onSuccess() {
            c.this.b(this.f10278a, this.f10279b);
            com.baidu.platform.comapi.walknavi.b.n().x().b(this.f10278a, this.f10279b);
        }
    }

    public interface w {
        void a(int i8);

        void a(String str);
    }

    private static class x implements f.c {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<com.baidu.platform.comapi.walknavi.k.f.b> f10281a;

        public x(com.baidu.platform.comapi.walknavi.k.f.b bVar) {
            this.f10281a = null;
            this.f10281a = new WeakReference<>(bVar);
        }

        @Override // com.baidu.platform.comapi.walknavi.g.f.c
        public void a(f.d dVar) {
        }
    }

    public interface y {
        void onFail();

        void onSuccess();
    }

    public c(Context context, com.baidu.platform.comapi.walknavi.k.b bVar, View view, com.baidu.platform.comapi.walknavi.k.c cVar) {
        ImageView imageView;
        ImageView imageView2;
        f fVar = new f();
        this.f10232o0 = fVar;
        this.f10234p0 = new i();
        this.f10236q0 = new n();
        this.f10207c = context;
        this.f10209d = view;
        this.f10212e0 = cVar;
        WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f10207c, R.anim.wsdk_anim_rg_down_out);
        this.I = loadAnimation;
        loadAnimation.setFillAfter(true);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f10207c, R.anim.wsdk_anim_rg_down_in);
        this.J = loadAnimation2;
        loadAnimation2.setFillAfter(true);
        this.K.setDuration(300L);
        this.L.setDuration(300L);
        this.f10211e = bVar;
        this.f10215g = view.findViewById(R.id.ar_mode_enter_mask);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.normal_layout);
        this.B = relativeLayout;
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.common_switch_panel);
        this.A = relativeLayout2;
        a(relativeLayout2);
        c(view);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.ar_entry);
        this.E = imageView3;
        imageView3.setImageDrawable(com.baidu.platform.comapi.h.t.p.a.a(context, cVar.k0()));
        if (!com.baidu.platform.comapi.walknavi.b.n().O() || this.E == null) {
            ImageView imageView4 = this.E;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        } else if (com.baidu.platform.comapi.walknavi.b.n().s().t()) {
            this.E.setVisibility(8);
        } else {
            if (J == null || J.getShowImageToAR() || (imageView2 = this.E) == null) {
                this.E.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
            if (J != null && J.getImageToAR() != null && (imageView = this.E) != null) {
                imageView.setImageBitmap(J.getImageToAR());
            }
        }
        this.E.setOnClickListener(new o(cVar));
        RelativeLayout relativeLayout3 = (RelativeLayout) view.findViewById(R.id.ar_entry_tip);
        this.F = relativeLayout3;
        relativeLayout3.setOnClickListener(new p());
        this.f10217h = (RelativeLayout) view.findViewById(R.id.bnav_rg_location_layout);
        ImageView imageView5 = (ImageView) view.findViewById(R.id.bnav_rg_btn_location);
        this.f10219i = imageView5;
        imageView5.setOnClickListener(new q());
        a(view);
        this.f10242w.setOnClickListener(new r());
        this.f10240u.setOnClickListener(new s());
        this.f10244y = true;
        this.O.setOnClickListener(new t());
        this.f10245z.setOnClickListener(fVar);
        this.f10238s.setOnClickListener(fVar);
        RelativeLayout relativeLayout4 = (RelativeLayout) view.findViewById(R.id.normal_panel_top_ly);
        this.f10241v = relativeLayout4;
        relativeLayout4.setOnClickListener(new u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        com.baidu.platform.comapi.walknavi.b.n().b("底部bar点击：mLocBtnId：" + this.f10229n + "；mLastLocBtnId：" + this.D);
        if (this.f10244y) {
            com.baidu.platform.comapi.walknavi.b.n().l().run("[查看全览]按钮点击");
            this.f10239t.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.k()));
            this.P.setVisibility(8);
            this.f10244y = !this.f10244y;
            return;
        }
        this.f10239t.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.V()));
        this.P.setVisibility(0);
        this.f10244y = !this.f10244y;
        if (com.baidu.platform.comapi.walknavi.b.n().u() == 4) {
            e();
        } else {
            com.baidu.platform.comapi.walknavi.b.n().l().run("[3D车头向上]按钮点击");
            com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE);
            com.baidu.platform.comapi.walknavi.b.n().s().x();
            com.baidu.platform.comapi.walknavi.b.n().f(1);
        }
        c(true);
    }

    private void u() {
        if (com.baidu.platform.comapi.h.t.a.a()) {
            this.f10228m0.setVisibility(0);
            this.f10230n0.setVisibility(0);
            com.baidu.platform.comapi.walknavi.b.n().s().b(true);
        } else {
            this.f10228m0.setVisibility(8);
            this.f10230n0.setVisibility(8);
            com.baidu.platform.comapi.walknavi.b.n().s().b(false);
        }
    }

    private void v() {
    }

    public void a(IWMoreNPCModelOnClickListener iWMoreNPCModelOnClickListener) {
        this.U = iWMoreNPCModelOnClickListener;
    }

    public void b(int i8) {
    }

    public TextView j() {
        return this.P;
    }

    public TextView k() {
        return this.P;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
        if (compoundButton.getId() == R.id.sound_check) {
            if (com.baidu.platform.comapi.walknavi.b.n().u() == 4) {
                return;
            }
            com.baidu.platform.comapi.h.g.a.a("yang12", "onCheckedChanged:sound_check:" + z7);
            if (z7) {
                if (com.baidu.platform.comapi.walknavi.b.n().u() != 4) {
                    com.baidu.platform.comapi.h.q.a.a().a("sound", 1);
                    com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG");
                }
                WNaviTTSPlayer.resumeVoiceTTSOutput();
                com.baidu.platform.comapi.walknavi.b.n().x().b("WALKNAVI_VOICE_ON_OFF", true);
                return;
            }
            if (com.baidu.platform.comapi.walknavi.b.n().u() != 4) {
                com.baidu.platform.comapi.h.q.a.a().a("sound", 0);
                com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG");
            }
            WNaviTTSPlayer.pauseVoiceTTSOutput();
            com.baidu.platform.comapi.walknavi.b.n().x().b("WALKNAVI_VOICE_ON_OFF", false);
            return;
        }
        if (compoundButton.getId() != R.id.pano_check) {
            if (compoundButton.getId() == R.id.threeD_check) {
                if (z7) {
                    com.baidu.platform.comapi.walknavi.b.n().x().b("WALKNAVI_THREED_MAP_ON_OFF", true);
                    d(true);
                    com.baidu.platform.comapi.h.q.a.a().a("threeD", 1);
                    com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG");
                    return;
                }
                com.baidu.platform.comapi.walknavi.b.n().x().b("WALKNAVI_THREED_MAP_ON_OFF", false);
                d(false);
                com.baidu.platform.comapi.h.q.a.a().a("threeD", 0);
                com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG");
                return;
            }
            return;
        }
        com.baidu.platform.comapi.h.g.a.a("yang12", "onCheckedChanged:panocheck:" + z7);
        if (z7) {
            com.baidu.platform.comapi.walknavi.b.n().x().b("WALKNAVI_STREET_POI_ON_OFF", true);
            com.baidu.platform.comapi.walknavi.b.n().s().b(true);
            com.baidu.platform.comapi.h.q.a.a().a("streetPoi", 1);
            com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG");
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().x().b("WALKNAVI_STREET_POI_ON_OFF", false);
        com.baidu.platform.comapi.walknavi.b.n().s().b(false);
        com.baidu.platform.comapi.h.q.a.a().a("streetPoi", 0);
        com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG");
    }

    public void w() {
        v();
    }

    private void e() {
        if (com.baidu.platform.comapi.walknavi.i.c.g() != 0) {
            com.baidu.platform.comapi.walknavi.i.c.e(com.baidu.platform.comapi.walknavi.i.c.g());
            return;
        }
        MapStatus d8 = com.baidu.platform.comapi.walknavi.b.n().t().d();
        if (d8 != null) {
            MapStatus.Builder builder = new MapStatus.Builder();
            builder.overlook(0.0f);
            builder.zoom(19.0f);
            WinRound winRound = d8.winRound;
            long abs = (long) (com.github.mikephil.charting.utils.i.DOUBLE_EPSILON - ((Math.abs(winRound.bottom - winRound.top) - 75) * 0.25d));
            WinRound winRound2 = d8.winRound;
            builder.targetScreen(new Point((winRound2.right + winRound2.left) / 2, ((winRound2.top + winRound2.bottom) / 2) - ((int) abs)));
            com.baidu.platform.comapi.basestruct.Point E = com.baidu.platform.comapi.walknavi.b.n().E();
            if (E != null) {
                builder.target(new LatLng(E.getDoubleY(), E.getDoubleX()));
            }
            com.baidu.platform.comapi.walknavi.b.n().t().a(d8, 500);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ImageView imageView;
        if (this.H == null) {
            return;
        }
        String c8 = com.baidu.platform.comapi.walknavi.g.e.d().c();
        if (TextUtils.isEmpty(c8)) {
            this.H.setVisibility(0);
            WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
            if (J == null || J.getImageNPC() == null || (imageView = this.H) == null) {
                this.H.setImageDrawable(com.baidu.platform.comapi.h.t.p.a.a(this.f10207c, R.drawable.wsdk_icon_classic));
                return;
            } else {
                imageView.setImageBitmap(J.getImageNPC());
                return;
            }
        }
        com.baidu.platform.comapi.walknavi.g.a a8 = com.baidu.platform.comapi.walknavi.b.n().a(c8);
        if (a8 == null) {
            return;
        }
        Bitmap b8 = a8.b();
        if (b8 != null) {
            this.H.setVisibility(0);
            this.H.setImageBitmap(b8);
        } else {
            this.H.setVisibility(0);
            this.H.setImageDrawable(com.baidu.platform.comapi.h.t.p.a.a(this.f10207c, R.drawable.wsdk_npc_drawer_img_default));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.baidu.platform.comapi.h.b.a().a(this.f10207c, new k());
    }

    private int l() {
        return com.baidu.platform.comapi.h.t.h.b(this.f10207c);
    }

    private boolean n() {
        WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
        if (J == null) {
            Log.e("CustomWNaviView", "Load bottomSetting layout failed,WalkNaviDisplayOption is null.");
            return false;
        }
        int bottomSettingLayout = J.getBottomSettingLayout();
        if (bottomSettingLayout == 0) {
            Log.e("CustomWNaviView", "BottomSetting layout resource is empty.");
            return false;
        }
        if (this.f10235q == null) {
            Log.e("CustomWNaviView", "BottomSetting layout add failed.");
            return false;
        }
        View inflate = LayoutInflater.from((Activity) this.f10207c).inflate(bottomSettingLayout, (ViewGroup) this.f10235q, false);
        if (inflate == null) {
            Log.e("CustomWNaviView", "Load bottomSetting layout failed,please checking xml layout.");
            return false;
        }
        if (!com.baidu.platform.comapi.walknavi.k.g.b.a().a((Activity) this.f10207c, 3, bottomSettingLayout, this)) {
            Log.e("CustomWNaviView", "Parser bottomSetting layout failed,please checking layout.");
            return false;
        }
        com.baidu.mapapi.walknavi.model.a aVar = this.f10208c0;
        if (aVar == null) {
            Log.e("CustomWNaviView", "Parser bottomSetting layout failed,missing other keywords like TAG attribute or ID attribute.");
            return false;
        }
        if (TextUtils.isEmpty(aVar.a()) || TextUtils.isEmpty(this.f10208c0.c()) || TextUtils.isEmpty(this.f10208c0.d()) || TextUtils.isEmpty(this.f10208c0.b()) || TextUtils.isEmpty(this.f10208c0.e())) {
            Log.e("CustomWNaviView", "BottomSetting layout missing other keywords like TAG attribute or ID attribute.");
            return false;
        }
        try {
            this.f10240u = inflate.findViewById(Integer.parseInt(this.f10208c0.a().replace("@", "")));
            this.f10242w = (ImageView) inflate.findViewById(Integer.parseInt(this.f10208c0.c().replace("@", "")));
            this.f10243x = (TextView) inflate.findViewById(Integer.parseInt(this.f10208c0.d().replace("@", "")));
            this.f10239t = (TextView) inflate.findViewById(Integer.parseInt(this.f10208c0.b().replace("@", "")));
            TextView textView = (TextView) inflate.findViewById(Integer.parseInt(this.f10208c0.e().replace("@", "")));
            this.P = textView;
            if (this.f10240u == null || this.f10242w == null || this.f10243x == null || this.f10239t == null || textView == null) {
                Log.e("CustomWNaviView", "BottomSetting layout control initialize failed,Missing other keywords like TAG attribute or ID attribute.");
                return false;
            }
            this.f10235q.removeAllViews();
            this.f10235q.addView(inflate);
            if (TextUtils.isEmpty(this.f10243x.getText())) {
                this.f10243x.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.H()));
            }
            this.f10239t.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.V()));
            this.f10204a0 = true;
            this.f10235q.setBackgroundColor(0);
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            Log.e("CustomWNaviView", "BottomSetting layout control type error");
            return false;
        }
    }

    private void p() {
        if (com.baidu.platform.comapi.walknavi.b.n().x().a("WALKNAVI_AR_NPC_IS_DOWNLOADING", false)) {
            com.baidu.platform.comapi.walknavi.g.e.d().a();
        }
    }

    public void a(IWNPCLoadAndInitListener iWNPCLoadAndInitListener) {
        this.V = iWNPCLoadAndInitListener;
    }

    public void h() {
        this.f10207c = null;
        if (this.U != null) {
            this.U = null;
        }
        if (this.V != null) {
            this.V = null;
        }
        com.baidu.platform.comapi.walknavi.g.e.d().i();
    }

    public void i() {
        this.Q = this.D;
        if (com.baidu.platform.comapi.walknavi.b.n().I()) {
            com.baidu.platform.comapi.walknavi.b.n().e(false);
        }
        com.baidu.platform.comapi.walknavi.b.n().a((com.baidu.platform.comapi.h.c.b().a() & (-2)) | 2, false);
        com.baidu.platform.comapi.walknavi.b.n().s().x();
        com.baidu.platform.comapi.walknavi.b.n().s().c(false);
        c(true);
        com.baidu.platform.comapi.walknavi.b.n().l().run("[3D车头向上]按钮点击");
        if (this.F.getVisibility() == 0) {
            com.baidu.platform.comapi.walknavi.k.b bVar = this.f10211e;
            if (bVar != null) {
                bVar.f10120b0 = true;
                return;
            }
            return;
        }
        com.baidu.platform.comapi.walknavi.k.b bVar2 = this.f10211e;
        if (bVar2 != null) {
            bVar2.f10120b0 = false;
        }
    }

    public void m() {
        this.B.clearAnimation();
        this.B.setVisibility(8);
        this.f10235q.clearAnimation();
        this.f10235q.setVisibility(8);
    }

    public void o() {
        Runnable runnable;
        com.baidu.platform.comapi.wnplatform.tts.c.a().a(false);
        if (com.baidu.platform.comapi.walknavi.g.e.d().f()) {
            p();
            com.baidu.platform.comapi.walknavi.g.e.d().c(true);
            com.baidu.platform.comapi.walknavi.g.e.d().b(false);
            com.baidu.platform.comapi.walknavi.g.e.d().i();
        }
        Handler handler = this.f10213f;
        if (handler == null || (runnable = this.f10234p0) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f10213f = null;
    }

    public void q() {
        com.baidu.platform.comapi.walknavi.b.n().s().a(true);
        com.baidu.platform.comapi.walknavi.g.e.d().m();
    }

    public void r() {
        String c8 = com.baidu.platform.comapi.walknavi.g.e.d().c();
        if (TextUtils.isEmpty(com.baidu.platform.comapi.walknavi.b.n().x().a(c8, ""))) {
            com.baidu.platform.comapi.walknavi.g.e.d().a(c8, new m(c8));
        }
    }

    public void s() {
        if (this.S) {
            com.baidu.platform.comapi.walknavi.g.e.d().a(new x(this));
            String c8 = com.baidu.platform.comapi.walknavi.g.e.d().c();
            if (TextUtils.isEmpty(c8)) {
                a(true);
                com.baidu.platform.comapi.walknavi.b.n().s().a(0, 0);
                f();
            } else {
                a(c8, (y) null);
            }
            this.S = false;
        }
    }

    class m implements com.baidu.platform.comapi.walknavi.g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10266a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (com.baidu.platform.comapi.walknavi.g.i.k.g.d(c.this.f10207c)) {
                    m mVar = m.this;
                    c.this.a(mVar.f10266a, (y) null);
                } else if (c.this.f10207c != null) {
                    m mVar2 = m.this;
                    c cVar = c.this;
                    cVar.a(mVar2.f10266a, com.baidu.platform.comapi.h.t.p.a.b(cVar.f10207c, c.this.f10212e0.J0()), 4);
                }
            }
        }

        m(String str) {
            this.f10266a = str;
        }

        @Override // com.baidu.platform.comapi.walknavi.g.c
        public void a(boolean z7, float f8) {
            if (!z7) {
                com.baidu.platform.comapi.walknavi.g.e.d().a(this.f10266a, true);
            } else {
                c.this.N = z7;
                c.this.f10213f.postDelayed(new a(), 500L);
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.c
        public void a(int i8) {
            com.baidu.platform.comapi.h.g.a.b("aaaaa progress: " + i8);
        }

        @Override // com.baidu.platform.comapi.walknavi.g.c
        public void a(int i8, String str) {
            com.baidu.platform.comapi.h.g.a.b("aaaaa responseCode = " + i8 + ", responseMessage = " + str);
        }
    }

    private void c(View view) {
        this.f10205b = (RelativeLayout) view.findViewById(R.id.user_npc);
    }

    private void d(View view) {
        this.f10237r = (RelativeLayout) view.findViewById(R.id.sync_view);
        WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
        if (J == null || J.getCustomBottomView() == null) {
            return;
        }
        this.f10237r.removeAllViews();
        this.f10237r.addView(J.getCustomBottomView());
        this.f10237r.setVisibility(0);
    }

    public void a(com.baidu.mapapi.walknavi.model.a aVar) {
        this.f10208c0 = aVar;
    }

    public void a(com.baidu.mapapi.walknavi.model.b bVar) {
        this.f10206b0 = bVar;
    }

    @Override // com.baidu.platform.comapi.walknavi.k.f.b
    protected void c() {
        Animation c8 = com.baidu.platform.comapi.h.t.p.a.c(this.f10207c, R.anim.wsdk_anim_rg_down_in);
        if (com.baidu.platform.comapi.walknavi.b.n().K() == 1) {
            WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
            if (J == null || J.getShowImageToLocation()) {
                RelativeLayout relativeLayout = this.f10217h;
                if (relativeLayout == null) {
                    return;
                }
                if (!relativeLayout.isShown()) {
                    this.f10217h.setAnimation(c8);
                }
                this.f10217h.setVisibility(0);
            } else {
                RelativeLayout relativeLayout2 = this.f10217h;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(8);
                }
            }
            if (!this.f10235q.isShown()) {
                this.f10235q.setAnimation(c8);
            }
            if (this.f10210d0) {
                this.f10235q.setVisibility(0);
            }
        }
    }

    private void b(View view) {
        if (view != null) {
            this.f10242w = (ImageView) view.findViewById(R.id.bnav_rg_bar_icon);
            this.f10240u = view.findViewById(R.id.bnav_rg_bar_quit);
            this.f10243x = (TextView) view.findViewById(R.id.bnav_rg_bar_tv);
            this.f10239t = (TextView) view.findViewById(R.id.bnav_rg_bar_text);
            this.P = (TextView) view.findViewById(R.id.normal_remain);
            this.O = (RelativeLayout) view.findViewById(R.id.bottom_bar_ly);
            this.f10238s = (ImageButton) view.findViewById(R.id.bnav_rg_bar_more);
            this.f10245z = (RelativeLayout) view.findViewById(R.id.bnav_rg_bar_more_ly);
        }
    }

    class l implements w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10263a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f10264b;

        l(String str, y yVar) {
            this.f10263a = str;
            this.f10264b = yVar;
        }

        @Override // com.baidu.platform.comapi.walknavi.k.f.c.w
        public void a(String str) {
            if (c.this.N) {
                c.this.N = false;
                Toast.makeText(c.this.f10207c, com.baidu.platform.comapi.h.t.p.a.b(c.this.f10207c, c.this.f10212e0.U0()), 0).show();
            } else if (com.baidu.platform.comapi.h.c.b().d()) {
                c.this.b(this.f10263a, str);
                y yVar = this.f10264b;
                if (yVar != null) {
                    yVar.onSuccess();
                }
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.k.f.c.w
        public void a(int i8) {
            this.f10264b.onFail();
        }
    }

    private void d(boolean z7) {
        MapStatus d8 = com.baidu.platform.comapi.walknavi.b.n().t().d();
        MapStatus.Builder builder = new MapStatus.Builder();
        if (d8 == null) {
            return;
        }
        if (z7) {
            OverLookingMode overLookingMode = OverLookingMode.OverLooking_3D;
            builder.overlook(overLookingMode.getValue());
            com.baidu.platform.comapi.walknavi.b.n().a(overLookingMode);
        } else {
            OverLookingMode overLookingMode2 = OverLookingMode.OverLooking_2D;
            builder.overlook(overLookingMode2.getValue());
            com.baidu.platform.comapi.walknavi.b.n().a(overLookingMode2);
        }
        com.baidu.platform.comapi.walknavi.b.n().t().a(d8, FeatureCodes.VO);
    }

    private void a(View view) {
        d(view);
        this.f10235q = (RelativeLayout) view.findViewById(R.id.bnav_rg_bar_layout);
        WalkNaviDisplayOption J = com.baidu.platform.comapi.walknavi.b.n().J();
        if (J != null && J.getIsCustomWNaviRgBarLayout()) {
            if (!n()) {
                b(view);
            }
            this.f10239t.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.V()));
            return;
        }
        b(view);
        if (J == null || J.getIsShowBottomGuideLayout()) {
            this.f10210d0 = true;
        } else {
            this.f10235q.setVisibility(8);
            this.f10210d0 = false;
        }
        this.f10239t.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.V()));
    }

    @Override // com.baidu.platform.comapi.walknavi.k.f.b
    protected void b() {
        ImageButton imageButton;
        Animation c8 = com.baidu.platform.comapi.h.t.p.a.c(this.f10207c, R.anim.wsdk_anim_rg_down_out);
        if (com.baidu.platform.comapi.walknavi.k.e.b.f10196a != 2 || (imageButton = this.f10221j) == null) {
            return;
        }
        if (imageButton.isShown()) {
            this.f10221j.setAnimation(c8);
        }
        this.f10221j.setVisibility(8);
    }

    private void e(String str) {
        String c8 = com.baidu.platform.comapi.walknavi.g.e.d().c();
        ArrayList<com.baidu.platform.comapi.walknavi.g.a> M = com.baidu.platform.comapi.walknavi.b.n().M();
        if (M != null) {
            for (int i8 = 0; i8 < M.size(); i8++) {
                if (!TextUtils.isEmpty(c8) && TextUtils.equals(c8, M.get(i8).a())) {
                    String c9 = M.get(i8).c();
                    String d8 = M.get(i8).d();
                    if (!TextUtils.isEmpty(c9) && !TextUtils.isEmpty(d8)) {
                        try {
                            com.baidu.platform.comapi.walknavi.b.n().s().a(Integer.parseInt(c9), Integer.parseInt(d8));
                        } catch (Exception unused) {
                        }
                    } else {
                        com.baidu.platform.comapi.walknavi.b.n().s().a(0, 0);
                    }
                }
            }
        }
        if (!com.baidu.platform.comapi.walknavi.g.e.d().f()) {
            com.baidu.platform.comapi.walknavi.g.e.d().a(this);
            new FrameLayout.LayoutParams(-1, (l() / 9) * 9);
            com.baidu.platform.comapi.walknavi.g.e.d().b().setZOrderOnTop(true);
            com.baidu.platform.comapi.walknavi.g.e.d().b().setFrameRate(30);
            com.baidu.platform.comapi.walknavi.g.e.d().l();
            this.f10213f.postDelayed(new g(str), 500L);
            return;
        }
        com.baidu.platform.comapi.walknavi.g.e.d().l();
        this.f10213f.postDelayed(new h(str), 500L);
    }

    public void c(boolean z7) {
        this.f10244y = z7;
        if (z7) {
            this.f10239t.setVisibility(0);
            this.f10239t.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.V()));
            this.P.setVisibility(0);
        } else {
            this.f10239t.setVisibility(0);
            this.f10239t.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.k()));
            this.P.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        com.baidu.platform.comapi.h.g.a.c("tag", "call npcSwitchCase");
        com.baidu.platform.comapi.walknavi.g.e.d().c(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        com.baidu.platform.comapi.walknavi.g.e.d().e(str);
        e(str2);
        f();
    }

    private void a(String str, String str2) {
        if (!a(str2)) {
            Log.e("LoadLocalNPCError", "the localNPCPath is not found, please check");
            return;
        }
        if (com.baidu.platform.comapi.walknavi.g.e.d().h()) {
            b(str, str2);
            com.baidu.platform.comapi.walknavi.b.n().x().b(str, str2);
            IWNPCLoadAndInitListener iWNPCLoadAndInitListener = this.V;
            if (iWNPCLoadAndInitListener != null) {
                iWNPCLoadAndInitListener.onSuccess();
                return;
            }
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().a(new v(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        com.baidu.platform.comapi.walknavi.g.e.d().c(false);
    }

    public void b(boolean z7) {
        if (com.baidu.platform.comapi.walknavi.g.e.d().e()) {
            a(z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        ArrayList<com.baidu.platform.comapi.walknavi.g.a> M = com.baidu.platform.comapi.walknavi.b.n().M();
        if (M == null) {
            return false;
        }
        boolean z7 = false;
        for (int i8 = 0; i8 < M.size(); i8++) {
            if (TextUtils.equals(str, M.get(i8).a())) {
                z7 = true;
            }
        }
        return z7;
    }

    public void a(BaseNpcModel baseNpcModel) {
        if (this.H == null || this.f10207c == null) {
            return;
        }
        if (baseNpcModel == null) {
            Log.e("BaseNpcModel error", "BaseNpcModel is null,please check!");
            return;
        }
        if (TextUtils.equals(baseNpcModel.getDownLoadKey(), "")) {
            com.baidu.platform.comapi.walknavi.g.e.d().e("");
            a(true);
            com.baidu.platform.comapi.walknavi.b.n().s().a(0, 0);
            f();
            return;
        }
        if (com.baidu.platform.comapi.h.c.b().d() && baseNpcModel.isLoadFromLocal()) {
            a(baseNpcModel.getDownLoadKey(), baseNpcModel.getLocalPath());
            return;
        }
        if (!com.baidu.platform.comapi.walknavi.g.i.k.g.b(this.f10207c)) {
            Context context = this.f10207c;
            Toast.makeText(context, com.baidu.platform.comapi.h.t.p.a.b(context, this.f10212e0.H0()), 0).show();
        } else if (!com.baidu.platform.comapi.walknavi.g.i.k.g.d(this.f10207c)) {
            a(baseNpcModel.getDownLoadKey(), com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.I0()), 4);
        } else {
            a(baseNpcModel.getDownLoadKey(), new a(baseNpcModel));
        }
    }

    private boolean a(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i8) {
        Context context;
        com.baidu.platform.comapi.walknavi.widget.b a8 = new com.baidu.platform.comapi.walknavi.widget.b(this.f10207c).a(true).d(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.S())).a(String.format(str2, Integer.valueOf(i8))).c(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.O())).d().b(new C0129c(str)).b(com.baidu.platform.comapi.h.t.p.a.b(this.f10207c, this.f10212e0.i())).a(new b());
        this.T = a8;
        if (a8.isShowing() || (context = this.f10207c) == null || ((Activity) context).isFinishing()) {
            return;
        }
        this.T.show();
    }

    public void a(int i8, boolean z7) {
        if (com.baidu.platform.comapi.h.c.b().h()) {
            this.G = false;
            if (this.f10210d0) {
                this.f10235q.setVisibility(0);
                this.f10237r.setVisibility(0);
            }
            this.B.setVisibility(0);
            if (com.baidu.platform.comapi.walknavi.g.e.d().f()) {
                b(true);
            }
            if (z7) {
                return;
            }
            this.f10235q.clearAnimation();
            this.f10235q.startAnimation(this.J);
            this.B.clearAnimation();
            this.B.startAnimation(this.J);
            if (this.Q == 2) {
                com.baidu.platform.comapi.walknavi.b.n().l().run("[2D正北]按钮点击");
                return;
            } else {
                com.baidu.platform.comapi.walknavi.b.n().l().run("[3D车头向上]按钮点击");
                return;
            }
        }
        if (com.baidu.platform.comapi.h.c.b().d()) {
            this.G = true;
            if (z7) {
                this.f10235q.setVisibility(8);
                this.B.setVisibility(8);
                this.f10237r.setVisibility(8);
            } else {
                this.f10235q.setVisibility(8);
                this.f10235q.startAnimation(this.I);
                this.B.startAnimation(this.I);
                this.f10237r.setVisibility(8);
                this.I.setAnimationListener(new d());
            }
            com.baidu.platform.comapi.walknavi.b.n().s().a(true);
            this.f10213f.postDelayed(this.f10234p0, 500L);
        }
    }

    private void a(RelativeLayout relativeLayout) {
        CheckBox checkBox = (CheckBox) relativeLayout.findViewById(R.id.sound_check);
        this.f10220i0 = checkBox;
        checkBox.setOnCheckedChangeListener(this);
        if (com.baidu.platform.comapi.walknavi.b.n().u() == 4) {
            this.f10220i0.setClickable(false);
        }
        CheckBox checkBox2 = (CheckBox) relativeLayout.findViewById(R.id.pano_check);
        this.f10222j0 = checkBox2;
        checkBox2.setOnCheckedChangeListener(this);
        this.f10228m0 = relativeLayout.findViewById(R.id.pano_switch_layout);
        this.f10230n0 = (ImageView) relativeLayout.findViewById(R.id.divider_line2);
        u();
        CheckBox checkBox3 = (CheckBox) relativeLayout.findViewById(R.id.threeD_check);
        this.f10224k0 = checkBox3;
        checkBox3.setOnCheckedChangeListener(this);
        Button button = (Button) relativeLayout.findViewById(R.id.switch_hide_btn);
        this.f10226l0 = button;
        button.setOnClickListener(new e());
    }

    public void a(int i8) {
        if (i8 == R.drawable.wsdk_drawable_rg_ic_walk_bike3d_new) {
            this.f10219i.setImageDrawable(com.baidu.platform.comapi.h.t.p.a.a(this.f10207c, this.f10212e0.X()));
            this.f10229n = 1;
        } else {
            if (i8 == R.drawable.wsdk_drawable_rg_ic_north_walk_bike2d) {
                this.f10219i.setImageDrawable(com.baidu.platform.comapi.h.t.p.a.a(this.f10207c, this.f10212e0.W()));
                this.f10229n = 2;
                return;
            }
            int i9 = R.drawable.wsdk_drawable_rg_ic_locate_walk_bike_point;
            if (i8 == i9) {
                this.f10219i.setImageDrawable(com.baidu.platform.comapi.h.t.p.a.a(this.f10207c, i9));
                this.f10229n = 3;
            }
        }
    }

    public void a(boolean z7) {
        if (z7) {
            com.baidu.platform.comapi.walknavi.b.n().s().a(false);
            com.baidu.platform.comapi.walknavi.g.e.d().k();
            com.baidu.platform.comapi.wnplatform.tts.c.a().a(false);
            return;
        }
        com.baidu.platform.comapi.walknavi.g.e.d().j();
    }

    private void a(String str, w wVar) {
        com.baidu.platform.comapi.h.q.a.a().a(ARConfigKey.OLD_AR_KEY, str);
        com.baidu.platform.comapi.walknavi.g.e.d().b(str, new j(wVar));
    }

    public void a(String str, y yVar) {
        String a8 = com.baidu.platform.comapi.walknavi.b.n().x().a(str, "");
        if (!TextUtils.isEmpty(a8)) {
            a(str, a8);
            return;
        }
        this.R = com.baidu.platform.comapi.walknavi.g.e.d().d(str);
        if (!com.baidu.platform.comapi.walknavi.g.e.d().c(str) && !this.N) {
            String str2 = this.R + File.separator + com.moyoung.dafit.module.common.utils.u.LANGUAGE_AR;
            if (com.baidu.platform.comapi.h.c.b().d()) {
                b(str, str2);
                if (yVar != null) {
                    yVar.onSuccess();
                    return;
                }
                return;
            }
            return;
        }
        a(str, new l(str, yVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011b, code lost:
    
        if (r10.equals("turnAndSayHi") == false) goto L32;
     */
    @Override // com.baidu.platform.comapi.walknavi.g.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i8, HashMap<String, Object> hashMap) {
        Runnable runnable;
        com.baidu.platform.comapi.h.g.a.c("NpcSDKManagerImp", "messageType:" + i8);
        if (i8 == 1) {
            if (((Integer) hashMap.get("succeeded")).intValue() == 1) {
                com.baidu.platform.comapi.walknavi.g.e.d().c(true);
                com.baidu.platform.comapi.walknavi.g.e.d().n();
                r();
                com.baidu.platform.comapi.walknavi.g.e.d().o();
                com.baidu.platform.comapi.walknavi.g.e.d().b("\npod_node:stop_action(id_play_music)\nid_play_music = pod_node:play_audio(\"res/media/start.mp3\", -1, 0)\n\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"enter\"\nfunction run()\n    local cfg = an.ActionPriorityConfig:new()\n    cfg.forward_logic = 1\n    cfg.backward_logic = 1\n    local param = an.GpbAnimationParam:new()\n    param._speed = 1.0\n    param._repeat_count = 1\n    param._name = pod_name\n    local id_play_pod = pod_node:play_gpb_animation(param, cfg)\n    if id_play_pod == -1 then\n        local mapData = an.MapData:new()\n        mapData:put_string(\"action_type\", \"animation_failed\")\n        mapData:put_string(\"token\", token)\n        lua_handler:send_message_tosdk(mapData)\n        return\n    end\n    \n    local podFinishedHandlerId = lua_handler:register_handle(\"onEnterPlayPodFinished\")\n    pod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\n\nfunction onEnterPlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"action_name\", \"enter\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n", RGState.METHOD_NAME_ENTER);
            }
            return;
        }
        char c8 = 4;
        if (i8 != 2) {
            if (i8 != 3) {
                if (i8 == 4 && hashMap.containsKey("url")) {
                    String str = (String) hashMap.get("url");
                    if (com.baidu.platform.comapi.walknavi.b.n().x().a("WALKNAVI_VOICE_ON_OFF", true)) {
                        com.baidu.platform.comapi.h.t.l.a().a(str);
                        return;
                    }
                    return;
                }
                return;
            }
            if (System.currentTimeMillis() - this.X >= 300) {
                this.Y = true;
                this.X = System.currentTimeMillis();
                this.f10213f.postDelayed(this.f10236q0, 500L);
                return;
            } else {
                if (this.Y) {
                    this.Y = false;
                    this.X = System.currentTimeMillis();
                    Handler handler = this.f10213f;
                    if (handler != null && (runnable = this.f10236q0) != null) {
                        handler.removeCallbacks(runnable);
                    }
                    com.baidu.platform.comapi.walknavi.g.e.d().o();
                    com.baidu.platform.comapi.walknavi.g.e.d().a(false);
                    com.baidu.platform.comapi.walknavi.g.e.d().b("\npod_node:stop_action(id_play_music)\nid_play_music = pod_node:play_audio(\"res/media/tap2.mp3\", -1, 0)\n\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"multiClickAndTumble\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 0\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.2\nparam._repeat_count = 1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onMultiClickAndTumblePlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onMultiClickAndTumblePlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"action_name\", \"multiClickAndTumble\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "multiClickAndTumble");
                    return;
                }
                return;
            }
        }
        if (hashMap == null || hashMap.isEmpty() || !hashMap.containsKey("action_name")) {
            return;
        }
        String str2 = (String) hashMap.get("action_name");
        com.baidu.platform.comapi.h.g.a.c("NpcSDKManagerImp", "animation end:" + str2);
        str2.hashCode();
        switch (str2.hashCode()) {
            case -1672022665:
                if (str2.equals("multiClickAndTumble")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -1311375678:
                if (str2.equals("withoutGPS")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -789059494:
                if (str2.equals("helpless")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -788629758:
                if (str2.equals("turnAndGuide")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -778128814:
                break;
            case -420935824:
                if (str2.equals("turnAndCry")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case -136570977:
                if (str2.equals("turnRight")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case 96667352:
                if (str2.equals(RGState.METHOD_NAME_ENTER)) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case 133959204:
                if (str2.equals("turnLeft")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case 1746496772:
                if (str2.equals("achieveGoal")) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                com.baidu.platform.comapi.walknavi.g.e.d().a(true);
                com.baidu.platform.comapi.walknavi.g.e.d().b(true);
                this.Y = true;
                break;
            case 1:
                com.baidu.platform.comapi.walknavi.g.e.d().b(true);
                break;
            case 2:
                com.baidu.platform.comapi.walknavi.g.e.d().b(true);
                break;
            case 3:
                com.baidu.platform.comapi.walknavi.g.e.d().a(true);
                com.baidu.platform.comapi.walknavi.g.e.d().b(true);
                break;
            case 4:
                com.baidu.platform.comapi.walknavi.g.e.d().a(true);
                com.baidu.platform.comapi.walknavi.g.e.d().b(true);
                break;
            case 5:
                com.baidu.platform.comapi.walknavi.g.e.d().b(true);
                break;
            case 6:
                com.baidu.platform.comapi.walknavi.g.e.d().b(true);
                com.baidu.platform.comapi.walknavi.g.e.d().a(true);
                break;
            case 7:
                com.baidu.platform.comapi.walknavi.g.e.d().a(true);
                com.baidu.platform.comapi.walknavi.g.e.d().b(true);
                com.baidu.platform.comapi.walknavi.g.e.d().b("\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"stopBreath\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 0\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\nparam._repeat_count = -1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onStopBreathPlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onStopBreathPlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n \nlocal onClickHandler = lua_handler:register_handle(\"onStopBreathClick\")\ncurrent_scene:set_event_handler(0, onClickHandler)\nfunction onStopBreathClick()\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_type\", \"click\")\n    mapData:put_string(\"name\", pod_name)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "stopBreath");
                break;
            case '\b':
                com.baidu.platform.comapi.walknavi.g.e.d().b(true);
                com.baidu.platform.comapi.walknavi.g.e.d().a(true);
                break;
            case '\t':
                com.baidu.platform.comapi.walknavi.g.e.d().o();
                com.baidu.platform.comapi.walknavi.g.e.d().b(false);
                com.baidu.platform.comapi.walknavi.g.e.d().a(false);
                break;
        }
    }
}
