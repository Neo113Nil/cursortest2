package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetchListener;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import com.monetization.ads.mediation.base.prefetch.model.MediatedPrefetchAdapterData;
import java.util.HashMap;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o2.C3345o;
import o2.InterfaceC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dk1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bk1 f24658a;

    public static final class a implements MediatedAdapterPrefetchListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ xy0 f24660b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3343n f24661c;

        a(xy0 xy0Var, C3345o c3345o) {
            this.f24660b = xy0Var;
            this.f24661c = c3345o;
        }

        @Override // com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetchListener
        public final void onPrefetchFailed(@Nullable Integer num, @Nullable String str) {
            bk1 bk1Var = dk1.this.f24658a;
            String e4 = this.f24660b.e();
            bk1Var.getClass();
            ak1 a4 = bk1.a(e4, str, num);
            if (this.f24661c.isActive()) {
                this.f24661c.resumeWith(Result.m243constructorimpl(a4));
            }
        }

        @Override // com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetchListener
        public final void onPrefetched(@NotNull MediatedPrefetchAdapterData adapterData) {
            Intrinsics.checkNotNullParameter(adapterData, "mediatedPrefetchAdapterData");
            bk1 bk1Var = dk1.this.f24658a;
            String adapter = this.f24660b.e();
            bk1Var.getClass();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(adapterData, "adapterData");
            ak1 ak1Var = new ak1(adapter, new fk1(adapterData.getNetworkWinner().getNetworkName(), adapterData.getNetworkWinner().getNetworkAdUnit()), new ok1(adapterData.getRevenue().getValue()), new mk1(nk1.f29661c, null, null), adapterData.getNetworkAdInfo());
            if (this.f24661c.isActive()) {
                this.f24661c.resumeWith(Result.m243constructorimpl(ak1Var));
            }
        }
    }

    public /* synthetic */ dk1() {
        this(new bk1());
    }

    @Nullable
    public final Object a(@NotNull Context context, @Nullable vy1 vy1Var, @NotNull xy0 xy0Var, @NotNull MediatedAdapterPrefetcher mediatedAdapterPrefetcher, @NotNull kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        try {
            Context a4 = C2054l0.a();
            if (a4 != null) {
                context = a4;
            }
            HashMap hashMap = new HashMap(xy0Var.i());
            if (vy1Var != null) {
                hashMap.put("width", String.valueOf(vy1Var.getWidth()));
                hashMap.put("height", String.valueOf(vy1Var.getHeight()));
            }
            mediatedAdapterPrefetcher.prefetchAd(context, hashMap, new a(xy0Var, c3345o));
        } catch (Exception unused) {
            if (c3345o.isActive()) {
                mediatedAdapterPrefetcher.onInvalidate();
                Result.Companion companion = Result.Companion;
                bk1 bk1Var = this.f24658a;
                String e4 = xy0Var.e();
                bk1Var.getClass();
                c3345o.resumeWith(Result.m243constructorimpl(bk1.a(e4, null, null)));
            }
        }
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    public dk1(@NotNull bk1 prefetchedMediationInfoFactory) {
        Intrinsics.checkNotNullParameter(prefetchedMediationInfoFactory, "prefetchedMediationInfoFactory");
        this.f24658a = prefetchedMediationInfoFactory;
    }
}
