package k0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* renamed from: k0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222i extends AbstractC0225l {

    /* renamed from: d, reason: collision with root package name */
    public B.d f3149d;

    /* renamed from: e, reason: collision with root package name */
    public float f3150e;

    /* renamed from: f, reason: collision with root package name */
    public B.d f3151f;

    /* renamed from: g, reason: collision with root package name */
    public float f3152g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3153j;

    /* renamed from: k, reason: collision with root package name */
    public float f3154k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f3155l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f3156m;

    /* renamed from: n, reason: collision with root package name */
    public float f3157n;

    @Override // k0.AbstractC0224k
    public final boolean a() {
        return this.f3151f.c() || this.f3149d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // k0.AbstractC0224k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z2;
        B.d dVar;
        B.d dVar2 = this.f3151f;
        boolean z3 = false;
        if (dVar2.c()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.f23d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f21b) {
                dVar2.f21b = colorForState;
                z2 = true;
                dVar = this.f3149d;
                if (dVar.c()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.f23d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f21b) {
                        dVar.f21b = colorForState2;
                        z3 = true;
                    }
                }
                return z2 | z3;
            }
        }
        z2 = false;
        dVar = this.f3149d;
        if (dVar.c()) {
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f3151f.f21b;
    }

    public float getStrokeAlpha() {
        return this.f3152g;
    }

    public int getStrokeColor() {
        return this.f3149d.f21b;
    }

    public float getStrokeWidth() {
        return this.f3150e;
    }

    public float getTrimPathEnd() {
        return this.f3153j;
    }

    public float getTrimPathOffset() {
        return this.f3154k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i) {
        this.f3151f.f21b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f3152g = f2;
    }

    public void setStrokeColor(int i) {
        this.f3149d.f21b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f3150e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f3153j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f3154k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
