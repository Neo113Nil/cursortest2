package l1;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f2658a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2659b;

    /* renamed from: c, reason: collision with root package name */
    public float f2660c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f2661e;

    /* renamed from: f, reason: collision with root package name */
    public float f2662f;

    /* renamed from: g, reason: collision with root package name */
    public float f2663g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f2664j;

    /* renamed from: k, reason: collision with root package name */
    public String f2665k;

    public i() {
        this.f2658a = new Matrix();
        this.f2659b = new ArrayList();
        this.f2660c = 0.0f;
        this.d = 0.0f;
        this.f2661e = 0.0f;
        this.f2662f = 1.0f;
        this.f2663g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f2664j = new Matrix();
        this.f2665k = null;
    }

    @Override // l1.j
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2659b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // l1.j
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f2659b;
            if (i >= arrayList.size()) {
                return z4;
            }
            z4 |= ((j) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f2664j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f2661e);
        matrix.postScale(this.f2662f, this.f2663g);
        matrix.postRotate(this.f2660c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f2661e);
    }

    public String getGroupName() {
        return this.f2665k;
    }

    public Matrix getLocalMatrix() {
        return this.f2664j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f2661e;
    }

    public float getRotation() {
        return this.f2660c;
    }

    public float getScaleX() {
        return this.f2662f;
    }

    public float getScaleY() {
        return this.f2663g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f5) {
        if (f5 != this.d) {
            this.d = f5;
            c();
        }
    }

    public void setPivotY(float f5) {
        if (f5 != this.f2661e) {
            this.f2661e = f5;
            c();
        }
    }

    public void setRotation(float f5) {
        if (f5 != this.f2660c) {
            this.f2660c = f5;
            c();
        }
    }

    public void setScaleX(float f5) {
        if (f5 != this.f2662f) {
            this.f2662f = f5;
            c();
        }
    }

    public void setScaleY(float f5) {
        if (f5 != this.f2663g) {
            this.f2663g = f5;
            c();
        }
    }

    public void setTranslateX(float f5) {
        if (f5 != this.h) {
            this.h = f5;
            c();
        }
    }

    public void setTranslateY(float f5) {
        if (f5 != this.i) {
            this.i = f5;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(i iVar, q.f fVar) {
        g gVar;
        this.f2658a = new Matrix();
        this.f2659b = new ArrayList();
        this.f2660c = 0.0f;
        this.d = 0.0f;
        this.f2661e = 0.0f;
        this.f2662f = 1.0f;
        this.f2663g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f2664j = matrix;
        this.f2665k = null;
        this.f2660c = iVar.f2660c;
        this.d = iVar.d;
        this.f2661e = iVar.f2661e;
        this.f2662f = iVar.f2662f;
        this.f2663g = iVar.f2663g;
        this.h = iVar.h;
        this.i = iVar.i;
        String str = iVar.f2665k;
        this.f2665k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f2664j);
        ArrayList arrayList = iVar.f2659b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof i) {
                this.f2659b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    h hVar2 = new h(hVar);
                    hVar2.f2650e = 0.0f;
                    hVar2.f2652g = 1.0f;
                    hVar2.h = 1.0f;
                    hVar2.i = 0.0f;
                    hVar2.f2653j = 1.0f;
                    hVar2.f2654k = 0.0f;
                    hVar2.f2655l = Paint.Cap.BUTT;
                    hVar2.f2656m = Paint.Join.MITER;
                    hVar2.f2657n = 4.0f;
                    hVar2.d = hVar.d;
                    hVar2.f2650e = hVar.f2650e;
                    hVar2.f2652g = hVar.f2652g;
                    hVar2.f2651f = hVar.f2651f;
                    hVar2.f2668c = hVar.f2668c;
                    hVar2.h = hVar.h;
                    hVar2.i = hVar.i;
                    hVar2.f2653j = hVar.f2653j;
                    hVar2.f2654k = hVar.f2654k;
                    hVar2.f2655l = hVar.f2655l;
                    hVar2.f2656m = hVar.f2656m;
                    hVar2.f2657n = hVar.f2657n;
                    gVar = hVar2;
                } else if (obj instanceof g) {
                    gVar = new g((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f2659b.add(gVar);
                Object obj2 = gVar.f2667b;
                if (obj2 != null) {
                    fVar.put(obj2, gVar);
                }
            }
        }
    }
}
