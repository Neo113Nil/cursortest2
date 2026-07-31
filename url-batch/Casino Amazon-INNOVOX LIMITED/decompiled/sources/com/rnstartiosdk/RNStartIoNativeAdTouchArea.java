package com.rnstartiosdk;

import android.view.View;
import com.facebook.react.uimanager.ThemedReactContext;
import com.margelo.nitro.rnstartiosdk.HybridRNStartIoNativeAdTouchAreaSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RNStartIoNativeAdTouchArea.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/rnstartiosdk/RNStartIoNativeAdTouchArea;", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdTouchAreaSpec;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "getContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "value", "", "adIndex", "getAdIndex", "()D", "setAdIndex", "(D)V", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RNStartIoNativeAdTouchArea extends HybridRNStartIoNativeAdTouchAreaSpec {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG;
    private double adIndex;
    private final ThemedReactContext context;
    private final CoroutineScope uiScope;
    private final View view;

    /* compiled from: RNStartIoNativeAdTouchArea.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/rnstartiosdk/RNStartIoNativeAdTouchArea$Companion;", "", "<init>", "()V", "LOG_TAG", "", "getLOG_TAG", "()Ljava/lang/String;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getLOG_TAG() {
            return RNStartIoNativeAdTouchArea.LOG_TAG;
        }
    }

    public RNStartIoNativeAdTouchArea(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.uiScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.view = new View(context);
        this.adIndex = -1.0d;
    }

    public final ThemedReactContext getContext() {
        return this.context;
    }

    static {
        Intrinsics.checkNotNullExpressionValue("RNStartIoNativeAdTouchArea", "getSimpleName(...)");
        LOG_TAG = "RNStartIoNativeAdTouchArea";
    }

    @Override // com.margelo.nitro.views.HybridView
    public View getView() {
        return this.view;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoNativeAdTouchAreaSpec
    public double getAdIndex() {
        return this.adIndex;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoNativeAdTouchAreaSpec
    public void setAdIndex(double d) {
        this.adIndex = d;
        BuildersKt__Builders_commonKt.launch$default(this.uiScope, null, null, new RNStartIoNativeAdTouchArea$adIndex$1(this, null), 3, null);
    }
}
