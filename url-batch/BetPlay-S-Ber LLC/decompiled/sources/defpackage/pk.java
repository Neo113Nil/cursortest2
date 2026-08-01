package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class pk implements x1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ pk(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // defpackage.x1
    public final void a(Object obj) {
        int i = this.a;
        n nVar = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                uk ukVar = (uk) nVar.C.pollFirst();
                if (ukVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = ukVar.f;
                    int i3 = ukVar.g;
                    Fragment c = nVar.c.c(str);
                    if (c == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    } else {
                        c.onRequestPermissionsResult(i3, strArr, iArr);
                        break;
                    }
                }
            case 1:
                w1 w1Var = (w1) obj;
                uk ukVar2 = (uk) nVar.C.pollFirst();
                if (ukVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = ukVar2.f;
                    int i4 = ukVar2.g;
                    Fragment c2 = nVar.c.c(str2);
                    if (c2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        c2.onActivityResult(i4, w1Var.f, w1Var.g);
                        break;
                    }
                }
            default:
                w1 w1Var2 = (w1) obj;
                uk ukVar3 = (uk) nVar.C.pollFirst();
                if (ukVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = ukVar3.f;
                    int i5 = ukVar3.g;
                    Fragment c3 = nVar.c.c(str3);
                    if (c3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        c3.onActivityResult(i5, w1Var2.f, w1Var2.g);
                        break;
                    }
                }
        }
    }
}
