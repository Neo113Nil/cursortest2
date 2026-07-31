package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.pw0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hu0 implements InterfaceC2299vf<mw0>, n00<mw0> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final mj0 f26939a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final pw0 f26940b;

    public hu0(@Nullable mj0 mj0Var, @Nullable pw0 pw0Var) {
        this.f26939a = mj0Var;
        this.f26940b = pw0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final void a() {
        pw0 pw0Var;
        mj0 mj0Var;
        ImageView imageView = (ImageView) a((kg2) this.f26939a);
        if (imageView != null && (mj0Var = this.f26939a) != null) {
            mj0Var.a2(imageView);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((kg2) this.f26940b);
        if (customizableMediaView == null || (pw0Var = this.f26940b) == null) {
            return;
        }
        pw0Var.a((pw0) customizableMediaView);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final boolean b() {
        pw0 pw0Var = this.f26940b;
        if (pw0Var != null && pw0Var.b() != null) {
            return true;
        }
        mj0 mj0Var = this.f26939a;
        return (mj0Var == null || mj0Var.b() == null) ? false : true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    @Nullable
    public final ah2 c() {
        CustomizableMediaView view = (CustomizableMediaView) a((kg2) this.f26940b);
        ImageView view2 = (ImageView) a((kg2) this.f26939a);
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "view");
            return new ah2(view.getWidth(), view.getHeight());
        }
        if (view2 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(view2, "view");
        return new ah2(view2.getWidth(), view2.getHeight());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final boolean d() {
        pw0 pw0Var = this.f26940b;
        boolean z4 = pw0Var != null && lh2.a(pw0Var.b(), 100);
        mj0 mj0Var = this.f26939a;
        return z4 || (mj0Var != null && lh2.a(mj0Var.b(), 100));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final void destroy() {
        pw0 pw0Var = this.f26940b;
        if (pw0Var != null) {
            pw0Var.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final boolean e() {
        mj0 mj0Var;
        pw0 pw0Var = this.f26940b;
        return (pw0Var != null && pw0Var.c()) || ((mj0Var = this.f26939a) != null && mj0Var.c());
    }

    @Nullable
    public final pw0.a f() {
        pw0.a d4;
        pw0 pw0Var = this.f26940b;
        if (pw0Var != null && (d4 = pw0Var.d()) != null) {
            return d4;
        }
        if (this.f26939a != null) {
            return pw0.a.f30598f;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final void a(@NotNull C2276uf<mw0> asset, @NotNull ng2 viewConfigurator) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        mw0 d4 = asset.d();
        mj0 mj0Var = this.f26939a;
        if (mj0Var != null) {
            mj0Var.a((C2276uf<?>) asset, viewConfigurator, (ng2) a((List) d4.a()));
        }
        pw0 pw0Var = this.f26940b;
        if (pw0Var != null) {
            pw0Var.a(asset, viewConfigurator, d4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.n00
    public final void b(mw0 mw0Var) {
        mw0 mediaValue = mw0Var;
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        ej0 a4 = a((List) mediaValue.a());
        ImageView imageView = (ImageView) a((kg2) this.f26939a);
        if (imageView != null && a4 != null) {
            mj0 mj0Var = this.f26939a;
            if (mj0Var != null) {
                mj0Var.a2(imageView, a4);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((kg2) this.f26940b);
        if (customizableMediaView == null) {
            return;
        }
        pw0 pw0Var = this.f26940b;
        if (pw0Var != null) {
            pw0Var.a(mediaValue);
        }
        customizableMediaView.setVisibility(0);
    }

    private static View a(kg2 kg2Var) {
        if (kg2Var != null) {
            return kg2Var.b();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final void c(mw0 mw0Var) {
        mw0 mediaValue = mw0Var;
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        ej0 a4 = a((List) mediaValue.a());
        ImageView imageView = (ImageView) a((kg2) this.f26939a);
        if (imageView != null && a4 != null) {
            mj0 mj0Var = this.f26939a;
            if (mj0Var != null) {
                mj0Var.a2(imageView, a4);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((kg2) this.f26940b);
        if (customizableMediaView != null) {
            pw0 pw0Var = this.f26940b;
            if (pw0Var != null) {
                pw0Var.b(customizableMediaView, mediaValue);
            }
            customizableMediaView.setVisibility(0);
        }
    }

    private static ej0 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ej0) list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.InterfaceC2299vf
    public final boolean a(mw0 mw0Var) {
        mw0 mediaValue = mw0Var;
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        mj0 mj0Var = this.f26939a;
        ej0 a4 = a((List) mediaValue.a());
        View a5 = a((kg2) mj0Var);
        boolean z4 = (a5 == null || a4 == null || mj0Var == 0 || !mj0Var.a((ImageView) a5, a4)) ? false : true;
        pw0 pw0Var = this.f26940b;
        View a6 = a((kg2) pw0Var);
        return z4 || (a6 != null && pw0Var != null && pw0Var.a((pw0) a6, (View) mediaValue));
    }
}
