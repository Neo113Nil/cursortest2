package com.baidu.ar.vpas;

import com.baidu.ar.a6;
import com.baidu.ar.b3;
import com.baidu.ar.c0;
import com.baidu.ar.e3;
import com.baidu.ar.ee;
import com.baidu.ar.fe;
import com.baidu.ar.ge;
import com.baidu.ar.ie;
import com.baidu.ar.kb;
import com.baidu.ar.lua.LuaMsgListener;
import com.baidu.ar.m7;
import com.baidu.ar.n7;
import com.baidu.ar.oe;
import com.baidu.ar.q7;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class VpasAR extends c0 implements LuaMsgListener {
    public e3 A;
    public ie B;
    public fe C;

    /* renamed from: v, reason: collision with root package name */
    public ge f3505v;

    /* renamed from: w, reason: collision with root package name */
    public n7 f3506w;

    /* renamed from: x, reason: collision with root package name */
    public ee f3507x;

    /* renamed from: y, reason: collision with root package name */
    public float[] f3508y;

    /* renamed from: z, reason: collision with root package name */
    public c f3509z;

    public class a implements e3 {
        public a() {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            if (b3Var == null || !(b3Var instanceof oe)) {
                return;
            }
            oe oeVar = (oe) b3Var;
            if (VpasAR.this.C != null) {
                VpasAR.this.C.a(oeVar);
            }
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
        }
    }

    public class b implements n7 {
        public b() {
        }

        @Override // com.baidu.ar.n7
        public void onImuUpdate(m7 m7Var) {
            if (VpasAR.this.f3507x != null) {
                VpasAR.this.f3507x.a(m7Var);
            }
            if (m7Var != null) {
                VpasAR.this.f3508y = m7Var.b();
            }
        }
    }

    public class c implements a6 {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<VpasAR> f3512a;

        public c(VpasAR vpasAR, VpasAR vpasAR2) {
            this.f3512a = new WeakReference<>(vpasAR2);
        }

        @Override // com.baidu.ar.a6
        public float[] a() {
            WeakReference<VpasAR> weakReference = this.f3512a;
            if (weakReference == null || weakReference.get() == null) {
                return null;
            }
            return this.f3512a.get().f3508y;
        }
    }

    public final void f() {
        g();
        fe feVar = this.C;
        if (feVar != null) {
            feVar.b();
        }
    }

    public final void g() {
        q7 q7Var = new q7();
        q7Var.a(com.baidu.ar.imu.a.WORLD);
        q7Var.a(0);
        q7Var.c(false);
        q7Var.b(true);
        q7Var.a(true);
        b bVar = new b();
        this.f3506w = bVar;
        a(q7Var, bVar);
    }

    @Override // com.baidu.ar.lua.LuaMsgListener
    public List<String> getMsgKeyListened() {
        return Arrays.asList("event_name");
    }

    @Override // com.baidu.ar.lua.LuaMsgListener
    public void onLuaMessage(HashMap<String, Object> hashMap) {
        fe feVar = this.C;
        if (feVar != null) {
            feVar.a(hashMap);
        }
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void pause() {
        super.pause();
        fe feVar = this.C;
        if (feVar != null) {
            feVar.a();
        }
        a(this.f3506w);
    }

    @Override // com.baidu.ar.c0
    public void release() {
        ge geVar = this.f3505v;
        if (geVar != null) {
            geVar.release();
            a(this.f3505v);
        }
        super.release();
        fe feVar = this.C;
        if (feVar != null) {
            feVar.d();
        }
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void resume() {
        super.resume();
        f();
    }

    public void senMsg2Lua(HashMap<String, Object> hashMap) {
        super.a(hashMap);
    }

    @Override // com.baidu.ar.c0
    public void setup(HashMap<String, Object> hashMap) {
        super.setup(hashMap);
        c cVar = new c(this, this);
        this.f3509z = cVar;
        this.f3507x = new ee(this.f1872o, this.f1873p, cVar);
        this.f3505v = new ge(this.f3507x);
        this.B = new ie();
        fe feVar = new fe(c(), this, this.f3507x, this.B);
        this.C = feVar;
        this.B.a(feVar, this.f3507x);
        a aVar = new a();
        this.A = aVar;
        a(this.f3505v, aVar);
        a((LuaMsgListener) this);
        f();
    }
}
