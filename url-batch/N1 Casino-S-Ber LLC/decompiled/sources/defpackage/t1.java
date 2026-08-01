package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class t1 extends jw {
    public final /* synthetic */ int o;

    public /* synthetic */ t1(int i) {
        this.o = i;
    }

    @Override // defpackage.jw
    public final Object R(Intent intent, int i) {
        switch (this.o) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList g0 = q6.g0(stringArrayExtra);
                        Iterator it = g0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(db.G0(g0), db.G0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new pw(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new s1(intent, i);
    }
}
