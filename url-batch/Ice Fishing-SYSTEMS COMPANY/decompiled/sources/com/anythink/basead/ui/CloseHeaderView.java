package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class CloseHeaderView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f10130a;

    /* renamed from: b, reason: collision with root package name */
    private CloseImageView f10131b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f10132c;

    /* renamed from: d, reason: collision with root package name */
    private String f10133d;

    /* renamed from: e, reason: collision with root package name */
    private String f10134e;

    /* renamed from: f, reason: collision with root package name */
    private long f10135f;

    /* renamed from: g, reason: collision with root package name */
    private long f10136g;

    public CloseHeaderView(Context context) {
        super(context);
        this.f10133d = "";
        this.f10134e = "";
        a();
    }

    private void a() {
        setBackgroundColor(Color.parseColor("#000000"));
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_close_header_view", "layout"), this);
        this.f10130a = (ViewGroup) findViewById(q.a(getContext(), "myoffer_feedback_ll_nobg_id", "id"));
        this.f10131b = (CloseImageView) findViewById(q.a(getContext(), "myoffer_btn_close_ch_id", "id"));
        this.f10132c = (TextView) findViewById(q.a(getContext(), "myoffer_tv_countdown_text", "id"));
        this.f10133d = getContext().getString(q.a(getContext(), "myoffer_count_down_to_rewarded", k.f19794g));
        this.f10134e = getContext().getString(q.a(getContext(), "myoffer_count_down_finish_rewarded", k.f19794g));
    }

    public CloseImageView getCloseImageView() {
        return this.f10131b;
    }

    public ViewGroup getFeedbackButton() {
        return this.f10130a;
    }

    public void refresh(long j9) {
        this.f10136g = j9;
        if (j9 >= this.f10135f) {
            this.f10132c.setText(this.f10134e);
            this.f10132c.setTextColor(-1);
        } else {
            this.f10132c.setText(Html.fromHtml(String.format(this.f10133d, Integer.valueOf((int) Math.ceil((r0 - j9) / 1000.0d)))));
        }
    }

    public void setDuration(long j9) {
        this.f10135f = j9;
    }

    public CloseHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10133d = "";
        this.f10134e = "";
        a();
    }

    public CloseHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10133d = "";
        this.f10134e = "";
        a();
    }
}
