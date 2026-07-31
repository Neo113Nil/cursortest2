package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.b9;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.of;
import com.ironsource.sdk.controller.v;
import com.ironsource.to;
import com.ironsource.u5;

/* loaded from: classes2.dex */
public class h extends FrameLayout implements to {

    /* renamed from: a, reason: collision with root package name */
    private Context f19253a;

    /* renamed from: b, reason: collision with root package name */
    private v f19254b;

    /* renamed from: c, reason: collision with root package name */
    private final of f19255c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(h.this);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(h.this);
            }
        }
    }

    public h(Context context) {
        super(context);
        this.f19255c = nm.S().f();
        this.f19253a = context;
        setClickable(true);
    }

    private void b() {
        ((Activity) this.f19253a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f19253a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.f19255c.H(activity) == 1) {
                int i4 = rect.bottom - rect2.bottom;
                if (i4 > 0) {
                    return i4;
                }
                return 0;
            }
            int i5 = rect.right - rect2.right;
            if (i5 > 0) {
                return i5;
            }
            return 0;
        } catch (Exception e4) {
            o9.d().a(e4);
            return 0;
        }
    }

    @SuppressLint({"DiscouragedApi", "InternalInsetResource"})
    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f19253a;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f19253a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception e4) {
            o9.d().a(e4);
            return 0;
        }
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.f19253a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f19253a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19254b.F();
        this.f19254b.a(true, b9.h.f15466Z);
    }

    @Override // com.ironsource.to
    public boolean onBackButtonPressed() {
        return u5.a().a((Activity) this.f19253a);
    }

    @Override // com.ironsource.to
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19254b.B();
        this.f19254b.a(false, b9.h.f15466Z);
        v vVar = this.f19254b;
        if (vVar != null) {
            vVar.a(v.u.Gone);
            this.f19254b.C();
            this.f19254b.D();
        }
        removeAllViews();
    }

    @Override // com.ironsource.to
    public void onOrientationChanged(String str, int i4) {
    }

    private void a() {
        ((Activity) this.f19253a).runOnUiThread(new a());
    }

    private void a(int i4, int i5) {
        try {
            Context context = this.f19253a;
            if (context != null) {
                int H3 = this.f19255c.H(context);
                if (H3 == 1) {
                    setPadding(0, i4, 0, i5);
                } else if (H3 == 2) {
                    setPadding(0, i4, i5, 0);
                }
            }
        } catch (Exception e4) {
            o9.d().a(e4);
        }
    }

    public void a(v vVar) {
        this.f19254b = vVar;
        vVar.a(this);
        this.f19254b.E();
        this.f19253a = this.f19254b.q();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }
}
