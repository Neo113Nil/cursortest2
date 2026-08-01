package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: l0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264j extends AbstractC0265k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3211b;

    /* renamed from: c, reason: collision with root package name */
    public float f3212c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3213e;

    /* renamed from: f, reason: collision with root package name */
    public float f3214f;

    /* renamed from: g, reason: collision with root package name */
    public float f3215g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3216j;

    /* renamed from: k, reason: collision with root package name */
    public String f3217k;

    public C0264j() {
        this.f3210a = new Matrix();
        this.f3211b = new ArrayList();
        this.f3212c = 0.0f;
        this.d = 0.0f;
        this.f3213e = 0.0f;
        this.f3214f = 1.0f;
        this.f3215g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3216j = new Matrix();
        this.f3217k = null;
    }

    @Override // l0.AbstractC0265k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3211b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0265k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // l0.AbstractC0265k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3211b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0265k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3216j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3213e);
        matrix.postScale(this.f3214f, this.f3215g);
        matrix.postRotate(this.f3212c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3213e);
    }

    public String getGroupName() {
        return this.f3217k;
    }

    public Matrix getLocalMatrix() {
        return this.f3216j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3213e;
    }

    public float getRotation() {
        return this.f3212c;
    }

    public float getScaleX() {
        return this.f3214f;
    }

    public float getScaleY() {
        return this.f3215g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f3213e) {
            this.f3213e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3212c) {
            this.f3212c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3214f) {
            this.f3214f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3215g) {
            this.f3215g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0264j(C0264j c0264j, o.b bVar) {
        C0262h c0262h;
        this.f3210a = new Matrix();
        this.f3211b = new ArrayList();
        this.f3212c = 0.0f;
        this.d = 0.0f;
        this.f3213e = 0.0f;
        this.f3214f = 1.0f;
        this.f3215g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3216j = matrix;
        this.f3217k = null;
        this.f3212c = c0264j.f3212c;
        this.d = c0264j.d;
        this.f3213e = c0264j.f3213e;
        this.f3214f = c0264j.f3214f;
        this.f3215g = c0264j.f3215g;
        this.h = c0264j.h;
        this.i = c0264j.i;
        String str = c0264j.f3217k;
        this.f3217k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0264j.f3216j);
        ArrayList arrayList = c0264j.f3211b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0264j) {
                this.f3211b.add(new C0264j((C0264j) obj, bVar));
            } else {
                if (obj instanceof C0263i) {
                    C0263i c0263i = (C0263i) obj;
                    C0263i c0263i2 = new C0263i(c0263i);
                    c0263i2.f3202e = 0.0f;
                    c0263i2.f3204g = 1.0f;
                    c0263i2.h = 1.0f;
                    c0263i2.i = 0.0f;
                    c0263i2.f3205j = 1.0f;
                    c0263i2.f3206k = 0.0f;
                    c0263i2.f3207l = Paint.Cap.BUTT;
                    c0263i2.f3208m = Paint.Join.MITER;
                    c0263i2.f3209n = 4.0f;
                    c0263i2.d = c0263i.d;
                    c0263i2.f3202e = c0263i.f3202e;
                    c0263i2.f3204g = c0263i.f3204g;
                    c0263i2.f3203f = c0263i.f3203f;
                    c0263i2.f3220c = c0263i.f3220c;
                    c0263i2.h = c0263i.h;
                    c0263i2.i = c0263i.i;
                    c0263i2.f3205j = c0263i.f3205j;
                    c0263i2.f3206k = c0263i.f3206k;
                    c0263i2.f3207l = c0263i.f3207l;
                    c0263i2.f3208m = c0263i.f3208m;
                    c0263i2.f3209n = c0263i.f3209n;
                    c0262h = c0263i2;
                } else if (obj instanceof C0262h) {
                    c0262h = new C0262h((C0262h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3211b.add(c0262h);
                Object obj2 = c0262h.f3219b;
                if (obj2 != null) {
                    bVar.put(obj2, c0262h);
                }
            }
        }
    }
}
