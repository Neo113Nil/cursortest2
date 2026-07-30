package com.baidu.ar;

import android.graphics.SurfaceTexture;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.bean.MirriorType;
import com.baidu.ar.bean.RotationType;

/* loaded from: classes.dex */
public class DuMixInput {

    /* renamed from: a, reason: collision with root package name */
    public SurfaceTexture f1513a;

    /* renamed from: b, reason: collision with root package name */
    public Texture f1514b;

    /* renamed from: c, reason: collision with root package name */
    public int f1515c;

    /* renamed from: d, reason: collision with root package name */
    public int f1516d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1517e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1518f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1519g;

    /* renamed from: h, reason: collision with root package name */
    public RotationType f1520h;

    /* renamed from: i, reason: collision with root package name */
    public MirriorType f1521i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1522j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1523k;

    public DuMixInput() {
        this.f1515c = 0;
        this.f1516d = 0;
        this.f1517e = true;
        this.f1518f = true;
        this.f1519g = true;
        this.f1520h = RotationType.ROTATE_90;
        this.f1521i = MirriorType.NO_MIRRIOR;
        this.f1522j = false;
        this.f1523k = false;
    }

    public int getInputDegree() {
        return this.f1520h.getDegree();
    }

    public int getInputHeight() {
        return this.f1516d;
    }

    public SurfaceTexture getInputSurface() {
        return this.f1513a;
    }

    public Texture getInputTexture() {
        return this.f1514b;
    }

    public int getInputWidth() {
        return this.f1515c;
    }

    public MirriorType getMirriorType() {
        return this.f1521i;
    }

    public RotationType getRotationType() {
        return this.f1520h;
    }

    public boolean isCameraInput() {
        return this.f1517e;
    }

    public boolean isFitCameraAuto() {
        return this.f1519g;
    }

    public boolean isFrontCamera() {
        return this.f1518f;
    }

    public boolean isSingleFrame() {
        return this.f1523k;
    }

    public boolean isSyncInputContent() {
        return this.f1522j;
    }

    public void setCameraInput(boolean z7) {
        this.f1517e = z7;
    }

    public void setFitCameraAuto(boolean z7) {
        this.f1519g = z7;
    }

    public void setFrontCamera(boolean z7) {
        this.f1518f = z7;
    }

    public void setInputDegree(int i8) {
        RotationType rotationType;
        int i9 = ((i8 % 360) + 360) % 360;
        if (i8 == 0) {
            rotationType = RotationType.ROTATE_0;
        } else if (i8 == 90) {
            rotationType = RotationType.ROTATE_90;
        } else if (i8 == 180) {
            rotationType = RotationType.ROTATE_180;
        } else if (i8 != 270) {
            return;
        } else {
            rotationType = RotationType.ROTATE_270;
        }
        this.f1520h = rotationType;
    }

    public void setInputHeight(int i8) {
        this.f1516d = i8;
    }

    public void setInputSurface(SurfaceTexture surfaceTexture) {
        this.f1513a = surfaceTexture;
    }

    public void setInputTexture(Texture texture) {
        this.f1514b = texture;
    }

    public void setInputWidth(int i8) {
        this.f1515c = i8;
    }

    public void setMirriorType(MirriorType mirriorType) {
        this.f1521i = mirriorType;
    }

    public void setRotationType(RotationType rotationType) {
        this.f1520h = rotationType;
    }

    public void setSingleFrame(boolean z7) {
        this.f1523k = z7;
        if (z7) {
            this.f1522j = true;
            this.f1517e = false;
            this.f1518f = false;
        }
    }

    public void setSyncInputContent(boolean z7) {
        this.f1522j = z7;
    }

    public DuMixInput(int i8, int i9) {
        this.f1515c = 0;
        this.f1516d = 0;
        this.f1517e = true;
        this.f1518f = true;
        this.f1519g = true;
        this.f1520h = RotationType.ROTATE_90;
        this.f1521i = MirriorType.NO_MIRRIOR;
        this.f1522j = false;
        this.f1523k = false;
        this.f1515c = i8;
        this.f1516d = i9;
    }

    public DuMixInput(SurfaceTexture surfaceTexture, int i8, int i9) {
        this.f1515c = 0;
        this.f1516d = 0;
        this.f1517e = true;
        this.f1518f = true;
        this.f1519g = true;
        this.f1520h = RotationType.ROTATE_90;
        this.f1521i = MirriorType.NO_MIRRIOR;
        this.f1522j = false;
        this.f1523k = false;
        this.f1513a = surfaceTexture;
        this.f1515c = i8;
        this.f1516d = i9;
    }

    public DuMixInput(Texture texture, int i8, int i9) {
        this.f1515c = 0;
        this.f1516d = 0;
        this.f1517e = true;
        this.f1518f = true;
        this.f1519g = true;
        this.f1520h = RotationType.ROTATE_90;
        this.f1521i = MirriorType.NO_MIRRIOR;
        this.f1522j = false;
        this.f1523k = false;
        this.f1514b = texture;
        this.f1515c = i8;
        this.f1516d = i9;
    }
}
