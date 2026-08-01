package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class cq implements w1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ c g;

    public /* synthetic */ cq(c cVar, int i) {
        this.f = i;
        this.g = cVar;
    }

    @Override // defpackage.w1
    public final void a(Object obj) {
        int i = this.f;
        c cVar = this.g;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                hq hqVar = (hq) cVar.C.pollFirst();
                if (hqVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = hqVar.f;
                    if (cVar.c.c(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                v1 v1Var = (v1) obj;
                hq hqVar2 = (hq) cVar.C.pollFirst();
                if (hqVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = hqVar2.f;
                    int i3 = hqVar2.g;
                    a c = cVar.c.c(str2);
                    if (c == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        c.q(i3, v1Var.f, v1Var.g);
                        break;
                    }
                }
            default:
                v1 v1Var2 = (v1) obj;
                hq hqVar3 = (hq) cVar.C.pollFirst();
                if (hqVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = hqVar3.f;
                    int i4 = hqVar3.g;
                    a c2 = cVar.c.c(str3);
                    if (c2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        c2.q(i4, v1Var2.f, v1Var2.g);
                        break;
                    }
                }
        }
    }
}
