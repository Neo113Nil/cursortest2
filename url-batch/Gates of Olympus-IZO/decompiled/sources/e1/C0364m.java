package e1;

import g1.C0398e;
import g1.C0399f;
import g1.C0402i;
import java.util.LinkedHashSet;

/* renamed from: e1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364m extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0351N f4726f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0364m(C0351N c0351n, int i3) {
        super(0);
        this.f4725e = i3;
        this.f4726f = c0351n;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f4725e) {
            case 0:
                return ((C0402i) this.f4726f.f4647i.getValue()).f4829c;
            default:
                C0399f c0399f = this.f4726f.f4639a;
                String o3 = ((N2.v) c0399f.f4813d.getValue()).f2967d.o();
                synchronized (C0399f.f4809f) {
                    LinkedHashSet linkedHashSet = C0399f.f4808e;
                    if (linkedHashSet.contains(o3)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + o3 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(o3);
                }
                return new C0402i(c0399f.f4810a, (N2.v) c0399f.f4813d.getValue(), (X) c0399f.f4811b.g((N2.v) c0399f.f4813d.getValue(), c0399f.f4810a), new C0398e(c0399f, 1));
        }
    }
}
