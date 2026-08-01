package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class cl0 extends fl0 {
    public nz d;
    public float e;
    public nz f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // defpackage.el0
    public final boolean a() {
        return this.f.g() || this.d.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.el0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z;
        nz nzVar;
        nz nzVar2 = this.f;
        boolean z2 = true;
        if (nzVar2.g()) {
            ColorStateList colorStateList = (ColorStateList) nzVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != nzVar2.b) {
                nzVar2.b = colorForState;
                z = true;
                nzVar = this.d;
                if (nzVar.g()) {
                    ColorStateList colorStateList2 = (ColorStateList) nzVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != nzVar.b) {
                        nzVar.b = colorForState2;
                        return z | z2;
                    }
                }
                z2 = false;
                return z | z2;
            }
        }
        z = false;
        nzVar = this.d;
        if (nzVar.g()) {
        }
        z2 = false;
        return z | z2;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int i) {
        this.f.b = i;
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int i) {
        this.d.b = i;
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}
