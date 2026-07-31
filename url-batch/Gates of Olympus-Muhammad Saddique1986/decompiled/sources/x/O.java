package x;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: g, reason: collision with root package name */
    public static final O f9961g = new O();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f9962a = null;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0424c f9963b = null;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0424c f9964c = null;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0424c f9965d = null;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0424c f9966e = null;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0424c f9967f = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o3 = (O) obj;
        return this.f9962a == o3.f9962a && this.f9963b == o3.f9963b && this.f9964c == o3.f9964c && this.f9965d == o3.f9965d && this.f9966e == o3.f9966e && this.f9967f == o3.f9967f;
    }

    public final int hashCode() {
        InterfaceC0424c interfaceC0424c = this.f9962a;
        int hashCode = (interfaceC0424c != null ? interfaceC0424c.hashCode() : 0) * 31;
        InterfaceC0424c interfaceC0424c2 = this.f9963b;
        int hashCode2 = (hashCode + (interfaceC0424c2 != null ? interfaceC0424c2.hashCode() : 0)) * 31;
        InterfaceC0424c interfaceC0424c3 = this.f9964c;
        int hashCode3 = (hashCode2 + (interfaceC0424c3 != null ? interfaceC0424c3.hashCode() : 0)) * 31;
        InterfaceC0424c interfaceC0424c4 = this.f9965d;
        int hashCode4 = (hashCode3 + (interfaceC0424c4 != null ? interfaceC0424c4.hashCode() : 0)) * 31;
        InterfaceC0424c interfaceC0424c5 = this.f9966e;
        int hashCode5 = (hashCode4 + (interfaceC0424c5 != null ? interfaceC0424c5.hashCode() : 0)) * 31;
        InterfaceC0424c interfaceC0424c6 = this.f9967f;
        return hashCode5 + (interfaceC0424c6 != null ? interfaceC0424c6.hashCode() : 0);
    }
}
