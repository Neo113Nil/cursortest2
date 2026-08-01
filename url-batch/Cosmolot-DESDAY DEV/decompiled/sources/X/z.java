package X;

import android.util.Log;
import c.C0077a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1005b;

    public /* synthetic */ z(I i, int i2) {
        this.f1004a = i2;
        this.f1005b = i;
    }

    public final void a(Object obj) {
        switch (this.f1004a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                I i2 = this.f1005b;
                F f2 = (F) i2.f796C.pollFirst();
                if (f2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    T.t tVar = i2.f808c;
                    String str = f2.f790a;
                    if (tVar.e(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0077a c0077a = (C0077a) obj;
                I i3 = this.f1005b;
                F f3 = (F) i3.f796C.pollFirst();
                if (f3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    T.t tVar2 = i3.f808c;
                    String str2 = f3.f790a;
                    AbstractComponentCallbacksC0048q e2 = tVar2.e(str2);
                    if (e2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        e2.q(f3.f791b, c0077a.f1508a, c0077a.f1509b);
                        break;
                    }
                }
            default:
                C0077a c0077a2 = (C0077a) obj;
                I i4 = this.f1005b;
                F f4 = (F) i4.f796C.pollFirst();
                if (f4 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    T.t tVar3 = i4.f808c;
                    String str3 = f4.f790a;
                    AbstractComponentCallbacksC0048q e3 = tVar3.e(str3);
                    if (e3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        e3.q(f4.f791b, c0077a2.f1508a, c0077a2.f1509b);
                        break;
                    }
                }
        }
    }
}
