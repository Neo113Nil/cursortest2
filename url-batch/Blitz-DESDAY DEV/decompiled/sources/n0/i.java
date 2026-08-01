package n0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {
    public D.d d;

    /* renamed from: e, reason: collision with root package name */
    public float f3242e;

    /* renamed from: f, reason: collision with root package name */
    public D.d f3243f;

    /* renamed from: g, reason: collision with root package name */
    public float f3244g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3245j;

    /* renamed from: k, reason: collision with root package name */
    public float f3246k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f3247l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f3248m;

    /* renamed from: n, reason: collision with root package name */
    public float f3249n;

    @Override // n0.k
    public final boolean a() {
        return this.f3243f.c() || this.d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // n0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z2;
        D.d dVar;
        D.d dVar2 = this.f3243f;
        boolean z3 = false;
        if (dVar2.c()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f121b) {
                dVar2.f121b = colorForState;
                z2 = true;
                dVar = this.d;
                if (dVar.c()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f121b) {
                        dVar.f121b = colorForState2;
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
        return this.f3243f.f121b;
    }

    public float getStrokeAlpha() {
        return this.f3244g;
    }

    public int getStrokeColor() {
        return this.d.f121b;
    }

    public float getStrokeWidth() {
        return this.f3242e;
    }

    public float getTrimPathEnd() {
        return this.f3245j;
    }

    public float getTrimPathOffset() {
        return this.f3246k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i) {
        this.f3243f.f121b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f3244g = f2;
    }

    public void setStrokeColor(int i) {
        this.d.f121b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f3242e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f3245j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f3246k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
