package f1;

import h1.C0652e;
import h1.C0653f;
import h1.C0656i;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* renamed from: f1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620n extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N f6608e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0620n(N n2, int i2) {
        super(0);
        this.f6607d = i2;
        this.f6608e = n2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6607d) {
            case 0:
                return ((C0656i) this.f6608e.f6527o.getValue()).f6860c;
            default:
                C0653f c0653f = this.f6608e.f6519d;
                String C3 = ((z3.v) c0653f.f6844d.getValue()).f12038d.C();
                synchronized (C0653f.f6840f) {
                    LinkedHashSet linkedHashSet = C0653f.f6839e;
                    if (linkedHashSet.contains(C3)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + C3 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(C3);
                }
                return new C0656i(c0653f.f6841a, (z3.v) c0653f.f6844d.getValue(), (X) c0653f.f6842b.h((z3.v) c0653f.f6844d.getValue(), c0653f.f6841a), new C0652e(c0653f, 1));
        }
    }
}
