package l0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {
    public B.d d;

    /* renamed from: e, reason: collision with root package name */
    public float f3090e;

    /* renamed from: f, reason: collision with root package name */
    public B.d f3091f;

    /* renamed from: g, reason: collision with root package name */
    public float f3092g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3093j;

    /* renamed from: k, reason: collision with root package name */
    public float f3094k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f3095l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f3096m;

    /* renamed from: n, reason: collision with root package name */
    public float f3097n;

    @Override // l0.k
    public final boolean a() {
        return this.f3091f.c() || this.d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // l0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z2;
        B.d dVar;
        B.d dVar2 = this.f3091f;
        boolean z3 = false;
        if (dVar2.c()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f41b) {
                dVar2.f41b = colorForState;
                z2 = true;
                dVar = this.d;
                if (dVar.c()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f41b) {
                        dVar.f41b = colorForState2;
                        z3 = true;
                    }
                }
                return z2 | z3;
            }
        }
        z2 = false;
        dVar = this.d;
        if (dVar.c()) {
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f3091f.f41b;
    }

    public float getStrokeAlpha() {
        return this.f3092g;
    }

    public int getStrokeColor() {
        return this.d.f41b;
    }

    public float getStrokeWidth() {
        return this.f3090e;
    }

    public float getTrimPathEnd() {
        return this.f3093j;
    }

    public float getTrimPathOffset() {
        return this.f3094k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i) {
        this.f3091f.f41b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f3092g = f2;
    }

    public void setStrokeColor(int i) {
        this.d.f41b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f3090e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f3093j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f3094k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
