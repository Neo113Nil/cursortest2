package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSStackScreenManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setActivityMode(T t, String str);

    void setPreventNativeDismiss(T t, boolean z);

    void setScreenKey(T t, String str);
}
