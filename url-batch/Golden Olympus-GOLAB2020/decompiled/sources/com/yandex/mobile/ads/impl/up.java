package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.vp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class up {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vp1 f33222a;

    static final class a extends kotlin.jvm.internal.s implements Function2<String, String, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri.Builder f33224c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Uri.Builder builder) {
            super(2);
            this.f33224c = builder;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            String key = (String) obj;
            String str = (String) obj2;
            Intrinsics.checkNotNullParameter(key, "key");
            vp1 vp1Var = up.this.f33222a;
            Uri.Builder builder = this.f33224c;
            vp1Var.getClass();
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(builder, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            if (str != null && str.length() != 0) {
                Intrinsics.checkNotNull(builder.appendQueryParameter(key, str));
            }
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2<String, String, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn1 f33225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(cn1 cn1Var) {
            super(2);
            this.f33225b = cn1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            String key = (String) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            this.f33225b.a(key, (String) obj2);
            return Unit.f41027a;
        }
    }

    public up(@NotNull vp1 requestHelper) {
        Intrinsics.checkNotNullParameter(requestHelper, "requestHelper");
        this.f33222a = requestHelper;
    }

    public final void a(@NotNull Context context, @NotNull Uri.Builder builder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        a aVar = new a(builder);
        vp.f33717a.getClass();
        xp xpVar = (xp) vp.a.a(context);
        aVar.invoke("gdpr", xpVar.a());
        aVar.invoke("gdpr_consent", xpVar.b());
        aVar.invoke("parsed_purpose_consents", xpVar.c());
        aVar.invoke("parsed_vendor_consents", xpVar.f());
        aVar.invoke("cmp_present", Integer.valueOf(xpVar.e() ? 1 : 0).toString());
    }

    public static void a(@NotNull Context context, @NotNull cn1 queryParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        b bVar = new b(queryParams);
        vp.f33717a.getClass();
        xp xpVar = (xp) vp.a.a(context);
        bVar.invoke("gdpr", xpVar.a());
        bVar.invoke("gdpr_consent", xpVar.b());
        bVar.invoke("parsed_purpose_consents", xpVar.c());
        bVar.invoke("parsed_vendor_consents", xpVar.f());
        bVar.invoke("cmp_present", Integer.valueOf(xpVar.e() ? 1 : 0).toString());
    }
}
