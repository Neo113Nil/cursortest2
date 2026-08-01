package Z;

import android.content.Intent;
import d.C0110a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends H1.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1428b;

    public /* synthetic */ E(int i) {
        this.f1428b = i;
    }

    @Override // H1.d
    public final Object a0(Intent intent, int i) {
        switch (this.f1428b) {
            case 0:
                return new C0110a(intent, i);
            case 1:
                X0.u uVar = X0.u.f1386a;
                if (i != -1 || intent == null) {
                    return uVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return uVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList p02 = X0.j.p0(stringArrayExtra);
                Iterator it = p02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(X0.m.m0(p02), X0.m.m0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new W0.d(it.next(), it2.next()));
                }
                return X0.w.i0(arrayList2);
            default:
                return new C0110a(intent, i);
        }
    }
}
