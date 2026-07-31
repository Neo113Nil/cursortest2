package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lt1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r32 f28774a;

    public /* synthetic */ lt1() {
        this(new r32());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Point a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        final WindowManager windowManager = (WindowManager) systemService;
        r32 r32Var = this.f28774a;
        Callable callable = new Callable() { // from class: com.yandex.mobile.ads.impl.P9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Display a4;
                a4 = lt1.a(windowManager);
                return a4;
            }
        };
        r32Var.getClass();
        final Display display = (Display) r32.a(callable, windowManager, "getting display", "WindowManager");
        final Point point = new Point(0, 0);
        r32 r32Var2 = this.f28774a;
        Callable tryBlock = new Callable() { // from class: com.yandex.mobile.ads.impl.Q9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Point a4;
                a4 = lt1.a(display, point, this);
                return a4;
            }
        };
        r32Var2.getClass();
        Intrinsics.checkNotNullParameter(tryBlock, "tryBlock");
        Intrinsics.checkNotNullParameter("getting display metrics", "whileWhat");
        Intrinsics.checkNotNullParameter("Display", "whatIsNull");
        Object a4 = r32.a(tryBlock, display, "getting display metrics", "Display");
        if (a4 != 0) {
            point = a4;
        }
        return point;
    }

    public lt1(@NotNull r32 systemServiceUtils) {
        Intrinsics.checkNotNullParameter(systemServiceUtils, "systemServiceUtils");
        this.f28774a = systemServiceUtils;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Display a(WindowManager windowManager) {
        Intrinsics.checkNotNullParameter(windowManager, "$windowManager");
        return windowManager.getDefaultDisplay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point a(Display display, Point defaultPoint, lt1 this$0) {
        Intrinsics.checkNotNullParameter(defaultPoint, "$defaultPoint");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (display == null) {
            return defaultPoint;
        }
        this$0.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
