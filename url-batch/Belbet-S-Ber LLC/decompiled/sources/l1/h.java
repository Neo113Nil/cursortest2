package l1;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h extends k {
    public e0.d d;

    /* renamed from: e, reason: collision with root package name */
    public float f2650e;

    /* renamed from: f, reason: collision with root package name */
    public e0.d f2651f;

    /* renamed from: g, reason: collision with root package name */
    public float f2652g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f2653j;

    /* renamed from: k, reason: collision with root package name */
    public float f2654k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f2655l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f2656m;

    /* renamed from: n, reason: collision with root package name */
    public float f2657n;

    @Override // l1.j
    public final boolean a() {
        return this.f2651f.c() || this.d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // l1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z4;
        e0.d dVar;
        e0.d dVar2 = this.f2651f;
        boolean z5 = true;
        if (dVar2.c()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f1321b) {
                dVar2.f1321b = colorForState;
                z4 = true;
                dVar = this.d;
                if (dVar.c()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f1321b) {
                        dVar.f1321b = colorForState2;
                        return z4 | z5;
                    }
                }
                z5 = false;
                return z4 | z5;
            }
        }
        z4 = false;
        dVar = this.d;
        if (dVar.c()) {
        }
        z5 = false;
        return z4 | z5;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f2651f.f1321b;
    }

    public float getStrokeAlpha() {
        return this.f2652g;
    }

    public int getStrokeColor() {
        return this.d.f1321b;
    }

    public float getStrokeWidth() {
        return this.f2650e;
    }

    public float getTrimPathEnd() {
        return this.f2653j;
    }

    public float getTrimPathOffset() {
        return this.f2654k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f5) {
        this.h = f5;
    }

    public void setFillColor(int i) {
        this.f2651f.f1321b = i;
    }

    public void setStrokeAlpha(float f5) {
        this.f2652g = f5;
    }

    public void setStrokeColor(int i) {
        this.d.f1321b = i;
    }

    public void setStrokeWidth(float f5) {
        this.f2650e = f5;
    }

    public void setTrimPathEnd(float f5) {
        this.f2653j = f5;
    }

    public void setTrimPathOffset(float f5) {
        this.f2654k = f5;
    }

    public void setTrimPathStart(float f5) {
        this.i = f5;
    }
}
