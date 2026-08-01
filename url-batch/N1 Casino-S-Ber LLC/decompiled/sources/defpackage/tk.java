package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class tk {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;

    public /* synthetic */ tk(bl blVar, int i) {
        this.a = i;
        this.b = blVar;
    }

    public final void a(Object obj) {
        int i = this.a;
        bl blVar = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                yk ykVar = (yk) blVar.C.pollFirst();
                if (ykVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = ykVar.f;
                    if (blVar.c.i(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                s1 s1Var = (s1) obj;
                yk ykVar2 = (yk) blVar.C.pollFirst();
                if (ykVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = ykVar2.f;
                    int i3 = ykVar2.g;
                    mk i4 = blVar.c.i(str2);
                    if (i4 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        i4.r(i3, s1Var.f, s1Var.g);
                        break;
                    }
                }
            default:
                s1 s1Var2 = (s1) obj;
                yk ykVar3 = (yk) blVar.C.pollFirst();
                if (ykVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = ykVar3.f;
                    int i5 = ykVar3.g;
                    mk i6 = blVar.c.i(str3);
                    if (i6 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        i6.r(i5, s1Var2.f, s1Var2.g);
                        break;
                    }
                }
        }
    }
}
