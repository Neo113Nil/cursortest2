package t;

import androidx.emoji2.text.t;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class b {
    public final a d;

    /* renamed from: a, reason: collision with root package name */
    public f f3354a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3355b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3356c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3357e = false;

    public b(t tVar) {
        this.d = new a(this, tVar);
    }

    public final void a(c cVar, int i) {
        this.d.g(cVar.j(i), 1.0f);
        this.d.g(cVar.j(i), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i) {
        boolean z4 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z4 = true;
            }
            this.f3355b = i;
        }
        if (z4) {
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
        boolean z4 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z4 = true;
            }
            this.f3355b = i;
        }
        if (z4) {
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
        return this.f3354a == null && this.f3355b == 0.0f && this.d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i;
        int d = this.d.d();
        f fVar2 = null;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < d; i4++) {
            float f6 = this.d.f(i4);
            if (f6 < 0.0f) {
                f e4 = this.d.e(i4);
                if ((zArr == null || !zArr[e4.f3376g]) && e4 != fVar && (((i = e4.f3384q) == 3 || i == 4) && f6 < f5)) {
                    f5 = f6;
                    fVar2 = e4;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f3354a;
        if (fVar2 != null) {
            this.d.g(fVar2, -1.0f);
            this.f3354a.h = -1;
            this.f3354a = null;
        }
        float h = this.d.h(fVar, true) * (-1.0f);
        this.f3354a = fVar;
        if (h == 1.0f) {
            return;
        }
        this.f3355b /= h;
        a aVar = this.d;
        int i = aVar.h;
        for (int i4 = 0; i != -1 && i4 < aVar.f3347a; i4++) {
            float[] fArr = aVar.f3352g;
            fArr[i] = fArr[i] / h;
            i = aVar.f3351f[i];
        }
    }

    public final void h(c cVar, f fVar, boolean z4) {
        if (fVar.f3378k) {
            float c5 = this.d.c(fVar);
            this.f3355b = (fVar.f3377j * c5) + this.f3355b;
            this.d.h(fVar, z4);
            if (z4) {
                fVar.b(this);
            }
            if (this.d.d() == 0) {
                this.f3357e = true;
                cVar.f3360b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z4) {
        a aVar = this.d;
        aVar.getClass();
        float c5 = aVar.c(bVar.f3354a);
        aVar.h(bVar.f3354a, z4);
        a aVar2 = bVar.d;
        int d = aVar2.d();
        for (int i = 0; i < d; i++) {
            f e4 = aVar2.e(i);
            aVar.a(e4, aVar2.c(e4) * c5, z4);
        }
        this.f3355b = (bVar.f3355b * c5) + this.f3355b;
        if (z4) {
            bVar.f3354a.b(this);
        }
        if (this.f3354a == null || this.d.d() != 0) {
            return;
        }
        this.f3357e = true;
        cVar.f3360b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z4;
        String g3 = a4.b.g(this.f3354a == null ? "0" : "" + this.f3354a, " = ");
        if (this.f3355b != 0.0f) {
            g3 = g3 + this.f3355b;
            z4 = true;
        } else {
            z4 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            f e4 = this.d.e(i);
            if (e4 != null) {
                float f5 = this.d.f(i);
                if (f5 != 0.0f) {
                    String fVar = e4.toString();
                    if (!z4) {
                        if (f5 < 0.0f) {
                            g3 = a4.b.g(g3, "- ");
                            f5 *= -1.0f;
                        }
                        g3 = f5 == 1.0f ? a4.b.g(g3, fVar) : g3 + f5 + " " + fVar;
                        z4 = true;
                    } else if (f5 > 0.0f) {
                        g3 = a4.b.g(g3, " + ");
                        if (f5 == 1.0f) {
                        }
                        z4 = true;
                    } else {
                        g3 = a4.b.g(g3, " - ");
                        f5 *= -1.0f;
                        if (f5 == 1.0f) {
                        }
                        z4 = true;
                    }
                }
            }
        }
        return !z4 ? a4.b.g(g3, "0.0") : g3;
    }
}
