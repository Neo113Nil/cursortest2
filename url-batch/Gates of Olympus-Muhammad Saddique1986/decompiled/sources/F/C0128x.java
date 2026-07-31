package F;

import h2.AbstractC0508a;
import java.util.List;
import java.util.NoSuchElementException;
import r.InterfaceC0859f;
import r.InterfaceC0860g;
import r0.AbstractC0893O;
import r0.AbstractC0906c;
import r0.C0915l;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;

/* renamed from: F.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128x implements InterfaceC0885G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0120t f1875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0859f f1876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0860g f1877c;

    public C0128x(C0120t c0120t, InterfaceC0859f interfaceC0859f, InterfaceC0860g interfaceC0860g) {
        this.f1875a = c0120t;
        this.f1876b = interfaceC0859f;
        this.f1877c = interfaceC0860g;
    }

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        int h3;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC0884F interfaceC0884F = (InterfaceC0884F) list.get(i3);
            if (f2.j.a(androidx.compose.ui.layout.a.a(interfaceC0884F), "navigationIcon")) {
                AbstractC0893O b3 = interfaceC0884F.b(O0.a.a(j3, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    InterfaceC0884F interfaceC0884F2 = (InterfaceC0884F) list.get(i4);
                    if (f2.j.a(androidx.compose.ui.layout.a.a(interfaceC0884F2), "actionIcons")) {
                        AbstractC0893O b4 = interfaceC0884F2.b(O0.a.a(j3, 0, 0, 0, 0, 14));
                        if (O0.a.h(j3) == Integer.MAX_VALUE) {
                            h3 = O0.a.h(j3);
                        } else {
                            h3 = (O0.a.h(j3) - b3.f8126d) - b4.f8126d;
                            if (h3 < 0) {
                                h3 = 0;
                            }
                        }
                        int i5 = h3;
                        int size3 = list.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            InterfaceC0884F interfaceC0884F3 = (InterfaceC0884F) list.get(i6);
                            if (f2.j.a(androidx.compose.ui.layout.a.a(interfaceC0884F3), "title")) {
                                AbstractC0893O b5 = interfaceC0884F3.b(O0.a.a(j3, 0, i5, 0, 0, 12));
                                C0915l c0915l = AbstractC0906c.f8151b;
                                int W2 = b5.W(c0915l) != Integer.MIN_VALUE ? b5.W(c0915l) : 0;
                                getClass();
                                int g3 = O0.a.g(j3) == Integer.MAX_VALUE ? O0.a.g(j3) : O0.a.g(j3) + (Float.isNaN(0.0f) ? 0 : AbstractC0508a.Q(0.0f));
                                return interfaceC0887I.i0(O0.a.h(j3), g3, S1.v.f4321d, new C0126w(b3, g3, b5, this.f1876b, j3, b4, interfaceC0887I, this.f1877c, W2));
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
