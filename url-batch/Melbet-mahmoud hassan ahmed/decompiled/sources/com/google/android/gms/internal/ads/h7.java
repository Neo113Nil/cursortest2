package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
final class h7 implements w6 {

    /* renamed from: a, reason: collision with root package name */
    private File f6094a = null;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f6095b;

    h7(Context context) {
        this.f6095b = context;
    }

    @Override // com.google.android.gms.internal.ads.w6
    public final File zza() {
        if (this.f6094a == null) {
            this.f6094a = new File(this.f6095b.getCacheDir(), "volley");
        }
        return this.f6094a;
    }
}
