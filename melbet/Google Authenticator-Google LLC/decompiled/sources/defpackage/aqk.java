package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqk extends aqm {
    public int[] a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    Paint.Cap h;
    Paint.Join i;
    float j;
    ifn k;
    ifn l;

    public aqk(aqk aqkVar) {
        super(aqkVar);
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
        int[] iArr = aqkVar.a;
        this.a = null;
        this.k = aqkVar.k;
        this.b = aqkVar.b;
        this.c = aqkVar.c;
        this.l = aqkVar.l;
        this.o = aqkVar.o;
        this.d = aqkVar.d;
        this.e = aqkVar.e;
        this.f = aqkVar.f;
        this.g = aqkVar.g;
        this.h = aqkVar.h;
        this.i = aqkVar.i;
        this.j = aqkVar.j;
    }

    float getFillAlpha() {
        return this.d;
    }

    int getFillColor() {
        return this.l.b;
    }

    float getStrokeAlpha() {
        return this.c;
    }

    int getStrokeColor() {
        return this.k.b;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.f;
    }

    float getTrimPathOffset() {
        return this.g;
    }

    float getTrimPathStart() {
        return this.e;
    }

    @Override // defpackage.ym
    public final boolean p() {
        return this.l.e() || this.k.e();
    }

    @Override // defpackage.ym
    public final boolean q(int[] iArr) {
        return this.k.f(iArr) | this.l.f(iArr);
    }

    void setFillAlpha(float f) {
        this.d = f;
    }

    void setFillColor(int i) {
        this.l.b = i;
    }

    void setStrokeAlpha(float f) {
        this.c = f;
    }

    void setStrokeColor(int i) {
        this.k.b = i;
    }

    void setStrokeWidth(float f) {
        this.b = f;
    }

    void setTrimPathEnd(float f) {
        this.f = f;
    }

    void setTrimPathOffset(float f) {
        this.g = f;
    }

    void setTrimPathStart(float f) {
        this.e = f;
    }

    public aqk() {
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
    }
}
