package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Y1 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38546a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public volatile U7 f38547b = null;

    public final void a(@NonNull U7 u7) {
        ArrayList a4;
        synchronized (this) {
            this.f38547b = u7;
            a4 = a();
        }
        int size = a4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = a4.get(i4);
            i4++;
            ((InterfaceC2885pe) obj).consume(u7);
        }
    }

    public final void b() {
        C3082x4.l().f40120e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C3082x4.l().f40120e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new W1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        X1 x12 = new X1(dataString);
        synchronized (this) {
            try {
                U7 u7 = this.f38547b;
                if (u7 == null) {
                    this.f38546a.add(x12);
                } else {
                    ((U9) C3082x4.l().f40118c.a()).f38354b.post(new V1(x12, u7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f38546a);
        this.f38546a.clear();
        return arrayList;
    }
}
