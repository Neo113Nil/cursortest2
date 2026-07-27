package b;

import A.AbstractC0017m;
import a.AbstractC0345a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import e.C0550a;
import e.C0552c;
import e.C0555f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5550a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5551b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5552c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5553d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f5554e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f5555f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f5556g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f5557h;

    public m(o oVar) {
        this.f5557h = oVar;
    }

    public final boolean a(int i2, int i4, Intent intent) {
        String str = (String) this.f5550a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        C0552c c0552c = (C0552c) this.f5554e.get(str);
        if ((c0552c != null ? c0552c.f6142a : null) != null) {
            ArrayList arrayList = this.f5553d;
            if (arrayList.contains(str)) {
                c0552c.f6142a.a(c0552c.f6143b.B(intent, i4));
                arrayList.remove(str);
                return true;
            }
        }
        this.f5555f.remove(str);
        this.f5556g.putParcelable(str, new C0550a(intent, i4));
        return true;
    }

    public final void b(int i2, AbstractC0345a contract, Object obj) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(contract, "contract");
        o oVar = this.f5557h;
        C1294c x2 = contract.x(oVar, obj);
        if (x2 != null) {
            new Handler(Looper.getMainLooper()).post(new l(i2, 0, this, x2));
            return;
        }
        Intent n2 = contract.n(oVar, obj);
        if (n2.getExtras() != null) {
            Bundle extras = n2.getExtras();
            Intrinsics.c(extras);
            if (extras.getClassLoader() == null) {
                n2.setExtrasClassLoader(oVar.getClassLoader());
            }
        }
        if (n2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = n2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            n2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(n2.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(n2.getAction())) {
                oVar.startActivityForResult(n2, i2, bundle);
                return;
            }
            C0555f c0555f = (C0555f) n2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.c(c0555f);
                oVar.startIntentSenderForResult(c0555f.f6147d, i2, c0555f.f6148e, c0555f.f6149i, c0555f.f6150j, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e4) {
                new Handler(Looper.getMainLooper()).post(new l(i2, 1, this, e4));
                return;
            }
        }
        String[] stringArrayExtra = n2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
            if (TextUtils.isEmpty(stringArrayExtra[i4])) {
                throw new IllegalArgumentException(AbstractC0017m.n(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < stringArrayExtra.length; i6++) {
                if (!hashSet.contains(Integer.valueOf(i6))) {
                    strArr[i5] = stringArrayExtra[i6];
                    i5++;
                }
            }
        }
        S0.a.b(oVar, stringArrayExtra, i2);
    }
}
