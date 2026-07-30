package com.baidu.ar;

import android.content.Context;
import android.content.IntentFilter;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.arplay.core.engine.engine3d.IARPCamera;
import com.baidu.ar.arplay.core.engine3d.ARPCamera;
import com.baidu.ar.arplay.representation.Matrixf4x4;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.ee;
import com.baidu.ar.l9;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.ar.vpas.VpasAR;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class fe implements me, ee.b, l9.a, a7 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2236a;

    /* renamed from: b, reason: collision with root package name */
    public VpasAR f2237b;

    /* renamed from: c, reason: collision with root package name */
    public ee f2238c;

    /* renamed from: d, reason: collision with root package name */
    public TimerTask f2239d;

    /* renamed from: e, reason: collision with root package name */
    public Timer f2240e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2241f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2243h;

    /* renamed from: i, reason: collision with root package name */
    public float f2244i;

    /* renamed from: j, reason: collision with root package name */
    public int f2245j;

    /* renamed from: k, reason: collision with root package name */
    public float f2246k;

    /* renamed from: m, reason: collision with root package name */
    public b f2248m;

    /* renamed from: n, reason: collision with root package name */
    public long f2249n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2250o;

    /* renamed from: p, reason: collision with root package name */
    public long f2251p;

    /* renamed from: s, reason: collision with root package name */
    public ie f2254s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2255t;

    /* renamed from: u, reason: collision with root package name */
    public Context f2256u;

    /* renamed from: v, reason: collision with root package name */
    public float f2257v;

    /* renamed from: w, reason: collision with root package name */
    public float[] f2258w;

    /* renamed from: x, reason: collision with root package name */
    public float[] f2259x;

    /* renamed from: g, reason: collision with root package name */
    public int f2242g = 0;

    /* renamed from: l, reason: collision with root package name */
    public float f2247l = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    public int f2252q = 0;

    /* renamed from: r, reason: collision with root package name */
    public l9 f2253r = null;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            fe feVar;
            int i8;
            fe.b(fe.this);
            if (fe.this.f2241f) {
                Log.e("time", "mTimerTask runner = " + fe.this.f2242g);
                if (fe.this.f2242g == 10 || fe.this.f2242g == 20 || fe.this.f2242g == 30) {
                    if (fe.this.f2245j != 0) {
                        fe feVar2 = fe.this;
                        feVar2.f2246k = feVar2.f2244i / fe.this.f2247l;
                        if (fe.this.f2246k > 0.0f) {
                            fe.this.b(3);
                            return;
                        } else {
                            feVar = fe.this;
                            i8 = 2;
                        }
                    }
                    fe.this.m();
                }
                if (fe.this.f2242g != 40) {
                    return;
                }
                feVar = fe.this;
                i8 = 4;
                feVar.b(i8);
                fe.this.f2241f = false;
                fe.this.m();
            }
        }
    }

    public static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<fe> f2261a;

        public b(fe feVar) {
            this.f2261a = new WeakReference<>(feVar);
        }

        public void a() {
            WeakReference<fe> weakReference = this.f2261a;
            if (weakReference != null) {
                weakReference.clear();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && this.f2261a.get() != null) {
                this.f2261a.get().b(12);
            }
        }
    }

    public fe(Context context, VpasAR vpasAR, ee eeVar, ie ieVar) {
        this.f2256u = context;
        this.f2237b = vpasAR;
        this.f2238c = eeVar;
        this.f2254s = ieVar;
        eeVar.a((ee.b) this);
        if (this.f2248m == null) {
            this.f2248m = new b(this);
        }
        this.f2254s.a(ARConfig.getARKey());
        this.f2238c.c(new h3(context).a().toString());
        this.f2238c.a((a7) this);
    }

    public static /* synthetic */ int b(fe feVar) {
        int i8 = feVar.f2242g;
        feVar.f2242g = i8 + 1;
        return i8;
    }

    public final void c() {
        if (this.f2250o) {
            return;
        }
        if (this.f2253r == null) {
            l9 l9Var = new l9();
            this.f2253r = l9Var;
            l9Var.a(this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2256u.registerReceiver(this.f2253r, intentFilter, 2);
        } else {
            this.f2256u.registerReceiver(this.f2253r, intentFilter);
        }
        this.f2250o = true;
    }

    public void h() {
        ee eeVar;
        float[] fArr;
        float[] fArr2;
        if (this.f2236a || (eeVar = this.f2238c) == null) {
            return;
        }
        this.f2236a = true;
        if (eeVar.f()) {
            Log.e("VpasController", " algo system create success");
            if (this.f2238c.a("")) {
                Log.e("VpasController", " vps create success");
                this.f2241f = true;
                i();
                j();
                if (this.f2243h || (fArr = this.f2258w) == null || (fArr2 = this.f2259x) == null) {
                    return;
                }
                this.f2243h = true;
                float f8 = this.f2257v;
                Matrixf4x4 matrixf4x4 = new Matrixf4x4();
                Matrix.scaleM(matrixf4x4.getMatrix(), 0, f8, f8, f8);
                Matrixf4x4 matrixf4x42 = new Matrixf4x4();
                matrixf4x42.setMatrix(new float[]{fArr[0], fArr[3], fArr[6], 0.0f, fArr[1], fArr[4], fArr[7], 0.0f, fArr[2], fArr[5], fArr[8], 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                Matrixf4x4 matrixf4x43 = new Matrixf4x4();
                Matrix.translateM(matrixf4x43.getMatrix(), 0, fArr2[0], fArr2[1], fArr2[2]);
                Matrixf4x4 matrixf4x44 = new Matrixf4x4();
                Matrix.multiplyMM(matrixf4x44.getMatrix(), 0, matrixf4x42.getMatrix(), 0, matrixf4x4.getMatrix(), 0);
                Matrixf4x4 matrixf4x45 = new Matrixf4x4();
                Matrix.multiplyMM(matrixf4x45.getMatrix(), 0, matrixf4x43.getMatrix(), 0, matrixf4x44.getMatrix(), 0);
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("event_name", "vps_get_rts");
                hashMap.put("event_data", matrixf4x45);
                this.f2237b.senMsg2Lua(hashMap);
            }
        }
    }

    public final void i() {
        if (this.f2236a) {
            this.f2242g = 0;
            m();
            this.f2244i = 0.0f;
            if (this.f2240e == null) {
                this.f2240e = new Timer();
            }
            if (this.f2239d == null) {
                this.f2239d = new a();
            }
            this.f2240e.schedule(this.f2239d, 0L, 1000L);
        }
    }

    public void j() {
        this.f2238c.g();
    }

    public final void k() {
        this.f2236a = false;
        l();
        m();
    }

    public void l() {
        this.f2238c.h();
    }

    public final void m() {
        TimerTask timerTask = this.f2239d;
        if (timerTask != null) {
            timerTask.cancel();
            this.f2239d = null;
            this.f2240e.cancel();
            this.f2240e.purge();
            this.f2240e = null;
        }
    }

    public final void n() {
        l9 l9Var;
        if (!this.f2250o || (l9Var = this.f2253r) == null) {
            return;
        }
        l9Var.a();
        this.f2256u.unregisterReceiver(this.f2253r);
        this.f2253r = null;
        this.f2250o = false;
    }

    public void b() {
        c();
        f();
        j();
        i();
        if (this.f2251p <= 0) {
            return;
        }
        c((Math.abs(System.currentTimeMillis() - this.f2251p) / 1000) % 60 >= 30 ? 1 : 0);
    }

    public final void c(int i8) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "vps_cut_back_return");
        hashMap.put("event_data", Integer.valueOf(i8));
        this.f2237b.senMsg2Lua(hashMap);
    }

    public void d() {
        ee eeVar = this.f2238c;
        if (eeVar != null) {
            eeVar.d();
        }
        b bVar = this.f2248m;
        if (bVar != null) {
            bVar.a();
            this.f2248m = null;
        }
        this.f2243h = false;
    }

    public final void e() {
        this.f2252q = -1;
    }

    public final void f() {
        ee eeVar = this.f2238c;
        if (eeVar != null) {
            eeVar.e();
        }
    }

    public final void g() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "vps_cut_back");
        this.f2237b.senMsg2Lua(hashMap);
    }

    public void a() {
        n();
        this.f2251p = System.currentTimeMillis();
        g();
        k();
        e();
    }

    public final void b(int i8) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "vps_toast_gather");
        hashMap.put("event_data", Integer.valueOf(i8));
        this.f2237b.senMsg2Lua(hashMap);
    }

    public void c(float[] fArr) {
        if (fArr == null || fArr.length < 12) {
            return;
        }
        Matrixf4x4 matrixf4x4 = new Matrixf4x4();
        matrixf4x4.setMatrix(new float[]{fArr[0], fArr[3], fArr[6], 0.0f, fArr[1], fArr[4], fArr[7], 0.0f, fArr[2], fArr[5], fArr[8], 0.0f, fArr[9], fArr[10], fArr[11], 1.0f});
        Matrixf4x4 matrixf4x42 = new Matrixf4x4();
        matrixf4x42.setMatrix(new float[]{0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        Matrixf4x4 matrixf4x43 = new Matrixf4x4();
        com.baidu.ar.arplay.representation.Matrix.multiplyMM(matrixf4x43.getMatrix(), 0, matrixf4x42.getMatrix(), 0, matrixf4x4.getMatrix(), 0);
        try {
            int i8 = ARPCamera.f1722a;
            ((IARPCamera) ARPCamera.class.getMethod("getDefaultCamera", new Class[0]).invoke(ARPCamera.class, new Object[0])).setViewMatrix(matrixf4x43.getMatrix());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.baidu.ar.me
    public void a(float f8) {
        this.f2257v = f8;
    }

    @Override // com.baidu.ar.me
    public void b(byte[] bArr) {
        b bVar;
        ee eeVar = this.f2238c;
        if (eeVar != null && bArr != null) {
            eeVar.a(bArr);
        }
        if (((System.currentTimeMillis() - this.f2249n) / 1000) % 60 > 6 || (bVar = this.f2248m) == null) {
            return;
        }
        bVar.removeMessages(1);
    }

    @Override // com.baidu.ar.l9.a
    public void a(int i8) {
        if (i8 == 2) {
            b(6);
            b bVar = this.f2248m;
            if (bVar != null) {
                bVar.removeMessages(1);
            }
        }
    }

    @Override // com.baidu.ar.me
    public void b(float[] fArr) {
        this.f2258w = fArr;
    }

    @Override // com.baidu.ar.a7
    public void a(int i8, Object obj) {
        if (i8 != 1) {
            if (i8 == 2) {
                b(11);
            }
        } else if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (this.f2241f) {
                this.f2247l += 1.0f;
                this.f2244i += intValue;
            }
        }
    }

    public void a(oe oeVar) {
        this.f2245j = oeVar.d().c() ? 0 : -1;
        int i8 = this.f2252q;
        int i9 = this.f2245j;
        if (i8 != i9) {
            if (i9 == 0) {
                this.f2255t = true;
                StatisticApi.onEvent(StatisticConstants.VPS_SDKRECALL_SUCCESS);
                b(1);
                m();
            } else if (this.f2255t) {
                b(5);
                i();
            }
        }
        this.f2252q = this.f2245j;
        c(oeVar.d().b().a());
    }

    public void a(HashMap<String, Object> hashMap) {
        if (hashMap.containsKey("event_name")) {
            if (hashMap.get("event_name").equals("vps_open_algorithm")) {
                h();
                return;
            }
            if (hashMap.get("event_name").equals("vps_close_algorithm")) {
                k();
            } else {
                if (!hashMap.get("event_name").equals("vps_recreate_session") || this.f2254s == null || TextUtils.isEmpty(ARConfig.getARKey())) {
                    return;
                }
                this.f2254s.a(ARConfig.getARKey());
            }
        }
    }

    @Override // com.baidu.ar.me
    public void a(boolean z7, String str) {
        ee eeVar = this.f2238c;
        if (eeVar != null) {
            eeVar.b(str);
        }
        b(z7 ? 13 : 14);
    }

    @Override // com.baidu.ar.ee.b
    public void a(byte[] bArr) {
        this.f2254s.a(bArr);
        this.f2249n = System.currentTimeMillis();
        b bVar = this.f2248m;
        if (bVar != null) {
            bVar.sendEmptyMessageDelayed(1, 6000L);
        }
    }

    @Override // com.baidu.ar.me
    public void a(float[] fArr) {
        this.f2259x = fArr;
    }
}
