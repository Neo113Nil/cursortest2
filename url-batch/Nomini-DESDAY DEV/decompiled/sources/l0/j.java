package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3109a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3110b;

    /* renamed from: c, reason: collision with root package name */
    public float f3111c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3112e;

    /* renamed from: f, reason: collision with root package name */
    public float f3113f;

    /* renamed from: g, reason: collision with root package name */
    public float f3114g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3115j;

    /* renamed from: k, reason: collision with root package name */
    public String f3116k;

    public j() {
        this.f3109a = new Matrix();
        this.f3110b = new ArrayList();
        this.f3111c = 0.0f;
        this.d = 0.0f;
        this.f3112e = 0.0f;
        this.f3113f = 1.0f;
        this.f3114g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3115j = new Matrix();
        this.f3116k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3110b;
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
            ArrayList arrayList = this.f3110b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3115j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3112e);
        matrix.postScale(this.f3113f, this.f3114g);
        matrix.postRotate(this.f3111c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3112e);
    }

    public String getGroupName() {
        return this.f3116k;
    }

    public Matrix getLocalMatrix() {
        return this.f3115j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3112e;
    }

    public float getRotation() {
        return this.f3111c;
    }

    public float getScaleX() {
        return this.f3113f;
    }

    public float getScaleY() {
        return this.f3114g;
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
        if (f2 != this.f3112e) {
            this.f3112e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3111c) {
            this.f3111c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3113f) {
            this.f3113f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3114g) {
            this.f3114g = f2;
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
        this.f3109a = new Matrix();
        this.f3110b = new ArrayList();
        this.f3111c = 0.0f;
        this.d = 0.0f;
        this.f3112e = 0.0f;
        this.f3113f = 1.0f;
        this.f3114g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3115j = matrix;
        this.f3116k = null;
        this.f3111c = jVar.f3111c;
        this.d = jVar.d;
        this.f3112e = jVar.f3112e;
        this.f3113f = jVar.f3113f;
        this.f3114g = jVar.f3114g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3116k;
        this.f3116k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3115j);
        ArrayList arrayList = jVar.f3110b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3110b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3101e = 0.0f;
                    iVar2.f3103g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3104j = 1.0f;
                    iVar2.f3105k = 0.0f;
                    iVar2.f3106l = Paint.Cap.BUTT;
                    iVar2.f3107m = Paint.Join.MITER;
                    iVar2.f3108n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3101e = iVar.f3101e;
                    iVar2.f3103g = iVar.f3103g;
                    iVar2.f3102f = iVar.f3102f;
                    iVar2.f3119c = iVar.f3119c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3104j = iVar.f3104j;
                    iVar2.f3105k = iVar.f3105k;
                    iVar2.f3106l = iVar.f3106l;
                    iVar2.f3107m = iVar.f3107m;
                    iVar2.f3108n = iVar.f3108n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3110b.add(hVar);
                Object obj2 = hVar.f3118b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
