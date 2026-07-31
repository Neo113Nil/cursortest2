package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
public final class zzfw {
    private final WebView zza;
    private final InterfaceC3316J zzb;

    public zzfw(WebView webView, InterfaceC3316J interfaceC3316J) {
        this.zza = webView;
        this.zzb = interfaceC3316J;
    }

    public final void zzb(String str, String... strArr) {
        AbstractC3337k.d(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }
}
