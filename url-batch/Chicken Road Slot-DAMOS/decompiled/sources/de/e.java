package de;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s.f0;
import s.g0;
import s.j0;
import s.k0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3712d;

    /* renamed from: e, reason: collision with root package name */
    public int f3713e;

    /* renamed from: i, reason: collision with root package name */
    public Object f3714i;

    /* renamed from: r, reason: collision with root package name */
    public final Object f3715r;

    public e(k0 k0Var) {
        this.f3712d = 2;
        this.f3715r = k0Var;
        this.f3713e = -1;
        this.f3714i = h.a(new j0(k0Var, this, null));
    }

    public void a() {
        Object invoke;
        int i3 = this.f3713e;
        d dVar = (d) this.f3715r;
        if (i3 == -2) {
            invoke = ((Function0) dVar.f3710b).invoke();
        } else {
            Function1 function1 = dVar.f3711c;
            Object obj = this.f3714i;
            obj.getClass();
            invoke = function1.invoke(obj);
        }
        this.f3714i = invoke;
        this.f3713e = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3712d) {
            case 0:
                if (this.f3713e < 0) {
                    a();
                }
                if (this.f3713e == 1) {
                }
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                if (this.f3713e < ((Map) this.f3715r).size()) {
                }
                break;
        }
        return ((f) this.f3714i).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3712d) {
            case 0:
                if (this.f3713e < 0) {
                    a();
                }
                if (this.f3713e == 0) {
                    i0.c();
                    return null;
                }
                Object obj = this.f3714i;
                obj.getClass();
                this.f3713e = -1;
                return obj;
            case 1:
                return ((f) this.f3714i).next();
            case 2:
                return ((f) this.f3714i).next();
            default:
                if (!hasNext()) {
                    i0.c();
                    return null;
                }
                Object obj2 = this.f3714i;
                this.f3713e++;
                Object obj3 = ((Map) this.f3715r).get(obj2);
                if (obj3 != null) {
                    this.f3714i = ((v0.a) obj3).f9928b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3712d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i3 = this.f3713e;
                if (i3 != -1) {
                    ((g0) this.f3715r).f8310e.h(i3);
                    this.f3713e = -1;
                    return;
                }
                return;
            case 2:
                int i10 = this.f3713e;
                if (i10 != -1) {
                    ((k0) this.f3715r).f8342e.l(i10);
                    this.f3713e = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(d dVar) {
        this.f3712d = 0;
        this.f3715r = dVar;
        this.f3713e = -2;
    }

    public e(Object obj, Map map) {
        this.f3712d = 3;
        this.f3714i = obj;
        this.f3715r = map;
    }

    public e(g0 g0Var) {
        this.f3712d = 1;
        this.f3715r = g0Var;
        this.f3713e = -1;
        this.f3714i = h.a(new f0(g0Var, this, null));
    }
}
