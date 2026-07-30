package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wu0 implements Iterator, k71 {
    public final /* synthetic */ int m;
    public int n;
    public Object o;
    public final Object p;

    public wu0(wn1 wn1Var) {
        this.m = 2;
        this.p = wn1Var;
        this.n = -1;
        this.o = yi2.a(new vn1(wn1Var, this, null));
    }

    public void a() {
        Object invoke;
        int i = this.n;
        ps2 ps2Var = (ps2) this.p;
        if (i == -2) {
            invoke = ((Function0) ps2Var.b).invoke();
        } else {
            Function1 function1 = ps2Var.c;
            Object obj = this.o;
            obj.getClass();
            invoke = function1.invoke(obj);
        }
        this.o = invoke;
        this.n = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                if (this.n < 0) {
                    a();
                }
                return this.n == 1;
            case 1:
                return ((wi2) this.o).hasNext();
            case 2:
                return ((wi2) this.o).hasNext();
            default:
                return this.n < ((Map) this.p).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.m) {
            case 0:
                if (this.n < 0) {
                    a();
                }
                if (this.n == 0) {
                    b71.f();
                    return null;
                }
                Object obj2 = this.o;
                obj2.getClass();
                this.n = -1;
                return obj2;
            case 1:
                return ((wi2) this.o).next();
            case 2:
                return ((wi2) this.o).next();
            default:
                if (hasNext()) {
                    obj = this.o;
                    this.n++;
                    Object obj3 = ((Map) this.p).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.o = ((je1) obj3).b;
                } else {
                    b71.f();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.m;
        Object obj = this.p;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.n;
                if (i2 != -1) {
                    ((nn1) obj).n.h(i2);
                    this.n = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.n;
                if (i3 != -1) {
                    ((wn1) obj).n.l(i3);
                    this.n = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public wu0(ps2 ps2Var) {
        this.m = 0;
        this.p = ps2Var;
        this.n = -2;
    }

    public wu0(Map map, Object obj) {
        this.m = 3;
        this.o = obj;
        this.p = map;
    }

    public wu0(nn1 nn1Var) {
        this.m = 1;
        this.p = nn1Var;
        this.n = -1;
        this.o = yi2.a(new mn1(nn1Var, this, null));
    }
}
