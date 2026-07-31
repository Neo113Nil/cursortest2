package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.facebook.ads.AdClosedListener;

@Keep
@UiThread
/* loaded from: classes4.dex */
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int i);

    void setIconSizeDp(int i);

    void setOnAdClosedListener(AdClosedListener adClosedListener);

    void setSingleIcon(boolean z);
}
