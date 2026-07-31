package a4;

import d4.AbstractC0319a;
import d4.C0320b;
import d4.C0323e;
import d4.InterfaceC0326h;
import d4.InterfaceC0328j;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228a implements InterfaceC0326h {

    /* renamed from: f, reason: collision with root package name */
    public static final C0228a f3128f = new C0228a("00000000000000000000000000000000", "0000000000000000", C0323e.f3953d, AbstractC0319a.f3949a, false);

    /* renamed from: a, reason: collision with root package name */
    public final String f3129a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3130b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0328j f3131c;

    /* renamed from: d, reason: collision with root package name */
    public final C0320b f3132d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3133e;

    public C0228a(String str, String str2, InterfaceC0328j interfaceC0328j, C0320b c0320b, boolean z5) {
        this.f3129a = str;
        this.f3130b = str2;
        if (interfaceC0328j == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.f3131c = interfaceC0328j;
        if (c0320b == null) {
            throw new NullPointerException("Null traceState");
        }
        this.f3132d = c0320b;
        this.f3133e = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0228a)) {
            return false;
        }
        C0228a c0228a = (C0228a) obj;
        return this.f3129a.equals(c0228a.f3129a) && this.f3130b.equals(c0228a.f3130b) && this.f3131c.equals(c0228a.f3131c) && this.f3132d.equals(c0228a.f3132d) && this.f3133e == c0228a.f3133e;
    }

    public final int hashCode() {
        return ((((((((((this.f3129a.hashCode() ^ 1000003) * 1000003) ^ this.f3130b.hashCode()) * 1000003) ^ this.f3131c.hashCode()) * 1000003) ^ this.f3132d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (this.f3133e ? 1231 : 1237);
    }

    public final String toString() {
        return "ImmutableSpanContext{traceId=" + this.f3129a + ", spanId=" + this.f3130b + ", traceFlags=" + this.f3131c + ", traceState=" + this.f3132d + ", remote=false, valid=" + this.f3133e + "}";
    }
}
