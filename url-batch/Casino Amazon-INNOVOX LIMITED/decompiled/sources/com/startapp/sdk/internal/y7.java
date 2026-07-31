package com.startapp.sdk.internal;

import androidx.webkit.internal.AssetHelper;
import com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class y7 {
    public static final b8 f = new b8(new byte[0], AssetHelper.DEFAULT_MIME_TYPE, null);

    /* renamed from: a, reason: collision with root package name */
    public final z7 f506a;
    public final String b;
    public b8 c = f;
    public TimeoutConfig d;
    public a7 e;

    public y7(z7 z7Var, String str) {
        this.f506a = z7Var;
        this.b = str;
    }

    public final c8 a() {
        z7 z7Var = this.f506a;
        try {
            return z7Var.a(this);
        } catch (Throwable th) {
            if (!z7Var.b(1)) {
                return null;
            }
            n8.a(th);
            return null;
        }
    }
}
