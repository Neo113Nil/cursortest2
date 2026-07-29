package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.R;
import java.lang.ref.WeakReference;

/* compiled from: ToolTipPopup.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f6306a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<View> f6307b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f6308c;

    /* renamed from: d, reason: collision with root package name */
    private C0362a f6309d;
    private PopupWindow e;
    private b f = b.BLUE;
    private long g = 6000;
    private final ViewTreeObserver.OnScrollChangedListener h = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.login.widget.a.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (a.this.f6307b.get() == null || a.this.e == null || !a.this.e.isShowing()) {
                return;
            }
            if (a.this.e.isAboveAnchor()) {
                a.this.f6309d.b();
            } else {
                a.this.f6309d.a();
            }
        }
    };

    /* compiled from: ToolTipPopup.java */
    public enum b {
        BLUE,
        BLACK
    }

    public a(String str, View view) {
        this.f6306a = str;
        this.f6307b = new WeakReference<>(view);
        this.f6308c = view.getContext();
    }

    public void a(b bVar) {
        this.f = bVar;
    }

    public void a() {
        if (this.f6307b.get() != null) {
            this.f6309d = new C0362a(this.f6308c);
            ((TextView) this.f6309d.findViewById(R.id.com_facebook_tooltip_bubble_view_text_body)).setText(this.f6306a);
            if (this.f == b.BLUE) {
                this.f6309d.f6316d.setBackgroundResource(R.drawable.com_facebook_tooltip_blue_background);
                this.f6309d.f6315c.setImageResource(R.drawable.com_facebook_tooltip_blue_bottomnub);
                this.f6309d.f6314b.setImageResource(R.drawable.com_facebook_tooltip_blue_topnub);
                this.f6309d.e.setImageResource(R.drawable.com_facebook_tooltip_blue_xout);
            } else {
                this.f6309d.f6316d.setBackgroundResource(R.drawable.com_facebook_tooltip_black_background);
                this.f6309d.f6315c.setImageResource(R.drawable.com_facebook_tooltip_black_bottomnub);
                this.f6309d.f6314b.setImageResource(R.drawable.com_facebook_tooltip_black_topnub);
                this.f6309d.e.setImageResource(R.drawable.com_facebook_tooltip_black_xout);
            }
            View decorView = ((Activity) this.f6308c).getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            d();
            this.f6309d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
            this.e = new PopupWindow(this.f6309d, this.f6309d.getMeasuredWidth(), this.f6309d.getMeasuredHeight());
            this.e.showAsDropDown(this.f6307b.get());
            c();
            if (this.g > 0) {
                this.f6309d.postDelayed(new Runnable() { // from class: com.facebook.login.widget.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.b();
                    }
                }, this.g);
            }
            this.e.setTouchable(true);
            this.f6309d.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.widget.a.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.b();
                }
            });
        }
    }

    public void a(long j) {
        this.g = j;
    }

    private void c() {
        if (this.e == null || !this.e.isShowing()) {
            return;
        }
        if (this.e.isAboveAnchor()) {
            this.f6309d.b();
        } else {
            this.f6309d.a();
        }
    }

    public void b() {
        e();
        if (this.e != null) {
            this.e.dismiss();
        }
    }

    private void d() {
        e();
        if (this.f6307b.get() != null) {
            this.f6307b.get().getViewTreeObserver().addOnScrollChangedListener(this.h);
        }
    }

    private void e() {
        if (this.f6307b.get() != null) {
            this.f6307b.get().getViewTreeObserver().removeOnScrollChangedListener(this.h);
        }
    }

    /* compiled from: ToolTipPopup.java */
    /* renamed from: com.facebook.login.widget.a$a, reason: collision with other inner class name */
    private class C0362a extends FrameLayout {

        /* renamed from: b, reason: collision with root package name */
        private ImageView f6314b;

        /* renamed from: c, reason: collision with root package name */
        private ImageView f6315c;

        /* renamed from: d, reason: collision with root package name */
        private View f6316d;
        private ImageView e;

        public C0362a(Context context) {
            super(context);
            c();
        }

        private void c() {
            LayoutInflater.from(getContext()).inflate(R.layout.com_facebook_tooltip_bubble, this);
            this.f6314b = (ImageView) findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer);
            this.f6315c = (ImageView) findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
            this.f6316d = findViewById(R.id.com_facebook_body_frame);
            this.e = (ImageView) findViewById(R.id.com_facebook_button_xout);
        }

        public void a() {
            this.f6314b.setVisibility(0);
            this.f6315c.setVisibility(4);
        }

        public void b() {
            this.f6314b.setVisibility(4);
            this.f6315c.setVisibility(0);
        }
    }
}
