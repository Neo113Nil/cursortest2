package com.aiming.mdt.adt.interactive;

import android.webkit.ValueCallback;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.adt.interactive.ʻʼʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0204 implements ValueCallback<String> {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ RunnableC0214 f709;

    C0204(RunnableC0214 runnableC0214) {
        this.f709 = runnableC0214;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        StringBuilder sb = new StringBuilder("evaluateJs : ");
        sb.append(this.f709.f721);
        sb.append(" result is : ");
        sb.append(str);
        C0282.m973("moby-js", sb.toString());
    }
}
