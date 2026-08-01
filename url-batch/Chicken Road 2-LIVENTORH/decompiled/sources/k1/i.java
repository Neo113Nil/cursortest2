package k1;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i extends l {
    public e0.d d;

    /* renamed from: e, reason: collision with root package name */
    public float f2176e;

    /* renamed from: f, reason: collision with root package name */
    public e0.d f2177f;

    /* renamed from: g, reason: collision with root package name */
    public float f2178g;

    /* renamed from: h, reason: collision with root package name */
    public float f2179h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f2180j;

    /* renamed from: k, reason: collision with root package name */
    public float f2181k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f2182l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f2183m;

    /* renamed from: n, reason: collision with root package name */
    public float f2184n;

    @Override // k1.k
    public final boolean a() {
        return this.f2177f.c() || this.d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // k1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z3;
        e0.d dVar;
        e0.d dVar2 = this.f2177f;
        boolean z4 = true;
        if (dVar2.c()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.f1140c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f1138a) {
                dVar2.f1138a = colorForState;
                z3 = true;
                dVar = this.d;
                if (dVar.c()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.f1140c;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f1138a) {
                        dVar.f1138a = colorForState2;
                        return z3 | z4;
                    }
                }
                z4 = false;
                return z3 | z4;
            }
        }
        z3 = false;
        dVar = this.d;
        if (dVar.c()) {
        }
        z4 = false;
        return z3 | z4;
    }

    public float getFillAlpha() {
        return this.f2179h;
    }

    public int getFillColor() {
        return this.f2177f.f1138a;
    }

    public float getStrokeAlpha() {
        return this.f2178g;
    }

    public int getStrokeColor() {
        return this.d.f1138a;
    }

    public float getStrokeWidth() {
        return this.f2176e;
    }

    public float getTrimPathEnd() {
        return this.f2180j;
    }

    public float getTrimPathOffset() {
        return this.f2181k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.f2179h = f2;
    }

    public void setFillColor(int i) {
        this.f2177f.f1138a = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f2178g = f2;
    }

    public void setStrokeColor(int i) {
        this.d.f1138a = i;
    }

    public void setStrokeWidth(float f2) {
        this.f2176e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f2180j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f2181k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
