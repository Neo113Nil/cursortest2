package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xw0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f34694a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fh2 f34695b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final eh2 f34696c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Executor f34697d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xw0(@NotNull Context context, @NotNull C2286v2 adConfiguration) {
        this(adConfiguration, new fh2(context), new eh2(context, adConfiguration));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
    }

    public final void a(@NotNull CustomizableMediaView view, @NotNull String mediaType) {
        Intrinsics.checkNotNullParameter(view, "mediaView");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        String c4 = this.f34694a.c();
        if (c4 != null) {
            int n4 = this.f34694a.n();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            final ch2 a4 = gh2.a(view, mediaType);
            final hh2 hh2Var = new hh2(n4, c4);
            this.f34697d.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.Jl
                @Override // java.lang.Runnable
                public final void run() {
                    xw0.a(xw0.this, hh2Var, a4);
                }
            });
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ xw0(C2286v2 c2286v2, fh2 fh2Var, eh2 eh2Var) {
        this(c2286v2, fh2Var, eh2Var, r0);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
    }

    public xw0(@NotNull C2286v2 adConfiguration, @NotNull fh2 viewSizeInfoStorage, @NotNull eh2 viewSizeInfoReporter, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(viewSizeInfoStorage, "viewSizeInfoStorage");
        Intrinsics.checkNotNullParameter(viewSizeInfoReporter, "viewSizeInfoReporter");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f34694a = adConfiguration;
        this.f34695b = viewSizeInfoStorage;
        this.f34696c = viewSizeInfoReporter;
        this.f34697d = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xw0 this$0, hh2 viewSizeKey, ch2 viewSizeInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewSizeKey, "$viewSizeKey");
        Intrinsics.checkNotNullParameter(viewSizeInfo, "$viewSizeInfo");
        this$0.f34695b.a(viewSizeKey, viewSizeInfo);
        this$0.f34696c.a(viewSizeInfo, this$0.f34694a);
    }
}
