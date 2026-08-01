package g1;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public b0.d f1775d;

    /* renamed from: e, reason: collision with root package name */
    public float f1776e;

    /* renamed from: f, reason: collision with root package name */
    public b0.d f1777f;
    public float g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f1778i;

    /* renamed from: j, reason: collision with root package name */
    public float f1779j;

    /* renamed from: k, reason: collision with root package name */
    public float f1780k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f1781l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f1782m;

    /* renamed from: n, reason: collision with root package name */
    public float f1783n;

    @Override // g1.k
    public final boolean a() {
        return this.f1777f.c() || this.f1775d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // g1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z3;
        b0.d dVar;
        b0.d dVar2 = this.f1777f;
        boolean z4 = true;
        if (dVar2.c()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.f700d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f699b) {
                dVar2.f699b = colorForState;
                z3 = true;
                dVar = this.f1775d;
                if (dVar.c()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.f700d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f699b) {
                        dVar.f699b = colorForState2;
                        return z3 | z4;
                    }
                }
                z4 = false;
                return z3 | z4;
            }
        }
        z3 = false;
        dVar = this.f1775d;
        if (dVar.c()) {
        }
        z4 = false;
        return z3 | z4;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f1777f.f699b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.f1775d.f699b;
    }

    public float getStrokeWidth() {
        return this.f1776e;
    }

    public float getTrimPathEnd() {
        return this.f1779j;
    }

    public float getTrimPathOffset() {
        return this.f1780k;
    }

    public float getTrimPathStart() {
        return this.f1778i;
    }

    public void setFillAlpha(float f4) {
        this.h = f4;
    }

    public void setFillColor(int i4) {
        this.f1777f.f699b = i4;
    }

    public void setStrokeAlpha(float f4) {
        this.g = f4;
    }

    public void setStrokeColor(int i4) {
        this.f1775d.f699b = i4;
    }

    public void setStrokeWidth(float f4) {
        this.f1776e = f4;
    }

    public void setTrimPathEnd(float f4) {
        this.f1779j = f4;
    }

    public void setTrimPathOffset(float f4) {
        this.f1780k = f4;
    }

    public void setTrimPathStart(float f4) {
        this.f1778i = f4;
    }
}
