package androidx.fragment.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import c.C0094a;
import c.C0104k;
import d.AbstractC0105a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class G extends AbstractC0105a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1207a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.AbstractC0105a
    public final Intent a(AbstractActivityC0064v abstractActivityC0064v, Parcelable parcelable) {
        Bundle bundleExtra;
        switch (this.f1207a) {
            case 0:
                C0104k c0104k = (C0104k) parcelable;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0104k.f1668b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = c0104k.f1667a;
                        X0.f.e(intentSender, "intentSender");
                        c0104k = new C0104k(intentSender, null, c0104k.f1669c, c0104k.f1670d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0104k);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) parcelable;
                X0.f.e(strArr, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                X0.f.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            default:
                Intent intent3 = (Intent) parcelable;
                X0.f.e(intent3, "input");
                return intent3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.AbstractC0105a
    public J0.f b(AbstractActivityC0064v abstractActivityC0064v, Parcelable parcelable) {
        switch (this.f1207a) {
            case 1:
                String[] strArr = (String[]) parcelable;
                X0.f.e(strArr, "input");
                if (strArr.length == 0) {
                    return new J0.f(O0.r.f696a);
                }
                for (String str : strArr) {
                    if (str == null) {
                        throw new NullPointerException("permission must be non-null");
                    }
                    if (((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? abstractActivityC0064v.checkPermission(str, Process.myPid(), Process.myUid()) : z.l.a(new z.m(abstractActivityC0064v).f4635a) ? 0 : -1) != 0) {
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
                return new J0.f(linkedHashMap);
            default:
                return super.b(abstractActivityC0064v, parcelable);
        }
    }

    @Override // d.AbstractC0105a
    public final Object c(Intent intent, int i) {
        switch (this.f1207a) {
            case 0:
                return new C0094a(intent, i);
            case 1:
                O0.r rVar = O0.r.f696a;
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
                ArrayList arrayList2 = new ArrayList(Math.min(O0.j.c0(y02), O0.j.c0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new N0.d(it.next(), it2.next()));
                }
                return O0.t.v0(arrayList2);
            default:
                return new C0094a(intent, i);
        }
    }
}
