package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.k;
import androidx.fragment.app.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a2 extends z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a2(int i) {
        this.a = i;
    }

    @Override // defpackage.z1
    public final Intent a(k kVar, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                putExtra.getClass();
                return putExtra;
            case 1:
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            default:
                mp mpVar = (mp) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = mpVar.g;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        mpVar = new mp(mpVar.f, null, mpVar.h, mpVar.i);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", mpVar);
                if (n.G(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    @Override // defpackage.z1
    public y1 b(k kVar, Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new y1(wh.f);
                }
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String str = strArr[i];
                        if (str == null) {
                            throw new NullPointerException("permission must be non-null");
                        }
                        if (((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? kVar.checkPermission(str, Process.myPid(), Process.myUid()) : new vv(kVar).a.areNotificationsEnabled() ? 0 : -1) == 0) {
                            i++;
                        } else {
                            z = false;
                        }
                    }
                }
                if (!z) {
                    return null;
                }
                int s0 = bs.s0(strArr.length);
                if (s0 < 16) {
                    s0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(s0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new y1(linkedHashMap);
            default:
                return super.b(kVar, obj);
        }
    }

    @Override // defpackage.z1
    public final Object c(Intent intent, int i) {
        switch (this.a) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList j0 = h7.j0(stringArrayExtra);
                        Iterator it = j0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(fb.b0(j0), fb.b0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new cx(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new w1(intent, i);
    }
}
