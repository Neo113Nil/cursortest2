package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n51 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f29442c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile n51 f29443d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f29444e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f29445a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29446b;

    public static final class a {
        @NotNull
        public static n51 a() {
            if (n51.f29443d == null) {
                synchronized (n51.f29442c) {
                    try {
                        if (n51.f29443d == null) {
                            n51.f29443d = new n51();
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            n51 n51Var = n51.f29443d;
            if (n51Var != null) {
                return n51Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* synthetic */ n51() {
        this(new Handler(Looper.getMainLooper()));
    }

    private final void a(final View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f29446b) {
                view.setAlpha(view.getAlpha() / 2);
                this.f29446b = true;
            }
            this.f29445a.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.Oa
                @Override // java.lang.Runnable
                public final void run() {
                    n51.a(n51.this, view);
                }
            }, 100L);
        }
    }

    public final void b(@NotNull View view, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if ((view instanceof TextView) || (view instanceof gn1)) {
            a(view, motionEvent);
        }
    }

    private n51(Handler handler) {
        this.f29445a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(n51 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        if (this$0.f29446b) {
            view.setAlpha(view.getAlpha() * 2);
            this$0.f29446b = false;
        }
    }
}
