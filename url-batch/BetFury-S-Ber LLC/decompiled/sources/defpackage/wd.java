package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wd {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ b h;

    public wd(b bVar) {
        this.h = bVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        a2 a2Var = (a2) this.e.get(str);
        if ((a2Var != null ? a2Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                a2Var.a.a(a2Var.b.H(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new v1(intent, i2));
        return true;
    }

    public final void b(int i, mv mvVar) {
        Bundle bundle;
        int i2;
        b bVar = this.h;
        o0 x = mvVar.x(bVar);
        int i3 = 0;
        if (x != null) {
            new Handler(Looper.getMainLooper()).post(new vd(this, i, x, i3));
            return;
        }
        Intent m = mvVar.m(bVar);
        if (m.getExtras() != null) {
            Bundle extras = m.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                m.setExtrasClassLoader(bVar.getClassLoader());
            }
        }
        if (m.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = m.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            m.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(m.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(m.getAction())) {
                bVar.startActivityForResult(m, i, bundle2);
                return;
            }
            kv kvVar = (kv) m.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kvVar.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                bVar.startIntentSenderForResult(kvVar.f, i2, kvVar.g, kvVar.h, kvVar.i, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new vd(this, i2, e, 1));
                return;
            }
        }
        String[] stringArrayExtra = m.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
            if (TextUtils.isEmpty(stringArrayExtra[i4])) {
                s9.k(r7.d(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                return;
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
            while (i3 < stringArrayExtra.length) {
                if (!hashSet.contains(Integer.valueOf(i3))) {
                    strArr[i5] = stringArrayExtra[i3];
                    i5++;
                }
                i3++;
            }
        }
        bVar.requestPermissions(stringArrayExtra, i);
    }

    public final d2 c(String str, mv mvVar, w1 w1Var) {
        d(str);
        this.e.put(str, new a2(w1Var, mvVar));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            w1Var.a(obj);
        }
        Bundle bundle = this.g;
        v1 v1Var = (v1) n9.p(bundle, str);
        if (v1Var != null) {
            bundle.remove(str);
            w1Var.a(mvVar.H(v1Var.g, v1Var.f));
        }
        return new d2(this, str, mvVar);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        z1 z1Var = new z1(0);
        Iterator it = new ve(new ij(z1Var, new h(7, z1Var), 1)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((v1) n9.p(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        b2 b2Var = (b2) linkedHashMap2.get(str);
        if (b2Var != null) {
            ArrayList arrayList = b2Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                b2Var.a.f((jx) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
