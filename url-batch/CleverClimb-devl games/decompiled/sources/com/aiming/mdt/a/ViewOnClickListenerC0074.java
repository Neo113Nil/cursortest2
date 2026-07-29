package com.aiming.mdt.a;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.a.ʻʽʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0074 implements View.OnClickListener {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ C0086 f174;

    ViewOnClickListenerC0074(C0086 c0086) {
        this.f174 = c0086;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            Uri parse = Uri.parse("http://www.adtiming.com/en/privacypolicy.html");
            intent.addFlags(268435456);
            intent.setData(parse);
            this.f174.getContext().startActivity(intent);
        } catch (Throwable th) {
            str = C0086.f215;
            C0282.m972(str, th);
            C0076.m232().m236(th);
        }
    }
}
