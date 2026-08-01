package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class v70 extends w70 {
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
    public v70(v70 v70Var, n6 n6Var) {
        t70 t70Var;
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
        this.c = v70Var.c;
        this.d = v70Var.d;
        this.e = v70Var.e;
        this.f = v70Var.f;
        this.g = v70Var.g;
        this.h = v70Var.h;
        this.i = v70Var.i;
        String str = v70Var.k;
        this.k = str;
        if (str != null) {
            n6Var.put(str, this);
        }
        matrix.set(v70Var.j);
        ArrayList arrayList = v70Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof v70) {
                this.b.add(new v70((v70) obj, n6Var));
            } else {
                if (obj instanceof u70) {
                    u70 u70Var = (u70) obj;
                    u70 u70Var2 = new u70(u70Var);
                    u70Var2.e = 0.0f;
                    u70Var2.g = 1.0f;
                    u70Var2.h = 1.0f;
                    u70Var2.i = 0.0f;
                    u70Var2.j = 1.0f;
                    u70Var2.k = 0.0f;
                    u70Var2.l = Paint.Cap.BUTT;
                    u70Var2.m = Paint.Join.MITER;
                    u70Var2.n = 4.0f;
                    u70Var2.d = u70Var.d;
                    u70Var2.e = u70Var.e;
                    u70Var2.g = u70Var.g;
                    u70Var2.f = u70Var.f;
                    u70Var2.c = u70Var.c;
                    u70Var2.h = u70Var.h;
                    u70Var2.i = u70Var.i;
                    u70Var2.j = u70Var.j;
                    u70Var2.k = u70Var.k;
                    u70Var2.l = u70Var.l;
                    u70Var2.m = u70Var.m;
                    u70Var2.n = u70Var.n;
                    t70Var = u70Var2;
                } else {
                    if (!(obj instanceof t70)) {
                        t8.t("Unknown object in the tree!");
                        throw null;
                    }
                    t70Var = new t70((t70) obj);
                }
                this.b.add(t70Var);
                Object obj2 = t70Var.b;
                if (obj2 != null) {
                    n6Var.put(obj2, t70Var);
                }
            }
        }
    }

    @Override // defpackage.w70
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((w70) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.w70
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((w70) arrayList.get(i)).b(iArr);
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

    public v70() {
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
