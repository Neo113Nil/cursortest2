package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dl0 extends el0 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARN: Multi-variable type inference failed */
    public dl0(dl0 dl0Var, g7 g7Var) {
        bl0 bl0Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = dl0Var.c;
        this.d = dl0Var.d;
        this.e = dl0Var.e;
        this.f = dl0Var.f;
        this.g = dl0Var.g;
        this.h = dl0Var.h;
        this.i = dl0Var.i;
        String str = dl0Var.k;
        this.k = str;
        if (str != null) {
            g7Var.put(str, this);
        }
        matrix.set(dl0Var.j);
        ArrayList arrayList = dl0Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof dl0) {
                this.b.add(new dl0((dl0) obj, g7Var));
            } else {
                if (obj instanceof cl0) {
                    cl0 cl0Var = (cl0) obj;
                    cl0 cl0Var2 = new cl0(cl0Var);
                    cl0Var2.e = 0.0f;
                    cl0Var2.g = 1.0f;
                    cl0Var2.h = 1.0f;
                    cl0Var2.i = 0.0f;
                    cl0Var2.j = 1.0f;
                    cl0Var2.k = 0.0f;
                    cl0Var2.l = Paint.Cap.BUTT;
                    cl0Var2.m = Paint.Join.MITER;
                    cl0Var2.n = 4.0f;
                    cl0Var2.d = cl0Var.d;
                    cl0Var2.e = cl0Var.e;
                    cl0Var2.g = cl0Var.g;
                    cl0Var2.f = cl0Var.f;
                    cl0Var2.c = cl0Var.c;
                    cl0Var2.h = cl0Var.h;
                    cl0Var2.i = cl0Var.i;
                    cl0Var2.j = cl0Var.j;
                    cl0Var2.k = cl0Var.k;
                    cl0Var2.l = cl0Var.l;
                    cl0Var2.m = cl0Var.m;
                    cl0Var2.n = cl0Var.n;
                    bl0Var = cl0Var2;
                } else {
                    if (!(obj instanceof bl0)) {
                        s9.u("Unknown object in the tree!");
                        throw null;
                    }
                    bl0Var = new bl0((bl0) obj);
                }
                this.b.add(bl0Var);
                Object obj2 = bl0Var.b;
                if (obj2 != null) {
                    g7Var.put(obj2, bl0Var);
                }
            }
        }
    }

    @Override // defpackage.el0
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((el0) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.el0
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((el0) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public dl0() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
