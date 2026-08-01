package androidx.fragment.app;

import android.util.Log;
import c.C0094a;
import c.InterfaceC0095b;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class B implements InterfaceC0095b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f1193b;

    public /* synthetic */ B(L l2, int i) {
        this.f1192a = i;
        this.f1193b = l2;
    }

    @Override // c.InterfaceC0095b
    public final void a(Object obj) {
        switch (this.f1192a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                L l2 = this.f1193b;
                H h = (H) l2.f1213C.pollFirst();
                if (h == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = h.f1207a;
                    if (l2.f1225c.i(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0094a c0094a = (C0094a) obj;
                L l3 = this.f1193b;
                H h2 = (H) l3.f1213C.pollFirst();
                if (h2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = h2.f1207a;
                    AbstractComponentCallbacksC0060q i2 = l3.f1225c.i(str2);
                    if (i2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        i2.m(h2.f1208b, c0094a.f1645a, c0094a.f1646b);
                        break;
                    }
                }
            default:
                C0094a c0094a2 = (C0094a) obj;
                L l4 = this.f1193b;
                H h3 = (H) l4.f1213C.pollFirst();
                if (h3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = h3.f1207a;
                    AbstractComponentCallbacksC0060q i3 = l4.f1225c.i(str3);
                    if (i3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        i3.m(h3.f1208b, c0094a2.f1645a, c0094a2.f1646b);
                        break;
                    }
                }
        }
    }
}
