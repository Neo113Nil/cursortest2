package Z;

import android.content.Intent;
import c.C0087a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends A1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f996a;

    public /* synthetic */ E(int i) {
        this.f996a = i;
    }

    @Override // A1.m
    public final Object V(Intent intent, int i) {
        switch (this.f996a) {
            case 0:
                return new C0087a(intent, i);
            case 1:
                W0.q qVar = W0.q.f960a;
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
                ArrayList u02 = W0.f.u0(stringArrayExtra);
                Iterator it = u02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(W0.i.o0(u02), W0.i.o0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new V0.b(it.next(), it2.next()));
                }
                return W0.s.r0(arrayList2);
            default:
                return new C0087a(intent, i);
        }
    }
}
