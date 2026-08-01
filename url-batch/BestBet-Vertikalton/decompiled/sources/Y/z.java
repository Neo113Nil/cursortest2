package Y;

import android.util.Log;
import c.C0083a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1502b;

    public /* synthetic */ z(I i, int i2) {
        this.f1501a = i2;
        this.f1502b = i;
    }

    public final void a(Object obj) {
        switch (this.f1501a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                I i2 = this.f1502b;
                F f2 = (F) i2.f1292C.pollFirst();
                if (f2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    T0.m mVar = i2.f1304c;
                    String str = f2.f1286a;
                    if (mVar.f(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0083a c0083a = (C0083a) obj;
                I i3 = this.f1502b;
                F f3 = (F) i3.f1292C.pollFirst();
                if (f3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    T0.m mVar2 = i3.f1304c;
                    String str2 = f3.f1286a;
                    AbstractComponentCallbacksC0050q f4 = mVar2.f(str2);
                    if (f4 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        f4.q(f3.f1287b, c0083a.f2051a, c0083a.f2052b);
                        break;
                    }
                }
            default:
                C0083a c0083a2 = (C0083a) obj;
                I i4 = this.f1502b;
                F f5 = (F) i4.f1292C.pollFirst();
                if (f5 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    T0.m mVar3 = i4.f1304c;
                    String str3 = f5.f1286a;
                    AbstractComponentCallbacksC0050q f6 = mVar3.f(str3);
                    if (f6 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        f6.q(f5.f1287b, c0083a2.f2051a, c0083a2.f2052b);
                        break;
                    }
                }
        }
    }
}
