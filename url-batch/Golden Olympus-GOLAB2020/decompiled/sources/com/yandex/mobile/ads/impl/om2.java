package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeBulkAdLoadListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class om2 implements nt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final NativeBulkAdLoadListener f30100a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f30102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdRequestError adRequestError) {
            super(0);
            this.f30102c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            om2.this.f30100a.onAdsFailedToLoad(this.f30102c);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<com.yandex.mobile.ads.nativeads.e> f30104c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList arrayList) {
            super(0);
            this.f30104c = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            om2.this.f30100a.onAdsLoaded(this.f30104c);
            return Unit.f41027a;
        }
    }

    public om2(@NotNull NativeBulkAdLoadListener loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f30100a = loadListener;
    }

    @Override // com.yandex.mobile.ads.impl.nt
    public final void onAdsLoaded(@NotNull List<? extends f61> nativeAds) {
        Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(nativeAds, 10));
        Iterator<T> it = nativeAds.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.yandex.mobile.ads.nativeads.e((f61) it.next()));
        }
        new CallbackStackTraceMarker(new b(arrayList));
    }

    @Override // com.yandex.mobile.ads.impl.nt
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }
}
