package com.google.android.gms.common;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: f, reason: collision with root package name */
    private final int f2456f;

    public GooglePlayServicesManifestException(int i7, @RecentlyNonNull String str) {
        super(str);
        this.f2456f = i7;
    }
}
