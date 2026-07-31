package com.rnstartiosdk;

import android.view.View;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAdState.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\f\u001a\u00020\r2\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/rnstartiosdk/NativeAdState;", "", "<init>", "()V", "nativeAdDetails", "Ljava/util/ArrayList;", "Lcom/startapp/sdk/ads/nativead/NativeAdDetails;", "Lkotlin/collections/ArrayList;", "getNativeAdDetails", "()Ljava/util/ArrayList;", "setNativeAdDetails", "(Ljava/util/ArrayList;)V", "updateState", "", "registerView", "index", "", "view", "Landroid/view/View;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NativeAdState {
    public static final NativeAdState INSTANCE = new NativeAdState();
    private static ArrayList<NativeAdDetails> nativeAdDetails;

    private NativeAdState() {
    }

    public final ArrayList<NativeAdDetails> getNativeAdDetails() {
        return nativeAdDetails;
    }

    public final void setNativeAdDetails(ArrayList<NativeAdDetails> arrayList) {
        nativeAdDetails = arrayList;
    }

    public final void updateState(ArrayList<NativeAdDetails> nativeAdDetails2) {
        Intrinsics.checkNotNullParameter(nativeAdDetails2, "nativeAdDetails");
        nativeAdDetails = nativeAdDetails2;
    }

    public final void registerView(double index, View view) {
        NativeAdDetails nativeAdDetails2;
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList<NativeAdDetails> arrayList = nativeAdDetails;
        if (arrayList == null || (nativeAdDetails2 = (NativeAdDetails) CollectionsKt.getOrNull(arrayList, (int) index)) == null) {
            return;
        }
        nativeAdDetails2.registerViewForInteraction(view);
    }
}
