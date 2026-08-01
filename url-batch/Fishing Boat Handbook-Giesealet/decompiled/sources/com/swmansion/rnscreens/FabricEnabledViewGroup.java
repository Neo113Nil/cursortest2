package com.swmansion.rnscreens;

import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.Metadata;

/* compiled from: FabricEnabledViewGroup.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ \u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0004¨\u0006\u000f"}, d2 = {"Lcom/swmansion/rnscreens/FabricEnabledViewGroup;", "Landroid/view/ViewGroup;", "context", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "setStateWrapper", "", "wrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "updateScreenSizeFabric", "width", "", "height", "headerHeight", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FabricEnabledViewGroup extends ViewGroup {
    public final void setStateWrapper(StateWrapper wrapper) {
    }

    protected final void updateScreenSizeFabric(int width, int height, int headerHeight) {
    }

    public FabricEnabledViewGroup(ReactContext reactContext) {
        super(reactContext);
    }
}
