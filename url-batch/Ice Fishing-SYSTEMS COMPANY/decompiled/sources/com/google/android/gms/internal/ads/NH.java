package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes2.dex */
public class NH extends IOException {

    /* renamed from: n, reason: collision with root package name */
    public final int f26510n;

    public NH() {
        this.f26510n = AdError.REMOTE_ADS_SERVICE_ERROR;
    }

    public NH(String str, int i) {
        super(str);
        this.f26510n = i;
    }

    public NH(String str, Exception exc, int i) {
        super(str, exc);
        this.f26510n = i;
    }

    public NH(int i, Exception exc) {
        super(exc);
        this.f26510n = i;
    }
}
