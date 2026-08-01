package k0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: k0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225j extends AbstractC0226k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3162a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3163b;

    /* renamed from: c, reason: collision with root package name */
    public float f3164c;

    /* renamed from: d, reason: collision with root package name */
    public float f3165d;

    /* renamed from: e, reason: collision with root package name */
    public float f3166e;

    /* renamed from: f, reason: collision with root package name */
    public float f3167f;

    /* renamed from: g, reason: collision with root package name */
    public float f3168g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3169j;

    /* renamed from: k, reason: collision with root package name */
    public String f3170k;

    public C0225j() {
        this.f3162a = new Matrix();
        this.f3163b = new ArrayList();
        this.f3164c = 0.0f;
        this.f3165d = 0.0f;
        this.f3166e = 0.0f;
        this.f3167f = 1.0f;
        this.f3168g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3169j = new Matrix();
        this.f3170k = null;
    }

    @Override // k0.AbstractC0226k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3163b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0226k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // k0.AbstractC0226k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3163b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0226k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3169j;
        matrix.reset();
        matrix.postTranslate(-this.f3165d, -this.f3166e);
        matrix.postScale(this.f3167f, this.f3168g);
        matrix.postRotate(this.f3164c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.f3165d, this.i + this.f3166e);
    }

    public String getGroupName() {
        return this.f3170k;
    }

    public Matrix getLocalMatrix() {
        return this.f3169j;
    }

    public float getPivotX() {
        return this.f3165d;
    }

    public float getPivotY() {
        return this.f3166e;
    }

    public float getRotation() {
        return this.f3164c;
    }

    public float getScaleX() {
        return this.f3167f;
    }

    public float getScaleY() {
        return this.f3168g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f3165d) {
            this.f3165d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f3166e) {
            this.f3166e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3164c) {
            this.f3164c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3167f) {
            this.f3167f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3168g) {
            this.f3168g = f2;
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
    public C0225j(C0225j c0225j, o.b bVar) {
        C0223h c0223h;
        this.f3162a = new Matrix();
        this.f3163b = new ArrayList();
        this.f3164c = 0.0f;
        this.f3165d = 0.0f;
        this.f3166e = 0.0f;
        this.f3167f = 1.0f;
        this.f3168g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3169j = matrix;
        this.f3170k = null;
        this.f3164c = c0225j.f3164c;
        this.f3165d = c0225j.f3165d;
        this.f3166e = c0225j.f3166e;
        this.f3167f = c0225j.f3167f;
        this.f3168g = c0225j.f3168g;
        this.h = c0225j.h;
        this.i = c0225j.i;
        String str = c0225j.f3170k;
        this.f3170k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0225j.f3169j);
        ArrayList arrayList = c0225j.f3163b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0225j) {
                this.f3163b.add(new C0225j((C0225j) obj, bVar));
            } else {
                if (obj instanceof C0224i) {
                    C0224i c0224i = (C0224i) obj;
                    C0224i c0224i2 = new C0224i(c0224i);
                    c0224i2.f3154e = 0.0f;
                    c0224i2.f3156g = 1.0f;
                    c0224i2.h = 1.0f;
                    c0224i2.i = 0.0f;
                    c0224i2.f3157j = 1.0f;
                    c0224i2.f3158k = 0.0f;
                    c0224i2.f3159l = Paint.Cap.BUTT;
                    c0224i2.f3160m = Paint.Join.MITER;
                    c0224i2.f3161n = 4.0f;
                    c0224i2.f3153d = c0224i.f3153d;
                    c0224i2.f3154e = c0224i.f3154e;
                    c0224i2.f3156g = c0224i.f3156g;
                    c0224i2.f3155f = c0224i.f3155f;
                    c0224i2.f3173c = c0224i.f3173c;
                    c0224i2.h = c0224i.h;
                    c0224i2.i = c0224i.i;
                    c0224i2.f3157j = c0224i.f3157j;
                    c0224i2.f3158k = c0224i.f3158k;
                    c0224i2.f3159l = c0224i.f3159l;
                    c0224i2.f3160m = c0224i.f3160m;
                    c0224i2.f3161n = c0224i.f3161n;
                    c0223h = c0224i2;
                } else if (obj instanceof C0223h) {
                    c0223h = new C0223h((C0223h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3163b.add(c0223h);
                Object obj2 = c0223h.f3172b;
                if (obj2 != null) {
                    bVar.put(obj2, c0223h);
                }
            }
        }
    }
}
