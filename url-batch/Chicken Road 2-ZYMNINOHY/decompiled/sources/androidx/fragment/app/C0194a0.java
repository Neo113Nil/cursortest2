package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import c3.C0292d;
import d.C0373a;
import e.AbstractC0390a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import t.C1421i;

/* renamed from: androidx.fragment.app.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194a0 extends AbstractC0390a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4804a;

    public /* synthetic */ C0194a0(int i4) {
        this.f4804a = i4;
    }

    @Override // e.AbstractC0390a
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f4804a) {
            case 0:
                d.j jVar = (d.j) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = jVar.f8081b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = jVar.f8080a;
                        kotlin.jvm.internal.i.e(intentSender, "intentSender");
                        jVar = new d.j(intentSender, null, jVar.f8082c, jVar.f8083d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jVar);
                if (f0.J(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] input = (String[]) obj;
                kotlin.jvm.internal.i.e(input, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                kotlin.jvm.internal.i.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 2:
                Intent input2 = (Intent) obj;
                kotlin.jvm.internal.i.e(input2, "input");
                return input2;
            default:
                d.j input3 = (d.j) obj;
                kotlin.jvm.internal.i.e(input3, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input3);
                kotlin.jvm.internal.i.d(putExtra2, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return putExtra2;
        }
    }

    @Override // e.AbstractC0390a
    public N1.c b(Context context, Object obj) {
        switch (this.f4804a) {
            case 1:
                String[] input = (String[]) obj;
                kotlin.jvm.internal.i.e(input, "input");
                if (input.length == 0) {
                    return new N1.c(d3.r.f8334a);
                }
                for (String str : input) {
                    if (str == null) {
                        throw new NullPointerException("permission must be non-null");
                    }
                    if (((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new C1421i(context).f15262a.areNotificationsEnabled() ? 0 : -1) != 0) {
                        return null;
                    }
                }
                int z = d3.u.z(input.length);
                if (z < 16) {
                    z = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(z);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new N1.c(linkedHashMap);
            default:
                return super.b(context, obj);
        }
    }

    @Override // e.AbstractC0390a
    public final Object c(Intent intent, int i4) {
        switch (this.f4804a) {
            case 1:
                if (i4 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i5 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i5 == 0));
                        }
                        ArrayList T4 = d3.g.T(stringArrayExtra);
                        Iterator it = T4.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(d3.k.Y(T4), d3.k.Y(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new C0292d(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new C0373a(intent, i4);
    }
}
