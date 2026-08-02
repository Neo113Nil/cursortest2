package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oh {
    final /* synthetic */ ng g;
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    private final Map h = new LinkedHashMap();
    public final List c = new ArrayList();
    public final transient Map d = new LinkedHashMap();
    public final Map e = new LinkedHashMap();
    public final Bundle f = new Bundle();

    public oh(ng ngVar) {
        this.g = ngVar;
    }

    public static final Integer c() {
        ktd ktdVar = kte.a;
        return Integer.valueOf(kte.b.b() + 65536);
    }

    private final void h(String str) {
        if (((Integer) this.b.get(str)) == null) {
            Iterator a = ksl.c(new ktz(new aji(1), new ghz(10), 1)).a();
            while (a.hasNext()) {
                Number number = (Number) a.next();
                if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                    d(number.intValue(), str);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final oc a(String str, ok okVar, ob obVar) {
        h(str);
        this.d.put(str, new oe(obVar, okVar));
        Map map = this.e;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            obVar.a(obj);
        }
        Bundle bundle = this.f;
        oa oaVar = (oa) pj.h(bundle, str, oa.class);
        if (oaVar != null) {
            bundle.remove(str);
            obVar.a(okVar.a(oaVar.a, oaVar.b));
        }
        return new og(this, str, okVar);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    public final oc b(final String str, aer aerVar, final ok okVar, final ob obVar) {
        ael L = aerVar.L();
        if (L.c.a(aek.d)) {
            throw new IllegalStateException("LifecycleOwner " + aerVar + " is attempting to register while current state is " + L.c + ". LifecycleOwners must call register before they are STARTED.");
        }
        h(str);
        Map map = this.h;
        brr brrVar = (brr) map.get(str);
        if (brrVar == null) {
            brrVar = new brr(L);
        }
        aep aepVar = new aep() { // from class: od
            @Override // defpackage.aep
            public final void a(aer aerVar2, aej aejVar) {
                oh ohVar = oh.this;
                String str2 = str;
                if (aej.ON_START != aejVar) {
                    if (aej.ON_STOP == aejVar) {
                        ohVar.d.remove(str2);
                        return;
                    } else {
                        if (aej.ON_DESTROY == aejVar) {
                            ohVar.e(str2);
                            return;
                        }
                        return;
                    }
                }
                ok okVar2 = okVar;
                ob obVar2 = obVar;
                ohVar.d.put(str2, new oe(obVar2, okVar2));
                Map map2 = ohVar.e;
                if (map2.containsKey(str2)) {
                    Object obj = map2.get(str2);
                    map2.remove(str2);
                    obVar2.a(obj);
                }
                Bundle bundle = ohVar.f;
                oa oaVar = (oa) pj.h(bundle, str2, oa.class);
                if (oaVar != null) {
                    bundle.remove(str2);
                    obVar2.a(new oa(oaVar.a, oaVar.b));
                }
            }
        };
        ((ael) brrVar.b).a(aepVar);
        brrVar.a.add(aepVar);
        map.put(str, brrVar);
        return new of(this, str, okVar);
    }

    public final void d(int i, String str) {
        Map map = this.a;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, str);
        this.b.put(str, valueOf);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void e(String str) {
        Integer num;
        if (!this.c.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.d.remove(str);
        Map map = this.e;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((oa) pj.h(bundle, str, oa.class)));
            bundle.remove(str);
        }
        Map map2 = this.h;
        brr brrVar = (brr) map2.get(str);
        if (brrVar != null) {
            ?? r1 = brrVar.a;
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                ((ael) brrVar.b).c((aep) it.next());
            }
            r1.clear();
            map2.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ob] */
    public final boolean f(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        oe oeVar = (oe) this.d.get(str);
        if ((oeVar != null ? oeVar.a : null) != null) {
            List list = this.c;
            if (list.contains(str)) {
                oeVar.a.a(((ok) oeVar.b).a(i2, intent));
                list.remove(str);
                return true;
            }
        }
        this.e.remove(str);
        this.f.putParcelable(str, new oa(i2, intent));
        return true;
    }

    public final void g(int i, ok okVar, Object obj) {
        Bundle bundle;
        ng ngVar = this.g;
        brn c = okVar.c(ngVar, obj);
        if (c != null) {
            new Handler(Looper.getMainLooper()).post(new mr(this, i, c, 2, null));
            return;
        }
        Intent b = okVar.b(obj);
        if (b.getExtras() != null) {
            Bundle extras = b.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                b.setExtrasClassLoader(ngVar.getClassLoader());
            }
        }
        if (b.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = b.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            b.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (!ksp.b("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", b.getAction())) {
            if (!ksp.b("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", b.getAction())) {
                ngVar.startActivityForResult(b, i, bundle2);
                return;
            }
            oj ojVar = (oj) b.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                ojVar.getClass();
                ngVar.startIntentSenderForResult(ojVar.a, i, ojVar.b, ojVar.c, ojVar.d, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new mr(this, i, e, 3));
                return;
            }
        }
        String[] stringArrayExtra = b.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            int length = stringArrayExtra.length;
            if (i2 >= length) {
                int size = hashSet.size();
                String[] strArr = size > 0 ? new String[length - size] : stringArrayExtra;
                if (size > 0) {
                    if (size == length) {
                        return;
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr[i3] = stringArrayExtra[i4];
                            i3++;
                        }
                    }
                }
                if (ngVar instanceof bg) {
                }
                ngVar.requestPermissions(stringArrayExtra, i);
                return;
            }
            if (TextUtils.isEmpty(stringArrayExtra[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
            i2++;
        }
    }
}
