package androidx.fragment.app;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g0 extends b4.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f542b;

    public /* synthetic */ g0(int i) {
        this.f542b = i;
    }

    @Override // b4.l
    public final Object T(Intent intent, int i) {
        switch (this.f542b) {
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
                        ArrayList L = x2.g.L(stringArrayExtra);
                        Iterator it = L.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(x2.j.C(L), x2.j.C(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new w2.a(it.next(), it2.next()));
                        }
                        return x2.t.G(arrayList2);
                    }
                }
                return x2.r.f3888f;
            default:
                return new c.a(intent, i);
        }
    }
}
