package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import c7.c0;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.s6;
import g8.g;
import h8.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s7.r2;
import x8.c;
import x8.d;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f3067b;

    /* renamed from: a, reason: collision with root package name */
    public final d7 f3068a;

    public FirebaseAnalytics(d7 d7Var) {
        c0.g(d7Var);
        this.f3068a = d7Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f3067b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f3067b == null) {
                        f3067b = new FirebaseAnalytics(d7.c(context, null));
                    }
                } finally {
                }
            }
        }
        return f3067b;
    }

    public static r2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        d7 c10 = d7.c(context, bundle);
        if (c10 == null) {
            return null;
        }
        return new a(c10);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = c.f10546m;
            return (String) w.g(((c) g.c().b(d.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        } catch (ExecutionException e9) {
            throw new IllegalStateException(e9.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        p6 b10 = p6.b(activity);
        d7 d7Var = this.f3068a;
        d7Var.getClass();
        d7Var.a(new s6(d7Var, b10, str, str2));
    }
}
