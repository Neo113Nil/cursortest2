package q0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* renamed from: q0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340i extends AbstractC0343l {

    /* renamed from: d, reason: collision with root package name */
    public D.d f3947d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public D.d f3948f;

    /* renamed from: g, reason: collision with root package name */
    public float f3949g;

    /* renamed from: h, reason: collision with root package name */
    public float f3950h;
    public float i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f3951k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f3952l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f3953m;

    /* renamed from: n, reason: collision with root package name */
    public float f3954n;

    @Override // q0.AbstractC0342k
    public final boolean a() {
        return this.f3948f.d() || this.f3947d.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // q0.AbstractC0342k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z2;
        D.d dVar;
        D.d dVar2 = this.f3948f;
        boolean z3 = false;
        if (dVar2.d()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.f170d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f168b) {
                dVar2.f168b = colorForState;
                z2 = true;
                dVar = this.f3947d;
                if (dVar.d()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.f170d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f168b) {
                        dVar.f168b = colorForState2;
                        z3 = true;
                    }
                }
                return z2 | z3;
            }
        }
        z2 = false;
        dVar = this.f3947d;
        if (dVar.d()) {
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.f3950h;
    }

    public int getFillColor() {
        return this.f3948f.f168b;
    }

    public float getStrokeAlpha() {
        return this.f3949g;
    }

    public int getStrokeColor() {
        return this.f3947d.f168b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.f3951k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.f3950h = f2;
    }

    public void setFillColor(int i) {
        this.f3948f.f168b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f3949g = f2;
    }

    public void setStrokeColor(int i) {
        this.f3947d.f168b = i;
    }

    public void setStrokeWidth(float f2) {
        this.e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f3951k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
