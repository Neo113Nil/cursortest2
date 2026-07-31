package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import h1.C2444e;

/* renamed from: com.unity3d.player.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC1786y extends Dialog implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22278a;

    /* renamed from: b, reason: collision with root package name */
    public final UnityPlayerForActivityOrService f22279b;

    /* renamed from: c, reason: collision with root package name */
    public C2444e f22280c;

    /* renamed from: d, reason: collision with root package name */
    public D f22281d;

    /* renamed from: e, reason: collision with root package name */
    public h1.X f22282e;

    public DialogC1786y(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context);
        this.f22280c = null;
        this.f22281d = null;
        this.f22282e = null;
        this.f22278a = context;
        this.f22279b = unityPlayerForActivityOrService;
    }

    public final void a(D d4, boolean z4, boolean z5) {
        this.f22281d = d4;
        Window window = getWindow();
        window.requestFeature(1);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f22280c = createSoftInputView(this.f22281d.f22265c);
        window.setLayout(-1, -2);
        window.clearFlags(2);
        if (!z5) {
            window.addFlags(32);
            window.addFlags(262144);
        }
        a(z4);
        getWindow().setSoftInputMode(5);
        this.f22282e = C1770q.a(this, 1000000, new RunnableC1784x(this));
    }

    public C2444e createSoftInputView(EditText editText) {
        C2444e c2444e = new C2444e(this.f22278a, editText);
        c2444e.f36734a.setOnClickListener(this);
        setContentView(c2444e);
        return c2444e;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f22281d.f22267e || !(motionEvent.getAction() == 4 || this.f22281d.f22266d)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        h1.W w4;
        Runnable runnable;
        h1.X x4 = this.f22282e;
        if (x4 == null || (w4 = x4.f36724a) == null || (runnable = w4.f36723a) == null) {
            return;
        }
        runnable.run();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        D d4 = this.f22281d;
        d4.a(d4.b(), false);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        h1.X x4 = this.f22282e;
        if (x4 != null) {
            x4.unregisterOnBackPressedCallback();
            this.f22282e = null;
        }
        super.onStop();
    }

    public final Rect a() {
        Rect rect = new Rect();
        FrameLayout frameLayout = this.f22279b.getFrameLayout();
        frameLayout.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        Point point = new Point(rect.left - iArr[0], rect.height() - this.f22280c.getHeight());
        Point point2 = new Point();
        getWindow().getWindowManager().getDefaultDisplay().getSize(point2);
        int height = frameLayout.getHeight();
        int i4 = height - point2.y;
        int i5 = height - point.y;
        if (i5 != this.f22280c.getHeight() + i4) {
            this.f22279b.reportSoftInputIsVisible(true);
        } else {
            this.f22279b.reportSoftInputIsVisible(false);
        }
        return new Rect(point.x, point.y, this.f22280c.getWidth(), i5);
    }

    public final void a(boolean z4) {
        C2444e c2444e = this.f22280c;
        if (z4) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c2444e.f36735b.getLayoutParams();
            layoutParams.height = 1;
            c2444e.f36735b.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) c2444e.f36734a.getLayoutParams();
            layoutParams2.height = 1;
            c2444e.f36734a.setLayoutParams(layoutParams2);
            Rect rect = c2444e.f36738e;
            c2444e.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            c2444e.f36735b.setBackgroundColor(0);
            c2444e.setBackgroundColor(0);
        } else {
            c2444e.setVisibility(0);
            Rect rect2 = c2444e.f36737d;
            c2444e.setPadding(rect2.left, rect2.top, rect2.right, rect2.bottom);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) c2444e.f36735b.getLayoutParams();
            layoutParams3.height = -2;
            c2444e.f36735b.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) c2444e.f36734a.getLayoutParams();
            layoutParams4.height = -2;
            c2444e.f36734a.setLayoutParams(layoutParams4);
        }
        c2444e.invalidate();
        c2444e.requestLayout();
    }
}
