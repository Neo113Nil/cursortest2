package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762q {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f8107a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC0736p enumC0736p) {
        if (activity != null && this.f8107a.get(activity) == enumC0736p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f8107a.put(activity, enumC0736p);
        return true;
    }
}
