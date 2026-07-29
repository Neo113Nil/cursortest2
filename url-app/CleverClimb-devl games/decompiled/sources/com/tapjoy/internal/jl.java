package com.tapjoy.internal;

import android.app.Notification;
import android.os.Bundle;
import android.support.v4.app.NotificationCompatExtras;
import android.support.v4.app.NotificationCompatJellybean;
import android.util.Log;
import android.util.SparseArray;
import com.tapjoy.internal.jj;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
final class jl {

    /* renamed from: b, reason: collision with root package name */
    private static Field f8463b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f8464c;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8462a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f8465d = new Object();

    public static SparseArray a(List list) {
        int size = list.size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle a(Notification notification) {
        synchronized (f8462a) {
            if (f8464c) {
                return null;
            }
            try {
                if (f8463b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(NotificationCompatJellybean.TAG, "Notification.extras field is not of type Bundle");
                        f8464c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f8463b = declaredField;
                }
                Bundle bundle = (Bundle) f8463b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f8463b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e);
                f8464c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e2);
                f8464c = true;
                return null;
            }
        }
    }

    private static Bundle[] a(jm[] jmVarArr) {
        if (jmVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[jmVarArr.length];
        for (int i = 0; i < jmVarArr.length; i++) {
            jm jmVar = jmVarArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", jmVar.f8466a);
            bundle.putCharSequence("label", jmVar.f8467b);
            bundle.putCharSequenceArray("choices", jmVar.f8468c);
            bundle.putBoolean("allowFreeFormInput", jmVar.f8469d);
            bundle.putBundle("extras", jmVar.e);
            Set set = jmVar.f;
            if (set != null && !set.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public static Bundle a(Notification.Builder builder, jj.a aVar) {
        builder.addAction(aVar.e, aVar.f, aVar.g);
        Bundle bundle = new Bundle(aVar.f8446a);
        if (aVar.f8447b != null) {
            bundle.putParcelableArray(NotificationCompatExtras.EXTRA_REMOTE_INPUTS, a(aVar.f8447b));
        }
        if (aVar.f8448c != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", a(aVar.f8448c));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f8449d);
        return bundle;
    }
}
