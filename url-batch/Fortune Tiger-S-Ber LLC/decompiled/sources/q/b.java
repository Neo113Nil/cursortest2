package q;

import androidx.emoji2.text.s;
import androidx.fragment.app.w0;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public final a f3063d;

    /* renamed from: a, reason: collision with root package name */
    public f f3061a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3062b = 0.0f;
    public final ArrayList c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3064e = false;

    public b(s sVar) {
        this.f3063d = new a(this, sVar);
    }

    public final void a(c cVar, int i4) {
        this.f3063d.g(cVar.j(i4), 1.0f);
        this.f3063d.g(cVar.j(i4), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f3062b = i4;
        }
        if (z3) {
            this.f3063d.g(fVar, 1.0f);
            this.f3063d.g(fVar2, -1.0f);
            this.f3063d.g(fVar3, -1.0f);
        } else {
            this.f3063d.g(fVar, -1.0f);
            this.f3063d.g(fVar2, 1.0f);
            this.f3063d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f3062b = i4;
        }
        if (z3) {
            this.f3063d.g(fVar, 1.0f);
            this.f3063d.g(fVar2, -1.0f);
            this.f3063d.g(fVar3, 1.0f);
        } else {
            this.f3063d.g(fVar, -1.0f);
            this.f3063d.g(fVar2, 1.0f);
            this.f3063d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3061a == null && this.f3062b == 0.0f && this.f3063d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i4;
        int d4 = this.f3063d.d();
        f fVar2 = null;
        float f4 = 0.0f;
        for (int i5 = 0; i5 < d4; i5++) {
            float f5 = this.f3063d.f(i5);
            if (f5 < 0.0f) {
                f e4 = this.f3063d.e(i5);
                if ((zArr == null || !zArr[e4.g]) && e4 != fVar && (((i4 = e4.f3091q) == 3 || i4 == 4) && f5 < f4)) {
                    f4 = f5;
                    fVar2 = e4;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f3061a;
        if (fVar2 != null) {
            this.f3063d.g(fVar2, -1.0f);
            this.f3061a.h = -1;
            this.f3061a = null;
        }
        float h = this.f3063d.h(fVar, true) * (-1.0f);
        this.f3061a = fVar;
        if (h == 1.0f) {
            return;
        }
        this.f3062b /= h;
        a aVar = this.f3063d;
        int i4 = aVar.h;
        for (int i5 = 0; i4 != -1 && i5 < aVar.f3054a; i5++) {
            float[] fArr = aVar.g;
            fArr[i4] = fArr[i4] / h;
            i4 = aVar.f3058f[i4];
        }
    }

    public final void h(c cVar, f fVar, boolean z3) {
        if (fVar.f3085k) {
            float c = this.f3063d.c(fVar);
            this.f3062b = (fVar.f3084j * c) + this.f3062b;
            this.f3063d.h(fVar, z3);
            if (z3) {
                fVar.b(this);
            }
            if (this.f3063d.d() == 0) {
                this.f3064e = true;
                cVar.f3067b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z3) {
        a aVar = this.f3063d;
        aVar.getClass();
        float c = aVar.c(bVar.f3061a);
        aVar.h(bVar.f3061a, z3);
        a aVar2 = bVar.f3063d;
        int d4 = aVar2.d();
        for (int i4 = 0; i4 < d4; i4++) {
            f e4 = aVar2.e(i4);
            aVar.a(e4, aVar2.c(e4) * c, z3);
        }
        this.f3062b = (bVar.f3062b * c) + this.f3062b;
        if (z3) {
            bVar.f3061a.b(this);
        }
        if (this.f3061a == null || this.f3063d.d() != 0) {
            return;
        }
        this.f3064e = true;
        cVar.f3067b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z3;
        String f4 = w0.f(this.f3061a == null ? "0" : "" + this.f3061a, " = ");
        if (this.f3062b != 0.0f) {
            f4 = f4 + this.f3062b;
            z3 = true;
        } else {
            z3 = false;
        }
        int d4 = this.f3063d.d();
        for (int i4 = 0; i4 < d4; i4++) {
            f e4 = this.f3063d.e(i4);
            if (e4 != null) {
                float f5 = this.f3063d.f(i4);
                if (f5 != 0.0f) {
                    String fVar = e4.toString();
                    if (!z3) {
                        if (f5 < 0.0f) {
                            f4 = w0.f(f4, "- ");
                            f5 *= -1.0f;
                        }
                        f4 = f5 == 1.0f ? w0.f(f4, fVar) : f4 + f5 + " " + fVar;
                        z3 = true;
                    } else if (f5 > 0.0f) {
                        f4 = w0.f(f4, " + ");
                        if (f5 == 1.0f) {
                        }
                        z3 = true;
                    } else {
                        f4 = w0.f(f4, " - ");
                        f5 *= -1.0f;
                        if (f5 == 1.0f) {
                        }
                        z3 = true;
                    }
                }
            }
        }
        return !z3 ? w0.f(f4, "0.0") : f4;
    }
}
