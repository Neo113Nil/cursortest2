package n2;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import n2.h0;
import n2.p;

/* loaded from: classes.dex */
public final class j0<T> implements h0.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f19458a;

    /* renamed from: b, reason: collision with root package name */
    public final p f19459b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19460c;

    /* renamed from: d, reason: collision with root package name */
    private final o0 f19461d;

    /* renamed from: e, reason: collision with root package name */
    private final a<? extends T> f19462e;

    /* renamed from: f, reason: collision with root package name */
    private volatile T f19463f;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public j0(l lVar, Uri uri, int i7, a<? extends T> aVar) {
        this(lVar, new p.b().i(uri).b(1).a(), i7, aVar);
    }

    public j0(l lVar, p pVar, int i7, a<? extends T> aVar) {
        this.f19461d = new o0(lVar);
        this.f19459b = pVar;
        this.f19460c = i7;
        this.f19462e = aVar;
        this.f19458a = t1.q.a();
    }

    @Override // n2.h0.e
    public final void a() {
        this.f19461d.t();
        n nVar = new n(this.f19461d, this.f19459b);
        try {
            nVar.f();
            this.f19463f = this.f19462e.a((Uri) o2.a.e(this.f19461d.k()), nVar);
        } finally {
            o2.m0.n(nVar);
        }
    }

    public long b() {
        return this.f19461d.q();
    }

    @Override // n2.h0.e
    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.f19461d.s();
    }

    public final T e() {
        return this.f19463f;
    }

    public Uri f() {
        return this.f19461d.r();
    }
}
