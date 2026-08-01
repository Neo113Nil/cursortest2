package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3132a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3133b;

    /* renamed from: c, reason: collision with root package name */
    public float f3134c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3135e;

    /* renamed from: f, reason: collision with root package name */
    public float f3136f;

    /* renamed from: g, reason: collision with root package name */
    public float f3137g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3138j;

    /* renamed from: k, reason: collision with root package name */
    public String f3139k;

    public j() {
        this.f3132a = new Matrix();
        this.f3133b = new ArrayList();
        this.f3134c = 0.0f;
        this.d = 0.0f;
        this.f3135e = 0.0f;
        this.f3136f = 1.0f;
        this.f3137g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3138j = new Matrix();
        this.f3139k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3133b;
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
            ArrayList arrayList = this.f3133b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3138j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3135e);
        matrix.postScale(this.f3136f, this.f3137g);
        matrix.postRotate(this.f3134c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3135e);
    }

    public String getGroupName() {
        return this.f3139k;
    }

    public Matrix getLocalMatrix() {
        return this.f3138j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3135e;
    }

    public float getRotation() {
        return this.f3134c;
    }

    public float getScaleX() {
        return this.f3136f;
    }

    public float getScaleY() {
        return this.f3137g;
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
        if (f2 != this.f3135e) {
            this.f3135e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3134c) {
            this.f3134c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3136f) {
            this.f3136f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3137g) {
            this.f3137g = f2;
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
        this.f3132a = new Matrix();
        this.f3133b = new ArrayList();
        this.f3134c = 0.0f;
        this.d = 0.0f;
        this.f3135e = 0.0f;
        this.f3136f = 1.0f;
        this.f3137g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3138j = matrix;
        this.f3139k = null;
        this.f3134c = jVar.f3134c;
        this.d = jVar.d;
        this.f3135e = jVar.f3135e;
        this.f3136f = jVar.f3136f;
        this.f3137g = jVar.f3137g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3139k;
        this.f3139k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3138j);
        ArrayList arrayList = jVar.f3133b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3133b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3124e = 0.0f;
                    iVar2.f3126g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3127j = 1.0f;
                    iVar2.f3128k = 0.0f;
                    iVar2.f3129l = Paint.Cap.BUTT;
                    iVar2.f3130m = Paint.Join.MITER;
                    iVar2.f3131n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3124e = iVar.f3124e;
                    iVar2.f3126g = iVar.f3126g;
                    iVar2.f3125f = iVar.f3125f;
                    iVar2.f3142c = iVar.f3142c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3127j = iVar.f3127j;
                    iVar2.f3128k = iVar.f3128k;
                    iVar2.f3129l = iVar.f3129l;
                    iVar2.f3130m = iVar.f3130m;
                    iVar2.f3131n = iVar.f3131n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3133b.add(hVar);
                Object obj2 = hVar.f3141b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
