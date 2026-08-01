package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class x1 extends mv {
    public final /* synthetic */ int o;

    public /* synthetic */ x1(int i) {
        this.o = i;
    }

    @Override // defpackage.mv
    public final Object H(Intent intent, int i) {
        boolean z = false;
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
                        ArrayList b0 = j7.b0(stringArrayExtra);
                        Iterator it = b0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(wc.g0(b0), wc.g0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new k50(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (intent == null || i != -1) {
                    break;
                } else {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (intArrayExtra2[i3] == 0) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    break;
                }
        }
        return new v1(intent, i);
    }

    @Override // defpackage.mv
    public final Intent m(b bVar) {
        Bundle bundleExtra;
        switch (this.o) {
            case 0:
                d50.l();
                throw null;
            case 1:
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{"android.permission.POST_NOTIFICATIONS"});
                putExtra.getClass();
                return putExtra;
            case 2:
                return (Intent) "android.permission.POST_NOTIFICATIONS";
            default:
                kv kvVar = (kv) "android.permission.POST_NOTIFICATIONS";
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = kvVar.g;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        kvVar = new kv(kvVar.f, null, kvVar.h, kvVar.i);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kvVar);
                if (c.G(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }

    @Override // defpackage.mv
    public o0 x(b bVar) {
        switch (this.o) {
            case 0:
                String[] strArr = (String[]) "android.permission.POST_NOTIFICATIONS";
                if (strArr.length == 0) {
                    return new o0(3, xm.f);
                }
                for (String str : strArr) {
                    if (bi.s(bVar, str) != 0) {
                        return null;
                    }
                }
                int Z = vz.Z(strArr.length);
                if (Z < 16) {
                    Z = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(Z);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new o0(3, linkedHashMap);
            case 1:
                if (bi.s(bVar, "android.permission.POST_NOTIFICATIONS") == 0) {
                    return new o0(3, Boolean.TRUE);
                }
                return null;
            default:
                return super.x(bVar);
        }
    }
}
