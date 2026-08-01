package androidx.fragment.app;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g0 extends a.y {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f429n;

    public /* synthetic */ g0(int i) {
        this.f429n = i;
    }

    @Override // a.y
    public final Object P(Intent intent, int i) {
        switch (this.f429n) {
            case 0:
                return new c.a(intent, i);
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i4 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i4 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(a3.g.X(arrayList2), a3.g.X(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new z2.a(it.next(), it2.next()));
                        }
                        return a3.p.W(arrayList3);
                    }
                }
                return a3.n.f114f;
            default:
                return new c.a(intent, i);
        }
    }
}
