package S;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import h0.C0202j;

/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: d, reason: collision with root package name */
    public C0202j f1009d;

    /* renamed from: e, reason: collision with root package name */
    public float f1010e;

    /* renamed from: f, reason: collision with root package name */
    public C0202j f1011f;

    /* renamed from: g, reason: collision with root package name */
    public float f1012g;

    /* renamed from: h, reason: collision with root package name */
    public float f1013h;

    /* renamed from: i, reason: collision with root package name */
    public float f1014i;

    /* renamed from: j, reason: collision with root package name */
    public float f1015j;

    /* renamed from: k, reason: collision with root package name */
    public float f1016k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f1017l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f1018m;

    /* renamed from: n, reason: collision with root package name */
    public float f1019n;

    @Override // S.l
    public final boolean a() {
        return this.f1011f.d() || this.f1009d.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // S.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z2;
        C0202j c0202j;
        C0202j c0202j2 = this.f1011f;
        boolean z3 = false;
        if (c0202j2.d()) {
            ColorStateList colorStateList = (ColorStateList) c0202j2.f2320c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0202j2.f2318a) {
                c0202j2.f2318a = colorForState;
                z2 = true;
                c0202j = this.f1009d;
                if (c0202j.d()) {
                    ColorStateList colorStateList2 = (ColorStateList) c0202j.f2320c;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != c0202j.f2318a) {
                        c0202j.f2318a = colorForState2;
                        z3 = true;
                    }
                }
                return z2 | z3;
            }
        }
        z2 = false;
        c0202j = this.f1009d;
        if (c0202j.d()) {
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.f1013h;
    }

    public int getFillColor() {
        return this.f1011f.f2318a;
    }

    public float getStrokeAlpha() {
        return this.f1012g;
    }

    public int getStrokeColor() {
        return this.f1009d.f2318a;
    }

    public float getStrokeWidth() {
        return this.f1010e;
    }

    public float getTrimPathEnd() {
        return this.f1015j;
    }

    public float getTrimPathOffset() {
        return this.f1016k;
    }

    public float getTrimPathStart() {
        return this.f1014i;
    }

    public void setFillAlpha(float f2) {
        this.f1013h = f2;
    }

    public void setFillColor(int i2) {
        this.f1011f.f2318a = i2;
    }

    public void setStrokeAlpha(float f2) {
        this.f1012g = f2;
    }

    public void setStrokeColor(int i2) {
        this.f1009d.f2318a = i2;
    }

    public void setStrokeWidth(float f2) {
        this.f1010e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f1015j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f1016k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.f1014i = f2;
    }
}
