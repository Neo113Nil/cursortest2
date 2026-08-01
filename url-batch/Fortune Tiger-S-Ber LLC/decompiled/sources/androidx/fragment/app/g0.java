package androidx.fragment.app;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g0 extends k3.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f424f;

    @Override // k3.d
    public final Object V(Intent intent, int i4) {
        switch (this.f424f) {
            case 0:
                return new b.a(intent, i4);
            case 1:
                if (i4 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i5 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i5 == 0));
                        }
                        ArrayList G = n2.f.G(stringArrayExtra);
                        Iterator it = G.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(n2.i.E(G), n2.i.E(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new m2.a(it.next(), it2.next()));
                        }
                        return n2.r.C(arrayList2);
                    }
                }
                return n2.p.f2954f;
            default:
                return new b.a(intent, i4);
        }
    }
}
