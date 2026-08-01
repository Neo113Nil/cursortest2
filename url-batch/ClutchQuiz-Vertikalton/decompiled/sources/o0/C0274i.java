package o0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* renamed from: o0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274i extends AbstractC0277l {
    public B.d d;

    /* renamed from: e, reason: collision with root package name */
    public float f3257e;

    /* renamed from: f, reason: collision with root package name */
    public B.d f3258f;

    /* renamed from: g, reason: collision with root package name */
    public float f3259g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3260j;

    /* renamed from: k, reason: collision with root package name */
    public float f3261k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f3262l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f3263m;

    /* renamed from: n, reason: collision with root package name */
    public float f3264n;

    @Override // o0.AbstractC0276k
    public final boolean a() {
        return this.f3258f.d() || this.d.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // o0.AbstractC0276k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z2;
        B.d dVar;
        B.d dVar2 = this.f3258f;
        boolean z3 = false;
        if (dVar2.d()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.f45c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f43a) {
                dVar2.f43a = colorForState;
                z2 = true;
                dVar = this.d;
                if (dVar.d()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.f45c;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f43a) {
                        dVar.f43a = colorForState2;
                        z3 = true;
                    }
                }
                return z2 | z3;
            }
        }
        z2 = false;
        dVar = this.d;
        if (dVar.d()) {
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f3258f.f43a;
    }

    public float getStrokeAlpha() {
        return this.f3259g;
    }

    public int getStrokeColor() {
        return this.d.f43a;
    }

    public float getStrokeWidth() {
        return this.f3257e;
    }

    public float getTrimPathEnd() {
        return this.f3260j;
    }

    public float getTrimPathOffset() {
        return this.f3261k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i) {
        this.f3258f.f43a = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f3259g = f2;
    }

    public void setStrokeColor(int i) {
        this.d.f43a = i;
    }

    public void setStrokeWidth(float f2) {
        this.f3257e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f3260j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f3261k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
