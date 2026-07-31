package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v72 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f33541a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f33542b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33543c = 0;

    private v72() {
    }

    public static void a(Context context, mp1 reporter) {
        m42 threadUtils = new m42();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(threadUtils, "threadUtils");
        if (f33541a) {
            return;
        }
        synchronized (f33542b) {
            try {
                if (!f33541a) {
                    int i4 = ew1.f25476l;
                    du1 a4 = ew1.a.a().a(context);
                    if (a4 != null && a4.p()) {
                        u72 handler = new u72(reporter, Thread.getDefaultUncaughtExceptionHandler(), a4);
                        Intrinsics.checkNotNullParameter(handler, "handler");
                        Thread.setDefaultUncaughtExceptionHandler(handler);
                        f33541a = true;
                    }
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
