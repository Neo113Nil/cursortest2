package a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.AbstractActivityC0064v;
import c.AbstractC0102i;
import c.C0103j;
import d.AbstractC0104a;
import java.util.Arrays;
import java.util.HashSet;
import z.AbstractC0368b;

/* loaded from: classes.dex */
public final class n extends AbstractC0102i {
    public final /* synthetic */ AbstractActivityC0064v h;

    public n(AbstractActivityC0064v abstractActivityC0064v) {
        this.h = abstractActivityC0064v;
    }

    @Override // c.AbstractC0102i
    public final void b(int i, AbstractC0104a abstractC0104a, Object obj) {
        Bundle bundle;
        X0.f.e(abstractC0104a, "contract");
        AbstractActivityC0064v abstractActivityC0064v = this.h;
        B0.d b2 = abstractC0104a.b(abstractActivityC0064v, obj);
        if (b2 != null) {
            new Handler(Looper.getMainLooper()).post(new m(this, i, b2, 0));
            return;
        }
        Intent a2 = abstractC0104a.a(abstractActivityC0064v, obj);
        if (a2.getExtras() != null) {
            Bundle extras = a2.getExtras();
            X0.f.b(extras);
            if (extras.getClassLoader() == null) {
                a2.setExtrasClassLoader(abstractActivityC0064v.getClassLoader());
            }
        }
        if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                abstractActivityC0064v.startActivityForResult(a2, i, bundle);
                return;
            }
            C0103j c0103j = (C0103j) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                X0.f.b(c0103j);
                abstractActivityC0064v.startIntentSenderForResult(c0103j.f1667a, i, c0103j.f1668b, c0103j.f1669c, c0103j.f1670d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e2) {
                new Handler(Looper.getMainLooper()).post(new m(this, i, e2, 1));
                return;
            }
        }
        String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < stringArrayExtra.length; i2++) {
            if (TextUtils.isEmpty(stringArrayExtra[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
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
        abstractActivityC0064v.validateRequestPermissionsRequestCode(i);
        AbstractC0368b.b(abstractActivityC0064v, stringArrayExtra, i);
    }
}
