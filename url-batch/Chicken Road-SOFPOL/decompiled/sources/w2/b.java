package w2;

import a0.g1;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public final a f7843d;

    /* renamed from: a, reason: collision with root package name */
    public f f7840a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f7841b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7842c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f7844e = false;

    public b(g1 g1Var) {
        this.f7843d = new a(this, g1Var);
    }

    public final void a(c cVar, int i) {
        this.f7843d.g(cVar.j(i), 1.0f);
        this.f7843d.g(cVar.j(i), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i) {
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            this.f7841b = i;
        }
        if (z3) {
            this.f7843d.g(fVar, 1.0f);
            this.f7843d.g(fVar2, -1.0f);
            this.f7843d.g(fVar3, -1.0f);
        } else {
            this.f7843d.g(fVar, -1.0f);
            this.f7843d.g(fVar2, 1.0f);
            this.f7843d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i) {
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            this.f7841b = i;
        }
        if (z3) {
            this.f7843d.g(fVar, 1.0f);
            this.f7843d.g(fVar2, -1.0f);
            this.f7843d.g(fVar3, 1.0f);
        } else {
            this.f7843d.g(fVar, -1.0f);
            this.f7843d.g(fVar2, 1.0f);
            this.f7843d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f7840a == null && this.f7841b == 0.0f && this.f7843d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i;
        int d8 = this.f7843d.d();
        f fVar2 = null;
        float f6 = 0.0f;
        for (int i8 = 0; i8 < d8; i8++) {
            float f8 = this.f7843d.f(i8);
            if (f8 < 0.0f) {
                f e8 = this.f7843d.e(i8);
                if ((zArr == null || !zArr[e8.f7866e]) && e8 != fVar && (((i = e8.f7875o) == 3 || i == 4) && f8 < f6)) {
                    f6 = f8;
                    fVar2 = e8;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f7840a;
        if (fVar2 != null) {
            this.f7843d.g(fVar2, -1.0f);
            this.f7840a.f7867f = -1;
            this.f7840a = null;
        }
        float h8 = this.f7843d.h(fVar, true) * (-1.0f);
        this.f7840a = fVar;
        if (h8 == 1.0f) {
            return;
        }
        this.f7841b /= h8;
        a aVar = this.f7843d;
        int i = aVar.f7838h;
        for (int i8 = 0; i != -1 && i8 < aVar.f7831a; i8++) {
            float[] fArr = aVar.f7837g;
            fArr[i] = fArr[i] / h8;
            i = aVar.f7836f[i];
        }
    }

    public final void h(c cVar, f fVar, boolean z3) {
        if (fVar.i) {
            float c8 = this.f7843d.c(fVar);
            this.f7841b = (fVar.f7869h * c8) + this.f7841b;
            this.f7843d.h(fVar, z3);
            if (z3) {
                fVar.b(this);
            }
            if (this.f7843d.d() == 0) {
                this.f7844e = true;
                cVar.f7847b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z3) {
        a aVar = this.f7843d;
        aVar.getClass();
        float c8 = aVar.c(bVar.f7840a);
        aVar.h(bVar.f7840a, z3);
        a aVar2 = bVar.f7843d;
        int d8 = aVar2.d();
        for (int i = 0; i < d8; i++) {
            f e8 = aVar2.e(i);
            aVar.a(e8, aVar2.c(e8) * c8, z3);
        }
        this.f7841b = (bVar.f7841b * c8) + this.f7841b;
        if (z3) {
            bVar.f7840a.b(this);
        }
        if (this.f7840a == null || this.f7843d.d() != 0) {
            return;
        }
        this.f7844e = true;
        cVar.f7847b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z3;
        String str = (this.f7840a == null ? "0" : "" + this.f7840a) + " = ";
        if (this.f7841b != 0.0f) {
            str = str + this.f7841b;
            z3 = true;
        } else {
            z3 = false;
        }
        int d8 = this.f7843d.d();
        for (int i = 0; i < d8; i++) {
            f e8 = this.f7843d.e(i);
            if (e8 != null) {
                float f6 = this.f7843d.f(i);
                if (f6 != 0.0f) {
                    String fVar = e8.toString();
                    if (!z3) {
                        if (f6 < 0.0f) {
                            str = str + "- ";
                            f6 *= -1.0f;
                        }
                        str = f6 == 1.0f ? str + fVar : str + f6 + " " + fVar;
                        z3 = true;
                    } else if (f6 > 0.0f) {
                        str = str + " + ";
                        if (f6 == 1.0f) {
                        }
                        z3 = true;
                    } else {
                        str = str + " - ";
                        f6 *= -1.0f;
                        if (f6 == 1.0f) {
                        }
                        z3 = true;
                    }
                }
            }
        }
        if (z3) {
            return str;
        }
        return str + "0.0";
    }
}
