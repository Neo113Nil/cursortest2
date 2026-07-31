package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.AbstractC2372yj;
import com.yandex.mobile.ads.impl.C2355y2;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.gs;
import com.yandex.mobile.ads.impl.hx1;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1978hj<T> extends x52<C2286v2, C2360y7<T>> {

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final C2286v2 f26762C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final String f26763D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final qc1<T> f26764E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final hx1 f26765F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final C2287v3 f26766G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final C2131o7 f26767H;

    /* renamed from: I, reason: collision with root package name */
    private final Context f26768I;

    /* renamed from: com.yandex.mobile.ads.impl.hj$a */
    static final class a extends kotlin.jvm.internal.s implements Function1<bn1, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26769b = new a();

        a() {
            super(1);
        }

        @NotNull
        public static String a(@NotNull bn1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getKey() + "=" + it.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a((bn1) obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AbstractC1978hj(Context context, C2286v2 c2286v2, String str, String str2, qc1 qc1Var, yp1 yp1Var, AbstractC2372yj.a aVar, fq1 fq1Var, hx1 hx1Var, int i4) {
        this(context, c2286v2, str, str2, qc1Var, yp1Var, aVar, fq1Var, r10, new C2287v3(), new C2131o7());
        hx1 hx1Var2;
        if ((i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            hx1.f26979a.getClass();
            hx1Var2 = hx1.a.a(context);
        } else {
            hx1Var2 = hx1Var;
        }
    }

    private final C2360y7<T> a(lc1 lc1Var, Map<String, String> map, gs gsVar) {
        qc1<T> qc1Var = this.f26764E;
        Context context = this.f26768I;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        mi2 a4 = qc1Var.a(context, this.f26762C);
        bh0 bh0Var = bh0.f23758K;
        String a5 = cf0.a(map, bh0Var);
        bh0Var.a();
        ap0.e(new Object[0]);
        this.f26765F.a(a5);
        return a4.a(lc1Var, map, gsVar);
    }

    @Override // com.yandex.mobile.ads.impl.op1
    @Nullable
    public final byte[] b() {
        if (1 != f()) {
            return null;
        }
        try {
            String str = this.f26763D;
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException unused) {
            ap0.a(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.x52, com.yandex.mobile.ads.impl.op1
    @NotNull
    public Map<String, String> e() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        String a4 = this.f26765F.a();
        if (a4 != null) {
            ap0.e(new Object[0]);
        }
        String a5 = bh0.f23760M.a();
        C2287v3 c2287v3 = this.f26766G;
        Context context = this.f26768I;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        createMapBuilder.put(a5, c2287v3.b(context));
        String a6 = bh0.f23761N.a();
        C2287v3 c2287v32 = this.f26766G;
        Context context2 = this.f26768I;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        createMapBuilder.put(a6, c2287v32.a(context2));
        createMapBuilder.putAll(this.f26762C.j().d());
        return MapsKt.build(createMapBuilder);
    }

    @Override // com.yandex.mobile.ads.impl.op1
    @NotNull
    public final String l() {
        StringBuilder sb = new StringBuilder();
        if (f() == 0) {
            sb.append(this.f26763D);
        }
        List<bn1> f4 = this.f26762C.j().f();
        if (sb.length() > 0 && !f4.isEmpty()) {
            sb.append("&");
        }
        sb.append(CollectionsKt.joinToString$default(f4, "&", null, null, 0, null, a.f26769b, 30, null));
        String uri = Uri.parse(super.l()).buildUpon().encodedQuery(sb.toString()).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1978hj(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull String url, @NotNull String query, @NotNull qc1<T> networkResponseParserCreator, @Nullable yp1 yp1Var, @NotNull AbstractC2372yj.a<C2360y7<T>> listener, @NotNull fq1<C2286v2, C2360y7<T>> requestReporter, @NotNull hx1 sessionStorage, @NotNull C2287v3 adIdHeaderProvider, @NotNull C2131o7 adRequestRetryPolicyCreator) {
        super(context, adConfiguration, 1, url, listener, adConfiguration, requestReporter, yp1Var, 1792);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(networkResponseParserCreator, "networkResponseParserCreator");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(requestReporter, "requestReporter");
        Intrinsics.checkNotNullParameter(sessionStorage, "sessionStorage");
        Intrinsics.checkNotNullParameter(adIdHeaderProvider, "adIdHeaderProvider");
        Intrinsics.checkNotNullParameter(adRequestRetryPolicyCreator, "adRequestRetryPolicyCreator");
        adConfiguration.j().getClass();
        this.f26762C = adConfiguration;
        this.f26763D = query;
        this.f26764E = networkResponseParserCreator;
        this.f26765F = sessionStorage;
        this.f26766G = adIdHeaderProvider;
        this.f26767H = adRequestRetryPolicyCreator;
        this.f26768I = context.getApplicationContext();
        ap0.e(new Object[0]);
        a(context);
    }

    @Override // com.yandex.mobile.ads.impl.x52, com.yandex.mobile.ads.impl.AbstractC2372yj, com.yandex.mobile.ads.impl.op1
    @NotNull
    public final hi2 b(@NotNull hi2 requestError) {
        Intrinsics.checkNotNullParameter(requestError, "requestError");
        ap0.c(new Object[0]);
        int i4 = C2355y2.f34774d;
        return super.b((hi2) C2355y2.a.a(requestError.f26761b));
    }

    @Override // com.yandex.mobile.ads.impl.x52
    @NotNull
    protected final qq1<C2360y7<T>> a(@NotNull lc1 response, int i4) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (b(response, i4)) {
            Map<String, String> map = response.f28507c;
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            a(map);
            String a4 = cf0.a(map, bh0.f23780e);
            if (a4 == null) {
                a4 = "";
            }
            gs.f26279c.getClass();
            gs a5 = gs.a.a(a4);
            if (a5 == this.f26762C.b()) {
                C2360y7<T> a6 = a(response, map, a5);
                if (204 != i4) {
                    qq1<C2360y7<T>> a7 = qq1.a(a6, ch0.a(response));
                    Intrinsics.checkNotNullExpressionValue(a7, "success(...)");
                    return a7;
                }
            }
        }
        int i5 = C2355y2.f34774d;
        qq1<C2360y7<T>> a8 = qq1.a(C2355y2.a.a(response));
        Intrinsics.checkNotNullExpressionValue(a8, "error(...)");
        return a8;
    }

    protected boolean b(@NotNull lc1 networkResponse, int i4) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        if (200 == i4) {
            Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
            byte[] bArr = networkResponse.f28506b;
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void a(Context context) {
        Integer U3;
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        a(this.f26767H.a(context, (a4 == null || (U3 = a4.U()) == null) ? this.f26762C.g() : U3.intValue()));
    }
}
