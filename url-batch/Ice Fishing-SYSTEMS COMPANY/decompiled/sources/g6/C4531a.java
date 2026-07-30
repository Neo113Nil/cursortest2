package g6;

import j6.AbstractC4599a;
import j6.C4600b;
import j6.C4603e;
import j6.InterfaceC4606h;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4531a implements InterfaceC4606h {

    /* renamed from: f, reason: collision with root package name */
    public static final C4531a f37920f = new C4531a("00000000000000000000000000000000", "0000000000000000", C4603e.f38573d, AbstractC4599a.f38569a, false);

    /* renamed from: a, reason: collision with root package name */
    public final String f37921a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37922b;

    /* renamed from: c, reason: collision with root package name */
    public final C4603e f37923c;

    /* renamed from: d, reason: collision with root package name */
    public final C4600b f37924d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37925e;

    public C4531a(String str, String str2, C4603e c4603e, C4600b c4600b, boolean z8) {
        this.f37921a = str;
        this.f37922b = str2;
        if (c4603e == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.f37923c = c4603e;
        if (c4600b == null) {
            throw new NullPointerException("Null traceState");
        }
        this.f37924d = c4600b;
        this.f37925e = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4531a)) {
            return false;
        }
        C4531a c4531a = (C4531a) obj;
        return this.f37921a.equals(c4531a.f37921a) && this.f37922b.equals(c4531a.f37922b) && this.f37923c.equals(c4531a.f37923c) && this.f37924d.equals(c4531a.f37924d) && this.f37925e == c4531a.f37925e;
    }

    public final int hashCode() {
        return ((((((((((this.f37921a.hashCode() ^ 1000003) * 1000003) ^ this.f37922b.hashCode()) * 1000003) ^ this.f37923c.hashCode()) * 1000003) ^ this.f37924d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (this.f37925e ? 1231 : 1237);
    }

    public final String toString() {
        return "ImmutableSpanContext{traceId=" + this.f37921a + ", spanId=" + this.f37922b + ", traceFlags=" + this.f37923c + ", traceState=" + this.f37924d + ", remote=false, valid=" + this.f37925e + "}";
    }
}
