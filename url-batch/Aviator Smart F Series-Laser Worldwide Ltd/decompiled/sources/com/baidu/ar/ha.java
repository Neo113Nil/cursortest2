package com.baidu.ar;

import android.opengl.Matrix;
import android.util.Log;
import com.baidu.ar.util.SystemInfoUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class ha implements u6 {

    /* renamed from: l, reason: collision with root package name */
    public static final String f2379l = "ha";

    /* renamed from: a, reason: collision with root package name */
    public List<g6> f2380a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public List<z5> f2381b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public z5 f2382c;

    /* renamed from: d, reason: collision with root package name */
    public g6 f2383d;

    /* renamed from: e, reason: collision with root package name */
    public ja f2384e;

    /* renamed from: f, reason: collision with root package name */
    public float f2385f;

    /* renamed from: g, reason: collision with root package name */
    public float f2386g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f2387h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2388i;

    /* renamed from: j, reason: collision with root package name */
    public v6 f2389j;

    /* renamed from: k, reason: collision with root package name */
    public u4 f2390k;

    public ha() {
        float[] fArr = new float[16];
        this.f2387h = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void a() {
        List<g6> list = this.f2380a;
        if (list != null) {
            list.clear();
        }
        List<z5> list2 = this.f2381b;
        if (list2 != null) {
            list2.clear();
        }
        List<z5> list3 = this.f2381b;
        if (list3 != null) {
            list3.clear();
        }
        this.f2382c = null;
        this.f2383d = null;
        this.f2387h = null;
        this.f2388i = false;
        this.f2390k = null;
        this.f2384e = null;
    }

    public boolean b() {
        z5 z5Var = this.f2382c;
        if (z5Var != null) {
            return z5Var.a();
        }
        return false;
    }

    public ja c() {
        if (this.f2390k == null) {
            h.b(f2379l, "mGeoLocalTransform is null");
            return null;
        }
        h.a(f2379l, "mLocalTransform: " + this.f2387h[12] + b5.b.VERTICAL + this.f2387h[13]);
        float[] fArr = this.f2387h;
        float[] fArr2 = {fArr[12], fArr[13], fArr[14], 1.0f};
        ja jaVar = new ja();
        float[] d8 = this.f2390k.d(fArr2);
        s2 s2Var = new s2();
        s2Var.f3191a = d8[1];
        s2Var.f3192b = d8[0];
        jaVar.f2613a = s2Var;
        return jaVar;
    }

    public boolean d() {
        g6 g6Var = this.f2383d;
        if (g6Var != null) {
            return g6Var.d();
        }
        return false;
    }

    public boolean e() {
        if (!b() || !d()) {
            return false;
        }
        float[] fArr = this.f2387h;
        float f8 = fArr[12];
        float f9 = fArr[13];
        Log.e("GeoLocalTransformx", "x:" + f8 + ", y:" + f9 + ", z:" + fArr[14]);
        float[] fArr2 = this.f2387h;
        float[] fArr3 = new float[fArr2.length];
        System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
        g6 g6Var = this.f2383d;
        if (g6Var instanceof h1) {
            u4 u4Var = new u4();
            this.f2390k = u4Var;
            u4Var.b(((h1) g6Var).f());
            this.f2390k.f3386a = true;
            this.f2390k.f3387b = (float) ((u8.a((float) (((u8.a(fArr3) - (((-this.f2385f) / 180.0f) * 3.141592653589793d)) / 180.0d) * 3.141592653589793d)) / 180.0d) * 3.141592653589793d);
        } else {
            ja jaVar = this.f2384e;
            if (jaVar == null || jaVar.f2613a.f3191a <= 0.0f) {
                return false;
            }
            double a8 = u8.a(fArr3);
            Log.e("GeoLocalTransform", "locYaw:" + Math.toDegrees(a8));
            double d8 = (((double) (-this.f2385f)) / 180.0d) * 3.141592653589793d;
            Log.e("GeoLocalTransform", "geoYaw:" + Math.toDegrees(d8));
            double a9 = (u8.a((double) ((float) (((a8 - d8) / 3.141592653589793d) * 180.0d))) / 180.0d) * 3.141592653589793d;
            Log.e("GeoLocalTransform", "diffYaw:" + Math.toDegrees(a9));
            float[] fArr4 = new float[16];
            Matrix.setIdentityM(fArr4, 0);
            Matrix.rotateM(fArr4, 0, (float) ((a9 / 3.141592653589793d) * 180.0d), 0.0f, 0.0f, 1.0f);
            Log.e("GeoLocalTransform", "latlng:" + this.f2384e.f2613a.f3192b + SystemInfoUtil.COMMA + this.f2384e.f2613a.f3191a + ", mGeoHeading:" + this.f2385f + ", transform:" + Arrays.toString(this.f2387h));
            float[] fArr5 = {f8, f9, 0.0f, 1.0f};
            StringBuilder sb = new StringBuilder();
            sb.append("T0: ");
            sb.append(Arrays.toString(fArr5));
            Log.e("GeoLocalTransform", sb.toString());
            s2 s2Var = this.f2384e.f2613a;
            float f10 = s2Var.f3192b;
            float f11 = s2Var.f3191a;
            float[] fArr6 = {f10, f11, 0.0f, 1.0f};
            float[] b8 = b(new float[]{f10, f11});
            u4 u4Var2 = new u4();
            this.f2390k = u4Var2;
            u4Var2.a(fArr4, fArr5, fArr6, b8);
        }
        v6 v6Var = this.f2389j;
        if (v6Var != null) {
            v6Var.positioningServiceDidUpdateGeoLocalTransform();
        }
        return true;
    }

    public final void f() {
        for (int i8 = 0; i8 < this.f2380a.size(); i8++) {
            this.f2380a.get(i8).b(this.f2387h);
        }
    }

    @Override // com.baidu.ar.u6
    public void a(t6 t6Var) {
        if (t6Var instanceof w9) {
            w9 w9Var = (w9) t6Var;
            this.f2384e = w9Var.g();
            this.f2385f = w9Var.e();
            this.f2386g = w9Var.f();
            v6 v6Var = this.f2389j;
            if (v6Var != null) {
                v6Var.positioningServiceDidupdateGeoLocation(this.f2384e);
                this.f2389j.positioningServiceDidUpdateGeoHeading(this.f2385f, this.f2386g);
            }
        }
        if (t6Var instanceof ce) {
            ce ceVar = (ce) t6Var;
            this.f2387h = ceVar.b();
            this.f2385f = (float) ceVar.f1977i;
            this.f2386g = ceVar.f1978j;
            v6 v6Var2 = this.f2389j;
            if (v6Var2 != null) {
                v6Var2.positioningServiceDidupdateGeoLocation(this.f2384e);
                this.f2389j.positioningServiceDidUpdateGeoHeading(this.f2385f, this.f2386g);
                this.f2389j.positioningServiceDidUpdateLocalTransform(this.f2387h);
            }
        }
        if (t6Var instanceof ka) {
            float[] b8 = ((ka) t6Var).b();
            this.f2387h = b8;
            v6 v6Var3 = this.f2389j;
            if (v6Var3 != null) {
                v6Var3.positioningServiceDidUpdateLocalTransform(b8);
            }
        }
        if (t6Var instanceof ia) {
            float[] b9 = ((ia) t6Var).b();
            this.f2387h = b9;
            v6 v6Var4 = this.f2389j;
            if (v6Var4 != null) {
                v6Var4.positioningServiceDidUpdateLocalTransform(b9);
            }
        }
    }

    public boolean b(g6 g6Var) {
        if (!this.f2380a.contains(g6Var) || !g6Var.d()) {
            return false;
        }
        if (this.f2383d == g6Var) {
            return true;
        }
        this.f2383d = g6Var;
        if (g6Var instanceof h1) {
            h1 h1Var = (h1) g6Var;
            if (this.f2388i && h1Var.f2307b != null) {
                u4 u4Var = new u4();
                this.f2390k = u4Var;
                u4Var.b(h1Var.f());
                this.f2390k.f3386a = true;
            }
        }
        return true;
    }

    public boolean c(g6 g6Var) {
        if (!this.f2380a.contains(g6Var) || !g6Var.d()) {
            return false;
        }
        this.f2383d = g6Var;
        this.f2387h = g6Var.b();
        this.f2388i = true;
        f();
        if (g6Var instanceof h1) {
            u4 u4Var = new u4();
            this.f2390k = u4Var;
            u4Var.b(((h1) g6Var).f());
            this.f2390k.f3386a = true;
        }
        return true;
    }

    public void a(v6 v6Var) {
        this.f2389j = v6Var;
    }

    public boolean b(z5 z5Var) {
        if (!this.f2381b.contains(z5Var) || (z5Var.c() & com.baidu.ar.vps.marker.a.GeoHeading.f3551a) == 0) {
            return false;
        }
        this.f2382c = z5Var;
        return true;
    }

    public boolean c(z5 z5Var) {
        return this.f2381b.contains(z5Var) && (z5Var.c() & com.baidu.ar.vps.marker.a.GeoLocation.f3551a) != 0;
    }

    public void a(z5 z5Var) {
        this.f2381b.add(z5Var);
    }

    public final float[] b(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[1]};
        float[] fArr3 = {fArr[0], fArr[1] + 1.0f};
        return new float[]{u8.a(fArr[0] + 1.0f, fArr[1], fArr2[0], fArr2[1]), u8.a(fArr3[0], fArr3[1], fArr2[0], fArr2[1]), 0.0f, 1.0f};
    }

    public float[] c(float[] fArr) {
        u4 u4Var = this.f2390k;
        if (u4Var == null) {
            return null;
        }
        return u4Var.c(new float[]{fArr[0] * 1.0f, fArr[1] * 1.0f, 0.0f, 1.0f});
    }

    public boolean a(g6 g6Var) {
        if (!g6Var.d()) {
            return false;
        }
        if (this.f2380a.contains(g6Var)) {
            return true;
        }
        this.f2380a.add(g6Var);
        if (!this.f2388i) {
            return true;
        }
        g6Var.b(this.f2387h);
        return true;
    }

    public float[] a(float[] fArr) {
        return this.f2390k.d(fArr);
    }
}
