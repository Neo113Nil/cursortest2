package u0;

import B0.C0004a;
import a.AbstractC0157a;
import java.util.ArrayList;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0966d extends AbstractC0962b {

    /* renamed from: e, reason: collision with root package name */
    public static C0966d f8316e;

    /* renamed from: c, reason: collision with root package name */
    public B0.z f8317c;

    /* renamed from: d, reason: collision with root package name */
    public z0.n f8318d;

    @Override // u0.AbstractC0962b
    public final int[] a(int i3) {
        int i4;
        if (c().length() <= 0 || i3 >= c().length()) {
            return null;
        }
        try {
            z0.n nVar = this.f8318d;
            if (nVar == null) {
                Z1.i.j("node");
                throw null;
            }
            int round = Math.round(nVar.e().b());
            if (i3 <= 0) {
                i3 = 0;
            }
            B0.z zVar = this.f8317c;
            if (zVar == null) {
                Z1.i.j("layoutResult");
                throw null;
            }
            int a3 = zVar.a(i3);
            B0.z zVar2 = this.f8317c;
            if (zVar2 == null) {
                Z1.i.j("layoutResult");
                throw null;
            }
            float d3 = zVar2.d(a3) + round;
            B0.z zVar3 = this.f8317c;
            if (zVar3 == null) {
                Z1.i.j("layoutResult");
                throw null;
            }
            if (d3 < zVar3.d(zVar3.f395b.f273f - 1)) {
                B0.z zVar4 = this.f8317c;
                if (zVar4 == null) {
                    Z1.i.j("layoutResult");
                    throw null;
                }
                i4 = zVar4.b(d3);
            } else {
                B0.z zVar5 = this.f8317c;
                if (zVar5 == null) {
                    Z1.i.j("layoutResult");
                    throw null;
                }
                i4 = zVar5.f395b.f273f;
            }
            return b(i3, e(i4 - 1, 1) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // u0.AbstractC0962b
    public final int[] d(int i3) {
        int i4;
        if (c().length() <= 0 || i3 <= 0) {
            return null;
        }
        try {
            z0.n nVar = this.f8318d;
            if (nVar == null) {
                Z1.i.j("node");
                throw null;
            }
            int round = Math.round(nVar.e().b());
            int length = c().length();
            if (length <= i3) {
                i3 = length;
            }
            B0.z zVar = this.f8317c;
            if (zVar == null) {
                Z1.i.j("layoutResult");
                throw null;
            }
            int a3 = zVar.a(i3);
            B0.z zVar2 = this.f8317c;
            if (zVar2 == null) {
                Z1.i.j("layoutResult");
                throw null;
            }
            float d3 = zVar2.d(a3) - round;
            if (d3 > 0.0f) {
                B0.z zVar3 = this.f8317c;
                if (zVar3 == null) {
                    Z1.i.j("layoutResult");
                    throw null;
                }
                i4 = zVar3.b(d3);
            } else {
                i4 = 0;
            }
            if (i3 == c().length() && i4 < a3) {
                i4++;
            }
            return b(e(i4, 2), i3);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i3, int i4) {
        B0.z zVar = this.f8317c;
        if (zVar == null) {
            Z1.i.j("layoutResult");
            throw null;
        }
        int c3 = zVar.c(i3);
        B0.z zVar2 = this.f8317c;
        if (zVar2 == null) {
            Z1.i.j("layoutResult");
            throw null;
        }
        if (i4 != zVar2.e(c3)) {
            B0.z zVar3 = this.f8317c;
            if (zVar3 != null) {
                return zVar3.c(i3);
            }
            Z1.i.j("layoutResult");
            throw null;
        }
        B0.z zVar4 = this.f8317c;
        if (zVar4 == null) {
            Z1.i.j("layoutResult");
            throw null;
        }
        B0.j jVar = zVar4.f395b;
        jVar.b(i3);
        ArrayList arrayList = jVar.f275h;
        C0004a c0004a = ((B0.l) arrayList.get(AbstractC0157a.B(i3, arrayList))).f278a;
        return (c0004a.f243d.e(i3 - r6.f281d) + r6.f279b) - 1;
    }
}
