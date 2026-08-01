package o0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: o0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275j extends AbstractC0276k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3265a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3266b;

    /* renamed from: c, reason: collision with root package name */
    public float f3267c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3268e;

    /* renamed from: f, reason: collision with root package name */
    public float f3269f;

    /* renamed from: g, reason: collision with root package name */
    public float f3270g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3271j;

    /* renamed from: k, reason: collision with root package name */
    public String f3272k;

    public C0275j() {
        this.f3265a = new Matrix();
        this.f3266b = new ArrayList();
        this.f3267c = 0.0f;
        this.d = 0.0f;
        this.f3268e = 0.0f;
        this.f3269f = 1.0f;
        this.f3270g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3271j = new Matrix();
        this.f3272k = null;
    }

    @Override // o0.AbstractC0276k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3266b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0276k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // o0.AbstractC0276k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3266b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0276k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3271j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3268e);
        matrix.postScale(this.f3269f, this.f3270g);
        matrix.postRotate(this.f3267c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3268e);
    }

    public String getGroupName() {
        return this.f3272k;
    }

    public Matrix getLocalMatrix() {
        return this.f3271j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3268e;
    }

    public float getRotation() {
        return this.f3267c;
    }

    public float getScaleX() {
        return this.f3269f;
    }

    public float getScaleY() {
        return this.f3270g;
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
        if (f2 != this.f3268e) {
            this.f3268e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3267c) {
            this.f3267c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3269f) {
            this.f3269f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3270g) {
            this.f3270g = f2;
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
    public C0275j(C0275j c0275j, o.b bVar) {
        C0273h c0273h;
        this.f3265a = new Matrix();
        this.f3266b = new ArrayList();
        this.f3267c = 0.0f;
        this.d = 0.0f;
        this.f3268e = 0.0f;
        this.f3269f = 1.0f;
        this.f3270g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3271j = matrix;
        this.f3272k = null;
        this.f3267c = c0275j.f3267c;
        this.d = c0275j.d;
        this.f3268e = c0275j.f3268e;
        this.f3269f = c0275j.f3269f;
        this.f3270g = c0275j.f3270g;
        this.h = c0275j.h;
        this.i = c0275j.i;
        String str = c0275j.f3272k;
        this.f3272k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0275j.f3271j);
        ArrayList arrayList = c0275j.f3266b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0275j) {
                this.f3266b.add(new C0275j((C0275j) obj, bVar));
            } else {
                if (obj instanceof C0274i) {
                    C0274i c0274i = (C0274i) obj;
                    C0274i c0274i2 = new C0274i(c0274i);
                    c0274i2.f3257e = 0.0f;
                    c0274i2.f3259g = 1.0f;
                    c0274i2.h = 1.0f;
                    c0274i2.i = 0.0f;
                    c0274i2.f3260j = 1.0f;
                    c0274i2.f3261k = 0.0f;
                    c0274i2.f3262l = Paint.Cap.BUTT;
                    c0274i2.f3263m = Paint.Join.MITER;
                    c0274i2.f3264n = 4.0f;
                    c0274i2.d = c0274i.d;
                    c0274i2.f3257e = c0274i.f3257e;
                    c0274i2.f3259g = c0274i.f3259g;
                    c0274i2.f3258f = c0274i.f3258f;
                    c0274i2.f3275c = c0274i.f3275c;
                    c0274i2.h = c0274i.h;
                    c0274i2.i = c0274i.i;
                    c0274i2.f3260j = c0274i.f3260j;
                    c0274i2.f3261k = c0274i.f3261k;
                    c0274i2.f3262l = c0274i.f3262l;
                    c0274i2.f3263m = c0274i.f3263m;
                    c0274i2.f3264n = c0274i.f3264n;
                    c0273h = c0274i2;
                } else if (obj instanceof C0273h) {
                    c0273h = new C0273h((C0273h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3266b.add(c0273h);
                Object obj2 = c0273h.f3274b;
                if (obj2 != null) {
                    bVar.put(obj2, c0273h);
                }
            }
        }
    }
}
