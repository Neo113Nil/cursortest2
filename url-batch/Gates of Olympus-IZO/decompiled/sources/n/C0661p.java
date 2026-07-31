package n;

import b0.C0275h;
import b0.InterfaceC0258I;
import b0.InterfaceC0285r;
import d0.C0321b;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661p {

    /* renamed from: a, reason: collision with root package name */
    public C0275h f6137a = null;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0285r f6138b = null;

    /* renamed from: c, reason: collision with root package name */
    public C0321b f6139c = null;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0258I f6140d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0661p)) {
            return false;
        }
        C0661p c0661p = (C0661p) obj;
        return Z1.i.a(this.f6137a, c0661p.f6137a) && Z1.i.a(this.f6138b, c0661p.f6138b) && Z1.i.a(this.f6139c, c0661p.f6139c) && Z1.i.a(this.f6140d, c0661p.f6140d);
    }

    public final int hashCode() {
        C0275h c0275h = this.f6137a;
        int hashCode = (c0275h == null ? 0 : c0275h.hashCode()) * 31;
        InterfaceC0285r interfaceC0285r = this.f6138b;
        int hashCode2 = (hashCode + (interfaceC0285r == null ? 0 : interfaceC0285r.hashCode())) * 31;
        C0321b c0321b = this.f6139c;
        int hashCode3 = (hashCode2 + (c0321b == null ? 0 : c0321b.hashCode())) * 31;
        InterfaceC0258I interfaceC0258I = this.f6140d;
        return hashCode3 + (interfaceC0258I != null ? interfaceC0258I.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f6137a + ", canvas=" + this.f6138b + ", canvasDrawScope=" + this.f6139c + ", borderPath=" + this.f6140d + ')';
    }
}
