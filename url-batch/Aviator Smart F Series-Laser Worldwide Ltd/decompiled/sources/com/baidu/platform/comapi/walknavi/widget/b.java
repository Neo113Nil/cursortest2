package com.baidu.platform.comapi.walknavi.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.baidu.baidumapsdk_api.R;

/* loaded from: classes2.dex */
public class b extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private TextView f10364a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f10365b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f10366c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f10367d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f10368e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayout f10369f;

    /* renamed from: g, reason: collision with root package name */
    private c f10370g;

    /* renamed from: h, reason: collision with root package name */
    private c f10371h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10372i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10373j;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f10370g != null) {
                b.this.f10370g.a();
            }
            b.this.dismiss();
        }
    }

    /* renamed from: com.baidu.platform.comapi.walknavi.widget.b$b, reason: collision with other inner class name */
    class ViewOnClickListenerC0132b implements View.OnClickListener {
        ViewOnClickListenerC0132b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f10371h != null) {
                b.this.f10371h.a();
            }
            b.this.dismiss();
        }
    }

    public interface c {
        void a();
    }

    public b(Context context, int i8) {
        super(context);
    }

    public TextView a() {
        return this.f10367d;
    }

    public b b(c cVar) {
        this.f10371h = cVar;
        return this;
    }

    public b c(String str) {
        if (str == null) {
            this.f10373j = false;
            this.f10367d.setText("", TextView.BufferType.SPANNABLE);
        } else {
            this.f10373j = true;
            this.f10367d.setText(str, TextView.BufferType.SPANNABLE);
        }
        b();
        return this;
    }

    public b d(String str) {
        if (str == null) {
            this.f10364a.setVisibility(8);
            this.f10364a.setText("", TextView.BufferType.SPANNABLE);
        } else {
            this.f10364a.setVisibility(0);
            this.f10364a.setText(str, TextView.BufferType.SPANNABLE);
        }
        return this;
    }

    public b(Context context) {
        super(context);
    }

    public b a(c cVar) {
        this.f10370g = cVar;
        return this;
    }

    public b(Activity activity) {
        this(activity, R.style.WNaviDialog);
        View a8 = com.baidu.platform.comapi.h.t.p.a.a(activity, R.layout.wsdk_layout_common_dialog, null);
        requestWindowFeature(1);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(a8);
        this.f10364a = (TextView) a8.findViewById(R.id.title_bar);
        this.f10365b = (TextView) a8.findViewById(R.id.content_message);
        this.f10366c = (TextView) a8.findViewById(R.id.first_btn);
        this.f10367d = (TextView) a8.findViewById(R.id.second_btn);
        this.f10368e = (LinearLayout) a8.findViewById(R.id.left_div);
        this.f10369f = (LinearLayout) a8.findViewById(R.id.right_div);
        this.f10366c.setOnClickListener(new a());
        this.f10367d.setOnClickListener(new ViewOnClickListenerC0132b());
        this.f10372i = false;
        this.f10373j = false;
        this.f10364a.setVisibility(8);
        this.f10365b.setVisibility(8);
        this.f10366c.setVisibility(8);
        this.f10367d.setVisibility(8);
        this.f10368e.setVisibility(8);
        this.f10369f.setVisibility(8);
        setCanceledOnTouchOutside(false);
    }

    public b b(String str) {
        if (str == null) {
            this.f10372i = false;
            this.f10366c.setText("", TextView.BufferType.SPANNABLE);
        } else {
            this.f10372i = true;
            this.f10366c.setText(str, TextView.BufferType.SPANNABLE);
        }
        b();
        return this;
    }

    public b a(String str) {
        if (str == null) {
            this.f10365b.setVisibility(8);
            this.f10365b.setText("", TextView.BufferType.SPANNABLE);
        } else {
            this.f10365b.setVisibility(0);
            this.f10365b.setText(str, TextView.BufferType.SPANNABLE);
        }
        return this;
    }

    public b c() {
        this.f10366c.setTextColor(-12352272);
        return this;
    }

    public b d() {
        this.f10367d.setTextColor(-12352272);
        return this;
    }

    private void b() {
        if (!this.f10372i) {
            this.f10366c.setVisibility(8);
            this.f10367d.setVisibility(8);
            this.f10368e.setVisibility(8);
            this.f10369f.setVisibility(8);
            return;
        }
        if (!this.f10373j) {
            this.f10366c.setVisibility(0);
            this.f10367d.setVisibility(8);
            this.f10368e.setVisibility(8);
            this.f10369f.setVisibility(8);
            return;
        }
        this.f10366c.setVisibility(0);
        this.f10367d.setVisibility(0);
        this.f10368e.setVisibility(8);
        this.f10369f.setVisibility(8);
    }

    public b a(boolean z7) {
        super.setCancelable(z7);
        return this;
    }
}
