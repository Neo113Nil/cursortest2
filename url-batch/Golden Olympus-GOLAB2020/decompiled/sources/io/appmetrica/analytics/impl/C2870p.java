package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2870p {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f39592a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC2844o enumC2844o) {
        if (activity != null && this.f39592a.get(activity) == enumC2844o) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f39592a.put(activity, enumC2844o);
        return true;
    }
}
