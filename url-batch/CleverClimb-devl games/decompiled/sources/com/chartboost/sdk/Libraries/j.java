package com.chartboost.sdk.Libraries;

import android.app.Activity;
import com.chartboost.sdk.impl.aq;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j extends WeakReference<Activity> {

    /* renamed from: a, reason: collision with root package name */
    public final int f3599a;

    public j(Activity activity) {
        super(activity);
        aq.a("WeakActivity.WeakActivity", activity);
        this.f3599a = activity.hashCode();
    }

    public boolean a(Activity activity) {
        return activity != null && activity.hashCode() == this.f3599a;
    }

    public int hashCode() {
        return this.f3599a;
    }
}
