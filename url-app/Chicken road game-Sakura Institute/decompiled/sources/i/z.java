package i;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4830f;

    /* renamed from: g, reason: collision with root package name */
    public int f4831g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4832h;

    /* renamed from: i, reason: collision with root package name */
    public Object f4833i;

    public z(Object obj, Map map) {
        this.f4830f = 1;
        this.f4832h = obj;
        this.f4833i = map;
    }

    public void a() {
        boolean z8;
        Object next;
        Iterator it = (Iterator) this.f4832h;
        do {
            z8 = false;
            if (!it.hasNext()) {
                this.f4831g = 0;
                return;
            } else {
                next = it.next();
                if (next == null) {
                    z8 = true;
                }
            }
        } while (z8);
        this.f4833i = next;
        this.f4831g = 1;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [q6.a, r6.l] */
    public void b() {
        Object f9;
        y6.e eVar = (y6.e) this.f4833i;
        if (this.f4831g == -2) {
            f9 = eVar.f9907b.a();
        } else {
            q6.c cVar = (q6.c) eVar.f9908c;
            Object obj = this.f4832h;
            r6.k.c(obj);
            f9 = cVar.f(obj);
        }
        this.f4832h = f9;
        this.f4831g = f9 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4830f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((y6.g) this.f4832h).hasNext();
            case 1:
                return this.f4831g < ((Map) this.f4833i).size();
            case 2:
                if (this.f4831g == -1) {
                    a();
                }
                return this.f4831g == 1;
            default:
                if (this.f4831g < 0) {
                    b();
                }
                return this.f4831g == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4830f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((y6.g) this.f4832h).next();
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f4832h;
                this.f4831g++;
                Object obj2 = ((Map) this.f4833i).get(obj);
                if (obj2 != null) {
                    this.f4832h = ((m0.a) obj2).f6290b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 2:
                if (this.f4831g == -1) {
                    a();
                }
                if (this.f4831g == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f4833i;
                this.f4833i = null;
                this.f4831g = -1;
                return obj3;
            default:
                if (this.f4831g < 0) {
                    b();
                }
                if (this.f4831g == 0) {
                    throw new NoSuchElementException();
                }
                Object obj4 = this.f4832h;
                r6.k.d(obj4, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f4831g = -1;
                return obj4;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4830f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f4831g;
                if (i7 != -1) {
                    ((b0) this.f4833i).k(i7);
                    this.f4831g = -1;
                    return;
                }
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(e6.s sVar) {
        this.f4830f = 2;
        this.f4832h = new y6.l((y6.k) sVar.f2824b);
        this.f4831g = -1;
    }

    public z(y6.e eVar) {
        this.f4830f = 3;
        this.f4833i = eVar;
        this.f4831g = -2;
    }

    public z(b0 b0Var) {
        this.f4830f = 0;
        this.f4833i = b0Var;
        this.f4831g = -1;
        this.f4832h = u3.r.j(new y(b0Var, this, null));
    }
}
