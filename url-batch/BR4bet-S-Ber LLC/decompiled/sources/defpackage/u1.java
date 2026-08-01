package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class u1 extends b9 {
    public final /* synthetic */ int x;

    public /* synthetic */ u1(int i) {
        this.x = i;
    }

    @Override // defpackage.b9
    public final Object I(Intent intent, int i) {
        switch (this.x) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList c0 = a7.c0(stringArrayExtra);
                        Iterator it = c0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(yb.k0(c0), yb.k0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new tz(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new t1(intent, i);
    }
}
