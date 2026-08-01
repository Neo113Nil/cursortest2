package Y;

import android.content.Intent;
import c.C0081a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends w1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f926e;

    public /* synthetic */ E(int i) {
        this.f926e = i;
    }

    @Override // w1.l
    public final Object Q(Intent intent, int i) {
        switch (this.f926e) {
            case 0:
                return new C0081a(intent, i);
            case 1:
                S0.q qVar = S0.q.f796a;
                if (i != -1 || intent == null) {
                    return qVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return qVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList g02 = S0.f.g0(stringArrayExtra);
                Iterator it = g02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(S0.i.z0(g02), S0.i.z0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new R0.c(it.next(), it2.next()));
                }
                return S0.s.c0(arrayList2);
            default:
                return new C0081a(intent, i);
        }
    }
}
