package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bs implements ob {
    final /* synthetic */ by a;
    private final /* synthetic */ int b;

    public bs(by byVar, int i) {
        this.b = i;
        this.a = byVar;
    }

    @Override // defpackage.ob
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            by byVar = this.a;
            oa oaVar = (oa) obj;
            bu buVar = (bu) byVar.q.pollLast();
            if (buVar == null) {
                toString();
                Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                return;
            }
            cd cdVar = byVar.b;
            String str = buVar.a;
            bd c = cdVar.c(str);
            if (c == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
                return;
            } else {
                c.W(buVar.b, oaVar.a, oaVar.b);
                return;
            }
        }
        if (i != 1) {
            by byVar2 = this.a;
            oa oaVar2 = (oa) obj;
            bu buVar2 = (bu) byVar2.q.pollFirst();
            if (buVar2 == null) {
                toString();
                Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            cd cdVar2 = byVar2.b;
            String str2 = buVar2.a;
            bd c2 = cdVar2.c(str2);
            if (c2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                return;
            } else {
                c2.W(buVar2.b, oaVar2.a, oaVar2.b);
                return;
            }
        }
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = true != ((Boolean) arrayList.get(i2)).booleanValue() ? -1 : 0;
        }
        by byVar3 = this.a;
        bu buVar3 = (bu) byVar3.q.pollFirst();
        if (buVar3 == null) {
            toString();
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        cd cdVar3 = byVar3.b;
        String str3 = buVar3.a;
        bd c3 = cdVar3.c(str3);
        if (c3 == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str3)));
        } else {
            c3.aD();
        }
    }
}
