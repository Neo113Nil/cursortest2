package k1;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f2185a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2186b;

    /* renamed from: c, reason: collision with root package name */
    public float f2187c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f2188e;

    /* renamed from: f, reason: collision with root package name */
    public float f2189f;

    /* renamed from: g, reason: collision with root package name */
    public float f2190g;

    /* renamed from: h, reason: collision with root package name */
    public float f2191h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f2192j;

    /* renamed from: k, reason: collision with root package name */
    public String f2193k;

    public j() {
        this.f2185a = new Matrix();
        this.f2186b = new ArrayList();
        this.f2187c = 0.0f;
        this.d = 0.0f;
        this.f2188e = 0.0f;
        this.f2189f = 1.0f;
        this.f2190g = 1.0f;
        this.f2191h = 0.0f;
        this.i = 0.0f;
        this.f2192j = new Matrix();
        this.f2193k = null;
    }

    @Override // k1.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2186b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // k1.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f2186b;
            if (i >= arrayList.size()) {
                return z3;
            }
            z3 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f2192j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f2188e);
        matrix.postScale(this.f2189f, this.f2190g);
        matrix.postRotate(this.f2187c, 0.0f, 0.0f);
        matrix.postTranslate(this.f2191h + this.d, this.i + this.f2188e);
    }

    public String getGroupName() {
        return this.f2193k;
    }

    public Matrix getLocalMatrix() {
        return this.f2192j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f2188e;
    }

    public float getRotation() {
        return this.f2187c;
    }

    public float getScaleX() {
        return this.f2189f;
    }

    public float getScaleY() {
        return this.f2190g;
    }

    public float getTranslateX() {
        return this.f2191h;
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
        if (f2 != this.f2188e) {
            this.f2188e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f2187c) {
            this.f2187c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f2189f) {
            this.f2189f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f2190g) {
            this.f2190g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f2191h) {
            this.f2191h = f2;
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
    public j(j jVar, q.f fVar) {
        h hVar;
        this.f2185a = new Matrix();
        this.f2186b = new ArrayList();
        this.f2187c = 0.0f;
        this.d = 0.0f;
        this.f2188e = 0.0f;
        this.f2189f = 1.0f;
        this.f2190g = 1.0f;
        this.f2191h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f2192j = matrix;
        this.f2193k = null;
        this.f2187c = jVar.f2187c;
        this.d = jVar.d;
        this.f2188e = jVar.f2188e;
        this.f2189f = jVar.f2189f;
        this.f2190g = jVar.f2190g;
        this.f2191h = jVar.f2191h;
        this.i = jVar.i;
        String str = jVar.f2193k;
        this.f2193k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f2192j);
        ArrayList arrayList = jVar.f2186b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f2186b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f2176e = 0.0f;
                    iVar2.f2178g = 1.0f;
                    iVar2.f2179h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f2180j = 1.0f;
                    iVar2.f2181k = 0.0f;
                    iVar2.f2182l = Paint.Cap.BUTT;
                    iVar2.f2183m = Paint.Join.MITER;
                    iVar2.f2184n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f2176e = iVar.f2176e;
                    iVar2.f2178g = iVar.f2178g;
                    iVar2.f2177f = iVar.f2177f;
                    iVar2.f2196c = iVar.f2196c;
                    iVar2.f2179h = iVar.f2179h;
                    iVar2.i = iVar.i;
                    iVar2.f2180j = iVar.f2180j;
                    iVar2.f2181k = iVar.f2181k;
                    iVar2.f2182l = iVar.f2182l;
                    iVar2.f2183m = iVar.f2183m;
                    iVar2.f2184n = iVar.f2184n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f2186b.add(hVar);
                Object obj2 = hVar.f2195b;
                if (obj2 != null) {
                    fVar.put(obj2, hVar);
                }
            }
        }
    }
}
