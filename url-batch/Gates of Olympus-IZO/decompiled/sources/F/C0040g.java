package F;

import java.util.List;
import java.util.NoSuchElementException;
import r.InterfaceC0808e;
import r.InterfaceC0809f;
import r0.AbstractC0830c;
import r0.C0837j;
import r0.InterfaceC0827A;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040g implements InterfaceC0827A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0030b f1237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0808e f1238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0809f f1239c;

    public C0040g(C0030b c0030b, InterfaceC0808e interfaceC0808e, InterfaceC0809f interfaceC0809f) {
        this.f1237a = c0030b;
        this.f1238b = interfaceC0808e;
        this.f1239c = interfaceC0809f;
    }

    @Override // r0.InterfaceC0827A
    public final r0.B f(t0.O o3, List list, long j3) {
        int h3;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            r0.z zVar = (r0.z) list.get(i3);
            if (Z1.i.a(androidx.compose.ui.layout.a.a(zVar), "navigationIcon")) {
                r0.H b2 = zVar.b(M0.a.a(j3, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    r0.z zVar2 = (r0.z) list.get(i4);
                    if (Z1.i.a(androidx.compose.ui.layout.a.a(zVar2), "actionIcons")) {
                        r0.H b3 = zVar2.b(M0.a.a(j3, 0, 0, 0, 0, 14));
                        if (M0.a.h(j3) == Integer.MAX_VALUE) {
                            h3 = M0.a.h(j3);
                        } else {
                            h3 = (M0.a.h(j3) - b2.f7114d) - b3.f7114d;
                            if (h3 < 0) {
                                h3 = 0;
                            }
                        }
                        int i5 = h3;
                        int size3 = list.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            r0.z zVar3 = (r0.z) list.get(i6);
                            if (Z1.i.a(androidx.compose.ui.layout.a.a(zVar3), "title")) {
                                r0.H b4 = zVar3.b(M0.a.a(j3, 0, i5, 0, 0, 12));
                                C0837j c0837j = AbstractC0830c.f7139b;
                                int L2 = b4.L(c0837j) != Integer.MIN_VALUE ? b4.L(c0837j) : 0;
                                getClass();
                                int g3 = M0.a.g(j3) == Integer.MAX_VALUE ? M0.a.g(j3) : M0.a.g(j3) + (Float.isNaN(0.0f) ? 0 : M1.B.M(0.0f));
                                return o3.Y(M0.a.h(j3), g3, M1.v.f2804d, new C0038f(b2, g3, b4, this.f1238b, j3, b3, o3, this.f1239c, L2));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
