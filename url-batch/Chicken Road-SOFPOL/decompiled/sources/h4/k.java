package h4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l1.n;
import l1.o;
import l1.p;
import l1.q;
import l1.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3194a;

    public k(int i) {
        switch (i) {
            case 1:
                this.f3194a = new ArrayList(32);
                break;
            default:
                this.f3194a = new ArrayList();
                new HashMap();
                new HashMap();
                break;
        }
    }

    public void a() {
        this.f3194a.add(l1.h.f4778b);
    }

    public void b(float f6, float f8, float f9, float f10, float f11, float f12) {
        this.f3194a.add(new l1.i(f6, f8, f9, f10, f11, f12));
    }

    public void c(float f6, float f8, float f9, float f10, float f11, float f12) {
        this.f3194a.add(new n(f6, f8, f9, f10, f11, f12));
    }

    public List d() {
        ArrayList arrayList;
        if (this.f3194a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f3194a) {
            arrayList = new ArrayList(this.f3194a);
        }
        return arrayList;
    }

    public void e(float f6) {
        this.f3194a.add(new o(f6));
    }

    public void f(float f6, float f8) {
        this.f3194a.add(new l1.k(f6, f8));
    }

    public void g(float f6, float f8) {
        this.f3194a.add(new p(f6, f8));
    }

    public void h(float f6, float f8) {
        this.f3194a.add(new l1.l(f6, f8));
    }

    public void i(float f6, float f8, float f9, float f10) {
        this.f3194a.add(new q(f6, f8, f9, f10));
    }

    public void j(float f6) {
        this.f3194a.add(new r(f6));
    }
}
