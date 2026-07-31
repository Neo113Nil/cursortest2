package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t11 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qf1 f32118a;

    public t11(@NotNull qf1 parentHtmlWebView) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        this.f32118a = parentHtmlWebView;
    }

    private final void a(String str) {
        this.f32118a.loadUrl("javascript: " + str);
        ap0.e(str);
    }

    public final void b(@NotNull String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        this.f32118a.b(htmlResponse);
    }

    public final void a(@NotNull bq0... events) {
        Intrinsics.checkNotNullParameter(events, "events");
        int i4 = 0;
        if (events.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("fireChangeEvent({");
        int length = events.length;
        String str = "";
        while (i4 < length) {
            bq0 bq0Var = events[i4];
            sb.append(str);
            sb.append(bq0Var.a());
            i4++;
            str = ", ";
        }
        sb.append("})");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        a(C2284v0.a(new Object[]{sb2}, 1, "window.mraidbridge.%s", "format(...)"));
    }

    public final void a(@NotNull f21 command, @NotNull String message) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = "notifyErrorEvent(" + JSONObject.quote(command.a()) + ", " + JSONObject.quote(message) + ")";
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        a(C2284v0.a(new Object[]{str}, 1, "window.mraidbridge.%s", "format(...)"));
    }

    public final void a(@NotNull f21 command) {
        Intrinsics.checkNotNullParameter(command, "command");
        String str = "nativeCallComplete(" + JSONObject.quote(command.a()) + ")";
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        a(C2284v0.a(new Object[]{str}, 1, "window.mraidbridge.%s", "format(...)"));
    }

    public final void a() {
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        a(C2284v0.a(new Object[]{"notifyReadyEvent();"}, 1, "window.mraidbridge.%s", "format(...)"));
    }
}
