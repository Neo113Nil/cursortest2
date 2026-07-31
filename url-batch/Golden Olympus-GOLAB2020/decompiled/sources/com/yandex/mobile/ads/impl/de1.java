package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.aq1;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.qq1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class de1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24599a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fe1 f24600b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final aq1 f24601c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ew1 f24602d;

    public de1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24599a = context.getApplicationContext();
        this.f24600b = ge1.a(context);
        int i4 = aq1.f23419c;
        this.f24601c = aq1.a.a();
        int i5 = ew1.f25476l;
        this.f24602d = ew1.a.a();
    }

    private final class a implements qq1.b<String>, qq1.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f24603a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ra2 f24604b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ de1 f24605c;

        public a(de1 de1Var, @NotNull String omSdkControllerUrl, @NotNull ra2 listener) {
            Intrinsics.checkNotNullParameter(omSdkControllerUrl, "omSdkControllerUrl");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f24605c = de1Var;
            this.f24603a = omSdkControllerUrl;
            this.f24604b = listener;
        }

        @Override // com.yandex.mobile.ads.impl.qq1.a
        public final void a(@NotNull hi2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f24604b.a();
        }

        @Override // com.yandex.mobile.ads.impl.qq1.b
        public final void a(String str) {
            String response = str;
            Intrinsics.checkNotNullParameter(response, "response");
            this.f24605c.f24600b.a(response);
            this.f24605c.f24600b.b(this.f24603a);
            this.f24604b.a();
        }
    }

    public final void a() {
        aq1 aq1Var = this.f24601c;
        Context appContext = this.f24599a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        aq1Var.getClass();
        aq1.a(appContext, "om_sdk_js_request_tag");
    }

    public final void a(@NotNull ra2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ew1 ew1Var = this.f24602d;
        Context appContext = this.f24599a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        du1 a4 = ew1Var.a(appContext);
        String G3 = a4 != null ? a4.G() : null;
        String b4 = this.f24600b.b();
        if (G3 != null && G3.length() > 0 && !Intrinsics.areEqual(G3, b4)) {
            a aVar = new a(this, G3, listener);
            t22 request = new t22(G3, aVar, aVar);
            request.b((Object) "om_sdk_js_request_tag");
            aq1 aq1Var = this.f24601c;
            Context context = this.f24599a;
            Intrinsics.checkNotNullExpressionValue(context, "appContext");
            synchronized (aq1Var) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(request, "request");
                vc1.a(context).a(request);
            }
            return;
        }
        ee1.a(ee1.this);
    }
}
