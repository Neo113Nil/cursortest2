package Y;

import android.content.Intent;
import c.C0083a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends z1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f953e;

    public /* synthetic */ E(int i) {
        this.f953e = i;
    }

    @Override // z1.l
    public final Object P(Intent intent, int i) {
        switch (this.f953e) {
            case 0:
                return new C0083a(intent, i);
            case 1:
                V0.q qVar = V0.q.f918a;
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
                ArrayList h02 = V0.f.h0(stringArrayExtra);
                Iterator it = h02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(V0.i.x0(h02), V0.i.x0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new U0.c(it.next(), it2.next()));
                }
                return V0.s.e0(arrayList2);
            default:
                return new C0083a(intent, i);
        }
    }
}
