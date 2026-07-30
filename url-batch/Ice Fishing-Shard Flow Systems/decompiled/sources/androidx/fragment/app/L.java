package androidx.fragment.app;

import a.AbstractC0169a;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import c1.C0290c;
import f.C0382a;
import f.C0392k;
import g.AbstractC0407a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L extends AbstractC0407a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3592a;

    public /* synthetic */ L(int i2) {
        this.f3592a = i2;
    }

    @Override // g.AbstractC0407a
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f3592a) {
            case 0:
                C0392k c0392k = (C0392k) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0392k.f4759e;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = c0392k.f4758d;
                        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                        c0392k = new C0392k(intentSender, null, c0392k.f4760i, c0392k.f4761l);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0392k);
                if (Q.J(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] input = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            default:
                Intent input2 = (Intent) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input2, "input");
                return input2;
        }
    }

    @Override // g.AbstractC0407a
    public C0290c b(Context context, Object obj) {
        switch (this.f3592a) {
            case 1:
                String[] input = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                if (input.length == 0) {
                    return new C0290c(kotlin.collections.I.c());
                }
                for (String str : input) {
                    if (AbstractC0169a.b(context, str) != 0) {
                        return null;
                    }
                }
                int a7 = kotlin.collections.H.a(input.length);
                if (a7 < 16) {
                    a7 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new C0290c(linkedHashMap);
            default:
                return super.b(context, obj);
        }
    }

    @Override // g.AbstractC0407a
    public final Object c(int i2, Intent intent) {
        switch (this.f3592a) {
            case 0:
                return new C0382a(i2, intent);
            case 1:
                if (i2 != -1) {
                    return kotlin.collections.I.c();
                }
                if (intent == null) {
                    return kotlin.collections.I.c();
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return kotlin.collections.I.c();
                }
                ArrayList other = new ArrayList(intArrayExtra.length);
                for (int i5 : intArrayExtra) {
                    other.add(Boolean.valueOf(i5 == 0));
                }
                ArrayList l7 = kotlin.collections.p.l(stringArrayExtra);
                Intrinsics.checkNotNullParameter(l7, "<this>");
                Intrinsics.checkNotNullParameter(other, "other");
                Iterator it = l7.iterator();
                Iterator it2 = other.iterator();
                ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.s.g(l7, 10), kotlin.collections.s.g(other, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList.add(new Pair(it.next(), it2.next()));
                }
                return kotlin.collections.I.h(arrayList);
            default:
                return new C0382a(i2, intent);
        }
    }
}
