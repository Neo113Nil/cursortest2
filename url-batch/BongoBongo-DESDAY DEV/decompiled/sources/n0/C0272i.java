package n0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272i extends AbstractC0275l {
    public C.d d;

    /* renamed from: e, reason: collision with root package name */
    public float f3331e;

    /* renamed from: f, reason: collision with root package name */
    public C.d f3332f;

    /* renamed from: g, reason: collision with root package name */
    public float f3333g;

    /* renamed from: h, reason: collision with root package name */
    public float f3334h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3335j;

    /* renamed from: k, reason: collision with root package name */
    public float f3336k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f3337l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f3338m;

    /* renamed from: n, reason: collision with root package name */
    public float f3339n;

    @Override // n0.AbstractC0274k
    public final boolean a() {
        return this.f3332f.c() || this.d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // n0.AbstractC0274k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z2;
        C.d dVar;
        C.d dVar2 = this.f3332f;
        boolean z3 = false;
        if (dVar2.c()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f74b) {
                dVar2.f74b = colorForState;
                z2 = true;
                dVar = this.d;
                if (dVar.c()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f74b) {
                        dVar.f74b = colorForState2;
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
        return this.f3334h;
    }

    public int getFillColor() {
        return this.f3332f.f74b;
    }

    public float getStrokeAlpha() {
        return this.f3333g;
    }

    public int getStrokeColor() {
        return this.d.f74b;
    }

    public float getStrokeWidth() {
        return this.f3331e;
    }

    public float getTrimPathEnd() {
        return this.f3335j;
    }

    public float getTrimPathOffset() {
        return this.f3336k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.f3334h = f2;
    }

    public void setFillColor(int i) {
        this.f3332f.f74b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f3333g = f2;
    }

    public void setStrokeColor(int i) {
        this.d.f74b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f3331e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f3335j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f3336k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
