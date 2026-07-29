package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3110a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3111b;

    /* renamed from: c, reason: collision with root package name */
    public float f3112c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3113e;

    /* renamed from: f, reason: collision with root package name */
    public float f3114f;

    /* renamed from: g, reason: collision with root package name */
    public float f3115g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3116j;

    /* renamed from: k, reason: collision with root package name */
    public String f3117k;

    public j() {
        this.f3110a = new Matrix();
        this.f3111b = new ArrayList();
        this.f3112c = 0.0f;
        this.d = 0.0f;
        this.f3113e = 0.0f;
        this.f3114f = 1.0f;
        this.f3115g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3116j = new Matrix();
        this.f3117k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3111b;
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
            ArrayList arrayList = this.f3111b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3116j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3113e);
        matrix.postScale(this.f3114f, this.f3115g);
        matrix.postRotate(this.f3112c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3113e);
    }

    public String getGroupName() {
        return this.f3117k;
    }

    public Matrix getLocalMatrix() {
        return this.f3116j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3113e;
    }

    public float getRotation() {
        return this.f3112c;
    }

    public float getScaleX() {
        return this.f3114f;
    }

    public float getScaleY() {
        return this.f3115g;
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
        if (f2 != this.f3113e) {
            this.f3113e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3112c) {
            this.f3112c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3114f) {
            this.f3114f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3115g) {
            this.f3115g = f2;
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
        this.f3110a = new Matrix();
        this.f3111b = new ArrayList();
        this.f3112c = 0.0f;
        this.d = 0.0f;
        this.f3113e = 0.0f;
        this.f3114f = 1.0f;
        this.f3115g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3116j = matrix;
        this.f3117k = null;
        this.f3112c = jVar.f3112c;
        this.d = jVar.d;
        this.f3113e = jVar.f3113e;
        this.f3114f = jVar.f3114f;
        this.f3115g = jVar.f3115g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3117k;
        this.f3117k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3116j);
        ArrayList arrayList = jVar.f3111b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3111b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3102e = 0.0f;
                    iVar2.f3104g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3105j = 1.0f;
                    iVar2.f3106k = 0.0f;
                    iVar2.f3107l = Paint.Cap.BUTT;
                    iVar2.f3108m = Paint.Join.MITER;
                    iVar2.f3109n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3102e = iVar.f3102e;
                    iVar2.f3104g = iVar.f3104g;
                    iVar2.f3103f = iVar.f3103f;
                    iVar2.f3120c = iVar.f3120c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3105j = iVar.f3105j;
                    iVar2.f3106k = iVar.f3106k;
                    iVar2.f3107l = iVar.f3107l;
                    iVar2.f3108m = iVar.f3108m;
                    iVar2.f3109n = iVar.f3109n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3111b.add(hVar);
                Object obj2 = hVar.f3119b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
