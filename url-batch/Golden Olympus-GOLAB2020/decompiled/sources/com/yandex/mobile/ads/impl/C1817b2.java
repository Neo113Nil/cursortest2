package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1817b2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ss f23574a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gm0 f23575b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1937g2 f23576c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2127o3 f23577d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2032k2 f23578e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private InterfaceC1841c2 f23579f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23580g;

    /* renamed from: com.yandex.mobile.ads.impl.b2$a */
    private final class a implements InterfaceC2173q3 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void a() {
            if (C1817b2.this.f23576c.a(C1817b2.this.f23574a) == EnumC1913f2.f25581d) {
                C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25586i);
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void b() {
            if (C1817b2.this.f23576c.a(C1817b2.this.f23574a) == EnumC1913f2.f25585h) {
                C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25586i);
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void c() {
            C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25580c);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void d() {
            if (C1817b2.this.f23576c.a(C1817b2.this.f23574a) == EnumC1913f2.f25585h) {
                C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25586i);
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void e() {
            if (C1817b2.this.f23576c.a(C1817b2.this.f23574a) == EnumC1913f2.f25586i) {
                C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25585h);
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void f() {
            if (C1817b2.this.f23576c.a(C1817b2.this.f23574a) == EnumC1913f2.f25581d) {
                C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25586i);
                C1817b2.this.f23578e.c();
                InterfaceC1841c2 interfaceC1841c2 = C1817b2.this.f23579f;
                if (interfaceC1841c2 != null) {
                    interfaceC1841c2.b();
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void g() {
            EnumC1913f2 a4 = C1817b2.this.f23576c.a(C1817b2.this.f23574a);
            if (a4 == EnumC1913f2.f25586i || a4 == EnumC1913f2.f25585h) {
                C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25582e);
                C1817b2.this.f23578e.a();
                InterfaceC1841c2 interfaceC1841c2 = C1817b2.this.f23579f;
                if (interfaceC1841c2 != null) {
                    interfaceC1841c2.e();
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void h() {
            boolean z4 = C1817b2.this.f23580g;
            C1817b2.this.f23580g = false;
            if (EnumC1913f2.f25580c == C1817b2.this.f23576c.a(C1817b2.this.f23574a)) {
                C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25581d);
                if (z4) {
                    C1817b2.g(C1817b2.this);
                    return;
                }
                InterfaceC1841c2 interfaceC1841c2 = C1817b2.this.f23579f;
                if (interfaceC1841c2 != null) {
                    interfaceC1841c2.a();
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void i() {
            if (EnumC1913f2.f25580c == C1817b2.this.f23576c.a(C1817b2.this.f23574a)) {
                C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25581d);
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void j() {
            C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25584g);
            C1817b2.this.f23578e.b();
            InterfaceC1841c2 interfaceC1841c2 = C1817b2.this.f23579f;
            if (interfaceC1841c2 != null) {
                interfaceC1841c2.g();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2173q3
        public final void k() {
            C1817b2.this.f23576c.a(C1817b2.this.f23574a, EnumC1913f2.f25584g);
            C1817b2.this.f23578e.b();
            InterfaceC1841c2 interfaceC1841c2 = C1817b2.this.f23579f;
            if (interfaceC1841c2 != null) {
                interfaceC1841c2.g();
            }
        }
    }

    public C1817b2(@NotNull Context context, @NotNull ss instreamAdBreak, @NotNull rl0 adPlayerController, @NotNull gm0 instreamAdUiElementsManager, @NotNull km0 instreamAdViewsHolderManager, @NotNull C1937g2 adBreakStatusController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(instreamAdBreak, "instreamAdBreak");
        Intrinsics.checkNotNullParameter(adPlayerController, "adPlayerController");
        Intrinsics.checkNotNullParameter(instreamAdUiElementsManager, "instreamAdUiElementsManager");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        this.f23574a = instreamAdBreak;
        this.f23575b = instreamAdUiElementsManager;
        this.f23576c = adBreakStatusController;
        this.f23577d = new C2127o3(context, instreamAdBreak, adPlayerController, instreamAdUiElementsManager, instreamAdViewsHolderManager, new a());
        this.f23578e = new C2032k2(context, instreamAdBreak.a());
    }

    public static final void g(C1817b2 c1817b2) {
        if (c1817b2.f23576c.a(c1817b2.f23574a) == EnumC1913f2.f25581d) {
            InterfaceC1841c2 interfaceC1841c2 = c1817b2.f23579f;
            if (interfaceC1841c2 != null) {
                interfaceC1841c2.d();
            }
            c1817b2.f23577d.d();
        }
    }

    public final void a() {
        int ordinal = this.f23576c.a(this.f23574a).ordinal();
        if (ordinal == 6 || ordinal == 7) {
            this.f23576c.a(this.f23574a, EnumC1913f2.f25585h);
            this.f23577d.c();
        }
    }

    public final void b() {
        int ordinal = this.f23576c.a(this.f23574a).ordinal();
        if (ordinal == 1) {
            this.f23576c.a(this.f23574a, EnumC1913f2.f25579b);
            this.f23577d.g();
            this.f23577d.a();
        } else if (ordinal == 2) {
            this.f23580g = false;
            this.f23576c.a(this.f23574a, EnumC1913f2.f25579b);
            this.f23577d.g();
            this.f23577d.a();
        } else if (ordinal == 5) {
            this.f23576c.a(this.f23574a, EnumC1913f2.f25579b);
            this.f23577d.a();
        } else if (ordinal == 6 || ordinal == 7) {
            this.f23580g = true;
            this.f23576c.a(this.f23574a, EnumC1913f2.f25579b);
            this.f23577d.g();
            this.f23577d.a();
        }
        this.f23575b.a();
    }

    public final void c() {
        int ordinal = this.f23576c.a(this.f23574a).ordinal();
        if (ordinal == 1) {
            this.f23576c.a(this.f23574a, EnumC1913f2.f25579b);
            this.f23577d.g();
        } else if (ordinal == 6 || ordinal == 7) {
            this.f23576c.a(this.f23574a, EnumC1913f2.f25585h);
            this.f23577d.c();
        }
        this.f23575b.a();
    }

    public final void d() {
        if (this.f23576c.a(this.f23574a) == EnumC1913f2.f25579b) {
            this.f23576c.a(this.f23574a, EnumC1913f2.f25580c);
            this.f23577d.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r0 != 7) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        int ordinal = this.f23576c.a(this.f23574a).ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal == 5) {
                this.f23576c.a(this.f23574a, EnumC1913f2.f25579b);
                this.f23577d.a();
            } else if (ordinal != 6) {
            }
            this.f23580g = false;
            this.f23575b.a();
        }
        this.f23576c.a(this.f23574a, EnumC1913f2.f25579b);
        this.f23577d.g();
        this.f23577d.a();
        this.f23580g = false;
        this.f23575b.a();
    }

    public final void f() {
        int ordinal = this.f23576c.a(this.f23574a).ordinal();
        if (ordinal == 0) {
            if (this.f23576c.a(this.f23574a) == EnumC1913f2.f25579b) {
                this.f23576c.a(this.f23574a, EnumC1913f2.f25580c);
                this.f23577d.e();
                return;
            }
            return;
        }
        if (ordinal != 2) {
            if (ordinal == 6 || ordinal == 7) {
                this.f23577d.f();
                return;
            }
            return;
        }
        if (this.f23576c.a(this.f23574a) == EnumC1913f2.f25581d) {
            InterfaceC1841c2 interfaceC1841c2 = this.f23579f;
            if (interfaceC1841c2 != null) {
                interfaceC1841c2.d();
            }
            this.f23577d.d();
        }
    }

    public final void a(@Nullable InterfaceC1841c2 interfaceC1841c2) {
        this.f23579f = interfaceC1841c2;
    }

    public final void a(@Nullable tn0 tn0Var) {
        this.f23577d.a(tn0Var);
    }

    public final void g() {
        if (this.f23576c.a(this.f23574a) == EnumC1913f2.f25581d) {
            InterfaceC1841c2 interfaceC1841c2 = this.f23579f;
            if (interfaceC1841c2 != null) {
                interfaceC1841c2.d();
            }
            this.f23577d.d();
        }
    }
}
