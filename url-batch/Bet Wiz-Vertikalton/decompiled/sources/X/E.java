package X;

import android.content.Intent;
import c.C0077a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends x1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f906a;

    @Override // x1.l
    public final Object X(Intent intent, int i) {
        switch (this.f906a) {
            case 0:
                return new C0077a(intent, i);
            case 1:
                W0.r rVar = W0.r.f897a;
                if (i != -1 || intent == null) {
                    return rVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return rVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList s02 = W0.g.s0(stringArrayExtra);
                Iterator it = s02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(W0.j.m0(s02), W0.j.m0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new V0.c(it.next(), it2.next()));
                }
                return W0.t.p0(arrayList2);
            default:
                return new C0077a(intent, i);
        }
    }
}
