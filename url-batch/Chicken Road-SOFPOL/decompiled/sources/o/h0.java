package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 implements Iterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5474d;

    /* renamed from: e, reason: collision with root package name */
    public int f5475e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5476f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5477g;

    public h0(Object obj, Map map) {
        this.f5474d = 2;
        this.f5476f = obj;
        this.f5477g = map;
    }

    public void a() {
        Object i;
        x6.d dVar = (x6.d) this.f5477g;
        if (this.f5475e == -2) {
            i = ((p6.a) dVar.f8670b).b();
        } else {
            p6.c cVar = dVar.f8671c;
            Object obj = this.f5476f;
            q6.i.b(obj);
            i = cVar.i(obj);
        }
        this.f5476f = i;
        this.f5475e = i == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5474d) {
            case 0:
                break;
            case 1:
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.f5475e < ((Map) this.f5477g).size()) {
                }
                break;
            default:
                if (this.f5475e < 0) {
                    a();
                }
                if (this.f5475e == 1) {
                }
                break;
        }
        return ((x6.f) this.f5476f).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5474d) {
            case 0:
                return ((x6.f) this.f5476f).next();
            case 1:
                return ((x6.f) this.f5476f).next();
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f5476f;
                this.f5475e++;
                Object obj2 = ((Map) this.f5477g).get(obj);
                if (obj2 != null) {
                    this.f5476f = ((s0.a) obj2).f6685b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            default:
                if (this.f5475e < 0) {
                    a();
                }
                if (this.f5475e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f5476f;
                q6.i.c(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f5475e = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5474d) {
            case 0:
                int i = this.f5475e;
                if (i != -1) {
                    ((i0) this.f5477g).f5480e.h(i);
                    this.f5475e = -1;
                    return;
                }
                return;
            case 1:
                int i8 = this.f5475e;
                if (i8 != -1) {
                    ((m0) this.f5477g).f5512e.m(i8);
                    this.f5475e = -1;
                    return;
                }
                return;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h0(x6.d dVar) {
        this.f5474d = 3;
        this.f5477g = dVar;
        this.f5475e = -2;
    }

    public h0(m0 m0Var) {
        this.f5474d = 1;
        this.f5477g = m0Var;
        this.f5475e = -1;
        this.f5476f = r2.r.E(new l0(m0Var, this, null));
    }

    public h0(i0 i0Var) {
        this.f5474d = 0;
        this.f5477g = i0Var;
        this.f5475e = -1;
        this.f5476f = r2.r.E(new g0(i0Var, this, null));
    }
}
