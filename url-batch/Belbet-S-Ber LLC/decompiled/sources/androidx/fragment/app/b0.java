package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f512b;

    public /* synthetic */ b0(k0 k0Var, int i) {
        this.f511a = i;
        this.f512b = k0Var;
    }

    public final void a(Object obj) {
        switch (this.f511a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                k0 k0Var = this.f512b;
                h0 h0Var = (h0) k0Var.C.pollFirst();
                if (h0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = h0Var.f546f;
                    if (k0Var.f556c.h(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                c.a aVar = (c.a) obj;
                k0 k0Var2 = this.f512b;
                h0 h0Var2 = (h0) k0Var2.C.pollFirst();
                if (h0Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = h0Var2.f546f;
                    int i4 = h0Var2.f547g;
                    u h = k0Var2.f556c.h(str2);
                    if (h == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        h.q(i4, aVar.f855f, aVar.f856g);
                        break;
                    }
                }
            default:
                c.a aVar2 = (c.a) obj;
                k0 k0Var3 = this.f512b;
                h0 h0Var3 = (h0) k0Var3.C.pollFirst();
                if (h0Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = h0Var3.f546f;
                    int i5 = h0Var3.f547g;
                    u h5 = k0Var3.f556c.h(str3);
                    if (h5 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        h5.q(i5, aVar2.f855f, aVar2.f856g);
                        break;
                    }
                }
        }
    }
}
