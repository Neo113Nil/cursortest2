package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vx extends i4 {
    public final /* synthetic */ kr0 h;

    public vx(kr0 kr0Var) {
        this.h = kr0Var;
    }

    @Override // defpackage.i4
    public final void b(int i, w3 w3Var, Object obj) {
        Bundle bundle;
        int i2;
        w3Var.getClass();
        kr0 kr0Var = this.h;
        v3 synchronousResult = w3Var.getSynchronousResult(kr0Var, obj);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new ux(i, 0, this, synchronousResult));
            return;
        }
        Intent createIntent = w3Var.createIntent(kr0Var, obj);
        if (createIntent.getExtras() != null) {
            Bundle extras = createIntent.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                createIntent.setExtrasClassLoader(kr0Var.getClassLoader());
            }
        }
        if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(createIntent.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(createIntent.getAction())) {
                kr0Var.startActivityForResult(createIntent, i, bundle2);
                return;
            }
            z31 z31Var = (z31) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                z31Var.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                kr0Var.startIntentSenderForResult(z31Var.m, i2, z31Var.n, z31Var.o, z31Var.p, 0, bundle2);
                Unit unit = Unit.a;
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new ux(i2, 1, this, e));
                return;
            }
        }
        String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                lh.e(q40.p(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                return;
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
        kr0Var.validateRequestPermissionsRequestCode(i);
        kr0Var.requestPermissions(stringArrayExtra, i);
    }
}
