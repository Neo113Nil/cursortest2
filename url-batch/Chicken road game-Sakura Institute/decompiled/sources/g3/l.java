package g3;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4165g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f4166h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(a0 a0Var, int i7) {
        super(0);
        this.f4165g = i7;
        this.f4166h = a0Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f4165g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((i3.i) this.f4166h.f4097n.getValue()).f4919c;
            default:
                i3.f fVar = this.f4166h.f4089f;
                String C = ((f8.w) fVar.f4903d.getValue()).f3646f.C();
                synchronized (i3.f.f4899f) {
                    LinkedHashSet linkedHashSet = i3.f.f4898e;
                    if (linkedHashSet.contains(C)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + C + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(C);
                }
                return new i3.i(fVar.f4900a, (f8.w) fVar.f4903d.getValue(), (h0) fVar.f4901b.d((f8.w) fVar.f4903d.getValue(), fVar.f4900a), new i3.e(fVar, 1));
        }
    }
}
