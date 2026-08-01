package androidx.fragment.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import c.C0094a;
import c.C0103j;
import d.AbstractC0104a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class G extends AbstractC0104a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1206a;

    public /* synthetic */ G(int i) {
        this.f1206a = i;
    }

    @Override // d.AbstractC0104a
    public final Intent a(AbstractActivityC0064v abstractActivityC0064v, Object obj) {
        Bundle bundleExtra;
        switch (this.f1206a) {
            case 0:
                C0103j c0103j = (C0103j) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0103j.f1668b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = c0103j.f1667a;
                        X0.f.e(intentSender, "intentSender");
                        c0103j = new C0103j(intentSender, null, c0103j.f1669c, c0103j.f1670d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0103j);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                X0.f.e(strArr, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                X0.f.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 2:
                String str = (String) obj;
                X0.f.e(str, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                X0.f.d(putExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra2;
            default:
                Intent intent3 = (Intent) obj;
                X0.f.e(intent3, "input");
                return intent3;
        }
    }

    @Override // d.AbstractC0104a
    public B0.d b(AbstractActivityC0064v abstractActivityC0064v, Object obj) {
        switch (this.f1206a) {
            case 1:
                String[] strArr = (String[]) obj;
                X0.f.e(strArr, "input");
                if (strArr.length == 0) {
                    return new B0.d(22, O0.r.f695a);
                }
                for (String str : strArr) {
                    if (q1.d.k(abstractActivityC0064v, str) != 0) {
                        return null;
                    }
                }
                int u02 = O0.t.u0(strArr.length);
                if (u02 < 16) {
                    u02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(u02);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new B0.d(22, linkedHashMap);
            case 2:
                String str3 = (String) obj;
                X0.f.e(str3, "input");
                if (q1.d.k(abstractActivityC0064v, str3) == 0) {
                    return new B0.d(22, Boolean.TRUE);
                }
                return null;
            default:
                return super.b(abstractActivityC0064v, obj);
        }
    }

    @Override // d.AbstractC0104a
    public final Object c(Intent intent, int i) {
        switch (this.f1206a) {
            case 0:
                return new C0094a(intent, i);
            case 1:
                O0.r rVar = O0.r.f695a;
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
                ArrayList y02 = O0.g.y0(stringArrayExtra);
                Iterator it = y02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(O0.j.d0(y02), O0.j.d0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new N0.c(it.next(), it2.next()));
                }
                return O0.t.v0(arrayList2);
            case 2:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z2 = false;
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (intArrayExtra2[i3] == 0) {
                                z2 = true;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            default:
                return new C0094a(intent, i);
        }
    }
}
