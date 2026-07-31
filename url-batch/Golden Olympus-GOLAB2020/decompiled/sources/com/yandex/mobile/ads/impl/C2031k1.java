package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2031k1 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f27968b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile C2031k1 f27969c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f27970a;

    /* renamed from: com.yandex.mobile.ads.impl.k1$a */
    public static final class a {
        private a() {
        }

        @NotNull
        public final C2031k1 a() {
            C2031k1 c2031k1;
            C2031k1 c2031k12 = C2031k1.f27969c;
            if (c2031k12 != null) {
                return c2031k12;
            }
            synchronized (this) {
                c2031k1 = C2031k1.f27969c;
                if (c2031k1 == null) {
                    c2031k1 = new C2031k1(0);
                    C2031k1.f27969c = c2031k1;
                }
            }
            return c2031k1;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    private C2031k1() {
        this.f27970a = new LinkedHashMap();
        a("window_type_browser", new C2261u0());
        a("window_type_activity_result", new C2125o1());
    }

    @Nullable
    public final synchronized InterfaceC1984i1 a(@NotNull Activity activity, @NotNull RelativeLayout rootLayout, @NotNull C2193r1 listener, @NotNull C1792a1 eventController, @NotNull Intent intent, @NotNull Window window, @Nullable C2353y0 c2353y0) {
        InterfaceC2007j1 interfaceC2007j1;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(window, "window");
        String stringExtra = intent.getStringExtra("window_type");
        if (stringExtra == null || (interfaceC2007j1 = (InterfaceC2007j1) this.f27970a.get(stringExtra)) == null) {
            return null;
        }
        return interfaceC2007j1.a(activity, rootLayout, listener, eventController, intent, window, c2353y0);
    }

    public final synchronized void a(@NotNull String windowType, @NotNull InterfaceC2007j1 creator) {
        Intrinsics.checkNotNullParameter(windowType, "windowType");
        Intrinsics.checkNotNullParameter(creator, "creator");
        if (!this.f27970a.containsKey(windowType)) {
            this.f27970a.put(windowType, creator);
        }
    }

    public /* synthetic */ C2031k1(int i4) {
        this();
    }
}
