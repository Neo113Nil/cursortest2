package E0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public F.d f751d;

    /* renamed from: e, reason: collision with root package name */
    public float f752e;

    /* renamed from: f, reason: collision with root package name */
    public F.d f753f;

    /* renamed from: g, reason: collision with root package name */
    public float f754g;

    /* renamed from: h, reason: collision with root package name */
    public float f755h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f756j;

    /* renamed from: k, reason: collision with root package name */
    public float f757k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f758l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f759m;

    /* renamed from: n, reason: collision with root package name */
    public float f760n;

    @Override // E0.k
    public final boolean a() {
        return this.f753f.g() || this.f751d.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // E0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z8;
        F.d dVar;
        F.d dVar2 = this.f753f;
        boolean z9 = false;
        if (dVar2.g()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.f910d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f908b) {
                dVar2.f908b = colorForState;
                z8 = true;
                dVar = this.f751d;
                if (dVar.g()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.f910d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f908b) {
                        dVar.f908b = colorForState2;
                        z9 = true;
                    }
                }
                return z8 | z9;
            }
        }
        z8 = false;
        dVar = this.f751d;
        if (dVar.g()) {
        }
        return z8 | z9;
    }

    public float getFillAlpha() {
        return this.f755h;
    }

    public int getFillColor() {
        return this.f753f.f908b;
    }

    public float getStrokeAlpha() {
        return this.f754g;
    }

    public int getStrokeColor() {
        return this.f751d.f908b;
    }

    public float getStrokeWidth() {
        return this.f752e;
    }

    public float getTrimPathEnd() {
        return this.f756j;
    }

    public float getTrimPathOffset() {
        return this.f757k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f6) {
        this.f755h = f6;
    }

    public void setFillColor(int i) {
        this.f753f.f908b = i;
    }

    public void setStrokeAlpha(float f6) {
        this.f754g = f6;
    }

    public void setStrokeColor(int i) {
        this.f751d.f908b = i;
    }

    public void setStrokeWidth(float f6) {
        this.f752e = f6;
    }

    public void setTrimPathEnd(float f6) {
        this.f756j = f6;
    }

    public void setTrimPathOffset(float f6) {
        this.f757k = f6;
    }

    public void setTrimPathStart(float f6) {
        this.i = f6;
    }
}
