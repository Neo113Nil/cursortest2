package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class om0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f30095a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final iu f30096b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o12 f30097c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zy f30098d;

    public om0(@NotNull Context context, @NotNull ob2<on0> videoAdInfo, @NotNull iu creativeAssetsProvider, @NotNull o12 sponsoredAssetProviderCreator, @NotNull zy callToActionAssetProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(creativeAssetsProvider, "creativeAssetsProvider");
        Intrinsics.checkNotNullParameter(sponsoredAssetProviderCreator, "sponsoredAssetProviderCreator");
        Intrinsics.checkNotNullParameter(callToActionAssetProvider, "callToActionAssetProvider");
        this.f30095a = videoAdInfo;
        this.f30096b = creativeAssetsProvider;
        this.f30097c = sponsoredAssetProviderCreator;
        this.f30098d = callToActionAssetProvider;
    }

    @NotNull
    public final List<C2276uf<?>> a() {
        Object obj;
        hu b4 = this.f30095a.b();
        this.f30096b.getClass();
        List<C2276uf<?>> mutableList = CollectionsKt.toMutableList((Collection) iu.a(b4));
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{new Pair("sponsored", this.f30097c.a()), new Pair("call_to_action", this.f30098d)})) {
            String str = (String) pair.component1();
            vy vyVar = (vy) pair.component2();
            Iterator<T> it = mutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((C2276uf) obj).b(), str)) {
                    break;
                }
            }
            if (((C2276uf) obj) == null) {
                mutableList.add(vyVar.a());
            }
        }
        return mutableList;
    }
}
