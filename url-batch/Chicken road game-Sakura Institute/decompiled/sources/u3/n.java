package u3;

import com.android.installreferrer.api.InstallReferrerClient;
import g2.c0;
import java.util.List;
import l.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9009g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f9010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9011i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f9012j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list, t3.h hVar, boolean z8) {
        super(1);
        this.f9011i = hVar;
        this.f9010h = z8;
        this.f9012j = list;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = this.f9009g;
        Object obj2 = this.f9012j;
        final boolean z8 = this.f9010h;
        Object obj3 = this.f9011i;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                final List list = (List) obj2;
                final t3.h hVar = (t3.h) obj3;
                androidx.lifecycle.t tVar = new androidx.lifecycle.t() { // from class: u3.m
                    @Override // androidx.lifecycle.t
                    public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
                        boolean z9 = z8;
                        List list2 = list;
                        t3.h hVar2 = hVar;
                        if (z9 && !list2.contains(hVar2)) {
                            list2.add(hVar2);
                        }
                        if (nVar == androidx.lifecycle.n.ON_START && !list2.contains(hVar2)) {
                            list2.add(hVar2);
                        }
                        if (nVar == androidx.lifecycle.n.ON_STOP) {
                            list2.remove(hVar2);
                        }
                    }
                };
                hVar.f8798m.a(tVar);
                return new j0(hVar, 8, tVar);
            default:
                a2.g gVar = (a2.g) obj;
                w.j0 j0Var = (w.j0) obj3;
                if (!z8) {
                    return Boolean.FALSE;
                }
                c0 c0Var = j0Var.f9259e;
                w.p pVar = j0Var.f9274t;
                d6.z zVar = null;
                if (c0Var != null) {
                    g2.w n8 = j0Var.f9258d.n(e6.m.X(new g2.k(), new g2.a(gVar, 1)));
                    c0Var.a(null, n8);
                    pVar.f(n8);
                    zVar = d6.z.f2639a;
                }
                if (zVar == null) {
                    g2.w wVar = (g2.w) obj2;
                    a2.g gVar2 = wVar.f4065a;
                    long j8 = wVar.f4066b;
                    String str = gVar2.f373f;
                    int i8 = a2.j0.f407c;
                    int i9 = (int) (j8 >> 32);
                    int i10 = (int) (j8 & 4294967295L);
                    r6.k.f(str, "<this>");
                    r6.k.f(gVar, "replacement");
                    if (i10 < i9) {
                        throw new IndexOutOfBoundsException("End index (" + i10 + ") is less than start index (" + i9 + ").");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, i9);
                    sb.append((CharSequence) gVar);
                    sb.append((CharSequence) str, i10, str.length());
                    String obj4 = sb.toString();
                    int length = gVar.f373f.length() + i9;
                    pVar.f(new g2.w(4, r4.a.h(length, length), obj4));
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z8, w.j0 j0Var, y1.i iVar, g2.w wVar) {
        super(1);
        this.f9010h = z8;
        this.f9011i = j0Var;
        this.f9012j = wVar;
    }
}
