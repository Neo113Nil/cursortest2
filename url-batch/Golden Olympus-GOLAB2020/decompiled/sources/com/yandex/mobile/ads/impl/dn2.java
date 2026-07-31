package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.ae1;
import com.yandex.mobile.ads.impl.bg2;
import com.yandex.mobile.ads.impl.mb2;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dn2 implements bg2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f24710a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final pc2 f24711b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final dd2 f24712c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<la2> f24713d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final zf2 f24714e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ke1 f24715f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final mp1 f24716g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private AbstractC2062l8 f24717h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private lv0 f24718i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private C2309w2 f24719j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f24720k;

    public dn2(@NotNull Context context, @NotNull pc2 videoAdPosition, @Nullable dd2 dd2Var, @NotNull List<la2> verifications, @NotNull zf2 eventsTracker, @NotNull ke1 omSdkVastPropertiesCreator, @NotNull mp1 reporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        Intrinsics.checkNotNullParameter(verifications, "verifications");
        Intrinsics.checkNotNullParameter(eventsTracker, "eventsTracker");
        Intrinsics.checkNotNullParameter(omSdkVastPropertiesCreator, "omSdkVastPropertiesCreator");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f24710a = context;
        this.f24711b = videoAdPosition;
        this.f24712c = dd2Var;
        this.f24713d = verifications;
        this.f24714e = eventsTracker;
        this.f24715f = omSdkVastPropertiesCreator;
        this.f24716g = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void b() {
        lv0 lv0Var = this.f24718i;
        if (lv0Var != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                lv0Var.d();
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void c() {
        lv0 lv0Var = this.f24718i;
        if (lv0Var != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                lv0Var.h();
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void d() {
        lv0 lv0Var = this.f24718i;
        if (lv0Var != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                lv0Var.g();
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void e() {
        lv0 lv0Var = this.f24718i;
        if (lv0Var != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                lv0Var.i();
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void f() {
        lv0 lv0Var = this.f24718i;
        if (lv0Var != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                lv0Var.c();
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void h() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void i() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void j() {
        lv0 lv0Var = this.f24718i;
        if (lv0Var != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                lv0Var.b();
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void k() {
        AbstractC2062l8 abstractC2062l8 = this.f24717h;
        if (abstractC2062l8 != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                abstractC2062l8.a();
                this.f24717h = null;
                this.f24718i = null;
                this.f24719j = null;
                this.f24720k = true;
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void l() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void m() {
        lv0 lv0Var = this.f24718i;
        if (lv0Var != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                lv0Var.a();
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void n() {
        C2309w2 c2309w2 = this.f24719j;
        if (c2309w2 != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                c2309w2.a();
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    public static final void a(dn2 dn2Var, ma2 ma2Var) {
        dn2Var.getClass();
        dn2Var.f24714e.a(ma2Var.b(), "verificationNotExecuted", MapsKt.mapOf(TuplesKt.to("[REASON]", String.valueOf(ma2Var.a().a()))));
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull View view, @NotNull List<mb2> friendlyOverlays) {
        jc0 jc0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        k();
        this.f24720k = false;
        Unit unit = Unit.f41027a;
        try {
            Context context = this.f24710a;
            cn2 cn2Var = new cn2(this);
            zd1 zd1Var = new zd1(context, cn2Var);
            int i4 = ae1.f23252e;
            he1 a4 = new ie1(context, cn2Var, zd1Var, ae1.a.a(), new je1()).a(this.f24713d);
            if (a4 != null) {
                AbstractC2062l8 b4 = a4.b();
                b4.a(view);
                this.f24717h = b4;
                this.f24718i = a4.c();
                this.f24719j = a4.a();
            }
        } catch (Exception e4) {
            ap0.c(new Object[0]);
            this.f24716g.reportError("Failed to execute safely", e4);
        }
        AbstractC2062l8 abstractC2062l8 = this.f24717h;
        if (abstractC2062l8 != null) {
            for (mb2 mb2Var : friendlyOverlays) {
                View c4 = mb2Var.c();
                if (c4 != null) {
                    Unit unit2 = Unit.f41027a;
                    try {
                        mb2.a purpose = mb2Var.b();
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        int ordinal = purpose.ordinal();
                        if (ordinal == 0) {
                            jc0Var = jc0.f27627b;
                        } else if (ordinal == 1) {
                            jc0Var = jc0.f27628c;
                        } else if (ordinal != 2) {
                            if (ordinal != 3) {
                                throw new W1.m();
                            }
                            jc0Var = jc0.f27630e;
                        } else {
                            jc0Var = jc0.f27629d;
                        }
                        abstractC2062l8.a(c4, jc0Var, mb2Var.a());
                    } catch (Exception e5) {
                        ap0.c(new Object[0]);
                        this.f24716g.reportError("Failed to execute safely", e5);
                    }
                }
            }
        }
        AbstractC2062l8 abstractC2062l82 = this.f24717h;
        if (abstractC2062l82 != null) {
            try {
                if (!this.f24720k) {
                    abstractC2062l82.b();
                }
            } catch (Exception e6) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e6);
            }
        }
        C2309w2 c2309w2 = this.f24719j;
        if (c2309w2 != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                ke1 ke1Var = this.f24715f;
                dd2 dd2Var = this.f24712c;
                pc2 pc2Var = this.f24711b;
                ke1Var.getClass();
                c2309w2.a(ke1.a(dd2Var, pc2Var));
            } catch (Exception e7) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e7);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        m();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull mc2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull bg2.a quartile) {
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        lv0 lv0Var = this.f24718i;
        if (lv0Var != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                int ordinal = quartile.ordinal();
                if (ordinal == 0) {
                    lv0Var.e();
                } else if (ordinal == 1) {
                    lv0Var.f();
                } else {
                    if (ordinal != 2) {
                        return;
                    }
                    lv0Var.j();
                }
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(float f4, long j4) {
        lv0 lv0Var = this.f24718i;
        if (lv0Var != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                lv0Var.a(j4 / 1000, f4);
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(float f4) {
        lv0 lv0Var = this.f24718i;
        if (lv0Var != null) {
            try {
                if (this.f24720k) {
                    return;
                }
                lv0Var.a(f4);
            } catch (Exception e4) {
                ap0.c(new Object[0]);
                this.f24716g.reportError("Failed to execute safely", e4);
            }
        }
    }
}
