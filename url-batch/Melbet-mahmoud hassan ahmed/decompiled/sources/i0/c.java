package i0;

import java.util.ArrayList;
import java.util.List;
import l0.p;

/* loaded from: classes.dex */
public abstract class c<T> implements h0.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f16880a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private T f16881b;

    /* renamed from: c, reason: collision with root package name */
    private j0.d<T> f16882c;

    /* renamed from: d, reason: collision with root package name */
    private a f16883d;

    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    c(j0.d<T> dVar) {
        this.f16882c = dVar;
    }

    private void h(a aVar, T t6) {
        if (this.f16880a.isEmpty() || aVar == null) {
            return;
        }
        if (t6 == null || c(t6)) {
            aVar.b(this.f16880a);
        } else {
            aVar.a(this.f16880a);
        }
    }

    @Override // h0.a
    public void a(T t6) {
        this.f16881b = t6;
        h(this.f16883d, t6);
    }

    abstract boolean b(p pVar);

    abstract boolean c(T t6);

    public boolean d(String str) {
        T t6 = this.f16881b;
        return t6 != null && c(t6) && this.f16880a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f16880a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f16880a.add(pVar.f18477a);
            }
        }
        if (this.f16880a.isEmpty()) {
            this.f16882c.c(this);
        } else {
            this.f16882c.a(this);
        }
        h(this.f16883d, this.f16881b);
    }

    public void f() {
        if (this.f16880a.isEmpty()) {
            return;
        }
        this.f16880a.clear();
        this.f16882c.c(this);
    }

    public void g(a aVar) {
        if (this.f16883d != aVar) {
            this.f16883d = aVar;
            h(aVar, this.f16881b);
        }
    }
}
