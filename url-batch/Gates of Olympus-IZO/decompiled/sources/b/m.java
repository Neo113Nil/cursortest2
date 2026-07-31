package b;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import e.C0329a;
import e.C0331c;
import e.C0334f;
import f.AbstractC0382a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4167a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4168b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4169c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4170d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f4171e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f4172f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f4173g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f4174h;

    public m(o oVar) {
        this.f4174h = oVar;
    }

    public final boolean a(int i3, int i4, Intent intent) {
        String str = (String) this.f4167a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        C0331c c0331c = (C0331c) this.f4171e.get(str);
        if ((c0331c != null ? c0331c.f4460a : null) != null) {
            ArrayList arrayList = this.f4170d;
            if (arrayList.contains(str)) {
                c0331c.f4460a.b(c0331c.f4461b.u(intent, i4));
                arrayList.remove(str);
                return true;
            }
        }
        this.f4172f.remove(str);
        this.f4173g.putParcelable(str, new C0329a(intent, i4));
        return true;
    }

    public final void b(final int i3, AbstractC0382a abstractC0382a, Object obj) {
        Bundle bundle;
        o oVar = this.f4174h;
        final F0.a q2 = abstractC0382a.q(oVar, obj);
        if (q2 != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable(i3, q2) { // from class: b.k

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f4162e;

                @Override // java.lang.Runnable
                public final void run() {
                    m mVar = m.this;
                    Z1.i.f(mVar, "this$0");
                    Boolean bool = Boolean.TRUE;
                    String str = (String) mVar.f4167a.get(Integer.valueOf(this.f4162e));
                    if (str == null) {
                        return;
                    }
                    C0331c c0331c = (C0331c) mVar.f4171e.get(str);
                    if ((c0331c != null ? c0331c.f4460a : null) == null) {
                        mVar.f4173g.remove(str);
                        mVar.f4172f.put(str, bool);
                    } else {
                        D1.h hVar = c0331c.f4460a;
                        if (mVar.f4170d.remove(str)) {
                            hVar.b(bool);
                        }
                    }
                }
            });
            return;
        }
        Intent h3 = abstractC0382a.h(oVar, obj);
        if (h3.getExtras() != null) {
            Bundle extras = h3.getExtras();
            Z1.i.c(extras);
            if (extras.getClassLoader() == null) {
                h3.setExtrasClassLoader(oVar.getClassLoader());
            }
        }
        if (h3.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = h3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            h3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(h3.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(h3.getAction())) {
                oVar.startActivityForResult(h3, i3, bundle);
                return;
            }
            C0334f c0334f = (C0334f) h3.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Z1.i.c(c0334f);
                oVar.startIntentSenderForResult(c0334f.f4465d, i3, c0334f.f4466e, c0334f.f4467f, c0334f.f4468g, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e3) {
                new Handler(Looper.getMainLooper()).post(new l(this, i3, e3, 0));
                return;
            }
        }
        String[] stringArrayExtra = h3.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
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
        S0.a.b(oVar, stringArrayExtra, i3);
    }
}
