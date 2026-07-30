package com.baidu.ar.vo;

import com.baidu.ar.a9;
import com.baidu.ar.arplay.core.engine.ARPDataInteraction;
import com.baidu.ar.b3;
import com.baidu.ar.c0;
import com.baidu.ar.e3;
import com.baidu.ar.gd;
import com.baidu.ar.kb;
import com.baidu.ar.kd;
import com.baidu.ar.ld;
import com.baidu.ar.m2;
import com.baidu.ar.m7;
import com.baidu.ar.md;
import com.baidu.ar.n7;
import com.baidu.ar.nd;
import com.baidu.ar.od;
import com.baidu.ar.pd;
import com.baidu.ar.q7;
import com.baidu.ar.qd;
import com.baidu.ar.s3;
import com.baidu.ar.v4;
import com.baidu.ar.w5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class VOAR extends c0 {
    public s3 A;
    public n7 B;
    public m7 C;

    /* renamed from: v, reason: collision with root package name */
    public nd f3489v;

    /* renamed from: w, reason: collision with root package name */
    public pd f3490w;

    /* renamed from: x, reason: collision with root package name */
    public e3 f3491x;

    /* renamed from: y, reason: collision with root package name */
    public ld f3492y;

    /* renamed from: z, reason: collision with root package name */
    public od f3493z;

    public class a implements e3 {

        /* renamed from: a, reason: collision with root package name */
        public int f3494a = 0;

        public a() {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            if (VOAR.this.f3493z == null || b3Var == null || !(b3Var instanceof qd)) {
                return;
            }
            int i8 = this.f3494a;
            if (i8 < 3) {
                this.f3494a = i8 + 1;
            } else {
                VOAR.this.f3493z.a((qd) b3Var, VOAR.this.i());
            }
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
            this.f3494a = 0;
        }
    }

    public class b implements md.a {
        public b() {
        }

        @Override // com.baidu.ar.md.a
        public float a() {
            return VOAR.this.h();
        }

        @Override // com.baidu.ar.md.a
        public float[] b() {
            return VOAR.this.i();
        }
    }

    public class c implements w5 {
        public c() {
        }

        @Override // com.baidu.ar.w5
        public void a(int i8, HashMap<String, Object> hashMap) {
            VOAR.this.a(i8, hashMap);
        }

        @Override // com.baidu.ar.w5
        public void sendMsg2Lua(HashMap<String, Object> hashMap) {
            VOAR.this.a(hashMap);
        }
    }

    public class d implements ARPDataInteraction.b {
        public d() {
        }

        @Override // com.baidu.ar.arplay.core.engine.ARPDataInteraction.b
        public void a(float f8, float f9, float f10) {
            if (VOAR.this.f3493z != null) {
                VOAR.this.f3493z.a(f8, f9, f10);
            }
        }
    }

    public class e implements s3 {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f3500a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f3501b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HashMap f3502c;

            public a(int i8, int i9, HashMap hashMap) {
                this.f3500a = i8;
                this.f3501b = i9;
                this.f3502c = hashMap;
            }

            @Override // java.lang.Runnable
            public void run() {
                VOAR.this.a(this.f3500a, this.f3501b, (HashMap<String, Object>) this.f3502c);
            }
        }

        public e() {
        }

        @Override // com.baidu.ar.s3
        public List<Integer> a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(401);
            arrayList.add(4100);
            arrayList.add(1901);
            return arrayList;
        }

        @Override // com.baidu.ar.s3
        public void a(int i8, int i9, HashMap<String, Object> hashMap) {
            gd.a(new a(i8, i9, hashMap));
        }
    }

    public class f implements n7 {
        public f() {
        }

        @Override // com.baidu.ar.n7
        public void onImuUpdate(m7 m7Var) {
            VOAR.this.C = m7Var;
        }
    }

    public final kd a(md mdVar) {
        kd kdVar = new kd(d(), this.f3489v, this.f3492y, new c());
        kdVar.b(mdVar.f2831a, mdVar.f2832b);
        return kdVar;
    }

    public final v4 b(HashMap<String, Object> hashMap) {
        v4 v4Var = new v4();
        v4Var.f3451a = ((Float) hashMap.get("x")).floatValue();
        v4Var.f3452b = ((Float) hashMap.get("y")).floatValue();
        v4Var.f3453c = ((Integer) hashMap.get("type")).intValue();
        v4Var.f3454d = ((Float) hashMap.get("distance")).floatValue();
        v4Var.f3455e = true;
        return v4Var;
    }

    public final md f() {
        md mdVar = new md();
        mdVar.f2831a = 1280;
        mdVar.f2832b = 720;
        mdVar.f2833c = new b();
        return mdVar;
    }

    public final s3 g() {
        return new e();
    }

    public final float h() {
        m7 m7Var = this.C;
        return (m7Var == null ? null : Float.valueOf(m7Var.a())).floatValue();
    }

    public final float[] i() {
        m7 m7Var = this.C;
        if (m7Var == null) {
            return null;
        }
        return m7Var.d();
    }

    public final void j() {
        a(this.f3490w);
        s3 s3Var = this.A;
        if (s3Var != null) {
            b(s3Var);
            this.A = null;
        }
        n7 n7Var = this.B;
        if (n7Var != null) {
            a(n7Var);
            this.B = null;
        }
        this.f3490w = null;
        this.f3491x = null;
        od odVar = this.f3493z;
        if (odVar != null) {
            odVar.a();
            this.f3493z = null;
        }
        ld ldVar = this.f3492y;
        if (ldVar != null) {
            ldVar.c();
            this.f3492y = null;
        }
    }

    public final void k() {
        q7 q7Var = new q7();
        q7Var.a(com.baidu.ar.imu.a.WORLD);
        q7Var.a(0);
        q7Var.c(false);
        q7Var.b(true);
        f fVar = new f();
        this.B = fVar;
        a(q7Var, fVar);
    }

    @Override // com.baidu.ar.c0
    public void onCaseCreate(String str) {
        k();
        d().set3DModelVisible(true);
        d().setTouchEnable(true);
        d().setFieldOfView(56.144978f);
        d().initWorldAxis();
        d().setInteractionCallback(new d());
        a(this.f3490w, this.f3491x);
    }

    @Override // com.baidu.ar.c0
    public void onCaseDestroy() {
    }

    @Override // com.baidu.ar.c0
    public void release() {
        j();
        super.release();
    }

    @Override // com.baidu.ar.c0
    public void setup(HashMap<String, Object> hashMap) {
        super.setup(hashMap);
        this.f3489v = m2.a(d().getCurrentCasePath());
        md f8 = f();
        this.f3492y = new ld(f8);
        this.f3490w = new pd(this.f3489v, this.f3492y);
        this.f3491x = new a();
        this.f3493z = new od(a(f8), this.f3489v, this.f3492y, f8);
        s3 g8 = g();
        this.A = g8;
        a(g8);
    }

    public final void a(int i8, int i9, HashMap<String, Object> hashMap) {
        v4 b8;
        boolean z7;
        if (this.f3493z == null) {
            return;
        }
        if (i8 == 401) {
            if (hashMap == null || !(hashMap.get("app_type") instanceof String)) {
                return;
            }
            this.f3493z.a("None".equals((String) hashMap.get("app_type")));
            return;
        }
        if (i8 != 1901) {
            if (i8 != 4100) {
                return;
            }
            b8 = b(hashMap);
            z7 = false;
        } else {
            if (hashMap == null) {
                return;
            }
            int a8 = a9.a(hashMap.get("id"), -1);
            if (4100 != a8) {
                if (4200 == a8) {
                    this.f3493z.b();
                    return;
                }
                return;
            }
            b8 = b(hashMap);
            z7 = true;
        }
        b8.f3455e = z7;
        this.f3493z.a(b8);
    }
}
