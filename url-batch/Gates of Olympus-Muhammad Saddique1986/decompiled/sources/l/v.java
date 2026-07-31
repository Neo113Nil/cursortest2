package l;

import e2.InterfaceC0424c;
import m.InterfaceC0640z;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final U.i f6539a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.k f6540b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0640z f6541c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6542d;

    /* JADX WARN: Multi-variable type inference failed */
    public v(U.i iVar, InterfaceC0424c interfaceC0424c, InterfaceC0640z interfaceC0640z, boolean z3) {
        this.f6539a = iVar;
        this.f6540b = (f2.k) interfaceC0424c;
        this.f6541c = interfaceC0640z;
        this.f6542d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f6539a.equals(vVar.f6539a) && this.f6540b.equals(vVar.f6540b) && f2.j.a(this.f6541c, vVar.f6541c) && this.f6542d == vVar.f6542d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6542d) + ((this.f6541c.hashCode() + ((this.f6540b.hashCode() + (this.f6539a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f6539a + ", size=" + this.f6540b + ", animationSpec=" + this.f6541c + ", clip=" + this.f6542d + ')';
    }
}
