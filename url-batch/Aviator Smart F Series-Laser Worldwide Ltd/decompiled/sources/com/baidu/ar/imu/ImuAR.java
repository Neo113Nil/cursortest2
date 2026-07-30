package com.baidu.ar.imu;

import com.baidu.ar.ARType;
import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.baidu.ar.arplay.representation.Matrix;
import com.baidu.ar.arplay.representation.Matrixf4x4;
import com.baidu.ar.arplay.representation.Quaternion;
import com.baidu.ar.arplay.representation.Vector3f;
import com.baidu.ar.arplay.representation.Vector4f;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.bb;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.c0;
import com.baidu.ar.h;
import com.baidu.ar.m7;
import com.baidu.ar.n7;
import com.baidu.ar.q7;
import com.baidu.ar.s3;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class ImuAR extends c0 implements n7 {
    public static final String J = "ImuAR";

    /* renamed from: v, reason: collision with root package name */
    public s3 f2506v;

    /* renamed from: w, reason: collision with root package name */
    public q7 f2507w;

    /* renamed from: x, reason: collision with root package name */
    public Matrixf4x4 f2508x = new Matrixf4x4();

    /* renamed from: y, reason: collision with root package name */
    public Matrixf4x4 f2509y = new Matrixf4x4();

    /* renamed from: z, reason: collision with root package name */
    public Matrixf4x4 f2510z = new Matrixf4x4();
    public Matrixf4x4 A = new Matrixf4x4();
    public boolean B = true;
    public float[] C = new float[16];
    public boolean D = false;
    public int E = 0;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;

    public class a implements s3 {
        public a() {
        }

        @Override // com.baidu.ar.s3
        public List<Integer> a() {
            return Arrays.asList(306, 305);
        }

        @Override // com.baidu.ar.s3
        public void a(int i8, int i9, HashMap<String, Object> hashMap) {
            if (i8 != 305) {
                if (i8 == 306 && (hashMap.get("is_mirrored") instanceof Integer)) {
                    int intValue = ((Integer) hashMap.get("is_mirrored")).intValue();
                    ImuAR.this.I = intValue == 1;
                    return;
                }
                return;
            }
            if (hashMap != null && hashMap.containsKey("with_interaction") && ((Integer) hashMap.get("with_interaction")).intValue() != 0) {
                r0 = true;
            }
            ImuAR.this.H = true;
            if (r0 || ImuAR.this.d() == null) {
                return;
            }
            ImuAR.this.d().sceneRelocate();
        }
    }

    public final Matrixf4x4 a(Matrixf4x4 matrixf4x4, Matrixf4x4 matrixf4x42, Vector3f vector3f) {
        Matrixf4x4 matrixf4x43 = new Matrixf4x4();
        if (this.E != 1) {
            Matrixf4x4 matrixf4x44 = new Matrixf4x4();
            matrixf4x44.setW0(vector3f.x());
            matrixf4x44.setW1(vector3f.y());
            matrixf4x44.setW2(vector3f.z());
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, matrixf4x44.getMatrix(), matrixf4x4.getMatrix());
            float[] fArr2 = new float[16];
            Matrix.invertM(fArr2, 0, fArr, 0);
            matrixf4x43.setMatrixValues(fArr2);
        } else if (this.B) {
            this.B = false;
            this.f2509y.setMatrixValues(matrixf4x4.getMatrix());
            this.f2510z.loadIndentity();
            Matrix.translateM(this.f2510z.getMatrix(), 0, vector3f.getX(), vector3f.getY(), vector3f.getZ());
            float[] fArr3 = new float[16];
            Matrix.multiplyMM(fArr3, matrixf4x4.getMatrix(), this.f2510z.getMatrix());
            float[] fArr4 = new float[16];
            Matrix.invertM(fArr4, 0, fArr3, 0);
            this.f2510z.setMatrixValues(fArr4);
            matrixf4x43.setMatrixValues(matrixf4x42.getMatrix());
        } else {
            Matrixf4x4 matrixf4x45 = new Matrixf4x4();
            float[] fArr5 = new float[16];
            Matrix.transposeM(fArr5, 0, this.f2509y.getMatrix(), 0);
            float[] fArr6 = new float[16];
            Matrix.multiplyMM(fArr6, fArr5, matrixf4x4.getMatrix());
            matrixf4x45.setMatrixValues(fArr6);
            Matrix.transposeM(fArr6, 0, matrixf4x45.getMatrix(), 0);
            float[] fArr7 = new float[16];
            Matrix.multiplyMM(fArr7, fArr6, this.f2510z.getMatrix());
            matrixf4x43.setMatrixValues(fArr7);
        }
        return matrixf4x43;
    }

    public final Matrixf4x4 c(Matrixf4x4 matrixf4x4) {
        if (matrixf4x4 == null) {
            return null;
        }
        Matrixf4x4 matrixf4x42 = new Matrixf4x4();
        Matrixf4x4 matrixf4x43 = new Matrixf4x4();
        Matrix.invertM(matrixf4x42.getMatrix(), 0, matrixf4x4.getMatrix(), 0);
        matrixf4x43.setMatrixValues(matrixf4x42.getMatrix());
        Quaternion quaternion = new Quaternion();
        quaternion.setAxisAngle(new Vector3f(1.0f, 0.0f, 0.0f), -90.0f);
        Matrix.multiplyMM(matrixf4x42.getMatrix(), quaternion.getMatrix4x4().getMatrix(), matrixf4x43.getMatrix());
        Matrixf4x4 matrixf4x44 = new Matrixf4x4();
        Matrix.invertM(matrixf4x44.getMatrix(), 0, matrixf4x42.getMatrix(), 0);
        return matrixf4x44;
    }

    public final void f() {
        if (this.f2506v == null) {
            this.f2506v = new a();
        }
        a(this.f2506v);
    }

    public final void g() {
        IARRenderer d8 = d();
        if (this.D && !this.F) {
            this.F = true;
            a(7001, (HashMap<String, Object>) null);
            if (d8 != null) {
                this.G = d8.isDriverdByARPVersion();
            }
        }
        if (d8 != null) {
            Matrixf4x4 initialTransform = d8.getInitialTransform();
            Vector3f a8 = a(initialTransform);
            Matrixf4x4 a9 = a(a(a8), initialTransform, a8);
            if (this.I) {
                b(a9);
            }
            q7 q7Var = this.f2507w;
            if (q7Var != null && q7Var.a() == com.baidu.ar.imu.a.WORLD && this.G) {
                a9 = c(a9);
            }
            bb bbVar = new bb();
            bbVar.a("ability_imu");
            bbVar.a(a9.getMatrix());
            d8.setOffScreenGuideWork(true);
            d8.updateRenderCameraData(bbVar);
        }
    }

    @Override // com.baidu.ar.n7
    public void onImuUpdate(m7 m7Var) {
        if (m7Var != null) {
            a(m7Var.d(), m7Var.c());
        }
    }

    @Override // com.baidu.ar.c0
    public void release() {
        h.a(J, "release()");
        a((n7) this);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("succeeded", 1);
        a(304, hashMap);
        b(this.f2506v);
        this.f2507w = null;
        super.release();
    }

    @Override // com.baidu.ar.c0
    public void setup(HashMap<String, Object> hashMap) {
        super.setup(hashMap);
        if (hashMap != null && hashMap.containsKey("type")) {
            h.a(J, "setup() luaParams = " + hashMap.toString());
            Object obj = hashMap.get("type");
            int i8 = 0;
            int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : obj instanceof Float ? (int) ((Float) obj).floatValue() : 0;
            if (hashMap.containsKey("init_pos")) {
                Object obj2 = hashMap.get("init_pos");
                if (obj2 instanceof Integer) {
                    i8 = ((Integer) obj2).intValue();
                } else if (obj2 instanceof Float) {
                    i8 = (int) ((Float) obj2).floatValue();
                }
            }
            q7 q7Var = new q7();
            this.f2507w = q7Var;
            q7Var.a(com.baidu.ar.imu.a.a(intValue));
            this.f2507w.a(i8);
            a(this.f2507w, this);
            f();
            IARRenderer d8 = d();
            if (d8 != null) {
                d8.updateDeviceOrientation();
                if (this.f2507w.a() == com.baidu.ar.imu.a.RELATIVE) {
                    d8.calibrationTouchAngle();
                }
                d8.setImuType(this.f2507w.a());
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("succeeded", 1);
            a(302, hashMap2);
        }
        if (ARConfig.getARType() == ARType.IMU.getTypeValue()) {
            StatisticApi.onEvent(StatisticConstants.IMU_SET_SUCCESS);
        }
    }

    public final Matrixf4x4 a(Vector3f vector3f) {
        Matrixf4x4 matrixf4x4 = new Matrixf4x4();
        matrixf4x4.setMatrixValues(this.f2508x.getMatrix());
        matrixf4x4.transpose();
        if (this.H) {
            a(matrixf4x4, vector3f);
        }
        float[] fArr = new float[16];
        Matrix.multiplyMM(fArr, this.A.getMatrix(), matrixf4x4.getMatrix());
        matrixf4x4.setMatrixValues(fArr);
        return matrixf4x4;
    }

    public final void b(Matrixf4x4 matrixf4x4) {
        float[] fArr = new float[16];
        Matrix.invertM(fArr, 0, matrixf4x4.getMatrix(), 0);
        Matrixf4x4 matrixf4x42 = new Matrixf4x4();
        matrixf4x42.setMatrix(fArr);
        matrixf4x42.setW0(0.0f);
        matrixf4x42.setW1(0.0f);
        matrixf4x42.setW2(0.0f);
        matrixf4x42.setW3(1.0f);
        Vector3f vector3f = new Vector3f(-fArr[12], -fArr[13], -fArr[14]);
        Vector4f vector4f = new Vector4f(0.0f, 0.0f, 1.0f, 1.0f);
        matrixf4x42.multiplyVector4fByMatrix(vector4f);
        Vector3f vector3f2 = new Vector3f(vector4f.x(), vector4f.y(), vector4f.z());
        vector3f2.add(vector3f);
        Vector4f vector4f2 = new Vector4f(0.0f, -1.0f, 0.0f, 1.0f);
        matrixf4x42.multiplyVector4fByMatrix(vector4f2);
        Matrixf4x4 lookAtLH = Matrixf4x4.lookAtLH(vector3f, vector3f2, new Vector3f(vector4f2.x(), vector4f2.y(), vector4f2.z()));
        Matrixf4x4 matrixf4x43 = new Matrixf4x4();
        matrixf4x43.setX0(-1.0f);
        Matrix.multiplyMM(matrixf4x4.getMatrix(), matrixf4x43.getMatrix(), lookAtLH.getMatrix());
    }

    public final Vector3f a(Matrixf4x4 matrixf4x4) {
        float[] matrix = matrixf4x4.getMatrix();
        Vector3f vector3f = new Vector3f(matrix[12], matrix[13], matrix[14]);
        Matrixf4x4 matrixf4x42 = new Matrixf4x4();
        matrix[14] = 0.0f;
        matrix[13] = 0.0f;
        matrix[12] = 0.0f;
        matrixf4x42.setMatrixValues(matrix);
        Matrixf4x4 matrixf4x43 = new Matrixf4x4();
        Matrix.invertM(matrixf4x43.getMatrix(), 0, matrixf4x42.getMatrix(), 0);
        Vector4f vector4f = new Vector4f();
        Matrix.multiplyMV3(vector4f.toArray(), matrixf4x43.getMatrix(), vector3f.toArray(), 1.0f);
        vector3f.setXYZ(vector4f.x(), vector4f.y(), vector4f.z());
        return vector3f;
    }

    public final void a(Matrixf4x4 matrixf4x4, Vector3f vector3f) {
        this.H = false;
        if (this.E == 1) {
            this.f2509y.setMatrixValues(matrixf4x4.getMatrix());
            Matrixf4x4 matrixf4x42 = new Matrixf4x4();
            matrixf4x42.setW0(vector3f.x());
            matrixf4x42.setW1(vector3f.y());
            matrixf4x42.setW2(vector3f.z());
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, matrixf4x4.getMatrix(), matrixf4x42.getMatrix());
            float[] fArr2 = new float[16];
            Matrix.invertM(fArr2, 0, fArr, 0);
            this.f2510z.setMatrixValues(fArr2);
            return;
        }
        float[] fArr3 = new float[16];
        Matrix.transposeM(fArr3, 0, matrixf4x4.getMatrix(), 0);
        this.A.setMatrixValues(fArr3);
    }

    public final void a(float[] fArr, int i8) {
        if (fArr == null || fArr.length != 16) {
            return;
        }
        System.arraycopy(fArr, 0, this.C, 0, 16);
        this.f2508x.setMatrixValues(this.C);
        this.D = true;
        this.E = i8;
        System.arraycopy(fArr, 0, this.C, 0, 16);
        this.f2508x.setMatrixValues(this.C);
        IARRenderer d8 = d();
        if (d8 != null) {
            d8.setEnvironmentDataPipKV(ARPScriptEnvironment.KEY_DATA_PIP_IMU, this.f2508x);
        }
        this.D = true;
        this.E = i8;
        g();
    }
}
