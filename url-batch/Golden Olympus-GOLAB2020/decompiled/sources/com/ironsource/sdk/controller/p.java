package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.InterfaceC1465g;
import com.ironsource.InterfaceC1472h;
import com.ironsource.b9;
import com.ironsource.o9;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.uo;
import com.ironsource.vo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface p {

    @Metadata
    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private b f19330a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String method, @NotNull vo openUrlConfigurations) {
            this(method, openUrlConfigurations, new k.b(), new k.a());
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
        }

        @Override // com.ironsource.sdk.controller.p
        @NotNull
        public c a(@NotNull Context context, @NotNull uo openUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(openUrl, "openUrl");
            try {
                return this.f19330a.a(context, openUrl);
            } catch (Exception e4) {
                o9.d().a(e4);
                String message = e4.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e4.getMessage();
                Intrinsics.checkNotNull(message2);
                return new c.a(message2);
            }
        }

        public a(@NotNull String method, @NotNull vo openUrlConfigurations, @NotNull InterfaceC1472h activityIntentFactory, @NotNull InterfaceC1465g actionIntentFactory) {
            b aVar;
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
            Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
            Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
            int hashCode = method.hashCode();
            if (hashCode == -1455867212) {
                if (method.equals(b9.h.f15447J)) {
                    aVar = new b.a(openUrlConfigurations, actionIntentFactory);
                }
                aVar = new b.C0160b(method);
            } else if (hashCode != 109770977) {
                if (hashCode == 1224424441 && method.equals(b9.h.f15449K)) {
                    aVar = new b.d(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new b.C0160b(method);
            } else {
                if (method.equals(b9.h.f15461U)) {
                    aVar = new b.c(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new b.C0160b(method);
            }
            this.f19330a = aVar;
        }
    }

    @Metadata
    public interface b {

        @Metadata
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final vo f19331a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final InterfaceC1465g f19332b;

            public a(@NotNull vo configurations, @NotNull InterfaceC1465g intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f19331a = configurations;
                this.f19332b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull uo openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.d())) {
                    return new c.a("url is empty");
                }
                Intent a4 = this.f19332b.a();
                a4.setData(Uri.parse(openUrl.d()));
                String c4 = openUrl.c();
                if (c4 != null && c4.length() != 0) {
                    a4 = a4.setPackage(openUrl.c());
                    Intrinsics.checkNotNullExpressionValue(a4, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    a4 = a4.addFlags(this.f19331a.c());
                }
                Intrinsics.checkNotNullExpressionValue(a4, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(a4);
                return c.b.f19339a;
            }
        }

        @Metadata
        /* renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C0160b implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f19333a;

            public C0160b(@NotNull String method) {
                Intrinsics.checkNotNullParameter(method, "method");
                this.f19333a = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull uo openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                return new c.a("method " + this.f19333a + " is unsupported");
            }
        }

        @Metadata
        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final vo f19334a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final InterfaceC1472h f19335b;

            public c(@NotNull vo configurations, @NotNull InterfaceC1472h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f19334a = configurations;
                this.f19335b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull uo openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.f19335b).a(this.f19334a.c()).a(openUrl.d()).b(true).c(true).a(context));
                return c.b.f19339a;
            }
        }

        @Metadata
        public static final class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final vo f19336a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final InterfaceC1472h f19337b;

            public d(@NotNull vo configurations, @NotNull InterfaceC1472h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f19336a = configurations;
                this.f19337b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull uo openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.f19337b).a(this.f19336a.c()).a(openUrl.d()).a(this.f19336a.d()).b(true).a(context));
                return c.b.f19339a;
            }
        }

        @NotNull
        c a(@NotNull Context context, @NotNull uo uoVar);
    }

    @Metadata
    public static abstract class c {

        @Metadata
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f19338a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ a a(a aVar, String str, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = aVar.f19338a;
                }
                return aVar.a(str);
            }

            @NotNull
            public final String b() {
                return this.f19338a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f19338a, ((a) obj).f19338a);
            }

            public int hashCode() {
                return this.f19338a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorMessage=" + this.f19338a + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f19338a = errorMessage;
            }

            @NotNull
            public final a a(@NotNull String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public /* synthetic */ a(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
                this((i4 & 1) != 0 ? "" : str);
            }

            @NotNull
            public final String a() {
                return this.f19338a;
            }
        }

        @Metadata
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f19339a = new b();

            private b() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    c a(@NotNull Context context, @NotNull uo uoVar);
}
