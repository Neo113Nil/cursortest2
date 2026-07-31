package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2352y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f34734a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f82 f34735b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final p62 f34736c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final u00 f34737d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final v20 f34738e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private Map<String, ? extends InterfaceC2329x<?>> f34739f;

    public /* synthetic */ C2352y(mp1 mp1Var) {
        this(mp1Var, new f82(), new p62(), new u00(), new v20(mp1Var));
    }

    @Nullable
    public final InterfaceC2329x<?> a(@NotNull JSONObject jsonObject, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        String a4 = w81.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        Map<String, ? extends InterfaceC2329x<?>> map = this.f34739f;
        if (map == null) {
            Pair pair = TuplesKt.to("adtune", new C1850cb(this.f34735b, this.f34736c));
            Pair pair2 = TuplesKt.to("divkit_adtune", new e20(this.f34737d, this.f34738e, this.f34736c, base64EncodingParameters.a()));
            Pair pair3 = TuplesKt.to("close", new ap());
            f82 f82Var = this.f34735b;
            Pair pair4 = TuplesKt.to("deeplink", new ly(f82Var, new uj1(f82Var)));
            Pair pair5 = TuplesKt.to("feedback", new ga0(this.f34735b));
            mp1 mp1Var = this.f34734a;
            map = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to("social_action", new r02(mp1Var, base64EncodingParameters, new o02(new er0(mp1Var)))));
            this.f34739f = map;
        }
        return map.get(a4);
    }

    public C2352y(@NotNull mp1 reporter, @NotNull f82 urlJsonParser, @NotNull p62 trackingUrlsParser, @NotNull u00 designJsonParser, @NotNull v20 divKitDesignParser) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(trackingUrlsParser, "trackingUrlsParser");
        Intrinsics.checkNotNullParameter(designJsonParser, "designJsonParser");
        Intrinsics.checkNotNullParameter(divKitDesignParser, "divKitDesignParser");
        this.f34734a = reporter;
        this.f34735b = urlJsonParser;
        this.f34736c = trackingUrlsParser;
        this.f34737d = designJsonParser;
        this.f34738e = divKitDesignParser;
    }
}
