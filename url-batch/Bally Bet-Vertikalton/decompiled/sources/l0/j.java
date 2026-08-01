package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3115a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3116b;

    /* renamed from: c, reason: collision with root package name */
    public float f3117c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3118e;

    /* renamed from: f, reason: collision with root package name */
    public float f3119f;

    /* renamed from: g, reason: collision with root package name */
    public float f3120g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3121j;

    /* renamed from: k, reason: collision with root package name */
    public String f3122k;

    public j() {
        this.f3115a = new Matrix();
        this.f3116b = new ArrayList();
        this.f3117c = 0.0f;
        this.d = 0.0f;
        this.f3118e = 0.0f;
        this.f3119f = 1.0f;
        this.f3120g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3121j = new Matrix();
        this.f3122k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3116b;
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
            ArrayList arrayList = this.f3116b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3121j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3118e);
        matrix.postScale(this.f3119f, this.f3120g);
        matrix.postRotate(this.f3117c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3118e);
    }

    public String getGroupName() {
        return this.f3122k;
    }

    public Matrix getLocalMatrix() {
        return this.f3121j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3118e;
    }

    public float getRotation() {
        return this.f3117c;
    }

    public float getScaleX() {
        return this.f3119f;
    }

    public float getScaleY() {
        return this.f3120g;
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
        if (f2 != this.f3118e) {
            this.f3118e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3117c) {
            this.f3117c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3119f) {
            this.f3119f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3120g) {
            this.f3120g = f2;
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
        this.f3115a = new Matrix();
        this.f3116b = new ArrayList();
        this.f3117c = 0.0f;
        this.d = 0.0f;
        this.f3118e = 0.0f;
        this.f3119f = 1.0f;
        this.f3120g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3121j = matrix;
        this.f3122k = null;
        this.f3117c = jVar.f3117c;
        this.d = jVar.d;
        this.f3118e = jVar.f3118e;
        this.f3119f = jVar.f3119f;
        this.f3120g = jVar.f3120g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3122k;
        this.f3122k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3121j);
        ArrayList arrayList = jVar.f3116b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3116b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3107e = 0.0f;
                    iVar2.f3109g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3110j = 1.0f;
                    iVar2.f3111k = 0.0f;
                    iVar2.f3112l = Paint.Cap.BUTT;
                    iVar2.f3113m = Paint.Join.MITER;
                    iVar2.f3114n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3107e = iVar.f3107e;
                    iVar2.f3109g = iVar.f3109g;
                    iVar2.f3108f = iVar.f3108f;
                    iVar2.f3125c = iVar.f3125c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3110j = iVar.f3110j;
                    iVar2.f3111k = iVar.f3111k;
                    iVar2.f3112l = iVar.f3112l;
                    iVar2.f3113m = iVar.f3113m;
                    iVar2.f3114n = iVar.f3114n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3116b.add(hVar);
                Object obj2 = hVar.f3124b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
