package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tr0 implements u3 {
    public final /* synthetic */ int m;
    public final /* synthetic */ as0 n;

    public /* synthetic */ tr0(as0 as0Var, int i) {
        this.m = i;
        this.n = as0Var;
    }

    @Override // defpackage.u3
    public final void a(Object obj) {
        int i = this.m;
        as0 as0Var = this.n;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                xr0 xr0Var = (xr0) as0Var.C.pollFirst();
                if (xr0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = xr0Var.m;
                    int i3 = xr0Var.n;
                    fr0 j = as0Var.c.j(str);
                    if (j == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    } else {
                        j.onRequestPermissionsResult(i3, strArr, iArr);
                        break;
                    }
                }
            case 1:
                t3 t3Var = (t3) obj;
                xr0 xr0Var2 = (xr0) as0Var.C.pollFirst();
                if (xr0Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = xr0Var2.m;
                    int i4 = xr0Var2.n;
                    fr0 j2 = as0Var.c.j(str2);
                    if (j2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        j2.onActivityResult(i4, t3Var.m, t3Var.n);
                        break;
                    }
                }
            default:
                t3 t3Var2 = (t3) obj;
                xr0 xr0Var3 = (xr0) as0Var.C.pollFirst();
                if (xr0Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = xr0Var3.m;
                    int i5 = xr0Var3.n;
                    fr0 j3 = as0Var.c.j(str3);
                    if (j3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        j3.onActivityResult(i5, t3Var2.m, t3Var2.n);
                        break;
                    }
                }
        }
    }
}
