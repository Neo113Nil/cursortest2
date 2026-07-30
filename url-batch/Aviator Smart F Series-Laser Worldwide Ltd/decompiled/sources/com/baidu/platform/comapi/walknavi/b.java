package com.baidu.platform.comapi.walknavi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.baidu.baidumapsdk_api.R;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.location.LocationConst;
import com.baidu.mapapi.bikenavi.adapter.IBNaviStatusListener;
import com.baidu.mapapi.bikenavi.adapter.IBRouteGuidanceListener;
import com.baidu.mapapi.bikenavi.model.BikeNaviDisplayOption;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.MapBound;
import com.baidu.mapapi.walknavi.adapter.IWMoreNPCModelOnClickListener;
import com.baidu.mapapi.walknavi.adapter.IWNPCEngineInitListener;
import com.baidu.mapapi.walknavi.adapter.IWNPCLoadAndInitListener;
import com.baidu.mapapi.walknavi.adapter.IWNaviStatusListener;
import com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener;
import com.baidu.mapapi.walknavi.adapter.IWalkArInitListener;
import com.baidu.mapapi.walknavi.model.BaseNpcModel;
import com.baidu.mapapi.walknavi.model.WalkNaviDisplayOption;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.h.t.k;
import com.baidu.platform.comapi.h.t.n;
import com.baidu.platform.comapi.h.t.o;
import com.baidu.platform.comapi.walknavi.fsm.WGuideFSM;
import com.baidu.platform.comapi.walknavi.k.b;
import com.baidu.platform.comapi.walknavi.widget.b;
import com.baidu.platform.comapi.walknavi.widget.d.b;
import com.baidu.platform.comapi.wnplatform.model.OverLookingMode;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer;
import com.baidu.platform.comjni.jninative.tts.WNaviTTSPlayer;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements com.baidu.platform.comapi.walknavi.k.f.a {

    /* renamed from: a, reason: collision with root package name */
    public static int f9854a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f9855b = 1;
    private Context A;
    private Context B;
    private Handler C;
    private int D;
    private int E;
    private LatLng F;
    private LatLng G;
    private com.baidu.platform.comapi.wnplatform.model.e H;
    private int I;
    private int J;
    private boolean K;
    private WalkNaviDisplayOption L;
    private BikeNaviDisplayOption M;
    private ArrayList<com.baidu.platform.comapi.walknavi.g.a> N;
    private ArrayList<BaseNpcModel> O;
    private Bitmap P;
    private Bitmap Q;
    private IWalkArInitListener R;
    private boolean S;
    private int T;
    private float U;
    private com.baidu.platform.comapi.walknavi.widget.b V;
    private boolean W;
    private int X;
    private Context Y;
    private FrameLayout Z;

    /* renamed from: a0, reason: collision with root package name */
    private final BroadcastReceiver f9856a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f9857b0;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.e.b f9858c;

    /* renamed from: d, reason: collision with root package name */
    private com.baidu.platform.comapi.h.n.h f9859d;

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.platform.comapi.h.e.a f9860e;

    /* renamed from: f, reason: collision with root package name */
    private com.baidu.platform.comapi.h.m.f f9861f;

    /* renamed from: g, reason: collision with root package name */
    private WGuideFSM f9862g;

    /* renamed from: h, reason: collision with root package name */
    private com.baidu.platform.comapi.wnplatform.walkmap.c f9863h;

    /* renamed from: i, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.c.a f9864i;

    /* renamed from: j, reason: collision with root package name */
    private n f9865j;

    /* renamed from: k, reason: collision with root package name */
    private BaseTTSPlayer f9866k;

    /* renamed from: l, reason: collision with root package name */
    private com.baidu.platform.comapi.h.o.c f9867l;

    /* renamed from: m, reason: collision with root package name */
    private com.baidu.platform.comapi.h.f.d f9868m;

    /* renamed from: n, reason: collision with root package name */
    private com.baidu.platform.comapi.wnplatform.model.c f9869n;

    /* renamed from: o, reason: collision with root package name */
    private com.baidu.platform.comapi.h.s.b f9870o;

    /* renamed from: p, reason: collision with root package name */
    private com.baidu.platform.comapi.h.s.b f9871p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f9872q;

    /* renamed from: r, reason: collision with root package name */
    private com.baidu.platform.comapi.h.r.a f9873r;

    /* renamed from: s, reason: collision with root package name */
    private com.baidu.platform.comapi.h.d.a f9874s;

    /* renamed from: t, reason: collision with root package name */
    private WalkPlan f9875t;

    /* renamed from: u, reason: collision with root package name */
    private com.baidu.platform.comapi.h.k.b f9876u;

    /* renamed from: v, reason: collision with root package name */
    private IWNaviStatusListener f9877v;

    /* renamed from: w, reason: collision with root package name */
    private IBNaviStatusListener f9878w;

    /* renamed from: x, reason: collision with root package name */
    private int f9879x;

    /* renamed from: y, reason: collision with root package name */
    private int f9880y;

    /* renamed from: z, reason: collision with root package name */
    private Bundle f9881z;

    class a implements com.baidu.platform.comapi.walknavi.g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IWNPCEngineInitListener f9882a;

        a(IWNPCEngineInitListener iWNPCEngineInitListener) {
            this.f9882a = iWNPCEngineInitListener;
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
                b.this.S = true;
                this.f9882a.onSuccess();
                return;
            }
            if (i8 == 2 || i8 == 4 || i8 == 3) {
                b.this.S = false;
                this.f9882a.onFail("您的手机暂不支持3D模型导航");
                return;
            }
            if (i8 == 1) {
                b.this.S = false;
                this.f9882a.onFail("当前网络异常，请稍候再试");
            } else if (i8 == 6 || i8 == 5 || i8 == -1) {
                b.this.S = false;
                this.f9882a.onFail("初始化失败，请稍候再试");
            } else {
                b.this.S = false;
                this.f9882a.onFail("未知错误导致初始化失败");
            }
        }
    }

    /* renamed from: com.baidu.platform.comapi.walknavi.b$b, reason: collision with other inner class name */
    class RunnableC0120b implements Runnable {
        RunnableC0120b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.baidu.platform.comapi.h.c.b().g()) {
                b.this.l().run("[查看全览]按钮点击");
            } else {
                b.this.l().runEntryState();
            }
            if (!com.baidu.platform.comapi.h.c.b().f() || b.this.H == null) {
                return;
            }
            b.n().t().e().getMap().switchBaseIndoorMapFloor(b.this.H.b(), b.this.H.a());
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9885a;

        c(String str) {
            this.f9885a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.l().setInitialState(this.f9885a);
            b.this.l().runCurrentState();
        }
    }

    class d implements b.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WifiManager f9887a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.z f9888b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9889c;

        d(WifiManager wifiManager, b.z zVar, int i8) {
            this.f9887a = wifiManager;
            this.f9888b = zVar;
            this.f9889c = i8;
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            this.f9887a.setWifiEnabled(true);
            b.z zVar = this.f9888b;
            if (zVar != null) {
                zVar.b(this.f9889c);
            }
        }
    }

    class e implements b.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.z f9891a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9892b;

        e(b.z zVar, int i8) {
            this.f9891a = zVar;
            this.f9892b = i8;
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.b.c
        public void a() {
            b.z zVar = this.f9891a;
            if (zVar != null) {
                zVar.a(this.f9892b);
            }
        }
    }

    class f implements b.z {
        f() {
        }

        @Override // com.baidu.platform.comapi.walknavi.k.b.z
        public void a() {
        }

        @Override // com.baidu.platform.comapi.walknavi.k.b.z
        public void b(int i8) {
        }

        @Override // com.baidu.platform.comapi.walknavi.k.b.z
        public void a(int i8) {
            b.n().H().e();
        }
    }

    class g implements WalkNaviModeSwitchListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9896b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.n().c(1);
            }
        }

        g(int i8, boolean z7) {
            this.f9895a = i8;
            this.f9896b = z7;
        }

        @Override // com.baidu.platform.comapi.walknavi.WalkNaviModeSwitchListener
        public void onFailed() {
        }

        @Override // com.baidu.platform.comapi.walknavi.WalkNaviModeSwitchListener
        public void onSuccess() {
            b.this.X = this.f9895a;
            if (b.this.f9870o != null && (b.this.f9870o instanceof com.baidu.platform.comapi.walknavi.k.b)) {
                ((com.baidu.platform.comapi.walknavi.k.b) b.this.f9870o).b(this.f9895a, this.f9896b);
            }
            if (com.baidu.platform.comapi.h.c.b().h()) {
                b.n().c(0);
            } else if (com.baidu.platform.comapi.h.c.b().d()) {
                new Handler(Looper.myLooper()).postDelayed(new a(), 400L);
            } else if (com.baidu.platform.comapi.h.c.b().g()) {
                b.n().c(3);
            }
        }
    }

    class h extends BroadcastReceiver {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.a(b.this.A, com.baidu.platform.comapi.walknavi.d.a.f9923a);
            }
        }

        h() {
        }

        private void a(Context context) {
            int b8 = k.b(b.this.A);
            if (b8 != 0) {
                com.baidu.platform.comapi.walknavi.d.a.f9923a = b8;
                k.a(b.this.A, 0);
            }
        }

        private void b(Context context) {
            b.this.C.postDelayed(new a(), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra(LocationConst.HDYawConst.KEY_HD_YAW_STATE);
            if (TelephonyManager.EXTRA_STATE_RINGING.equals(stringExtra)) {
                a(context);
            } else if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(stringExtra)) {
                a(context);
            } else if (TelephonyManager.EXTRA_STATE_IDLE.equals(stringExtra)) {
                b(context);
            }
        }
    }

    static class i {

        /* renamed from: a, reason: collision with root package name */
        static final b f9901a = new b(null);
    }

    public enum j {
        NORMAL(0),
        AR(1),
        LIGHT(3);


        /* renamed from: e, reason: collision with root package name */
        private final int f9906e;

        j(int i8) {
            this.f9906e = i8;
        }

        public int a() {
            return this.f9906e;
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    private void Q() {
        if (com.baidu.platform.comapi.h.c.b().j()) {
            this.f9866k = new com.baidu.platform.comapi.walknavi.j.a();
        } else if (com.baidu.platform.comapi.h.c.b().e()) {
            this.f9866k = new com.baidu.platform.comapi.b.b.a();
        }
    }

    private void d0() {
        com.baidu.platform.comapi.walknavi.d.a.f9924b = 19;
    }

    private void e0() {
        if (com.baidu.platform.comapi.h.c.b().j()) {
            if (n().x().a("WALKNAVI_THREED_MAP_ON_OFF", true)) {
                n().a(OverLookingMode.OverLooking_3D);
            } else {
                n().a(OverLookingMode.OverLooking_2D);
            }
        }
    }

    private void k0() {
        BroadcastReceiver broadcastReceiver;
        try {
            Context context = this.A;
            if (context == null || (broadcastReceiver = this.f9856a0) == null) {
                return;
            }
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e8) {
            com.baidu.platform.comapi.h.g.a.b(e8.getMessage());
        }
    }

    private int m() {
        int k8 = H() != null ? H().k() : 0;
        if (k8 <= 0) {
            return 12;
        }
        return k8;
    }

    public static b n() {
        return i.f9901a;
    }

    public int A() {
        return this.T;
    }

    public com.baidu.platform.comapi.h.n.h B() {
        if (this.f9859d == null) {
            this.f9859d = new com.baidu.platform.comapi.h.n.h();
        }
        return this.f9859d;
    }

    public com.baidu.platform.comapi.h.o.c C() {
        if (this.f9867l == null) {
            this.f9867l = new com.baidu.platform.comapi.h.o.c();
        }
        return this.f9867l;
    }

    public LatLng D() {
        return this.F;
    }

    public Point E() {
        return CoordUtil.ll2point(this.F);
    }

    public BaseTTSPlayer F() {
        return this.f9866k;
    }

    public com.baidu.platform.comapi.h.r.a G() {
        if (this.f9873r == null) {
            this.f9873r = new com.baidu.platform.comapi.h.r.a();
        }
        return this.f9873r;
    }

    public com.baidu.platform.comapi.h.s.b H() {
        return n().k() == j.LIGHT.a() ? this.f9871p : this.f9870o;
    }

    public boolean I() {
        return x().a("WALKNAVI_FIRST_CLICK_NORMAL_AR_ENTRANCE", true);
    }

    public WalkNaviDisplayOption J() {
        return this.L;
    }

    public int K() {
        return this.X;
    }

    public ArrayList<BaseNpcModel> L() {
        ArrayList<BaseNpcModel> arrayList = this.O;
        if (arrayList == null || arrayList.size() == 0) {
            b((ArrayList<BaseNpcModel>) null);
        }
        return this.O;
    }

    public ArrayList<com.baidu.platform.comapi.walknavi.g.a> M() {
        ArrayList<com.baidu.platform.comapi.walknavi.g.a> arrayList = this.N;
        if (arrayList == null || arrayList.size() == 0) {
            a((ArrayList<BaseNpcModel>) null);
        }
        return this.N;
    }

    public WalkPlan N() {
        return this.f9875t;
    }

    public boolean O() {
        SensorManager sensorManager;
        List<Sensor> sensorList;
        Iterator<Sensor> it;
        Context a8 = com.baidu.platform.comapi.h.t.q.a.a();
        if (a8 == null || (sensorManager = (SensorManager) a8.getSystemService("sensor")) == null || (sensorList = sensorManager.getSensorList(-1)) == null || (it = sensorList.iterator()) == null) {
            return true;
        }
        while (it.hasNext()) {
            if (it.next().getType() == 11) {
                return true;
            }
        }
        return false;
    }

    public void P() {
        t().h();
    }

    public boolean R() {
        return this.K;
    }

    public boolean S() {
        return this.f9880y != 0;
    }

    public void T() {
        if (n().t().f10552d) {
            n().t().n();
        } else {
            l().run("[查看全览]按钮点击");
        }
    }

    public void U() {
        com.baidu.platform.comapi.h.s.b bVar;
        com.baidu.platform.comapi.walknavi.k.f.c B;
        if (!com.baidu.platform.comapi.walknavi.g.e.d().f() || (bVar = this.f9870o) == null || !(bVar instanceof com.baidu.platform.comapi.walknavi.k.b) || (B = ((com.baidu.platform.comapi.walknavi.k.b) bVar).B()) == null) {
            return;
        }
        B.b(false);
    }

    public void V() {
        if (com.baidu.platform.comapi.walknavi.g.e.d().f()) {
            com.baidu.platform.comapi.walknavi.g.e.d().l();
        }
    }

    public void W() {
        U();
        com.baidu.platform.comapi.h.o.c cVar = this.f9867l;
        if (cVar != null) {
            cVar.d();
        }
        com.baidu.platform.comapi.h.s.b bVar = this.f9870o;
        if (bVar != null) {
            bVar.a((com.baidu.platform.comapi.walknavi.k.f.a) null);
            this.f9870o.p();
        }
        com.baidu.platform.comapi.h.s.b bVar2 = this.f9871p;
        if (bVar2 != null) {
            bVar2.a((com.baidu.platform.comapi.walknavi.k.f.a) null);
            this.f9871p.p();
        }
    }

    public void X() {
        s().b();
    }

    public void Y() {
        this.W = false;
        com.baidu.platform.comapi.walknavi.g.e.d().i();
        com.baidu.platform.comapi.h.e.a aVar = this.f9860e;
        if (aVar != null && aVar.p()) {
            this.f9860e.z();
        }
        if (this.f9863h != null) {
            n().t().d(0);
        }
        n().t().l();
        n().f(false);
        k0();
        Z();
        this.K = false;
    }

    public void Z() {
        com.baidu.platform.comapi.h.t.d.a(this.A);
        this.f9880y = 0;
        this.f9877v = null;
        this.f9878w = null;
        com.baidu.platform.comapi.h.s.b bVar = this.f9870o;
        if (bVar != null) {
            bVar.a((com.baidu.platform.comapi.walknavi.k.f.a) null);
            this.f9870o.release();
            this.f9870o = null;
        }
        com.baidu.platform.comapi.h.s.b bVar2 = this.f9871p;
        if (bVar2 != null) {
            bVar2.a((com.baidu.platform.comapi.walknavi.k.f.a) null);
            this.f9871p.release();
            this.f9871p = null;
        }
        com.baidu.platform.comapi.h.n.h hVar = this.f9859d;
        if (hVar != null) {
            hVar.release();
            this.f9859d = null;
        }
        com.baidu.platform.comapi.h.e.a aVar = this.f9860e;
        if (aVar != null) {
            aVar.release();
            this.f9860e = null;
        }
        com.baidu.platform.comapi.h.m.f fVar = this.f9861f;
        if (fVar != null) {
            fVar.release();
            this.f9861f = null;
        }
        WGuideFSM wGuideFSM = this.f9862g;
        if (wGuideFSM != null) {
            wGuideFSM.release();
            this.f9862g = null;
        }
        com.baidu.platform.comapi.wnplatform.walkmap.c cVar = this.f9863h;
        if (cVar != null) {
            cVar.release();
            this.f9863h = null;
        }
        if (this.f9864i != null) {
            throw null;
        }
        n nVar = this.f9865j;
        if (nVar != null) {
            nVar.release();
            this.f9865j = null;
        }
        com.baidu.platform.comapi.h.o.c cVar2 = this.f9867l;
        if (cVar2 != null) {
            cVar2.release();
            this.f9867l = null;
        }
        com.baidu.platform.comapi.h.f.d dVar = this.f9868m;
        if (dVar != null) {
            dVar.release();
            this.f9868m = null;
        }
        com.baidu.platform.comapi.wnplatform.model.c cVar3 = this.f9869n;
        if (cVar3 != null) {
            cVar3.release();
            this.f9869n = null;
        }
        com.baidu.platform.comapi.h.r.a aVar2 = this.f9873r;
        if (aVar2 != null) {
            aVar2.release();
            this.f9873r = null;
        }
        com.baidu.platform.comapi.h.k.b bVar3 = this.f9876u;
        if (bVar3 != null) {
            bVar3.release();
            this.f9876u = null;
        }
        if (this.f9874s != null) {
            throw null;
        }
        ArrayList<com.baidu.platform.comapi.walknavi.g.a> arrayList = this.N;
        if (arrayList != null) {
            arrayList.clear();
            this.N = null;
        }
        ArrayList<BaseNpcModel> arrayList2 = this.O;
        if (arrayList2 != null) {
            arrayList2.clear();
            this.O = null;
        }
        Bitmap bitmap = this.P;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.P.recycle();
            this.P = null;
        }
        Bitmap bitmap2 = this.Q;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.Q.recycle();
            this.Q = null;
        }
        BaseTTSPlayer baseTTSPlayer = this.f9866k;
        if (baseTTSPlayer != null) {
            baseTTSPlayer.release();
            this.f9866k = null;
        }
        this.f9859d = null;
        this.f9860e = null;
        this.f9861f = null;
        this.f9862g = null;
        this.f9865j = null;
        this.f9867l = null;
        this.f9868m = null;
        this.f9869n = null;
        this.f9870o = null;
        this.f9871p = null;
        this.f9873r = null;
        this.f9881z = null;
        this.f9879x = 0;
        this.A = null;
        this.f9875t = null;
        com.baidu.platform.comapi.walknavi.k.e.b.a();
        o.b().a();
        com.baidu.platform.comapi.h.t.p.a.g();
    }

    public void a(Context context) {
        this.Y = context;
    }

    public void a0() {
        if (this.M != null) {
            this.M = null;
        }
    }

    public void b(LatLng latLng) {
        this.F = latLng;
    }

    public void b0() {
        if (this.L != null) {
            this.L = null;
        }
    }

    public void c0() {
        V();
        if (com.baidu.platform.comapi.h.c.b().e()) {
            t().d(1);
        } else if (com.baidu.platform.comapi.h.c.b().j()) {
            if (K() == 1) {
                t().d(1);
            } else if (K() == 2) {
                t().d(0);
            }
        }
        if (this.f9870o != null) {
            C().a(this.A, this.f9870o.l());
            this.f9870o.a(this);
            this.f9870o.r();
        }
        if (this.f9871p != null) {
            C().a(this.A, this.f9871p.l());
            this.f9871p.a(this);
            this.f9871p.r();
        }
        if (n().t().f10552d) {
            n().t().n();
        } else {
            l().runCurrentState();
        }
    }

    public IWalkArInitListener d() {
        return this.R;
    }

    public BikeNaviDisplayOption e() {
        return this.M;
    }

    public Context f() {
        return this.A;
    }

    public void f0() {
        int i8;
        int i9;
        if (H() != null) {
            i8 = H().f();
            i9 = H().g();
        } else {
            i8 = 0;
            i9 = 0;
        }
        t().a(i8, i9);
    }

    public void g(int i8) {
        s().c(i8);
    }

    public boolean g0() {
        if (this.f9880y < 2) {
            return false;
        }
        this.K = true;
        MapStatus d8 = t().d();
        this.f9880y = 3;
        com.baidu.platform.comapi.h.s.b bVar = this.f9870o;
        if (bVar != null && (bVar instanceof com.baidu.platform.comapi.walknavi.k.b)) {
            bVar.o();
        }
        t().d(1);
        s().h(m());
        if (com.baidu.platform.comapi.walknavi.k.e.b.f10196a != 4) {
            if (com.baidu.platform.comapi.h.c.b().d()) {
                c(j.AR.a());
            } else if (com.baidu.platform.comapi.h.c.b().g()) {
                c(j.LIGHT.a());
            } else {
                c(j.NORMAL.a());
            }
            if (E() != null) {
                s().a(E().f8789x, E().f8790y, 0, (String) null, (String) null);
            }
            s().y();
        }
        n().s().c(true);
        t().a(d8);
        if (com.baidu.platform.comapi.walknavi.k.e.b.f10196a == 4) {
            s().u();
            return true;
        }
        this.C.postDelayed(new RunnableC0120b(), 500L);
        return true;
    }

    public LatLng h() {
        return this.G;
    }

    public void h0() {
        n().f(true);
        if (com.baidu.platform.comapi.h.c.b().h()) {
            t().e().getMap().setMapStatus(MapStatusUpdateFactory.newMapStatus(new MapStatus.Builder(t().e().getMap().getMapStatus()).zoom(22.0f).build()));
            if ("[3D车头向上]按钮点击".equals(n().l().getCurrentEvent())) {
                n().l().run("[3D车头向上]按钮点击");
            }
        }
    }

    public void i(int i8) {
        this.T = i8;
    }

    public void i0() {
        this.f9858c.f();
    }

    public com.baidu.platform.comapi.h.j.a j() {
        com.baidu.platform.comapi.walknavi.e.b bVar = this.f9858c;
        if (bVar == null) {
            return null;
        }
        return bVar.b();
    }

    public void j0() {
        com.baidu.platform.comapi.walknavi.e.b bVar = this.f9858c;
        if (bVar != null) {
            bVar.release();
        }
    }

    public int k() {
        return this.E;
    }

    public WGuideFSM l() {
        if (this.f9862g == null) {
            this.f9862g = new WGuideFSM();
        }
        return this.f9862g;
    }

    public void l0() {
        if (S()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_token", true);
            bundle.putBoolean("is_phoneinfo", true);
            Set<String> keySet = bundle.keySet();
            if (keySet == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str : keySet) {
                    if (!TextUtils.equals(str, "glr") && !TextUtils.equals(str, "glv")) {
                        jSONObject.put(str, String.valueOf(bundle.get(str)));
                    }
                }
                n().s().b(jSONObject.toString());
            } catch (Exception e8) {
                com.baidu.platform.comapi.h.g.a.b(e8.getMessage());
            }
        }
    }

    public boolean o() {
        return this.f9857b0;
    }

    public Bundle[] p() {
        return s().i();
    }

    public com.baidu.platform.comapi.h.f.d q() {
        if (this.f9868m == null) {
            this.f9868m = new com.baidu.platform.comapi.h.f.d();
        }
        return this.f9868m;
    }

    public boolean r() {
        com.baidu.platform.comapi.walknavi.e.b bVar = this.f9858c;
        return bVar != null && bVar.e() > 0;
    }

    public com.baidu.platform.comapi.h.e.a s() {
        if (this.f9860e == null) {
            this.f9860e = new com.baidu.platform.comapi.h.e.a();
        }
        return this.f9860e;
    }

    public com.baidu.platform.comapi.wnplatform.walkmap.c t() {
        if (this.f9863h == null) {
            this.f9863h = new com.baidu.platform.comapi.wnplatform.walkmap.c();
        }
        return this.f9863h;
    }

    public int u() {
        return this.D;
    }

    public MapBound v() {
        new Bundle();
        Bundle k8 = n().s().k();
        if (k8 == null) {
            return null;
        }
        int i8 = k8.getInt(TtmlNode.LEFT);
        int i9 = k8.getInt("bottom");
        int i10 = k8.getInt(TtmlNode.RIGHT);
        int i11 = k8.getInt("top");
        MapBound mapBound = new MapBound();
        mapBound.setPtLB(new Point(i8, i9));
        mapBound.setPtRT(new Point(i10, i11));
        return mapBound;
    }

    public int w() {
        return this.I;
    }

    public n x() {
        if (this.f9865j == null) {
            this.f9865j = new n();
        }
        return this.f9865j;
    }

    public Bundle y() {
        return this.f9881z;
    }

    public com.baidu.platform.comapi.h.m.f z() {
        if (this.f9861f == null) {
            this.f9861f = new com.baidu.platform.comapi.h.m.f();
        }
        return this.f9861f;
    }

    private b() {
        this.f9858c = null;
        this.f9859d = null;
        this.f9860e = null;
        this.f9861f = null;
        this.f9862g = null;
        this.f9863h = null;
        this.f9865j = null;
        this.f9866k = null;
        this.f9867l = null;
        this.f9868m = null;
        this.f9869n = null;
        this.f9870o = null;
        this.f9871p = null;
        this.f9872q = true;
        this.f9873r = null;
        this.f9875t = null;
        this.f9876u = null;
        this.f9877v = null;
        this.f9878w = null;
        this.f9879x = 0;
        this.f9880y = 0;
        this.f9881z = new Bundle();
        this.C = new Handler();
        this.I = -1;
        this.J = -1;
        this.K = false;
        this.N = new ArrayList<>();
        this.O = new ArrayList<>();
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.T = 0;
        this.U = 0.0f;
        this.W = false;
        this.f9856a0 = new h();
        this.f9857b0 = false;
    }

    public void a(FrameLayout frameLayout) {
        this.Z = frameLayout;
    }

    public void b(String str) {
    }

    public void c() {
        t().b();
    }

    public void d(int i8) {
        this.E = i8;
    }

    public void e(int i8) {
        s().g(i8);
    }

    public void f(int i8) {
        this.D = i8;
    }

    public com.baidu.platform.comapi.wnplatform.model.c g() {
        if (this.f9869n == null) {
            this.f9869n = new com.baidu.platform.comapi.wnplatform.model.c();
        }
        return this.f9869n;
    }

    public void h(int i8) {
        s().k(i8);
    }

    public com.baidu.platform.comapi.walknavi.e.b i() {
        if (this.f9858c == null) {
            this.f9858c = new com.baidu.platform.comapi.walknavi.e.b();
        }
        return this.f9858c;
    }

    public void a(WalkPlan walkPlan) {
        this.f9875t = walkPlan;
    }

    public View c(Activity activity) {
        if (com.baidu.platform.comapi.h.c.b().j()) {
            com.baidu.platform.comapi.h.s.b bVar = this.f9871p;
            if (bVar != null && (bVar instanceof com.baidu.platform.comapi.b.c.d)) {
                bVar.a((com.baidu.platform.comapi.walknavi.k.f.a) null);
                this.f9871p.release();
                this.f9871p = null;
            }
            if (this.f9871p == null) {
                this.f9871p = new com.baidu.platform.comapi.walknavi.k.a(activity);
            }
        } else if (com.baidu.platform.comapi.h.c.b().e()) {
            com.baidu.platform.comapi.h.s.b bVar2 = this.f9871p;
            if (bVar2 != null && (bVar2 instanceof com.baidu.platform.comapi.walknavi.k.a)) {
                bVar2.a((com.baidu.platform.comapi.walknavi.k.f.a) null);
                this.f9871p.release();
                this.f9871p = null;
            }
            if (this.f9871p == null) {
                this.f9871p = new com.baidu.platform.comapi.b.c.d(activity);
            }
        }
        return this.f9871p.h();
    }

    public boolean e(boolean z7) {
        return x().b("WALKNAVI_FIRST_CLICK_NORMAL_AR_ENTRANCE", z7);
    }

    public void f(boolean z7) {
        if (z7) {
            com.baidu.platform.comapi.h.t.e.a(true);
            com.baidu.platform.comapi.h.c.b().a(com.baidu.platform.comapi.h.c.b().a() | 4);
        } else {
            com.baidu.platform.comapi.h.t.e.a(false);
            com.baidu.platform.comapi.h.c.b().a(com.baidu.platform.comapi.h.c.b().a() & (-5));
        }
    }

    public void a(BikeNaviDisplayOption bikeNaviDisplayOption) {
        this.M = bikeNaviDisplayOption;
    }

    public View b(Activity activity) {
        if (com.baidu.platform.comapi.h.c.b().j()) {
            com.baidu.platform.comapi.h.s.b bVar = this.f9870o;
            if (bVar != null && (bVar instanceof com.baidu.platform.comapi.b.c.b)) {
                bVar.a((com.baidu.platform.comapi.walknavi.k.f.a) null);
                this.f9870o.release();
                this.f9870o = null;
            }
            if (this.f9870o == null) {
                this.f9870o = new com.baidu.platform.comapi.walknavi.k.b(activity);
            }
        } else if (com.baidu.platform.comapi.h.c.b().e()) {
            com.baidu.platform.comapi.h.s.b bVar2 = this.f9870o;
            if (bVar2 != null && (bVar2 instanceof com.baidu.platform.comapi.walknavi.k.b)) {
                bVar2.a((com.baidu.platform.comapi.walknavi.k.f.a) null);
                this.f9870o.release();
                this.f9870o = null;
            }
            if (this.f9870o == null) {
                this.f9870o = new com.baidu.platform.comapi.b.c.b(activity);
            }
        }
        return this.f9870o.h();
    }

    public void d(boolean z7) {
        s().e(z7);
    }

    public void a(LatLng latLng) {
        this.G = latLng;
    }

    public void a(IWalkArInitListener iWalkArInitListener) {
        this.R = iWalkArInitListener;
    }

    public void a(WalkNaviDisplayOption walkNaviDisplayOption) {
        this.L = walkNaviDisplayOption;
    }

    public void a(com.baidu.platform.comapi.wnplatform.model.e eVar) {
        this.H = eVar;
    }

    public void a(int i8, int i9) {
        com.baidu.platform.comapi.h.c.b().c(i8);
        com.baidu.platform.comapi.h.c.b().b(i9);
        g(i8);
        Q();
    }

    public void c(ArrayList<BaseNpcModel> arrayList) {
        b(arrayList);
        a(arrayList);
    }

    public void b(com.baidu.platform.comapi.h.n.e eVar) {
        B().b(eVar);
    }

    public void a(Activity activity, IWRouteGuidanceListener iWRouteGuidanceListener) {
        a(activity).a(iWRouteGuidanceListener);
    }

    public void b(com.baidu.platform.comapi.h.n.b bVar) {
        B().b(bVar);
    }

    public void c(int i8) {
        com.baidu.platform.comapi.h.e.a aVar = this.f9860e;
        if (aVar != null) {
            aVar.j(i8);
        }
    }

    private void b(ArrayList<BaseNpcModel> arrayList) {
        ArrayList<BaseNpcModel> arrayList2 = this.O;
        if (arrayList2 != null) {
            arrayList2.clear();
        } else {
            this.O = new ArrayList<>();
        }
        if (this.P == null) {
            this.P = BitmapFactory.decodeResource(com.baidu.platform.comapi.h.t.p.a.e(), R.drawable.wsdk_icon_classic);
        }
        BaseNpcModel baseNpcModel = new BaseNpcModel();
        baseNpcModel.setDownLoadKey("");
        baseNpcModel.setIcon(this.P);
        baseNpcModel.setOriginTitle("经典");
        baseNpcModel.setLoadFromLocal(true);
        this.O.add(baseNpcModel);
        if (this.Q == null) {
            this.Q = BitmapFactory.decodeResource(com.baidu.platform.comapi.h.t.p.a.e(), R.drawable.wsdk_icon_tutu);
        }
        BaseNpcModel baseNpcModel2 = new BaseNpcModel();
        baseNpcModel2.setDownLoadKey("10279765");
        baseNpcModel2.setIcon(this.Q);
        baseNpcModel2.setOriginTitle("图图");
        baseNpcModel2.setLoadFromLocal(false);
        this.O.add(baseNpcModel2);
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        this.O.addAll(arrayList);
    }

    public void a(Activity activity, IBRouteGuidanceListener iBRouteGuidanceListener) {
        a(activity).a(iBRouteGuidanceListener);
    }

    public boolean c(boolean z7) {
        return s().d(z7);
    }

    public com.baidu.platform.comapi.h.k.b a(Activity activity) {
        if (this.f9876u == null) {
            this.f9876u = new com.baidu.platform.comapi.h.k.b(activity);
        }
        return this.f9876u;
    }

    public void a(Context context, long j8, com.baidu.platform.comapi.h.j.a aVar, com.baidu.platform.comapi.walknavi.e.a aVar2) {
        if (this.f9858c == null) {
            this.f9858c = new com.baidu.platform.comapi.walknavi.e.b();
        }
        this.f9880y = 1;
        this.f9858c.a(context, j8, aVar, aVar2);
        q().a(context);
        q().c(context);
    }

    public boolean a(long j8) {
        com.baidu.platform.comapi.walknavi.e.b bVar = this.f9858c;
        if (bVar == null) {
            return false;
        }
        return bVar.a(j8);
    }

    public void a(Context context, MapView mapView) {
        t().a(context, mapView);
    }

    public void a(com.baidu.platform.comapi.h.n.e eVar) {
        B().a(eVar);
    }

    public void a(com.baidu.platform.comapi.h.n.b bVar) {
        B().a(bVar);
    }

    public void a(WLocData wLocData) {
        com.baidu.platform.comapi.h.f.d dVar = this.f9868m;
        if (dVar == null || wLocData == null) {
            return;
        }
        dVar.b(wLocData);
    }

    public void a(com.baidu.platform.comapi.wnplatform.tts.b bVar) {
        F().a(bVar);
    }

    private void a(ArrayList<BaseNpcModel> arrayList) {
        ArrayList<com.baidu.platform.comapi.walknavi.g.a> arrayList2 = this.N;
        if (arrayList2 != null) {
            arrayList2.clear();
        } else {
            this.N = new ArrayList<>();
        }
        com.baidu.platform.comapi.walknavi.g.a aVar = new com.baidu.platform.comapi.walknavi.g.a();
        aVar.a("");
        aVar.c("经典");
        aVar.a(true);
        aVar.a(this.P);
        this.N.add(aVar);
        com.baidu.platform.comapi.walknavi.g.a aVar2 = new com.baidu.platform.comapi.walknavi.g.a();
        aVar2.a("10279765");
        aVar2.c("图图");
        aVar2.a(false);
        aVar2.a(this.Q);
        this.N.add(aVar2);
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<BaseNpcModel> it = arrayList.iterator();
        while (it.hasNext()) {
            BaseNpcModel next = it.next();
            com.baidu.platform.comapi.walknavi.g.a aVar3 = new com.baidu.platform.comapi.walknavi.g.a();
            aVar3.a(next.getDownLoadKey());
            aVar3.c(next.getOriginTitle());
            aVar3.d(next.getModelSize());
            aVar3.b(next.getLocalPath());
            aVar3.a(next.getIcon());
            aVar3.a(next.isLoadFromLocal());
            this.N.add(aVar3);
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.k.f.a
    public void b() {
        IWNaviStatusListener iWNaviStatusListener = this.f9877v;
        if (iWNaviStatusListener != null) {
            iWNaviStatusListener.onNaviExit();
        }
        IBNaviStatusListener iBNaviStatusListener = this.f9878w;
        if (iBNaviStatusListener != null) {
            iBNaviStatusListener.onNaviExit();
        }
        Y();
    }

    public MapBound b(int i8) {
        new Bundle();
        Bundle e8 = n().s().e(i8);
        int i9 = e8.getInt(TtmlNode.LEFT);
        int i10 = e8.getInt("bottom");
        int i11 = e8.getInt(TtmlNode.RIGHT);
        int i12 = e8.getInt("top");
        MapBound mapBound = new MapBound();
        mapBound.setPtLB(new Point(i9, i10));
        mapBound.setPtRT(new Point(i11, i12));
        return mapBound;
    }

    public void b(boolean z7) {
        s().c(z7);
    }

    public com.baidu.platform.comapi.walknavi.g.a a(String str) {
        ArrayList<com.baidu.platform.comapi.walknavi.g.a> M = M();
        if (M != null && M.size() != 0) {
            Iterator<com.baidu.platform.comapi.walknavi.g.a> it = M.iterator();
            while (it.hasNext()) {
                com.baidu.platform.comapi.walknavi.g.a next = it.next();
                if (TextUtils.equals(next.a(), str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public void a(BaseNpcModel baseNpcModel) {
        com.baidu.platform.comapi.walknavi.k.f.c B;
        com.baidu.platform.comapi.h.s.b bVar = this.f9870o;
        if (bVar == null || !(bVar instanceof com.baidu.platform.comapi.walknavi.k.b) || (B = ((com.baidu.platform.comapi.walknavi.k.b) bVar).B()) == null) {
            return;
        }
        B.a(baseNpcModel);
    }

    public RelativeLayout a(b.n nVar) {
        com.baidu.platform.comapi.h.s.b bVar = this.f9870o;
        if (bVar instanceof com.baidu.platform.comapi.walknavi.k.b) {
            return ((com.baidu.platform.comapi.walknavi.k.b) bVar).a(nVar);
        }
        return null;
    }

    public void a(IWNPCEngineInitListener iWNPCEngineInitListener) {
        com.baidu.platform.comapi.walknavi.g.e.d().b("10279765", new a(iWNPCEngineInitListener));
    }

    public void a(IWMoreNPCModelOnClickListener iWMoreNPCModelOnClickListener) {
        com.baidu.platform.comapi.walknavi.k.f.c B;
        com.baidu.platform.comapi.h.s.b bVar = this.f9870o;
        if (bVar == null || !(bVar instanceof com.baidu.platform.comapi.walknavi.k.b) || (B = ((com.baidu.platform.comapi.walknavi.k.b) bVar).B()) == null) {
            return;
        }
        B.a(iWMoreNPCModelOnClickListener);
    }

    public void a(IWNPCLoadAndInitListener iWNPCLoadAndInitListener) {
        com.baidu.platform.comapi.walknavi.k.f.c B;
        com.baidu.platform.comapi.h.s.b bVar = this.f9870o;
        if (bVar == null || !(bVar instanceof com.baidu.platform.comapi.walknavi.k.b) || (B = ((com.baidu.platform.comapi.walknavi.k.b) bVar).B()) == null) {
            return;
        }
        B.a(iWNPCLoadAndInitListener);
    }

    public boolean a(Activity activity, Bundle bundle) {
        boolean a8;
        s().v();
        this.A = activity;
        this.B = activity;
        try {
            if (bundle != null) {
                com.baidu.platform.comapi.walknavi.k.e.b.f10196a = bundle.getInt("wnavi_mode", 1);
            } else {
                com.baidu.platform.comapi.walknavi.k.e.b.f10196a = 1;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (n().u() != 4) {
            if (F() != null) {
                F().ready();
            }
            if (com.baidu.platform.comapi.h.c.b().j()) {
                a8 = n().x().a("WALKNAVI_VOICE_ON_OFF", true);
            } else {
                if (com.baidu.platform.comapi.h.c.b().e()) {
                    a8 = n().x().a("BIKENAVI_VOICE_ON_OFF", true);
                }
                WNaviTTSPlayer.resumeVoiceTTSOutput();
            }
            if (!a8) {
                WNaviTTSPlayer.pauseVoiceTTSOutput();
            }
            WNaviTTSPlayer.resumeVoiceTTSOutput();
        } else {
            WNaviTTSPlayer.pauseVoiceTTSOutput();
        }
        int k8 = k();
        j jVar = j.LIGHT;
        if (k8 == jVar.a()) {
            WNaviTTSPlayer.pauseVoiceTTSOutput();
        }
        t().ready();
        if (k() == jVar.a()) {
            if (this.f9871p == null) {
                if (com.baidu.platform.comapi.h.c.b().j()) {
                    this.f9871p = new com.baidu.platform.comapi.walknavi.k.a(activity);
                } else if (com.baidu.platform.comapi.h.c.b().e()) {
                    this.f9871p = new com.baidu.platform.comapi.b.c.d(activity);
                }
            }
            com.baidu.platform.comapi.h.s.b bVar = this.f9871p;
            if (bVar == null || bVar.d()) {
                return false;
            }
            this.f9871p.ready();
        } else {
            if (this.f9870o == null) {
                if (com.baidu.platform.comapi.h.c.b().j()) {
                    this.f9870o = new com.baidu.platform.comapi.walknavi.k.b(activity);
                } else if (com.baidu.platform.comapi.h.c.b().e()) {
                    this.f9870o = new com.baidu.platform.comapi.b.c.b(activity);
                }
            }
            com.baidu.platform.comapi.h.s.b bVar2 = this.f9870o;
            if (bVar2 == null || bVar2.d()) {
                return false;
            }
            this.f9870o.ready();
        }
        f0();
        if (n().u() != 4 && !q().e()) {
            q().a(this.A);
        }
        z().ready();
        B().ready();
        X();
        int i8 = com.baidu.platform.comapi.walknavi.k.e.b.f10196a;
        if (i8 == 1) {
            q().c(activity);
        } else if (i8 == 3) {
            G().ready();
        }
        d0();
        t().m();
        this.f9880y = 2;
        e0();
        int i9 = 16;
        if (com.baidu.platform.comapi.h.c.b().j()) {
            if (this.E == j.AR.a()) {
                i9 = 2;
            } else if (this.E != jVar.a()) {
                i9 = 1;
            }
            n().a(a(i9), true);
            int a9 = com.baidu.platform.comapi.h.t.g.a(N());
            if (a9 == 2 || a9 == 3) {
                n().a(this.A, (b.z) null, a9, com.baidu.platform.comapi.h.t.g.a());
            }
        } else if (com.baidu.platform.comapi.h.c.b().e()) {
            if (k() == jVar.a()) {
                n().c(jVar.a());
                com.baidu.platform.comapi.h.c.b().a(16);
            } else {
                n().c(0);
                com.baidu.platform.comapi.h.c.b().a(1);
            }
        }
        t().e().getMap().setBaiduHeatMapEnabled(false);
        t().e().getMap().setTrafficEnabled(false);
        t().e().getMap().setMyLocationEnabled(false);
        return true;
    }

    private int a(int i8) {
        return (com.baidu.platform.comapi.h.t.g.b() == 1 && com.baidu.platform.comapi.h.t.g.c()) ? i8 | 4 : i8;
    }

    public void a(Bundle bundle) {
        s().g(bundle);
    }

    public void a(int i8, String str) {
        this.C.postDelayed(new c(str), i8);
    }

    public void a(IWNaviStatusListener iWNaviStatusListener) {
        this.f9877v = iWNaviStatusListener;
        com.baidu.platform.comapi.h.s.b bVar = this.f9870o;
        if (bVar == null || !(bVar instanceof com.baidu.platform.comapi.walknavi.k.b)) {
            return;
        }
        ((com.baidu.platform.comapi.walknavi.k.b) bVar).a(iWNaviStatusListener);
    }

    public void a(IBNaviStatusListener iBNaviStatusListener) {
        this.f9878w = iBNaviStatusListener;
        com.baidu.platform.comapi.h.s.b bVar = this.f9870o;
        if (bVar == null || !(bVar instanceof com.baidu.platform.comapi.b.c.b)) {
            return;
        }
        ((com.baidu.platform.comapi.b.c.b) bVar).a(iBNaviStatusListener);
    }

    public void a(Context context, b.z zVar, int i8, int i9) {
        if (context == null) {
            return;
        }
        if (i9 != 1) {
            if (i9 == 2 || i9 == 3) {
                if (zVar != null) {
                    zVar.b(i8);
                    return;
                }
                return;
            } else {
                if (zVar != null) {
                    zVar.a();
                    return;
                }
                return;
            }
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager.isWifiEnabled()) {
                if (zVar != null) {
                    zVar.b(i8);
                    return;
                }
                return;
            }
            Activity activity = (Activity) context;
            com.baidu.platform.comapi.walknavi.widget.b b8 = new com.baidu.platform.comapi.walknavi.widget.b(activity).a(true).d("温馨提示").a("您所在的商户支持室内导航,开启WIFI即可使用室内导航").b("不需要").a(new e(zVar, i8)).c("去开启").b(new d(wifiManager, zVar, i8));
            this.V = b8;
            if (b8.isShowing() || activity.isFinishing()) {
                return;
            }
            this.V.show();
        } catch (Exception unused) {
        }
    }

    public void a(boolean z7, boolean z8) {
        if (z7) {
            int a8 = com.baidu.platform.comapi.h.t.g.a(n().N());
            if (a8 == 1 || a8 == 4) {
                int a9 = com.baidu.platform.comapi.h.t.g.a();
                if (this.W) {
                    return;
                }
                this.W = true;
                a(this.A, new f(), a8, a9);
            }
        }
    }

    public void a(int i8, boolean z7) {
        com.baidu.platform.comapi.h.c.b().a(i8);
        IWNaviStatusListener iWNaviStatusListener = this.f9877v;
        if (iWNaviStatusListener != null) {
            iWNaviStatusListener.onWalkNaviModeChange(i8, new g(i8, z7));
        }
        if (z7) {
            if (com.baidu.platform.comapi.h.c.b().f()) {
                h0();
            } else {
                n().f(false);
            }
        }
    }

    public boolean a(OverLookingMode overLookingMode) {
        if (s() != null) {
            return this.f9860e.a(overLookingMode);
        }
        return false;
    }

    @Override // com.baidu.platform.comapi.walknavi.k.f.a
    public void a() {
        IWNaviStatusListener iWNaviStatusListener = this.f9877v;
        if (iWNaviStatusListener != null) {
            iWNaviStatusListener.onNaviExit();
        }
        IBNaviStatusListener iBNaviStatusListener = this.f9878w;
        if (iBNaviStatusListener != null) {
            iBNaviStatusListener.onNaviExit();
        }
    }

    public void a(boolean z7) {
        this.f9857b0 = z7;
        com.baidu.platform.comapi.h.m.f fVar = this.f9861f;
        if (fVar != null) {
            fVar.release();
            this.f9861f = null;
        }
    }
}
