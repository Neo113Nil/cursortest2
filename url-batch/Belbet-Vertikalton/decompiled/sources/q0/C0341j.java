package q0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: q0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341j extends AbstractC0342k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3955a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3956b;

    /* renamed from: c, reason: collision with root package name */
    public float f3957c;

    /* renamed from: d, reason: collision with root package name */
    public float f3958d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f3959f;

    /* renamed from: g, reason: collision with root package name */
    public float f3960g;

    /* renamed from: h, reason: collision with root package name */
    public float f3961h;
    public float i;
    public final Matrix j;

    /* renamed from: k, reason: collision with root package name */
    public String f3962k;

    public C0341j() {
        this.f3955a = new Matrix();
        this.f3956b = new ArrayList();
        this.f3957c = 0.0f;
        this.f3958d = 0.0f;
        this.e = 0.0f;
        this.f3959f = 1.0f;
        this.f3960g = 1.0f;
        this.f3961h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.f3962k = null;
    }

    @Override // q0.AbstractC0342k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3956b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0342k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // q0.AbstractC0342k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3956b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0342k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f3958d, -this.e);
        matrix.postScale(this.f3959f, this.f3960g);
        matrix.postRotate(this.f3957c, 0.0f, 0.0f);
        matrix.postTranslate(this.f3961h + this.f3958d, this.i + this.e);
    }

    public String getGroupName() {
        return this.f3962k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f3958d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f3957c;
    }

    public float getScaleX() {
        return this.f3959f;
    }

    public float getScaleY() {
        return this.f3960g;
    }

    public float getTranslateX() {
        return this.f3961h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f3958d) {
            this.f3958d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3957c) {
            this.f3957c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3959f) {
            this.f3959f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3960g) {
            this.f3960g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f3961h) {
            this.f3961h = f2;
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
    public C0341j(C0341j c0341j, q.b bVar) {
        C0339h c0339h;
        this.f3955a = new Matrix();
        this.f3956b = new ArrayList();
        this.f3957c = 0.0f;
        this.f3958d = 0.0f;
        this.e = 0.0f;
        this.f3959f = 1.0f;
        this.f3960g = 1.0f;
        this.f3961h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f3962k = null;
        this.f3957c = c0341j.f3957c;
        this.f3958d = c0341j.f3958d;
        this.e = c0341j.e;
        this.f3959f = c0341j.f3959f;
        this.f3960g = c0341j.f3960g;
        this.f3961h = c0341j.f3961h;
        this.i = c0341j.i;
        String str = c0341j.f3962k;
        this.f3962k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0341j.j);
        ArrayList arrayList = c0341j.f3956b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0341j) {
                this.f3956b.add(new C0341j((C0341j) obj, bVar));
            } else {
                if (obj instanceof C0340i) {
                    C0340i c0340i = (C0340i) obj;
                    C0340i c0340i2 = new C0340i(c0340i);
                    c0340i2.e = 0.0f;
                    c0340i2.f3949g = 1.0f;
                    c0340i2.f3950h = 1.0f;
                    c0340i2.i = 0.0f;
                    c0340i2.j = 1.0f;
                    c0340i2.f3951k = 0.0f;
                    c0340i2.f3952l = Paint.Cap.BUTT;
                    c0340i2.f3953m = Paint.Join.MITER;
                    c0340i2.f3954n = 4.0f;
                    c0340i2.f3947d = c0340i.f3947d;
                    c0340i2.e = c0340i.e;
                    c0340i2.f3949g = c0340i.f3949g;
                    c0340i2.f3948f = c0340i.f3948f;
                    c0340i2.f3965c = c0340i.f3965c;
                    c0340i2.f3950h = c0340i.f3950h;
                    c0340i2.i = c0340i.i;
                    c0340i2.j = c0340i.j;
                    c0340i2.f3951k = c0340i.f3951k;
                    c0340i2.f3952l = c0340i.f3952l;
                    c0340i2.f3953m = c0340i.f3953m;
                    c0340i2.f3954n = c0340i.f3954n;
                    c0339h = c0340i2;
                } else if (obj instanceof C0339h) {
                    c0339h = new C0339h((C0339h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3956b.add(c0339h);
                Object obj2 = c0339h.f3964b;
                if (obj2 != null) {
                    bVar.put(obj2, c0339h);
                }
            }
        }
    }
}
