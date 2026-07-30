package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelType;

/* loaded from: classes.dex */
public class k9 extends o4 {

    /* renamed from: i, reason: collision with root package name */
    public m6 f2657i;

    /* renamed from: j, reason: collision with root package name */
    public long f2658j;

    public k9(Context context, int i8, int i9) {
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.NV21);
        this.f2878e = pixelReadParams;
        pixelReadParams.setOutputWidth(i8);
        this.f2878e.setOutputHeight(i9);
        if (this.f2657i == null) {
            Object a8 = ab.a("com.baidu.ar.maprecord.NavigationRecoderController");
            if (a8 instanceof m6) {
                m6 m6Var = (m6) a8;
                this.f2657i = m6Var;
                m6Var.a(context, i8, i9);
            }
        }
    }

    public void a(float f8) {
        m6 m6Var = this.f2657i;
        if (m6Var != null) {
            m6Var.a(f8);
        }
    }

    public void b(float[] fArr) {
        m6 m6Var = this.f2657i;
        if (m6Var != null) {
            m6Var.b(fArr);
        }
    }

    public void c(float[] fArr) {
        m6 m6Var = this.f2657i;
        if (m6Var != null) {
            m6Var.a(fArr);
        }
    }

    @Override // com.baidu.ar.o4
    public void e() {
    }

    @Override // com.baidu.ar.o4
    public void f() {
    }

    public void g() {
        m6 m6Var = this.f2657i;
        if (m6Var != null) {
            m6Var.stopRecord();
            this.f2657i = null;
        }
    }

    @Override // com.baidu.ar.t5
    public String getName() {
        return "NavigationRecoderDetector";
    }

    public void a(float f8, float f9) {
        m6 m6Var = this.f2657i;
        if (m6Var != null) {
            m6Var.a(f8, f9);
        }
    }

    public void a(String str) {
        m6 m6Var = this.f2657i;
        if (m6Var != null) {
            m6Var.a(str);
        }
    }

    public void a(float[] fArr) {
        m6 m6Var = this.f2657i;
        if (m6Var != null) {
            m6Var.c(fArr);
        }
    }

    public void a(float[] fArr, int i8) {
        m6 m6Var = this.f2657i;
        if (m6Var != null) {
            m6Var.a(fArr, i8);
        }
    }

    public void a(float[] fArr, int i8, boolean z7) {
        m6 m6Var = this.f2657i;
        if (m6Var != null) {
            m6Var.a(fArr, i8, z7);
        }
    }

    @Override // com.baidu.ar.o4
    public boolean a(FramePixels framePixels) {
        m6 m6Var = this.f2657i;
        if (m6Var == null) {
            return false;
        }
        this.f2658j++;
        m6Var.a(framePixels.getPixelData());
        return false;
    }
}
