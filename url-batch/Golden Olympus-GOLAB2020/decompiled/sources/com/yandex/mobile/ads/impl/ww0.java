package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.pw0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ww0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f34214a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xw0 f34215b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34216c;

    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CustomizableMediaView f34218b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ pw0.a f34219c;

        a(CustomizableMediaView customizableMediaView, pw0.a aVar) {
            this.f34218b = customizableMediaView;
            this.f34219c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ww0.this.f34215b.a(this.f34218b, this.f34219c.a());
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ww0(Context context, C2286v2 c2286v2) {
        this(context, c2286v2, new xw0(r1, c2286v2));
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    public final void a(@NotNull CustomizableMediaView mediaView, @NotNull pw0.a type) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.f34216c) {
            if (this.f34214a.b() == gs.f26283g) {
                lh2.a(mediaView, new a(mediaView, type));
            }
            this.f34216c = false;
        }
    }

    public ww0(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull xw0 mediaViewSizeInfoController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(mediaViewSizeInfoController, "mediaViewSizeInfoController");
        this.f34214a = adConfiguration;
        this.f34215b = mediaViewSizeInfoController;
        this.f34216c = true;
    }
}
