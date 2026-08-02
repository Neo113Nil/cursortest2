package b;

import E.AbstractC0005f;
import W.RunnableC0117j;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import e.AbstractC0390a;
import java.util.Arrays;
import java.util.HashSet;
import t.InterfaceC1413a;

/* renamed from: b.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251l extends d.h {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0253n f5229h;

    public C0251l(AbstractActivityC0253n abstractActivityC0253n) {
        this.f5229h = abstractActivityC0253n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.h
    public final void b(int i4, AbstractC0390a contract, Object obj) {
        Bundle bundle;
        int i5;
        kotlin.jvm.internal.i.e(contract, "contract");
        AbstractActivityC0253n abstractActivityC0253n = this.f5229h;
        N1.c b4 = contract.b(abstractActivityC0253n, obj);
        if (b4 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0117j(this, i4, b4, 1));
            return;
        }
        Intent a3 = contract.a(abstractActivityC0253n, obj);
        if (a3.getExtras() != null) {
            Bundle extras = a3.getExtras();
            kotlin.jvm.internal.i.b(extras);
            if (extras.getClassLoader() == null) {
                a3.setExtrasClassLoader(abstractActivityC0253n.getClassLoader());
            }
        }
        if (a3.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a3.getAction())) {
            String[] stringArrayExtra = a3.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i6 = 0; i6 < stringArrayExtra.length; i6++) {
                if (TextUtils.isEmpty(stringArrayExtra[i6])) {
                    throw new IllegalArgumentException(AbstractC0005f.q(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i6], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i6));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i7 = 0;
                for (int i8 = 0; i8 < stringArrayExtra.length; i8++) {
                    if (!hashSet.contains(Integer.valueOf(i8))) {
                        strArr[i7] = stringArrayExtra[i8];
                        i7++;
                    }
                }
            }
            if (abstractActivityC0253n instanceof InterfaceC1413a) {
                ((InterfaceC1413a) abstractActivityC0253n).validateRequestPermissionsRequestCode(i4);
            }
            abstractActivityC0253n.requestPermissions(stringArrayExtra, i4);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a3.getAction())) {
            abstractActivityC0253n.startActivityForResult(a3, i4, bundle2);
            return;
        }
        d.j jVar = (d.j) a3.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            kotlin.jvm.internal.i.b(jVar);
            i5 = i4;
            try {
                abstractActivityC0253n.startIntentSenderForResult(jVar.f8080a, i5, jVar.f8081b, jVar.f8082c, jVar.f8083d, 0, bundle2);
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                new Handler(Looper.getMainLooper()).post(new RunnableC0117j(this, i5, e, 2));
            }
        } catch (IntentSender.SendIntentException e5) {
            e = e5;
            i5 = i4;
        }
    }
}
