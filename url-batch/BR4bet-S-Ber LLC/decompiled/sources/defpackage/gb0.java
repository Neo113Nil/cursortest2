package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class gb0 extends hb0 {
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
    public gb0(gb0 gb0Var, x6 x6Var) {
        eb0 eb0Var;
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
        this.c = gb0Var.c;
        this.d = gb0Var.d;
        this.e = gb0Var.e;
        this.f = gb0Var.f;
        this.g = gb0Var.g;
        this.h = gb0Var.h;
        this.i = gb0Var.i;
        String str = gb0Var.k;
        this.k = str;
        if (str != null) {
            x6Var.put(str, this);
        }
        matrix.set(gb0Var.j);
        ArrayList arrayList = gb0Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof gb0) {
                this.b.add(new gb0((gb0) obj, x6Var));
            } else {
                if (obj instanceof fb0) {
                    fb0 fb0Var = (fb0) obj;
                    fb0 fb0Var2 = new fb0(fb0Var);
                    fb0Var2.e = 0.0f;
                    fb0Var2.g = 1.0f;
                    fb0Var2.h = 1.0f;
                    fb0Var2.i = 0.0f;
                    fb0Var2.j = 1.0f;
                    fb0Var2.k = 0.0f;
                    fb0Var2.l = Paint.Cap.BUTT;
                    fb0Var2.m = Paint.Join.MITER;
                    fb0Var2.n = 4.0f;
                    fb0Var2.d = fb0Var.d;
                    fb0Var2.e = fb0Var.e;
                    fb0Var2.g = fb0Var.g;
                    fb0Var2.f = fb0Var.f;
                    fb0Var2.c = fb0Var.c;
                    fb0Var2.h = fb0Var.h;
                    fb0Var2.i = fb0Var.i;
                    fb0Var2.j = fb0Var.j;
                    fb0Var2.k = fb0Var.k;
                    fb0Var2.l = fb0Var.l;
                    fb0Var2.m = fb0Var.m;
                    fb0Var2.n = fb0Var.n;
                    eb0Var = fb0Var2;
                } else {
                    if (!(obj instanceof eb0)) {
                        g9.s("Unknown object in the tree!");
                        throw null;
                    }
                    eb0Var = new eb0((eb0) obj);
                }
                this.b.add(eb0Var);
                Object obj2 = eb0Var.b;
                if (obj2 != null) {
                    x6Var.put(obj2, eb0Var);
                }
            }
        }
    }

    @Override // defpackage.hb0
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((hb0) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.hb0
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((hb0) arrayList.get(i)).b(iArr);
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

    public gb0() {
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
