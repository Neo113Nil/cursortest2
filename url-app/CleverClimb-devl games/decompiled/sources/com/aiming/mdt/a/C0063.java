package com.aiming.mdt.a;

import android.content.Context;
import android.widget.RelativeLayout;

/* renamed from: com.aiming.mdt.a.ʻʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0063 extends RelativeLayout {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private ViewOnAttachStateChangeListenerC0021 f142;

    public C0063(Context context, String str) {
        super(context);
        this.f142 = new ViewOnAttachStateChangeListenerC0021(context, str, this);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m194(InterfaceC0105 interfaceC0105) {
        this.f142.mo16(interfaceC0105);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m195() {
        this.f142.m854();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m196() {
        this.f142.mo11();
    }
}
