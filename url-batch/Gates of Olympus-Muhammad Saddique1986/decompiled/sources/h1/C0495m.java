package h1;

import e2.InterfaceC0422a;
import j1.C0559e;
import java.util.LinkedHashSet;

/* renamed from: h1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495m extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f6179f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0495m(M m3, int i3) {
        super(0);
        this.f6178e = i3;
        this.f6179f = m3;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f6178e) {
            case 0:
                return ((j1.i) this.f6179f.f6100l.getValue()).f6398c;
            default:
                j1.f fVar = this.f6179f.f6092d;
                String o3 = ((T2.v) fVar.f6382d.getValue()).f4447d.o();
                synchronized (j1.f.f6378f) {
                    LinkedHashSet linkedHashSet = j1.f.f6377e;
                    if (linkedHashSet.contains(o3)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + o3 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(o3);
                }
                return new j1.i(fVar.f6379a, (T2.v) fVar.f6382d.getValue(), (W) fVar.f6380b.h((T2.v) fVar.f6382d.getValue(), fVar.f6379a), new C0559e(fVar, 1));
        }
    }
}
