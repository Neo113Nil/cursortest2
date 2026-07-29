package com.aiming.mdt.a;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.C0290;

/* renamed from: com.aiming.mdt.a.ʻʾˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0091 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private C0183 f258;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private SurfaceHolderCallbackC0134 f259;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private WindowManager.LayoutParams f260;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private InterfaceC0102 f261;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Context f262;

    /* renamed from: ʽ, reason: contains not printable characters */
    private WindowManager f263;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f264;

    /* renamed from: com.aiming.mdt.a.ʻʾˈˉ$ʽ, reason: contains not printable characters */
    static final class C0092 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static final C0091 f265 = new C0091(0);
    }

    private C0091() {
        this.f263 = null;
        this.f260 = null;
        this.f259 = null;
        this.f264 = false;
    }

    /* synthetic */ C0091(byte b2) {
        this();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static /* synthetic */ boolean m342(C0091 c0091, boolean z) {
        c0091.f264 = true;
        return true;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final boolean m347() {
        return this.f264;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m348(Activity activity, C0183 c0183, InterfaceC0102 interfaceC0102) {
        if (C0290.m984(activity)) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.flags = 1048;
            layoutParams.format = -3;
            ((ViewGroup.LayoutParams) layoutParams).width = -1;
            ((ViewGroup.LayoutParams) layoutParams).height = -1;
            layoutParams.gravity = 17;
            layoutParams.type = 2;
            this.f260 = layoutParams;
            this.f262 = activity.getApplicationContext();
            this.f263 = (WindowManager) activity.getSystemService("window");
            this.f258 = c0183;
            this.f261 = interfaceC0102;
            C0285.m979(new RunnableC0125(this));
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m349() {
        try {
            if (this.f263 != null && this.f259 != null) {
                this.f259.setVisibility(8);
                this.f263.removeViewImmediate(this.f259);
                this.f259 = null;
                this.f263 = null;
            }
            this.f264 = false;
        } catch (Exception e) {
            C0282.m972("DanmakuCore", e);
            C0076.m232().m236(e);
        }
    }
}
