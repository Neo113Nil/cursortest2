package com.margelo.nitro.rnstartiosdk.views;

import android.view.View;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.margelo.nitro.R;
import com.margelo.nitro.views.RecyclableView;
import com.rnstartiosdk.RNStartIoNativeAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridRNStartIoNativeAdManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u0002H\u0002¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/views/HybridRNStartIoNativeAdManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Landroid/view/View;", "<init>", "()V", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "updateState", "", "view", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "onDropViewInstance", "", "prepareToRecycleView", "getHybridView", "Lcom/rnstartiosdk/RNStartIoNativeAd;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HybridRNStartIoNativeAdManager extends SimpleViewManager<View> {
    public HybridRNStartIoNativeAdManager() {
        if (RecyclableView.class.isAssignableFrom(RNStartIoNativeAd.class)) {
            super.setupViewRecycling();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNStartIoNativeAd";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected View createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        RNStartIoNativeAd rNStartIoNativeAd = new RNStartIoNativeAd(reactContext);
        View view = rNStartIoNativeAd.getView();
        view.setTag(R.id.associated_hybrid_view_tag, rNStartIoNativeAd);
        return view;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(View view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        RNStartIoNativeAd hybridView = getHybridView(view);
        if (hybridView == null) {
            throw new Error("Couldn't find view " + view + " in local views table!");
        }
        hybridView.beforeUpdate();
        HybridRNStartIoNativeAdStateUpdater.INSTANCE.updateViewProps(hybridView, stateWrapper);
        hybridView.afterUpdate();
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RNStartIoNativeAd hybridView = getHybridView(view);
        if (hybridView != null) {
            hybridView.onDropView();
        }
        super.onDropViewInstance(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    protected View prepareToRecycleView(ThemedReactContext reactContext, View view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.prepareToRecycleView(reactContext, view);
        RNStartIoNativeAd hybridView = getHybridView(view);
        if (hybridView == 0 || !(hybridView instanceof RecyclableView)) {
            return null;
        }
        ((RecyclableView) hybridView).prepareForRecycle();
        return hybridView.getView();
    }

    private final RNStartIoNativeAd getHybridView(View view) {
        Object tag = view.getTag(R.id.associated_hybrid_view_tag);
        if (tag instanceof RNStartIoNativeAd) {
            return (RNStartIoNativeAd) tag;
        }
        return null;
    }
}
