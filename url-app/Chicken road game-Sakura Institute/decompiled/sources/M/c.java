package M;

import T2.h;
import T2.j;
import T2.s;
import i.C0661B;
import i.z;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3535d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3536e;

    /* renamed from: i, reason: collision with root package name */
    public int f3537i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3538j;

    public c(Object obj, Map map) {
        this.f3535d = 0;
        this.f3536e = obj;
        this.f3538j = map;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [M2.p, kotlin.jvm.functions.Function0] */
    public void b() {
        Object invoke;
        int i2 = this.f3537i;
        s sVar = (s) this.f3538j;
        if (i2 == -2) {
            invoke = sVar.f4056c.invoke();
        } else {
            Function1 function1 = (Function1) sVar.f4055b;
            Object obj = this.f3536e;
            Intrinsics.c(obj);
            invoke = function1.invoke(obj);
        }
        this.f3536e = invoke;
        this.f3537i = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3535d) {
            case 0:
                return this.f3537i < ((Map) this.f3538j).size();
            case 1:
                if (this.f3537i < 0) {
                    b();
                }
                return this.f3537i == 1;
            default:
                return ((h) this.f3536e).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3535d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f3536e;
                this.f3537i++;
                Object obj2 = ((Map) this.f3538j).get(obj);
                if (obj2 != null) {
                    this.f3536e = ((a) obj2).f3530b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                if (this.f3537i < 0) {
                    b();
                }
                if (this.f3537i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f3536e;
                Intrinsics.d(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f3537i = -1;
                return obj3;
            default:
                return ((h) this.f3536e).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3535d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i2 = this.f3537i;
                if (i2 != -1) {
                    ((C0661B) this.f3538j).k(i2);
                    this.f3537i = -1;
                    return;
                }
                return;
        }
    }

    public c(s sVar) {
        this.f3535d = 1;
        this.f3538j = sVar;
        this.f3537i = -2;
    }

    public c(C0661B c0661b) {
        this.f3535d = 2;
        this.f3538j = c0661b;
        this.f3537i = -1;
        this.f3536e = j.a(new z(c0661b, this, null));
    }
}
