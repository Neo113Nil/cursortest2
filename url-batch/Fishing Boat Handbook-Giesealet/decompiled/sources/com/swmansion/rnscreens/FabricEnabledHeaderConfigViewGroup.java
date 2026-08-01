package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.rnscreens.utils.PaddingBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FabricEnabledHeaderConfigViewGroup.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ&\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J(\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/swmansion/rnscreens/FabricEnabledHeaderConfigViewGroup;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "lastPaddingStart", "", "lastPaddingEnd", "lastHeight", "setStateWrapper", "", "wrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "updateHeaderConfigState", "width", "height", ViewProps.PADDING_START, ViewProps.PADDING_END, "updateState", "Companion", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FabricEnabledHeaderConfigViewGroup extends ViewGroup {
    private static final double DELTA = 0.9d;
    private int lastHeight;
    private int lastPaddingEnd;
    private int lastPaddingStart;

    public final void setStateWrapper(StateWrapper wrapper) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FabricEnabledHeaderConfigViewGroup(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void updateHeaderConfigState(int width, int height, int paddingStart, int paddingEnd) {
        updateState(width, height, paddingStart, paddingEnd);
    }

    private final void updateState(int width, int height, int paddingStart, int paddingEnd) {
        if (Math.abs(this.lastPaddingStart - paddingStart) >= DELTA || Math.abs(this.lastPaddingEnd - paddingEnd) >= DELTA || Math.abs(this.lastHeight - height) >= DELTA) {
            this.lastPaddingStart = paddingStart;
            this.lastPaddingEnd = paddingEnd;
            this.lastHeight = height;
            Context context = getContext();
            ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
            UIManagerModule uIManagerModule = reactContext != null ? (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class) : null;
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), new PaddingBundle(height, paddingStart, paddingEnd));
            }
        }
    }
}
