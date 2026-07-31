package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f60 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2396zk f25653a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1940g5 f25654b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final r60 f25655c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mp1 f25656d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1824b9 f25657e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C1963h4 f25658f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2311w4 f25659g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2294va f25660h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Handler f25661i;

    public f60(@NotNull C2396zk bindingControllerHolder, @NotNull C2384z8 adStateDataController, @NotNull C1940g5 adPlayerEventsController, @NotNull r60 playerProvider, @NotNull mp1 reporter, @NotNull C1824b9 adStateHolder, @NotNull C1963h4 adInfoStorage, @NotNull C2311w4 adPlaybackStateController, @NotNull C2294va adsLoaderPlaybackErrorConverter, @NotNull Handler prepareCompleteHandler) {
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
        this.f25653a = bindingControllerHolder;
        this.f25654b = adPlayerEventsController;
        this.f25655c = playerProvider;
        this.f25656d = reporter;
        this.f25657e = adStateHolder;
        this.f25658f = adInfoStorage;
        this.f25659g = adPlaybackStateController;
        this.f25660h = adsLoaderPlaybackErrorConverter;
        this.f25661i = prepareCompleteHandler;
    }

    private final void a(int i4, int i5, IOException iOException) {
        AdPlaybackState withAdLoadError = this.f25659g.a().withAdLoadError(i4, i5);
        Intrinsics.checkNotNullExpressionValue(withAdLoadError, "withAdLoadError(...)");
        this.f25659g.a(withAdLoadError);
        on0 a4 = this.f25658f.a(new C1843c4(i4, i5));
        if (a4 == null) {
            ap0.b(new Object[0]);
            return;
        }
        this.f25657e.a(a4, em0.f25356g);
        this.f25660h.getClass();
        this.f25654b.a(a4, C2294va.c(iOException));
    }

    public final void b(int i4, int i5, @NotNull IOException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (!this.f25655c.b() || !this.f25653a.b()) {
            ap0.f(new Object[0]);
            return;
        }
        try {
            a(i4, i5, exception);
        } catch (RuntimeException e4) {
            ap0.b(e4);
            this.f25656d.reportError("Unexpected exception while handling prepare error", e4);
        }
    }

    public final void a(int i4, int i5) {
        a(i4, i5, SystemClock.elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f60 this$0, int i4, int i5, long j4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(i4, i5, j4);
    }

    private final void a(final int i4, final int i5, final long j4) {
        if (SystemClock.elapsedRealtime() - j4 < 200) {
            Player a4 = this.f25655c.a();
            if (a4 != null && a4.getDuration() != -9223372036854775807L) {
                on0 a5 = this.f25658f.a(new C1843c4(i4, i5));
                if (a5 != null) {
                    this.f25657e.a(a5, em0.f25352c);
                    this.f25654b.b(a5);
                    return;
                } else {
                    ap0.b(new Object[0]);
                    return;
                }
            }
            this.f25661i.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.H2
                @Override // java.lang.Runnable
                public final void run() {
                    f60.a(f60.this, i4, i5, j4);
                }
            }, 20L);
            return;
        }
        on0 a6 = this.f25658f.a(new C1843c4(i4, i5));
        if (a6 != null) {
            this.f25657e.a(a6, em0.f25352c);
            this.f25654b.b(a6);
        } else {
            ap0.b(new Object[0]);
        }
    }
}
