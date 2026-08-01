package m0;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: m0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273j extends AbstractC0274k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3172a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3173b;

    /* renamed from: c, reason: collision with root package name */
    public float f3174c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3175e;

    /* renamed from: f, reason: collision with root package name */
    public float f3176f;

    /* renamed from: g, reason: collision with root package name */
    public float f3177g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3178j;

    /* renamed from: k, reason: collision with root package name */
    public String f3179k;

    public C0273j() {
        this.f3172a = new Matrix();
        this.f3173b = new ArrayList();
        this.f3174c = RecyclerView.f1559A0;
        this.d = RecyclerView.f1559A0;
        this.f3175e = RecyclerView.f1559A0;
        this.f3176f = 1.0f;
        this.f3177g = 1.0f;
        this.h = RecyclerView.f1559A0;
        this.i = RecyclerView.f1559A0;
        this.f3178j = new Matrix();
        this.f3179k = null;
    }

    @Override // m0.AbstractC0274k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3173b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0274k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // m0.AbstractC0274k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3173b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0274k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3178j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3175e);
        matrix.postScale(this.f3176f, this.f3177g);
        matrix.postRotate(this.f3174c, RecyclerView.f1559A0, RecyclerView.f1559A0);
        matrix.postTranslate(this.h + this.d, this.i + this.f3175e);
    }

    public String getGroupName() {
        return this.f3179k;
    }

    public Matrix getLocalMatrix() {
        return this.f3178j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3175e;
    }

    public float getRotation() {
        return this.f3174c;
    }

    public float getScaleX() {
        return this.f3176f;
    }

    public float getScaleY() {
        return this.f3177g;
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
        if (f2 != this.f3175e) {
            this.f3175e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3174c) {
            this.f3174c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3176f) {
            this.f3176f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3177g) {
            this.f3177g = f2;
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
    public C0273j(C0273j c0273j, o.b bVar) {
        C0271h c0271h;
        this.f3172a = new Matrix();
        this.f3173b = new ArrayList();
        this.f3174c = RecyclerView.f1559A0;
        this.d = RecyclerView.f1559A0;
        this.f3175e = RecyclerView.f1559A0;
        this.f3176f = 1.0f;
        this.f3177g = 1.0f;
        this.h = RecyclerView.f1559A0;
        this.i = RecyclerView.f1559A0;
        Matrix matrix = new Matrix();
        this.f3178j = matrix;
        this.f3179k = null;
        this.f3174c = c0273j.f3174c;
        this.d = c0273j.d;
        this.f3175e = c0273j.f3175e;
        this.f3176f = c0273j.f3176f;
        this.f3177g = c0273j.f3177g;
        this.h = c0273j.h;
        this.i = c0273j.i;
        String str = c0273j.f3179k;
        this.f3179k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0273j.f3178j);
        ArrayList arrayList = c0273j.f3173b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0273j) {
                this.f3173b.add(new C0273j((C0273j) obj, bVar));
            } else {
                if (obj instanceof C0272i) {
                    C0272i c0272i = (C0272i) obj;
                    C0272i c0272i2 = new C0272i(c0272i);
                    c0272i2.f3164e = RecyclerView.f1559A0;
                    c0272i2.f3166g = 1.0f;
                    c0272i2.h = 1.0f;
                    c0272i2.i = RecyclerView.f1559A0;
                    c0272i2.f3167j = 1.0f;
                    c0272i2.f3168k = RecyclerView.f1559A0;
                    c0272i2.f3169l = Paint.Cap.BUTT;
                    c0272i2.f3170m = Paint.Join.MITER;
                    c0272i2.f3171n = 4.0f;
                    c0272i2.d = c0272i.d;
                    c0272i2.f3164e = c0272i.f3164e;
                    c0272i2.f3166g = c0272i.f3166g;
                    c0272i2.f3165f = c0272i.f3165f;
                    c0272i2.f3182c = c0272i.f3182c;
                    c0272i2.h = c0272i.h;
                    c0272i2.i = c0272i.i;
                    c0272i2.f3167j = c0272i.f3167j;
                    c0272i2.f3168k = c0272i.f3168k;
                    c0272i2.f3169l = c0272i.f3169l;
                    c0272i2.f3170m = c0272i.f3170m;
                    c0272i2.f3171n = c0272i.f3171n;
                    c0271h = c0272i2;
                } else if (obj instanceof C0271h) {
                    c0271h = new C0271h((C0271h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3173b.add(c0271h);
                Object obj2 = c0271h.f3181b;
                if (obj2 != null) {
                    bVar.put(obj2, c0271h);
                }
            }
        }
    }
}
