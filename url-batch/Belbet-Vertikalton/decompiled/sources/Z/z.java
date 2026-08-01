package Z;

import android.util.Log;
import d.C0110a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1651b;

    public /* synthetic */ z(I i, int i2) {
        this.f1650a = i2;
        this.f1651b = i;
    }

    public final void a(Object obj) {
        switch (this.f1650a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                I i2 = this.f1651b;
                F f2 = (F) i2.f1435C.pollFirst();
                if (f2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    V.v vVar = i2.f1447c;
                    String str = f2.f1429a;
                    if (vVar.e(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0110a c0110a = (C0110a) obj;
                I i3 = this.f1651b;
                F f3 = (F) i3.f1435C.pollFirst();
                if (f3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    V.v vVar2 = i3.f1447c;
                    String str2 = f3.f1429a;
                    AbstractComponentCallbacksC0053q e = vVar2.e(str2);
                    if (e == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        e.q(f3.f1430b, c0110a.f2641a, c0110a.f2642b);
                        break;
                    }
                }
            default:
                C0110a c0110a2 = (C0110a) obj;
                I i4 = this.f1651b;
                F f4 = (F) i4.f1435C.pollFirst();
                if (f4 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    V.v vVar3 = i4.f1447c;
                    String str3 = f4.f1429a;
                    AbstractComponentCallbacksC0053q e2 = vVar3.e(str3);
                    if (e2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        e2.q(f4.f1430b, c0110a2.f2641a, c0110a2.f2642b);
                        break;
                    }
                }
        }
    }
}
