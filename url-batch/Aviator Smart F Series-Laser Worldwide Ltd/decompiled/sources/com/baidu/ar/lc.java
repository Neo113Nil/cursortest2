package com.baidu.ar;

import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;

/* loaded from: classes.dex */
public class lc {

    /* renamed from: g, reason: collision with root package name */
    public static final String f2723g = "lc";

    /* renamed from: a, reason: collision with root package name */
    public int f2724a = 500;

    /* renamed from: b, reason: collision with root package name */
    public int f2725b = 500;

    /* renamed from: c, reason: collision with root package name */
    public Surface f2726c;

    /* renamed from: d, reason: collision with root package name */
    public Canvas f2727d;

    /* renamed from: e, reason: collision with root package name */
    public SurfaceTexture f2728e;

    /* renamed from: f, reason: collision with root package name */
    public int f2729f;

    public Canvas a() {
        this.f2727d = null;
        Surface surface = this.f2726c;
        if (surface != null) {
            try {
                this.f2727d = surface.lockCanvas(null);
            } catch (Exception e8) {
                Log.e(f2723g, "error while rendering view to gl: " + e8);
            }
        }
        return this.f2727d;
    }

    public void b() {
        Surface surface = this.f2726c;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f2728e;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f2726c = null;
        this.f2728e = null;
    }

    public void c() {
        Canvas canvas = this.f2727d;
        if (canvas != null) {
            this.f2726c.unlockCanvasAndPost(canvas);
        }
        this.f2727d = null;
    }

    public void d() {
        try {
            this.f2728e.updateTexImage();
        } catch (Exception e8) {
            Log.e(f2723g, "error while update view to gl: " + e8);
        }
    }

    public Surface a(int i8, int i9, int i10) {
        this.f2729f = i8;
        this.f2728e = new SurfaceTexture(i8);
        a(i9, i10);
        Surface surface = new Surface(this.f2728e);
        this.f2726c = surface;
        return surface;
    }

    public void a(int i8, int i9) {
        this.f2724a = i8;
        this.f2725b = i9;
        this.f2728e.setDefaultBufferSize(i8, i9);
    }
}
