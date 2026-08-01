package m0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* renamed from: m0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269i extends AbstractC0272l {
    public B.d d;

    /* renamed from: e, reason: collision with root package name */
    public float f3140e;

    /* renamed from: f, reason: collision with root package name */
    public B.d f3141f;

    /* renamed from: g, reason: collision with root package name */
    public float f3142g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3143j;

    /* renamed from: k, reason: collision with root package name */
    public float f3144k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f3145l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f3146m;

    /* renamed from: n, reason: collision with root package name */
    public float f3147n;

    @Override // m0.AbstractC0271k
    public final boolean a() {
        return this.f3141f.c() || this.d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // m0.AbstractC0271k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z2;
        B.d dVar;
        B.d dVar2 = this.f3141f;
        boolean z3 = false;
        if (dVar2.c()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f19b) {
                dVar2.f19b = colorForState;
                z2 = true;
                dVar = this.d;
                if (dVar.c()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f19b) {
                        dVar.f19b = colorForState2;
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
        return this.f3141f.f19b;
    }

    public float getStrokeAlpha() {
        return this.f3142g;
    }

    public int getStrokeColor() {
        return this.d.f19b;
    }

    public float getStrokeWidth() {
        return this.f3140e;
    }

    public float getTrimPathEnd() {
        return this.f3143j;
    }

    public float getTrimPathOffset() {
        return this.f3144k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i) {
        this.f3141f.f19b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f3142g = f2;
    }

    public void setStrokeColor(int i) {
        this.d.f19b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f3140e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f3143j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f3144k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
