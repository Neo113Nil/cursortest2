package Z;

import android.content.Intent;
import c.C0077a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends z1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1015e;

    public /* synthetic */ E(int i) {
        this.f1015e = i;
    }

    @Override // z1.d
    public final Object P(Intent intent, int i) {
        switch (this.f1015e) {
            case 0:
                return new C0077a(intent, i);
            case 1:
                X0.t tVar = X0.t.f993a;
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
                ArrayList j02 = X0.i.j0(stringArrayExtra);
                Iterator it = j02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(X0.l.z0(j02), X0.l.z0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new W0.c(it.next(), it2.next()));
                }
                return X0.v.h0(arrayList2);
            default:
                return new C0077a(intent, i);
        }
    }
}
