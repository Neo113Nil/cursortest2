package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1350p {

    /* renamed from: a, reason: collision with root package name */
    public static final C1350p f12671a = new C1350p();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f12672b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.p$a */
    public static final class a extends AbstractC1341g {
        @Override // androidx.lifecycle.AbstractC1341g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            H.f12575b.c(activity);
        }
    }

    private C1350p() {
    }

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f12672b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
