package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wz0;

/* loaded from: classes3.dex */
public abstract class g12 implements wz0.b {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
