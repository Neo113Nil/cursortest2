package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.ironsource.b9;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdAssets;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final li0 f23148a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final iu0 f23149b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1879dg f23150c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2022jg f23151d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a41(Context context) {
        this(context, r2, r3, new iu0(r3), new C1879dg(), new C2022jg());
        cj0 cj0Var = new cj0();
        li0 li0Var = new li0(context, cj0Var);
    }

    @NotNull
    public final List<C2276uf<? extends Object>> a(@NotNull MediatedNativeAdAssets nativeAdAssets, @NotNull Map<String, Bitmap> imageValues) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        return CollectionsKt.filterNotNull(CollectionsKt.listOf((Object[]) new C2276uf[]{a(nativeAdAssets.getAge(), IronSourceSegment.AGE), a(nativeAdAssets.getBody(), b9.h.f15438E0), a(nativeAdAssets.getCallToAction(), "call_to_action"), a(nativeAdAssets.getDomain(), b9.i.f15522D), a(this.f23148a.a(imageValues, nativeAdAssets.getFavicon()), "favicon"), a(this.f23148a.a(imageValues, nativeAdAssets.getIcon()), b9.h.f15444H0), a(this.f23149b.a(imageValues, nativeAdAssets.getImage(), nativeAdAssets.getMedia()), b9.h.f15446I0), a(nativeAdAssets.getPrice(), "price"), a(String.valueOf(nativeAdAssets.getRating()), "rating"), a(nativeAdAssets.getReviewCount(), "review_count"), a(nativeAdAssets.getSponsored(), "sponsored"), a(nativeAdAssets.getTitle(), b9.h.f15436D0), a(nativeAdAssets.getWarning(), "warning"), a(this.f23148a.a(imageValues, nativeAdAssets.getFeedback()), "feedback")}));
    }

    public a41(@NotNull Context context, @NotNull cj0 imageSizeValidator, @NotNull li0 imageAssetConverter, @NotNull iu0 mediaAssetConverter, @NotNull C1879dg assetCreatorProvider, @NotNull C2022jg assetValueValidatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageSizeValidator, "imageSizeValidator");
        Intrinsics.checkNotNullParameter(imageAssetConverter, "imageAssetConverter");
        Intrinsics.checkNotNullParameter(mediaAssetConverter, "mediaAssetConverter");
        Intrinsics.checkNotNullParameter(assetCreatorProvider, "assetCreatorProvider");
        Intrinsics.checkNotNullParameter(assetValueValidatorProvider, "assetValueValidatorProvider");
        this.f23148a = imageAssetConverter;
        this.f23149b = mediaAssetConverter;
        this.f23150c = assetCreatorProvider;
        this.f23151d = assetValueValidatorProvider;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r10.equals(com.ironsource.b9.h.f15444H0) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        r0 = new com.yandex.mobile.ads.impl.fj0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r10.equals("review_count") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        r0 = new com.yandex.mobile.ads.impl.kd1(new com.yandex.mobile.ads.impl.kr1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r10.equals("rating") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (r10.equals("favicon") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0046, code lost:
    
        if (r10.equals(com.ironsource.b9.h.f15444H0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005c, code lost:
    
        r1 = new com.yandex.mobile.ads.impl.mi0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004d, code lost:
    
        if (r10.equals("feedback") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0054, code lost:
    
        if (r10.equals("favicon") == false) goto L23;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C2276uf a(Object obj, String name) {
        InterfaceC1998ig mi0Var;
        AbstractC1855cg q22Var;
        this.f23151d.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        int hashCode = name.hashCode();
        if (hashCode != -1074675180) {
            if (hashCode != -191501435) {
                if (hashCode != 3226745) {
                    if (hashCode == 103772132 && name.equals(b9.h.f15446I0)) {
                        mi0Var = new lu0(new mi0(), new lw0());
                    }
                }
                mi0Var = new r22();
            }
        }
        if (obj == null || !mi0Var.a(obj)) {
            return null;
        }
        this.f23150c.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        switch (name.hashCode()) {
            case -1678958759:
                if (name.equals("close_button")) {
                    q22Var = new cp();
                    break;
                }
                q22Var = new q22();
                break;
            case -1074675180:
                break;
            case -938102371:
                break;
            case -807286424:
                break;
            case -191501435:
                if (name.equals("feedback")) {
                    q22Var = new qa0();
                    break;
                }
                q22Var = new q22();
                break;
            case 3226745:
                break;
            case 103772132:
                if (name.equals(b9.h.f15446I0)) {
                    q22Var = new ju0();
                    break;
                }
                q22Var = new q22();
                break;
            default:
                q22Var = new q22();
                break;
        }
        return q22Var.a(obj, name);
    }
}
