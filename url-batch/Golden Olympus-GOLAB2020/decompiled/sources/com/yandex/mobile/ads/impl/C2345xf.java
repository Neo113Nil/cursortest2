package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.b9;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2345xf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f71 f34541a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2322wf f34542b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f34543c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2345xf(@NotNull f71 nativeAdWeakViewProvider, @NotNull C2322wf assetAdapterCreator, @NotNull List<? extends C2276uf<?>> assets) {
        Intrinsics.checkNotNullParameter(nativeAdWeakViewProvider, "nativeAdWeakViewProvider");
        Intrinsics.checkNotNullParameter(assetAdapterCreator, "assetAdapterCreator");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f34541a = nativeAdWeakViewProvider;
        this.f34542b = assetAdapterCreator;
        this.f34543c = assets;
    }

    @NotNull
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        C2322wf c2322wf = this.f34542b;
        View a4 = this.f34541a.a("close_button");
        TextView textView = a4 instanceof TextView ? (TextView) a4 : null;
        c2322wf.getClass();
        ip ipVar = textView != null ? new ip(textView) : null;
        hashMap.put("close_button", ipVar != null ? new uy(ipVar) : null);
        C2322wf c2322wf2 = this.f34542b;
        View a5 = this.f34541a.a("feedback");
        hashMap.put("feedback", c2322wf2.a(a5 instanceof ImageView ? (ImageView) a5 : null));
        C2322wf c2322wf3 = this.f34542b;
        ImageView c4 = this.f34541a.c();
        View a6 = this.f34541a.a(b9.h.f15446I0);
        hashMap.put(b9.h.f15446I0, c2322wf3.a(c4, a6 instanceof CustomizableMediaView ? (CustomizableMediaView) a6 : null));
        hashMap.put("rating", this.f34542b.a(this.f34541a.a("rating")));
        C2322wf c2322wf4 = this.f34542b;
        View e4 = this.f34541a.e();
        c2322wf4.getClass();
        ns1 ns1Var = e4 != null ? new ns1(e4) : null;
        hashMap.put("root_container", ns1Var != null ? new uy(ns1Var) : null);
        List<zu> b4 = this.f34541a.b();
        if (b4 != null) {
            Iterator<T> it = b4.iterator();
            if (it.hasNext()) {
                zu customAsset = (zu) it.next();
                customAsset.getClass();
                this.f34542b.getClass();
                Intrinsics.checkNotNullParameter(customAsset, "customAsset");
                zu.a();
                throw null;
            }
        }
        for (C2276uf<?> c2276uf : this.f34543c) {
            View view = this.f34541a.a(c2276uf.b());
            if (view != null && !hashMap.containsKey(c2276uf.b())) {
                InterfaceC2299vf<?> a7 = this.f34542b.a(view, c2276uf.c());
                if (a7 == null) {
                    this.f34542b.getClass();
                    Intrinsics.checkNotNullParameter(view, "view");
                    a7 = new uy<>(new l00(view));
                }
                hashMap.put(c2276uf.b(), a7);
            }
        }
        for (Map.Entry entry : this.f34541a.a().entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) ((WeakReference) entry.getValue()).get();
            if (view2 != null && !hashMap.containsKey(str)) {
                this.f34542b.getClass();
                Intrinsics.checkNotNullParameter(view2, "view");
                hashMap.put(str, new uy(new l00(view2)));
            }
        }
        return hashMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2345xf(@NotNull f71 nativeAdWeakViewProvider, @NotNull zi0 imageProvider, @NotNull qw0 mediaViewAdapterCreator, @NotNull a91 nativeMediaContent, @NotNull h81 nativeForcePauseObserver, @NotNull C2360y7<?> adResponse, @NotNull tb1 nativeVisualBlock, @NotNull mp1 reporter, @NotNull av customAssetTracker) {
        this(nativeAdWeakViewProvider, new C2322wf(adResponse, imageProvider, mediaViewAdapterCreator, nativeMediaContent, nativeForcePauseObserver, reporter, customAssetTracker), nativeVisualBlock.b());
        Intrinsics.checkNotNullParameter(nativeAdWeakViewProvider, "nativeAdWeakViewProvider");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(mediaViewAdapterCreator, "mediaViewAdapterCreator");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeVisualBlock, "nativeVisualBlock");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(customAssetTracker, "customAssetTracker");
    }
}
