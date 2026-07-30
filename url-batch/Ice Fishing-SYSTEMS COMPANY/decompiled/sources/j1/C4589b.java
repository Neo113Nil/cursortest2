package j1;

import android.graphics.Color;
import android.graphics.Matrix;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4589b {

    /* renamed from: a, reason: collision with root package name */
    public float f38479a;

    /* renamed from: b, reason: collision with root package name */
    public float f38480b;

    /* renamed from: c, reason: collision with root package name */
    public float f38481c;

    /* renamed from: d, reason: collision with root package name */
    public int f38482d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f38483e = null;

    public C4589b(C4589b c4589b) {
        this.f38479a = 0.0f;
        this.f38480b = 0.0f;
        this.f38481c = 0.0f;
        this.f38482d = 0;
        this.f38479a = c4589b.f38479a;
        this.f38480b = c4589b.f38480b;
        this.f38481c = c4589b.f38481c;
        this.f38482d = c4589b.f38482d;
    }

    public final void a(int i, Y0.a aVar) {
        int alpha = Color.alpha(this.f38482d);
        int c4 = h.c(i);
        Matrix matrix = j.f38533a;
        int i4 = (int) ((((alpha / 255.0f) * c4) / 255.0f) * 255.0f);
        if (i4 <= 0) {
            aVar.clearShadowLayer();
        } else {
            aVar.setShadowLayer(Math.max(this.f38479a, Float.MIN_VALUE), this.f38480b, this.f38481c, Color.argb(i4, Color.red(this.f38482d), Color.green(this.f38482d), Color.blue(this.f38482d)));
        }
    }

    public final void b(int i) {
        this.f38482d = Color.argb(Math.round((h.c(i) * Color.alpha(this.f38482d)) / 255.0f), Color.red(this.f38482d), Color.green(this.f38482d), Color.blue(this.f38482d));
    }

    public final void c(Matrix matrix) {
        if (this.f38483e == null) {
            this.f38483e = new float[2];
        }
        float[] fArr = this.f38483e;
        fArr[0] = this.f38480b;
        fArr[1] = this.f38481c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f38483e;
        this.f38480b = fArr2[0];
        this.f38481c = fArr2[1];
        this.f38479a = matrix.mapRadius(this.f38479a);
    }
}
