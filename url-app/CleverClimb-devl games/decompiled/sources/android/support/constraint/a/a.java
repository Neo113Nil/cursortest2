package android.support.constraint.a;

import android.support.constraint.a.g;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private final b f1389b;

    /* renamed from: c, reason: collision with root package name */
    private final c f1390c;

    /* renamed from: a, reason: collision with root package name */
    int f1388a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f1391d = 8;
    private g e = null;
    private int[] f = new int[this.f1391d];
    private int[] g = new int[this.f1391d];
    private float[] h = new float[this.f1391d];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    a(b bVar, c cVar) {
        this.f1389b = bVar;
        this.f1390c = cVar;
    }

    public final void a(g gVar, float f) {
        if (f == 0.0f) {
            a(gVar);
            return;
        }
        if (this.i == -1) {
            this.i = 0;
            this.h[this.i] = f;
            this.f[this.i] = gVar.f1444a;
            this.g[this.i] = -1;
            this.f1388a++;
            if (this.k) {
                return;
            }
            this.j++;
            return;
        }
        int i = this.i;
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.f1388a; i3++) {
            if (this.f[i] == gVar.f1444a) {
                this.h[i] = f;
                return;
            }
            if (this.f[i] < gVar.f1444a) {
                i2 = i;
            }
            i = this.g[i];
        }
        int i4 = this.j + 1;
        if (this.k) {
            if (this.f[this.j] == -1) {
                i4 = this.j;
            } else {
                i4 = this.f.length;
            }
        }
        if (i4 >= this.f.length && this.f1388a < this.f.length) {
            int i5 = 0;
            while (true) {
                if (i5 >= this.f.length) {
                    break;
                }
                if (this.f[i5] == -1) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
        }
        if (i4 >= this.f.length) {
            i4 = this.f.length;
            this.f1391d *= 2;
            this.k = false;
            this.j = i4 - 1;
            this.h = Arrays.copyOf(this.h, this.f1391d);
            this.f = Arrays.copyOf(this.f, this.f1391d);
            this.g = Arrays.copyOf(this.g, this.f1391d);
        }
        this.f[i4] = gVar.f1444a;
        this.h[i4] = f;
        if (i2 != -1) {
            this.g[i4] = this.g[i2];
            this.g[i2] = i4;
        } else {
            this.g[i4] = this.i;
            this.i = i4;
        }
        this.f1388a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f1388a >= this.f.length) {
            this.k = true;
        }
    }

    public final void b(g gVar, float f) {
        if (f == 0.0f) {
            return;
        }
        if (this.i == -1) {
            this.i = 0;
            this.h[this.i] = f;
            this.f[this.i] = gVar.f1444a;
            this.g[this.i] = -1;
            this.f1388a++;
            if (this.k) {
                return;
            }
            this.j++;
            return;
        }
        int i = this.i;
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.f1388a; i3++) {
            int i4 = this.f[i];
            if (i4 == gVar.f1444a) {
                float[] fArr = this.h;
                fArr[i] = fArr[i] + f;
                if (this.h[i] == 0.0f) {
                    if (i == this.i) {
                        this.i = this.g[i];
                    } else {
                        this.g[i2] = this.g[i];
                    }
                    this.f1390c.f1436c[i4].b(this.f1389b);
                    if (this.k) {
                        this.j = i;
                    }
                    this.f1388a--;
                    return;
                }
                return;
            }
            if (this.f[i] < gVar.f1444a) {
                i2 = i;
            }
            i = this.g[i];
        }
        int i5 = this.j + 1;
        if (this.k) {
            if (this.f[this.j] == -1) {
                i5 = this.j;
            } else {
                i5 = this.f.length;
            }
        }
        if (i5 >= this.f.length && this.f1388a < this.f.length) {
            int i6 = 0;
            while (true) {
                if (i6 >= this.f.length) {
                    break;
                }
                if (this.f[i6] == -1) {
                    i5 = i6;
                    break;
                }
                i6++;
            }
        }
        if (i5 >= this.f.length) {
            i5 = this.f.length;
            this.f1391d *= 2;
            this.k = false;
            this.j = i5 - 1;
            this.h = Arrays.copyOf(this.h, this.f1391d);
            this.f = Arrays.copyOf(this.f, this.f1391d);
            this.g = Arrays.copyOf(this.g, this.f1391d);
        }
        this.f[i5] = gVar.f1444a;
        this.h[i5] = f;
        if (i2 != -1) {
            this.g[i5] = this.g[i2];
            this.g[i2] = i5;
        } else {
            this.g[i5] = this.i;
            this.i = i5;
        }
        this.f1388a++;
        if (!this.k) {
            this.j++;
        }
        if (this.j >= this.f.length) {
            this.k = true;
            this.j = this.f.length - 1;
        }
    }

    public final float a(g gVar) {
        if (this.e == gVar) {
            this.e = null;
        }
        if (this.i == -1) {
            return 0.0f;
        }
        int i = this.i;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1388a) {
            int i4 = this.f[i];
            if (i4 == gVar.f1444a) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    this.g[i3] = this.g[i];
                }
                this.f1390c.f1436c[i4].b(this.f1389b);
                this.f1388a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    public final void a() {
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f1388a = 0;
    }

    final boolean b(g gVar) {
        if (this.i == -1) {
            return false;
        }
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1388a; i2++) {
            if (this.f[i] == gVar.f1444a) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    void b() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1388a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    void a(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1388a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    void a(b bVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1388a; i2++) {
            this.f1390c.f1436c[this.f[i]].a(bVar);
            i = this.g[i];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    g c() {
        int i = this.i;
        g gVar = null;
        g gVar2 = null;
        for (int i2 = 0; i != -1 && i2 < this.f1388a; i2++) {
            float f = this.h[i];
            if (f < 0.0f) {
                if (f > -0.001f) {
                    this.h[i] = 0.0f;
                    f = 0.0f;
                }
                if (f == 0.0f) {
                    g gVar3 = this.f1390c.f1436c[this.f[i]];
                    if (gVar3.f == g.a.UNRESTRICTED) {
                        if (f < 0.0f) {
                            return gVar3;
                        }
                        if (gVar == null) {
                            gVar = gVar3;
                        }
                    } else if (f < 0.0f && (gVar2 == null || gVar3.f1446c < gVar2.f1446c)) {
                        gVar2 = gVar3;
                    }
                }
                i = this.g[i];
            } else {
                if (f < 0.001f) {
                    this.h[i] = 0.0f;
                    f = 0.0f;
                }
                if (f == 0.0f) {
                }
                i = this.g[i];
            }
        }
        return gVar != null ? gVar : gVar2;
    }

    void a(b bVar, b bVar2) {
        int i = this.i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f1388a; i2++) {
                if (this.f[i] == bVar2.f1430a.f1444a) {
                    float f = this.h[i];
                    a(bVar2.f1430a);
                    a aVar = bVar2.f1433d;
                    int i3 = aVar.i;
                    for (int i4 = 0; i3 != -1 && i4 < aVar.f1388a; i4++) {
                        b(this.f1390c.f1436c[aVar.f[i3]], aVar.h[i3] * f);
                        i3 = aVar.g[i3];
                    }
                    bVar.f1431b += bVar2.f1431b * f;
                    bVar2.f1430a.b(bVar);
                    i = this.i;
                } else {
                    i = this.g[i];
                }
            }
            return;
        }
    }

    void a(b bVar, b[] bVarArr) {
        int i = this.i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f1388a; i2++) {
                g gVar = this.f1390c.f1436c[this.f[i]];
                if (gVar.f1445b != -1) {
                    float f = this.h[i];
                    a(gVar);
                    b bVar2 = bVarArr[gVar.f1445b];
                    if (!bVar2.e) {
                        a aVar = bVar2.f1433d;
                        int i3 = aVar.i;
                        for (int i4 = 0; i3 != -1 && i4 < aVar.f1388a; i4++) {
                            b(this.f1390c.f1436c[aVar.f[i3]], aVar.h[i3] * f);
                            i3 = aVar.g[i3];
                        }
                    }
                    bVar.f1431b += bVar2.f1431b * f;
                    bVar2.f1430a.b(bVar);
                    i = this.i;
                } else {
                    i = this.g[i];
                }
            }
            return;
        }
    }

    final g a(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1388a; i3++) {
            if (i3 == i) {
                return this.f1390c.f1436c[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    final float b(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1388a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    public final float c(g gVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1388a; i2++) {
            if (this.f[i] == gVar.f1444a) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    public String toString() {
        String str = "";
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1388a; i2++) {
            str = ((str + " -> ") + this.h[i] + " : ") + this.f1390c.f1436c[this.f[i]];
            i = this.g[i];
        }
        return str;
    }
}
