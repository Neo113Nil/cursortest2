package X;

import android.content.Intent;
import c.C0078a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends s1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f837a;

    public /* synthetic */ E(int i) {
        this.f837a = i;
    }

    @Override // s1.d
    public final Object a0(Intent intent, int i) {
        switch (this.f837a) {
            case 0:
                return new C0078a(intent, i);
            case 1:
                R0.r rVar = R0.r.f713a;
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
                ArrayList r02 = R0.g.r0(stringArrayExtra);
                Iterator it = r02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(R0.j.m0(r02), R0.j.m0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new Q0.c(it.next(), it2.next()));
                }
                return R0.t.o0(arrayList2);
            default:
                return new C0078a(intent, i);
        }
    }
}
