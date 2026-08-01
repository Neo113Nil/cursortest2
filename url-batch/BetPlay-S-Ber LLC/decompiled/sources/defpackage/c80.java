package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class c80 extends d80 {
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
    public c80(c80 c80Var, e7 e7Var) {
        a80 a80Var;
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
        this.c = c80Var.c;
        this.d = c80Var.d;
        this.e = c80Var.e;
        this.f = c80Var.f;
        this.g = c80Var.g;
        this.h = c80Var.h;
        this.i = c80Var.i;
        String str = c80Var.k;
        this.k = str;
        if (str != null) {
            e7Var.put(str, this);
        }
        matrix.set(c80Var.j);
        ArrayList arrayList = c80Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof c80) {
                this.b.add(new c80((c80) obj, e7Var));
            } else {
                if (obj instanceof b80) {
                    b80 b80Var = (b80) obj;
                    b80 b80Var2 = new b80(b80Var);
                    b80Var2.e = 0.0f;
                    b80Var2.g = 1.0f;
                    b80Var2.h = 1.0f;
                    b80Var2.i = 0.0f;
                    b80Var2.j = 1.0f;
                    b80Var2.k = 0.0f;
                    b80Var2.l = Paint.Cap.BUTT;
                    b80Var2.m = Paint.Join.MITER;
                    b80Var2.n = 4.0f;
                    b80Var2.d = b80Var.d;
                    b80Var2.e = b80Var.e;
                    b80Var2.g = b80Var.g;
                    b80Var2.f = b80Var.f;
                    b80Var2.c = b80Var.c;
                    b80Var2.h = b80Var.h;
                    b80Var2.i = b80Var.i;
                    b80Var2.j = b80Var.j;
                    b80Var2.k = b80Var.k;
                    b80Var2.l = b80Var.l;
                    b80Var2.m = b80Var.m;
                    b80Var2.n = b80Var.n;
                    a80Var = b80Var2;
                } else {
                    if (!(obj instanceof a80)) {
                        o8.t("Unknown object in the tree!");
                        throw null;
                    }
                    a80Var = new a80((a80) obj);
                }
                this.b.add(a80Var);
                Object obj2 = a80Var.b;
                if (obj2 != null) {
                    e7Var.put(obj2, a80Var);
                }
            }
        }
    }

    @Override // defpackage.d80
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((d80) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.d80
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((d80) arrayList.get(i)).b(iArr);
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

    public c80() {
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
