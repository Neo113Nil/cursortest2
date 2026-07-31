package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

@TargetApi(19)
/* loaded from: classes.dex */
public final class it1 {

    /* renamed from: a, reason: collision with root package name */
    private Context f6784a;

    /* renamed from: b, reason: collision with root package name */
    private PopupWindow f6785b;

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, View view) {
        PopupWindow popupWindow;
        if (!v3.l.e() || v3.l.g()) {
            return;
        }
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window != null && window.getDecorView() != null && !((Activity) context).isDestroyed()) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            io0.b("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
            }
            this.f6785b = popupWindow;
            if (popupWindow == null) {
                context = null;
            }
            this.f6784a = context;
        }
        popupWindow = null;
        this.f6785b = popupWindow;
        if (popupWindow == null) {
        }
        this.f6784a = context;
    }

    public final void b() {
        Context context = this.f6784a;
        if (context == null || this.f6785b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f6785b.isShowing()) {
            this.f6785b.dismiss();
        }
        this.f6784a = null;
        this.f6785b = null;
    }
}
