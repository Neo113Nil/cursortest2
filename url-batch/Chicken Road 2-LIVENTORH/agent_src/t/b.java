package t;

import androidx.emoji2.text.t;
import androidx.fragment.app.w0;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class b {
    public final a d;

    /* renamed from: a, reason: collision with root package name */
    public f f3240a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3241b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3242c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3243e = false;

    public b(t tVar) {
        this.d = new a(this, tVar);
    }

    public final void a(c cVar, int i) {
        this.d.g(cVar.j(i), 1.0f);
        this.d.g(cVar.j(i), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i) {
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            this.f3241b = i;
        }
        if (z3) {
            this.d.g(fVar, 1.0f);
            this.d.g(fVar2, -1.0f);
            this.d.g(fVar3, -1.0f);
        } else {
            this.d.g(fVar, -1.0f);
            this.d.g(fVar2, 1.0f);
            this.d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i) {
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            this.f3241b = i;
        }
        if (z3) {
            this.d.g(fVar, 1.0f);
            this.d.g(fVar2, -1.0f);
            this.d.g(fVar3, 1.0f);
        } else {
            this.d.g(fVar, -1.0f);
            this.d.g(fVar2, 1.0f);
            this.d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3240a == null && this.f3241b == 0.0f && this.d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i;
        int d = this.d.d();
        f fVar2 = null;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < d; i4++) {
            float f4 = this.d.f(i4);
            if (f4 < 0.0f) {
                f e4 = this.d.e(i4);
                if ((zArr == null || !zArr[e4.f3263g]) && e4 != fVar && (((i = e4.f3272q) == 3 || i == 4) && f4 < f2)) {
                    f2 = f4;
                    fVar2 = e4;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f3240a;
        if (fVar2 != null) {
            this.d.g(fVar2, -1.0f);
            this.f3240a.f3264h = -1;
            this.f3240a = null;
        }
        float h4 = this.d.h(fVar, true) * (-1.0f);
        this.f3240a = fVar;
        if (h4 == 1.0f) {
            return;
        }
        this.f3241b /= h4;
        a aVar = this.d;
        int i = aVar.f3238h;
        for (int i4 = 0; i != -1 && i4 < aVar.f3232a; i4++) {
            float[] fArr = aVar.f3237g;
            fArr[i] = fArr[i] / h4;
            i = aVar.f3236f[i];
        }
    }

    public final void h(c cVar, f fVar, boolean z3) {
        if (fVar.f3266k) {
            float c4 = this.d.c(fVar);
            this.f3241b = (fVar.f3265j * c4) + this.f3241b;
            this.d.h(fVar, z3);
            if (z3) {
                fVar.b(this);
            }
            if (this.d.d() == 0) {
                this.f3243e = true;
                cVar.f3246b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z3) {
        a aVar = this.d;
        aVar.getClass();
        float c4 = aVar.c(bVar.f3240a);
        aVar.h(bVar.f3240a, z3);
        a aVar2 = bVar.d;
        int d = aVar2.d();
        for (int i = 0; i < d; i++) {
            f e4 = aVar2.e(i);
            aVar.a(e4, aVar2.c(e4) * c4, z3);
        }
        this.f3241b = (bVar.f3241b * c4) + this.f3241b;
        if (z3) {
            bVar.f3240a.b(this);
        }
        if (this.f3240a == null || this.d.d() != 0) {
            return;
        }
        this.f3243e = true;
        cVar.f3246b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z3;
        String f2 = w0.f(this.f3240a == null ? "0" : "" + this.f3240a, " = ");
        if (this.f3241b != 0.0f) {
            f2 = f2 + this.f3241b;
            z3 = true;
        } else {
            z3 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            f e4 = this.d.e(i);
            if (e4 != null) {
                float f4 = this.d.f(i);
                if (f4 != 0.0f) {
                    String fVar = e4.toString();
                    if (!z3) {
                        if (f4 < 0.0f) {
                            f2 = w0.f(f2, "- ");
                            f4 *= -1.0f;
                        }
                        f2 = f4 == 1.0f ? w0.f(f2, fVar) : f2 + f4 + " " + fVar;
                        z3 = true;
                    } else if (f4 > 0.0f) {
                        f2 = w0.f(f2, " + ");
                        if (f4 == 1.0f) {
                        }
                        z3 = true;
                    } else {
                        f2 = w0.f(f2, " - ");
                        f4 *= -1.0f;
                        if (f4 == 1.0f) {
                        }
                        z3 = true;
                    }
                }
            }
        }
        return !z3 ? w0.f(f2, "0.0") : f2;
    }
}
