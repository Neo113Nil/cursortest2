package X;

import android.util.Log;
import c.C0083a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1149b;

    public /* synthetic */ z(I i, int i2) {
        this.f1148a = i2;
        this.f1149b = i;
    }

    public final void a(Object obj) {
        switch (this.f1148a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                I i2 = this.f1149b;
                F f2 = (F) i2.f939C.pollFirst();
                if (f2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    T.w wVar = i2.f951c;
                    String str = f2.f933a;
                    if (wVar.d(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0083a c0083a = (C0083a) obj;
                I i3 = this.f1149b;
                F f3 = (F) i3.f939C.pollFirst();
                if (f3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    T.w wVar2 = i3.f951c;
                    String str2 = f3.f933a;
                    AbstractComponentCallbacksC0048q d = wVar2.d(str2);
                    if (d == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        d.q(f3.f934b, c0083a.f1703a, c0083a.f1704b);
                        break;
                    }
                }
            default:
                C0083a c0083a2 = (C0083a) obj;
                I i4 = this.f1149b;
                F f4 = (F) i4.f939C.pollFirst();
                if (f4 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    T.w wVar3 = i4.f951c;
                    String str3 = f4.f933a;
                    AbstractComponentCallbacksC0048q d2 = wVar3.d(str3);
                    if (d2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        d2.q(f4.f934b, c0083a2.f1703a, c0083a2.f1704b);
                        break;
                    }
                }
        }
    }
}
