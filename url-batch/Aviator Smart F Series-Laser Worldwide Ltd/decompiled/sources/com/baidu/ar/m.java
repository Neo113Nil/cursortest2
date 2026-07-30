package com.baidu.ar;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arrender.IGLRenderer;
import com.baidu.ar.arrender.Texture;

/* loaded from: classes.dex */
public class m extends com.baidu.ar.arrender.a implements IGLRenderer {
    public String Z;

    /* renamed from: a0, reason: collision with root package name */
    public String f2763a0;

    public m(Context context, Looper looper, r3 r3Var, EGLContext eGLContext, String str) {
        super(context, looper, r3Var, eGLContext, str);
        this.Z = "";
        this.f2763a0 = "";
        this.Z = Build.HARDWARE.toLowerCase();
        this.f2763a0 = Build.BOARD.toLowerCase();
    }

    @Override // com.baidu.ar.arrender.IGLRenderer
    public void bindTargetSurface(Surface surface) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().bindTargetSurface(surface);
    }

    @Override // com.baidu.ar.arrender.IGLRenderer
    public Texture createTexture(int i8, int i9, int i10) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return null;
        }
        Texture texture = new Texture();
        long createTexture = this.f2283j.getARPRenderer().createTexture(i8, i9, i10);
        texture.setHandle(createTexture);
        texture.setId(this.f2283j.getARPRenderer().getTextureId(createTexture));
        texture.setType(i8);
        return texture;
    }

    @Override // com.baidu.ar.arrender.IGLRenderer
    public void destroyTexture(Texture texture) {
        ARPEngine aRPEngine;
        if (texture == null || (aRPEngine = this.f2283j) == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().destroyTexture(texture.getHandle());
    }

    @Override // com.baidu.ar.arrender.a, com.baidu.ar.arrender.b, com.baidu.ar.arplay.core.renderer.OnRenderFinishedListener
    public void onRenderFinished(long j8) {
        super.onRenderFinished(j8);
        if (TextUtils.isEmpty(this.Z) || !this.Z.contains("qcom") || TextUtils.isEmpty(this.f2763a0)) {
            return;
        }
        if (this.f2763a0.contains("msm8953") || this.f2763a0.contains("sdm632")) {
            GLES20.glFinish();
        }
    }

    @Override // com.baidu.ar.arrender.a, com.baidu.ar.arrender.b, com.baidu.ar.g0
    public void release() {
        super.release();
    }

    @Override // com.baidu.ar.arrender.IGLRenderer
    public void runSyncOnIOContext(Runnable runnable) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null || runnable == null) {
            return;
        }
        this.f2283j.getARPRenderer().runSyncOnIOContext(runnable);
    }

    @Override // com.baidu.ar.arrender.IGLRenderer
    public void setInputTexture(int i8, int i9, int i10, int i11) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().setInputTexture(i8, i9, i10, i11);
    }

    @Override // com.baidu.ar.arrender.IGLRenderer
    public void swapBuffer() {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().swapBuffer();
    }
}
