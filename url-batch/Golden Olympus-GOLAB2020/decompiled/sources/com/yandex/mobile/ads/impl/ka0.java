package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ka0 implements nm0 {

    /* renamed from: f, reason: collision with root package name */
    private static final int f28133f = R.drawable.monetization_ads_internal_instream_adtune_control_v2;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C2276uf<?> f28134a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2368yf f28135b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bg2 f28136c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2158pb f28137d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final g20 f28138e;

    public ka0(@Nullable C2276uf<?> c2276uf, @NotNull C2368yf assetClickConfigurator, @NotNull bg2 videoTracker, @NotNull C2158pb adtuneRenderer, @NotNull g20 divKitAdtuneRenderer) {
        Intrinsics.checkNotNullParameter(assetClickConfigurator, "assetClickConfigurator");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(adtuneRenderer, "adtuneRenderer");
        Intrinsics.checkNotNullParameter(divKitAdtuneRenderer, "divKitAdtuneRenderer");
        this.f28134a = c2276uf;
        this.f28135b = assetClickConfigurator;
        this.f28136c = videoTracker;
        this.f28137d = adtuneRenderer;
        this.f28138e = divKitAdtuneRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        ImageView h4 = uiElements.h();
        if (h4 != null) {
            Drawable drawable = h4.getDrawable();
            if (drawable == null) {
                drawable = androidx.core.content.a.g(h4.getContext(), f28133f);
            }
            h4.setImageDrawable(drawable);
            h4.setVisibility(a() != null ? 0 : 8);
            InterfaceC2143oj a4 = a();
            if (a4 == null) {
                this.f28135b.a(h4, this.f28134a);
                return;
            }
            Context context = h4.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            h4.setOnClickListener(new ja0(a4, this.f28137d, this.f28138e, this.f28136c, new ge2(context)));
        }
    }

    private final InterfaceC2143oj a() {
        InterfaceC2237t interfaceC2237t;
        dr0 a4;
        List<InterfaceC2237t> a5;
        Object obj;
        C2276uf<?> c2276uf = this.f28134a;
        if (c2276uf == null || (a4 = c2276uf.a()) == null || (a5 = a4.a()) == null) {
            interfaceC2237t = null;
        } else {
            Iterator<T> it = a5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                InterfaceC2237t interfaceC2237t2 = (InterfaceC2237t) obj;
                if (Intrinsics.areEqual(interfaceC2237t2.a(), "adtune") || Intrinsics.areEqual(interfaceC2237t2.a(), "divkit_adtune")) {
                    break;
                }
            }
            interfaceC2237t = (InterfaceC2237t) obj;
        }
        if (interfaceC2237t instanceof InterfaceC2143oj) {
            return (InterfaceC2143oj) interfaceC2237t;
        }
        return null;
    }
}
