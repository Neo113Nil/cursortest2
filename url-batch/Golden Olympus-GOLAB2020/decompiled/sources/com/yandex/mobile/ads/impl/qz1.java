package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.c92;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qz1 extends u61 {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x71 f30961f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ew1 f30962g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz1(@NotNull Context context, @NotNull x71 nativeCompositeAd, @NotNull o71 assetsValidator, @NotNull ew1 sdkSettings, @NotNull C2360y7<?> adResponse) {
        super(context, assetsValidator, adResponse);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeCompositeAd, "nativeCompositeAd");
        Intrinsics.checkNotNullParameter(assetsValidator, "assetsValidator");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f30961f = nativeCompositeAd;
        this.f30962g = sdkSettings;
    }

    @Override // com.yandex.mobile.ads.impl.u61
    @NotNull
    public final c92 a(@NotNull Context context, int i4, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(context, "context");
        du1 a4 = this.f30962g.a(context);
        c92 a5 = (a4 == null || a4.k0()) ? super.a(context, i4, z4, z5) : new c92(c92.a.f24127c, null);
        if (a5.b() == c92.a.f24127c) {
            Intrinsics.checkNotNullParameter(context, "context");
            List<f61> e4 = this.f30961f.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : e4) {
                if (obj instanceof n81) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    n81 n81Var = (n81) obj2;
                    aa1 nativeAdValidator = n81Var.f();
                    tb1 nativeVisualBlock = n81Var.g();
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(nativeAdValidator, "nativeAdValidator");
                    Intrinsics.checkNotNullParameter(nativeVisualBlock, "nativeVisualBlock");
                    du1 a6 = this.f30962g.a(context);
                    boolean z6 = a6 == null || a6.k0();
                    Iterator<tx1> it = nativeVisualBlock.e().iterator();
                    while (it.hasNext()) {
                        int d4 = z6 ? it.next().d() : i4;
                        if ((z5 ? nativeAdValidator.b(context, d4) : nativeAdValidator.a(context, d4)).b() != c92.a.f24127c) {
                            break;
                        }
                    }
                }
            }
            c92.a aVar = c92.a.f24127c;
            return c92.a(a5);
        }
        return a5;
    }
}
