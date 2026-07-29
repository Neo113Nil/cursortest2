package android.support.constraint.a;

import java.util.Arrays;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public class g {
    private static int i = 1;

    /* renamed from: d, reason: collision with root package name */
    public float f1447d;
    a f;
    private String j;

    /* renamed from: a, reason: collision with root package name */
    public int f1444a = -1;

    /* renamed from: b, reason: collision with root package name */
    int f1445b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f1446c = 0;
    float[] e = new float[6];
    b[] g = new b[8];
    int h = 0;

    /* compiled from: SolverVariable.java */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public g(a aVar) {
        this.f = aVar;
    }

    void a() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.e[i2] = 0.0f;
        }
    }

    String b() {
        String str = this + "[";
        for (int i2 = 0; i2 < this.e.length; i2++) {
            String str2 = str + this.e[i2];
            str = i2 < this.e.length - 1 ? str2 + ", " : str2 + "] ";
        }
        return str;
    }

    void a(b bVar) {
        for (int i2 = 0; i2 < this.h; i2++) {
            if (this.g[i2] == bVar) {
                return;
            }
        }
        if (this.h >= this.g.length) {
            this.g = (b[]) Arrays.copyOf(this.g, this.g.length * 2);
        }
        this.g[this.h] = bVar;
        this.h++;
    }

    void b(b bVar) {
        for (int i2 = 0; i2 < this.h; i2++) {
            if (this.g[i2] == bVar) {
                for (int i3 = 0; i3 < (this.h - i2) - 1; i3++) {
                    int i4 = i2 + i3;
                    this.g[i4] = this.g[i4 + 1];
                }
                this.h--;
                return;
            }
        }
    }

    public void c() {
        this.j = null;
        this.f = a.UNKNOWN;
        this.f1446c = 0;
        this.f1444a = -1;
        this.f1445b = -1;
        this.f1447d = 0.0f;
        this.h = 0;
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    public String toString() {
        return "" + this.j;
    }
}
