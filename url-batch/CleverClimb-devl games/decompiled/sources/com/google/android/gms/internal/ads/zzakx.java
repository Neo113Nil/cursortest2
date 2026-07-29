package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(18)
/* loaded from: classes2.dex */
public class zzakx extends zzakw {
    @Override // com.google.android.gms.internal.ads.zzakq
    public boolean isAttachedToWindow(View view) {
        return super.isAttachedToWindow(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final int zzrn() {
        return 14;
    }
}
