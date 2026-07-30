package com.baidu.ar;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.bean.MirriorType;
import com.baidu.ar.bean.RotationType;
import com.baidu.ar.bean.ScaleType;
import com.baidu.ar.bean.Watermark;

/* loaded from: classes.dex */
public class DuMixOutput {

    /* renamed from: a, reason: collision with root package name */
    public Object f1524a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1525b;

    /* renamed from: c, reason: collision with root package name */
    public int f1526c;

    /* renamed from: d, reason: collision with root package name */
    public int f1527d;

    /* renamed from: e, reason: collision with root package name */
    public ScaleType f1528e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1529f;

    /* renamed from: g, reason: collision with root package name */
    public int f1530g;

    /* renamed from: h, reason: collision with root package name */
    public RotationType f1531h;

    /* renamed from: i, reason: collision with root package name */
    public MirriorType f1532i;

    /* renamed from: j, reason: collision with root package name */
    public int f1533j;

    /* renamed from: k, reason: collision with root package name */
    public Watermark f1534k;

    public DuMixOutput() {
        this.f1524a = null;
        this.f1525b = false;
        this.f1528e = ScaleType.CENTER_CROP;
        this.f1529f = true;
        this.f1530g = 1;
        this.f1531h = RotationType.ROTATE_0;
        this.f1532i = MirriorType.NO_MIRRIOR;
        this.f1533j = 0;
    }

    public MirriorType getMirriorType() {
        return this.f1532i;
    }

    public int getOutputFPS() {
        return this.f1533j;
    }

    public int getOutputHeight() {
        return this.f1527d;
    }

    public Object getOutputSurface() {
        return this.f1524a;
    }

    public Texture getOutputTexture() {
        Object obj = this.f1524a;
        if (obj == null || !(obj instanceof Texture)) {
            return null;
        }
        return (Texture) obj;
    }

    public int getOutputWidth() {
        return this.f1526c;
    }

    public RotationType getRotationType() {
        return this.f1531h;
    }

    public ScaleType getScaleType() {
        return this.f1528e;
    }

    public int getScreenOrientation() {
        return this.f1530g;
    }

    public Watermark getWatermark() {
        return this.f1534k;
    }

    public boolean isFitScreenAuto() {
        return this.f1529f;
    }

    public boolean isNeedDetach() {
        return this.f1525b;
    }

    public void setFitScreenAuto(boolean z7) {
        this.f1529f = z7;
    }

    public void setMirriorType(MirriorType mirriorType) {
        this.f1532i = mirriorType;
    }

    public void setNeedDetach(boolean z7) {
        this.f1525b = z7;
    }

    public void setOutputFPS(int i8) {
        this.f1533j = i8;
    }

    public void setOutputHeight(int i8) {
        this.f1527d = i8;
    }

    public void setOutputSurface(SurfaceTexture surfaceTexture) {
        this.f1524a = surfaceTexture;
    }

    public void setOutputTexture(Texture texture) {
        this.f1524a = texture;
    }

    public void setOutputWidth(int i8) {
        this.f1526c = i8;
    }

    public void setRotationType(RotationType rotationType) {
        this.f1531h = rotationType;
    }

    public void setScaleType(ScaleType scaleType) {
        this.f1528e = scaleType;
    }

    public void setScreenOrientation(int i8) {
        this.f1530g = i8;
    }

    public void setWatermark(Watermark watermark) {
        this.f1534k = watermark;
    }

    public DuMixOutput(int i8, int i9) {
        this.f1524a = null;
        this.f1525b = false;
        this.f1528e = ScaleType.CENTER_CROP;
        this.f1529f = true;
        this.f1530g = 1;
        this.f1531h = RotationType.ROTATE_0;
        this.f1532i = MirriorType.NO_MIRRIOR;
        this.f1533j = 0;
        this.f1526c = i8;
        this.f1527d = i9;
    }

    public void setOutputSurface(Surface surface) {
        this.f1524a = surface;
    }

    public DuMixOutput(SurfaceTexture surfaceTexture, int i8, int i9) {
        this.f1524a = null;
        this.f1525b = false;
        this.f1528e = ScaleType.CENTER_CROP;
        this.f1529f = true;
        this.f1530g = 1;
        this.f1531h = RotationType.ROTATE_0;
        this.f1532i = MirriorType.NO_MIRRIOR;
        this.f1533j = 0;
        this.f1524a = surfaceTexture;
        this.f1526c = i8;
        this.f1527d = i9;
    }

    public void setOutputSurface(SurfaceHolder surfaceHolder) {
        this.f1524a = surfaceHolder;
    }

    public DuMixOutput(Surface surface, int i8, int i9) {
        this.f1524a = null;
        this.f1525b = false;
        this.f1528e = ScaleType.CENTER_CROP;
        this.f1529f = true;
        this.f1530g = 1;
        this.f1531h = RotationType.ROTATE_0;
        this.f1532i = MirriorType.NO_MIRRIOR;
        this.f1533j = 0;
        this.f1524a = surface;
        this.f1526c = i8;
        this.f1527d = i9;
    }

    public DuMixOutput(SurfaceHolder surfaceHolder, int i8, int i9) {
        this.f1524a = null;
        this.f1525b = false;
        this.f1528e = ScaleType.CENTER_CROP;
        this.f1529f = true;
        this.f1530g = 1;
        this.f1531h = RotationType.ROTATE_0;
        this.f1532i = MirriorType.NO_MIRRIOR;
        this.f1533j = 0;
        this.f1524a = surfaceHolder;
        this.f1526c = i8;
        this.f1527d = i9;
    }

    public DuMixOutput(Texture texture, int i8, int i9) {
        this.f1524a = null;
        this.f1525b = false;
        this.f1528e = ScaleType.CENTER_CROP;
        this.f1529f = true;
        this.f1530g = 1;
        this.f1531h = RotationType.ROTATE_0;
        this.f1532i = MirriorType.NO_MIRRIOR;
        this.f1533j = 0;
        this.f1524a = texture;
        this.f1526c = i8;
        this.f1527d = i9;
    }
}
