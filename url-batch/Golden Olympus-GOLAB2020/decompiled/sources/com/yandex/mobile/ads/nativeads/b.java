package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public abstract class b extends CustomizableMediaView {
    public b(@NonNull Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }

    void setVideoControls(int i4) {
        a(i4);
    }
}
