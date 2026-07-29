package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.sdk.controller.c;
import com.tapjoy.TapjoyConstants;

/* compiled from: ControllerView.java */
/* loaded from: classes2.dex */
public class a extends FrameLayout implements com.ironsource.sdk.e.f {

    /* renamed from: a, reason: collision with root package name */
    private Context f7026a;

    /* renamed from: b, reason: collision with root package name */
    private c f7027b;

    @Override // com.ironsource.sdk.e.f
    public void a(String str, int i) {
    }

    public a(Context context) {
        super(context);
        this.f7026a = context;
        setClickable(true);
    }

    public void a(c cVar) {
        this.f7027b = cVar;
        this.f7027b.setOnWebViewControllerChangeListener(this);
        this.f7027b.requestFocus();
        this.f7026a = this.f7027b.getCurrentActivityContext();
        a(getStatusBarPadding(), getNavigationBarPadding());
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7027b.i();
        this.f7027b.a(true, "main");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7027b.h();
        this.f7027b.a(false, "main");
        if (this.f7027b != null) {
            this.f7027b.setState(c.d.Gone);
            this.f7027b.c();
        }
        removeAllViews();
    }

    private void c() {
        ((Activity) this.f7026a).runOnUiThread(new Runnable() { // from class: com.ironsource.sdk.controller.a.1
            @Override // java.lang.Runnable
            public void run() {
                ViewGroup windowDecorViewGroup = a.this.getWindowDecorViewGroup();
                if (windowDecorViewGroup != null) {
                    windowDecorViewGroup.addView(a.this);
                }
            }
        });
    }

    private void d() {
        ((Activity) this.f7026a).runOnUiThread(new Runnable() { // from class: com.ironsource.sdk.controller.a.2
            @Override // java.lang.Runnable
            public void run() {
                ViewGroup windowDecorViewGroup = a.this.getWindowDecorViewGroup();
                if (windowDecorViewGroup != null) {
                    windowDecorViewGroup.removeView(a.this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f7026a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    private void a(int i, int i2) {
        try {
            if (this.f7026a != null) {
                int f = com.ironsource.environment.c.f(this.f7026a);
                if (f == 1) {
                    setPadding(0, i, 0, i2);
                } else if (f == 2) {
                    setPadding(0, i, i2, 0);
                }
            }
        } catch (Exception unused) {
        }
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if (!((((Activity) this.f7026a).getWindow().getAttributes().flags & 1024) != 0) && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    private int getStatusBarHeight() {
        int identifier;
        try {
            if (this.f7026a == null || (identifier = this.f7026a.getResources().getIdentifier("status_bar_height", "dimen", TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE)) <= 0) {
                return 0;
            }
            return this.f7026a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception unused) {
            return 0;
        }
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f7026a;
        try {
            if (Build.VERSION.SDK_INT > 9) {
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getDrawingRect(rect);
                Rect rect2 = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (com.ironsource.environment.c.f(activity) == 1) {
                    if (rect.bottom - rect2.bottom > 0) {
                        return rect.bottom - rect2.bottom;
                    }
                    return 0;
                }
                if (rect.right - rect2.right > 0) {
                    return rect.right - rect2.right;
                }
                return 0;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // com.ironsource.sdk.e.f
    public void a() {
        d();
    }

    @Override // com.ironsource.sdk.e.f
    public boolean b() {
        return com.ironsource.sdk.d.a.a().a((Activity) this.f7026a);
    }
}
