package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class fb0 extends ib0 {
    public w4 d;
    public float e;
    public w4 f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // defpackage.hb0
    public final boolean a() {
        return this.f.c() || this.d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.hb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z;
        w4 w4Var;
        w4 w4Var2 = this.f;
        boolean z2 = true;
        if (w4Var2.c()) {
            ColorStateList colorStateList = (ColorStateList) w4Var2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != w4Var2.b) {
                w4Var2.b = colorForState;
                z = true;
                w4Var = this.d;
                if (w4Var.c()) {
                    ColorStateList colorStateList2 = (ColorStateList) w4Var.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != w4Var.b) {
                        w4Var.b = colorForState2;
                        return z | z2;
                    }
                }
                z2 = false;
                return z | z2;
            }
        }
        z = false;
        w4Var = this.d;
        if (w4Var.c()) {
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
