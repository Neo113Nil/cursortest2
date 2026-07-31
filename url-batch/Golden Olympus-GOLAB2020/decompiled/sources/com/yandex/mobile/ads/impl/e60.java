package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Player;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e60 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2373yk f25105a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1916f5 f25106b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q60 f25107c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mp1 f25108d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1800a9 f25109e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C1939g4 f25110f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2288v4 f25111g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2271ua f25112h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Handler f25113i;

    public e60(@NotNull C2373yk bindingControllerHolder, @NotNull C2361y8 adStateDataController, @NotNull C1916f5 adPlayerEventsController, @NotNull q60 playerProvider, @NotNull mp1 reporter, @NotNull C1800a9 adStateHolder, @NotNull C1939g4 adInfoStorage, @NotNull C2288v4 adPlaybackStateController, @NotNull C2271ua adsLoaderPlaybackErrorConverter, @NotNull Handler prepareCompleteHandler) {
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adInfoStorage, "adInfoStorage");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(adsLoaderPlaybackErrorConverter, "adsLoaderPlaybackErrorConverter");
        Intrinsics.checkNotNullParameter(prepareCompleteHandler, "prepareCompleteHandler");
        this.f25105a = bindingControllerHolder;
        this.f25106b = adPlayerEventsController;
        this.f25107c = playerProvider;
        this.f25108d = reporter;
        this.f25109e = adStateHolder;
        this.f25110f = adInfoStorage;
        this.f25111g = adPlaybackStateController;
        this.f25112h = adsLoaderPlaybackErrorConverter;
        this.f25113i = prepareCompleteHandler;
    }

    private final void a(int i4, int i5, IOException iOException) {
        AdPlaybackState withAdLoadError = this.f25111g.a().withAdLoadError(i4, i5);
        Intrinsics.checkNotNullExpressionValue(withAdLoadError, "withAdLoadError(...)");
        this.f25111g.a(withAdLoadError);
        on0 a4 = this.f25110f.a(new C1819b4(i4, i5));
        if (a4 == null) {
            ap0.b(new Object[0]);
            return;
        }
        this.f25109e.a(a4, dm0.f24683g);
        this.f25112h.getClass();
        this.f25106b.a(a4, C2271ua.c(iOException));
    }

    public final void b(int i4, int i5, @NotNull IOException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (!this.f25107c.b() || !this.f25105a.b()) {
            ap0.f(new Object[0]);
            return;
        }
        try {
            a(i4, i5, exception);
        } catch (RuntimeException e4) {
            ap0.b(e4);
            this.f25108d.reportError("Unexpected exception while handling prepare error", e4);
        }
    }

    public final void a(int i4, int i5) {
        a(i4, i5, SystemClock.elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e60 this$0, int i4, int i5, long j4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(i4, i5, j4);
    }

    private final void a(final int i4, final int i5, final long j4) {
        if (SystemClock.elapsedRealtime() - j4 < 200) {
            Player a4 = this.f25107c.a();
            if (a4 != null && a4.getDuration() != -9223372036854775807L) {
                on0 a5 = this.f25110f.a(new C1819b4(i4, i5));
                if (a5 != null) {
                    this.f25109e.a(a5, dm0.f24679c);
                    this.f25106b.b(a5);
                    return;
                } else {
                    ap0.b(new Object[0]);
                    return;
                }
            }
            this.f25113i.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.I1
                @Override // java.lang.Runnable
                public final void run() {
                    e60.a(e60.this, i4, i5, j4);
                }
            }, 20L);
            return;
        }
        on0 a6 = this.f25110f.a(new C1819b4(i4, i5));
        if (a6 != null) {
            this.f25109e.a(a6, dm0.f24679c);
            this.f25106b.b(a6);
        } else {
            ap0.b(new Object[0]);
        }
    }
}
