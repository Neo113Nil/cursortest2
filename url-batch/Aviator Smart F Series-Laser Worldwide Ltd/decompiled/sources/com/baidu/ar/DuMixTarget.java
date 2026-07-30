package com.baidu.ar;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public class DuMixTarget {

    /* renamed from: a, reason: collision with root package name */
    public SurfaceTexture f1546a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceTexture.OnFrameAvailableListener f1547b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceHolder f1548c;

    /* renamed from: d, reason: collision with root package name */
    public int f1549d;

    /* renamed from: e, reason: collision with root package name */
    public int f1550e;

    /* renamed from: f, reason: collision with root package name */
    public a f1551f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1552g;

    public enum a {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public DuMixTarget(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, int i8, int i9, boolean z7) {
        this.f1546a = surfaceTexture;
        this.f1547b = onFrameAvailableListener;
        this.f1549d = i8;
        this.f1550e = i9;
        this.f1552g = z7;
    }

    public SurfaceTexture getDrawTarget() {
        return this.f1546a;
    }

    public a getScaleType() {
        return this.f1551f;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.f1548c;
    }

    public SurfaceTexture.OnFrameAvailableListener getTargetFrameAvailableListener() {
        return this.f1547b;
    }

    public int getTargetHeight() {
        return this.f1550e;
    }

    public int getTargetWidth() {
        return this.f1549d;
    }

    public boolean isDrawPreview() {
        return this.f1552g;
    }

    public void setDrawPreview(boolean z7) {
        this.f1552g = z7;
    }

    public void setDrawTarget(SurfaceTexture surfaceTexture) {
        this.f1546a = surfaceTexture;
    }

    public void setScaleType(a aVar) {
        this.f1551f = aVar;
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.f1548c = surfaceHolder;
    }

    public void setTargetFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.f1547b = onFrameAvailableListener;
    }

    public void setTargetHeight(int i8) {
        this.f1550e = i8;
    }

    public void setTargetWidth(int i8) {
        this.f1549d = i8;
    }

    public DuMixTarget(SurfaceHolder surfaceHolder, int i8, int i9, boolean z7) {
        this.f1548c = surfaceHolder;
        this.f1549d = i8;
        this.f1550e = i9;
        this.f1552g = z7;
    }
}
