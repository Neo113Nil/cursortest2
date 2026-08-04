package com.swmansion.rnscreens.safearea;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSSafeAreaViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSSafeAreaViewManagerInterface;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SafeAreaViewManager.kt */
@ReactModule(name = SafeAreaViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/swmansion/rnscreens/safearea/SafeAreaViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/safearea/SafeAreaView;", "Lcom/facebook/react/viewmanagers/RNSSafeAreaViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "setEdges", "", "view", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lcom/facebook/react/bridge/ReadableMap;", "setInsetType", "updateState", "", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "Companion", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SafeAreaViewManager extends ViewGroupManager<SafeAreaView> implements RNSSafeAreaViewManagerInterface<SafeAreaView> {
    public static final String REACT_CLASS = "RNSSafeAreaView";
    private final ViewManagerDelegate<SafeAreaView> delegate;

    public SafeAreaViewManager() {
        super(null, 1, null);
        this.delegate = new RNSSafeAreaViewManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public SafeAreaView createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new SafeAreaView(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<SafeAreaView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.viewmanagers.RNSSafeAreaViewManagerInterface
    public void setEdges(SafeAreaView view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        SafeAreaViewEdges fromProp = SafeAreaViewEdges.INSTANCE.fromProp(value);
        if (fromProp != null) {
            view.setEdges(fromProp);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r4.equals("all") != false) goto L21;
     */
    @Override // com.facebook.react.viewmanagers.RNSSafeAreaViewManagerInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setInsetType(SafeAreaView view, String value) {
        InsetType insetType;
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            int hashCode = value.hashCode();
            if (hashCode != -887328209) {
                if (hashCode != 96673) {
                    if (hashCode == 502623545 && value.equals("interface")) {
                        insetType = InsetType.INTERFACE;
                        view.setInsetType(insetType);
                    }
                }
                throw new JSApplicationIllegalArgumentException("Unknown inset type " + value);
            }
            if (value.equals("system")) {
                insetType = InsetType.SYSTEM;
                view.setInsetType(insetType);
            }
            throw new JSApplicationIllegalArgumentException("Unknown inset type " + value);
        }
        insetType = InsetType.ALL;
        view.setInsetType(insetType);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(SafeAreaView view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState((SafeAreaViewManager) view, props, stateWrapper);
    }
}
