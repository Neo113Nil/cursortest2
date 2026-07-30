package O;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final A0 f2317a;

    /* renamed from: b, reason: collision with root package name */
    public G.e[] f2318b;

    public s0() {
        this(new A0());
    }

    public final void a() {
        G.e[] eVarArr = this.f2318b;
        if (eVarArr != null) {
            G.e eVar = eVarArr[0];
            G.e eVar2 = eVarArr[1];
            A0 a02 = this.f2317a;
            if (eVar2 == null) {
                eVar2 = a02.f2213a.f(2);
            }
            if (eVar == null) {
                eVar = a02.f2213a.f(1);
            }
            g(G.e.a(eVar, eVar2));
            G.e eVar3 = this.f2318b[com.bumptech.glide.h.o(16)];
            if (eVar3 != null) {
                f(eVar3);
            }
            G.e eVar4 = this.f2318b[com.bumptech.glide.h.o(32)];
            if (eVar4 != null) {
                d(eVar4);
            }
            G.e eVar5 = this.f2318b[com.bumptech.glide.h.o(64)];
            if (eVar5 != null) {
                h(eVar5);
            }
        }
    }

    public abstract A0 b();

    public void c(int i, G.e eVar) {
        if (this.f2318b == null) {
            this.f2318b = new G.e[9];
        }
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i & i4) != 0) {
                this.f2318b[com.bumptech.glide.h.o(i4)] = eVar;
            }
        }
    }

    public abstract void e(G.e eVar);

    public abstract void g(G.e eVar);

    public s0(A0 a02) {
        this.f2317a = a02;
    }

    public void d(G.e eVar) {
    }

    public void f(G.e eVar) {
    }

    public void h(G.e eVar) {
    }
}
