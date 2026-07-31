package u1;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v implements x0 {

    /* renamed from: d, reason: collision with root package name */
    public r2.l f7282d = r2.l.f6530e;

    /* renamed from: e, reason: collision with root package name */
    public float f7283e;

    /* renamed from: f, reason: collision with root package name */
    public float f7284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f7285g;

    public v(a0 a0Var) {
        this.f7285g = a0Var;
    }

    @Override // u1.g0
    public final f0 J(int i, int i8, Map map, p6.c cVar, p6.c cVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i8) != 0) {
            t1.a.b("Size(" + i + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new u(i, i8, map, cVar, this, this.f7285g, cVar2);
    }

    @Override // r2.c
    public final float b() {
        return this.f7283e;
    }

    @Override // u1.g0
    public final r2.l getLayoutDirection() {
        return this.f7282d;
    }

    @Override // r2.c
    public final float i() {
        return this.f7284f;
    }

    @Override // u1.g0
    public final boolean p() {
        w1.b0 b0Var = this.f7285g.f7169d.G.f7689d;
        return b0Var == w1.b0.f7593g || b0Var == w1.b0.f7591e;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    @Override // u1.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List z(Object obj, p6.e eVar) {
        Object obj2;
        a0 a0Var = this.f7285g;
        a0Var.e();
        w1.f0 f0Var = a0Var.f7169d;
        w1.b0 b0Var = f0Var.G.f7689d;
        w1.b0 b0Var2 = w1.b0.f7592f;
        w1.b0 b0Var3 = w1.b0.f7590d;
        if (b0Var != b0Var3 && b0Var != b0Var2 && b0Var != w1.b0.f7591e && b0Var != w1.b0.f7593g) {
            t1.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        o.j0 j0Var = a0Var.f7174j;
        Object g3 = j0Var.g(obj);
        if (g3 == null) {
            g3 = (w1.f0) a0Var.f7177m.k(obj);
            if (g3 != null) {
                if (a0Var.f7182r <= 0) {
                    t1.a.b("Check failed.");
                }
                a0Var.f7182r--;
            } else {
                g3 = a0Var.i(obj);
                if (g3 == null) {
                    int i = a0Var.f7172g;
                    w1.f0 f0Var2 = new w1.f0(2);
                    f0Var.f7652r = true;
                    f0Var.z(i, f0Var2);
                    f0Var.f7652r = false;
                    g3 = f0Var2;
                }
            }
            j0Var.m(obj, g3);
        }
        w1.f0 f0Var3 = (w1.f0) g3;
        List n6 = f0Var.n();
        int i8 = a0Var.f7172g;
        if (i8 >= 0) {
            o0.b bVar = (o0.b) n6;
            if (i8 < bVar.f5572d.f5580f) {
                obj2 = bVar.get(i8);
                if (obj2 != f0Var3) {
                    int i9 = ((o0.b) f0Var.n()).f5572d.i(f0Var3);
                    if (i9 < a0Var.f7172g) {
                        t1.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                    }
                    int i10 = a0Var.f7172g;
                    if (i10 != i9) {
                        f0Var.f7652r = true;
                        f0Var.K(i9, i10, 1);
                        f0Var.f7652r = false;
                    }
                }
                a0Var.f7172g++;
                a0Var.h(f0Var3, obj, false, eVar);
                return (b0Var != b0Var3 || b0Var == b0Var2) ? f0Var3.G.f7700p.Z() : f0Var3.l();
            }
        }
        obj2 = null;
        if (obj2 != f0Var3) {
        }
        a0Var.f7172g++;
        a0Var.h(f0Var3, obj, false, eVar);
        if (b0Var != b0Var3) {
        }
    }
}
