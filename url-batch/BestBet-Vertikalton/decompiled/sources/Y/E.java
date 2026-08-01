package Y;

import android.content.Intent;
import c.C0083a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends b1.g {
    public final /* synthetic */ int d;

    public /* synthetic */ E(int i) {
        this.d = i;
    }

    @Override // b1.g
    public final Object w(Intent intent, int i) {
        switch (this.d) {
            case 0:
                return new C0083a(intent, i);
            case 1:
                Y0.t tVar = Y0.t.f1517a;
                if (i != -1 || intent == null) {
                    return tVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return tVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList m02 = Y0.i.m0(stringArrayExtra);
                Iterator it = m02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(Y0.l.z0(m02), Y0.l.z0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new X0.c(it.next(), it2.next()));
                }
                return Y0.v.j0(arrayList2);
            default:
                return new C0083a(intent, i);
        }
    }
}
