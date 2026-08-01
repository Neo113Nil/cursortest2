package X;

import android.content.Intent;
import c.C0080a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f866e;

    public /* synthetic */ E(int i) {
        this.f866e = i;
    }

    @Override // u1.l
    public final Object Q(Intent intent, int i) {
        switch (this.f866e) {
            case 0:
                return new C0080a(intent, i);
            case 1:
                T0.r rVar = T0.r.f830a;
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
                ArrayList n0 = T0.g.n0(stringArrayExtra);
                Iterator it = n0.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(T0.j.v0(n0), T0.j.v0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new S0.c(it.next(), it2.next()));
                }
                return T0.t.k0(arrayList2);
            default:
                return new C0080a(intent, i);
        }
    }
}
