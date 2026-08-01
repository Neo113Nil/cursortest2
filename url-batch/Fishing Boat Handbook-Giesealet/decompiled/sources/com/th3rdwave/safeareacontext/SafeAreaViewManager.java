package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SafeAreaViewManager.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0014J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0017J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0017J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016¨\u0006 "}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/viewmanagers/RNCSafeAreaViewManagerInterface;", "Lcom/th3rdwave/safeareacontext/SafeAreaView;", "<init>", "()V", "getName", "", "getDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Lcom/facebook/react/views/view/ReactViewGroup;", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "createShadowNodeInstance", "Lcom/th3rdwave/safeareacontext/SafeAreaViewShadowNode;", "getShadowNodeClass", "Ljava/lang/Class;", "setMode", "", "view", "mode", "setEdges", "propList", "Lcom/facebook/react/bridge/ReadableMap;", "updateState", "", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "Companion", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ReactModule(name = SafeAreaViewManager.REACT_CLASS)
/* loaded from: classes2.dex */
public final class SafeAreaViewManager extends ReactViewManager implements RNCSafeAreaViewManagerInterface<SafeAreaView> {
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<ReactViewGroup> getDelegate() {
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SafeAreaView createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SafeAreaView(context);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public SafeAreaViewShadowNode createShadowNodeInstance() {
        return new SafeAreaViewShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<SafeAreaViewShadowNode> getShadowNodeClass() {
        return SafeAreaViewShadowNode.class;
    }

    @Override // com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface
    @ReactProp(name = "mode")
    public void setMode(SafeAreaView view, String mode) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(mode, ViewProps.PADDING)) {
            view.setMode(SafeAreaViewMode.PADDING);
        } else if (Intrinsics.areEqual(mode, ViewProps.MARGIN)) {
            view.setMode(SafeAreaViewMode.MARGIN);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r7 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface
    @ReactProp(name = "edges")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setEdges(SafeAreaView view, ReadableMap propList) {
        SafeAreaViewEdgeModes safeAreaViewEdgeModes;
        SafeAreaViewEdgeModes safeAreaViewEdgeModes2;
        SafeAreaViewEdgeModes safeAreaViewEdgeModes3;
        SafeAreaViewEdgeModes safeAreaViewEdgeModes4;
        Intrinsics.checkNotNullParameter(view, "view");
        if (propList != null) {
            String string = propList.getString(ViewProps.TOP);
            if (string != null) {
                String upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                safeAreaViewEdgeModes = SafeAreaViewEdgeModes.valueOf(upperCase);
            }
            safeAreaViewEdgeModes = SafeAreaViewEdgeModes.OFF;
            String string2 = propList.getString(ViewProps.RIGHT);
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                safeAreaViewEdgeModes2 = SafeAreaViewEdgeModes.valueOf(upperCase2);
            }
            safeAreaViewEdgeModes2 = SafeAreaViewEdgeModes.OFF;
            String string3 = propList.getString(ViewProps.BOTTOM);
            if (string3 != null) {
                String upperCase3 = string3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                safeAreaViewEdgeModes3 = SafeAreaViewEdgeModes.valueOf(upperCase3);
            }
            safeAreaViewEdgeModes3 = SafeAreaViewEdgeModes.OFF;
            String string4 = propList.getString(ViewProps.LEFT);
            if (string4 != null) {
                String upperCase4 = string4.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                safeAreaViewEdgeModes4 = SafeAreaViewEdgeModes.valueOf(upperCase4);
            }
            safeAreaViewEdgeModes4 = SafeAreaViewEdgeModes.OFF;
            view.setEdges(new SafeAreaViewEdges(safeAreaViewEdgeModes, safeAreaViewEdgeModes2, safeAreaViewEdgeModes3, safeAreaViewEdgeModes4));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactViewGroup view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((SafeAreaView) view).setStateWrapper(stateWrapper);
        return null;
    }
}
