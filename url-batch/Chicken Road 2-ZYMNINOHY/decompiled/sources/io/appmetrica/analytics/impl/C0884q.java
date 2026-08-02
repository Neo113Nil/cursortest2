package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884q {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f12595a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC0858p enumC0858p) {
        if (activity != null && this.f12595a.get(activity) == enumC0858p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f12595a.put(activity, enumC0858p);
        return true;
    }
}
