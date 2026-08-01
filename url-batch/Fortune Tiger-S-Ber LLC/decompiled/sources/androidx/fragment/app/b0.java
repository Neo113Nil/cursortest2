package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f397b;

    public /* synthetic */ b0(k0 k0Var, int i4) {
        this.f396a = i4;
        this.f397b = k0Var;
    }

    public final void a(Object obj) {
        switch (this.f396a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
                }
                k0 k0Var = this.f397b;
                h0 h0Var = (h0) k0Var.C.pollFirst();
                if (h0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = h0Var.f428f;
                    if (k0Var.c.e(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                b.a aVar = (b.a) obj;
                k0 k0Var2 = this.f397b;
                h0 h0Var2 = (h0) k0Var2.C.pollFirst();
                if (h0Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = h0Var2.f428f;
                    int i5 = h0Var2.g;
                    u e4 = k0Var2.c.e(str2);
                    if (e4 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        e4.q(i5, aVar.f684f, aVar.g);
                        break;
                    }
                }
            default:
                b.a aVar2 = (b.a) obj;
                k0 k0Var3 = this.f397b;
                h0 h0Var3 = (h0) k0Var3.C.pollFirst();
                if (h0Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = h0Var3.f428f;
                    int i6 = h0Var3.g;
                    u e5 = k0Var3.c.e(str3);
                    if (e5 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        e5.q(i6, aVar2.f684f, aVar2.g);
                        break;
                    }
                }
        }
    }
}
