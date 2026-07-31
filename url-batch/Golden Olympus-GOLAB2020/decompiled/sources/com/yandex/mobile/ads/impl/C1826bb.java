package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1826bb implements InterfaceC2283v<C1802ab> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2158pb f23650a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1920f9 f23651b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final np1 f23652c;

    public C1826bb(@NotNull C2158pb adtuneRenderer, @NotNull C1920f9 adTracker, @NotNull np1 reporter) {
        Intrinsics.checkNotNullParameter(adtuneRenderer, "adtuneRenderer");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f23650a = adtuneRenderer;
        this.f23651b = adTracker;
        this.f23652c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2283v
    public final ve0 a(View view, C1802ab c1802ab) {
        C1802ab action = c1802ab;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<String> it = action.b().iterator();
        while (it.hasNext()) {
            this.f23651b.a(it.next(), o62.f29917b);
        }
        this.f23650a.a(view, action);
        this.f23652c.a(ip1.b.f27351j);
        return new ve0(false);
    }
}
