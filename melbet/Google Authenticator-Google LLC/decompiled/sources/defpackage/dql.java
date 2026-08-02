package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dql {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public dql(dqm dqmVar) {
        this.a = dqmVar.a;
        this.b = dqmVar.b;
        this.c = dqmVar.c;
        this.d = dqmVar.d;
        this.e = dqmVar.e;
        this.f = dqmVar.f;
        this.g = dqmVar.g;
        this.h = dqmVar.h;
    }

    private final int f(int i, int i2, int i3) {
        return i >= i3 ? this.f : i >= i2 ? this.g : this.h;
    }

    private final int g(int i, int i2, int i3) {
        return i >= i3 ? this.d : i >= i2 ? this.c : this.e;
    }

    public final int a(int i) {
        int e = e(i);
        int f = f(i, b(this.a), b(this.b));
        return ((i - (e + e)) - (f + f)) - 2;
    }

    public final int b(int i) {
        int d = d(i);
        int c = c(i);
        return i + d + d + c + c + 2;
    }

    public final int c(int i) {
        return f(i, this.a, this.b);
    }

    public final int d(int i) {
        return g(i, this.a, this.b);
    }

    public final int e(int i) {
        return g(i, b(this.a), b(this.b));
    }
}
