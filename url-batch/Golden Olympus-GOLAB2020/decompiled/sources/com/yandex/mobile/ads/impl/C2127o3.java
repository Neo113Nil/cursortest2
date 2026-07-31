package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C2127o3;
import com.yandex.mobile.ads.impl.in0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2127o3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ss f29877a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gm0 f29878b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2173q3 f29879c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final in0 f29880d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1986i3 f29881e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final cb2 f29882f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2104n3 f29883g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2081m3 f29884h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final sk1 f29885i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29886j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29887k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29888l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.o3$a */
    final class a implements xu {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC2173q3 f29889a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2127o3 f29890b;

        public a(C2127o3 c2127o3, @NotNull InterfaceC2173q3 adGroupPlaybackListener) {
            Intrinsics.checkNotNullParameter(adGroupPlaybackListener, "adGroupPlaybackListener");
            this.f29890b = c2127o3;
            this.f29889a = adGroupPlaybackListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C2127o3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f29879c.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(C2127o3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f29879c.j();
        }

        @Override // com.yandex.mobile.ads.impl.xu
        public final void b(@NotNull ob2<on0> videoAdInfo) {
            Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
            this.f29889a.e();
        }

        @Override // com.yandex.mobile.ads.impl.xu
        public final void d(@NotNull ob2<on0> videoAdInfo) {
            Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
            if (!this.f29890b.f29888l) {
                this.f29890b.f29888l = true;
                this.f29889a.h();
            }
            this.f29889a.i();
            if (this.f29890b.f29886j) {
                this.f29890b.f29886j = false;
                this.f29890b.d();
            }
        }

        @Override // com.yandex.mobile.ads.impl.xu
        public final void e(@NotNull ob2<on0> videoAdInfo) {
            Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
            if (this.f29890b.f29881e.f() != null) {
                this.f29890b.f29878b.a();
                return;
            }
            final C2127o3 c2127o3 = this.f29890b;
            Runnable runnable = new Runnable() { // from class: com.yandex.mobile.ads.impl.Fb
                @Override // java.lang.Runnable
                public final void run() {
                    C2127o3.a.e(C2127o3.this);
                }
            };
            this.f29890b.f29878b.a();
            runnable.run();
        }

        @Override // com.yandex.mobile.ads.impl.xu
        public final void f(@NotNull ob2<on0> videoAdInfo) {
            Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
            this.f29889a.d();
        }

        @Override // com.yandex.mobile.ads.impl.xu
        public final void g(@NotNull ob2<on0> videoAdInfo) {
            Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
            final C2127o3 c2127o3 = this.f29890b;
            Runnable runnable = new Runnable() { // from class: com.yandex.mobile.ads.impl.Jb
                @Override // java.lang.Runnable
                public final void run() {
                    C2127o3.a.a(C2127o3.this);
                }
            };
            if (this.f29890b.f29881e.f() != null) {
                this.f29890b.f29884h.a(true);
            } else {
                this.f29890b.f29878b.a();
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C2127o3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f29883g.d();
            this$0.f29879c.k();
        }

        @Override // com.yandex.mobile.ads.impl.xu
        public final void a(@NotNull ob2<on0> videoAdInfo, @NotNull mc2 videoAdPlayerError) {
            Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
            Intrinsics.checkNotNullParameter(videoAdPlayerError, "videoAdPlayerError");
            C2195r3 a4 = this.f29890b.f29881e.a(videoAdInfo);
            fd2 b4 = a4 != null ? a4.b() : null;
            boolean areEqual = Intrinsics.areEqual(this.f29890b.f29881e.c(), videoAdInfo);
            if ((b4 != null ? b4.a() : null) != ed2.f25247k) {
                if (areEqual) {
                    final C2127o3 c2127o3 = this.f29890b;
                    Runnable runnable = new Runnable() { // from class: com.yandex.mobile.ads.impl.Hb
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2127o3.a.c(C2127o3.this);
                        }
                    };
                    if (this.f29890b.f29881e.f() != null) {
                        this.f29890b.f29884h.a(true);
                        return;
                    } else {
                        this.f29890b.f29878b.a();
                        runnable.run();
                        return;
                    }
                }
                return;
            }
            final C2127o3 c2127o32 = this.f29890b;
            Runnable runnable2 = new Runnable() { // from class: com.yandex.mobile.ads.impl.Gb
                @Override // java.lang.Runnable
                public final void run() {
                    C2127o3.a.b(C2127o3.this);
                }
            };
            if (this.f29890b.f29881e.f() == null) {
                this.f29890b.f29878b.a();
                runnable2.run();
            } else if (areEqual) {
                this.f29890b.f29884h.a(false);
            } else {
                C2127o3.k(this.f29890b);
            }
        }

        @Override // com.yandex.mobile.ads.impl.xu
        public final void c(@NotNull ob2<on0> videoAdInfo) {
            Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
            if (!this.f29890b.f29887k) {
                this.f29890b.f29887k = true;
                this.f29889a.f();
            }
            this.f29890b.f29886j = false;
            C2127o3.a(this.f29890b);
            this.f29889a.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(C2127o3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f29879c.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C2127o3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f29879c.g();
        }

        @Override // com.yandex.mobile.ads.impl.xu
        public final void a(@NotNull ob2<on0> videoAdInfo) {
            Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
            if (this.f29890b.f29880d.f()) {
                this.f29890b.f29883g.d();
                this.f29890b.f29881e.a();
            }
            final C2127o3 c2127o3 = this.f29890b;
            Runnable runnable = new Runnable() { // from class: com.yandex.mobile.ads.impl.Ib
                @Override // java.lang.Runnable
                public final void run() {
                    C2127o3.a.d(C2127o3.this);
                }
            };
            if (this.f29890b.f29881e.f() != null) {
                this.f29890b.f29884h.a(true);
            } else {
                this.f29890b.f29878b.a();
                runnable.run();
            }
        }
    }

    public C2127o3(@NotNull Context context, @NotNull ss coreInstreamAdBreak, @NotNull rl0 adPlayerController, @NotNull gm0 uiElementsManager, @NotNull km0 adViewsHolderManager, @NotNull InterfaceC2173q3 adGroupPlaybackEventsListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(adPlayerController, "adPlayerController");
        Intrinsics.checkNotNullParameter(uiElementsManager, "uiElementsManager");
        Intrinsics.checkNotNullParameter(adViewsHolderManager, "adViewsHolderManager");
        Intrinsics.checkNotNullParameter(adGroupPlaybackEventsListener, "adGroupPlaybackEventsListener");
        this.f29877a = coreInstreamAdBreak;
        this.f29878b = uiElementsManager;
        this.f29879c = adGroupPlaybackEventsListener;
        int i4 = in0.f27295g;
        this.f29880d = in0.a.a();
        sk1 sk1Var = new sk1(context);
        this.f29885i = sk1Var;
        cb2 cb2Var = new cb2();
        this.f29882f = cb2Var;
        C2150p3 c2150p3 = new C2150p3(cb2Var, new a(this, adGroupPlaybackEventsListener));
        C1986i3 a4 = new C2009j3(context, coreInstreamAdBreak, adPlayerController, sk1Var, adViewsHolderManager, c2150p3).a();
        this.f29881e = a4;
        c2150p3.a(a4);
        this.f29883g = new C2104n3(a4);
        this.f29884h = new C2081m3(a4, uiElementsManager, adGroupPlaybackEventsListener, this);
    }

    public static final void a(C2127o3 c2127o3) {
        ob2<on0> c4 = c2127o3.f29881e.c();
        bg2 e4 = c2127o3.f29881e.e();
        if (c4 == null || e4 == null) {
            ap0.b(new Object[0]);
        } else {
            c2127o3.f29878b.a(c2127o3.f29877a, c4, e4, c2127o3.f29882f, c2127o3.f29885i);
        }
    }

    public static final void k(C2127o3 c2127o3) {
        c2127o3.f29883g.c();
    }

    public final void b() {
        this.f29886j = true;
    }

    public final void c() {
        Unit unit;
        ln0 d4 = this.f29881e.d();
        if (d4 != null) {
            d4.b();
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ap0.b(new Object[0]);
        }
    }

    public final void d() {
        Unit unit;
        ln0 d4 = this.f29881e.d();
        if (d4 != null) {
            this.f29886j = false;
            d4.c();
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ap0.b(new Object[0]);
        }
        this.f29883g.b();
    }

    public final void e() {
        Unit unit;
        ln0 d4 = this.f29881e.d();
        if (d4 != null) {
            d4.d();
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ap0.b(new Object[0]);
        }
    }

    public final void f() {
        Unit unit;
        ob2<on0> c4 = this.f29881e.c();
        bg2 e4 = this.f29881e.e();
        if (c4 == null || e4 == null) {
            ap0.b(new Object[0]);
        } else {
            this.f29878b.a(this.f29877a, c4, e4, this.f29882f, this.f29885i);
        }
        ln0 d4 = this.f29881e.d();
        if (d4 != null) {
            d4.f();
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ap0.b(new Object[0]);
        }
    }

    public final void g() {
        Unit unit;
        ln0 d4 = this.f29881e.d();
        if (d4 != null) {
            d4.g();
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ap0.b(new Object[0]);
        }
        this.f29883g.d();
    }

    public final void a() {
        ln0 d4 = this.f29881e.d();
        if (d4 != null) {
            d4.a();
        }
        this.f29883g.a();
        this.f29886j = false;
        this.f29888l = false;
        this.f29887k = false;
    }

    public final void a(@Nullable tn0 tn0Var) {
        this.f29882f.a(tn0Var);
    }
}
