package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.ironsource.b9;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.wf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2322wf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f34022a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zi0 f34023b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qw0 f34024c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a91 f34025d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final h81 f34026e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final mp1 f34027f;

    public C2322wf(@NotNull C2360y7<?> adResponse, @NotNull zi0 imageProvider, @NotNull qw0 mediaViewAdapterCreator, @NotNull a91 nativeMediaContent, @NotNull h81 nativeForcePauseObserver, @NotNull mp1 reporter, @NotNull av customAssetTracker) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(mediaViewAdapterCreator, "mediaViewAdapterCreator");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(customAssetTracker, "customAssetTracker");
        this.f34022a = adResponse;
        this.f34023b = imageProvider;
        this.f34024c = mediaViewAdapterCreator;
        this.f34025d = nativeMediaContent;
        this.f34026e = nativeForcePauseObserver;
        this.f34027f = reporter;
    }

    @Nullable
    public final ki0 a(@Nullable ImageView imageView) {
        sa0 sa0Var;
        if (imageView != null) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            sa0Var = new sa0(imageView, new qi0(context, new r81(this.f34022a), this.f34023b));
        } else {
            sa0Var = null;
        }
        if (sa0Var != null) {
            return new ki0(sa0Var);
        }
        return null;
    }

    @Nullable
    public final hu0 a(@Nullable ImageView imageView, @Nullable CustomizableMediaView customizableMediaView) {
        mj0 mj0Var = imageView != null ? new mj0(imageView, this.f34023b, this.f34022a) : null;
        pw0 a4 = customizableMediaView != null ? this.f34024c.a(customizableMediaView, this.f34023b, this.f34025d, this.f34026e) : null;
        if (mj0Var == null && a4 == null) {
            return null;
        }
        return new hu0(mj0Var, a4);
    }

    @Nullable
    public final uy a(@Nullable View view) {
        fn1 fn1Var = view instanceof gn1 ? new fn1(view, this.f34027f) : null;
        if (fn1Var != null) {
            return new uy(fn1Var);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r4.equals("string") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if ((r3 instanceof android.widget.TextView) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r4 = (android.widget.TextView) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        return new com.yandex.mobile.ads.impl.uy(new com.yandex.mobile.ads.impl.k42((android.widget.TextView) r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r4.equals("number") == false) goto L42;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2299vf<?> a(@Nullable View view, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1034364087:
                break;
            case -891985903:
                break;
            case -410956671:
                if (type.equals("container")) {
                    return new uy(new ns1(view));
                }
                return null;
            case 100313435:
                if (type.equals("image")) {
                    if ((view instanceof ImageView ? (ImageView) view : null) != null) {
                        return new ki0(new mj0((ImageView) view, this.f34023b, this.f34022a));
                    }
                }
                return null;
            case 103772132:
                if (type.equals(b9.h.f15446I0)) {
                    if ((view instanceof CustomizableMediaView ? (CustomizableMediaView) view : null) != null) {
                        return a((ImageView) null, (CustomizableMediaView) view);
                    }
                }
                return null;
            default:
                return null;
        }
    }
}
