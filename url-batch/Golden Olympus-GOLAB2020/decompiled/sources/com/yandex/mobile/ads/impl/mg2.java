package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.n51;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mg2 implements jo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f29055a;

    public mg2(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f29055a = view;
    }

    @Override // com.yandex.mobile.ads.impl.jo
    public final void a(@NotNull dr0 link, @NotNull lo clickListenerCreator) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        Context context = this.f29055a.getContext();
        View.OnClickListener a4 = clickListenerCreator.a(link);
        Intrinsics.checkNotNull(context);
        co coVar = new co(context, a4);
        int i4 = n51.f29444e;
        t61 t61Var = new t61(context, a4, coVar, n51.a.a());
        this.f29055a.setOnTouchListener(t61Var);
        this.f29055a.setOnClickListener(t61Var);
    }
}
