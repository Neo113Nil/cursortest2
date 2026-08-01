package n0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3250a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3251b;

    /* renamed from: c, reason: collision with root package name */
    public float f3252c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3253e;

    /* renamed from: f, reason: collision with root package name */
    public float f3254f;

    /* renamed from: g, reason: collision with root package name */
    public float f3255g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3256j;

    /* renamed from: k, reason: collision with root package name */
    public String f3257k;

    public j() {
        this.f3250a = new Matrix();
        this.f3251b = new ArrayList();
        this.f3252c = 0.0f;
        this.d = 0.0f;
        this.f3253e = 0.0f;
        this.f3254f = 1.0f;
        this.f3255g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3256j = new Matrix();
        this.f3257k = null;
    }

    @Override // n0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3251b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // n0.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3251b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3256j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3253e);
        matrix.postScale(this.f3254f, this.f3255g);
        matrix.postRotate(this.f3252c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3253e);
    }

    public String getGroupName() {
        return this.f3257k;
    }

    public Matrix getLocalMatrix() {
        return this.f3256j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3253e;
    }

    public float getRotation() {
        return this.f3252c;
    }

    public float getScaleX() {
        return this.f3254f;
    }

    public float getScaleY() {
        return this.f3255g;
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
        if (f2 != this.f3253e) {
            this.f3253e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3252c) {
            this.f3252c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3254f) {
            this.f3254f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3255g) {
            this.f3255g = f2;
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
    public j(j jVar, q.b bVar) {
        h hVar;
        this.f3250a = new Matrix();
        this.f3251b = new ArrayList();
        this.f3252c = 0.0f;
        this.d = 0.0f;
        this.f3253e = 0.0f;
        this.f3254f = 1.0f;
        this.f3255g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3256j = matrix;
        this.f3257k = null;
        this.f3252c = jVar.f3252c;
        this.d = jVar.d;
        this.f3253e = jVar.f3253e;
        this.f3254f = jVar.f3254f;
        this.f3255g = jVar.f3255g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3257k;
        this.f3257k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3256j);
        ArrayList arrayList = jVar.f3251b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3251b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3242e = 0.0f;
                    iVar2.f3244g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3245j = 1.0f;
                    iVar2.f3246k = 0.0f;
                    iVar2.f3247l = Paint.Cap.BUTT;
                    iVar2.f3248m = Paint.Join.MITER;
                    iVar2.f3249n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3242e = iVar.f3242e;
                    iVar2.f3244g = iVar.f3244g;
                    iVar2.f3243f = iVar.f3243f;
                    iVar2.f3260c = iVar.f3260c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3245j = iVar.f3245j;
                    iVar2.f3246k = iVar.f3246k;
                    iVar2.f3247l = iVar.f3247l;
                    iVar2.f3248m = iVar.f3248m;
                    iVar2.f3249n = iVar.f3249n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3251b.add(hVar);
                Object obj2 = hVar.f3259b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
