package q0;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3772a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3773b;

    /* renamed from: c, reason: collision with root package name */
    public float f3774c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3775e;

    /* renamed from: f, reason: collision with root package name */
    public float f3776f;

    /* renamed from: g, reason: collision with root package name */
    public float f3777g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3778j;

    /* renamed from: k, reason: collision with root package name */
    public String f3779k;

    public j() {
        this.f3772a = new Matrix();
        this.f3773b = new ArrayList();
        this.f3774c = RecyclerView.f1937A0;
        this.d = RecyclerView.f1937A0;
        this.f3775e = RecyclerView.f1937A0;
        this.f3776f = 1.0f;
        this.f3777g = 1.0f;
        this.h = RecyclerView.f1937A0;
        this.i = RecyclerView.f1937A0;
        this.f3778j = new Matrix();
        this.f3779k = null;
    }

    @Override // q0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3773b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // q0.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3773b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3778j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3775e);
        matrix.postScale(this.f3776f, this.f3777g);
        matrix.postRotate(this.f3774c, RecyclerView.f1937A0, RecyclerView.f1937A0);
        matrix.postTranslate(this.h + this.d, this.i + this.f3775e);
    }

    public String getGroupName() {
        return this.f3779k;
    }

    public Matrix getLocalMatrix() {
        return this.f3778j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3775e;
    }

    public float getRotation() {
        return this.f3774c;
    }

    public float getScaleX() {
        return this.f3776f;
    }

    public float getScaleY() {
        return this.f3777g;
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
        if (f2 != this.f3775e) {
            this.f3775e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3774c) {
            this.f3774c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3776f) {
            this.f3776f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3777g) {
            this.f3777g = f2;
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
        this.f3772a = new Matrix();
        this.f3773b = new ArrayList();
        this.f3774c = RecyclerView.f1937A0;
        this.d = RecyclerView.f1937A0;
        this.f3775e = RecyclerView.f1937A0;
        this.f3776f = 1.0f;
        this.f3777g = 1.0f;
        this.h = RecyclerView.f1937A0;
        this.i = RecyclerView.f1937A0;
        Matrix matrix = new Matrix();
        this.f3778j = matrix;
        this.f3779k = null;
        this.f3774c = jVar.f3774c;
        this.d = jVar.d;
        this.f3775e = jVar.f3775e;
        this.f3776f = jVar.f3776f;
        this.f3777g = jVar.f3777g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3779k;
        this.f3779k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3778j);
        ArrayList arrayList = jVar.f3773b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3773b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3764e = RecyclerView.f1937A0;
                    iVar2.f3766g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = RecyclerView.f1937A0;
                    iVar2.f3767j = 1.0f;
                    iVar2.f3768k = RecyclerView.f1937A0;
                    iVar2.f3769l = Paint.Cap.BUTT;
                    iVar2.f3770m = Paint.Join.MITER;
                    iVar2.f3771n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3764e = iVar.f3764e;
                    iVar2.f3766g = iVar.f3766g;
                    iVar2.f3765f = iVar.f3765f;
                    iVar2.f3782c = iVar.f3782c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3767j = iVar.f3767j;
                    iVar2.f3768k = iVar.f3768k;
                    iVar2.f3769l = iVar.f3769l;
                    iVar2.f3770m = iVar.f3770m;
                    iVar2.f3771n = iVar.f3771n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3773b.add(hVar);
                Object obj2 = hVar.f3781b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
