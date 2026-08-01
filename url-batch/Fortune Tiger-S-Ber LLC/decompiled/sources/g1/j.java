package g1;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f1784a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1785b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f1786d;

    /* renamed from: e, reason: collision with root package name */
    public float f1787e;

    /* renamed from: f, reason: collision with root package name */
    public float f1788f;
    public float g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f1789i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f1790j;

    /* renamed from: k, reason: collision with root package name */
    public String f1791k;

    public j() {
        this.f1784a = new Matrix();
        this.f1785b = new ArrayList();
        this.c = 0.0f;
        this.f1786d = 0.0f;
        this.f1787e = 0.0f;
        this.f1788f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.f1789i = 0.0f;
        this.f1790j = new Matrix();
        this.f1791k = null;
    }

    @Override // g1.k
    public final boolean a() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f1785b;
            if (i4 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i4)).a()) {
                return true;
            }
            i4++;
        }
    }

    @Override // g1.k
    public final boolean b(int[] iArr) {
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f1785b;
            if (i4 >= arrayList.size()) {
                return z3;
            }
            z3 |= ((k) arrayList.get(i4)).b(iArr);
            i4++;
        }
    }

    public final void c() {
        Matrix matrix = this.f1790j;
        matrix.reset();
        matrix.postTranslate(-this.f1786d, -this.f1787e);
        matrix.postScale(this.f1788f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.f1786d, this.f1789i + this.f1787e);
    }

    public String getGroupName() {
        return this.f1791k;
    }

    public Matrix getLocalMatrix() {
        return this.f1790j;
    }

    public float getPivotX() {
        return this.f1786d;
    }

    public float getPivotY() {
        return this.f1787e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f1788f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f1789i;
    }

    public void setPivotX(float f4) {
        if (f4 != this.f1786d) {
            this.f1786d = f4;
            c();
        }
    }

    public void setPivotY(float f4) {
        if (f4 != this.f1787e) {
            this.f1787e = f4;
            c();
        }
    }

    public void setRotation(float f4) {
        if (f4 != this.c) {
            this.c = f4;
            c();
        }
    }

    public void setScaleX(float f4) {
        if (f4 != this.f1788f) {
            this.f1788f = f4;
            c();
        }
    }

    public void setScaleY(float f4) {
        if (f4 != this.g) {
            this.g = f4;
            c();
        }
    }

    public void setTranslateX(float f4) {
        if (f4 != this.h) {
            this.h = f4;
            c();
        }
    }

    public void setTranslateY(float f4) {
        if (f4 != this.f1789i) {
            this.f1789i = f4;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(j jVar, n.f fVar) {
        h hVar;
        this.f1784a = new Matrix();
        this.f1785b = new ArrayList();
        this.c = 0.0f;
        this.f1786d = 0.0f;
        this.f1787e = 0.0f;
        this.f1788f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.f1789i = 0.0f;
        Matrix matrix = new Matrix();
        this.f1790j = matrix;
        this.f1791k = null;
        this.c = jVar.c;
        this.f1786d = jVar.f1786d;
        this.f1787e = jVar.f1787e;
        this.f1788f = jVar.f1788f;
        this.g = jVar.g;
        this.h = jVar.h;
        this.f1789i = jVar.f1789i;
        String str = jVar.f1791k;
        this.f1791k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f1790j);
        ArrayList arrayList = jVar.f1785b;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Object obj = arrayList.get(i4);
            if (obj instanceof j) {
                this.f1785b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f1776e = 0.0f;
                    iVar2.g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.f1778i = 0.0f;
                    iVar2.f1779j = 1.0f;
                    iVar2.f1780k = 0.0f;
                    iVar2.f1781l = Paint.Cap.BUTT;
                    iVar2.f1782m = Paint.Join.MITER;
                    iVar2.f1783n = 4.0f;
                    iVar2.f1775d = iVar.f1775d;
                    iVar2.f1776e = iVar.f1776e;
                    iVar2.g = iVar.g;
                    iVar2.f1777f = iVar.f1777f;
                    iVar2.c = iVar.c;
                    iVar2.h = iVar.h;
                    iVar2.f1778i = iVar.f1778i;
                    iVar2.f1779j = iVar.f1779j;
                    iVar2.f1780k = iVar.f1780k;
                    iVar2.f1781l = iVar.f1781l;
                    iVar2.f1782m = iVar.f1782m;
                    iVar2.f1783n = iVar.f1783n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f1785b.add(hVar);
                Object obj2 = hVar.f1793b;
                if (obj2 != null) {
                    fVar.put(obj2, hVar);
                }
            }
        }
    }
}
