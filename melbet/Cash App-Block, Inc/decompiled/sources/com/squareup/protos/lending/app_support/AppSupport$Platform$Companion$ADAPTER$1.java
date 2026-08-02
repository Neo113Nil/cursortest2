package com.squareup.protos.lending.app_support;

import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AppSupport$Platform$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AppSupport.Platform.Companion.getClass();
        if (i == 0) {
            return AppSupport.Platform.IOS;
        }
        if (i != 1) {
            return null;
        }
        return AppSupport.Platform.ANDROID;
    }
}
