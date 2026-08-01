package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3131a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3132b;

    /* renamed from: c, reason: collision with root package name */
    public float f3133c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3134e;

    /* renamed from: f, reason: collision with root package name */
    public float f3135f;

    /* renamed from: g, reason: collision with root package name */
    public float f3136g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3137j;

    /* renamed from: k, reason: collision with root package name */
    public String f3138k;

    public j() {
        this.f3131a = new Matrix();
        this.f3132b = new ArrayList();
        this.f3133c = 0.0f;
        this.d = 0.0f;
        this.f3134e = 0.0f;
        this.f3135f = 1.0f;
        this.f3136g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3137j = new Matrix();
        this.f3138k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3132b;
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
            ArrayList arrayList = this.f3132b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3137j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3134e);
        matrix.postScale(this.f3135f, this.f3136g);
        matrix.postRotate(this.f3133c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3134e);
    }

    public String getGroupName() {
        return this.f3138k;
    }

    public Matrix getLocalMatrix() {
        return this.f3137j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3134e;
    }

    public float getRotation() {
        return this.f3133c;
    }

    public float getScaleX() {
        return this.f3135f;
    }

    public float getScaleY() {
        return this.f3136g;
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
        if (f2 != this.f3134e) {
            this.f3134e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3133c) {
            this.f3133c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3135f) {
            this.f3135f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3136g) {
            this.f3136g = f2;
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
        this.f3131a = new Matrix();
        this.f3132b = new ArrayList();
        this.f3133c = 0.0f;
        this.d = 0.0f;
        this.f3134e = 0.0f;
        this.f3135f = 1.0f;
        this.f3136g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3137j = matrix;
        this.f3138k = null;
        this.f3133c = jVar.f3133c;
        this.d = jVar.d;
        this.f3134e = jVar.f3134e;
        this.f3135f = jVar.f3135f;
        this.f3136g = jVar.f3136g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3138k;
        this.f3138k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3137j);
        ArrayList arrayList = jVar.f3132b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3132b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3123e = 0.0f;
                    iVar2.f3125g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3126j = 1.0f;
                    iVar2.f3127k = 0.0f;
                    iVar2.f3128l = Paint.Cap.BUTT;
                    iVar2.f3129m = Paint.Join.MITER;
                    iVar2.f3130n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3123e = iVar.f3123e;
                    iVar2.f3125g = iVar.f3125g;
                    iVar2.f3124f = iVar.f3124f;
                    iVar2.f3141c = iVar.f3141c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3126j = iVar.f3126j;
                    iVar2.f3127k = iVar.f3127k;
                    iVar2.f3128l = iVar.f3128l;
                    iVar2.f3129m = iVar.f3129m;
                    iVar2.f3130n = iVar.f3130n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3132b.add(hVar);
                Object obj2 = hVar.f3140b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
