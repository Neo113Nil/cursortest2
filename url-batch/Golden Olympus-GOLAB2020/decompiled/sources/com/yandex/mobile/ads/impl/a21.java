package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a21 implements e11, f11, re1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f23131a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f23132b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f23133c = new ArrayList();

    public final void a(@NotNull e11 mobileAdsSchemeImpressionListener) {
        Intrinsics.checkNotNullParameter(mobileAdsSchemeImpressionListener, "mobileAdsSchemeImpressionListener");
        this.f23131a.add(mobileAdsSchemeImpressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.e11
    public final void b() {
        ArrayList arrayList = this.f23131a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((e11) obj).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.re1
    public final void c() {
        ArrayList arrayList = this.f23133c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((re1) obj).c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.e11
    public final void e() {
        ArrayList arrayList = this.f23131a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((e11) obj).e();
        }
    }

    public final void a(@NotNull f11 mobileAdsSchemeRewardListener) {
        Intrinsics.checkNotNullParameter(mobileAdsSchemeRewardListener, "mobileAdsSchemeRewardListener");
        this.f23132b.add(mobileAdsSchemeRewardListener);
    }

    public final void a(@NotNull re1 onCloseButtonListener) {
        Intrinsics.checkNotNullParameter(onCloseButtonListener, "onCloseButtonListener");
        this.f23133c.add(onCloseButtonListener);
    }

    @Override // com.yandex.mobile.ads.impl.f11
    public final void a() {
        ArrayList arrayList = this.f23132b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((f11) obj).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.re1
    public final void a(boolean z4) {
        ArrayList arrayList = this.f23133c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((re1) obj).a(z4);
        }
    }
}
