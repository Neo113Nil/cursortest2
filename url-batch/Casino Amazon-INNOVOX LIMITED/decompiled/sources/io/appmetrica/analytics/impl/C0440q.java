package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0440q {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f1442a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC0415p enumC0415p) {
        if (activity != null && this.f1442a.get(activity) == enumC0415p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f1442a.put(activity, enumC0415p);
        return true;
    }
}
