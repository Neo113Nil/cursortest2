package c;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout.java */
/* loaded from: classes.dex */
public class h extends s {

    /* renamed from: a, reason: collision with root package name */
    private s f2194a;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2194a = sVar;
    }

    public final s a() {
        return this.f2194a;
    }

    public final h a(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2194a = sVar;
        return this;
    }

    @Override // c.s
    public s a(long j, TimeUnit timeUnit) {
        return this.f2194a.a(j, timeUnit);
    }

    @Override // c.s
    public long e_() {
        return this.f2194a.e_();
    }

    @Override // c.s
    public boolean f_() {
        return this.f2194a.f_();
    }

    @Override // c.s
    public long d() {
        return this.f2194a.d();
    }

    @Override // c.s
    public s a(long j) {
        return this.f2194a.a(j);
    }

    @Override // c.s
    public s g_() {
        return this.f2194a.g_();
    }

    @Override // c.s
    public s f() {
        return this.f2194a.f();
    }

    @Override // c.s
    public void g() throws IOException {
        this.f2194a.g();
    }
}
