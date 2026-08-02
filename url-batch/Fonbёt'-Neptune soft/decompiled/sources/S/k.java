package S;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import n.C0268a;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f1020a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1021b;

    /* renamed from: c, reason: collision with root package name */
    public float f1022c;

    /* renamed from: d, reason: collision with root package name */
    public float f1023d;

    /* renamed from: e, reason: collision with root package name */
    public float f1024e;

    /* renamed from: f, reason: collision with root package name */
    public float f1025f;

    /* renamed from: g, reason: collision with root package name */
    public float f1026g;

    /* renamed from: h, reason: collision with root package name */
    public float f1027h;

    /* renamed from: i, reason: collision with root package name */
    public float f1028i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f1029j;

    /* renamed from: k, reason: collision with root package name */
    public String f1030k;

    public k() {
        this.f1020a = new Matrix();
        this.f1021b = new ArrayList();
        this.f1022c = 0.0f;
        this.f1023d = 0.0f;
        this.f1024e = 0.0f;
        this.f1025f = 1.0f;
        this.f1026g = 1.0f;
        this.f1027h = 0.0f;
        this.f1028i = 0.0f;
        this.f1029j = new Matrix();
        this.f1030k = null;
    }

    @Override // S.l
    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1021b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    @Override // S.l
    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f1021b;
            if (i2 >= arrayList.size()) {
                return z2;
            }
            z2 |= ((l) arrayList.get(i2)).b(iArr);
            i2++;
        }
    }

    public final void c() {
        Matrix matrix = this.f1029j;
        matrix.reset();
        matrix.postTranslate(-this.f1023d, -this.f1024e);
        matrix.postScale(this.f1025f, this.f1026g);
        matrix.postRotate(this.f1022c, 0.0f, 0.0f);
        matrix.postTranslate(this.f1027h + this.f1023d, this.f1028i + this.f1024e);
    }

    public String getGroupName() {
        return this.f1030k;
    }

    public Matrix getLocalMatrix() {
        return this.f1029j;
    }

    public float getPivotX() {
        return this.f1023d;
    }

    public float getPivotY() {
        return this.f1024e;
    }

    public float getRotation() {
        return this.f1022c;
    }

    public float getScaleX() {
        return this.f1025f;
    }

    public float getScaleY() {
        return this.f1026g;
    }

    public float getTranslateX() {
        return this.f1027h;
    }

    public float getTranslateY() {
        return this.f1028i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f1023d) {
            this.f1023d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f1024e) {
            this.f1024e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f1022c) {
            this.f1022c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f1025f) {
            this.f1025f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f1026g) {
            this.f1026g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f1027h) {
            this.f1027h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.f1028i) {
            this.f1028i = f2;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(k kVar, C0268a c0268a) {
        i iVar;
        this.f1020a = new Matrix();
        this.f1021b = new ArrayList();
        this.f1022c = 0.0f;
        this.f1023d = 0.0f;
        this.f1024e = 0.0f;
        this.f1025f = 1.0f;
        this.f1026g = 1.0f;
        this.f1027h = 0.0f;
        this.f1028i = 0.0f;
        Matrix matrix = new Matrix();
        this.f1029j = matrix;
        this.f1030k = null;
        this.f1022c = kVar.f1022c;
        this.f1023d = kVar.f1023d;
        this.f1024e = kVar.f1024e;
        this.f1025f = kVar.f1025f;
        this.f1026g = kVar.f1026g;
        this.f1027h = kVar.f1027h;
        this.f1028i = kVar.f1028i;
        String str = kVar.f1030k;
        this.f1030k = str;
        if (str != null) {
            c0268a.put(str, this);
        }
        matrix.set(kVar.f1029j);
        ArrayList arrayList = kVar.f1021b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof k) {
                this.f1021b.add(new k((k) obj, c0268a));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.f1010e = 0.0f;
                    jVar2.f1012g = 1.0f;
                    jVar2.f1013h = 1.0f;
                    jVar2.f1014i = 0.0f;
                    jVar2.f1015j = 1.0f;
                    jVar2.f1016k = 0.0f;
                    jVar2.f1017l = Paint.Cap.BUTT;
                    jVar2.f1018m = Paint.Join.MITER;
                    jVar2.f1019n = 4.0f;
                    jVar2.f1009d = jVar.f1009d;
                    jVar2.f1010e = jVar.f1010e;
                    jVar2.f1012g = jVar.f1012g;
                    jVar2.f1011f = jVar.f1011f;
                    jVar2.f1033c = jVar.f1033c;
                    jVar2.f1013h = jVar.f1013h;
                    jVar2.f1014i = jVar.f1014i;
                    jVar2.f1015j = jVar.f1015j;
                    jVar2.f1016k = jVar.f1016k;
                    jVar2.f1017l = jVar.f1017l;
                    jVar2.f1018m = jVar.f1018m;
                    jVar2.f1019n = jVar.f1019n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f1021b.add(iVar);
                Object obj2 = iVar.f1032b;
                if (obj2 != null) {
                    c0268a.put(obj2, iVar);
                }
            }
        }
    }
}
