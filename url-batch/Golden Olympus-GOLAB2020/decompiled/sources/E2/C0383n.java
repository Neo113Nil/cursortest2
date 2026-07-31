package E2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0383n {

    /* renamed from: a, reason: collision with root package name */
    public final Q f619a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f620b;

    public C0383n(Q writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f619a = writer;
        this.f620b = true;
    }

    public final boolean a() {
        return this.f620b;
    }

    public void b() {
        this.f620b = true;
    }

    public void c() {
        this.f620b = false;
    }

    public void d(byte b4) {
        this.f619a.c(b4);
    }

    public final void e(char c4) {
        this.f619a.a(c4);
    }

    public void f(double d4) {
        this.f619a.d(String.valueOf(d4));
    }

    public void g(float f4) {
        this.f619a.d(String.valueOf(f4));
    }

    public void h(int i4) {
        this.f619a.c(i4);
    }

    public void i(long j4) {
        this.f619a.c(j4);
    }

    public final void j(String v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        this.f619a.d(v4);
    }

    public void k(short s4) {
        this.f619a.c(s4);
    }

    public void l(boolean z4) {
        this.f619a.d(String.valueOf(z4));
    }

    public void m(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f619a.b(value);
    }

    protected final void n(boolean z4) {
        this.f620b = z4;
    }

    public void o() {
    }

    public void p() {
    }
}
