package com.baidu.ar;

import android.app.Activity;
import android.util.Log;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.i1;
import com.huawei.hiar.ARCameraIntrinsics;
import com.huawei.hiar.ARConfigBase;
import com.huawei.hiar.ARFrame;
import com.huawei.hiar.ARPose;
import com.huawei.hiar.ARSession;
import com.huawei.hiar.ARWorldTrackingConfig;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class e extends i1 {

    /* renamed from: b, reason: collision with root package name */
    public Activity f2106b;

    /* renamed from: c, reason: collision with root package name */
    public ARSession f2107c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2109e;

    /* renamed from: d, reason: collision with root package name */
    public float[] f2108d = {1095.9f, 0.0f, 719.122f, 0.0f, 1095.8f, 548.474f, 0.0f, 0.0f, 1.0f};

    /* renamed from: f, reason: collision with root package name */
    public boolean f2110f = true;

    public e(Activity activity) {
        new LinkedList();
        this.f2106b = activity;
    }

    @Override // com.baidu.ar.i1
    public void a() {
        double d8;
        super.a();
        ARSession aRSession = this.f2107c;
        if (aRSession == null) {
            return;
        }
        ARFrame update = aRSession.update();
        ARPose pose = update.getCamera().getPose();
        ARCameraIntrinsics cameraImageIntrinsics = update.getCamera().getCameraImageIntrinsics();
        float[] principalPoint = cameraImageIntrinsics.getPrincipalPoint();
        float[] focalLength = cameraImageIntrinsics.getFocalLength();
        float[] fArr = a(focalLength) ? new float[]{focalLength[1], 0.0f, principalPoint[1], 0.0f, focalLength[0], principalPoint[0], 0.0f, 0.0f, 1.0f} : this.f2109e ? this.f2108d : null;
        if (fArr != null) {
            d8 = fArr[2] / fArr[0];
        } else {
            float[] fArr2 = this.f2108d;
            d8 = fArr2[2] / fArr2[0];
        }
        double atan = ((Math.atan(d8) * 2.0d) / 3.141592653589793d) * 180.0d;
        Log.e("AREngineAbility", "fov:" + atan);
        float[] fArr3 = new float[16];
        pose.toMatrix(fArr3, 0);
        float[] fArr4 = {fArr3[0], fArr3[4], fArr3[8], fArr3[1], fArr3[5], fArr3[9], fArr3[2], fArr3[6], fArr3[10], fArr3[12], fArr3[13], fArr3[14]};
        i1.a aVar = this.f2437a;
        if (aVar != null) {
            aVar.a(0, fArr, (float) atan, fArr4, fArr3);
        }
    }

    @Override // com.baidu.ar.i1
    public boolean b() {
        try {
            this.f2110f = false;
            this.f2107c.pause();
            this.f2107c.stop();
            this.f2107c = null;
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return super.b();
        }
    }

    @Override // com.baidu.ar.i1
    public void c() {
        ARSession aRSession = this.f2107c;
        if (aRSession != null) {
            aRSession.stop();
            this.f2107c = null;
        }
    }

    @Override // com.baidu.ar.i1
    public boolean d() {
        if (!this.f2110f) {
            a(this.f2109e);
            this.f2110f = true;
        }
        ARSession aRSession = this.f2107c;
        if (aRSession == null) {
            return super.d();
        }
        aRSession.resume();
        return true;
    }

    @Override // com.baidu.ar.b7
    public void a(Texture texture) {
        ARSession aRSession = this.f2107c;
        if (aRSession != null) {
            aRSession.setCameraTextureName(texture.getId());
        }
    }

    @Override // com.baidu.ar.i1
    public boolean a(boolean z7) {
        try {
            this.f2109e = z7;
            this.f2107c = new ARSession(this.f2106b);
            ARWorldTrackingConfig aRWorldTrackingConfig = new ARWorldTrackingConfig(this.f2107c);
            aRWorldTrackingConfig.setFocusMode(z7 ? ARConfigBase.FocusMode.FIXED_FOCUS : ARConfigBase.FocusMode.AUTO_FOCUS);
            aRWorldTrackingConfig.setSemanticMode(1);
            this.f2107c.configure(aRWorldTrackingConfig);
            return true;
        } catch (Exception e8) {
            Log.e("AREngineAbility", "create ARSession error!!!");
            e8.printStackTrace();
            ARSession aRSession = this.f2107c;
            if (aRSession == null) {
                return false;
            }
            aRSession.stop();
            this.f2107c = null;
            return false;
        }
    }

    public final boolean a(float[] fArr) {
        for (float f8 : fArr) {
            if (f8 == 0.0f) {
                return false;
            }
        }
        return true;
    }
}
