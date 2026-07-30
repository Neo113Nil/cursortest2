package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(@NonNull T t7, @NonNull U u7);
}
