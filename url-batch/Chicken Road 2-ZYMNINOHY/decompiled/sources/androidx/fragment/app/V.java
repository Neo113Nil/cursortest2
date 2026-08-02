package androidx.fragment.app;

import android.util.Log;
import d.C0373a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class V implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f4782b;

    public /* synthetic */ V(f0 f0Var, int i4) {
        this.f4781a = i4;
        this.f4782b = f0Var;
    }

    @Override // d.b
    public final void a(Object obj) {
        switch (this.f4781a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
                }
                f0 f0Var = this.f4782b;
                C0196b0 c0196b0 = (C0196b0) f0Var.f4837E.pollFirst();
                if (c0196b0 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = c0196b0.f4818a;
                    int i5 = c0196b0.f4819b;
                    F c4 = f0Var.f4849c.c(str);
                    if (c4 == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    } else {
                        c4.onRequestPermissionsResult(i5, strArr, iArr);
                        break;
                    }
                }
            case 1:
                C0373a c0373a = (C0373a) obj;
                f0 f0Var2 = this.f4782b;
                C0196b0 c0196b02 = (C0196b0) f0Var2.f4837E.pollLast();
                if (c0196b02 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = c0196b02.f4818a;
                    int i6 = c0196b02.f4819b;
                    F c5 = f0Var2.f4849c.c(str2);
                    if (c5 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        c5.onActivityResult(i6, c0373a.f8059a, c0373a.f8060b);
                        break;
                    }
                }
            default:
                C0373a c0373a2 = (C0373a) obj;
                f0 f0Var3 = this.f4782b;
                C0196b0 c0196b03 = (C0196b0) f0Var3.f4837E.pollFirst();
                if (c0196b03 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = c0196b03.f4818a;
                    int i7 = c0196b03.f4819b;
                    F c6 = f0Var3.f4849c.c(str3);
                    if (c6 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        c6.onActivityResult(i7, c0373a2.f8059a, c0373a2.f8060b);
                        break;
                    }
                }
        }
    }
}
