package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: l0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267j extends AbstractC0268k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3066a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3067b;

    /* renamed from: c, reason: collision with root package name */
    public float f3068c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3069e;

    /* renamed from: f, reason: collision with root package name */
    public float f3070f;

    /* renamed from: g, reason: collision with root package name */
    public float f3071g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3072j;

    /* renamed from: k, reason: collision with root package name */
    public String f3073k;

    public C0267j() {
        this.f3066a = new Matrix();
        this.f3067b = new ArrayList();
        this.f3068c = 0.0f;
        this.d = 0.0f;
        this.f3069e = 0.0f;
        this.f3070f = 1.0f;
        this.f3071g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3072j = new Matrix();
        this.f3073k = null;
    }

    @Override // l0.AbstractC0268k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3067b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0268k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // l0.AbstractC0268k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3067b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0268k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3072j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3069e);
        matrix.postScale(this.f3070f, this.f3071g);
        matrix.postRotate(this.f3068c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3069e);
    }

    public String getGroupName() {
        return this.f3073k;
    }

    public Matrix getLocalMatrix() {
        return this.f3072j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3069e;
    }

    public float getRotation() {
        return this.f3068c;
    }

    public float getScaleX() {
        return this.f3070f;
    }

    public float getScaleY() {
        return this.f3071g;
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
        if (f2 != this.f3069e) {
            this.f3069e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3068c) {
            this.f3068c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3070f) {
            this.f3070f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3071g) {
            this.f3071g = f2;
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
    public C0267j(C0267j c0267j, o.b bVar) {
        C0265h c0265h;
        this.f3066a = new Matrix();
        this.f3067b = new ArrayList();
        this.f3068c = 0.0f;
        this.d = 0.0f;
        this.f3069e = 0.0f;
        this.f3070f = 1.0f;
        this.f3071g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3072j = matrix;
        this.f3073k = null;
        this.f3068c = c0267j.f3068c;
        this.d = c0267j.d;
        this.f3069e = c0267j.f3069e;
        this.f3070f = c0267j.f3070f;
        this.f3071g = c0267j.f3071g;
        this.h = c0267j.h;
        this.i = c0267j.i;
        String str = c0267j.f3073k;
        this.f3073k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0267j.f3072j);
        ArrayList arrayList = c0267j.f3067b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0267j) {
                this.f3067b.add(new C0267j((C0267j) obj, bVar));
            } else {
                if (obj instanceof C0266i) {
                    C0266i c0266i = (C0266i) obj;
                    C0266i c0266i2 = new C0266i(c0266i);
                    c0266i2.f3058e = 0.0f;
                    c0266i2.f3060g = 1.0f;
                    c0266i2.h = 1.0f;
                    c0266i2.i = 0.0f;
                    c0266i2.f3061j = 1.0f;
                    c0266i2.f3062k = 0.0f;
                    c0266i2.f3063l = Paint.Cap.BUTT;
                    c0266i2.f3064m = Paint.Join.MITER;
                    c0266i2.f3065n = 4.0f;
                    c0266i2.d = c0266i.d;
                    c0266i2.f3058e = c0266i.f3058e;
                    c0266i2.f3060g = c0266i.f3060g;
                    c0266i2.f3059f = c0266i.f3059f;
                    c0266i2.f3076c = c0266i.f3076c;
                    c0266i2.h = c0266i.h;
                    c0266i2.i = c0266i.i;
                    c0266i2.f3061j = c0266i.f3061j;
                    c0266i2.f3062k = c0266i.f3062k;
                    c0266i2.f3063l = c0266i.f3063l;
                    c0266i2.f3064m = c0266i.f3064m;
                    c0266i2.f3065n = c0266i.f3065n;
                    c0265h = c0266i2;
                } else if (obj instanceof C0265h) {
                    c0265h = new C0265h((C0265h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3067b.add(c0265h);
                Object obj2 = c0265h.f3075b;
                if (obj2 != null) {
                    bVar.put(obj2, c0265h);
                }
            }
        }
    }
}
