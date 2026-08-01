package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class wm {
    public final /* synthetic */ int a;
    public final /* synthetic */ en b;

    public /* synthetic */ wm(en enVar, int i) {
        this.a = i;
        this.b = enVar;
    }

    public final void a(Object obj) {
        int i = this.a;
        en enVar = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                bn bnVar = (bn) enVar.C.pollFirst();
                if (bnVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = bnVar.f;
                    if (enVar.c.i(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                t1 t1Var = (t1) obj;
                bn bnVar2 = (bn) enVar.C.pollFirst();
                if (bnVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = bnVar2.f;
                    int i3 = bnVar2.g;
                    pm i4 = enVar.c.i(str2);
                    if (i4 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        i4.q(i3, t1Var.f, t1Var.g);
                        break;
                    }
                }
            default:
                t1 t1Var2 = (t1) obj;
                bn bnVar3 = (bn) enVar.C.pollFirst();
                if (bnVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = bnVar3.f;
                    int i5 = bnVar3.g;
                    pm i6 = enVar.c.i(str3);
                    if (i6 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        i6.q(i5, t1Var2.f, t1Var2.g);
                        break;
                    }
                }
        }
    }
}
