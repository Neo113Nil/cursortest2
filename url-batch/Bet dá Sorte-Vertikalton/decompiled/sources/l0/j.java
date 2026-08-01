package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3098a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3099b;

    /* renamed from: c, reason: collision with root package name */
    public float f3100c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3101e;

    /* renamed from: f, reason: collision with root package name */
    public float f3102f;

    /* renamed from: g, reason: collision with root package name */
    public float f3103g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3104j;

    /* renamed from: k, reason: collision with root package name */
    public String f3105k;

    public j() {
        this.f3098a = new Matrix();
        this.f3099b = new ArrayList();
        this.f3100c = 0.0f;
        this.d = 0.0f;
        this.f3101e = 0.0f;
        this.f3102f = 1.0f;
        this.f3103g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3104j = new Matrix();
        this.f3105k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3099b;
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
            ArrayList arrayList = this.f3099b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3104j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3101e);
        matrix.postScale(this.f3102f, this.f3103g);
        matrix.postRotate(this.f3100c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3101e);
    }

    public String getGroupName() {
        return this.f3105k;
    }

    public Matrix getLocalMatrix() {
        return this.f3104j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3101e;
    }

    public float getRotation() {
        return this.f3100c;
    }

    public float getScaleX() {
        return this.f3102f;
    }

    public float getScaleY() {
        return this.f3103g;
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
        if (f2 != this.f3101e) {
            this.f3101e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3100c) {
            this.f3100c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3102f) {
            this.f3102f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3103g) {
            this.f3103g = f2;
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
        this.f3098a = new Matrix();
        this.f3099b = new ArrayList();
        this.f3100c = 0.0f;
        this.d = 0.0f;
        this.f3101e = 0.0f;
        this.f3102f = 1.0f;
        this.f3103g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3104j = matrix;
        this.f3105k = null;
        this.f3100c = jVar.f3100c;
        this.d = jVar.d;
        this.f3101e = jVar.f3101e;
        this.f3102f = jVar.f3102f;
        this.f3103g = jVar.f3103g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3105k;
        this.f3105k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3104j);
        ArrayList arrayList = jVar.f3099b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3099b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3090e = 0.0f;
                    iVar2.f3092g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3093j = 1.0f;
                    iVar2.f3094k = 0.0f;
                    iVar2.f3095l = Paint.Cap.BUTT;
                    iVar2.f3096m = Paint.Join.MITER;
                    iVar2.f3097n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3090e = iVar.f3090e;
                    iVar2.f3092g = iVar.f3092g;
                    iVar2.f3091f = iVar.f3091f;
                    iVar2.f3108c = iVar.f3108c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3093j = iVar.f3093j;
                    iVar2.f3094k = iVar.f3094k;
                    iVar2.f3095l = iVar.f3095l;
                    iVar2.f3096m = iVar.f3096m;
                    iVar2.f3097n = iVar.f3097n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3099b.add(hVar);
                Object obj2 = hVar.f3107b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
