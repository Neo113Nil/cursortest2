package k0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: k0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223j extends AbstractC0224k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3158a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3159b;

    /* renamed from: c, reason: collision with root package name */
    public float f3160c;

    /* renamed from: d, reason: collision with root package name */
    public float f3161d;

    /* renamed from: e, reason: collision with root package name */
    public float f3162e;

    /* renamed from: f, reason: collision with root package name */
    public float f3163f;

    /* renamed from: g, reason: collision with root package name */
    public float f3164g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3165j;

    /* renamed from: k, reason: collision with root package name */
    public String f3166k;

    public C0223j() {
        this.f3158a = new Matrix();
        this.f3159b = new ArrayList();
        this.f3160c = 0.0f;
        this.f3161d = 0.0f;
        this.f3162e = 0.0f;
        this.f3163f = 1.0f;
        this.f3164g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3165j = new Matrix();
        this.f3166k = null;
    }

    @Override // k0.AbstractC0224k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3159b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0224k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // k0.AbstractC0224k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3159b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0224k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3165j;
        matrix.reset();
        matrix.postTranslate(-this.f3161d, -this.f3162e);
        matrix.postScale(this.f3163f, this.f3164g);
        matrix.postRotate(this.f3160c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.f3161d, this.i + this.f3162e);
    }

    public String getGroupName() {
        return this.f3166k;
    }

    public Matrix getLocalMatrix() {
        return this.f3165j;
    }

    public float getPivotX() {
        return this.f3161d;
    }

    public float getPivotY() {
        return this.f3162e;
    }

    public float getRotation() {
        return this.f3160c;
    }

    public float getScaleX() {
        return this.f3163f;
    }

    public float getScaleY() {
        return this.f3164g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f3161d) {
            this.f3161d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f3162e) {
            this.f3162e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3160c) {
            this.f3160c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3163f) {
            this.f3163f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3164g) {
            this.f3164g = f2;
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
    public C0223j(C0223j c0223j, o.b bVar) {
        C0221h c0221h;
        this.f3158a = new Matrix();
        this.f3159b = new ArrayList();
        this.f3160c = 0.0f;
        this.f3161d = 0.0f;
        this.f3162e = 0.0f;
        this.f3163f = 1.0f;
        this.f3164g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3165j = matrix;
        this.f3166k = null;
        this.f3160c = c0223j.f3160c;
        this.f3161d = c0223j.f3161d;
        this.f3162e = c0223j.f3162e;
        this.f3163f = c0223j.f3163f;
        this.f3164g = c0223j.f3164g;
        this.h = c0223j.h;
        this.i = c0223j.i;
        String str = c0223j.f3166k;
        this.f3166k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0223j.f3165j);
        ArrayList arrayList = c0223j.f3159b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0223j) {
                this.f3159b.add(new C0223j((C0223j) obj, bVar));
            } else {
                if (obj instanceof C0222i) {
                    C0222i c0222i = (C0222i) obj;
                    C0222i c0222i2 = new C0222i(c0222i);
                    c0222i2.f3150e = 0.0f;
                    c0222i2.f3152g = 1.0f;
                    c0222i2.h = 1.0f;
                    c0222i2.i = 0.0f;
                    c0222i2.f3153j = 1.0f;
                    c0222i2.f3154k = 0.0f;
                    c0222i2.f3155l = Paint.Cap.BUTT;
                    c0222i2.f3156m = Paint.Join.MITER;
                    c0222i2.f3157n = 4.0f;
                    c0222i2.f3149d = c0222i.f3149d;
                    c0222i2.f3150e = c0222i.f3150e;
                    c0222i2.f3152g = c0222i.f3152g;
                    c0222i2.f3151f = c0222i.f3151f;
                    c0222i2.f3169c = c0222i.f3169c;
                    c0222i2.h = c0222i.h;
                    c0222i2.i = c0222i.i;
                    c0222i2.f3153j = c0222i.f3153j;
                    c0222i2.f3154k = c0222i.f3154k;
                    c0222i2.f3155l = c0222i.f3155l;
                    c0222i2.f3156m = c0222i.f3156m;
                    c0222i2.f3157n = c0222i.f3157n;
                    c0221h = c0222i2;
                } else if (obj instanceof C0221h) {
                    c0221h = new C0221h((C0221h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3159b.add(c0221h);
                Object obj2 = c0221h.f3168b;
                if (obj2 != null) {
                    bVar.put(obj2, c0221h);
                }
            }
        }
    }
}
