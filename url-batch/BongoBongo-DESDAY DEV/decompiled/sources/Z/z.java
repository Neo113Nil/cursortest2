package Z;

import android.util.Log;
import c.C0087a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1223b;

    public /* synthetic */ z(I i, int i2) {
        this.f1222a = i2;
        this.f1223b = i;
    }

    public final void a(Object obj) {
        switch (this.f1222a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                I i2 = this.f1223b;
                F f2 = (F) i2.f1003C.pollFirst();
                if (f2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    S0.g gVar = i2.f1015c;
                    String str = f2.f997a;
                    if (gVar.e(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0087a c0087a = (C0087a) obj;
                I i3 = this.f1223b;
                F f3 = (F) i3.f1003C.pollFirst();
                if (f3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    S0.g gVar2 = i3.f1015c;
                    String str2 = f3.f997a;
                    AbstractComponentCallbacksC0050q e2 = gVar2.e(str2);
                    if (e2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        e2.q(f3.f998b, c0087a.f1728a, c0087a.f1729b);
                        break;
                    }
                }
            default:
                C0087a c0087a2 = (C0087a) obj;
                I i4 = this.f1223b;
                F f4 = (F) i4.f1003C.pollFirst();
                if (f4 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    S0.g gVar3 = i4.f1015c;
                    String str3 = f4.f997a;
                    AbstractComponentCallbacksC0050q e3 = gVar3.e(str3);
                    if (e3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        e3.q(f4.f998b, c0087a2.f1728a, c0087a2.f1729b);
                        break;
                    }
                }
        }
    }
}
