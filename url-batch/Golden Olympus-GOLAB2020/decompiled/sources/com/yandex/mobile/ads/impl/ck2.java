package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bb2;
import com.yandex.mobile.ads.impl.jb2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ck2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bb2 f24236a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ak2 f24237b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bk2 f24238c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final dk2 f24239d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f24240e;

    public /* synthetic */ ck2(Context context, bb2 bb2Var) {
        this(context, bb2Var, new ak2(bb2Var), new bk2(), new dk2());
    }

    @NotNull
    public final ArrayList a(@NotNull List videoAds) {
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(videoAds, 10));
        Iterator it = videoAds.iterator();
        while (it.hasNext()) {
            bb2 inlineVideoAd = (bb2) it.next();
            ArrayList a4 = this.f24237b.a(inlineVideoAd);
            bk2 bk2Var = this.f24238c;
            bb2 wrapperVideoAd = this.f24236a;
            bk2Var.getClass();
            Intrinsics.checkNotNullParameter(inlineVideoAd, "videoAd");
            Intrinsics.checkNotNullParameter(wrapperVideoAd, "wrapperVideoAd");
            jb2 l4 = inlineVideoAd.l();
            jb2 l5 = wrapperVideoAd.l();
            jb2 a5 = new jb2.a().a(CollectionsKt.plus((Collection) l4.a(), (Iterable) l5.a())).b(CollectionsKt.plus((Collection) l4.b(), (Iterable) l5.b())).a();
            dk2 dk2Var = this.f24239d;
            bb2 wrapperVideoAd2 = this.f24236a;
            dk2Var.getClass();
            Intrinsics.checkNotNullParameter(inlineVideoAd, "inlineVideoAd");
            Intrinsics.checkNotNullParameter(wrapperVideoAd2, "wrapperVideoAd");
            List listOf = CollectionsKt.listOf((Object[]) new bb2[]{inlineVideoAd, wrapperVideoAd2});
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listOf.iterator();
            while (it2.hasNext()) {
                oh2 m4 = ((bb2) it2.next()).m();
                List<String> a6 = m4 != null ? m4.a() : null;
                if (a6 == null) {
                    a6 = CollectionsKt.emptyList();
                }
                CollectionsKt.addAll(arrayList2, a6);
            }
            oh2 oh2Var = new oh2(arrayList2);
            Map<String, List<String>> h4 = inlineVideoAd.h();
            Map<String, List<String>> h5 = this.f24236a.h();
            List plus = CollectionsKt.plus((Collection) inlineVideoAd.d(), (Iterable) this.f24236a.d());
            Context context = this.f24240e;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            arrayList.add(new bb2.a(context, inlineVideoAd.o()).f(inlineVideoAd.g()).a(a4).a(h4).c(inlineVideoAd.b()).d(inlineVideoAd.c()).e(inlineVideoAd.f()).g(inlineVideoAd.j()).h(inlineVideoAd.k()).a(a5).a(oh2Var).a(inlineVideoAd.n()).a(h5).a(plus).a());
        }
        return arrayList;
    }

    public ck2(@NotNull Context context, @NotNull bb2 wrapperVideoAd, @NotNull ak2 wrappedAdCreativesCreator, @NotNull bk2 wrappedAdExtensionsCreator, @NotNull dk2 wrappedViewableImpressionCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrapperVideoAd, "wrapperVideoAd");
        Intrinsics.checkNotNullParameter(wrappedAdCreativesCreator, "wrappedAdCreativesCreator");
        Intrinsics.checkNotNullParameter(wrappedAdExtensionsCreator, "wrappedAdExtensionsCreator");
        Intrinsics.checkNotNullParameter(wrappedViewableImpressionCreator, "wrappedViewableImpressionCreator");
        this.f24236a = wrapperVideoAd;
        this.f24237b = wrappedAdCreativesCreator;
        this.f24238c = wrappedAdExtensionsCreator;
        this.f24239d = wrappedViewableImpressionCreator;
        this.f24240e = context.getApplicationContext();
    }
}
