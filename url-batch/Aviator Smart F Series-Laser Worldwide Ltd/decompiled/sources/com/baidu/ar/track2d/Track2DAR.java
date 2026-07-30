package com.baidu.ar.track2d;

import android.graphics.Bitmap;
import com.baidu.ar.a9;
import com.baidu.ar.b3;
import com.baidu.ar.bd;
import com.baidu.ar.c0;
import com.baidu.ar.e3;
import com.baidu.ar.gd;
import com.baidu.ar.h;
import com.baidu.ar.kb;
import com.baidu.ar.m7;
import com.baidu.ar.n2;
import com.baidu.ar.n7;
import com.baidu.ar.oc;
import com.baidu.ar.q7;
import com.baidu.ar.s3;
import com.baidu.ar.x5;
import com.baidu.ar.xc;
import com.baidu.ar.yc;
import com.baidu.ar.zc;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class Track2DAR extends c0 implements ITrack2D, n7 {
    public static final String F = "Track2DAR";
    public static final int MST_TYPE_CLOSE_ALGO_TRACK = 10102;
    public static final int MST_TYPE_OPEN_ALGO_TRACK = 10101;
    public s3 A;
    public ITrack2DStateChangedListener C;

    /* renamed from: v, reason: collision with root package name */
    public bd f3323v;

    /* renamed from: w, reason: collision with root package name */
    public String f3324w;

    /* renamed from: x, reason: collision with root package name */
    public zc f3325x;

    /* renamed from: y, reason: collision with root package name */
    public e3 f3326y;

    /* renamed from: z, reason: collision with root package name */
    public com.baidu.ar.track2d.a f3327z;
    public boolean B = true;
    public boolean D = false;
    public boolean E = false;

    public class a implements x5 {
        public a() {
        }

        @Override // com.baidu.ar.x5
        public void a(int i8, HashMap<String, Object> hashMap) {
            Track2DAR.this.a(i8, hashMap);
        }
    }

    public class b implements e3 {
        public b() {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            if (Track2DAR.this.f3327z == null || b3Var == null || !(b3Var instanceof yc)) {
                return;
            }
            Track2DAR.this.f3327z.a((yc) b3Var);
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
        }
    }

    public class c implements s3 {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f3331a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f3332b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HashMap f3333c;

            public a(int i8, int i9, HashMap hashMap) {
                this.f3331a = i8;
                this.f3332b = i9;
                this.f3333c = hashMap;
            }

            @Override // java.lang.Runnable
            public void run() {
                Track2DAR.this.a(this.f3331a, this.f3332b, (HashMap<String, Object>) this.f3333c);
            }
        }

        public c() {
        }

        @Override // com.baidu.ar.s3
        public List<Integer> a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(8);
            arrayList.add(1901);
            arrayList.add(301);
            arrayList.add(303);
            arrayList.add(306);
            arrayList.add(305);
            return arrayList;
        }

        @Override // com.baidu.ar.s3
        public void a(int i8, int i9, HashMap<String, Object> hashMap) {
            if (i8 == 303) {
                Track2DAR.this.a(i8, i9, hashMap);
            } else {
                gd.a(new a(i8, i9, hashMap));
            }
        }
    }

    public final void b(HashMap<String, Object> hashMap) {
        if (hashMap == null || this.f3327z == null) {
            return;
        }
        com.baidu.ar.imu.a aVar = com.baidu.ar.imu.a.RELATIVE;
        com.baidu.ar.imu.a a8 = hashMap.containsKey("type") ? com.baidu.ar.imu.a.a(((Integer) hashMap.get("type")).intValue()) : aVar;
        boolean z7 = false;
        int intValue = hashMap.get("init_pos") instanceof Integer ? ((Integer) hashMap.get("init_pos")).intValue() : 0;
        q7 q7Var = new q7();
        q7Var.a(a8);
        q7Var.a(intValue);
        if (a8 == aVar && hashMap.containsKey("resume_original_position") && ((Integer) hashMap.get("resume_original_position")).intValue() == 1) {
            z7 = true;
        }
        q7Var.c(z7);
        q7Var.b(true);
        this.f3327z.a(q7Var);
        a(q7Var, this);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("succeeded", 1);
        a(302, hashMap2);
        this.E = true;
    }

    public final void f() {
        this.E = false;
        a((n7) this);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("succeeded", 1);
        a(304, hashMap);
    }

    public final void g() {
        if (this.B) {
            this.B = false;
            zc zcVar = this.f3325x;
            if (zcVar != null) {
                a(zcVar);
                this.f3325x = null;
            }
        }
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public Bitmap getTargetBitmap() {
        bd bdVar = this.f3323v;
        if (bdVar != null) {
            return n2.a(bdVar, this.f3324w);
        }
        return null;
    }

    public final s3 h() {
        return new c();
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public void haltTrack() {
        zc zcVar = this.f3325x;
        if (zcVar != null) {
            zcVar.c(true);
        }
    }

    public final void i() {
        if (this.B) {
            return;
        }
        this.B = true;
        k();
    }

    public final void j() {
        if (this.E) {
            f();
        }
        this.B = false;
        zc zcVar = this.f3325x;
        if (zcVar != null) {
            a(zcVar);
            this.f3325x = null;
        }
        s3 s3Var = this.A;
        if (s3Var != null) {
            b(s3Var);
            this.A = null;
        }
        this.f3326y = null;
        this.C = null;
        com.baidu.ar.track2d.a aVar = this.f3327z;
        if (aVar != null) {
            aVar.c();
            this.f3327z = null;
        }
    }

    public final void k() {
        bd bdVar = this.f3323v;
        if (bdVar == null) {
            return;
        }
        if (bdVar.b() == null || this.f3323v.b().isEmpty()) {
            throw new IllegalStateException("track target info is empty");
        }
        xc xcVar = new xc();
        xcVar.b(1280);
        xcVar.a(720);
        oc ocVar = this.f3323v.b().get(0);
        xcVar.a(ocVar.b() + File.separator + ocVar.a());
        this.f3325x = new zc(xcVar);
        b bVar = new b();
        this.f3326y = bVar;
        a(this.f3325x, bVar);
    }

    @Override // com.baidu.ar.c0
    public void onCaseCreate(String str) {
        d().setTouchEnable(true);
        d().setFieldOfView(56.144978f);
        if (this.B) {
            k();
        }
    }

    @Override // com.baidu.ar.c0
    public void onCaseDestroy() {
    }

    @Override // com.baidu.ar.n7
    public void onImuUpdate(m7 m7Var) {
        com.baidu.ar.track2d.a aVar = this.f3327z;
        if (aVar == null || aVar.b()) {
            return;
        }
        if (!this.D) {
            this.D = true;
            a(7001, (HashMap<String, Object>) null);
        }
        this.f3327z.a(m7Var);
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void pause() {
        super.pause();
    }

    @Override // com.baidu.ar.c0
    public void release() {
        j();
        super.release();
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void resume() {
        super.resume();
        com.baidu.ar.track2d.a aVar = this.f3327z;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public void resumeTrack() {
        zc zcVar = this.f3325x;
        if (zcVar != null) {
            zcVar.c(false);
        }
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public void setStateChangedListener(ITrack2DStateChangedListener iTrack2DStateChangedListener) {
        com.baidu.ar.track2d.a aVar;
        this.C = iTrack2DStateChangedListener;
        if (iTrack2DStateChangedListener == null || (aVar = this.f3327z) == null) {
            return;
        }
        aVar.a(iTrack2DStateChangedListener);
    }

    @Override // com.baidu.ar.c0
    public void setup(HashMap<String, Object> hashMap) {
        super.setup(hashMap);
        String currentCasePath = d().getCurrentCasePath();
        this.f3324w = currentCasePath;
        bd c8 = n2.c(currentCasePath);
        this.f3323v = c8;
        if (c8 != null && c8.a() != null) {
            this.B = this.f3323v.a().a() == 1;
        }
        com.baidu.ar.track2d.a aVar = new com.baidu.ar.track2d.a(d(), this.f3323v, new a());
        this.f3327z = aVar;
        ITrack2DStateChangedListener iTrack2DStateChangedListener = this.C;
        if (iTrack2DStateChangedListener != null) {
            aVar.a(iTrack2DStateChangedListener);
        }
        s3 h8 = h();
        this.A = h8;
        a(h8);
    }

    public final void a(int i8, int i9, HashMap<String, Object> hashMap) {
        String str = F;
        h.a(str, "handleMessage aMessageType = " + i8);
        com.baidu.ar.track2d.a aVar = this.f3327z;
        if (aVar == null) {
            return;
        }
        if (i8 == 8) {
            aVar.a(hashMap);
            return;
        }
        if (i8 == 301) {
            b(hashMap);
            return;
        }
        if (i8 == 303) {
            f();
            return;
        }
        if (i8 == 1901) {
            if (hashMap != null) {
                int a8 = a9.a(hashMap.get("id"), -1);
                h.a(str, "handleMessage aMessageType = " + i8 + " && aMessageID = " + a8);
                if (10101 == a8) {
                    i();
                    return;
                } else {
                    if (10102 == a8) {
                        g();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i8 != 305) {
            if (i8 == 306 && (hashMap.get("is_mirrored") instanceof Integer) && this.f3327z != null) {
                this.f3327z.a(((Integer) hashMap.get("is_mirrored")).intValue() == 1);
                return;
            }
            return;
        }
        if (hashMap != null && hashMap.containsKey("with_interaction") && ((Integer) hashMap.get("with_interaction")).intValue() != 0) {
            r0 = true;
        }
        this.f3327z.b(true);
        if (r0 || d() == null) {
            return;
        }
        d().sceneRelocate();
    }
}
