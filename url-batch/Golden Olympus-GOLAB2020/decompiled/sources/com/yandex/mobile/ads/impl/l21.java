package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.j21;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l21 extends kg2<j21, eu0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(@NotNull j21 mraidWebView) {
        super(mraidWebView);
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(C2276uf asset, ng2 viewConfigurator, eu0 eu0Var) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        j21 b4 = b();
        if (b4 == null) {
            return;
        }
        viewConfigurator.a(b4, asset);
        viewConfigurator.a((C2276uf<?>) asset, new v11(b4));
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void b(j21 j21Var, eu0 eu0Var) {
        j21 mraidWebView = j21Var;
        eu0 media = eu0Var;
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        Intrinsics.checkNotNullParameter(media, "media");
        String b4 = media.b();
        if (b4 != null && b4.length() > 0) {
            mraidWebView.setAspectRatio(media.a());
            mraidWebView.a(b4, (j21.a) null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(j21 j21Var, eu0 eu0Var) {
        j21 mraidWebView = j21Var;
        eu0 media = eu0Var;
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        Intrinsics.checkNotNullParameter(media, "media");
        return true;
    }
}
