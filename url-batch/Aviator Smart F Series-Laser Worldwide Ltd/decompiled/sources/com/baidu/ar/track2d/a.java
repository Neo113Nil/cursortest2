package com.baidu.ar.track2d;

import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.baidu.ar.arplay.representation.Matrix;
import com.baidu.ar.arplay.representation.Matrixf4x4;
import com.baidu.ar.arplay.representation.Quaternion;
import com.baidu.ar.arplay.representation.Vector3f;
import com.baidu.ar.arplay.representation.Vector4f;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.bb;
import com.baidu.ar.bd;
import com.baidu.ar.h;
import com.baidu.ar.m7;
import com.baidu.ar.q7;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.ar.tc;
import com.baidu.ar.track2d.ITrack2DState;
import com.baidu.ar.wc;
import com.baidu.ar.x5;
import com.baidu.ar.yc;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public IARRenderer f3335a;

    /* renamed from: b, reason: collision with root package name */
    public x5 f3336b;

    /* renamed from: c, reason: collision with root package name */
    public bd f3337c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3339e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3340f;

    /* renamed from: h, reason: collision with root package name */
    public ITrack2DStateChangedListener f3342h;

    /* renamed from: j, reason: collision with root package name */
    public q7 f3344j;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3338d = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3343i = false;

    /* renamed from: k, reason: collision with root package name */
    public Matrixf4x4 f3345k = new Matrixf4x4();

    /* renamed from: l, reason: collision with root package name */
    public Matrixf4x4 f3346l = new Matrixf4x4();

    /* renamed from: m, reason: collision with root package name */
    public Matrixf4x4 f3347m = new Matrixf4x4();

    /* renamed from: n, reason: collision with root package name */
    public Matrixf4x4 f3348n = new Matrixf4x4();

    /* renamed from: o, reason: collision with root package name */
    public boolean f3349o = true;

    /* renamed from: p, reason: collision with root package name */
    public float[] f3350p = new float[16];

    /* renamed from: q, reason: collision with root package name */
    public boolean f3351q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f3352r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3353s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3354t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3355u = false;

    /* renamed from: g, reason: collision with root package name */
    public b f3341g = new b();

    public a(IARRenderer iARRenderer, bd bdVar, x5 x5Var) {
        this.f3335a = iARRenderer;
        this.f3336b = x5Var;
        this.f3337c = bdVar;
    }

    public final Matrixf4x4 a(Matrixf4x4 matrixf4x4, Matrixf4x4 matrixf4x42, Vector3f vector3f) {
        Matrixf4x4 matrixf4x43 = new Matrixf4x4();
        if (this.f3352r != 1) {
            Matrixf4x4 matrixf4x44 = new Matrixf4x4();
            matrixf4x44.setW0(vector3f.x());
            matrixf4x44.setW1(vector3f.y());
            matrixf4x44.setW2(vector3f.z());
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, matrixf4x44.getMatrix(), matrixf4x4.getMatrix());
            float[] fArr2 = new float[16];
            Matrix.invertM(fArr2, 0, fArr, 0);
            matrixf4x43.setMatrixValues(fArr2);
        } else if (this.f3349o) {
            this.f3349o = false;
            this.f3346l.setMatrixValues(matrixf4x4.getMatrix());
            this.f3347m.loadIndentity();
            Matrix.translateM(this.f3347m.getMatrix(), 0, vector3f.getX(), vector3f.getY(), vector3f.getZ());
            float[] fArr3 = new float[16];
            Matrix.multiplyMM(fArr3, matrixf4x4.getMatrix(), this.f3347m.getMatrix());
            float[] fArr4 = new float[16];
            Matrix.invertM(fArr4, 0, fArr3, 0);
            this.f3347m.setMatrixValues(fArr4);
            matrixf4x43.setMatrixValues(matrixf4x42.getMatrix());
        } else {
            Matrixf4x4 matrixf4x45 = new Matrixf4x4();
            float[] fArr5 = new float[16];
            Matrix.transposeM(fArr5, 0, this.f3346l.getMatrix(), 0);
            float[] fArr6 = new float[16];
            Matrix.multiplyMM(fArr6, fArr5, matrixf4x4.getMatrix());
            matrixf4x45.setMatrixValues(fArr6);
            Matrix.transposeM(fArr6, 0, matrixf4x45.getMatrix(), 0);
            float[] fArr7 = new float[16];
            Matrix.multiplyMM(fArr7, fArr6, this.f3347m.getMatrix());
            matrixf4x43.setMatrixValues(fArr7);
        }
        return matrixf4x43;
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

    public void d() {
        IARRenderer iARRenderer;
        if (this.f3341g.f3356a || (iARRenderer = this.f3335a) == null) {
            return;
        }
        iARRenderer.pauseScene();
    }

    public final void e() {
        IARRenderer iARRenderer = this.f3335a;
        if (this.f3351q && !this.f3353s) {
            this.f3353s = true;
            if (iARRenderer != null) {
                this.f3354t = iARRenderer.isDriverdByARPVersion();
            }
        }
        if (iARRenderer != null) {
            Matrixf4x4 initialTransform = iARRenderer.getInitialTransform();
            Vector3f a8 = a(initialTransform);
            Matrixf4x4 a9 = a(a(a8), initialTransform, a8);
            if (this.f3343i) {
                b(a9);
            }
            q7 q7Var = this.f3344j;
            if (q7Var != null && q7Var.a() == com.baidu.ar.imu.a.WORLD && this.f3354t) {
                a9 = c(a9);
            }
            bb bbVar = new bb();
            bbVar.a("ability_image_track");
            bbVar.a(a9.getMatrix());
            iARRenderer.setOffScreenGuideWork(true);
            iARRenderer.updateRenderCameraData(bbVar);
        }
    }

    public final Matrixf4x4 a(Vector3f vector3f) {
        Matrixf4x4 matrixf4x4 = new Matrixf4x4();
        matrixf4x4.setMatrixValues(this.f3345k.getMatrix());
        matrixf4x4.transpose();
        if (this.f3355u) {
            a(matrixf4x4, vector3f);
        }
        float[] fArr = new float[16];
        Matrix.multiplyMM(fArr, this.f3348n.getMatrix(), matrixf4x4.getMatrix());
        matrixf4x4.setMatrixValues(fArr);
        return matrixf4x4;
    }

    public void b(boolean z7) {
        this.f3355u = z7;
    }

    public void c() {
        this.f3335a = null;
        this.f3342h = null;
        this.f3336b = null;
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

    public boolean b() {
        return this.f3341g.isTrackFound();
    }

    public final void a(Matrixf4x4 matrixf4x4, Vector3f vector3f) {
        this.f3355u = false;
        if (this.f3352r == 1) {
            this.f3346l.setMatrixValues(matrixf4x4.getMatrix());
            Matrixf4x4 matrixf4x42 = new Matrixf4x4();
            matrixf4x42.setW0(vector3f.x());
            matrixf4x42.setW1(vector3f.y());
            matrixf4x42.setW2(vector3f.z());
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, matrixf4x4.getMatrix(), matrixf4x42.getMatrix());
            float[] fArr2 = new float[16];
            Matrix.invertM(fArr2, 0, fArr, 0);
            this.f3347m.setMatrixValues(fArr2);
            return;
        }
        float[] fArr3 = new float[16];
        Matrix.transposeM(fArr3, 0, matrixf4x4.getMatrix(), 0);
        this.f3348n.setMatrixValues(fArr3);
    }

    public void a(m7 m7Var) {
        if (this.f3341g.isTrackFound() || m7Var == null) {
            return;
        }
        a(m7Var.d(), m7Var.c());
    }

    public void a(q7 q7Var) {
        this.f3344j = q7Var;
    }

    public void a(ITrack2DStateChangedListener iTrack2DStateChangedListener) {
        this.f3342h = iTrack2DStateChangedListener;
    }

    public void a(Track2DStateMessage track2DStateMessage) {
        ITrack2DStateChangedListener iTrack2DStateChangedListener = this.f3342h;
        if (iTrack2DStateChangedListener != null) {
            iTrack2DStateChangedListener.onStateChanged(track2DStateMessage, this.f3341g);
        }
    }

    public final void a(wc wcVar) {
        bd bdVar;
        Track2DStateMessage track2DStateMessage;
        if (wcVar == null || !wcVar.d() || (bdVar = this.f3337c) == null || bdVar.c() == null) {
            this.f3341g.f3359d = ITrack2DState.DistanceState.UNKNOWN;
            return;
        }
        ITrack2DState.DistanceState distanceState = this.f3341g.f3359d;
        float a8 = wcVar.a();
        tc c8 = this.f3337c.c();
        if (Float.isNaN(c8.a()) || Float.isNaN(c8.b())) {
            h.a("Far or Near Threshold is NaN");
            track2DStateMessage = null;
        } else if (a8 > c8.a()) {
            this.f3341g.f3359d = ITrack2DState.DistanceState.TOO_FAR;
            track2DStateMessage = Track2DStateMessage.TRACK_DISTANCE_TOO_FAR;
            a(track2DStateMessage);
        } else if (a8 < c8.b()) {
            this.f3341g.f3359d = ITrack2DState.DistanceState.TOO_NEAR;
            track2DStateMessage = Track2DStateMessage.TRACK_DISTANCE_TOO_NEAR;
        } else {
            this.f3341g.f3359d = ITrack2DState.DistanceState.NORMAL;
            track2DStateMessage = Track2DStateMessage.TRACK_DISTANCE_NORMAL;
        }
        if (distanceState != this.f3341g.f3359d) {
            a(track2DStateMessage);
        }
    }

    public void a(yc ycVar) {
        wc d8 = ycVar.d();
        if (this.f3335a == null || d8 == null) {
            return;
        }
        this.f3341g.f3357b = d8.d();
        StatisticApi.onEventStatus(StatisticConstants.TRACKED, StatisticConstants.UNTRACKED, this.f3341g.isTrackFound());
        if (d8.d()) {
            this.f3338d = true;
            if (d8.e()) {
                a(Track2DStateMessage.TRACK_FOUND);
                this.f3336b.a(101, null);
                this.f3335a.resumeScene();
                this.f3341g.f3356a = this.f3335a.set3DModelVisible(true);
                a(Track2DStateMessage.TRACK_MODEL_APPEAR);
            }
            b bVar = this.f3341g;
            if (!bVar.f3356a) {
                bVar.f3356a = this.f3335a.set3DModelVisible(true);
                a(Track2DStateMessage.TRACK_MODEL_APPEAR);
            }
            if (d8.b() != null) {
                a(d8.b());
            }
        } else {
            if (d8.f()) {
                a(Track2DStateMessage.TRACK_LOST);
                this.f3336b.a(102, null);
                if (!this.f3339e && !this.f3340f && !a()) {
                    this.f3341g.f3356a = false;
                    this.f3335a.pauseScene();
                    this.f3335a.set3DModelVisible(false);
                }
            }
            if (this.f3339e) {
                if (!this.f3341g.f3356a) {
                    this.f3335a.set3DModelVisible(true);
                    this.f3341g.f3356a = true;
                    a(Track2DStateMessage.TRACK_MODEL_APPEAR);
                }
            } else if (!this.f3338d && this.f3341g.f3356a) {
                this.f3335a.set3DModelVisible(false);
                this.f3341g.f3356a = false;
            }
        }
        a(d8);
    }

    public void a(HashMap<String, Object> hashMap) {
        int i8;
        int i9;
        if (hashMap != null) {
            i9 = hashMap.containsKey("show_immediately") ? ((Integer) hashMap.get("show_immediately")).intValue() : 0;
            i8 = hashMap.containsKey("imu_relay_ctrl_when_track_lost") ? ((Integer) hashMap.get("imu_relay_ctrl_when_track_lost")).intValue() : 0;
        } else {
            i8 = 0;
            i9 = 0;
        }
        boolean z7 = i9 == 1;
        this.f3339e = z7;
        this.f3341g.f3358c = z7;
        this.f3340f = i8 == 1;
        if (this.f3335a != null) {
            if (z7) {
                this.f3336b.a(101, null);
                this.f3335a.resumeScene();
                this.f3341g.f3356a = this.f3335a.set3DModelVisible(true);
                a(Track2DStateMessage.TRACK_MODEL_APPEAR);
            } else {
                a(Track2DStateMessage.MODEL_CAN_DISAPPEARING);
                this.f3336b.a(102, null);
                this.f3335a.pauseScene();
                this.f3335a.set3DModelVisible(false);
                this.f3341g.f3356a = false;
            }
        }
        a(Track2DStateMessage.MODEL_LOADED);
    }

    public void a(boolean z7) {
        this.f3343i = z7;
    }

    public void a(float[] fArr) {
        if (this.f3335a == null || fArr == null || fArr.length < 12) {
            return;
        }
        float[] fArr2 = {fArr[0], fArr[3], fArr[6], 0.0f, fArr[1], fArr[4], fArr[7], 0.0f, fArr[2], fArr[5], fArr[8], 0.0f, fArr[9], fArr[10], fArr[11], 1.0f};
        Matrixf4x4 matrixf4x4 = new Matrixf4x4();
        matrixf4x4.setMatrix(fArr2);
        Vector4f vector4f = new Vector4f(fArr[0], fArr[1], fArr[2], fArr[9]);
        Vector4f vector4f2 = new Vector4f(fArr[3], fArr[4], fArr[5], fArr[10]);
        Vector4f vector4f3 = new Vector4f(fArr[6], fArr[7], fArr[8], fArr[11]);
        Vector4f vector4f4 = new Vector4f(0.0f, 0.0f, 0.0f, 1.0f);
        Vector4f vector4f5 = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        if (new Vector4f(Math.abs(vector4f.dotProduct(vector4f5)), Math.abs(vector4f2.dotProduct(vector4f5)), Math.abs(vector4f3.dotProduct(vector4f5)), Math.abs(vector4f4.dotProduct(vector4f5))).dotProduct(vector4f5) > 0.001f) {
            this.f3335a.setEnvironmentDataPipKV(ARPScriptEnvironment.KEY_DATA_PIP_TRACK, matrixf4x4);
            this.f3335a.setOffScreenGuideWork(true);
        }
        bb bbVar = new bb();
        bbVar.a("ability_image_track");
        bbVar.a(matrixf4x4.getMatrix());
        this.f3335a.updateRenderCameraData(bbVar);
    }

    public final void a(float[] fArr, int i8) {
        if (fArr == null || fArr.length != 16) {
            return;
        }
        System.arraycopy(fArr, 0, this.f3350p, 0, 16);
        this.f3345k.setMatrixValues(this.f3350p);
        this.f3351q = true;
        this.f3352r = i8;
        System.arraycopy(fArr, 0, this.f3350p, 0, 16);
        this.f3345k.setMatrixValues(this.f3350p);
        IARRenderer iARRenderer = this.f3335a;
        if (iARRenderer != null) {
            iARRenderer.setEnvironmentDataPipKV(ARPScriptEnvironment.KEY_DATA_PIP_IMU, this.f3345k);
        }
        this.f3351q = true;
        this.f3352r = i8;
        e();
    }

    public boolean a() {
        IARRenderer iARRenderer = this.f3335a;
        if (iARRenderer == null || iARRenderer.getLuaApplicationState() == null) {
            return false;
        }
        return this.f3335a.getLuaApplicationState().b();
    }
}
