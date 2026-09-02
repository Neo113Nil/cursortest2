package v3;

import com.startapp.sdk.internal.A;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.InterfaceC1349a;

/* loaded from: classes.dex */
public final class i implements Iterator, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15712a;

    /* renamed from: b, reason: collision with root package name */
    public int f15713b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f15715d;

    public i(n nVar) {
        this.f15712a = 1;
        this.f15715d = nVar;
        this.f15714c = nVar.f15717a.iterator();
    }

    public void a() {
        Object invoke;
        d3.h hVar = (d3.h) this.f15715d;
        if (this.f15713b == -2) {
            invoke = Integer.valueOf(r3.d.f15202a.a() + 65536);
        } else {
            A a3 = (A) hVar.f8331b;
            Object obj = this.f15714c;
            kotlin.jvm.internal.i.b(obj);
            invoke = a3.invoke(obj);
        }
        this.f15714c = invoke;
        this.f15713b = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15712a) {
            case 0:
                if (this.f15713b < 0) {
                    a();
                }
                if (this.f15713b == 1) {
                }
                break;
            default:
                n nVar = (n) this.f15715d;
                Iterator it = (Iterator) this.f15714c;
                while (this.f15713b < nVar.f15718b && it.hasNext()) {
                    it.next();
                    this.f15713b++;
                }
                if (this.f15713b >= nVar.f15719c || !it.hasNext()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15712a) {
            case 0:
                if (this.f15713b < 0) {
                    a();
                }
                if (this.f15713b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f15714c;
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f15713b = -1;
                return obj;
            default:
                n nVar = (n) this.f15715d;
                Iterator it = (Iterator) this.f15714c;
                while (this.f15713b < nVar.f15718b && it.hasNext()) {
                    it.next();
                    this.f15713b++;
                }
                int i4 = this.f15713b;
                if (i4 >= nVar.f15719c) {
                    throw new NoSuchElementException();
                }
                this.f15713b = i4 + 1;
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15712a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(d3.h hVar) {
        this.f15712a = 0;
        this.f15715d = hVar;
        this.f15713b = -2;
    }
}
