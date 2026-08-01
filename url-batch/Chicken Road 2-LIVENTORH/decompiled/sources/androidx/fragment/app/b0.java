package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f397b;

    public /* synthetic */ b0(k0 k0Var, int i) {
        this.f396a = i;
        this.f397b = k0Var;
    }

    public final void a(Object obj) {
        switch (this.f396a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                k0 k0Var = this.f397b;
                h0 h0Var = (h0) k0Var.C.pollFirst();
                if (h0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = h0Var.f433f;
                    if (k0Var.f443c.g(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                c.a aVar = (c.a) obj;
                k0 k0Var2 = this.f397b;
                h0 h0Var2 = (h0) k0Var2.C.pollFirst();
                if (h0Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = h0Var2.f433f;
                    int i4 = h0Var2.f434g;
                    u g4 = k0Var2.f443c.g(str2);
                    if (g4 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        g4.p(i4, aVar.f738f, aVar.f739g);
                        break;
                    }
                }
            default:
                c.a aVar2 = (c.a) obj;
                k0 k0Var3 = this.f397b;
                h0 h0Var3 = (h0) k0Var3.C.pollFirst();
                if (h0Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = h0Var3.f433f;
                    int i5 = h0Var3.f434g;
                    u g5 = k0Var3.f443c.g(str3);
                    if (g5 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        g5.p(i5, aVar2.f738f, aVar2.f739g);
                        break;
                    }
                }
        }
    }
}
