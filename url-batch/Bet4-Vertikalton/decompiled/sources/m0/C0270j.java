package m0;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: m0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270j extends AbstractC0271k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3148a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3149b;

    /* renamed from: c, reason: collision with root package name */
    public float f3150c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3151e;

    /* renamed from: f, reason: collision with root package name */
    public float f3152f;

    /* renamed from: g, reason: collision with root package name */
    public float f3153g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3154j;

    /* renamed from: k, reason: collision with root package name */
    public String f3155k;

    public C0270j() {
        this.f3148a = new Matrix();
        this.f3149b = new ArrayList();
        this.f3150c = RecyclerView.f1530C0;
        this.d = RecyclerView.f1530C0;
        this.f3151e = RecyclerView.f1530C0;
        this.f3152f = 1.0f;
        this.f3153g = 1.0f;
        this.h = RecyclerView.f1530C0;
        this.i = RecyclerView.f1530C0;
        this.f3154j = new Matrix();
        this.f3155k = null;
    }

    @Override // m0.AbstractC0271k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3149b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0271k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // m0.AbstractC0271k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3149b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0271k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3154j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3151e);
        matrix.postScale(this.f3152f, this.f3153g);
        matrix.postRotate(this.f3150c, RecyclerView.f1530C0, RecyclerView.f1530C0);
        matrix.postTranslate(this.h + this.d, this.i + this.f3151e);
    }

    public String getGroupName() {
        return this.f3155k;
    }

    public Matrix getLocalMatrix() {
        return this.f3154j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3151e;
    }

    public float getRotation() {
        return this.f3150c;
    }

    public float getScaleX() {
        return this.f3152f;
    }

    public float getScaleY() {
        return this.f3153g;
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
        if (f2 != this.f3151e) {
            this.f3151e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3150c) {
            this.f3150c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3152f) {
            this.f3152f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3153g) {
            this.f3153g = f2;
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
    public C0270j(C0270j c0270j, o.b bVar) {
        C0268h c0268h;
        this.f3148a = new Matrix();
        this.f3149b = new ArrayList();
        this.f3150c = RecyclerView.f1530C0;
        this.d = RecyclerView.f1530C0;
        this.f3151e = RecyclerView.f1530C0;
        this.f3152f = 1.0f;
        this.f3153g = 1.0f;
        this.h = RecyclerView.f1530C0;
        this.i = RecyclerView.f1530C0;
        Matrix matrix = new Matrix();
        this.f3154j = matrix;
        this.f3155k = null;
        this.f3150c = c0270j.f3150c;
        this.d = c0270j.d;
        this.f3151e = c0270j.f3151e;
        this.f3152f = c0270j.f3152f;
        this.f3153g = c0270j.f3153g;
        this.h = c0270j.h;
        this.i = c0270j.i;
        String str = c0270j.f3155k;
        this.f3155k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0270j.f3154j);
        ArrayList arrayList = c0270j.f3149b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0270j) {
                this.f3149b.add(new C0270j((C0270j) obj, bVar));
            } else {
                if (obj instanceof C0269i) {
                    C0269i c0269i = (C0269i) obj;
                    C0269i c0269i2 = new C0269i(c0269i);
                    c0269i2.f3140e = RecyclerView.f1530C0;
                    c0269i2.f3142g = 1.0f;
                    c0269i2.h = 1.0f;
                    c0269i2.i = RecyclerView.f1530C0;
                    c0269i2.f3143j = 1.0f;
                    c0269i2.f3144k = RecyclerView.f1530C0;
                    c0269i2.f3145l = Paint.Cap.BUTT;
                    c0269i2.f3146m = Paint.Join.MITER;
                    c0269i2.f3147n = 4.0f;
                    c0269i2.d = c0269i.d;
                    c0269i2.f3140e = c0269i.f3140e;
                    c0269i2.f3142g = c0269i.f3142g;
                    c0269i2.f3141f = c0269i.f3141f;
                    c0269i2.f3158c = c0269i.f3158c;
                    c0269i2.h = c0269i.h;
                    c0269i2.i = c0269i.i;
                    c0269i2.f3143j = c0269i.f3143j;
                    c0269i2.f3144k = c0269i.f3144k;
                    c0269i2.f3145l = c0269i.f3145l;
                    c0269i2.f3146m = c0269i.f3146m;
                    c0269i2.f3147n = c0269i.f3147n;
                    c0268h = c0269i2;
                } else if (obj instanceof C0268h) {
                    c0268h = new C0268h((C0268h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3149b.add(c0268h);
                Object obj2 = c0268h.f3157b;
                if (obj2 != null) {
                    bVar.put(obj2, c0268h);
                }
            }
        }
    }
}
