package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3127a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3128b;

    /* renamed from: c, reason: collision with root package name */
    public float f3129c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3130e;

    /* renamed from: f, reason: collision with root package name */
    public float f3131f;

    /* renamed from: g, reason: collision with root package name */
    public float f3132g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3133j;

    /* renamed from: k, reason: collision with root package name */
    public String f3134k;

    public j() {
        this.f3127a = new Matrix();
        this.f3128b = new ArrayList();
        this.f3129c = 0.0f;
        this.d = 0.0f;
        this.f3130e = 0.0f;
        this.f3131f = 1.0f;
        this.f3132g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3133j = new Matrix();
        this.f3134k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3128b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // l0.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3128b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3133j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3130e);
        matrix.postScale(this.f3131f, this.f3132g);
        matrix.postRotate(this.f3129c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3130e);
    }

    public String getGroupName() {
        return this.f3134k;
    }

    public Matrix getLocalMatrix() {
        return this.f3133j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3130e;
    }

    public float getRotation() {
        return this.f3129c;
    }

    public float getScaleX() {
        return this.f3131f;
    }

    public float getScaleY() {
        return this.f3132g;
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
        if (f2 != this.f3130e) {
            this.f3130e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3129c) {
            this.f3129c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3131f) {
            this.f3131f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3132g) {
            this.f3132g = f2;
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
    public j(j jVar, o.b bVar) {
        h hVar;
        this.f3127a = new Matrix();
        this.f3128b = new ArrayList();
        this.f3129c = 0.0f;
        this.d = 0.0f;
        this.f3130e = 0.0f;
        this.f3131f = 1.0f;
        this.f3132g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3133j = matrix;
        this.f3134k = null;
        this.f3129c = jVar.f3129c;
        this.d = jVar.d;
        this.f3130e = jVar.f3130e;
        this.f3131f = jVar.f3131f;
        this.f3132g = jVar.f3132g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3134k;
        this.f3134k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3133j);
        ArrayList arrayList = jVar.f3128b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3128b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3119e = 0.0f;
                    iVar2.f3121g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3122j = 1.0f;
                    iVar2.f3123k = 0.0f;
                    iVar2.f3124l = Paint.Cap.BUTT;
                    iVar2.f3125m = Paint.Join.MITER;
                    iVar2.f3126n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3119e = iVar.f3119e;
                    iVar2.f3121g = iVar.f3121g;
                    iVar2.f3120f = iVar.f3120f;
                    iVar2.f3137c = iVar.f3137c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3122j = iVar.f3122j;
                    iVar2.f3123k = iVar.f3123k;
                    iVar2.f3124l = iVar.f3124l;
                    iVar2.f3125m = iVar.f3125m;
                    iVar2.f3126n = iVar.f3126n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3128b.add(hVar);
                Object obj2 = hVar.f3136b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
