package b;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import e.C0409a;
import e.C0411c;
import e.C0414f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: b.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5303a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5304b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5305c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5306d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f5307e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f5308f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f5309g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0319o f5310h;

    public C0317m(AbstractActivityC0319o abstractActivityC0319o) {
        this.f5310h = abstractActivityC0319o;
    }

    public final boolean a(int i3, int i4, Intent intent) {
        String str = (String) this.f5303a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        C0411c c0411c = (C0411c) this.f5307e.get(str);
        if ((c0411c != null ? c0411c.f5682a : null) != null) {
            ArrayList arrayList = this.f5306d;
            if (arrayList.contains(str)) {
                c0411c.f5682a.b(c0411c.f5683b.b0(intent, i4));
                arrayList.remove(str);
                return true;
            }
        }
        this.f5308f.remove(str);
        this.f5309g.putParcelable(str, new C0409a(intent, i4));
        return true;
    }

    public final void b(int i3, O2.d dVar, Object obj) {
        Bundle bundle;
        AbstractActivityC0319o abstractActivityC0319o = this.f5310h;
        A1.i T3 = dVar.T(abstractActivityC0319o, obj);
        if (T3 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0315k(this, i3, T3));
            return;
        }
        Intent J3 = dVar.J(abstractActivityC0319o, obj);
        if (J3.getExtras() != null) {
            Bundle extras = J3.getExtras();
            f2.j.c(extras);
            if (extras.getClassLoader() == null) {
                J3.setExtrasClassLoader(abstractActivityC0319o.getClassLoader());
            }
        }
        if (J3.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = J3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            J3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(J3.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(J3.getAction())) {
                abstractActivityC0319o.startActivityForResult(J3, i3, bundle);
                return;
            }
            C0414f c0414f = (C0414f) J3.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                f2.j.c(c0414f);
                abstractActivityC0319o.startIntentSenderForResult(c0414f.f5687d, i3, c0414f.f5688e, c0414f.f5689f, c0414f.f5690g, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e3) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0316l(this, i3, e3, 0));
                return;
            }
        }
        String[] stringArrayExtra = J3.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
            if (TextUtils.isEmpty(stringArrayExtra[i4])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
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
        U0.a.b(abstractActivityC0319o, stringArrayExtra, i3);
    }
}
