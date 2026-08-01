package X;

import android.content.Intent;
import c.C0083a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends T.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f932a;

    @Override // T.d
    public final Object F(Intent intent, int i) {
        switch (this.f932a) {
            case 0:
                return new C0083a(intent, i);
            case 1:
                V0.n nVar = V0.n.f890a;
                if (i != -1 || intent == null) {
                    return nVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return nVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new U0.d(it.next(), it2.next()));
                }
                return V0.p.T(arrayList3);
            default:
                return new C0083a(intent, i);
        }
    }
}
