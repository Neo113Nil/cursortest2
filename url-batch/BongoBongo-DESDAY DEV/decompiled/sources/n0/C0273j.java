package n0;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: n0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273j extends AbstractC0274k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3340a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3341b;

    /* renamed from: c, reason: collision with root package name */
    public float f3342c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3343e;

    /* renamed from: f, reason: collision with root package name */
    public float f3344f;

    /* renamed from: g, reason: collision with root package name */
    public float f3345g;

    /* renamed from: h, reason: collision with root package name */
    public float f3346h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3347j;

    /* renamed from: k, reason: collision with root package name */
    public String f3348k;

    public C0273j() {
        this.f3340a = new Matrix();
        this.f3341b = new ArrayList();
        this.f3342c = RecyclerView.A0;
        this.d = RecyclerView.A0;
        this.f3343e = RecyclerView.A0;
        this.f3344f = 1.0f;
        this.f3345g = 1.0f;
        this.f3346h = RecyclerView.A0;
        this.i = RecyclerView.A0;
        this.f3347j = new Matrix();
        this.f3348k = null;
    }

    @Override // n0.AbstractC0274k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3341b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0274k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // n0.AbstractC0274k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3341b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0274k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3347j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3343e);
        matrix.postScale(this.f3344f, this.f3345g);
        matrix.postRotate(this.f3342c, RecyclerView.A0, RecyclerView.A0);
        matrix.postTranslate(this.f3346h + this.d, this.i + this.f3343e);
    }

    public String getGroupName() {
        return this.f3348k;
    }

    public Matrix getLocalMatrix() {
        return this.f3347j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3343e;
    }

    public float getRotation() {
        return this.f3342c;
    }

    public float getScaleX() {
        return this.f3344f;
    }

    public float getScaleY() {
        return this.f3345g;
    }

    public float getTranslateX() {
        return this.f3346h;
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
        if (f2 != this.f3343e) {
            this.f3343e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3342c) {
            this.f3342c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3344f) {
            this.f3344f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3345g) {
            this.f3345g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f3346h) {
            this.f3346h = f2;
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
    public C0273j(C0273j c0273j, p.b bVar) {
        C0271h c0271h;
        this.f3340a = new Matrix();
        this.f3341b = new ArrayList();
        this.f3342c = RecyclerView.A0;
        this.d = RecyclerView.A0;
        this.f3343e = RecyclerView.A0;
        this.f3344f = 1.0f;
        this.f3345g = 1.0f;
        this.f3346h = RecyclerView.A0;
        this.i = RecyclerView.A0;
        Matrix matrix = new Matrix();
        this.f3347j = matrix;
        this.f3348k = null;
        this.f3342c = c0273j.f3342c;
        this.d = c0273j.d;
        this.f3343e = c0273j.f3343e;
        this.f3344f = c0273j.f3344f;
        this.f3345g = c0273j.f3345g;
        this.f3346h = c0273j.f3346h;
        this.i = c0273j.i;
        String str = c0273j.f3348k;
        this.f3348k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0273j.f3347j);
        ArrayList arrayList = c0273j.f3341b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0273j) {
                this.f3341b.add(new C0273j((C0273j) obj, bVar));
            } else {
                if (obj instanceof C0272i) {
                    C0272i c0272i = (C0272i) obj;
                    C0272i c0272i2 = new C0272i(c0272i);
                    c0272i2.f3331e = RecyclerView.A0;
                    c0272i2.f3333g = 1.0f;
                    c0272i2.f3334h = 1.0f;
                    c0272i2.i = RecyclerView.A0;
                    c0272i2.f3335j = 1.0f;
                    c0272i2.f3336k = RecyclerView.A0;
                    c0272i2.f3337l = Paint.Cap.BUTT;
                    c0272i2.f3338m = Paint.Join.MITER;
                    c0272i2.f3339n = 4.0f;
                    c0272i2.d = c0272i.d;
                    c0272i2.f3331e = c0272i.f3331e;
                    c0272i2.f3333g = c0272i.f3333g;
                    c0272i2.f3332f = c0272i.f3332f;
                    c0272i2.f3351c = c0272i.f3351c;
                    c0272i2.f3334h = c0272i.f3334h;
                    c0272i2.i = c0272i.i;
                    c0272i2.f3335j = c0272i.f3335j;
                    c0272i2.f3336k = c0272i.f3336k;
                    c0272i2.f3337l = c0272i.f3337l;
                    c0272i2.f3338m = c0272i.f3338m;
                    c0272i2.f3339n = c0272i.f3339n;
                    c0271h = c0272i2;
                } else if (obj instanceof C0271h) {
                    c0271h = new C0271h((C0271h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3341b.add(c0271h);
                Object obj2 = c0271h.f3350b;
                if (obj2 != null) {
                    bVar.put(obj2, c0271h);
                }
            }
        }
    }
}
