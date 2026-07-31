package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.C1513m5;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.mv0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ha2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pv0 f26684a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x02 f26685b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1891e4 f26686c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1992i9 f26687d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final du1 f26688e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ha2(Context context) {
        this(context, r2, r3, r4, r5, ew1.a.a().a(context));
        pv0 pv0Var = new pv0(context);
        x02 x02Var = new x02();
        C1891e4 c1891e4 = new C1891e4();
        C1992i9 c1992i9 = new C1992i9();
        int i4 = ew1.f25476l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.yandex.mobile.ads.impl.ga2] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.yandex.mobile.ads.impl.ga2] */
    @NotNull
    public final ArrayList a(@NotNull List videoAds) {
        Object obj;
        Object obj2;
        C1944g9 c1944g9;
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        ArrayList arrayList = new ArrayList();
        Iterator it = videoAds.iterator();
        while (it.hasNext()) {
            bb2 bb2Var = (bb2) it.next();
            hu huVar = (hu) CollectionsKt.firstOrNull((List) bb2Var.e());
            C1944g9 c1944g92 = null;
            if (huVar != null) {
                du1 du1Var = this.f26688e;
                if (du1Var != null && du1Var.H() && bb2Var.o()) {
                    String k4 = bb2Var.k();
                    if (k4 == null) {
                        k4 = "";
                    }
                    c1944g9 = new ga2(bb2Var, huVar, new mv0.a(k4).a(), null, null, null, null);
                } else {
                    mv0 a4 = this.f26684a.a(huVar);
                    if (a4 != null) {
                        jb2 videoAdExtensions = bb2Var.l();
                        this.f26685b.getClass();
                        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
                        Iterator it2 = videoAdExtensions.a().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            k70 k70Var = (k70) obj;
                            if (Intrinsics.areEqual(k70Var.a(), "social_ad_info") && k70Var.b().length() > 0) {
                                break;
                            }
                        }
                        k70 k70Var2 = (k70) obj;
                        String b4 = k70Var2 != null ? k70Var2.b() : null;
                        w02 w02Var = b4 != null ? new w02(b4) : null;
                        this.f26686c.getClass();
                        String a5 = C1891e4.a(videoAdExtensions);
                        this.f26686c.getClass();
                        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
                        String a6 = C1891e4.a(videoAdExtensions);
                        JSONObject a7 = a6 != null ? dq0.a(a6) : null;
                        this.f26687d.getClass();
                        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
                        Iterator it3 = videoAdExtensions.a().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            if (Intrinsics.areEqual(((k70) obj2).a(), "AdTune")) {
                                break;
                            }
                        }
                        k70 k70Var3 = (k70) obj2;
                        String b5 = k70Var3 != null ? k70Var3.b() : null;
                        JSONObject a8 = b5 != null ? dq0.a(b5) : null;
                        if (a8 != null) {
                            boolean z4 = a8.optInt(C1513m5.f17175v, 0) == 1;
                            String optString = a8.optString("token");
                            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                            String optString2 = a8.optString("advertiserInfo");
                            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                            c1944g92 = new C1944g9(optString, optString2, z4);
                        }
                        c1944g9 = new ga2(bb2Var, huVar, a4, w02Var, a5, a7, c1944g92);
                    }
                }
                c1944g92 = c1944g9;
            }
            if (c1944g92 != null) {
                arrayList.add(c1944g92);
            }
        }
        return arrayList;
    }

    public ha2(@NotNull Context context, @NotNull pv0 mediaFileProvider, @NotNull x02 socialAdInfoProvider, @NotNull C1891e4 adInfoProvider, @NotNull C1992i9 adTuneInfoProvider, @Nullable du1 du1Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaFileProvider, "mediaFileProvider");
        Intrinsics.checkNotNullParameter(socialAdInfoProvider, "socialAdInfoProvider");
        Intrinsics.checkNotNullParameter(adInfoProvider, "adInfoProvider");
        Intrinsics.checkNotNullParameter(adTuneInfoProvider, "adTuneInfoProvider");
        this.f26684a = mediaFileProvider;
        this.f26685b = socialAdInfoProvider;
        this.f26686c = adInfoProvider;
        this.f26687d = adTuneInfoProvider;
        this.f26688e = du1Var;
    }
}
