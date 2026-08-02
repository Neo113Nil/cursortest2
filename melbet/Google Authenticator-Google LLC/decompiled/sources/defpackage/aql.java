package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aql extends ym {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public aql(aql aqlVar, qi qiVar) {
        aqm aqjVar;
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
        this.m = null;
        this.c = aqlVar.c;
        this.d = aqlVar.d;
        this.e = aqlVar.e;
        this.f = aqlVar.f;
        this.g = aqlVar.g;
        this.h = aqlVar.h;
        this.i = aqlVar.i;
        int[] iArr = aqlVar.l;
        this.l = null;
        String str = aqlVar.m;
        this.m = str;
        int i = aqlVar.k;
        this.k = 0;
        if (str != null) {
            qiVar.put(str, this);
        }
        matrix.set(aqlVar.j);
        ArrayList arrayList = aqlVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof aql) {
                this.b.add(new aql((aql) obj, qiVar));
            } else {
                if (obj instanceof aqk) {
                    aqjVar = new aqk((aqk) obj);
                } else {
                    if (!(obj instanceof aqj)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    aqjVar = new aqj((aqj) obj);
                }
                this.b.add(aqjVar);
                Object obj2 = aqjVar.n;
                if (obj2 != null) {
                    qiVar.put(obj2, aqjVar);
                }
            }
        }
    }

    public String getGroupName() {
        return this.m;
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

    @Override // defpackage.ym
    public final boolean p() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((ym) arrayList.get(i)).p()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.ym
    public final boolean q(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((ym) arrayList.get(i)).q(iArr);
            i++;
        }
    }

    public final void s() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            s();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            s();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            s();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            s();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            s();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            s();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            s();
        }
    }

    public aql() {
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
        this.m = null;
    }
}
