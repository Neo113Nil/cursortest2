package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.k;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class yb extends i2 {
    public final /* synthetic */ k h;

    public yb(k kVar) {
        this.h = kVar;
    }

    @Override // defpackage.i2
    public final void b(int i, z1 z1Var, Object obj) {
        Bundle bundle;
        int i2;
        z1Var.getClass();
        k kVar = this.h;
        y1 b = z1Var.b(kVar, obj);
        if (b != null) {
            new Handler(Looper.getMainLooper()).post(new xb(this, i, b, 0));
            return;
        }
        Intent a = z1Var.a(kVar, obj);
        if (a.getExtras() != null) {
            Bundle extras = a.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                a.setExtrasClassLoader(kVar.getClassLoader());
            }
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                kVar.startActivityForResult(a, i, bundle2);
                return;
            }
            mp mpVar = (mp) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                mpVar.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                kVar.startIntentSenderForResult(mpVar.f, i2, mpVar.g, mpVar.h, mpVar.i, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new xb(this, i2, e, 1));
                return;
            }
        }
        String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr[i4] = stringArrayExtra[i5];
                    i4++;
                }
            }
        }
        kVar.requestPermissions(stringArrayExtra, i);
    }
}
