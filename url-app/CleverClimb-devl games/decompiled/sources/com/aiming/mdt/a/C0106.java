package com.aiming.mdt.a;

import android.content.Context;
import android.view.View;
import com.aiming.mdt.adt.AbstractC0242;
import com.aiming.mdt.adt.InterfaceC0231;

/* renamed from: com.aiming.mdt.a.ʼʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0106 extends AbstractC0242 {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private ViewOnAttachStateChangeListenerC0176 f304;

    public C0106(Context context, String str) {
        this.f304 = new ViewOnAttachStateChangeListenerC0176(context, str);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m379() {
        this.f304.m854();
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m380() {
        this.f304.mo11();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m381(View view) {
        ViewOnAttachStateChangeListenerC0176 viewOnAttachStateChangeListenerC0176 = this.f304;
        view.setOnClickListener(viewOnAttachStateChangeListenerC0176);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0176);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m382(InterfaceC0231 interfaceC0231) {
        this.f304.mo16(interfaceC0231);
    }
}
