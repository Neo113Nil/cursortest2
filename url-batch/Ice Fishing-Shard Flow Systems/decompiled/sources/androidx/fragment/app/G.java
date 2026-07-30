package androidx.fragment.app;

import android.util.Log;
import f.C0382a;
import f.InterfaceC0383b;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class G implements InterfaceC0383b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f3583e;

    public /* synthetic */ G(S s7, int i2) {
        this.f3582d = i2;
        this.f3583e = s7;
    }

    @Override // f.InterfaceC0383b
    public final void c(Object obj) {
        switch (this.f3582d) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                Q q4 = this.f3583e;
                M m2 = (M) q4.f3602E.pollFirst();
                if (m2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = m2.f3593d;
                    if (q4.f3615c.d(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            default:
                C0382a c0382a = (C0382a) obj;
                Q q7 = this.f3583e;
                M m7 = (M) q7.f3602E.pollFirst();
                if (m7 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str2 = m7.f3593d;
                    int i5 = m7.f3594e;
                    ComponentCallbacksC0228t d7 = q7.f3615c.d(str2);
                    if (d7 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        d7.l(i5, c0382a.f4737d, c0382a.f4738e);
                        break;
                    }
                }
        }
    }
}
