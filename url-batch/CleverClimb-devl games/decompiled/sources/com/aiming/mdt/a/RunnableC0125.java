package com.aiming.mdt.a;

import android.content.Context;
import android.view.WindowManager;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.a.ʼʽˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0125 implements Runnable {

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ C0091 f382;

    RunnableC0125(C0091 c0091) {
        this.f382 = c0091;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        SurfaceHolderCallbackC0134 surfaceHolderCallbackC0134;
        SurfaceHolderCallbackC0134 surfaceHolderCallbackC01342;
        C0183 c0183;
        SurfaceHolderCallbackC0134 surfaceHolderCallbackC01343;
        C0183 c01832;
        SurfaceHolderCallbackC0134 surfaceHolderCallbackC01344;
        C0183 c01833;
        SurfaceHolderCallbackC0134 surfaceHolderCallbackC01345;
        InterfaceC0102 interfaceC0102;
        WindowManager windowManager;
        SurfaceHolderCallbackC0134 surfaceHolderCallbackC01346;
        WindowManager.LayoutParams layoutParams;
        try {
            C0091 c0091 = this.f382;
            context = this.f382.f262;
            c0091.f259 = new SurfaceHolderCallbackC0134(context);
            surfaceHolderCallbackC0134 = this.f382.f259;
            surfaceHolderCallbackC0134.setFitsSystemWindows(true);
            surfaceHolderCallbackC01342 = this.f382.f259;
            c0183 = this.f382.f258;
            surfaceHolderCallbackC01342.m510(c0183.m686());
            surfaceHolderCallbackC01343 = this.f382.f259;
            c01832 = this.f382.f258;
            surfaceHolderCallbackC01343.m512(c01832.m689());
            surfaceHolderCallbackC01344 = this.f382.f259;
            c01833 = this.f382.f258;
            surfaceHolderCallbackC01344.m509(c01833.m688());
            surfaceHolderCallbackC01345 = this.f382.f259;
            interfaceC0102 = this.f382.f261;
            surfaceHolderCallbackC01345.m511(interfaceC0102);
            windowManager = this.f382.f263;
            surfaceHolderCallbackC01346 = this.f382.f259;
            layoutParams = this.f382.f260;
            windowManager.addView(surfaceHolderCallbackC01346, layoutParams);
            C0091.m342(this.f382, true);
        } catch (Exception e) {
            C0282.m972("DanmakuCore", e);
            C0076.m232().m236(e);
        }
    }
}
