package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.mo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface mo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f29191a = a.f29192a;

    @NotNull
    View.OnClickListener a(@NotNull C2276uf<?> c2276uf, @Nullable dr0 dr0Var, @NotNull InterfaceC2172q2 interfaceC2172q2, @NotNull v61 v61Var, @NotNull qo1 qo1Var, @NotNull wb0 wb0Var);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f29192a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final mo f29193b = new mo() { // from class: com.yandex.mobile.ads.impl.Z9
            @Override // com.yandex.mobile.ads.impl.mo
            public final View.OnClickListener a(C2276uf c2276uf, dr0 dr0Var, InterfaceC2172q2 interfaceC2172q2, v61 v61Var, qo1 qo1Var, wb0 wb0Var) {
                View.OnClickListener a4;
                a4 = mo.a.a(c2276uf, dr0Var, interfaceC2172q2, v61Var, qo1Var, wb0Var);
                return a4;
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View.OnClickListener a(C2276uf asset, dr0 dr0Var, InterfaceC2172q2 adClickable, v61 viewAdapter, qo1 renderedTimer, wb0 forceImpressionTrackingListener) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(adClickable, "adClickable");
            Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
            Intrinsics.checkNotNullParameter(renderedTimer, "renderedTimer");
            Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
            return new d51(asset, dr0Var, adClickable, viewAdapter, renderedTimer, forceImpressionTrackingListener);
        }

        @NotNull
        public static mo a() {
            return f29193b;
        }
    }
}
