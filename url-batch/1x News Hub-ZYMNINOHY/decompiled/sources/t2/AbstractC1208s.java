package t2;

import d2.AbstractC0298a;
import d2.C0301d;
import d2.InterfaceC0302e;
import d2.InterfaceC0303f;

/* renamed from: t2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1208s extends AbstractC0298a implements InterfaceC0302e {

    /* renamed from: b, reason: collision with root package name */
    public static final r f10439b = new r(C0301d.f4950a, C1207q.f10436e);

    public AbstractC1208s() {
        super(C0301d.f4950a);
    }

    public abstract void c(d2.h hVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof m0);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.k, l2.l] */
    @Override // d2.AbstractC0298a, d2.h
    public final InterfaceC0303f h(d2.g key) {
        InterfaceC0303f interfaceC0303f;
        kotlin.jvm.internal.j.e(key, "key");
        if (!(key instanceof r)) {
            if (C0301d.f4950a == key) {
                return this;
            }
            return null;
        }
        r rVar = (r) key;
        d2.g gVar = this.f4947a;
        if ((gVar == rVar || rVar.f10438b == gVar) && (interfaceC0303f = (InterfaceC0303f) rVar.f10437a.invoke(this)) != null) {
            return interfaceC0303f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.k, l2.l] */
    @Override // d2.AbstractC0298a, d2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d2.h k(d2.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        boolean z = key instanceof r;
        d2.i iVar = d2.i.f4951a;
        if (z) {
            r rVar = (r) key;
            d2.g gVar = this.f4947a;
            return (gVar == rVar || rVar.f10438b == gVar) ? ((InterfaceC0303f) rVar.f10437a.invoke(this)) != null ? iVar : this : this;
        }
        if (C0301d.f4950a == key) {
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1212w.c(this);
    }
}
