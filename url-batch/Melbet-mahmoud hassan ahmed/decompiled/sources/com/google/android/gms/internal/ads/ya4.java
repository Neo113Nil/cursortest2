package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class ya4 implements wa4 {

    /* renamed from: a, reason: collision with root package name */
    private final WindowManager f14598a;

    private ya4(WindowManager windowManager) {
        this.f14598a = windowManager;
    }

    public static wa4 b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new ya4(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wa4
    public final void a(ua4 ua4Var) {
        bb4.b(ua4Var.f12726a, this.f14598a.getDefaultDisplay());
    }

    @Override // com.google.android.gms.internal.ads.wa4
    public final void zza() {
    }
}
