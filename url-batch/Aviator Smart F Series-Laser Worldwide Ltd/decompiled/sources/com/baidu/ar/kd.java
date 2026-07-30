package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.baidu.ar.arplay.representation.Matrix;
import com.baidu.ar.arplay.representation.Matrixf4x4;
import com.baidu.ar.arplay.representation.Quaternion;
import com.baidu.ar.arplay.representation.Vector3f;
import com.baidu.ar.arrender.IARRenderer;
import java.util.HashMap;

/* loaded from: classes.dex */
public class kd implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public IARRenderer f2669a;

    /* renamed from: b, reason: collision with root package name */
    public w5 f2670b;

    /* renamed from: c, reason: collision with root package name */
    public d7 f2671c;

    /* renamed from: d, reason: collision with root package name */
    public int f2672d;

    /* renamed from: e, reason: collision with root package name */
    public int f2673e;

    /* renamed from: f, reason: collision with root package name */
    public nd f2674f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2675g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f2676h = 0;

    /* renamed from: i, reason: collision with root package name */
    public volatile Runnable f2677i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (kd.this.f2669a != null) {
                kd.this.f2669a.sceneRotateToCamera();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (kd.this.f2669a != null) {
                kd.this.f2669a.sceneWorldPositionToOrigin();
            }
        }
    }

    public kd(IARRenderer iARRenderer, nd ndVar, d7 d7Var, w5 w5Var) {
        this.f2669a = iARRenderer;
        this.f2674f = ndVar;
        this.f2671c = d7Var;
        this.f2670b = w5Var;
    }

    @Override // com.baidu.ar.c7
    public void b() {
        a(0, 1);
    }

    @Override // com.baidu.ar.c7
    public void c() {
        a(1, 0);
    }

    @Override // com.baidu.ar.c7
    public void d() {
        a(1, 1);
    }

    public final boolean e() {
        if (this.f2676h == 0) {
            this.f2676h = this.f2669a.isDriverdByARPVersion() ? 1 : -1;
        }
        return this.f2676h == 1;
    }

    @Override // com.baidu.ar.c7
    public void release() {
        this.f2671c = null;
        this.f2677i = null;
        this.f2669a = null;
        this.f2670b = null;
    }

    @Override // com.baidu.ar.c7
    public String a(nd ndVar) {
        return (ndVar == null || TextUtils.isEmpty(ndVar.b())) ? "slam_model_1" : ndVar.b();
    }

    public void b(int i8, int i9) {
        this.f2672d = i8;
        this.f2673e = i9;
    }

    @Override // com.baidu.ar.c7
    public void a() {
        this.f2669a.setOffScreenGuideWork(true);
    }

    public final float[] b(float[] fArr) {
        if (fArr == null || fArr.length != 16) {
            return null;
        }
        Matrixf4x4 matrixf4x4 = new Matrixf4x4();
        Matrixf4x4 matrixf4x42 = new Matrixf4x4();
        Matrix.invertM(matrixf4x4.getMatrix(), 0, fArr, 0);
        matrixf4x42.setMatrixValues(matrixf4x4.getMatrix());
        Quaternion quaternion = new Quaternion();
        quaternion.setAxisAngle(new Vector3f(1.0f, 0.0f, 0.0f), -90.0f);
        Matrix.multiplyMM(matrixf4x4.getMatrix(), quaternion.getMatrix4x4().getMatrix(), matrixf4x42.getMatrix());
        Matrixf4x4 matrixf4x43 = new Matrixf4x4();
        Matrix.invertM(matrixf4x43.getMatrix(), 0, matrixf4x4.getMatrix(), 0);
        return matrixf4x43.getMatrix();
    }

    public final void a(int i8, int i9) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 4101);
        hashMap.put("guideDirection", Integer.valueOf(i9));
        hashMap.put("switchGuide", Integer.valueOf(i8));
        this.f2670b.sendMsg2Lua(hashMap);
    }

    @Override // com.baidu.ar.c7
    public void a(v4 v4Var) {
        float f8;
        float f9;
        Runnable bVar;
        if (v4Var == null) {
            return;
        }
        if (v4Var.f3455e) {
            int[] a8 = a(v4Var.f3451a, v4Var.f3452b);
            f8 = a8[0];
            f9 = a8[1];
        } else {
            f8 = v4Var.f3451a;
            f9 = v4Var.f3452b;
        }
        String a9 = a(this.f2674f);
        int i8 = v4Var.f3453c;
        if (i8 == 3) {
            this.f2671c.b();
            a(a9, (int) f8, (int) f9, null, (int) v4Var.f3454d);
            bVar = new a();
        } else {
            if (i8 != 2) {
                return;
            }
            this.f2671c.b();
            a(a9, (int) f8, (int) f9, null, (int) v4Var.f3454d);
            bVar = new b();
        }
        this.f2677i = bVar;
    }

    @Override // com.baidu.ar.c7
    public void a(String str, int i8, int i9, float[] fArr, float f8) {
        d7 d7Var = this.f2671c;
        if (d7Var != null) {
            d7Var.a(str, i8, i9, fArr, f8);
        }
    }

    @Override // com.baidu.ar.c7
    public void a(float[] fArr) {
        if (this.f2669a == null || fArr == null || fArr.length != 16) {
            return;
        }
        if (this.f2677i != null) {
            this.f2677i.run();
            this.f2677i = null;
        }
        this.f2669a.setEnvironmentDataPipKV(ARPScriptEnvironment.KEY_DATA_PIP_SLAM, fArr);
        if (this.f2675g) {
            this.f2675g = false;
            this.f2670b.a(7001, null);
        }
        if (e()) {
            fArr = b(fArr);
        }
        bb bbVar = new bb();
        bbVar.a("ability_vo");
        bbVar.a(fArr);
        this.f2669a.updateRenderCameraData(bbVar);
    }

    @Override // com.baidu.ar.c7
    public int[] a(float f8, float f9) {
        int[] iArr = new int[2];
        if (this.f2672d != 0) {
            iArr[1] = this.f2673e - ((int) (f8 * 720.0f));
            iArr[0] = (int) (f9 * 1280.0f);
        } else {
            iArr[1] = 640;
            iArr[0] = 360;
        }
        return iArr;
    }
}
