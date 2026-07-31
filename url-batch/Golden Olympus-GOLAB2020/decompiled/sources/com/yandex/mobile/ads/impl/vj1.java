package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vj1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1911f0 f33655a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sj1 f33656b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2079m1 f33657c;

    public /* synthetic */ vj1(C2286v2 c2286v2, C2360y7 c2360y7) {
        this(c2286v2, c2360y7, new C1911f0(), new sj1(), new C2079m1(c2286v2, c2360y7));
    }

    public final boolean a(@NotNull Context context, @NotNull List<rj1> preferredPackages) {
        Activity activity;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferredPackages, "preferredPackages");
        Activity a4 = C2054l0.a();
        if (a4 != null) {
            context = a4;
        } else {
            this.f33655a.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Context context2 = context;
            int i4 = 0;
            while (context2 instanceof ContextWrapper) {
                int i5 = i4 + 1;
                if (i4 >= 10) {
                    break;
                }
                if (context2 instanceof Activity) {
                    activity = (Activity) context2;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
                i4 = i5;
            }
            activity = null;
            if (activity != null) {
                context = activity;
            }
        }
        for (rj1 rj1Var : preferredPackages) {
            try {
                this.f33656b.getClass();
                Intent a5 = sj1.a(context, rj1Var);
                if (rj1Var.c() == my.f29301d) {
                    this.f33657c.a(context, a5);
                    return true;
                }
                context.startActivity(a5);
                return true;
            } catch (Exception unused) {
                ap0.b(rj1Var.d());
            }
        }
        return false;
    }

    public vj1(@NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull C1911f0 activityContextProvider, @NotNull sj1 preferredPackageIntentCreator, @NotNull C2079m1 adActivityResultLauncher) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(activityContextProvider, "activityContextProvider");
        Intrinsics.checkNotNullParameter(preferredPackageIntentCreator, "preferredPackageIntentCreator");
        Intrinsics.checkNotNullParameter(adActivityResultLauncher, "adActivityResultLauncher");
        this.f33655a = activityContextProvider;
        this.f33656b = preferredPackageIntentCreator;
        this.f33657c = adActivityResultLauncher;
    }
}
