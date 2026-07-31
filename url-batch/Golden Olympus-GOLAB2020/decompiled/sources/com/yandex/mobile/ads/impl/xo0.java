package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xo0 {

    public static final class a implements wo0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1977hi f34649a;

        public a(@NotNull C1977hi viewController) {
            Intrinsics.checkNotNullParameter(viewController, "viewController");
            this.f34649a = viewController;
        }

        @Override // com.yandex.mobile.ads.impl.wo0
        public final void a(@NotNull Context context, @NotNull View view) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(view, "view");
        }

        @Override // com.yandex.mobile.ads.impl.wo0
        public final void b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i4 = C2362y9.f34935b;
            if (C2362y9.a((ao) this.f34649a)) {
                return;
            }
            this.f34649a.u();
        }

        @Override // com.yandex.mobile.ads.impl.wo0
        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i4 = C2362y9.f34935b;
            if (C2362y9.a((ao) this.f34649a)) {
                return;
            }
            this.f34649a.v();
        }
    }

    @NotNull
    public static wo0 a(@NotNull View view, @NotNull C1977hi controller) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return view.isInEditMode() ? new b() : new a(controller);
    }

    public static final class b implements wo0 {
        @Override // com.yandex.mobile.ads.impl.wo0
        public final void a(@NotNull Context context, @NotNull View view) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(view, "view");
            view.setVisibility(0);
            view.setMinimumHeight(lh2.a(context, 50.0f));
        }

        @Override // com.yandex.mobile.ads.impl.wo0
        public final void b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // com.yandex.mobile.ads.impl.wo0
        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }
}
