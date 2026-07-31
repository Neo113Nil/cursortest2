package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2175q5 implements nd0, zy1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewGroup f30660a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2262u1 f30661b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mr f30662c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2106n5 f30663d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ExtendedNativeAdView f30664e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2239t1 f30665f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final rl1 f30666g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final np f30667h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final sr1 f30668i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ArrayList f30669j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<C2243t5> f30670k;

    /* renamed from: l, reason: collision with root package name */
    private final long f30671l;

    /* renamed from: m, reason: collision with root package name */
    private int f30672m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f30673n;

    /* renamed from: com.yandex.mobile.ads.impl.q5$a */
    private final class a implements InterfaceC2194r2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2194r2
        public final void a() {
            C2175q5.this.d();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2194r2
        public final void b() {
            int i4 = C2175q5.this.f30672m - 1;
            if (i4 == C2175q5.this.f30663d.c() && !C2175q5.this.f30673n) {
                C2175q5.this.f30673n = true;
                C2175q5.this.f30661b.b();
            }
            C2243t5 c2243t5 = (C2243t5) CollectionsKt.getOrNull(C2175q5.this.f30670k, i4);
            if ((c2243t5 != null ? c2243t5.c() : null) != EnumC2289v5.f33496c || c2243t5.b() == null) {
                C2175q5.this.d();
            }
        }
    }

    public C2175q5(@NotNull Context context, @NotNull f61 nativeAdPrivate, @NotNull dt adEventListener, @NotNull ds1 closeVerificationController, @Nullable ArrayList arrayList, @Nullable q20 q20Var, @NotNull ViewGroup subAdsContainer, @NotNull InterfaceC2262u1 adBlockCompleteListener, @NotNull mr contentCloseListener, @NotNull tq0 layoutDesignsControllerCreator, @NotNull C2106n5 adPod, @NotNull ExtendedNativeAdView nativeAdView, @NotNull C2239t1 adBlockBinder, @NotNull rl1 progressIncrementer, @NotNull np closeTimerProgressIncrementer, @NotNull sr1 timerViewController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        Intrinsics.checkNotNullParameter(closeVerificationController, "closeVerificationController");
        Intrinsics.checkNotNullParameter(subAdsContainer, "subAdsContainer");
        Intrinsics.checkNotNullParameter(adBlockCompleteListener, "adBlockCompleteListener");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(layoutDesignsControllerCreator, "layoutDesignsControllerCreator");
        Intrinsics.checkNotNullParameter(adPod, "adPod");
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(adBlockBinder, "adBlockBinder");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        Intrinsics.checkNotNullParameter(timerViewController, "timerViewController");
        this.f30660a = subAdsContainer;
        this.f30661b = adBlockCompleteListener;
        this.f30662c = contentCloseListener;
        this.f30663d = adPod;
        this.f30664e = nativeAdView;
        this.f30665f = adBlockBinder;
        this.f30666g = progressIncrementer;
        this.f30667h = closeTimerProgressIncrementer;
        this.f30668i = timerViewController;
        List<C2243t5> b4 = adPod.b();
        this.f30670k = b4;
        Iterator<T> it = b4.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += ((C2243t5) it.next()).a();
        }
        this.f30671l = j4;
        this.f30669j = layoutDesignsControllerCreator.a(context, this.f30664e, nativeAdPrivate, adEventListener, new a(), closeVerificationController, this.f30666g, new C2220s5(this), arrayList, q20Var, this.f30663d, this.f30667h);
    }

    @Override // com.yandex.mobile.ads.impl.nd0
    public final void invalidate() {
        ArrayList arrayList = this.f30669j;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((sq0) obj).b();
        }
        this.f30665f.a();
    }

    private final void b() {
        this.f30660a.setContentDescription("pageIndex: " + this.f30672m);
    }

    @Override // com.yandex.mobile.ads.impl.zy1
    public final void a() {
        C2266u5 b4;
        int i4 = this.f30672m - 1;
        if (i4 == this.f30663d.c() && !this.f30673n) {
            this.f30673n = true;
            this.f30661b.b();
        }
        if (this.f30672m < this.f30669j.size()) {
            sq0 sq0Var = (sq0) CollectionsKt.getOrNull(this.f30669j, i4);
            if (sq0Var != null) {
                sq0Var.b();
            }
            C2243t5 c2243t5 = (C2243t5) CollectionsKt.getOrNull(this.f30670k, i4);
            if (((c2243t5 == null || (b4 = c2243t5.b()) == null) ? null : b4.b()) != jz1.f27908c) {
                d();
                return;
            }
            int size = this.f30669j.size() - 1;
            this.f30672m = size;
            Iterator<T> it = this.f30670k.subList(i4, size).iterator();
            long j4 = 0;
            while (it.hasNext()) {
                j4 += ((C2243t5) it.next()).a();
            }
            this.f30666g.a(j4);
            this.f30667h.b();
            int i5 = this.f30672m;
            this.f30672m = i5 + 1;
            if (((sq0) this.f30669j.get(i5)).a()) {
                b();
                this.f30668i.a(this.f30664e, this.f30671l, this.f30666g.a());
            } else if (this.f30672m >= this.f30669j.size()) {
                this.f30662c.f();
            } else {
                d();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.nd0
    public final void c() {
        ViewGroup viewGroup = this.f30660a;
        ExtendedNativeAdView extendedNativeAdView = this.f30664e;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(extendedNativeAdView, layoutParams);
        if (this.f30665f.a(this.f30664e)) {
            this.f30672m = 1;
            this.f30673n = false;
            sq0 sq0Var = (sq0) CollectionsKt.firstOrNull((List) this.f30669j);
            if (sq0Var != null && sq0Var.a()) {
                b();
                this.f30668i.a(this.f30664e, this.f30671l, this.f30666g.a());
            } else if (this.f30672m >= this.f30669j.size()) {
                this.f30662c.f();
            } else {
                d();
            }
        }
    }

    public final void d() {
        C2243t5 c2243t5 = (C2243t5) CollectionsKt.getOrNull(this.f30670k, this.f30672m - 1);
        this.f30666g.a(c2243t5 != null ? c2243t5.a() : 0L);
        this.f30667h.b();
        if (this.f30672m < this.f30669j.size()) {
            int i4 = this.f30672m;
            this.f30672m = i4 + 1;
            if (((sq0) this.f30669j.get(i4)).a()) {
                b();
                this.f30668i.a(this.f30664e, this.f30671l, this.f30666g.a());
            } else if (this.f30672m >= this.f30669j.size()) {
                this.f30662c.f();
            } else {
                d();
            }
        }
    }
}
