package N1;

import a2.InterfaceC0184a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends f implements Iterator, InterfaceC0184a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2868h;

    public d(g gVar, int i3) {
        this.f2868h = i3;
        Z1.i.f(gVar, "map");
        this.f2874g = gVar;
        this.f2872e = -1;
        this.f2873f = gVar.f2883k;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2868h) {
            case 0:
                b();
                int i3 = this.f2871d;
                g gVar = (g) this.f2874g;
                if (i3 >= gVar.f2881i) {
                    throw new NoSuchElementException();
                }
                this.f2871d = i3 + 1;
                this.f2872e = i3;
                e eVar = new e(gVar, i3);
                c();
                return eVar;
            case 1:
                b();
                int i4 = this.f2871d;
                g gVar2 = (g) this.f2874g;
                if (i4 >= gVar2.f2881i) {
                    throw new NoSuchElementException();
                }
                this.f2871d = i4 + 1;
                this.f2872e = i4;
                Object obj = gVar2.f2876d[i4];
                c();
                return obj;
            default:
                b();
                int i5 = this.f2871d;
                g gVar3 = (g) this.f2874g;
                if (i5 >= gVar3.f2881i) {
                    throw new NoSuchElementException();
                }
                this.f2871d = i5 + 1;
                this.f2872e = i5;
                Object[] objArr = gVar3.f2877e;
                Z1.i.c(objArr);
                Object obj2 = objArr[this.f2872e];
                c();
                return obj2;
        }
    }
}
