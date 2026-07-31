package G4;

import D3.A;
import D4.f;
import D4.i;
import D4.n;
import D4.q;
import D4.r;
import D4.s;
import Q0.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final A f854d;

    /* renamed from: e, reason: collision with root package name */
    public static final A f855e;

    /* renamed from: a, reason: collision with root package name */
    public final i f856a = new i();

    /* renamed from: b, reason: collision with root package name */
    public Map f857b;

    /* renamed from: c, reason: collision with root package name */
    public int f858c;

    static {
        AtomicInteger atomicInteger = i.f530n;
        f854d = new A(1, false);
        f855e = new A(1, false);
    }

    @Override // D4.f
    public final int a() {
        return this.f858c;
    }

    @Override // D4.f
    public final void c(n nVar) {
        i iVar = this.f856a;
        iVar.f534d = 0;
        iVar.f537g = 0;
        nVar.n(J4.a.f1290a, this.f857b, e.f859a, iVar, f855e);
    }

    public final void d(Collection collection) {
        Map map;
        boolean isEmpty = collection.isEmpty();
        i iVar = this.f856a;
        if (isEmpty) {
            map = Collections.EMPTY_MAP;
        } else {
            A4.b bVar = new A4.b(11);
            A4.b bVar2 = new A4.b(12);
            A a7 = s.f565a;
            Map map2 = (Map) iVar.f541k.a();
            q qVar = (q) iVar.d(s.f565a, new C4.d(8));
            qVar.f557a = map2;
            qVar.f558b = bVar;
            qVar.f559c = bVar2;
            qVar.f560d = iVar;
            collection.forEach(qVar);
            map = map2;
        }
        this.f857b = map;
        D4.b bVar3 = J4.a.f1290a;
        e eVar = e.f859a;
        A a8 = s.f565a;
        int i7 = 0;
        if (!map.isEmpty()) {
            r rVar = (r) iVar.d(f854d, new C4.d(6));
            rVar.f561a = 0;
            rVar.f562b = bVar3.f512c;
            rVar.f563c = eVar;
            rVar.f564d = iVar;
            map.forEach(rVar);
            i7 = rVar.f561a;
        }
        this.f858c = i7;
    }

    public final void e() {
        i iVar = this.f856a;
        iVar.f534d = 0;
        iVar.f535e = 0;
        for (int i7 = 0; i7 < iVar.f538h; i7++) {
            iVar.f536f[i7] = null;
        }
        iVar.f537g = 0;
        iVar.f538h = 0;
        iVar.f539i.f527a = 0;
        iVar.f540j.f527a = 0;
        o oVar = iVar.f541k;
        for (int i8 = 0; i8 < oVar.f2004a; i8++) {
            ((Consumer) oVar.f2007d).accept(((ArrayList) oVar.f2005b).get(i8));
        }
        oVar.f2004a = 0;
        o oVar2 = iVar.f542l;
        for (int i9 = 0; i9 < oVar2.f2004a; i9++) {
            ((Consumer) oVar2.f2007d).accept(((ArrayList) oVar2.f2005b).get(i9));
        }
        oVar2.f2004a = 0;
    }
}
