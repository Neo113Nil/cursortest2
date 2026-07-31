package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.ea0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oa0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f29951a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final np1 f29952b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final v61 f29953c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e51 f29954d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final na0 f29955e;

    public oa0(@NotNull C2286v2 adConfiguration, @NotNull np1 reporter, @NotNull v61 nativeAdViewAdapter, @NotNull e51 nativeAdEventController, @NotNull na0 feedbackMenuCreator) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(feedbackMenuCreator, "feedbackMenuCreator");
        this.f29951a = adConfiguration;
        this.f29952b = reporter;
        this.f29953c = nativeAdViewAdapter;
        this.f29954d = nativeAdEventController;
        this.f29955e = feedbackMenuCreator;
    }

    public final void a(@NotNull Context context, @NotNull ea0 action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        View a4 = this.f29953c.h().a("feedback");
        ImageView imageView = a4 instanceof ImageView ? (ImageView) a4 : null;
        if (imageView == null) {
            return;
        }
        List<ea0.a> c4 = action.c();
        if (c4.isEmpty()) {
            return;
        }
        try {
            C1920f9 c1920f9 = new C1920f9(context, this.f29951a);
            this.f29955e.getClass();
            PopupMenu a5 = na0.a(context, imageView, c4);
            a5.setOnMenuItemClickListener(new ej1(c1920f9, c4, this.f29952b, this.f29954d));
            a5.show();
        } catch (Exception e4) {
            Object[] args = new Object[0];
            int i4 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
            this.f29951a.p().c().reportError("Failed to render feedback", e4);
        }
    }
}
