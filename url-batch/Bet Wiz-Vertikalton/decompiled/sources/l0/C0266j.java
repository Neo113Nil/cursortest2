package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: l0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266j extends AbstractC0267k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3119a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3120b;

    /* renamed from: c, reason: collision with root package name */
    public float f3121c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3122e;

    /* renamed from: f, reason: collision with root package name */
    public float f3123f;

    /* renamed from: g, reason: collision with root package name */
    public float f3124g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3125j;

    /* renamed from: k, reason: collision with root package name */
    public String f3126k;

    public C0266j() {
        this.f3119a = new Matrix();
        this.f3120b = new ArrayList();
        this.f3121c = 0.0f;
        this.d = 0.0f;
        this.f3122e = 0.0f;
        this.f3123f = 1.0f;
        this.f3124g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3125j = new Matrix();
        this.f3126k = null;
    }

    @Override // l0.AbstractC0267k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3120b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0267k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // l0.AbstractC0267k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3120b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0267k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3125j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3122e);
        matrix.postScale(this.f3123f, this.f3124g);
        matrix.postRotate(this.f3121c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3122e);
    }

    public String getGroupName() {
        return this.f3126k;
    }

    public Matrix getLocalMatrix() {
        return this.f3125j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3122e;
    }

    public float getRotation() {
        return this.f3121c;
    }

    public float getScaleX() {
        return this.f3123f;
    }

    public float getScaleY() {
        return this.f3124g;
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
        if (f2 != this.f3122e) {
            this.f3122e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3121c) {
            this.f3121c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3123f) {
            this.f3123f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3124g) {
            this.f3124g = f2;
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
    public C0266j(C0266j c0266j, o.b bVar) {
        C0264h c0264h;
        this.f3119a = new Matrix();
        this.f3120b = new ArrayList();
        this.f3121c = 0.0f;
        this.d = 0.0f;
        this.f3122e = 0.0f;
        this.f3123f = 1.0f;
        this.f3124g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3125j = matrix;
        this.f3126k = null;
        this.f3121c = c0266j.f3121c;
        this.d = c0266j.d;
        this.f3122e = c0266j.f3122e;
        this.f3123f = c0266j.f3123f;
        this.f3124g = c0266j.f3124g;
        this.h = c0266j.h;
        this.i = c0266j.i;
        String str = c0266j.f3126k;
        this.f3126k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0266j.f3125j);
        ArrayList arrayList = c0266j.f3120b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0266j) {
                this.f3120b.add(new C0266j((C0266j) obj, bVar));
            } else {
                if (obj instanceof C0265i) {
                    C0265i c0265i = (C0265i) obj;
                    C0265i c0265i2 = new C0265i(c0265i);
                    c0265i2.f3111e = 0.0f;
                    c0265i2.f3113g = 1.0f;
                    c0265i2.h = 1.0f;
                    c0265i2.i = 0.0f;
                    c0265i2.f3114j = 1.0f;
                    c0265i2.f3115k = 0.0f;
                    c0265i2.f3116l = Paint.Cap.BUTT;
                    c0265i2.f3117m = Paint.Join.MITER;
                    c0265i2.f3118n = 4.0f;
                    c0265i2.d = c0265i.d;
                    c0265i2.f3111e = c0265i.f3111e;
                    c0265i2.f3113g = c0265i.f3113g;
                    c0265i2.f3112f = c0265i.f3112f;
                    c0265i2.f3129c = c0265i.f3129c;
                    c0265i2.h = c0265i.h;
                    c0265i2.i = c0265i.i;
                    c0265i2.f3114j = c0265i.f3114j;
                    c0265i2.f3115k = c0265i.f3115k;
                    c0265i2.f3116l = c0265i.f3116l;
                    c0265i2.f3117m = c0265i.f3117m;
                    c0265i2.f3118n = c0265i.f3118n;
                    c0264h = c0265i2;
                } else if (obj instanceof C0264h) {
                    c0264h = new C0264h((C0264h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3120b.add(c0264h);
                Object obj2 = c0264h.f3128b;
                if (obj2 != null) {
                    bVar.put(obj2, c0264h);
                }
            }
        }
    }
}
